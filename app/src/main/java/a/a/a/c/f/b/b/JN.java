package a.a.a.c.f.b.b;

import a.a.a.b.f.FFK;
import a.a.a.c.e.a.d.EVZ;
import a.a.a.c.f.a.IJ;
import a.a.a.c.f.b.c.JY;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlTransient;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

@XmlAccessorType(XmlAccessType.FIELD)
public class JN extends IJ implements Comparable<JN> {
    public static final JN AOE = new JN(0, 0);
    private JY AOF;
    private JY AOG;
    @XmlTransient
    private final ObjectProperty<LocalDate> AOH;
    @XmlTransient
    private final ObjectProperty<JN> AOI;
    private static final String AOJ = "yyyy";
    private static final String AOK = "MM";

    public JN(JY var1, JY var2) {
        this.AOH = new JO(this);
        this.AOI = new JP(this);

        this.AOF = var1;
        this.AOG = var2;

    }

    public JN(Integer var1, Integer var2) {
        this(new JY(var1), new JY(var2));

    }

    private JN(EVZ<Integer, Integer> var1) {
        this(new JY(var1.getFirstValue()), new JY(var1.getSecondValue()));

    }

    public JN(Date var1) throws FFK {
        this(DDO(var1));

    }

    public JN(LocalDate var1) throws FFK {
        this(DDO(var1));

    }

    public JN(JN var1) {
        this(var1.AOF, var1.AOG);

    }

    public JN() {
        this(null, (JY) null);

    }

    public JY getYear() {
        return this.AOF;
    }

    public JY DDJ() {
        if (this.AOF == null) {
            this.AOF = new JY();
        }

        return this.AOF;
    }

    public void setYear(JY var1) {
        this.AOF = var1;
    }

    public JY getMonth() {
        return this.AOG;
    }

    public JY DDK() {
        if (this.AOG == null) {
            this.AOG = new JY();
        }

        return this.AOG;
    }

    public void setMonth(JY var1) {
        this.AOG = var1;
    }

    public final ObjectProperty<LocalDate> DDL() {
        return this.AOH;
    }

    public final ObjectProperty<JN> DDM() {
        return this.AOI;
    }

    public int hashCode() {
        int var2 = 1;
        var2 = 31 * var2 + (this.AOG == null ? 0 : this.AOG.hashCode());
        var2 = 31 * var2 + (this.AOF == null ? 0 : this.AOF.hashCode());
        return var2;
    }

    public boolean equals(Object var1) {
        if (this == var1) {
            return true;
        } else if (var1 == null) {
            return false;
        } else if (this.getClass() != var1.getClass()) {
            return false;
        } else {
            JN var2 = (JN) var1;
            if (this.AOG == null) {
                if (var2.AOG != null) {
                    return false;
                }
            } else if (!this.AOG.equals(var2.AOG)) {
                return false;
            }

            if (this.AOF == null) {
                return var2.AOF == null;
            } else return this.AOF.equals(var2.AOF);
        }
    }

    public JN DDN() {

        JN var2;
        JN var1 = new JN();
        var1.AOF = this.AOF != null ? this.AOF.DEH() : null;
        var1.AOG = this.AOG != null ? this.AOG.DEH() : null;
        var2 = var1;

        return var2;
    }

    public String toString() {
        return "Period [year=" + this.AOF + ", month=" + this.AOG + "]";
    }

    private static EVZ<Integer, Integer> DDO(Date var0) throws FFK {

        EVZ var5;
        if (var0 == null) {
            throw new FFK("Date cannot be NULL!");
        }

        SimpleDateFormat var1 = new SimpleDateFormat("yyyy");
        SimpleDateFormat var2 = new SimpleDateFormat("MM");
        Integer var3 = Integer.parseInt(var1.format(var0));
        Integer var4 = Integer.parseInt(var2.format(var0));
        var5 = new EVZ(var3, var4);

        return var5;
    }

    private static EVZ<Integer, Integer> DDO(LocalDate var0) throws FFK {

        EVZ var3;
        if (var0 == null) {
            throw new FFK("Date cannot be NULL!");
        }

        Integer var1 = var0.getYear();
        Integer var2 = var0.getMonthValue();
        var3 = new EVZ(var1, var2);

        return var3;
    }

    public int compareTo(JN var1) {
        if (this.equals(var1)) {
            return 0;
        } else if (this.AOF != null && this.AOG != null && var1.AOG != null && var1.AOF != null) {
            if (this.AOF.getValue() > var1.AOF.getValue()) {
                return -1;
            } else if (this.AOF.getValue() < var1.AOF.getValue()) {
                return 1;
            } else {
                return this.AOG.getValue() > var1.AOG.getValue() ? -1 : 1;
            }
        } else {
            return -1;
        }
    }

    private class JP extends SimpleObjectProperty<JN> {
        private final JN AOD;

        public JP(JN var2) {
            this.AOD = var2;
        }

        public JN get() {
            return this.AOD;
        }

        public void set(JN var1) {
            if (var1 != null) {
                this.AOD.DDK().setValue(var1.DDK().getValue());
                this.AOD.DDJ().setValue(var1.DDJ().getValue());
            } else {
                this.AOD.DDJ().setValue(JN.AOE.getYear().getValue());
                this.AOD.DDK().setValue(JN.AOE.getMonth().getValue());
            }

        }
    }

    private class JO extends SimpleObjectProperty<LocalDate> {
        private final JN AOB;
        private LocalDate AOC;

        public JO(JN var2) {
            this.AOB = var2;
            this.AOC = null;
        }

        public LocalDate get() {
            return this.AOC;
        }

        public void set(LocalDate var1) {
            if (var1 != null) {
                this.AOC = var1;

                try {
                    EVZ var2 = JN.DDO(var1);
                    this.AOB.DDJ().setValue((Integer) var2.getFirstValue());
                    this.AOB.DDK().setValue((Integer) var2.getSecondValue());
                } catch (FFK var3) {
                    this.AOB.DDJ().setValue(JN.AOE.getYear().getValue());
                    this.AOB.DDK().setValue(JN.AOE.getMonth().getValue());
                }
            } else {
                this.AOB.DDJ().setValue(JN.AOE.getYear().getValue());
                this.AOB.DDK().setValue(JN.AOE.getMonth().getValue());
            }

        }
    }
}
