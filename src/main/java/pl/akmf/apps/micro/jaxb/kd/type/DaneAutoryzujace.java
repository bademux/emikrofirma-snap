package pl.akmf.apps.micro.jaxb.kd.type;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"nip", "pesel", "imiePierwsze", "nazwisko", "dataUrodzenia", "kwota"}
)
@XmlRootElement(
        name = "DaneAutoryzujace"
)
public class DaneAutoryzujace {
    @XmlElement(
            name = "NIP"
    )
    protected String nip;
    @XmlElement(
            name = "PESEL"
    )
    protected String pesel;
    @XmlElement(
            name = "ImiePierwsze",
            required = true
    )
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String imiePierwsze;
    @XmlElement(
            name = "Nazwisko",
            required = true
    )
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String nazwisko;
    @XmlElement(
            name = "DataUrodzenia",
            required = true
    )
    protected XMLGregorianCalendar dataUrodzenia;
    @XmlElement(
            name = "Kwota",
            required = true
    )
    protected BigDecimal kwota;

    public DaneAutoryzujace() {
    }

    public String getNIP() {
        return this.nip;
    }

    public void setNIP(String var1) {
        this.nip = var1;
    }

    public String getPESEL() {
        return this.pesel;
    }

    public void setPESEL(String var1) {
        this.pesel = var1;
    }

    public String getImiePierwsze() {
        return this.imiePierwsze;
    }

    public void setImiePierwsze(String var1) {
        this.imiePierwsze = var1;
    }

    public String getNazwisko() {
        return this.nazwisko;
    }

    public void setNazwisko(String var1) {
        this.nazwisko = var1;
    }

    public XMLGregorianCalendar getDataUrodzenia() {
        return this.dataUrodzenia;
    }

    public void setDataUrodzenia(XMLGregorianCalendar var1) {
        this.dataUrodzenia = var1;
    }

    public BigDecimal getKwota() {
        return this.kwota;
    }

    public void setKwota(BigDecimal var1) {
        this.kwota = var1;
    }
}
