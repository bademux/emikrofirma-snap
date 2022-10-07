package a.a.a.c.c.d;

public enum EOS {
   CASH_REGISTER_LIST("CASH_REGISTER_LIST", "cash_register_list.fxml"),
   CASH_REGISTER_NEW("CASH_REGISTER_NEW", "cash_register_new.fxml"),
   CONFIG("CONFIG", "configuration.fxml"),
   CONTACTS_LIST("CONTACTS_LIST", "contacts.fxml"),
   INVOICE_PURCHASE_LIST("INVOICE_PURCHASE_LIST", "invoice_purchase_list.fxml"),
   INVOICE_PURCHASE_NEW("INVOICE_PURCHASE_NEW", "invoicePurchaseNew.fxml"),
   AGGREGATE_PURCHASE_NEW("AGGREGATE_PURCHASE_NEW", "aggregatePurchaseNew.fxml"),
   INVOICE_SALE_LIST("INVOICE_SALE_LIST", "invoice_sale_list.fxml"),
   INVOICE_SALE_NEW("INVOICE_SALE_NEW", "invoice_sale_new.fxml"),
   SALE_NEW("SALE_NEW", "sale_new.fxml"),
   OTHER_SALE_LIST("OTHER_SALE_LIST", "invoice_other_sale_list.fxml"),
   OTHER_PURCHASE_NEW("OTHER_PURCHASE_NEW", "invoice_other_purchase_new.fxml"),
   OTHER_PURCHASE_LIST("OTHER_PURCHASE_LIST", "invoice_other_purchase_list.fxml"),
   INVOICES_RECORDS("INVOICES_RECORDS", "invoices_records.fxml"),
   INVOICES_SETTLEMENTS("INVOICES_SETTLEMENTS", "invoices_settlements.fxml"),
   USER("USER", "user.fxml"),
   DECLARATION_LIST("DECLARATION_LIST", "declaration_list.fxml"),
   INFO_PROGRAM("INFO_PROGRAM", "infoProgram.fxml");

   private final String FNV;
   private final String FNW;

   private EOS(String var3, String var4) {
      this.FNV = var3;
      this.FNW = var4;
   }

   public String getProcessName() {
      return this.FNV;
   }

   public String getProcessFxmlFileName() {
      return this.FNW;
   }
}
