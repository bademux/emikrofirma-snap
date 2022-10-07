package a.a.a.c.c.d.g;

import a.a.a.b.f.FFK;
import a.a.a.c.b.EDF;
import a.a.a.c.f.a.e.HN;
import a.a.a.c.f.b.b.JN;
import a.a.a.c.f.b.c.a.QSW;
import java.math.BigDecimal;
import java.util.Date;

public class EPA<_T extends HN<?>> {
   private EDF<_T> FOV;
   private _T FOW;
   private final int FOX;
   private BigDecimal FOY;
   private BigDecimal FOZ;
   private BigDecimal FPA;
   private Date FPB;
   private String FPC;
   private String FPD;
   private String FPE;
   private String FPF;
   private QSW RFH;
   private String RFI;

   public EPA(EDF<_T> var1, int var2) {
      this.FOV = var1;
      this.FOX = var2;
   }

   public EDF<_T> getInvoiceWrapper() {
      return this.FOV;
   }

   public _T getRealInvoice() throws FFK {
      if (this.FOW == null) {
         this.FOW = (_T) this.FOV.getModelBaseElementWithIdObject();
      }

      return this.FOW;
   }

   public Date getInvoicingDate() {
      if (this.FPB == null) {
         this.FPB = (Date)this.FOV.getValue("business_invoicingDate");
      }

      return this.FPB;
   }

   public String getRefId() {
      if (this.FPC == null) {
         this.FPC = (String)this.FOV.getValue("business_refid");
      }

      return this.FPC;
   }

   public String getContractorName() {
      if (this.FPD == null) {
         this.FPD = (String)this.FOV.getValue("business_contractorName");
      }

      return this.FPD;
   }

   public String getContractorNip() {
      if (this.FPE == null) {
         this.FPE = (String)this.FOV.getValue("business_contractorNIP");
      }

      return this.FPE;
   }

   public BigDecimal getSumNet() {
      if (this.FOY == null) {
         this.FOY = (BigDecimal)this.FOV.getValue("business_netValue");
      }

      return this.FOY;
   }

   public BigDecimal getSumTax() {
      if (this.FOZ == null) {
         this.FOZ = (BigDecimal)this.FOV.getValue("business_taxValue");
      }

      return this.FOZ;
   }

   public BigDecimal getSumBrut() {
      if (this.FPA == null) {
         this.FPA = (BigDecimal)this.FOV.getValue("business_grossValue");
      }

      return this.FPA;
   }

   public QSW getState() {
      if (this.RFH == null) {
         this.RFH = (QSW)this.FOV.getValue("business_state");
      }

      return this.RFH;
   }

   public JN getPeriod() {
      return this.FOV.getPeriod();
   }

   public int getNr() {
      return this.FOX;
   }

   public String getParentRefId() {
      if (this.FPF == null) {
         EDF var1;
         for(var1 = this.FOV; var1.getParentWrapperWithCanceledState() != null; var1 = (EDF)var1.getParentWrapperWithCanceledState()) {
         }

         if (var1 != this.FOV) {
            this.FPF = (String)var1.getValue("business_refid");
         }

         if (this.FPF == null) {
            this.FPF = "";
         }
      }

      return this.FPF;
   }

   public String getSubType() {
      if (this.RFI == null) {
         this.RFI = (String)this.FOV.getValue("technical_subType");
      }

      return this.RFI;
   }
}
