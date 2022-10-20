package a.a.a.c.c.e.p.c;

import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.b.EDF;
import a.a.a.c.c.a.b.ELX;
import a.a.a.c.c.d.g.EPB;
import a.a.a.c.c.e.p.b.QUC;
import a.a.a.c.e.a.d.EVZ;
import a.a.a.c.f.a.a.EYL;
import a.a.a.c.f.a.c.HI;
import a.a.a.c.f.a.c.QJW;
import a.a.a.c.f.a.g.AGYN;
import a.a.a.c.f.a.g.IY;
import a.a.a.c.f.a.h.JF;
import a.a.a.c.f.a.h.JG;
import a.a.a.c.f.a.h.JH;
import a.a.a.c.f.a.n.QSK;
import a.a.a.c.f.b.b.JN;

import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class QUD extends ELX implements EYL {
    private QSK RCT;
    private EPB RCU;

    public QUD() {
        super(QUC.RCR.getProcessName());

    }

    protected void HHI() {

    }

    protected void HHJ() {

        try {
            switch (this.RCU) {
                case NEW:
                    this.getModelManager().HJZ(this.getParentDefinition(), this.RCT);
                    break;
                case EDIT:
                    this.getModelManager().HKB(this.getParentDefinition(), this.RCT);
            }

            this.RCT = null;
            this.getModelManager().HKL(this.getParentDefinition());
        } catch (FFO | FFK var5) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var5);
            throw new FFI(var5.getMessage());
        }

    }

    protected void resetAndCleanUpProcessImpl() {

        try {
            this.getModelManager().resetData(this.getParentDefinition());
            this.RCT = null;
        } catch (FFK var5) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var5);
            throw new FFI(var5);
        }

    }

    public JG getSettlementStatus(LocalDate var1) throws FFK, FFO {

        JG var7;
        JN var2 = new JN(Date.from(var1.atStartOfDay(ZoneId.systemDefault()).toInstant()));
        IY var3 = new IY(JF.class, var2, JH.VAT, null);
        EVZ var4 = this.getModelManager().HJY(this.getParentDefinition(), var3);
        if (((List) var4.getSecondValue()).size() > 1) {
            throw new FFO("More than one settlement per one period!");
        }

        Iterator var5 = ((List) var4.getSecondValue()).iterator();
        if (!var5.hasNext()) {
            return null;
        }

        EDF var6 = (EDF) var5.next();
        var7 = ((JF) var6.getModelBaseElementWithIdObject()).getSettlementStatus();

        return var7;
    }

    public List<QJW> getContractorsByText(String var1) {

        ArrayList var2 = new ArrayList();

        ArrayList var4;
        try {
            AGYN var3 = new AGYN(HI.class, var1);
            EVZ var13 = this.getModelManager().HJY(this.getParentDefinition(), var3);
            if (var13 != null) {
                Iterator var5 = ((List) var13.getSecondValue()).iterator();

                while (var5.hasNext()) {
                    EDF var6 = (EDF) var5.next();
                    if (var6 != null) {
                        var2.add(new QJW(var6));
                    }
                }
            }

            ArrayList var12 = var2;
            return var12;
        } catch (FFO | FFK var10) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var10);
            var4 = var2;
        }

        return var4;
    }

    public void setMode(EPB var1) {
        this.RCU = var1;
        this.HHI();
    }

    public void setInvoiceOtherPurchase(QSK var1) {

        this.RCT = var1;

    }

    public QSK getInvoiceOtherPurchase() throws FFK, FFO {

        QSK var1;
        if (this.RCT == null) {
            this.RCT = this.getModelManager().ROG(this.getParentDefinition(), QSK.class);
        }

        var1 = this.RCT;

        return var1;
    }
}
