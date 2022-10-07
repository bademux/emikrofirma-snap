package a.a.a.c.f.a.e;

import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.b.c.JR;
import a.a.a.c.f.b.c.JS;
import a.a.a.c.f.b.c.JV;
import a.a.a.c.f.b.c.KO;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(
   name = "invoiceSellCorrection"
)
@XmlAccessorType(XmlAccessType.FIELD)
public class HV extends HW {
   private KO AKR;
   private JV AKS;
   private JR AKT;
   private JR AKU;
   private JR AKV;

   public HV() {
      EXF.getInstance().ICO();
      EXF.getInstance().ICP();
   }

   public KO getCorrectionReason() {
      return this.AKR;
   }

   public void setCorrectionReason(KO var1) {
      this.AKR = var1;
   }

   public KO DBX() {
      if (this.AKR == null) {
         this.AKR = new KO();
      }

      return this.AKR;
   }

   public JV getReceiveDate() {
      return this.AKS;
   }

   public JV DBY() {
      if (this.AKS == null) {
         this.AKS = new JV();
      }

      return this.AKS;
   }

   public JR getDifferenceAmountSummaryWithTax() {
      return this.AKT;
   }

   public JR DBZ() {
      if (this.AKT == null) {
         this.AKT = new JR();
      }

      return this.AKT;
   }

   public void setDifferenceAmountSummaryWithTax(JR var1) {
      this.AKT = var1;
   }

   public JR getDifferenceAmountSummaryWithoutTax() {
      return this.AKU;
   }

   public JR DCA() {
      if (this.AKU == null) {
         this.AKU = new JR();
      }

      return this.AKU;
   }

   public void setDifferenceAmountSummaryWithoutTax(JR var1) {
      this.AKU = var1;
   }

   public JR getDifferenceAmountTax() {
      return this.AKV;
   }

   public JR DCB() {
      if (this.AKV == null) {
         this.AKV = new JR();
      }

      return this.AKV;
   }

   public void setDifferenceAmountTax(JR var1) {
      this.AKV = var1;
   }

   public JV getInvoicingDate() {
      if (this.getUsingInvoicingDate() != null && this.getUsingInvoicingDate().getValue() != null && (Boolean)this.getUsingInvoicingDate().getValue()) {
         return this.IVO;
      } else {
         if (((BigDecimal)this.AKT.getValue()).compareTo(BigDecimal.ZERO) >= 0) {
            this.IVO = this.getCreationDate().DEF();
         } else {
            this.IVO = this.AKS.DEF();
         }

         this.setUsingInvoicingDate(new JS(true));
         return this.IVO;
      }
   }
}
