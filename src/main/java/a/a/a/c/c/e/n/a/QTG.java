package a.a.a.c.c.e.n.a;

import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.c.a.a.ELU;
import a.a.a.c.c.b.EMC;
import a.a.a.c.c.b.a.b.a.EMP;
import a.a.a.c.c.b.a.b.a.EMR;
import a.a.a.c.c.b.b.EMT;
import a.a.a.c.c.e.n.c.QTI;
import a.a.a.c.e.a.k.a.EXF;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ScrollPane;

public class QTG extends ELU<QTI> {
   @FXML
   private ScrollPane fxml_include_container;
   @FXML
   public QTF fxml_include_infoProgramLogicController;
   @FXML
   private EMP fxml_include_left_barController;
   @FXML
   private EMR fxml_include_top_menuController;

   public QTG(EMC var1, EMT var2, String var3, String var4) {
      super(var1, var2, var3, var4);
   }

   public void HHE() throws FFK {
      EXF.getInstance().ICO();

      try {
         super.HHE();
      } catch (FFK var5) {
         EXF.getInstance().ICA((Throwable)var5);
         throw new FFI(var5);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public boolean HHB() {
      boolean var1 = true;
      if (var1) {
         this.fxml_include_infoProgramLogicController.HHB();
         this.fxml_include_left_barController.HHB();
         this.fxml_include_top_menuController.HHB();
         return true;
      } else {
         return false;
      }
   }

   public void HHC() {
      this.fxml_include_container.setVvalue(0.0);

      try {
         QTI var1 = (QTI)this.HHG();
         this.fxml_include_infoProgramLogicController.HHC();
         this.fxml_include_left_barController.HHC();
         this.fxml_include_top_menuController.HHC();
         this.fxml_parent.requestFocus();
      } catch (FFO | FFK var2) {
         var2.printStackTrace();
      }

   }

   public void initialize() {
      EXF.getInstance().ICO();

      try {
         this.fxml_include_top_menuController.fxml_top_menu.labelProperty().set(this.resources.getString("micro.infoProgram.label"));
      } finally {
         EXF.getInstance().ICP();
      }

   }

   @FXML
   public void fxml_handleButton_generalButtonCancel(ActionEvent var1) throws Exception {
      EXF.getInstance().ICO();

      try {
         EXF.getInstance().ICE("Button [close] clicked");
         QTI var2 = (QTI)this.getProcess();
         var2.resetAndCleanUpProcess();
         this.getApplication().HJD(this.getFxmlName(), "main.fxml");
      } finally {
         EXF.getInstance().ICP();
      }

   }
}
