package a.a.a.c.f;

import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.c.e.a.k.a.EXF;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

import jakarta.xml.bind.annotation.XmlTransient;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.GregorianCalendar;

@XmlTransient
public abstract class LF extends KX<XMLGregorianCalendar> {
    @XmlTransient
    private final ObjectProperty<LocalDate> APT;

    private LF(boolean var1, XMLGregorianCalendar var2) {
        super(var1, var2);
        this.APT = new LG(this);
        EXF.getInstance().ICQ();
    }

    private LF(XMLGregorianCalendar var1) {
        this(false, var1);
        EXF.getInstance().ICQ();
    }

    public LF(boolean var1, Date var2) {
        this(var1, DEB(var2));
        EXF.getInstance().ICQ();
    }

    public LF(Date var1) {
        this(false, DEB(var1));
        EXF.getInstance().ICQ();
    }

    public LF(boolean var1, LocalDate var2) {
        this(var1, DEB(var2));
        EXF.getInstance().ICQ();
    }

    public LF(LocalDate var1) {
        this(false, DEB(var1));
        EXF.getInstance().ICQ();
    }

    public LF() {
        this((XMLGregorianCalendar) null);
        EXF.getInstance().ICQ();
    }

    public Date getValueDate() {
        return super.getValue() == null ? null : super.getValue().toGregorianCalendar().getTime();
    }

    public abstract String DDZ() throws FFK;

    public abstract XMLGregorianCalendar DEA(String var1) throws FFK;

    public static XMLGregorianCalendar DEB(Date var0) {
        EXF.getInstance().ICO();

        XMLGregorianCalendar var2;
        try {
            GregorianCalendar var1;
            if (var0 == null) {
                return null;
            }

            var1 = new GregorianCalendar();
            var1.setTime(var0);
            var2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(var1);
        } catch (DatatypeConfigurationException var6) {
            EXF.getInstance().ICA(var6);
            throw new FFI(var6);
        } finally {
            EXF.getInstance().ICP();
        }

        return var2;
    }

    public static XMLGregorianCalendar DEB(LocalDate var0) {
        EXF.getInstance().ICO();

        GregorianCalendar var1;
        try {
            if (var0 != null) {
                var1 = GregorianCalendar.from(var0.atStartOfDay(ZoneId.systemDefault()));
                XMLGregorianCalendar var2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(var1);
                return var2;
            }

            var1 = null;
        } catch (DatatypeConfigurationException var6) {
            EXF.getInstance().ICA(var6);
            throw new FFI(var6);
        } finally {
            EXF.getInstance().ICP();
        }

        return null;
    }

    public int compareTo(KX<XMLGregorianCalendar> var1) {
        return var1 != null && var1.getValue() != null ? var1.getValue().compare(this.getValue()) : -1;
    }

    public final ObjectProperty<LocalDate> DEC() {
        return this.APT;
    }

    public String getValueAsString() {
        try {
            return this.DDZ();
        } catch (FFK var2) {
            EXF.getInstance().ICA(var2);
            return "";
        }
    }

    public void setValueFromString(String var1) {
        if (var1 != null) {
            try {
                this.setValue(this.DEA(var1));
            } catch (FFK var3) {
                this.setValue(null);
            }
        }

    }

    private class LG extends SimpleObjectProperty<LocalDate> {
        private final LF APS;

        public LG(LF var2) {
            this.APS = var2;
        }

        public LocalDate get() {
            return this.APS.getValue() != null ? this.APS.getValue().toGregorianCalendar().toZonedDateTime().toLocalDate() : null;
        }

        public void set(LocalDate var1) {
            if (var1 != null) {
                try {
                    GregorianCalendar var2 = GregorianCalendar.from(var1.atStartOfDay(ZoneId.systemDefault()));
                    XMLGregorianCalendar var3 = DatatypeFactory.newInstance().newXMLGregorianCalendar(var2);
                    this.APS.setValue(var3);
                } catch (DatatypeConfigurationException var4) {
                    EXF.getInstance().ICA(var4);
                    throw new FFI(var4);
                }
            } else {
                this.APS.setValue(null);
            }

        }
    }
}
