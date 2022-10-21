package a.a.a.c.c.e.e.c;

import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.b.ParametrizedModel;
import a.a.a.c.c.a.b.ELV;
import a.a.a.c.c.e.e.a.Mode;
import a.a.a.c.c.e.e.b.ETD;
import a.a.a.c.e.a.d.ValueContainer2;
import a.a.a.c.f.a.c.Contractor;
import a.a.a.c.f.a.g.ContractorModelCriteria;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ETE extends ELV {
    private Contractor GFY;
    private Mode GFZ;

    public ETE() {
        super(ETD.GFW.getProcessName());

    }

    protected void HHI() {

    }

    public void setContractor(Contractor var1) {
        this.GFY = var1;
    }

    public Contractor getContractor() {
        return this.GFY;
    }

    public void setMode(Mode var1) {
        this.GFZ = var1;
    }

    protected void HHJ() {

        try {
            switch (this.GFZ) {
                case NEW:
                    this.getModelManager().HJZ(this.getParentDefinition(), this.GFY);
                    this.GFY = null;
                    break;
                case EDIT:
                    this.getModelManager().HKB(this.getParentDefinition(), this.GFY);
                    this.GFY = null;
            }

            this.getModelManager().HKL(this.getParentDefinition());
        } catch (FFO | FFK var5) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var5);
            throw new FFI(var5);
        }

    }

    protected void resetAndCleanUpProcessImpl() {

        try {
            this.GFY = null;
            this.getModelManager().resetData(this.getParentDefinition());
        } catch (FFK var5) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var5);
            throw new FFI(var5);
        }

    }

    public void HUQ() {

        try {
            this.getModelManager().HKC(this.getParentDefinition(), this.GFY);
            this.getModelManager().HKL(this.getParentDefinition());
        } catch (FFO | FFK var5) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var5);
            throw new FFI(var5);
        }

    }

    public List<Contractor> getContractors() {

        ArrayList var11;
        try {
            ContractorModelCriteria var1 = new ContractorModelCriteria(Contractor.class, null);
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

    public boolean HUR(String var1) {
        boolean var2 = false;
        if (var1 != null) {
            ContractorModelCriteria var3 = new ContractorModelCriteria(Contractor.class, var1);

            try {
                ValueContainer2 var4 = this.getModelManager().HJY(this.getParentDefinition(), var3);
                if (((List) var4.getSecondValue()).size() == 0) {
                    var2 = true;
                }
            } catch (FFO | FFK var5) {
                org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var5);
            }
        }

        return var2;
    }

    public boolean RKN(Contractor var1) {
        boolean var2 = false;
        if (var1 != null) {
            ContractorModelCriteria var3 = new ContractorModelCriteria(Contractor.class, var1.QON(), null);

            try {
                ValueContainer2 var4 = this.getModelManager().HJY(this.getParentDefinition(), var3);
                if (((List) var4.getSecondValue()).size() == 0) {
                    var2 = true;
                }
            } catch (FFO | FFK var5) {
                org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var5);
            }
        }

        return var2;
    }
}
