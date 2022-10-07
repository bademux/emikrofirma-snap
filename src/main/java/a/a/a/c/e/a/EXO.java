package a.a.a.c.e.a;

import a.a.a.c.e.c.EXN;

public enum EXO {
   MicroProcessEngine("micro.launcher.library.specificationTitle.MicroProcessEngine", "MicroProcessEngine", 1),
   MicroProcessCommon("micro.launcher.library.specificationTitle.MicroProcessCommon", "MicroProcessCommon", 1),
   MicroResources("micro.launcher.library.specificationTitle.MicroResources", "MicroResources", 1),
   MicroLogic("micro.launcher.library.specificationTitle.MicroLogic", "MicroLogic", 1),
   MicroCustomFXML("micro.launcher.library.specificationTitle.MicroCustomFXML", "MicroCustomFXML", 1),
   MicroModel("micro.launcher.library.specificationTitle.MicroModel", "MicroModel", 1),
   MicroCommon("micro.launcher.library.specificationTitle.MicroCommon", "MicroCommon", 1),
   CONFIG("micro.launcher.library.specificationTitle.CONFIG", "CONFIG", 1),
   USER("micro.launcher.library.specificationTitle.USER", "USER", 1),
   SALE_NEW("micro.launcher.library.specificationTitle.SALE_NEW", "SALE_NEW", 1),
   OTHER_SALE_LIST("micro.launcher.library.specificationTitle.OTHER_SALE_LIST", "OTHER_SALE_LIST", 1),
   OTHER_PURCHASE_NEW("micro.launcher.library.specificationTitle.OTHER_PURCHASE_NEW", "OTHER_PURCHASE_NEW", 1),
   OTHER_PURCHASE_LIST("micro.launcher.library.specificationTitle.OTHER_PURCHASE_LIST", "OTHER_PURCHASE_LIST", 1),
   INVOICE_SALE_NEW("micro.launcher.library.specificationTitle.INVOICE_SALE_NEW", "INVOICE_SALE_NEW", 1),
   INVOICE_SALE_LIST("micro.launcher.library.specificationTitle.INVOICE_SALE_LIST", "INVOICE_SALE_LIST", 1),
   INVOICE_PURCHASE_NEW("micro.launcher.library.specificationTitle.INVOICE_PURCHASE_NEW", "INVOICE_PURCHASE_NEW", 1),
   AGGREGATE_PURCHASE_NEW("micro.launcher.library.specificationTitle.AGGREGATE_PURCHASE_NEW", "AGGREGATE_PURCHASE_NEW", 1),
   INVOICE_PURCHASE_LIST("micro.launcher.library.specificationTitle.INVOICE_PURCHASE_LIST", "INVOICE_PURCHASE_LIST", 1),
   INVOICES_RECORDS("micro.launcher.library.specificationTitle.INVOICES_RECORDS", "INVOICES_RECORDS", 1),
   INVOICES_SETTLEMENTS("micro.launcher.library.specificationTitle.INVOICES_SETTLEMENTS", "INVOICES_SETTLEMENTS", 1),
   DECLARATION_LIST("micro.launcher.library.specificationTitle.DECLARATION_LIST", "DECLARATION_LIST", 1),
   CASH_REGISTER_LIST("micro.launcher.library.specificationTitle.CASH_REGISTER_LIST", "CASH_REGISTER_LIST", 1),
   CASH_REGISTER_NEW("micro.launcher.library.specificationTitle.CASH_REGISTER_NEW", "CASH_REGISTER_NEW", 1),
   CONTACTS_LIST("micro.launcher.library.specificationTitle.CONTACTS_LIST", "CONTACTS_LIST", 1),
   INFO_PROGRAM("micro.launcher.library.specificationTitle.INFO_PROGRAM", "INFO_PROGRAM", 1);

   private final String GUS;
   private final String GUT;
   private final Integer GUU;

   private EXO(String var3, String var4, Integer var5) {
      this.GUS = EXN.getInstance().getMessageForKey(var3);
      this.GUT = var4;
      this.GUU = var5;
   }

   public String getSpecTitle() {
      return this.GUS;
   }

   public String getImplTitle() {
      return this.GUT;
   }

   public Integer getLibParts() {
      return this.GUU;
   }

   public static EXO getLibraryByImplTitle(String var0) {
      EXO[] var1 = values();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         EXO var4 = var1[var3];
         if (var4.getImplTitle().equalsIgnoreCase(var0)) {
            return var4;
         }
      }

      return null;
   }
}
