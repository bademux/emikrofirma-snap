package a.a.a.c.c.e.g.a;

import a.a.a.c.b.EDF;
import a.a.a.c.f.a.e.HR;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ETQ {
    private final ObjectProperty<Integer> GIL;
    private final ObjectProperty<LocalDate> QNG;
    private final StringProperty GIN;
    private final StringProperty GIO;
    private final StringProperty GIP;
    private final ObjectProperty<BigDecimal> GIQ;
    private final ObjectProperty<BigDecimal> GIR;
    private final ObjectProperty<BigDecimal> GIS;
    private final EDF<HR> GIT;
    private final StringProperty GIU;

    public ETQ(Integer var1, LocalDate var2, String var3, String var4, String var5, BigDecimal var6, BigDecimal var7, BigDecimal var8, EDF<HR> var9, String var10) {
        this.GIL = new SimpleObjectProperty(var1);
        this.QNG = new SimpleObjectProperty(var2);
        this.GIN = new SimpleStringProperty(var3);
        this.GIO = new SimpleStringProperty(var4);
        this.GIP = new SimpleStringProperty(var5);
        this.GIQ = new SimpleObjectProperty(var6);
        this.GIR = new SimpleObjectProperty(var7);
        this.GIS = new SimpleObjectProperty(var8);
        this.GIT = var9;
        this.GIU = new SimpleStringProperty(var10);
    }

    public ObjectProperty<Integer> getNr() {
        return this.GIL;
    }

    public ObjectProperty<LocalDate> getInvoicingDate() {
        return this.QNG;
    }

    public StringProperty getRefId() {
        return this.GIN;
    }

    public StringProperty getContractorName() {
        return this.GIO;
    }

    public StringProperty getContractorNip() {
        return this.GIP;
    }

    public ObjectProperty<BigDecimal> getSumNet() {
        return this.GIQ;
    }

    public ObjectProperty<BigDecimal> getSumTax() {
        return this.GIR;
    }

    public ObjectProperty<BigDecimal> getSumBrut() {
        return this.GIS;
    }

    public EDF<HR> getInvoice() {
        return this.GIT;
    }

    public StringProperty getInvoicetype() {
        return this.GIU;
    }
}
