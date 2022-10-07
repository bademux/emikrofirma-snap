package pl.akmf.apps.micro.jaxb.pz.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
   name = "DokumentType",
   propOrder = {"idDokumentu"}
)
@XmlSeeAlso({DokumentZadanieType.class, DokumentWynikType.class})
public class DokumentType {
   protected long idDokumentu;

   public DokumentType() {
   }

   public long getIdDokumentu() {
      return this.idDokumentu;
   }

   public void setIdDokumentu(long var1) {
      this.idDokumentu = var1;
   }
}
