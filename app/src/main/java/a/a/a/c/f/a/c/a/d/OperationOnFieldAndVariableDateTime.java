package a.a.a.c.f.a.c.a.d;

import a.a.a.b.DateFormat;
import a.a.a.b.f.FFI;
import a.a.a.c.f.a.c.a.c.SelectedField;
import a.a.a.c.f.a.c.a.f.VariableDateTime;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import lombok.extern.slf4j.Slf4j;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.XMLGregorianCalendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Slf4j
@XmlAccessorType(XmlAccessType.FIELD)
public class OperationOnFieldAndVariableDateTime extends OperationOnFieldAndVariableAbstract<XMLGregorianCalendar> {
    private final transient SimpleDateFormat AHWK;
    private final transient SimpleDateFormat AHWL;
    private final transient SimpleDateFormat AHWM;
    private final transient SimpleDateFormat AHWN;
    private final transient SimpleDateFormat AHWO;

    private OperationOnFieldAndVariableDateTime() {

        this.AHWK = new SimpleDateFormat(DateFormat.yyyy_MM_ddTHH_mm_ssXXX.getValue());
        this.AHWL = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
        this.AHWM = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
        this.AHWN = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        this.AHWO = new SimpleDateFormat(DateFormat.yyyy_MM_dd.getValue());

    }

    public OperationOnFieldAndVariableDateTime(OperationType var1, VariableDateTime var2) {
        super(var1, var2);

        this.AHWK = new SimpleDateFormat(DateFormat.yyyy_MM_ddTHH_mm_ssXXX.getValue());
        this.AHWL = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
        this.AHWM = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
        this.AHWN = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        this.AHWO = new SimpleDateFormat(DateFormat.yyyy_MM_dd.getValue());

    }

    public void AIDR(SelectedField var1) {

        try {
            log.debug("selectedField " + var1);
            log.debug("operationType " + this.AHWI);
            log.debug("variable " + this.AHWJ);
            if (this.AHWI == OperationType.SET) {
                if (this.AHWJ.AIDV()) {
                    throw new FFI("The variable was already set!");
                }

                String var2 = var1.getValue();
                log.debug("selectedFieldValue " + var2);
                String var3 = var2 != null ? var2.trim() : "";
                log.debug("selectedFieldValueTrimed " + var3);
                Date var4 = null;

                try {
                    var4 = this.AHWK.parse(var3);
                } catch (ParseException var19) {
                    log.warn("Something bad happened", var19);

                    try {
                        var4 = this.AHWL.parse(var3);
                    } catch (ParseException var18) {
                        log.warn("Something bad happened", var18);

                        try {
                            var4 = this.AHWM.parse(var3);
                        } catch (ParseException var17) {
                            log.warn("Something bad happened", var17);

                            try {
                                var4 = this.AHWN.parse(var3);
                            } catch (ParseException var16) {
                                log.warn("Something bad happened", var16);
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
            log.error("Something bad happened", var20);
            throw new FFI(var20);
        }
    }
}
