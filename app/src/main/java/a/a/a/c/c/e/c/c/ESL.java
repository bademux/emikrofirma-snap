package a.a.a.c.c.e.c.c;

import a.a.a.c.b.EDF;
import a.a.a.c.c.d.d.ENW;
import a.a.a.c.f.a.d.DeclarationStatus;
import a.a.a.c.f.a.h.Settlement;
import a.a.a.c.f.a.h.SettlementStatus;
import a.a.a.c.f.b.b.Period;
import a.a.a.c.f.b.c.JX;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleObjectProperty;

import java.util.Date;
import java.util.List;

public class ESL extends ESK implements ENW, Comparable<ESL> {
    private final ObjectProperty<Period> GDE;
    private final ObjectProperty<JX> GDF;
    private final ObjectProperty<SettlementStatus> GDG;
    private final ObjectProperty<Date> QNC;
    private final ObjectProperty<DeclarationStatus> QND;
    private final List<ESL> GDJ;
    private final boolean GDK;
    private final BooleanProperty GDL;
    private final BooleanProperty GDM;

    public ESL(EDF<Settlement> var1, ESJ var2, List<ESL> var3, boolean var4, boolean var5, boolean var6) {
        super(var2, var1);
        this.GDJ = var3;
        this.GDK = var4;
        this.GDL = new SimpleBooleanProperty(var5);
        this.GDM = new SimpleBooleanProperty(var6);
        this.GDE = new SimpleObjectProperty(null);
        this.GDF = new SimpleObjectProperty(null);
        this.GDG = new SimpleObjectProperty(null);
        this.QNC = new SimpleObjectProperty(null);
        this.QND = new SimpleObjectProperty(null);
    }

    public ESL(ESJ var1, List<ESL> var2, boolean var3, boolean var4, boolean var5, Settlement var6) {
        super(var1, var6);
        this.GDJ = var2;
        this.GDK = var3;
        this.GDL = new SimpleBooleanProperty(var4);
        this.GDM = new SimpleBooleanProperty(var5);
        this.GDE = new SimpleObjectProperty(null);
        this.GDF = new SimpleObjectProperty(null);
        this.GDG = new SimpleObjectProperty(null);
        this.QNC = new SimpleObjectProperty(null);
        this.QND = new SimpleObjectProperty(null);
    }

    public ObjectProperty<Period> getPeriod() {
        if (this.getSettlement() != null) {
            this.GDE.set(this.getSettlement().getPeriod());
        } else {
            this.GDE.set(null);
        }

        return this.GDE;
    }

    public ObjectProperty<JX> getSettlementDate() {
        if (this.getSettlement() != null) {
            this.GDF.set(this.getSettlement().getSettlementDateTime());
        } else {
            this.GDF.set(null);
        }

        return this.GDF;
    }

    public ObjectProperty<SettlementStatus> getSettlementStatus() {
        if (this.getSettlement() != null) {
            this.GDG.set(this.getSettlement().getSettlementStatus());
        } else {
            this.GDG.set(null);
        }

        return this.GDG;
    }

    public ObjectProperty<Date> getDeclarationJPKVATDate() {
        if (this.getDeclarationJPKVAT() != null) {
            this.QNC.set(this.getDeclarationJPKVAT().getCreationDateTime());
        } else {
            this.QNC.set(null);
        }

        return this.QNC;
    }

    public ObjectProperty<DeclarationStatus> getDeclarationJPKVATStatus() {
        if (this.getDeclarationJPKVAT() != null) {
            this.QND.set(this.getDeclarationJPKVAT().getDeclarationStatus());
        } else {
            this.QND.set(null);
        }

        return this.QND;
    }

    public List<ESL> getHistorical() {
        return this.GDJ;
    }

    public boolean HTT() {
        return this.GDK;
    }

    public BooleanProperty getBoldableProperty() {
        return this.GDM;
    }

    public BooleanProperty getExpandedProperty() {
        return this.GDL;
    }

    public void reset() {

        this.QPF();
        this.getPeriod();
        this.getSettlementDate();
        this.getSettlementStatus();
        this.getDeclarationJPKVATDate();
        this.getDeclarationJPKVATStatus();

    }

    public int compareTo(ESL var1) {
        return var1.getPeriod().get() == null ? -1 : this.getPeriod().get().compareTo(var1.getPeriod().get());
    }
}
