package a.a.a.c.f.a.a;

import a.a.a.c.e.a.c.EVW;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.EYK;
import a.a.a.c.f.c.a.RequiredGridPane;
import a.a.a.c.f.c.c.PathFieldRequired;
import a.a.a.c.g.a.FCR;
import a.a.a.c.g.c.FCZ;
import java.io.File;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.FileChooser;
import sun.security.pkcs11.wrapper.CK_C_INITIALIZE_ARGS;
import sun.security.pkcs11.wrapper.CK_INFO;
import sun.security.pkcs11.wrapper.PKCS11;
import sun.security.pkcs11.wrapper.PKCS11Exception;

public class EZR extends EYK<RequiredGridPane, PathFieldRequired> {
   @FXML
   public Button fxml_field_box_required_button_open;
   @FXML
   public Button fxml_field_box_required_button_clear;

   public EZR() {
      this((String)null);
   }

   public EZR(String var1) {
      super(var1);
   }

   public void initialize() {
      super.initialize();
      ((PathFieldRequired)this.fxml_component_main_element).editableProperty().set(false);
   }

   @FXML
   protected void fxml_handleButton_open_button(ActionEvent var1) {
      EXF.getInstance().ICO();

      try {
         EXF.getInstance().ICE("Button [select pkcs11 library] clicked");
         FileChooser var2 = new FileChooser();
         var2.setTitle(this.resources.getString("micro.config.pkcs11LibraryFile.dialog.pkcs11fileselect.fileselect"));
         FileChooser.ExtensionFilter var3 = new FileChooser.ExtensionFilter(this.resources.getString("micro.config.pkcs11LibraryFile.dialog.pkcs11fileselect.filetype") + " (*.dll, *.so)", new String[]{"*.dll", "*.so"});
         FileChooser.ExtensionFilter var4 = new FileChooser.ExtensionFilter(this.resources.getString("micro.dialog.filetypeselect.all"), new String[]{"*.*"});
         var2.getExtensionFilters().add(var3);
         var2.getExtensionFilters().add(var4);
         File var5 = null;
         if (EVW.getOS() == EVW.EVX.Unix) {
            var5 = new File("/usr/lib/");
         } else if (EVW.getOS() == EVW.EVX.Windows) {
            if (EVW.getARCH() == EVW.EVY.x86) {
               var5 = new File("C:/Program Files (x86)/");
            } else if (EVW.getARCH() == EVW.EVY.x64) {
               var5 = new File("C:/Program Files/");
            }
         }

         if (var5 != null && var5.exists() && var5.isDirectory()) {
            var2.setInitialDirectory(var5);
         }

         File var6 = var2.showOpenDialog(this.getStageToHandle());
         if (var6 != null) {
            String var7 = var6.getAbsolutePath();

            try {
               PKCS11 var8 = PKCS11.getInstance(var7, "C_GetFunctionList", (CK_C_INITIALIZE_ARGS)null, false);
               EXF.getInstance().ICK("pkcs11 " + var8);
               CK_INFO var9 = var8.C_GetInfo();
               EXF.getInstance().ICK("ck_info " + var9);
               FCR.IGF(this.resources.getString("micro.dialog.message.title"), this.resources.getString("micro.config.property.pkcs11LibraryFile"), var9.toString(), false, 300.0, 150.0);
            } catch (PKCS11Exception | NullPointerException | IOException var14) {
               EXF.getInstance().ICA((Throwable)var14);
               throw FCZ.getInstance().IHU();
            }

            ((PathFieldRequired)this.fxml_component_main_element).setText(var6.getAbsolutePath());
         }
      } catch (Exception var15) {
         EXF.getInstance().ICA((Throwable)var15);
         FCR.IGO("", var15, false);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   @FXML
   protected void fxml_handleButton_clear_button(ActionEvent var1) {
      EXF.getInstance().ICO();

      try {
         ((PathFieldRequired)this.fxml_component_main_element).setText((String)null);
      } finally {
         EXF.getInstance().ICP();
      }

   }
}
