package a.a.a.c.c.e.a.c;

import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.c.c.a.b.ELV;
import a.a.a.c.c.e.a.b.ERT;
import a.a.a.c.f.a.g.ModelTechnicalElementCriteria;
import a.a.a.c.f.c.a.ConfigurationProperties;

public class ERU extends ELV {
    private ConfigurationProperties GBI;
    private boolean GBJ;

    public ERU() {
        super(ERT.GBH.getProcessName());

        this.GBI = null;

    }

    protected void HHI() {

        try {
            if (this.GBI == null) {
                ModelTechnicalElementCriteria var1 = new ModelTechnicalElementCriteria(ConfigurationProperties.class);
                this.GBI = (ConfigurationProperties) this.getModelManager().HJT(this.getParentDefinition(), var1);
                if (this.GBI != null) {
                    this.GBJ = false;
                } else {
                    this.GBI = new ConfigurationProperties();
                    this.GBJ = true;
                }
            }
        } catch (FFK var5) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var5);
            throw new FFI(var5);
        }

    }

    protected void HHJ() {

        try {
            if (this.GBJ) {
                this.getModelManager().HJU(this.getParentDefinition(), this.GBI);
                this.GBJ = false;
            } else {
                this.getModelManager().HJV(this.getParentDefinition(), this.GBI);
            }

            this.getModelManager().HKL(this.getParentDefinition());
            this.GBI = null;
        } catch (FFK var5) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var5);
            throw new FFI(var5);
        }

    }

    protected void resetAndCleanUpProcessImpl() {

        try {
            this.getModelManager().resetData(this.getParentDefinition());
            this.GBI = null;
        } catch (FFK var5) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var5);
            throw new FFI(var5);
        }

    }

    public ConfigurationProperties getConfigurationProperties() {
        return this.GBI;
    }
}
