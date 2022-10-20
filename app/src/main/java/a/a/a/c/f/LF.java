package a.a.a.c.f;

import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import jakarta.xml.bind.annotation.XmlTransient;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import lombok.extern.slf4j.Slf4j;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.GregorianCalendar;

@Slf4j
@XmlTransient
public abstract class LF extends ModelBaseTypeElement<XMLGregorianCalendar> {
    @XmlTransient
    private final ObjectProperty<LocalDate> APT;

    private LF(boolean var1, XMLGregorianCalendar var2) {
        super(var1, var2);
        this.APT = new LG(this);

    }

    private LF(XMLGregorianCalendar var1) {
        this(false, var1);

    }

    public LF(boolean var1, Date var2) {
        this(var1, DEB(var2));

    }

    public LF(Date var1) {
        this(false, DEB(var1));

    }

    public LF(boolean var1, LocalDate var2) {
        this(var1, DEB(var2));

    }

    public LF(LocalDate var1) {
        this(false, DEB(var1));

    }

    public LF() {
        this((XMLGregorianCalendar) null);

    }

    public Date getValueDate() {
        return super.getValue() == null ? null : super.getValue().toGregorianCalendar().getTime();
    }

    public abstract String DDZ() throws FFK;

    public abstract XMLGregorianCalendar DEA(String var1) throws FFK;

    public static XMLGregorianCalendar DEB(Date var0) {

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
            log.error("Something bad happened", var6);
            throw new FFI(var6);
        }

        return var2;
    }

    public static XMLGregorianCalendar DEB(LocalDate var0) {

        GregorianCalendar var1;
        try {
            if (var0 != null) {
                var1 = GregorianCalendar.from(var0.atStartOfDay(ZoneId.systemDefault()));
                XMLGregorianCalendar var2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(var1);
                return var2;
            }

            var1 = null;
        } catch (DatatypeConfigurationException var6) {
            log.error("Something bad happened", var6);
            throw new FFI(var6);
        }

        return null;
    }

    public int compareTo(ModelBaseTypeElement<XMLGregorianCalendar> var1) {
        return var1 != null && var1.getValue() != null ? var1.getValue().compare(this.getValue()) : -1;
    }

    public final ObjectProperty<LocalDate> DEC() {
        return this.APT;
    }

    public String getValueAsString() {
        try {
            return this.DDZ();
        } catch (FFK var2) {
            log.error("Something bad happened", var2);
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
                    log.error("Something bad happened", var4);
                    throw new FFI(var4);
                }
            } else {
                this.APS.setValue(null);
            }

        }
    }
}
