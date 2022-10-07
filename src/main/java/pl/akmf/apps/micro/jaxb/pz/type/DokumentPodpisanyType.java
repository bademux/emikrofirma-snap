package pl.akmf.apps.micro.jaxb.pz.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
   name = "DokumentPodpisanyType",
   propOrder = {"podpisanaZawartosc"}
)
public class DokumentPodpisanyType extends DokumentWynikType {
   @XmlElement(
      required = true
   )
   protected byte[] podpisanaZawartosc;

   public DokumentPodpisanyType() {
   }

   public byte[] getPodpisanaZawartosc() {
      return this.podpisanaZawartosc;
   }

   public void setPodpisanaZawartosc(byte[] var1) {
      this.podpisanaZawartosc = var1;
   }
}
