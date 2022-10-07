package a.a.a.c.c.d.g;

import a.a.a.c.c.d.ENI;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.b.c.a.KL;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.ParseException;

public class EOY {
    private final StringProperty FOG = new SimpleStringProperty("");
    private final StringProperty FOH;
    private final StringProperty FOI;
    private final StringProperty FOJ;
    private final ObjectProperty<KL> FOK;
    private final StringProperty FOL;
    private final StringProperty FOM;
    private final StringProperty FON;
    private final StringProperty FOO;
    private BigDecimal FOP;
    private BigDecimal FOQ;
    private BigDecimal FOR;
    private BigDecimal FOS;
    private BigDecimal FOT;
    private final DecimalFormat FOU = ENI.get();

    public EOY(String var1) {
        this.FOH = new SimpleStringProperty(var1);
        this.FOI = new SimpleStringProperty("");
        this.FOJ = new SimpleStringProperty("1.0");
        this.FOK = new SimpleObjectProperty(KL.RATE_23);
        this.FOL = new SimpleStringProperty("");
        this.FOM = new SimpleStringProperty("");
        this.FON = new SimpleStringProperty("");
        this.FOO = new SimpleStringProperty("");
    }

    public EOY() {
        this.FOH = new SimpleStringProperty("");
        this.FOI = new SimpleStringProperty("");
        this.FOJ = new SimpleStringProperty("");
        this.FOK = new SimpleObjectProperty();
        this.FOL = new SimpleStringProperty("");
        this.FOM = new SimpleStringProperty("");
        this.FON = new SimpleStringProperty("");
        this.FOO = new SimpleStringProperty("");
    }

    public StringProperty getName() {
        return this.FOG;
    }

    public StringProperty getUnit() {
        return this.FOH;
    }

    public StringProperty getNetPrice() {
        return this.FOI;
    }

    public void setNetPrice(String var1) {
        this.FOP = this.HOB(var1, 2);
        this.FOI.set(this.FOU.format(this.FOP));
    }

    public void setAmount(String var1) {
        this.FOQ = this.HOB(var1, 10);
        this.FOJ.set(this.FOU.format(this.FOQ));
    }

    public BigDecimal getNetPriceBigDecimal() {
        this.FOP = this.HOB(this.FOI.get(), 2);
        return this.FOP;
    }

    public StringProperty getAmount() {
        return this.FOJ;
    }

    public BigDecimal getAmountBigDecimal() {
        this.FOQ = this.HOC(this.FOJ.get());
        return this.FOQ;
    }

    public ObjectProperty<KL> getTaxType() {
        return this.FOK;
    }

    public StringProperty getSumNet() {
        return this.FOL;
    }

    public StringProperty getSumBrut() {
        return this.FOM;
    }

    public StringProperty getDescription() {
        return this.FON;
    }

    public StringProperty getSumTax() {
        return this.FOO;
    }

    public BigDecimal getSumNetBigDecimal() {
        return this.FOR;
    }

    public void setSumNetBigDecimal(BigDecimal var1) {
        this.FOR = var1;
        this.FOL.set(this.FOU.format(this.FOR));
    }

    public BigDecimal getSumBrutBigDecimal() {
        return this.FOS;
    }

    public void setSumBrutBigDecimal(BigDecimal var1) {
        this.FOS = var1;
        this.FOM.set(this.FOU.format(this.FOS));
    }

    public void setNetPriceBigDecimal(BigDecimal var1) {
        this.FOP = var1;
    }

    public void setAmountBigDecimal(BigDecimal var1) {
        this.FOQ = var1;
    }

    public BigDecimal getSumTaxBigDecimal() {
        return this.FOT;
    }

    public void setSumTaxBigDecimal(BigDecimal var1) {
        this.FOT = var1;
        this.FOO.set(this.FOU.format(this.FOT));
    }

    private BigDecimal HOB(String var1, int var2) {
        return this.HOC(var1).setScale(var2, RoundingMode.HALF_UP);
    }

    private BigDecimal HOC(String var1) {
        BigDecimal var2 = null;

        try {
            var2 = (BigDecimal) this.FOU.parse(var1);
        } catch (ParseException var4) {
            EXF.getInstance().ICA(var4);
            var2 = new BigDecimal(0);
        }

        return var2;
    }
}
