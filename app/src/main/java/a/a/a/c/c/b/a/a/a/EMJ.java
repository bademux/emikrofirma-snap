package a.a.a.c.c.b.a.a.a;

import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.c.a.ProcessDefinitionBase;
import a.a.a.c.c.b.EMB;
import java.util.function.Consumer;
import a.a.a.c.c.b.a.a.BaseSceneFxController;
import a.a.a.c.c.b.a.b.a.EMR;
import a.a.a.c.c.c.ENG;
import a.a.a.c.c.c.ENH;
import a.a.a.c.c.c.QVH;
import a.a.a.c.e.a.d.ValueContainer2;
import a.a.a.c.f.c.a.ConfigurationProperties;
import a.a.a.c.f.c.b.UserData;
import a.a.a.c.g.a.FCT;
import com.github.bademux.emk.app.FXApp;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import lombok.extern.slf4j.Slf4j;

import java.util.*;

@Slf4j
public class EMJ extends BaseSceneFxController {
    public static final String FHD = "main.fxml";
    @FXML
    private AnchorPane fxml_anchor_pane_processes;
    @FXML
    private GridPane fxml_grid_pane_processes;
    @FXML
    private Text fxml_textVersions;
    @FXML
    private Label fxml_label_startMessage;
    private final Map<Integer, Map<Integer, ValueContainer2<QVH, ContextMenu>>> RHH = new HashMap();
    private final List<ValueContainer2<Boolean, Button>> FHE = new ArrayList();
    @FXML
    private EMR fxml_include_top_menuController;
    @FXML
    private Button fxml_button_logOut;

    public EMJ(FXApp fxApp, String fxmlName) {
        super(fxApp, fxmlName);
    }

    public String getTitle() throws FFK {
        return EMB.getInstance().getApplicationTitle(this.resources.getString("micro.application.title"));
    }

    public void init() throws FFK {

        super.init();
        this.fxml_textVersions.setText(this.getVersionFromPackage(EMJ.class.getPackage()));
        this.HJF();

    }

    private void HJF() throws FFK {

        Iterator var1 = ENG.getInstance().getGlobalAnchorDefinition(ENH.MAIN).entrySet().iterator();

        Map var4;
        String var7;
        String var8;
        while (var1.hasNext()) {
            Map.Entry var2 = (Map.Entry) var1.next();
            ValueContainer2 var3 = (ValueContainer2) var2.getKey();
            var4 = (Map) var2.getValue();
            int var5 = (Integer) var3.getFirstValue();
            int var6 = (Integer) var3.getSecondValue();
            var7 = (String) var4.get("title");
            var8 = (String) var4.get("class.style");
            String var9 = (String) var4.get("display.type");
            Boolean var10 = (Boolean) var4.get("lock.config");

            try {
                var7 = this.resources.getString(var7);
            } catch (Exception e) {
                log.error("Something bad happened", e);
            }

            final Button var11 = new Button(var7);
            final ContextMenu var12 = new ContextMenu();
            var12.setAutoHide(true);
            var11.setOnMouseClicked(new EventHandler<MouseEvent>() {
                public void handle(MouseEvent var1) {
                    if (MouseButton.PRIMARY.equals(var1.getButton()) && var12 != null) {
                        var12.show(var11, var1.getScreenX(), var1.getScreenY());
                    }

                }
            });
            this.FHE.add(new ValueContainer2(var10, var11));
            this.HJG(var11, var5, var6, var8);
            this.setAnchorDisplayTypeByLocation(var5, var6, new ValueContainer2(QVH.valueOf(var9), var12));
        }

        var1 = ENG.getInstance().HNI().iterator();

        while (var1.hasNext()) {
            final String var28 = (String) var1.next();
            if (var28 != null) {
                Map var29 = ENG.getInstance().getProcessDefinition(var28);
                var4 = (Map) var29.get("anchors");
                Map var30 = (Map) var4.get(ENH.MAIN);
                if (var30 != null) {
                    ProcessDefinitionBase var31 = (ProcessDefinitionBase) var29.get("definition");
                    var7 = var31.getTitle(ENH.MAIN);
                    var8 = var31.getFXML();
                    Boolean var32 = (Boolean) var29.get("lock.config");
                    String var33 = (String) var30.get("class.style");
                    String var34 = (String) var30.get("view.row");
                    String var35 = (String) var30.get("view.col");
                    String var13 = (String) var30.get("display.type");
                    QVH var14 = QVH.valueOf(var13);
                    String var15 = (String) var30.get("context.position");
                    int var16 = Integer.parseInt(var15);
                    ValueContainer2 var17 = this.getAnchorDisplayTypeByLocation(var34, var35);
                    QVH var18 = null;
                    if (var17 != null) {
                        var18 = (QVH) var17.getFirstValue();
                    }

                    if (var18 != null && !var18.equals(var14)) {
                        throw new FFI("Anchor display type conflict [" + var18 + "] [" + var14 + "]");
                    }

                    switch (var14) {
                        case BUTTON:
                            Button var36 = new Button(var7);
                            var36.setId(var7.replace(" ", "_"));
                            var36.setWrapText(true);
                            String finalVar = var8;
                            var36.setOnAction(new EventHandler<ActionEvent>() {
                                public void handle(ActionEvent var1) {
                                    log.info("Button [" + var28 + "] clicked");
                                    EMJ.this.getApplication().initController(EMJ.this.getFxmlName(), finalVar, null);
                                }
                            });
                            this.FHE.add(new ValueContainer2(var32, var36));
                            if (var34 != null && var35 != null) {
                                this.HJG(var36, var34, var35, var33);
                                if (var17 != null) {
                                    throw new FFI("Value for anchor display type [" + var14 + "] already set!");
                                }

                                var17 = new ValueContainer2(var14, null);
                                this.setAnchorDisplayTypeByLocation(var34, var35, var17);
                                break;
                            }

                            throw new FFI("Missing location for process [" + var28 + "] anchor [" + ENH.MAIN + "]");
                        case CONTEXT:
                            ContextMenu var19 = (ContextMenu) var17.getSecondValue();
                            MenuItem var20 = new MenuItem(var7);
                            var20.getStyleClass().add(var33);
                            String finalVar1 = var8;
                            var20.setOnAction(new EventHandler<ActionEvent>() {
                                public void handle(ActionEvent var1) {
                                    log.info("Menu [" + var28 + "] clicked");
                                    EMJ.this.getApplication().initController(EMJ.this.getFxmlName(), finalVar1, null);
                                }
                            });
                            if (var19.getItems().size() >= var16 + 1) {
                                var19.getItems().set(var16, var20);
                                break;
                            }

                            ArrayList var21 = new ArrayList();
                            var21.addAll(var19.getItems());
                            var19.getItems().clear();
                            int var22 = 0;

                            for (; var22 < var16; ++var22) {
                                if (var22 < var21.size()) {
                                    var19.getItems().add((MenuItem) var21.get(var22));
                                } else {
                                    var19.getItems().add(new MenuItem("DUMMY"));
                                }
                            }

                            var19.getItems().add(var20);
                            break;
                        default:
                            throw new FFI("Unknown anchor display type [" + var14 + "]");
                    }
                }
            }
        }

    }

    private ValueContainer2<QVH, ContextMenu> getAnchorDisplayTypeByLocation(String var1, String var2) {
        return this.HJH(var1) && this.HJH(var2) ? this.getAnchorDisplayTypeByLocation(Integer.parseInt(var1), Integer.parseInt(var2)) : null;
    }

    private ValueContainer2<QVH, ContextMenu> getAnchorDisplayTypeByLocation(int var1, int var2) {
        if (!this.RHH.containsKey(var2)) {
            this.RHH.put(var2, new HashMap());
        }

        return (ValueContainer2) ((Map) this.RHH.get(var2)).get(var1);
    }

    private void setAnchorDisplayTypeByLocation(String var1, String var2, ValueContainer2<QVH, ContextMenu> var3) {
        if (this.HJH(var1) && this.HJH(var2)) {
            this.setAnchorDisplayTypeByLocation(Integer.parseInt(var1), Integer.parseInt(var2), var3);
        }

    }

    private void setAnchorDisplayTypeByLocation(int var1, int var2, ValueContainer2<QVH, ContextMenu> var3) {
        if (!this.RHH.containsKey(var2)) {
            this.RHH.put(var2, new HashMap());
        }

        ((Map) this.RHH.get(var2)).put(var1, var3);
    }

    private void HJG(Node var1, String var2, String var3, String var4) {
        if (this.HJH(var2) && this.HJH(var3)) {
            this.HJG(var1, Integer.parseInt(var2), Integer.parseInt(var3), var4);
        }

    }

    private void HJG(Node var1, int var2, int var3, String var4) {
        var1.getStyleClass().add(var4);
        AnchorPane var5 = new AnchorPane();
        var5.getChildren().add(var1);
        AnchorPane.setBottomAnchor(var1, 5.0);
        AnchorPane.setLeftAnchor(var1, 0.0);
        AnchorPane.setTopAnchor(var1, 0.0);
        AnchorPane.setRightAnchor(var1, 0.0);
        this.fxml_grid_pane_processes.add(var5, var3, var2);
    }

    boolean HJH(String var1) {
        try {
            Integer.parseInt(var1);
            return true;
        } catch (NumberFormatException var3) {
            return false;
        }
    }

    public boolean HHB() {

        boolean var1;
        this.fxml_include_top_menuController.HHB();
        var1 = true;

        return var1;
    }

    public void HHC() {

        try {
            UserData var1 = EMB.getInstance().HHV();
            ConfigurationProperties var2 = EMB.getInstance().HHU();
            Iterator var3 = this.FHE.iterator();

            while (true) {
                while (var3.hasNext()) {
                    ValueContainer2 var4 = (ValueContainer2) var3.next();
                    if ((Boolean) var4.getFirstValue()) {
                        ((Button) var4.getSecondValue()).disableProperty().set(var1 == null || var2 == null);
                    } else {
                        ((Button) var4.getSecondValue()).disableProperty().set(false);
                    }
                }

                this.fxml_include_top_menuController.HHC();
                this.fxml_label_startMessage.setVisible(var1 == null || var2 == null);
                break;
            }
        } catch (Exception var8) {
            log.error("Something bad happened", var8);
            FCT.IGX("", var8);
        }

    }

    @FXML
    private void fxml_handleButton_LogOut(ActionEvent var1) throws FFO, FFK {

        this.getApplication().initController(this.getFxmlName(), "login.fxml", new Consumer<EMM>() {
            public void accept(EMM var1) {
                var1.setLogout(true);
            }
        });

    }
}
