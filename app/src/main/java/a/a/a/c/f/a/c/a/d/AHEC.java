package a.a.a.c.f.a.c.a.d;

import a.a.a.b.f.FFI;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.c.a.c.AHDV;
import a.a.a.c.f.a.c.a.f.AHEO;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.XMLGregorianCalendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@XmlAccessorType(XmlAccessType.FIELD)
public class AHEC extends AHDZ<XMLGregorianCalendar> {
    private final transient SimpleDateFormat AHWK;
    private final transient SimpleDateFormat AHWL;
    private final transient SimpleDateFormat AHWM;
    private final transient SimpleDateFormat AHWN;
    private final transient SimpleDateFormat AHWO;

    private AHEC() {
        EXF.getInstance().ICO();

        try {
            this.AHWK = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX");
            this.AHWL = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
            this.AHWM = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
            this.AHWN = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
            this.AHWO = new SimpleDateFormat("yyyy-MM-dd");
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public AHEC(AHEF var1, AHEO var2) {
        super(var1, var2);
        EXF.getInstance().ICO();

        try {
            this.AHWK = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX");
            this.AHWL = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
            this.AHWM = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
            this.AHWN = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
            this.AHWO = new SimpleDateFormat("yyyy-MM-dd");
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public void AIDR(AHDV var1) {
        EXF.getInstance().ICO();

        try {
            EXF.getInstance().ICK("selectedField " + var1);
            EXF.getInstance().ICK("operationType " + this.AHWI);
            EXF.getInstance().ICK("variable " + this.AHWJ);
            if (this.AHWI == AHEF.SET) {
                if (this.AHWJ.AIDV()) {
                    throw new FFI("The variable was already set!");
                }

                String var2 = var1.getValue();
                EXF.getInstance().ICK("selectedFieldValue " + var2);
                String var3 = var2 != null ? var2.trim() : "";
                EXF.getInstance().ICK("selectedFieldValueTrimed " + var3);
                Date var4 = null;

                try {
                    var4 = this.AHWK.parse(var3);
                } catch (ParseException var19) {
                    EXF.getInstance().ICI(var19);

                    try {
                        var4 = this.AHWL.parse(var3);
                    } catch (ParseException var18) {
                        EXF.getInstance().ICI(var18);

                        try {
                            var4 = this.AHWM.parse(var3);
                        } catch (ParseException var17) {
                            EXF.getInstance().ICI(var17);

                            try {
                                var4 = this.AHWN.parse(var3);
                            } catch (ParseException var16) {
                                EXF.getInstance().ICI(var16);
                                var4 = this.AHWO.parse(var3);
                            }
                        }
                    }
                }

                XMLGregorianCalendar var5 = this.AICS(var4);
                this.AHWJ.setValue(var5);
                return;
            }
            throw new FFI("Invalid operationType [" + this.AHWI + "]!");
        } catch (DatatypeConfigurationException | ParseException var20) {
            EXF.getInstance().ICA(var20);
            throw new FFI(var20);
        } finally {
            EXF.getInstance().ICP();
        }
    }
}
