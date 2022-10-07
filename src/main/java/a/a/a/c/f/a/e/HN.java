package a.a.a.c.f.a.e;

import a.a.a.c.e.a.d.EVZ;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.IK;
import a.a.a.c.f.b.c.JR;
import a.a.a.c.f.b.c.JS;
import a.a.a.c.f.b.c.JV;
import a.a.a.c.f.b.c.JY;
import a.a.a.c.f.b.c.KA;
import a.a.a.c.f.b.c.KB;
import a.a.a.c.f.b.c.KE;
import a.a.a.c.f.b.c.KO;
import a.a.a.c.f.b.c.QSU;
import a.a.a.c.f.b.c.a.KL;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlTransient;

@XmlTransient
public abstract class HN<_T extends HO> extends IK {
   private IB AJF;
   private IA AJG;
   private KA AJH;
   private KE AJI;
   private JV AJJ;
   private JV AJK;
   private List<EVZ<KL, BigDecimal>> AJL;
   private List<EVZ<KL, BigDecimal>> AJM;
   private List<EVZ<KL, BigDecimal>> AJN;
   private JR AJO;
   private JR AJP;
   private JR AJQ;
   private KB AJR;
   private JV AJS;
   private JS AJT;
   private JS QLQ;
   private KO AJU;
   private KO QLR;
   private QSU QWN;
   @XmlElements({@XmlElement(
   name = "invoiceElementSell",
   type = HQ.class
), @XmlElement(
   name = "invoiceElementPurchase",
   type = HP.class
)})
   private List<_T> AJV;
   private JY AJW;

   protected HN(IB var1, IA var2) {
      EXF.getInstance().ICO();

      try {
         this.AJF = var1;
         this.AJG = var2;
         this.AJL = new ArrayList();
         this.AJM = new ArrayList();
         this.AJN = new ArrayList();
         this.AJV = new ArrayList();
      } finally {
         EXF.getInstance().ICP();
      }

   }

   protected HN() {
      this((IB)null, (IA)null);
      EXF.getInstance().ICQ();
   }

   public IB getInvoiceType() {
      return this.AJF;
   }

   public IA getInvoiceSubType() {
      return this.AJG;
   }

   public KA getIssuerNumber() {
      return this.AJH;
   }

   public KA DAR() {
      if (this.AJH == null) {
         this.AJH = new KA();
      }

      return this.AJH;
   }

   public void setIssuerNumber(KA var1) {
      this.AJH = var1;
   }

   public KE getRefId() {
      return this.AJI;
   }

   public KE DAS() {
      if (this.AJI == null) {
         this.AJI = new KE();
      }

      return this.AJI;
   }

   public void setRefId(KE var1) {
      this.AJI = var1;
   }

   public JV getCreationDate() {
      return this.AJJ;
   }

   public JV DAT() {
      if (this.AJJ == null) {
         this.AJJ = new JV();
      }

      return this.AJJ;
   }

   public void setCreationDate(JV var1) {
      this.AJJ = var1;
   }

   public JV getTransactionDate() {
      return this.AJK;
   }

   public JV DAU() {
      if (this.AJK == null) {
         this.AJK = new JV();
      }

      return this.AJK;
   }

   public void setTransactionDate(JV var1) {
      this.AJK = var1;
   }

   public List<EVZ<KL, BigDecimal>> getSumOfAmountsDividedByTaxRate() {
      return this.AJL;
   }

   public List<EVZ<KL, BigDecimal>> getAmountOfTaxDividedByTaxRate() {
      return this.AJM;
   }

   public List<EVZ<KL, BigDecimal>> getSumOfGrossAmountsDividedByTaxRate() {
      return this.AJN;
   }

   public JR getAmountSummaryWithTax() {
      return this.AJO;
   }

   public JR DAV() {
      if (this.AJO == null) {
         this.AJO = new JR();
      }

      return this.AJO;
   }

   public void setAmountSummaryWithTax(JR var1) {
      this.AJO = var1;
   }

   public JR getAmountSummaryWithoutTax() {
      return this.AJP;
   }

   public JR DAW() {
      if (this.AJP == null) {
         this.AJP = new JR();
      }

      return this.AJP;
   }

   public void setAmountSummaryWithoutTax(JR var1) {
      this.AJP = var1;
   }

   public JR getAmountTax() {
      return this.AJQ;
   }

   public JR DAX() {
      if (this.AJQ == null) {
         this.AJQ = new JR();
      }

      return this.AJQ;
   }

   public void setAmountTax(JR var1) {
      this.AJQ = var1;
   }

   public KB getPaymentMethod() {
      return this.AJR;
   }

   public KB DAY() {
      if (this.AJR == null) {
         this.AJR = new KB();
      }

      return this.AJR;
   }

   public void setPaymentMethod(KB var1) {
      this.AJR = var1;
   }

   public JV getPaymentDate() {
      return this.AJS;
   }

   public JV DAZ() {
      if (this.AJS == null) {
         this.AJS = new JV();
      }

      return this.AJS;
   }

   public void setPaymentDate(JV var1) {
      this.AJS = var1;
   }

   public JS getPayed() {
      return this.AJT;
   }

   public JS DBA() {
      if (this.AJT == null) {
         this.AJT = new JS();
      }

      return this.AJT;
   }

   public void setPayed(JS var1) {
      this.AJT = var1;
   }

   public JS getPaymentDateByDeal() {
      return this.QLQ;
   }

   public JS QOP() {
      if (this.QLQ == null) {
         this.QLQ = new JS(false);
      }

      return this.QLQ;
   }

   public void setPaymentDateByDeal(JS var1) {
      this.QLQ = var1;
   }

   public KO getRemarks() {
      return this.AJU;
   }

   public KO DBB() {
      if (this.AJU == null) {
         this.AJU = new KO();
      }

      return this.AJU;
   }

   public void setRemarks(KO var1) {
      this.AJU = var1;
   }

   public KO getExemptionReason() {
      return this.QLR;
   }

   public KO QOQ() {
      if (this.QLR == null) {
         this.QLR = new KO();
      }

      return this.QLR;
   }

   public void setExemptionReason(KO var1) {
      this.QLR = var1;
   }

   public List<_T> getInvoiceElements() {
      return this.AJV;
   }

   public void setInvoiceElements(List<_T> var1) {
      this.AJV = var1;
   }

   public JY getUserDataVersion() {
      return this.AJW;
   }

   public JY DBC() {
      if (this.AJW == null) {
         this.AJW = new JY();
      }

      return this.AJW;
   }

   public void setUserDataVersion(JY var1) {
      this.AJW = var1;
   }

   public HN<?> getParentInvoiceOnlyActive() {
      return (HN)super.getParentOnlyActiveState();
   }

   public HN<?> getParentInvoiceWithCanceled() {
      return (HN)super.getParent();
   }

   public void setParentInvoice(HN<?> var1) {
      super.setParent(var1);
   }

   public HN<?> getChildInvoiceWithCanceled() {
      HN var1 = (HN)super.getChild();
      return var1;
   }

   public HN<?> getChildInvoiceOnlyActive() {
      HN var1 = (HN)super.getChildOnlyActiveState();
      return var1;
   }

   public EVZ<BigDecimal, BigDecimal> getNetAndTaxForTaxRate(KL var1) {
      EXF.getInstance().ICO();

      try {
         BigDecimal var2 = BigDecimal.ZERO;
         BigDecimal var3 = BigDecimal.ZERO;
         Iterator var4 = this.getSumOfAmountsDividedByTaxRate().iterator();

         EVZ var5;
         while(var4.hasNext()) {
            var5 = (EVZ)var4.next();
            if (((KL)var5.getFirstValue()).equals(var1)) {
               var2 = (BigDecimal)var5.getSecondValue();
            }
         }

         var4 = this.getAmountOfTaxDividedByTaxRate().iterator();

         while(var4.hasNext()) {
            var5 = (EVZ)var4.next();
            if (((KL)var5.getFirstValue()).equals(var1)) {
               var3 = (BigDecimal)var5.getSecondValue();
            }
         }

         EVZ var9 = new EVZ(var2, var3);
         return var9;
      } finally {
         EXF.getInstance().ICP();
      }
   }

   public QSU getLastCalculationMethod() {
      return this.QWN;
   }

   public QSU RIE() {
      if (this.QWN == null) {
         this.QWN = new QSU();
      }

      return this.QWN;
   }

   public void setLastCalculationMethod(QSU var1) {
      this.QWN = var1;
   }

   public int hashCode() {
      int var2 = super.hashCode();
      var2 = 31 * var2 + (this.AJF == null ? 0 : this.AJF.hashCode());
      var2 = 31 * var2 + (this.AJH == null ? 0 : this.AJH.hashCode());
      var2 = 31 * var2 + (this.AJI == null ? 0 : this.AJI.hashCode());
      return var2;
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!super.equals(var1)) {
         return false;
      } else if (this.getClass() != var1.getClass()) {
         return false;
      } else {
         HN var2 = (HN)var1;
         if (this.AJF != var2.AJF) {
            return false;
         } else {
            if (this.AJH == null) {
               if (var2.AJH != null) {
                  return false;
               }
            } else if (!this.AJH.equals(var2.AJH)) {
               return false;
            }

            if (this.AJI == null) {
               if (var2.AJI != null) {
                  return false;
               }
            } else if (!this.AJI.equals(var2.AJI)) {
               return false;
            }

            return true;
         }
      }
   }

   public String toString() {
      return "Invoice [issuerNumber=" + this.AJH + ", refId=" + this.AJI + "] " + super.toString();
   }
}
