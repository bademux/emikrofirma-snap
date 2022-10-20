package a.a.a.c.c.e.b.c;

import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.c.c.a.b.ELV;
import a.a.a.c.c.b.EMB;
import a.a.a.c.c.e.b.b.ESB;
import a.a.a.c.f.a.g.ModelTechnicalElementCriteria;
import a.a.a.c.f.b.c.Nip;
import a.a.a.c.f.b.c.a.LoginType;
import a.a.a.c.f.c.b.SimpleUserData;
import a.a.a.c.f.c.b.UserData;

public class ESC extends ELV {
    private UserData GBS;

    public ESC() {
        super(ESB.GBR.getProcessName());

        this.GBS = null;

    }

    protected void HHI() {

        try {
            if (this.GBS == null) {
                ModelTechnicalElementCriteria var1 = new ModelTechnicalElementCriteria(UserData.class);
                this.GBS = (UserData) this.getModelManager().HJT(this.getParentDefinition(), var1);
                if (this.GBS == null) {
                    String var2 = EMB.getInstance().getCurrentUser().getUsername().getValue();
                    if (var2 == null) {
                        throw new FFK("Not supposed to happen, userName is null!");
                    }

                    SimpleUserData var3 = EMB.getInstance().getSimpleUserDataForUserName(var2);
                    if (var3.DFA().getValue() == LoginType.NIP) {
                        this.GBS = new UserData();
                        this.GBS.DEW().setValue(1);
                        this.GBS.setNip(new Nip(var3.getUsername().getValue()));
                    } else {
                        throw new FFK("Not implemented type [" + var3.getLoginType() + "]!");
                    }
                } else {
                    this.GBS.DEV();
                }
            }
        } catch (FFK var7) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var7);
            throw new FFI(var7);
        }

    }

    protected void HHJ() {

        try {
            this.getModelManager().HJU(this.getParentDefinition(), this.GBS);
            this.getModelManager().HKL(this.getParentDefinition());
            this.GBS = null;
        } catch (FFK var5) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var5);
            throw new FFI(var5);
        }

    }

    protected void resetAndCleanUpProcessImpl() {

        try {
            this.getModelManager().resetData(this.getParentDefinition());
            this.GBS = null;
        } catch (FFK var5) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var5);
            throw new FFI(var5);
        }

    }

    public UserData getUserData() {
        return this.GBS;
    }
}
