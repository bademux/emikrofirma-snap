package a.a.a.c.f.a.n;

import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.c.HI;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(
   name = "invoiceSell"
)
@XmlAccessorType(XmlAccessType.FIELD)
public class QSN extends QSO {
   private HI QYH;

   public QSN() {
      EXF.getInstance().ICO();
      EXF.getInstance().ICP();
   }

   public HI getContractor() {
      return this.QYH;
   }

   public void setContractor(HI var1) {
      this.QYH = var1;
   }

   public HI RJS() {
      if (this.QYH == null) {
         this.QYH = new HI();
      }

      return this.QYH;
   }

   public String toString() {
      return "InvoiceOtherSell [contractor=" + this.QYH + "] " + super.toString() + "";
   }
}
