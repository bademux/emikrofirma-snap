package a.a.a.c.c.e.l.a;

import a.a.a.c.b.EDF;
import a.a.a.c.c.d.d.ENW;
import a.a.a.c.f.a.e.HY;
import a.a.a.c.f.b.c.a.QSW;
import a.a.a.c.g.b.FCW;
import javafx.beans.property.*;

import java.math.BigDecimal;
import java.time.LocalDate;

public class EVG implements ENW {
    private static final String RAQ = FCW.getInstance().getMessageForKey("micro.process.invoice_sale_list.canceledTrue");
    private static final String RAR = FCW.getInstance().getMessageForKey("micro.process.invoice_sale_list.canceledFalse");
    private final ObjectProperty<Integer> GOM;
    private final ObjectProperty<LocalDate> GON;
    private final StringProperty GOO;
    private final StringProperty GOP;
    private final StringProperty GOQ;
    private final StringProperty GOR;
    private final ObjectProperty<BigDecimal> GOS;
    private final ObjectProperty<BigDecimal> GOT;
    private final ObjectProperty<BigDecimal> GOU;
    private final StringProperty RAS;
    private final EDF<HY> GOV;
    private final StringProperty GOW;
    private final BooleanProperty GOX;
    private final BooleanProperty GOY;

    public EVG(Integer var1, LocalDate var2, String var3, String var4, String var5, String var6, BigDecimal var7, BigDecimal var8, BigDecimal var9, EDF<HY> var10, String var11, boolean var12, boolean var13) {
        this.GOM = new SimpleObjectProperty(var1);
        this.GON = new SimpleObjectProperty(var2);
        this.GOO = new SimpleStringProperty(var3);
        this.GOP = new SimpleStringProperty(var4);
        this.GOQ = new SimpleStringProperty(var5);
        this.GOR = new SimpleStringProperty(var6);
        this.GOS = new SimpleObjectProperty(var7);
        this.GOT = new SimpleObjectProperty(var8);
        this.GOU = new SimpleObjectProperty(var9);
        this.GOV = var10;
        this.GOW = new SimpleStringProperty(var11);
        this.GOX = new SimpleBooleanProperty(var12);
        this.GOY = new SimpleBooleanProperty(var13);
        if (var10 != null && var10.getState().equals(QSW.CANCELED)) {
            this.RAS = new SimpleStringProperty(RAQ);
        } else {
            this.RAS = new SimpleStringProperty(RAR);
        }

    }

    public ObjectProperty<Integer> getNr() {
        return this.GOM;
    }

    public ObjectProperty<LocalDate> getInvoicingDate() {
        return this.GON;
    }

    public StringProperty getRefId() {
        return this.GOO;
    }

    public StringProperty getParentRefId() {
        return this.GOP;
    }

    public StringProperty getContractorName() {
        return this.GOQ;
    }

    public StringProperty getContractorNip() {
        return this.GOR;
    }

    public ObjectProperty<BigDecimal> getSumNet() {
        return this.GOS;
    }

    public ObjectProperty<BigDecimal> getSumTax() {
        return this.GOT;
    }

    public ObjectProperty<BigDecimal> getSumBrut() {
        return this.GOU;
    }

    public StringProperty getCanceled() {
        return this.RAS;
    }

    public EDF<HY> getInvoice() {
        return this.GOV;
    }

    public StringProperty getInvoicetype() {
        return this.GOW;
    }

    public BooleanProperty getBoldableProperty() {
        return this.GOX;
    }

    public BooleanProperty getExpandedProperty() {
        return this.GOY;
    }
}
