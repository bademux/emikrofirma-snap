package a.a.a.c.c.a.b;

import a.a.a.b.a.a.FDO;
import a.a.a.b.c.FEL;
import a.a.a.b.c.FEM;
import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.c.a.ProcessDefinitionBase;
import a.a.a.c.c.a.EMA;
import a.a.a.c.c.b.EMB;
import a.a.a.c.c.b.b.EMU;
import com.github.bademux.emk.Application;
import a.a.a.c.f.c.a.ConfigurationProperties;
import a.a.a.c.f.c.a.ConfigurationProperty;
import a.a.a.c.f.c.a.PropertyString;
import a.a.a.c.g.FCQ;
import a.a.a.c.g.b.FCW;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;

import java.io.File;
import java.nio.file.Files;
import java.util.Iterator;

public abstract class ELV {
    private final String FGG;
    private EMA FGH;
    private EMU FGI;
    private ProcessDefinitionBase FGJ;

    public ELV() {
        throw new FFI("Must be overridden!");
    }

    protected ELV(String var1) {
        this.FGH = EMA.DESTROYED;
        this.FGG = var1;
    }

    public String getName() {
        return this.FGG;
    }

    public EMA getMainStatus() {
        return this.FGH;
    }

    public ProcessDefinitionBase getParentDefinition() {
        return this.FGJ;
    }

    public void setParentDefinition(ProcessDefinitionBase var1) {
        this.FGJ = var1;
    }

    public EMU getModelManager() {
        return this.FGI;
    }

    public void setModelManager(EMU var1) {
        this.FGI = var1;
    }

    protected abstract void HHI();

    protected abstract void HHJ();

    protected abstract void resetAndCleanUpProcessImpl();

    public void HHK() throws FFK, FFO {

        switch (this.FGH) {
            case DESTROYED:
            case STARTED:
                this.FGH = EMA.STARTED;
                this.HHI();
                return;
            case BLOCKED:
                throw new FFO("Process is blocked!");
            case EXCEPTION:
                throw new FFK("Process ended up with an exception, but there was no cleanup. Cannot start!");
            case FINISHED:
                throw new FFK("Process was finished but, there was no cleanup. Cannot start!");
            default:
                throw new FFK("Such status [" + this.FGH + "] not supposed to happen!");
        }
    }

    public void HHL() throws FFK, FFO {

        switch (this.FGH) {
            case DESTROYED:
                throw new FFK("Process was destroyed or never initialised. Cannot finish!");
            case STARTED:
            case FINISHED:
                this.FGH = EMA.FINISHED;
                this.HHJ();
                this.FGH = EMA.DESTROYED;
                return;
            case BLOCKED:
                throw new FFO("Process is blocked!");
            case EXCEPTION:
                throw new FFK("Process ended up with an exception, but there was no cleanup. Cannot finish!");
            default:
                throw new FFK("Such status [" + this.FGH + "] not supposed to happen!");
        }
    }

    public void resetAndCleanUpProcess() throws FFK, FFO {

        switch (this.FGH) {
            case DESTROYED:
            case STARTED:
            case BLOCKED:
            case EXCEPTION:
            case FINISHED:
                this.resetAndCleanUpProcessImpl();
                this.FGH = EMA.DESTROYED;
                return;
            default:
                throw new FFK("Such status [" + this.FGH + "] not supposed to happen!");
        }
    }

    public File getOrSelectWorkingDir(final Stage var1) throws FFK {

        File var14;
        if (var1 == null) {
            throw new FFK("stageToHandle cannto be null!");
        }

        ConfigurationProperties var2 = EMB.getInstance().HHU();
        PropertyString var3 = null;
        Iterator var4 = var2.getConfigurationProperties().iterator();

        while (var4.hasNext()) {
            ConfigurationProperty var5 = (ConfigurationProperty) var4.next();
            if (FCQ.WorkingDir.getPropertyName().equals(var5.DEX().getValue())) {
                var3 = (PropertyString) var5;
            }
        }

        File var12 = null;
        boolean var13 = true;
        if (var3 != null && var3.DEY().getValue() != null) {
            try {
                var12 = new File(var3.DEY().getValue());
                if (this.RKD(var12)) {
                    var13 = false;
                }
            } catch (Exception var10) {
                org.slf4j.LoggerFactory.getLogger(getClass()).warn("Profile working dir unavailable [" + var3.DEY().getValue() + "]", var10);
            }
        }

        if (var13) {
            org.slf4j.LoggerFactory.getLogger(getClass()).info("Selecting new working directory");
            var12 = FEL.IKS(new FEM<File>() {
                public File IKT() {
                    DirectoryChooser var1x = new DirectoryChooser();
                    var1x.setTitle(FCW.getInstance().getMessageForKey("micro.types.workingDir.directorychooser.title"));
                    File homeDir = Application.getHomeDir().toFile();
                    if (homeDir.exists() && homeDir.isDirectory()) {
                        var1x.setInitialDirectory(homeDir);
                    }

                    return var1x.showDialog(var1);
                }
            });
            boolean var6 = this.RKD(var12);
            if (var6) {
                if (var3 == null) {
                    var3 = new PropertyString(FCQ.WorkingDir.getPropertyName(), var12.getAbsolutePath());
                    var2.getConfigurationProperties().add(var3);
                } else {
                    var3.DEY().setValue(var12.getAbsolutePath());
                }

                EMB.getInstance().ROK(FDO.update, var2, true);
            } else {
                var12 = new File(System.getProperty("java.io.tmpdir"));
                if (!this.RKD(var12)) {
                    throw new FFI("Unable to select working dir!");
                }
            }
        }

        var14 = var12;

        return var14;
    }

    private boolean RKD(File var1) {

        boolean var3;
        boolean var9;
        if (var1 == null) {
            var9 = false;
            return var9;
        }

        if (!var1.isDirectory()) {
            var9 = false;
            return var9;
        }

        try {
            Files.createDirectories(var1.toPath());
            File var2 = new File(var1, "tmp" + System.nanoTime());
            Files.createFile(var2.toPath());
            Files.delete(var2.toPath());
            var3 = true;
            return var3;
        } catch (Exception var7) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var7);
            var3 = false;
        }

        return var3;
    }
}
