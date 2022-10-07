package a.a.a.c.c.d.g;

public enum EPB {
   NEW(false, true),
   EDIT(false, true),
   EDIT_CORRECTION(true, true),
   CORRECT(true, true),
   VIEW(false, false),
   VIEW_CORRECTION(true, false);

   private boolean FPG;
   private boolean FPH;

   private EPB(boolean var3, boolean var4) {
      this.FPG = var3;
      this.FPH = var4;
   }

   public boolean getCorrectFields() {
      return this.FPG;
   }

   public boolean getFieldsEditable() {
      return this.FPH;
   }
}
