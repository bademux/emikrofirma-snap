package a.a.a.c.c.e.i.d;

import a.a.a.b.a.a.OrderType;
import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.b.ParametrizedModel;
import a.a.a.c.c.a.b.ELW;
import a.a.a.c.c.b.EMB;
import a.a.a.c.c.e.i.b.EUD;
import a.a.a.c.d.b.EQB;
import a.a.a.c.e.a.d.ValueContainer2;
import a.a.a.c.f.a.c.Contractor;
import a.a.a.c.f.a.d.*;
import a.a.a.c.f.a.g.ContractorModelCriteria;
import a.a.a.c.f.a.g.ModelBusinessPeriodElementTypedCriteria;
import a.a.a.c.f.a.g.ModelTechnicalElementCriteria;
import a.a.a.c.f.b.b.Period;
import a.a.a.c.f.c.a.PropertyBoolean;
import a.a.a.c.f.c.a.ConfigurationProperties;
import a.a.a.c.f.c.a.PropertyString;
import a.a.a.c.f.c.b.UserData;
import a.a.a.c.g.ConfigurationProperty;
import javafx.stage.Stage;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EUF extends ELW {
    private ConfigurationProperties GKK;
    private PropertyString GKL;
    private PropertyString GKM;
    private PropertyBoolean MWO;

    public EUF() {
        super(EUD.GKG.getProcessName());

    }

    protected void HHI() {

        try {
            if (this.GKK == null) {
                ModelTechnicalElementCriteria var1 = new ModelTechnicalElementCriteria(ConfigurationProperties.class);
                this.GKK = (ConfigurationProperties) this.getModelManager().HJT(this.getParentDefinition(), var1);
                Iterator var2 = this.GKK.getConfigurationProperties().iterator();

                while (var2.hasNext()) {
                    a.a.a.c.f.c.a.ConfigurationProperty var3 = (a.a.a.c.f.c.a.ConfigurationProperty) var2.next();
                    if (ConfigurationProperty.WorkingDir.getPropertyName().equals(var3.DEX().getValue())) {
                        this.GKL = (PropertyString) var3;
                    } else if (ConfigurationProperty.Pkcs11LibraryFile.getPropertyName().equals(var3.DEX().getValue())) {
                        this.GKM = (PropertyString) var3;
                    } else if (ConfigurationProperty.PerformVerification.getPropertyName().equals(var3.DEX().getValue())) {
                        this.MWO = (PropertyBoolean) var3;
                    }
                }
            }
        } catch (FFK var7) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var7);
            throw new FFI(var7);
        }

    }

    protected void HHJ() {

        this.GKK = null;

    }

    protected void resetAndCleanUpProcessImpl() {

        this.GKK = null;

    }

    public List<DeclarationJPK> getDeclarations() {

        ArrayList var11;
        try {
            ModelBusinessPeriodElementTypedCriteria var1 = new ModelBusinessPeriodElementTypedCriteria(DeclarationJPK.class, null, DeclarationType.JPK, null, OrderType.DESC);
            ValueContainer2 var2 = this.getModelManager().HJY(this.getParentDefinition(), var1);
            ArrayList var3 = new ArrayList();
            if (var2 != null) {
                Iterator var4 = ((List) var2.getSecondValue()).iterator();

                while (var4.hasNext()) {
                    ParametrizedModel var5 = (ParametrizedModel) var4.next();
                    if (var5 != null) {
                        var3.add(var5.getModelBaseElementWithIdObject());
                    }
                }
            }

            var11 = var3;
        } catch (FFO | FFK var9) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var9);
            throw new FFI(var9);
        }

        return var11;
    }

    public ConfigurationProperties HWZ() {

        Object var2;
        try {
            ConfigurationProperties var1 = EMB.getInstance().HHU();
            return var1;
        } catch (FFK var6) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var6);
            var2 = null;
        }

        return (ConfigurationProperties) var2;
    }

    public File getWorkingDir(Stage var1) throws FFK {
        return this.getOrSelectWorkingDir(var1);
    }

    public String getPkcs11LibraryFilePath() {
        return this.GKM != null && this.GKM.getValue() != null ? this.GKM.getValue().getValue() : null;
    }

    public boolean MXD() {
        return this.MWO != null && this.MWO.getValue() != null ? this.MWO.getValue().getValue() : true;
    }

    public File getDeclarationTmpFile(Stage var1, DeclarationType var2, DeclarationSubtype var3, String var4) throws FFK {

        File var7;
        File var5 = this.getWorkingDir(var1);
        File var6 = new File(var5, var2.name() + "_" + var3.name() + "_" + Thread.currentThread().getId() + "_" + System.nanoTime() + "." + var4);
        var7 = var6;

        return var7;
    }

    public Integer HXA(Period var1, DeclarationType var2, DeclarationSubtype var3) {

        Object var5;
        try {
            Integer var4 = this.getModelManager().getMaxDocumentIndex(this.getParentDefinition(), Declaration.class, var1, var2, var3);
            return var4;
        } catch (FFO | FFK var9) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var9);
            var5 = null;
        }

        return (Integer) var5;
    }

    public void HXB(Declaration var1) {

        try {
            if (var1 != null) {
                this.getModelManager().HJZ(this.getParentDefinition(), var1);
                this.getModelManager().HKL(this.getParentDefinition());
            }
        } catch (FFO | FFK var6) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var6);
            throw new FFI(var6);
        }

    }

    public boolean QIX(DeclarationJPK_StatusTracker var1) throws FFK, FFO {

        boolean var2;
        if (!EQB.QIU(var1)) {
            var2 = false;
            return var2;
        }

        var2 = true;

        return var2;
    }

    public void QIY(Declaration var1) throws FFK, FFO {

        this.getModelManager().HKC(this.getParentDefinition(), var1);
        this.getModelManager().HKL(this.getParentDefinition());

    }

    public UserData getUserData() {

        UserData var3;
        try {
            ModelTechnicalElementCriteria var1 = new ModelTechnicalElementCriteria(UserData.class);
            UserData var2 = (UserData) this.getModelManager().HJT(this.getParentDefinition(), var1);
            var3 = var2;
        } catch (FFK var7) {
            throw new FFI(var7.getMessage());
        }

        return var3;
    }

    public Contractor getContractorByNip(String var1) {

        ValueContainer2 var3;
        try {
            ContractorModelCriteria var2 = new ContractorModelCriteria(Contractor.class, var1);
            var3 = this.getModelManager().HJY(this.getParentDefinition(), var2);
            Contractor var4;
            if (((List) var3.getSecondValue()).size() > 0) {
                var4 = (Contractor) ((ParametrizedModel) ((List) var3.getSecondValue()).get(0)).getModelBaseElementWithIdObject();
                if (var4.DAJ().getValue().equals(var1)) {
                    Contractor var5 = var4;
                    return var5;
                }
            }

            var4 = null;
            return var4;
        } catch (FFO | FFK var9) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var9);
            return null;
        }
    }
}
