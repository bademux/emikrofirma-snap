package a.a.a.c.c.b.a.b.a;

import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.c.c.a.ELZ;
import a.a.a.c.c.b.EMB;
import a.a.a.c.c.b.EMC;
import a.a.a.c.c.b.ENB;
import a.a.a.c.c.b.a.EMD;
import a.a.a.c.c.b.a.a.a.EMJ;
import a.a.a.c.c.b.a.a.a.EMM;
import a.a.a.c.c.c.ENG;
import a.a.a.c.c.c.ENH;
import a.a.a.c.c.c.QVH;
import a.a.a.c.e.a.a.EVN;
import a.a.a.c.e.a.d.*;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.c.a.LP;
import a.a.a.c.f.c.b.LX;
import a.a.a.c.f.c.b.LY;
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

import java.awt.*;
import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryUsage;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.*;

public class EMP extends EMD {
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
    private final Map<Integer, EVZ<QVH, ContextMenu>> RHF = new HashMap();
    private final List<EVZ<Boolean, Button>> FHY = new ArrayList();

    public EMP(EMC var1, String var2) {
        super(var1, var2);
    }

    private void QPN() {
        EXF.getInstance().ICO();

        try {
            this.fxml_left_bar_label.textProperty().setValue("");
            this.fxml_left_bar_text.textProperty().setValue("");
        } finally {
            EXF.getInstance().ICP();
        }

    }

    private void setUpLabels() {
        EXF.getInstance().ICO();

        try {
            this.QPN();
            LX var1 = EMB.getInstance().getCurrentUser();
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
            EXF.getInstance().ICA(var5);
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public void initialize() {
        EXF.getInstance().ICO();

        try {
            this.setUpLabels();
            this.fxml_left_bar_contact.setOnAction(new EventHandler<ActionEvent>() {
                public void handle(ActionEvent var1) {
                    (new EVN() {
                        public void HZI() {
                            EXF.getInstance().ICO();

                            try {
                                StringBuilder var1 = new StringBuilder("mailto:").append("bademux+emk@gmail.com");
                               String var2 = EMP.this.resources.getString("micro.leftbar.contact.mail.subject") + " [" +
                                       (new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssz")).format(new Date()) +
                                       " ]";
                                var1.append("&subject=").append(URLEncoder.encode(var2, StandardCharsets.UTF_8.name()).replace("+", "%20"));
                                StringBuilder var3 = new StringBuilder();
                                var3.append("#######");
                                var3.append(System.lineSeparator());

                                try {
                                    var3.append("os.name " + System.getProperty("os.name")).append(System.lineSeparator());
                                    var3.append("os.arch " + System.getProperty("os.arch")).append(System.lineSeparator());
                                    var3.append("java.version " + System.getProperty("java.version")).append(System.lineSeparator());
                                    var3.append("java.vendor " + System.getProperty("java.vendor")).append(System.lineSeparator());
                                    var3.append("java.vm.name " + System.getProperty("java.vm.name")).append(System.lineSeparator());
                                    var3.append("file.encoding " + System.getProperty("file.encoding")).append(System.lineSeparator());
                                    MemoryUsage var4 = ManagementFactory.getMemoryMXBean().getHeapMemoryUsage();
                                    var3.append("memory init " + var4.getInit() / 1024L / 1024L + " MB").append(System.lineSeparator());
                                    var3.append("memory max " + var4.getMax() / 1024L / 1024L + " MB").append(System.lineSeparator());
                                    var3.append("memory committed " + var4.getCommitted() / 1024L / 1024L + " MB").append(System.lineSeparator());
                                    var3.append("memory used " + var4.getUsed() / 1024L / 1024L + " MB").append(System.lineSeparator());
                                    var3.append(System.lineSeparator());
                                } catch (Exception var13) {
                                    EXF.getInstance().ICA(var13);
                                }

                                var3.append(System.lineSeparator());
                                var3.append("#######");
                                var3.append(System.lineSeparator());
                                var1.append("&body=").append(URLEncoder.encode(var3.toString(), StandardCharsets.UTF_8.name()).replace("+", "%20"));
                                String var17 = var1.toString();
                                URI var18 = new URI(var17);
                                Desktop.getDesktop().mail(var18);
                            } catch (URISyntaxException | IOException var14) {
                                EXF.getInstance().ICA(var14);
                            } finally {
                                EXF.getInstance().ICP();
                            }

                        }
                    }).start();
                }
            });
            this.HJL();
        } catch (FFK var5) {
            EXF.getInstance().ICA(var5);
            throw new FFI(var5);
        } finally {
            EXF.getInstance().ICP();
        }

    }

    private void HJL() throws FFK {
        EXF.getInstance().ICO();

        try {
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
            TreeSet var4 = new TreeSet(new Comparator<EWD<Integer>>() {
                public int compare(EWD<Integer> var1, EWD<Integer> var2) {
                    return var1.getFirstValue().compareTo(var2.getFirstValue());
                }
            });
            TreeSet var5 = new TreeSet(new Comparator<EWD<Integer>>() {
                public int compare(EWD<Integer> var1, EWD<Integer> var2) {
                    return var1.getFirstValue().compareTo(var2.getFirstValue());
                }
            });
            this.HJM(this.FHX, this.resources.getString("micro.leftBar.button.LogOut"), "btn-menuitem", EMM.class.getSimpleName(), "login.fxml", new ENB<EMM>() {
                public void HNE(EMM var1) {
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
                EWD var8 = (EWD) var7.getKey();
                var9 = (Map) var7.getValue();
                int var10 = (Integer) var8.getFirstValue();
                var11 = (String) var9.get("title");
                var12 = (String) var9.get("class.style");
                var13 = (String) var9.get("display.type");
                var14 = (Boolean) var9.get("lock.config");

                try {
                    var11 = this.resources.getString(var11);
                } catch (Exception var29) {
                    EXF.getInstance().ICI(var29);
                }

                EWA var15 = new EWA(var11, var12, var14, new TreeSet(new Comparator<EWD<Integer>>() {
                    public int compare(EWD<Integer> var1, EWD<Integer> var2) {
                        return var1.getFirstValue().compareTo(var2.getFirstValue());
                    }
                }));
                var4.add(new EWC(var10, QVH.valueOf(var13), var15));
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
                    ELZ var43;
                    String var46;
                    if (var39 != null) {
                        var43 = (ELZ) var34.get("definition");
                        var13 = var43.getTitle(ENH.LEFT_BAR);
                        var46 = var43.getFXML();
                        Boolean var48 = (Boolean) var34.get("lock.config");
                        String var16 = (String) var39.get("class.style");
                        Integer var17 = Integer.parseInt(String.valueOf(var39.get("position")));
                        String var18 = (String) var39.get("display.type");
                        QVH var19 = QVH.valueOf(var18);
                        var20 = (String) var39.get("context.position");
                        int var21 = Integer.parseInt(var20);
                        EVZ var22 = this.getAnchorDisplayTypeByLocation(var17);
                        QVH var23 = null;
                        if (var22 != null) {
                            var23 = (QVH) var22.getFirstValue();
                        }

                        if (var23 != null && !var23.equals(var19)) {
                            throw new FFI("Anchor display type conflict [" + var23 + "] [" + var19 + "]");
                        }

                        switch (var19) {
                            case BUTTON:
                                var4.add(new EWC(var17, var19, new EWB(var31, var13, var46, var16, var48)));
                                if (var22 != null) {
                                    throw new FFI("Value for anchor display type [" + var19 + "] already set!");
                                }

                                var22 = new EVZ(var19, null);
                                this.setAnchorDisplayTypeByLocation(var17, var22);
                                break;
                            case CONTEXT:
                                ((Set) ((EWA) var2.get(var17)).getFourthValue()).add(new EVZ(var21, new EWB(var31, var13, var46, var16, var48)));
                                break;
                            default:
                                throw new FFI("Unknown anchor display type [" + var19 + "]");
                        }
                    }

                    if (var42 != null) {
                        var43 = (ELZ) var34.get("definition");
                        var13 = var43.getTitle(ENH.TOP_MENU);
                        var46 = var43.getFXML();
                        String var49 = (String) var42.get("class.style");
                        Integer var51 = Integer.parseInt(String.valueOf(var42.get("position")));
                        var5.add(new EWB(var51, var31, var13, var46, var49));
                    }
                }
            }

            var6 = var5.iterator();

            String var41;
            while (var6.hasNext()) {
                EWB var32 = (EWB) var6.next();
                String var35 = (String) var32.getSecondValue();
                String var37 = (String) var32.getThirdValue();
                var41 = (String) var32.getFourthValue();
                var11 = (String) var32.getFifthValue();
                this.HJM(this.FHX, var37, var11, var35, var41, null);
            }

            var6 = var4.iterator();

            label230:
            while (var6.hasNext()) {
                EWC var33 = (EWC) var6.next();
                QVH var36 = (QVH) var33.getSecondValue();
                switch (var36) {
                    case BUTTON:
                        EWB var40 = (EWB) var33.getThirdValue();
                        var41 = (String) var40.getFirstValue();
                        var11 = (String) var40.getSecondValue();
                        var12 = (String) var40.getThirdValue();
                        var13 = (String) var40.getFourthValue();
                        var14 = (Boolean) var40.getFifthValue();
                        this.HJO(this.fxml_left_bar.getChildren(), var11, var13, var41, var12, var14);
                        break;
                    case CONTEXT:
                        EWA var38 = (EWA) var33.getThirdValue();
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

                                EVZ var52 = (EVZ) var50.next();
                                int var53 = (Integer) var52.getFirstValue();
                                EWB var54 = (EWB) var52.getSecondValue();
                                final String var55 = (String) var54.getFirstValue();
                                var20 = (String) var54.getSecondValue();
                                final String var56 = (String) var54.getThirdValue();
                                String var57 = (String) var54.getFourthValue();
                                MenuItem var58 = new MenuItem(var20);
                                var58.getStyleClass().add(var57);
                                var58.setOnAction(new EventHandler<ActionEvent>() {
                                    public void handle(ActionEvent var1) {
                                        EXF.getInstance().ICE("Menu [" + var55 + "] clicked");
                                        EMP.this.getApplication().HJD(EMP.this.getFxmlName(), var56);
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
        } finally {
            EXF.getInstance().ICP();
        }

    }

    private EVZ<QVH, ContextMenu> getAnchorDisplayTypeByLocation(int var1) {
        return this.RHF.get(var1);
    }

    private void setAnchorDisplayTypeByLocation(int var1, EVZ<QVH, ContextMenu> var2) {
        this.RHF.put(var1, var2);
    }

    private void HJM(ContextMenu var1, String var2, String var3, final String var4, final String var5, final ENB var6) {
        this.HJN(var1, var2, var3, new EventHandler<ActionEvent>() {
            public void handle(ActionEvent var1) {
                EXF.getInstance().ICE("Button [" + var4 + "] clicked");
                EMP.this.getApplication().HJE(EMP.this.getFxmlName(), var5, var6);
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
                EXF.getInstance().ICE("Button [" + var4 + "] clicked");
                EMP.this.getApplication().HJD(EMP.this.getFxmlName(), var5);
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

        this.FHY.add(new EVZ(var5, var6));
        var1.add(var6);
        return var6;
    }

    public boolean HHB() {
        EXF.getInstance().ICO();

        boolean var1;
        try {
            if (this.FHX != null) {
                this.FHX.hide();
            }

            var1 = true;
        } finally {
            EXF.getInstance().ICP();
        }

        return var1;
    }

    public void HHC() {
        EXF.getInstance().ICO();

        try {
            this.setUpLabels();
            LY var1 = null;
            LP var2 = null;
            boolean var3 = false;
            Iterator var4 = this.FHY.iterator();

            while (var4.hasNext()) {
                EVZ var5 = (EVZ) var4.next();
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
            EXF.getInstance().ICA(var9);
            throw new FFI(var9);
        } finally {
            EXF.getInstance().ICP();
        }

    }
}
