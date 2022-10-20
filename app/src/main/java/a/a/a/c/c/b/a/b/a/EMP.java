package a.a.a.c.c.b.a.b.a;

import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.c.c.a.ProcessDefinitionBase;
import a.a.a.c.c.b.EMB;
import java.util.function.Consumer;
import a.a.a.c.c.b.a.BaseFxController;
import a.a.a.c.c.b.a.a.a.EMJ;
import a.a.a.c.c.b.a.a.a.EMM;
import a.a.a.c.c.c.ENG;
import a.a.a.c.c.c.ENH;
import a.a.a.c.c.c.QVH;
import a.a.a.c.e.a.a.EVN;
import a.a.a.c.e.a.d.*;
import a.a.a.c.f.c.a.ConfigurationProperties;
import a.a.a.c.f.c.b.SimpleUserData;
import a.a.a.c.f.c.b.UserData;
import a.a.a.c.g.b.FCW;
import com.github.bademux.emk.app.FXApp;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.geometry.Bounds;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import lombok.extern.slf4j.Slf4j;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.util.List;
import java.util.*;

@Slf4j
public class EMP extends BaseFxController {
    @FXML
    private AnchorPane fxml_left_parent;
    @FXML
    private VBox fxml_left_bar;
    @FXML
    public Label fxml_left_bar_label;
    @FXML
    public Text fxml_left_bar_text;
    @FXML
    public ImageView fxml_top_icon_1;
    @FXML
    private Hyperlink fxml_left_bar_contact;
    private ContextMenu FHX;
    private final Map<Integer, ValueContainer2<QVH, ContextMenu>> RHF = new HashMap();
    private final List<ValueContainer2<Boolean, Button>> FHY = new ArrayList();

    public EMP(FXApp var1, String var2) {
        super(var1, var2);
    }

    private void QPN() {

        this.fxml_left_bar_label.textProperty().setValue("");
        this.fxml_left_bar_text.textProperty().setValue("");

    }

    private void setUpLabels() {

        try {
            this.QPN();
            SimpleUserData var1 = EMB.getInstance().getCurrentUser();
            if (var1 != null) {
                if (var1.getLoginType() != null) {
                    this.fxml_left_bar_label.textProperty().setValue(var1.DFA().getValue().getDescription());
                }

                if (var1.getUsername() != null) {
                    this.fxml_left_bar_text.textProperty().setValue(var1.getUsername().getValue());
                }
            }
        } catch (FFK var5) {
            this.QPN();
            log.error("Something bad happened", var5);
        }

    }

    public void initialize() {

        try {
            this.setUpLabels();
            this.fxml_left_bar_contact.setOnAction(__ -> (new EVN() {
                public void HZI() {

                    try {
                        Desktop.getDesktop().browse(URI.create(FCW.getInstance().getMessageForKey("micro.infoProgram.tab.aboutProgram.links.issues")));
                    } catch (IOException e) {
                        log.error("Something bad happened", e);
                    }

                }
            }).start());
            this.HJL();
        } catch (FFK var5) {
            log.error("Something bad happened", var5);
            throw new FFI(var5);
        }

    }

    private void HJL() throws FFK {

        this.FHX = new ContextMenu();
        ImageView var1 = this.fxml_top_icon_1;
        var1.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent var1) {
                if (MouseButton.PRIMARY.equals(var1.getButton())) {
                    EMP.this.FHX.show(EMP.this.fxml_left_parent, var1.getScreenX(), var1.getScreenY());
                }

            }
        });
        this.FHX.setAutoHide(true);
        HashMap var2 = new HashMap();
        Set var3 = ENG.getInstance().HNI();
        TreeSet var4 = new TreeSet(new Comparator<ValueContainer1<Integer>>() {
            public int compare(ValueContainer1<Integer> var1, ValueContainer1<Integer> var2) {
                return var1.getFirstValue().compareTo(var2.getFirstValue());
            }
        });
        TreeSet var5 = new TreeSet(new Comparator<ValueContainer1<Integer>>() {
            public int compare(ValueContainer1<Integer> var1, ValueContainer1<Integer> var2) {
                return var1.getFirstValue().compareTo(var2.getFirstValue());
            }
        });
        this.HJM(this.FHX, this.resources.getString("micro.leftBar.button.LogOut"), "btn-menuitem", EMM.class.getSimpleName(), "login.fxml", new Consumer<EMM>() {
            public void accept(EMM var1) {
                var1.setLogout(true);
            }
        });
        this.HJO(this.fxml_left_bar.getChildren(), this.resources.getString("micro.leftBar.button.MainMenu"), "btn-navigation", EMJ.class.getSimpleName(), "main.fxml", false);
        Iterator var6 = ENG.getInstance().getGlobalAnchorDefinition(ENH.LEFT_BAR).entrySet().iterator();

        Map var9;
        String var11;
        String var12;
        String var13;
        Boolean var14;
        while (var6.hasNext()) {
            Map.Entry var7 = (Map.Entry) var6.next();
            ValueContainer1 var8 = (ValueContainer1) var7.getKey();
            var9 = (Map) var7.getValue();
            int var10 = (Integer) var8.getFirstValue();
            var11 = (String) var9.get("title");
            var12 = (String) var9.get("class.style");
            var13 = (String) var9.get("display.type");
            var14 = (Boolean) var9.get("lock.config");

            try {
                var11 = this.resources.getString(var11);
            } catch (Exception e) {
                log.error("Something bad happened", e);
            }

            ValueContainer4 var15 = new ValueContainer4(var11, var12, var14, new TreeSet(new Comparator<ValueContainer1<Integer>>() {
                public int compare(ValueContainer1<Integer> var1, ValueContainer1<Integer> var2) {
                    return var1.getFirstValue().compareTo(var2.getFirstValue());
                }
            }));
            var4.add(new ValueContainer3(var10, QVH.valueOf(var13), var15));
            var2.put(var10, var15);
        }

        var6 = var3.iterator();

        String var20;
        while (var6.hasNext()) {
            String var31 = (String) var6.next();
            if (var31 != null) {
                Map var34 = ENG.getInstance().getProcessDefinition(var31);
                var9 = (Map) var34.get("anchors");
                Map var39 = (Map) var9.get(ENH.LEFT_BAR);
                Map var42 = (Map) var9.get(ENH.TOP_MENU);
                ProcessDefinitionBase var43;
                String var46;
                if (var39 != null) {
                    var43 = (ProcessDefinitionBase) var34.get("definition");
                    var13 = var43.getTitle(ENH.LEFT_BAR);
                    var46 = var43.getFXML();
                    Boolean var48 = (Boolean) var34.get("lock.config");
                    String var16 = (String) var39.get("class.style");
                    Integer var17 = Integer.parseInt(String.valueOf(var39.get("position")));
                    String var18 = (String) var39.get("display.type");
                    QVH var19 = QVH.valueOf(var18);
                    var20 = (String) var39.get("context.position");
                    int var21 = Integer.parseInt(var20);
                    ValueContainer2 var22 = this.getAnchorDisplayTypeByLocation(var17);
                    QVH var23 = null;
                    if (var22 != null) {
                        var23 = (QVH) var22.getFirstValue();
                    }

                    if (var23 != null && !var23.equals(var19)) {
                        throw new FFI("Anchor display type conflict [" + var23 + "] [" + var19 + "]");
                    }

                    switch (var19) {
                        case BUTTON:
                            var4.add(new ValueContainer3(var17, var19, new ValueContainer5(var31, var13, var46, var16, var48)));
                            if (var22 != null) {
                                throw new FFI("Value for anchor display type [" + var19 + "] already set!");
                            }

                            var22 = new ValueContainer2(var19, null);
                            this.setAnchorDisplayTypeByLocation(var17, var22);
                            break;
                        case CONTEXT:
                            ((Set) ((ValueContainer4) var2.get(var17)).getFourthValue()).add(new ValueContainer2(var21, new ValueContainer5(var31, var13, var46, var16, var48)));
                            break;
                        default:
                            throw new FFI("Unknown anchor display type [" + var19 + "]");
                    }
                }

                if (var42 != null) {
                    var43 = (ProcessDefinitionBase) var34.get("definition");
                    var13 = var43.getTitle(ENH.TOP_MENU);
                    var46 = var43.getFXML();
                    String var49 = (String) var42.get("class.style");
                    Integer var51 = Integer.parseInt(String.valueOf(var42.get("position")));
                    var5.add(new ValueContainer5(var51, var31, var13, var46, var49));
                }
            }
        }

        var6 = var5.iterator();

        String var41;
        while (var6.hasNext()) {
            ValueContainer5 var32 = (ValueContainer5) var6.next();
            String var35 = (String) var32.getSecondValue();
            String var37 = (String) var32.getThirdValue();
            var41 = (String) var32.getFourthValue();
            var11 = (String) var32.getFifthValue();
            this.HJM(this.FHX, var37, var11, var35, var41, null);
        }

        var6 = var4.iterator();

        label230:
        while (var6.hasNext()) {
            ValueContainer3 var33 = (ValueContainer3) var6.next();
            QVH var36 = (QVH) var33.getSecondValue();
            switch (var36) {
                case BUTTON:
                    ValueContainer5 var40 = (ValueContainer5) var33.getThirdValue();
                    var41 = (String) var40.getFirstValue();
                    var11 = (String) var40.getSecondValue();
                    var12 = (String) var40.getThirdValue();
                    var13 = (String) var40.getFourthValue();
                    var14 = (Boolean) var40.getFifthValue();
                    this.HJO(this.fxml_left_bar.getChildren(), var11, var13, var41, var12, var14);
                    break;
                case CONTEXT:
                    ValueContainer4 var38 = (ValueContainer4) var33.getThirdValue();
                    var41 = (String) var38.getFirstValue();
                    var11 = (String) var38.getSecondValue();
                    Boolean var44 = (Boolean) var38.getThirdValue();
                    final Button var45 = this.HJP(this.fxml_left_bar.getChildren(), var41, var11, null, var44);
                    final ContextMenu var47 = new ContextMenu();
                    var47.setAutoHide(true);
                    var45.setOnMouseClicked(new EventHandler<MouseEvent>() {
                        public void handle(MouseEvent var1) {
                            if (MouseButton.PRIMARY.equals(var1.getButton())) {
                                Bounds var2 = var45.localToScreen(var45.getBoundsInLocal());
                                if (var47 != null) {
                                    var47.show(var45, var2.getMaxX(), var2.getMinY());
                                }
                            }

                        }
                    });
                    Iterator var50 = ((Set) var38.getFourthValue()).iterator();

                    while (true) {
                        while (true) {
                            if (!var50.hasNext()) {
                                continue label230;
                            }

                            ValueContainer2 var52 = (ValueContainer2) var50.next();
                            int var53 = (Integer) var52.getFirstValue();
                            ValueContainer5 var54 = (ValueContainer5) var52.getSecondValue();
                            final String var55 = (String) var54.getFirstValue();
                            var20 = (String) var54.getSecondValue();
                            final String var56 = (String) var54.getThirdValue();
                            String var57 = (String) var54.getFourthValue();
                            MenuItem var58 = new MenuItem(var20);
                            var58.getStyleClass().add(var57);
                            var58.setOnAction(new EventHandler<ActionEvent>() {
                                public void handle(ActionEvent var1) {
                                    log.info("Menu [" + var55 + "] clicked");
                                    EMP.this.getApplication().initController(EMP.this.getFxmlName(), var56, null);
                                }
                            });
                            if (var47.getItems().size() < var53 + 1) {
                                ArrayList var24 = new ArrayList();
                                var24.addAll(var47.getItems());
                                var47.getItems().clear();

                                for (int var25 = 0; var25 < var53; ++var25) {
                                    if (var25 < var24.size()) {
                                        var47.getItems().add((MenuItem) var24.get(var25));
                                    } else {
                                        var47.getItems().add(new MenuItem("DUMMY"));
                                    }
                                }

                                var47.getItems().add(var58);
                            } else {
                                var47.getItems().set(var53, var58);
                            }
                        }
                    }
                default:
                    throw new FFI("Unknown anchor display type [" + var36 + "]");
            }
        }

    }

    private ValueContainer2<QVH, ContextMenu> getAnchorDisplayTypeByLocation(int var1) {
        return this.RHF.get(var1);
    }

    private void setAnchorDisplayTypeByLocation(int var1, ValueContainer2<QVH, ContextMenu> var2) {
        this.RHF.put(var1, var2);
    }

    private void HJM(ContextMenu var1, String var2, String var3, final String var4, final String var5, final Consumer var6) {
        this.HJN(var1, var2, var3, new EventHandler<ActionEvent>() {
            public void handle(ActionEvent var1) {
                log.info("Button [" + var4 + "] clicked");
                EMP.this.getApplication().initController(EMP.this.getFxmlName(), var5, var6);
            }
        });
    }

    private void HJN(ContextMenu var1, String var2, String var3, EventHandler<ActionEvent> var4) {
        MenuItem var5 = new MenuItem(var2);
        var5.getStyleClass().add(var3);
        var5.setOnAction(var4);
        var1.getItems().add(var5);
    }

    private Button HJO(ObservableList<Node> var1, String var2, String var3, final String var4, final String var5, boolean var6) {
        return this.HJP(var1, var2, var3, new EventHandler<ActionEvent>() {
            public void handle(ActionEvent var1) {
                log.info("Button [" + var4 + "] clicked");
                EMP.this.getApplication().initController(EMP.this.getFxmlName(), var5, null);
            }
        }, var6);
    }

    private Button HJP(ObservableList<Node> var1, String var2, String var3, EventHandler<ActionEvent> var4, boolean var5) {
        Button var6 = new Button(var2);
        var6.setWrapText(true);
        var6.getStyleClass().add(var3);
        if (var4 != null) {
            var6.setOnAction(var4);
        }

        this.FHY.add(new ValueContainer2(var5, var6));
        var1.add(var6);
        return var6;
    }

    public boolean HHB() {

        boolean var1;
        if (this.FHX != null) {
            this.FHX.hide();
        }

        var1 = true;

        return var1;
    }

    public void HHC() {

        try {
            this.setUpLabels();
            UserData var1 = null;
            ConfigurationProperties var2 = null;
            boolean var3 = false;
            Iterator var4 = this.FHY.iterator();

            while (var4.hasNext()) {
                ValueContainer2 var5 = (ValueContainer2) var4.next();
                if ((Boolean) var5.getFirstValue()) {
                    if (!var3) {
                        var3 = true;
                        var1 = EMB.getInstance().HHV();
                        var2 = EMB.getInstance().HHU();
                    }

                    ((Button) var5.getSecondValue()).disableProperty().set(var1 == null || var2 == null);
                } else {
                    ((Button) var5.getSecondValue()).disableProperty().set(false);
                }
            }
        } catch (Exception var9) {
            log.error("Something bad happened", var9);
            throw new FFI(var9);
        }

    }
}
