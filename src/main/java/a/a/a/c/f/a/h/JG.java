package a.a.a.c.f.a.h;

import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.b.JM;
import a.a.a.c.g.b.FCW;
import javafx.beans.property.ReadOnlyBooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;

import javax.xml.bind.annotation.XmlTransient;

public enum JG implements JM {
    NEW(FCW.getInstance().getMessageForKey("micro.model.type.settlementstatus.new")),
    SETTLED(FCW.getInstance().getMessageForKey("micro.model.type.settlementstatus.settled")),
    CANCELED_CHANGED(FCW.getInstance().getMessageForKey("micro.model.type.settlementstatus.canceled_changed")),
    CANCELED_UNCHANGED(FCW.getInstance().getMessageForKey("micro.model.type.settlementstatus.canceled_unchanged"));

    private final String ANP;
    @XmlTransient
    private final ReadOnlyBooleanProperty CMY = new CCS(this);
    @XmlTransient
    private final ReadOnlyBooleanProperty CMZ = new CCT(this);
    @XmlTransient
    private final ReadOnlyBooleanProperty CNA = new CCU(this);
    @XmlTransient
    private final ReadOnlyBooleanProperty CNB = new CCV(this);

    JG(String var3) {
        EXF.getInstance().ICO();

        try {
            this.ANP = var3;
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public String getDescription() {
        return this.ANP;
    }

    public int DAQ(JM var1) {
        return this.compareTo((JG) var1);
    }

    public JM[] getEnumTypeValues() {
        return values();
    }

    public final ReadOnlyBooleanProperty DCR() {
        return this.CMY;
    }

    public final ReadOnlyBooleanProperty DCS() {
        return this.CMZ;
    }

    public final ReadOnlyBooleanProperty DCT() {
        return this.CNA;
    }

    public final ReadOnlyBooleanProperty isCanceledUnchangedProperty() {
        return this.CNB;
    }

    private class CCV extends SimpleBooleanProperty {
        private final JG CMX;

        public CCV(JG var2) {
            this.CMX = var2;
        }

        public boolean get() {
            return this.CMX.equals(JG.CANCELED_UNCHANGED);
        }
    }

    private class CCU extends SimpleBooleanProperty {
        private final JG CMW;

        public CCU(JG var2) {
            this.CMW = var2;
        }

        public boolean get() {
            return this.CMW.equals(JG.NEW);
        }
    }

    private class CCT extends SimpleBooleanProperty {
        private final JG CMV;

        public CCT(JG var2) {
            this.CMV = var2;
        }

        public boolean get() {
            return this.CMV.equals(JG.CANCELED_CHANGED);
        }
    }

    private class CCS extends SimpleBooleanProperty {
        private final JG CMU;

        public CCS(JG var2) {
            this.CMU = var2;
        }

        public boolean get() {
            return this.CMU.equals(JG.SETTLED);
        }
    }
}
