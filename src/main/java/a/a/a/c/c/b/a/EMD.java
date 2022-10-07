package a.a.a.c.c.b.a;

import a.a.a.c.c.b.EMC;
import a.a.a.c.e.a.k.a.EXF;
import java.util.ResourceBundle;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.stage.Stage;

public abstract class EMD implements EMG {
   private final EMC FGU;
   private final String FGV;
   protected Stage FGW;
   @FXML
   protected ResourceBundle resources;

   public EMD(EMC var1, String var2) {
      EXF.getInstance().ICO();

      try {
         this.FGU = var1;
         this.FGV = var2;
      } finally {
         EXF.getInstance().ICP();
      }

   }

   protected EMC getApplication() {
      return this.FGU;
   }

   protected String getFxmlName() {
      return this.FGV;
   }

   public void setPrimaryStage(Stage var1) {
      EXF.getInstance().ICO();

      try {
         this.FGW = var1;
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public Stage getPrimaryStage() {
      EXF.getInstance().ICO();

      Stage var1;
      try {
         var1 = this.FGW;
      } finally {
         EXF.getInstance().ICP();
      }

      return var1;
   }

   protected String getVersionFromPackage(Package var1) {
      EXF.getInstance().ICO();

      String var3;
      try {
         String var2 = "";
         if (var1 != null) {
            if (var1.getSpecificationTitle() != null) {
               var2 = var1.getSpecificationTitle();
            }

            if (var1.getImplementationVersion() != null) {
               if (var2.length() > 0) {
                  var2 = var2 + " - ";
               }

               var2 = var2 + var1.getImplementationVersion();
            }
         }

         var3 = var2;
      } finally {
         EXF.getInstance().ICP();
      }

      return var3;
   }

   protected void HHD(StringProperty var1, StringProperty var2) {
      var1.unbindBidirectional(var2);
      var1.set("");
   }

   protected void HHD(ObjectProperty<String> var1, ObjectProperty<String> var2) {
      var1.unbindBidirectional(var2);
      var1.set("");
   }

   protected void HHD(ObjectProperty<String> var1, StringProperty var2) {
      var1.unbindBidirectional(var2);
      var1.set("");
   }

   protected void HHD(StringProperty var1, ObjectProperty<String> var2) {
      var1.unbindBidirectional(var2);
      var1.set("");
   }
}
