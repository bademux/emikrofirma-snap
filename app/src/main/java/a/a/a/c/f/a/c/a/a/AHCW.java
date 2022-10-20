package a.a.a.c.f.a.c.a.a;

import a.a.a.b.f.FFI;
import a.a.a.c.e.a.d.TwoValueBox;
import a.a.a.c.f.a.c.a.AHCI;
import a.a.a.c.f.a.c.a.AHCJ;
import a.a.a.c.f.a.c.a.c.AHDT;
import a.a.a.c.f.a.c.a.f.AHEN;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@XmlAccessorType(XmlAccessType.FIELD)
public class AHCW extends AHCU<Date, Long> {
    private final transient SimpleDateFormat AHUX;

    private AHCW() {

        this.AHUX = new SimpleDateFormat("yyyy-MM-dd");

    }

    public AHCW(AHCJ var1, String var2, AHDG var3, AHEN var4, Long var5) {
        super(var1, var2, var3, var4, var5);

        this.AHUX = new SimpleDateFormat("yyyy-MM-dd");

    }

    public TwoValueBox<AHCI, String> AICX(AHDT var1) {

        TwoValueBox var8;
        try {
            org.slf4j.LoggerFactory.getLogger(getClass()).debug("field " + var1);
            org.slf4j.LoggerFactory.getLogger(getClass()).debug("conditionType " + this.AHUF);
            org.slf4j.LoggerFactory.getLogger(getClass()).debug("variable " + this.AHUQ);
            org.slf4j.LoggerFactory.getLogger(getClass()).debug("offset " + this.AHUR);
            String var2 = var1.getValue();
            org.slf4j.LoggerFactory.getLogger(getClass()).debug("fieldValue " + var2);
            String var3 = var2 != null ? var2.trim() : "";
            org.slf4j.LoggerFactory.getLogger(getClass()).debug("fieldValueTrimed " + var3);
            Date var4 = this.AHUX.parse(var3);
            Date var5 = new Date(this.AHUQ.getValue().getTime() + this.AHUR);
            boolean var6 = false;
            switch (this.AHUF) {
                case EQUALS:
                    var6 = var5.compareTo(var4) == 0;
                    break;
                case GREATER:
                    var6 = var5.compareTo(var4) < 0;
                    break;
                case GREATER_OR_EQUAL:
                    var6 = var5.compareTo(var4) <= 0;
                    break;
                case LESSER:
                    var6 = var5.compareTo(var4) > 0;
                    break;
                case LESSER_OR_EQUAL:
                    var6 = var5.compareTo(var4) >= 0;
                    break;
                default:
                    throw new FFI("Invalid conditionType [" + this.AHUF + "]!");
            }

            if (var6) {
                TwoValueBox var14 = new TwoValueBox(AHCI.SUCCESS, null);
                return var14;
            }

            AHCI var7 = null;
            switch (this.AHTY) {
                case WARNING:
                    var7 = AHCI.WARNING;
                    break;
                case ERROR:
                    var7 = AHCI.ERROR;
                    break;
                default:
                    throw new FFI("Invalid actionType [" + this.AHTY + "]!");
            }

            var8 = new TwoValueBox(var7, this.AIDB("", var1));
        } catch (ParseException var12) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var12);
            throw new FFI(var12);
        }

        return var8;
    }
}
