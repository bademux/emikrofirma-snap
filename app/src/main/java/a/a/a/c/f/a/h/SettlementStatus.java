package a.a.a.c.f.a.h;

import a.a.a.c.f.b.EnumTypeValue;
import a.a.a.c.g.b.FCW;
import jakarta.xml.bind.annotation.XmlTransient;
import javafx.beans.property.ReadOnlyBooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;

public enum SettlementStatus implements EnumTypeValue {
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

    SettlementStatus(String var3) {

        this.ANP = var3;

    }

    public String getDescription() {
        return this.ANP;
    }

    public int DAQ(EnumTypeValue var1) {
        return this.compareTo((SettlementStatus) var1);
    }

    public EnumTypeValue[] getEnumTypeValues() {
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
        private final SettlementStatus CMX;

        public CCV(SettlementStatus var2) {
            this.CMX = var2;
        }

        public boolean get() {
            return this.CMX.equals(SettlementStatus.CANCELED_UNCHANGED);
        }
    }

    private class CCU extends SimpleBooleanProperty {
        private final SettlementStatus CMW;

        public CCU(SettlementStatus var2) {
            this.CMW = var2;
        }

        public boolean get() {
            return this.CMW.equals(SettlementStatus.NEW);
        }
    }

    private class CCT extends SimpleBooleanProperty {
        private final SettlementStatus CMV;

        public CCT(SettlementStatus var2) {
            this.CMV = var2;
        }

        public boolean get() {
            return this.CMV.equals(SettlementStatus.CANCELED_CHANGED);
        }
    }

    private class CCS extends SimpleBooleanProperty {
        private final SettlementStatus CMU;

        public CCS(SettlementStatus var2) {
            this.CMU = var2;
        }

        public boolean get() {
            return this.CMU.equals(SettlementStatus.SETTLED);
        }
    }
}
