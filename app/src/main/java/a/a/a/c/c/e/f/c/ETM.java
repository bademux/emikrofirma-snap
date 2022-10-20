package a.a.a.c.c.e.f.c;

import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.b.EDF;
import a.a.a.c.c.a.b.ELV;
import a.a.a.c.c.e.f.b.ETL;
import a.a.a.c.e.a.d.ValueContainer2;
import a.a.a.c.f.a.e.a.InvoiceRecord;
import a.a.a.c.f.a.g.EYD;
import a.a.a.c.f.a.g.IY;
import a.a.a.c.f.a.g.JB;
import a.a.a.c.f.a.h.Settlement;
import a.a.a.c.f.b.b.Period;
import a.a.a.c.f.c.a.ConfigurationProperties;
import a.a.a.c.f.c.a.ConfigurationProperty;
import a.a.a.c.f.c.a.LS;
import a.a.a.c.f.c.b.UserData;
import a.a.a.c.g.FCQ;

import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ETM extends ELV {
    private UserData GHO;
    private ConfigurationProperties GHP;
    private LS GHQ;

    public ETM() {
        super(ETL.GHN.getProcessName());

        this.GHO = null;
        this.GHQ = null;

    }

    protected void HHI() {

        try {
            JB var1 = new JB(UserData.class);
            this.GHO = (UserData) this.getModelManager().HJT(this.getParentDefinition(), var1);
            if (this.GHP == null) {
                JB var2 = new JB(ConfigurationProperties.class);
                this.GHP = (ConfigurationProperties) this.getModelManager().HJT(this.getParentDefinition(), var2);
                Iterator var3 = this.GHP.getConfigurationProperties().iterator();

                while (var3.hasNext()) {
                    ConfigurationProperty var4 = (ConfigurationProperty) var3.next();
                    if (FCQ.WorkingDir.getPropertyName().equals(var4.DEX().getValue())) {
                        this.GHQ = (LS) var4;
                    }
                }
            }
        } catch (FFK var8) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var8);
        }

    }

    protected void HHJ() {

        this.GHO = null;
        this.GHQ = null;

    }

    protected void resetAndCleanUpProcessImpl() {

        this.GHO = null;
        this.GHQ = null;

    }

    public Set<InvoiceRecord> getInvoiceRecords(Period var1) {
        try {
            HashSet var2 = new HashSet();
            IY var3 = new IY(InvoiceRecord.class, var1, null, null);
            ValueContainer2 var4 = this.getModelManager().HJY(this.getParentDefinition(), var3);
            if (var4 != null) {
                Iterator var5 = ((List) var4.getSecondValue()).iterator();

                while (var5.hasNext()) {
                    EDF var6 = (EDF) var5.next();
                    var2.add(var6.getModelBaseElementWithIdObject());
                }
            }

            return var2;
        } catch (FFO | FFK var7) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var7);
            throw new FFI(var7);
        }
    }

    public Set<InvoiceRecord> getInvoiceRecords(Settlement var1) {

        HashSet var12;
        try {
            EYD var2 = new EYD(InvoiceRecord.class, var1, null, null, null);
            ValueContainer2 var3 = this.getModelManager().HKD(this.getParentDefinition(), var2);
            HashSet var4 = new HashSet();
            if (var3 != null) {
                Iterator var5 = ((List) var3.getSecondValue()).iterator();

                while (var5.hasNext()) {
                    EDF var6 = (EDF) var5.next();
                    var4.add(var6.getModelBaseElementWithIdObject());
                }
            }

            var12 = var4;
        } catch (FFO | FFK var10) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var10);
            throw new FFI(var10);
        }

        return var12;
    }

    public UserData getUserData() {
        return this.GHO;
    }

    public UserData getUserData(Integer var1) throws FFK {
        JB var2 = new JB(UserData.class, var1);
        UserData var3 = (UserData) this.getModelManager().HJT(this.getParentDefinition(), var2);
        return var3;
    }

    public File getWorkingDir() {

        File var2;
        File var1 = new File(this.GHQ.DEY().getValue());
        var1.mkdirs();
        var2 = var1;

        return var2;
    }

    public File getTempFile(String var1) {

        File var4;
        File var2 = this.getWorkingDir();
        File var3 = new File(var2, "temp_" + Thread.currentThread().getId() + "_" + System.nanoTime() + "." + var1);
        var4 = var3;

        return var4;
    }
}
