package a.a.a.c.c.d.n;

import a.a.a.b.f.FFK;
import a.a.a.c.b.EDF;
import a.a.a.c.f.a.n.QSG;
import a.a.a.c.f.a.n.QSQ;
import a.a.a.c.f.b.b.JN;
import a.a.a.c.f.b.c.a.QSW;
import java.math.BigDecimal;
import java.util.Date;

public class QVB<_T extends QSG<?>> {
   private EDF<_T> RFJ;
   private _T RFK;
   private final int RFL;
   private BigDecimal RFM;
   private BigDecimal RFN;
   private BigDecimal RFO;
   private Date RFP;
   private String RFQ;
   private String RFR;
   private String RFS;
   private String RFT;
   private QSW RFU;
   private QSQ RFV;

   public QVB(EDF<_T> var1, int var2) {
      this.RFJ = var1;
      this.RFL = var2;
   }

   public EDF<_T> getInvoiceWrapper() {
      return this.RFJ;
   }

   public _T getRealInvoice() throws FFK {
      if (this.RFK == null) {
         this.RFK = (_T) this.RFJ.getModelBaseElementWithIdObject();
      }

      return this.RFK;
   }

   public Date getInvoicingDate() {
      if (this.RFP == null) {
         this.RFP = (Date)this.RFJ.getValue("business_invoicingDate");
      }

      return this.RFP;
   }

   public String getRefId() {
      if (this.RFQ == null) {
         this.RFQ = (String)this.RFJ.getValue("business_refid");
      }

      return this.RFQ;
   }

   public String getContractorName() {
      if (this.RFR == null) {
         this.RFR = (String)this.RFJ.getValue("business_contractorName");
      }

      return this.RFR;
   }

   public String getContractorNip() {
      if (this.RFS == null) {
         this.RFS = (String)this.RFJ.getValue("business_contractorNIP");
      }

      return this.RFS;
   }

   public BigDecimal getSumNet() {
      if (this.RFM == null) {
         this.RFM = (BigDecimal)this.RFJ.getValue("business_netValue");
      }

      return this.RFM;
   }

   public BigDecimal getSumTax() {
      if (this.RFN == null) {
         this.RFN = (BigDecimal)this.RFJ.getValue("business_taxValue");
      }

      return this.RFN;
   }

   public BigDecimal getSumBrut() {
      if (this.RFO == null) {
         this.RFO = (BigDecimal)this.RFJ.getValue("business_grossValue");
      }

      return this.RFO;
   }

   public QSW getState() {
      if (this.RFU == null) {
         this.RFU = this.RFJ.getState();
      }

      return this.RFU;
   }

   public QSQ getInvoiceOtherSubType() {
      if (this.RFV == null) {
         this.RFV = (QSQ)this.RFJ.getEnumValue(QSQ.class, "technical_subType");
      }

      return this.RFV;
   }

   public JN getPeriod() {
      return this.RFJ.getPeriod();
   }

   public int getNr() {
      return this.RFL;
   }

   public String getParentRefId() {
      if (this.RFT == null) {
         EDF var1;
         for(var1 = this.RFJ; var1.getParentWrapperWithCanceledState() != null; var1 = (EDF)var1.getParentWrapperWithCanceledState()) {
         }

         if (var1 != this.RFJ) {
            this.RFT = (String)var1.getValue("business_refid");
         }

         if (this.RFT == null) {
            this.RFT = "";
         }
      }

      return this.RFT;
   }
}
