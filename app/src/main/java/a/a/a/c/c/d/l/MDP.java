package a.a.a.c.c.d.l;

import a.a.a.b.c.FEL;
import a.a.a.b.c.FEM;
import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.c.d.k.a.a.MDG;
import a.a.a.c.d.b.EQK;
import a.a.a.c.e.a.d.MME;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.URISyntaxException;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class MDP extends EQK {
    private final String MWI = "kdDialog.fxml";

    public MDP(ResourceBundle var1, TextArea var2, VBox var3, String var4) throws FFK {
        super(var1, var2, var3, var4);
    }

    protected MME<Boolean, String, String, String, LocalDate, BigDecimal, String> getSignatureValuesForKD() throws FFO, FFK {

        MME var1;
        try {
            var1 = this.getKDDataDialog();
        } catch (URISyntaxException var5) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var5);
            throw new FFK(var5);
        }

        return var1;
    }

    private MME<Boolean, String, String, String, LocalDate, BigDecimal, String> getKDDataDialog() throws URISyntaxException {

        MME var1;
        var1 = FEL.IKS(new FEM<MME<Boolean, String, String, String, LocalDate, BigDecimal, String>>() {
            public MME<Boolean, String, String, String, LocalDate, BigDecimal, String> IKT() {

                MME var8;
                AnchorPane var2;
                try {
                    FXMLLoader var1 = new FXMLLoader();
                    var1.setLocation(MDP.class.getResource("/fxml/kdDialog.fxml"));
                    var1.setResources(MDP.this.MWM);
                    var2 = var1.load();
                    Stage var3 = new Stage();
                    var3.setTitle(MDP.this.MWM.getString("micro.jpk.sendout.signature.method.kd.dialog.title"));
                    var3.initModality(Modality.APPLICATION_MODAL);
                    var3.setResizable(false);
                    var3.getIcons().add(new Image("/img/app/e_logo.png"));
                    Scene var4 = new Scene(var2);
                    var3.setScene(var4);
                    MDG var5 = var1.getController();
                    var5.setDialogStage(var3);
                    var5.setupDefaults();
                    var3.showAndWait();
                    if (!var5.getResult()) {
                        Object var14 = null;
                        return (MME) var14;
                    }

                    boolean var6 = var5.fxml_include_nipOrPeselController.fxml_component_main_element.isSelected();
                    String var7 = null;
                    if (var6) {
                        var7 = var5.fxml_include_peselController.fxml_component_main_element.getText();
                    } else {
                        var7 = var5.fxml_include_nipController.fxml_component_main_element.getText();
                    }

                    var8 = new MME(var6, var7, var5.fxml_include_firstNameController.fxml_component_main_element.getText(), var5.fxml_include_lastNameController.fxml_component_main_element.getText(), var5.fxml_include_birthDateController.fxml_component_main_element.getValue(), var5.fxml_include_taxAmountController.fxml_component_main_element.getNumber(), var5.fxml_include_emailController.fxml_component_main_element.getText());
                } catch (IOException var12) {
                    org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var12);
                    return null;
                }

                return var8;
            }
        });

        return var1;
    }
}
