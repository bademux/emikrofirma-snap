package pl.akmf.apps.micro.jaxb.upo.v1_6;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"nazwaPodmiotuPrzyjmujacego", "numerReferencyjny", "skrotDokumentu", "skrotZlozonejStruktury", "nazwaStrukturyLogicznej", "dataWplyniecia", "stempelCzasu", "nip1", "pesel1", "numerIdentyfikacyjny", "nip2", "pesel2", "kodUrzedu", "kodFormularza", "przyjeto", "blad"}
)
@XmlRootElement(
        name = "Potwierdzenie"
)
public class Potwierdzenie {
    @XmlElement(
            name = "NazwaPodmiotuPrzyjmujacego",
            required = true
    )
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String nazwaPodmiotuPrzyjmujacego;
    @XmlElement(
            name = "NumerReferencyjny",
            required = true
    )
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String numerReferencyjny;
    @XmlElement(
            name = "SkrotDokumentu",
            required = true
    )
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String skrotDokumentu;
    @XmlElement(
            name = "SkrotZlozonejStruktury",
            required = true
    )
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String skrotZlozonejStruktury;
    @XmlElement(
            name = "NazwaStrukturyLogicznej",
            required = true
    )
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String nazwaStrukturyLogicznej;
    @XmlElement(
            name = "DataWplyniecia",
            required = true
    )
    protected XMLGregorianCalendar dataWplyniecia;
    @XmlElement(
            name = "StempelCzasu",
            required = true
    )
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String stempelCzasu;
    @XmlElement(
            name = "NIP1"
    )
    protected String nip1;
    @XmlElement(
            name = "PESEL1"
    )
    protected String pesel1;
    @XmlElement(
            name = "NumerIdentyfikacyjny"
    )
    protected String numerIdentyfikacyjny;
    @XmlElement(
            name = "NIP2"
    )
    protected String nip2;
    @XmlElement(
            name = "PESEL2"
    )
    protected String pesel2;
    @XmlElement(
            name = "KodUrzedu",
            required = true
    )
    protected String kodUrzedu;
    @XmlElement(
            name = "KodFormularza",
            required = true
    )
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String kodFormularza;
    @XmlElement(
            name = "Przyjeto"
    )
    protected boolean przyjeto;
    @XmlElement(
            name = "Blad"
    )
    protected List<String> blad;
    @XmlAttribute(
            name = "wersjaSchemy"
    )
    protected String wersjaSchemy;

    public Potwierdzenie() {
    }

    public String getNazwaPodmiotuPrzyjmujacego() {
        return this.nazwaPodmiotuPrzyjmujacego;
    }

    public void setNazwaPodmiotuPrzyjmujacego(String var1) {
        this.nazwaPodmiotuPrzyjmujacego = var1;
    }

    public String getNumerReferencyjny() {
        return this.numerReferencyjny;
    }

    public void setNumerReferencyjny(String var1) {
        this.numerReferencyjny = var1;
    }

    public String getSkrotDokumentu() {
        return this.skrotDokumentu;
    }

    public void setSkrotDokumentu(String var1) {
        this.skrotDokumentu = var1;
    }

    public String getSkrotZlozonejStruktury() {
        return this.skrotZlozonejStruktury;
    }

    public void setSkrotZlozonejStruktury(String var1) {
        this.skrotZlozonejStruktury = var1;
    }

    public String getNazwaStrukturyLogicznej() {
        return this.nazwaStrukturyLogicznej;
    }

    public void setNazwaStrukturyLogicznej(String var1) {
        this.nazwaStrukturyLogicznej = var1;
    }

    public XMLGregorianCalendar getDataWplyniecia() {
        return this.dataWplyniecia;
    }

    public void setDataWplyniecia(XMLGregorianCalendar var1) {
        this.dataWplyniecia = var1;
    }

    public String getStempelCzasu() {
        return this.stempelCzasu;
    }

    public void setStempelCzasu(String var1) {
        this.stempelCzasu = var1;
    }

    public String getNIP1() {
        return this.nip1;
    }

    public void setNIP1(String var1) {
        this.nip1 = var1;
    }

    public String getPESEL1() {
        return this.pesel1;
    }

    public void setPESEL1(String var1) {
        this.pesel1 = var1;
    }

    public String getNumerIdentyfikacyjny() {
        return this.numerIdentyfikacyjny;
    }

    public void setNumerIdentyfikacyjny(String var1) {
        this.numerIdentyfikacyjny = var1;
    }

    public String getNIP2() {
        return this.nip2;
    }

    public void setNIP2(String var1) {
        this.nip2 = var1;
    }

    public String getPESEL2() {
        return this.pesel2;
    }

    public void setPESEL2(String var1) {
        this.pesel2 = var1;
    }

    public String getKodUrzedu() {
        return this.kodUrzedu;
    }

    public void setKodUrzedu(String var1) {
        this.kodUrzedu = var1;
    }

    public String getKodFormularza() {
        return this.kodFormularza;
    }

    public void setKodFormularza(String var1) {
        this.kodFormularza = var1;
    }

    public boolean isPrzyjeto() {
        return this.przyjeto;
    }

    public void setPrzyjeto(boolean var1) {
        this.przyjeto = var1;
    }

    public List<String> getBlad() {
        if (this.blad == null) {
            this.blad = new ArrayList();
        }

        return this.blad;
    }

    public String getWersjaSchemy() {
        return this.wersjaSchemy;
    }

    public void setWersjaSchemy(String var1) {
        this.wersjaSchemy = var1;
    }

    public String toString() {
        return "Potwierdzenie [nazwaPodmiotuPrzyjmujacego=" + this.nazwaPodmiotuPrzyjmujacego + ", numerReferencyjny=" + this.numerReferencyjny + ", skrotDokumentu=" + this.skrotDokumentu + ", skrotZlozonejStruktury=" + this.skrotZlozonejStruktury + ", nazwaStrukturyLogicznej=" + this.nazwaStrukturyLogicznej + ", dataWplyniecia=" + this.dataWplyniecia + ", stempelCzasu=" + this.stempelCzasu + ", nip1=" + this.nip1 + ", pesel1=" + this.pesel1 + ", numerIdentyfikacyjny=" + this.numerIdentyfikacyjny + ", nip2=" + this.nip2 + ", pesel2=" + this.pesel2 + ", kodUrzedu=" + this.kodUrzedu + ", kodFormularza=" + this.kodFormularza + ", przyjeto=" + this.przyjeto + ", blad=" + this.blad + ", wersjaSchemy=" + this.wersjaSchemy + "]";
    }
}
