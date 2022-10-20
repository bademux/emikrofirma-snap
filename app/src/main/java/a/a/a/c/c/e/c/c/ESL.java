package a.a.a.c.c.e.c.c;

import a.a.a.c.b.EDF;
import a.a.a.c.c.d.d.ENW;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.d.HL;
import a.a.a.c.f.a.h.JF;
import a.a.a.c.f.a.h.JG;
import a.a.a.c.f.b.b.JN;
import a.a.a.c.f.b.c.JX;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleObjectProperty;

import java.util.Date;
import java.util.List;

public class ESL extends ESK implements ENW, Comparable<ESL> {
    private final ObjectProperty<JN> GDE;
    private final ObjectProperty<JX> GDF;
    private final ObjectProperty<JG> GDG;
    private final ObjectProperty<Date> QNC;
    private final ObjectProperty<HL> QND;
    private final List<ESL> GDJ;
    private final boolean GDK;
    private final BooleanProperty GDL;
    private final BooleanProperty GDM;

    public ESL(EDF<JF> var1, ESJ var2, List<ESL> var3, boolean var4, boolean var5, boolean var6) {
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

    public ESL(ESJ var1, List<ESL> var2, boolean var3, boolean var4, boolean var5, JF var6) {
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

    public ObjectProperty<JN> getPeriod() {
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

    public ObjectProperty<JG> getSettlementStatus() {
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

    public ObjectProperty<HL> getDeclarationJPKVATStatus() {
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
        EXF.getInstance().ICO();

        try {
            this.QPF();
            this.getPeriod();
            this.getSettlementDate();
            this.getSettlementStatus();
            this.getDeclarationJPKVATDate();
            this.getDeclarationJPKVATStatus();
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public int compareTo(ESL var1) {
        return var1.getPeriod().get() == null ? -1 : this.getPeriod().get().compareTo(var1.getPeriod().get());
    }
}
