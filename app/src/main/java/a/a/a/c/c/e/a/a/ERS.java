package a.a.a.c.c.e.a.a;

import a.a.a.b.c.FEN;
import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.c.c.b.EMB;
import java.util.function.Consumer;
import a.a.a.c.c.b.a.BaseFxController;
import a.a.a.c.c.b.a.a.a.EML;
import a.a.a.c.c.b.a.a.a.EMM;
import a.a.a.c.c.e.a.a.b.ERH;
import a.a.a.c.c.e.a.a.b.ERK;
import a.a.a.c.c.e.a.a.b.ERL;
import a.a.a.c.c.e.a.a.b.ERM;
import a.a.a.c.c.e.a.a.c.ERP;
import a.a.a.c.c.e.a.a.c.ERQ;
import a.a.a.c.c.e.a.a.c.ERR;
import com.github.bademux.emk.Application;
import a.a.a.c.e.a.d.TwoValueBox;
import a.a.a.c.f.a.a.EZQ;
import a.a.a.c.f.a.a.EZR;
import a.a.a.c.f.a.a.EZS;
import a.a.a.c.f.a.a.QRU;
import a.a.a.c.f.b.b.JN;
import a.a.a.c.f.c.a.AILX;
import a.a.a.c.f.c.a.LS;
import a.a.a.c.f.c.c.TextFieldValidated_RefIdPattern;
import a.a.a.c.g.a.FCR;
import com.github.bademux.emk.app.FXApp;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Callback;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ERS extends BaseFxController {
    private final ERR GAU = new ERR();
    @FXML
    private Node fxml_inner_parent;
    @FXML
    public EZS fxml_include_propertyWorkingDir_boxController;
    @FXML
    public EZR fxml_include_propertyPkcs11LibraryFile_boxController;
    @FXML
    public EZQ fxml_include_performVerificationLabeledCheckBox_boxController;
    private Map<String, Map<JN, Integer>> QZS = null;
    private String QZT = null;
    private Map<JN, Integer> QZU = null;
    private JN QZV = null;
    private Integer QZW = null;
    private Integer QZX = null;
    private QTC QZY;
    @FXML
    private ListView<ERP> fxml_listview_sequence_names_list;
    @FXML
    private ListView<JN> fxml_listview_sequence_periods_list;
    @FXML
    private QRU fxml_include_sequence_valueController;
    @FXML
    private Button fxml_sequence_update;
    @FXML
    public TextField fxml_config_f_preview;
    @FXML
    private HBox fxml_config_f_container;
    @FXML
    private Button fxml_config_f_cleanup;
    @FXML
    private Button fxml_config_change_password;
    @FXML
    private Button fxml_config_create_backup;
    @FXML
    private Button fxml_config_load_backup;
    @FXML
    private Button fxml_config_delete_password;
    @FXML
    public ScrollPane fxml_config_f_scroll_pane;
    @FXML
    private VBox fxml_config_c_vbox;
    @FXML
    public TextField fxml_config_c_preview;
    @FXML
    private HBox fxml_config_c_container;
    @FXML
    private Button fxml_config_c_cleanup;
    @FXML
    public ScrollPane fxml_config_c_scroll_pane;
    @FXML
    private TextField fxml_config_base_text;
    @FXML
    private Label fxml_config_base_year;
    @FXML
    private Label fxml_config_base_month;
    @FXML
    private Label fxml_config_base_day;
    @FXML
    private Label fxml_config_base_sequence_month_1;
    @FXML
    private Label fxml_config_base_sequence_month_2;
    @FXML
    private Label fxml_config_base_sequence_month_3;
    @FXML
    private Label fxml_config_base_sequence_year_1;
    @FXML
    private Label fxml_config_base_sequence_year_2;
    @FXML
    private Label fxml_config_base_sequence_halfyear_1;
    @FXML
    private Label fxml_config_base_sequence_halfyear_2;
    @FXML
    private Label fxml_config_base_sequence_quarter_1;
    @FXML
    private Label fxml_config_base_sequence_quarter_2;
    @FXML
    private Label fxml_config_base_separator_slash;
    @FXML
    private Label fxml_config_base_separator_backslash;
    @FXML
    private Label fxml_config_base_separator_underscore;
    @FXML
    private Label fxml_config_base_separator_minus;
    @FXML
    private Label fxml_config_base_const_F;
    @FXML
    private Label fxml_config_base_const_FVAT;
    @FXML
    private Label fxml_config_base_const_F_VAT;
    @FXML
    private Label fxml_config_base_const_FV;
    @FXML
    private Label fxml_config_base_const_FA;
    @FXML
    private Label fxml_config_base_const_FK;
    @FXML
    private Label fxml_config_base_const_KOR;
    public TextFieldValidated_RefIdPattern GAV;
    public TextFieldValidated_RefIdPattern GAW;
    @FXML
    public Button fxml_config_f_default0;
    @FXML
    public Button fxml_config_f_default1;
    @FXML
    public Button fxml_config_f_default2;
    @FXML
    public Button fxml_config_f_default3;
    @FXML
    public Button fxml_config_f_default4;
    @FXML
    public Button fxml_config_c_default0;
    @FXML
    public Button fxml_config_c_default1;
    @FXML
    public Button fxml_config_c_default2;
    @FXML
    public Button fxml_config_c_default3;
    @FXML
    public Button fxml_config_c_default4;
    public final String GAX = "FA/#%yyyy%#/#%MM%#/#%dd%#/#%sequence1%#";
    public final String GAY = "FV/#%yyyy%#/#%MM%#/#%dd%#-#%sequence1%#";
    public final String GAZ = "#%sequence1%#/F/#%yyyy%#/#%MM%#";
    public final String GBA = "FV_#%sequence1%#/#%MM%#/#%yyyy%#";
    public final String GBB = "F_VAT-#%yyyy%#-#%MM%#-#%dd%#/#%sequence1%#";
    public final String GBC = "FK/#%yyyy%#/#%MM%#/#%dd%#/#%sequence2%#";
    public final String GBD = "FK/#%yyyy%#/#%MM%#/#%dd%#-#%sequence2%#";
    public final String GBE = "#%sequence2%#/KOR/#%yyyy%#/#%MM%#";
    public final String GBF = "FK_#%sequence2%#/#%MM%#/#%yyyy%#";
    public final String GBG = "F_KOR-#%yyyy%#-#%MM%#-#%dd%#/#%sequence2%#";
    private boolean QMB;

    public ERS(FXApp var1, String var2) {
        super(var1, var2);
    }

    public void initialize() {

        this.GAV = new TextFieldValidated_RefIdPattern();
        this.GAW = new TextFieldValidated_RefIdPattern();
        ERQ.setupNode(this.fxml_config_base_text, this.GAU, ERP.text);
        ERQ.setupNode(this.fxml_config_base_year, this.GAU, ERP.year);
        ERQ.setupNode(this.fxml_config_base_month, this.GAU, ERP.month);
        ERQ.setupNode(this.fxml_config_base_day, this.GAU, ERP.day);
        ERQ.setupNode(this.fxml_config_base_sequence_month_1, this.GAU, ERP.sequence1);
        ERQ.setupNode(this.fxml_config_base_sequence_month_2, this.GAU, ERP.sequence2);
        ERQ.setupNode(this.fxml_config_base_sequence_month_3, this.GAU, ERP.sequence3);
        ERQ.setupNode(this.fxml_config_base_sequence_year_1, this.GAU, ERP.ysequence1);
        ERQ.setupNode(this.fxml_config_base_sequence_year_2, this.GAU, ERP.ysequence2);
        ERQ.setupNode(this.fxml_config_base_sequence_halfyear_1, this.GAU, ERP.hsequence1);
        ERQ.setupNode(this.fxml_config_base_sequence_halfyear_2, this.GAU, ERP.hsequence2);
        ERQ.setupNode(this.fxml_config_base_sequence_quarter_1, this.GAU, ERP.qsequence1);
        ERQ.setupNode(this.fxml_config_base_sequence_quarter_2, this.GAU, ERP.qsequence2);
        ERQ.setupNode(this.fxml_config_base_separator_slash, this.GAU, ERP.separator_slash);
        ERQ.setupNode(this.fxml_config_base_separator_backslash, this.GAU, ERP.separator_backslash);
        ERQ.setupNode(this.fxml_config_base_separator_underscore, this.GAU, ERP.separator_underscore);
        ERQ.setupNode(this.fxml_config_base_separator_minus, this.GAU, ERP.separator_minus);
        ERQ.setupNode(this.fxml_config_base_const_F, this.GAU, ERP.const_F);
        ERQ.setupNode(this.fxml_config_base_const_FVAT, this.GAU, ERP.const_FVAT);
        ERQ.setupNode(this.fxml_config_base_const_F_VAT, this.GAU, ERP.const_F_VAT);
        ERQ.setupNode(this.fxml_config_base_const_FV, this.GAU, ERP.const_FV);
        ERQ.setupNode(this.fxml_config_base_const_FA, this.GAU, ERP.const_FA);
        ERQ.setupNode(this.fxml_config_base_const_FK, this.GAU, ERP.const_FK);
        ERQ.setupNode(this.fxml_config_base_const_KOR, this.GAU, ERP.const_KOR);
        this.fxml_config_f_container.setOnDragEntered(new ERH(this.GAU, this.fxml_config_f_scroll_pane));
        this.fxml_config_f_container.setOnDragOver(new ERK(this.GAU));
        this.fxml_config_f_container.setOnDragDropped(new ERL(this.GAU, this.GAV.textProperty()));
        this.fxml_config_f_container.setOnDragExited(new ERM(this.GAU, this.GAV.textProperty(), this.fxml_config_f_scroll_pane));
        this.fxml_config_c_container.setOnDragEntered(new ERH(this.GAU, this.fxml_config_c_scroll_pane));
        this.fxml_config_c_container.setOnDragOver(new ERK(this.GAU));
        this.fxml_config_c_container.setOnDragDropped(new ERL(this.GAU, this.GAW.textProperty()));
        this.fxml_config_c_container.setOnDragExited(new ERM(this.GAU, this.GAW.textProperty(), this.fxml_config_c_scroll_pane));
        this.fxml_listview_sequence_names_list.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        this.fxml_listview_sequence_names_list.setCellFactory(new Callback<ListView<ERP>, ListCell<ERP>>() {
            public ListCell<ERP> call(ListView<ERP> var1) {
                return new ListCell<ERP>() {
                    protected void updateItem(ERP var1, boolean var2) {
                        super.updateItem(var1, var2);
                        if (var1 != null) {
                            this.setText(var1.getListDescription());
                        }

                    }
                };
            }
        });
        this.fxml_listview_sequence_periods_list.setCellFactory(new Callback<ListView<JN>, ListCell<JN>>() {
            public ListCell<JN> call(ListView<JN> var1) {
                return new ListCell<JN>() {
                    protected void updateItem(JN var1, boolean var2) {
                        super.updateItem(var1, var2);
                        if (var1 != null) {
                            Integer var3 = var1.DDJ().getValue();
                            Integer var4 = var1.DDK().getValue();
                            if (var4 > 0 && var4 <= 12) {
                                this.setText(var3 + "M" + var4);
                            } else if (var4 > 12 && var4 <= 16) {
                                this.setText(var3 + "Q" + (var4 - 12));
                            } else if (var4 > 16 && var4 <= 18) {
                                this.setText(var3 + "H" + (var4 - 12 - 4));
                            } else if (var4 > 18 && var4 <= 19) {
                                this.setText(var3 + "Y");
                            } else {
                                this.setText("error " + var1);
                            }
                        } else {
                            this.setText(null);
                        }

                    }
                };
            }
        });
        this.fxml_listview_sequence_names_list.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<ERP>() {
            public void changed(ObservableValue<? extends ERP> var1, ERP var2, ERP var3) {
                ERS.this.QZT = null;
                ERS.this.QZU = null;
                ERS.this.fxml_listview_sequence_periods_list.getItems().clear();
                if (var3 != null && ERS.this.QZS != null) {
                    ERS.this.QZT = var3.name();
                    ERS.this.QZU = ERS.this.QZS.get(ERS.this.QZT);
                    ERS.this.fxml_listview_sequence_periods_list.getItems().addAll(ERS.this.QZU.keySet());
                }

                ERS.this.fxml_listview_sequence_periods_list.getItems().sort(new Comparator<JN>() {
                    public int compare(JN var1, JN var2) {
                        if (var1 != null && var2 != null) {
                            return var1.compareTo(var2);
                        } else if (var1 != null && var2 == null) {
                            return 1;
                        } else {
                            return var1 == null && var2 != null ? -1 : 0;
                        }
                    }
                });
            }
        });
        this.fxml_listview_sequence_periods_list.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<JN>() {
            public void changed(ObservableValue<? extends JN> var1, JN var2, JN var3) {
                ERS.this.fxml_include_sequence_valueController.fxml_component_main_element.setEditable(false);
                ERS.this.fxml_include_sequence_valueController.fxml_component_main_element.setText("");
                ERS.this.fxml_sequence_update.setDisable(true);
                ERS.this.QZV = null;
                ERS.this.QZW = null;
                if (var3 != null && ERS.this.QZU != null) {
                    ERS.this.QZV = var3;
                    ERS.this.QZW = ERS.this.QZU.get(ERS.this.QZV);
                    if (ERS.this.QZW != null) {
                        ERS.this.fxml_include_sequence_valueController.fxml_component_main_element.setText(ERS.this.QZW.toString());
                        ERS.this.fxml_include_sequence_valueController.fxml_component_main_element.setEditable(true);
                    }
                }

            }
        });
        this.fxml_include_sequence_valueController.fxml_component_main_element.textProperty().addListener(new ChangeListener<String>() {
            public void changed(ObservableValue<? extends String> var1, String var2, String var3) {
                ERS.this.fxml_sequence_update.setDisable(true);
                ERS.this.QZX = null;
                if (var3 != null && var3.length() > 0 && ERS.this.QZW != null) {
                    try {
                        ERS.this.QZX = Integer.parseInt(var3);
                        if (!ERS.this.QZX.equals(ERS.this.QZW)) {
                            ERS.this.fxml_sequence_update.setDisable(false);
                        }
                    } catch (Exception var5) {
                        org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var5);
                    }
                }

            }
        });
        this.fxml_include_sequence_valueController.RHQ(this.resources.getString("micro.config.sequence.counter.info"));
        this.fxml_include_sequence_valueController.fxml_component_main_element.setEditable(false);
        this.fxml_sequence_update.setDisable(true);

    }

    private void HSH(TextFieldValidated_RefIdPattern var1, HBox var2, ERR var3) {
        var2.getChildren().clear();
        String var4 = var1.getText();
        if (var4 != null && var4.length() > 0) {
            ArrayList var5 = new ArrayList();
            Pattern var6 = Pattern.compile("(" + ERP.GAO + ")|((?<=#%)[^#]+(?=%#))");
            Matcher var7 = var6.matcher(var4);
            int var8 = 0;

            while (var7.find()) {
                String var9 = var7.group(1);
                String var10 = var7.group(2);
                int var12;
                String var13;
                if (var9 != null) {
                    var12 = var4.indexOf(var9, var8);
                    if (var8 < var12) {
                        var13 = var4.substring(var8, var12);
                        var5.add(new TwoValueBox("A", var13));
                    }

                    var8 = var12 + var9.length();
                    var5.add(new TwoValueBox("B", var9));
                } else if (var10 != null) {
                    String var11 = "#%" + var10 + "%#";
                    var12 = var4.indexOf(var11, var8);
                    if (var8 < var12) {
                        var13 = var4.substring(var8, var12);
                        var5.add(new TwoValueBox("A", var13));
                    }

                    var8 = var12 + var11.length();
                    var5.add(new TwoValueBox("C", var10));
                }
            }

            if (var8 < var4.length()) {
                var5.add(new TwoValueBox("A", var4.substring(var8)));
            }

            Iterator var16 = var5.iterator();

            while (var16.hasNext()) {
                TwoValueBox var17 = (TwoValueBox) var16.next();
                ERP var18 = null;
                if ("A".equals(var17.getFirstValue())) {
                    var18 = ERP.text;
                } else if ("B".equals(var17.getFirstValue())) {
                    var18 = ERP.HSD((String) var17.getSecondValue());
                } else if ("C".equals(var17.getFirstValue())) {
                    switch ((String) var17.getSecondValue()) {
                        case "yyyy":
                            var18 = ERP.year;
                            break;
                        case "MM":
                            var18 = ERP.month;
                            break;
                        case "dd":
                            var18 = ERP.day;
                            break;
                        default:
                            try {
                                if (((String) var17.getSecondValue()).startsWith("string")) {
                                    var18 = ERP.text;
                                    if (var17.getSecondValue().equals("stringstring")) {
                                        var17.setSecondValue("");
                                    } else {
                                        var17.setSecondValue(((String) var17.getSecondValue()).split("string")[1]);
                                    }
                                } else {
                                    var18 = ERP.valueOf((String) var17.getSecondValue());
                                }
                            } catch (Exception var15) {
                                org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var15);
                                var18 = ERP.text;
                            }
                    }
                }

                if (var18 != null) {
                    ERQ.HSF(var18, (String) var17.getSecondValue(), var3, var2.getChildren(), var1.textProperty(), false);
                }
            }
        }

    }

    public void HSI(LS var1, LS var2, AILX var3, LS var4, LS var5) {

        if (var1 != null) {
            this.fxml_include_propertyWorkingDir_boxController.fxml_component_main_element.textProperty().bindBidirectional(var1.DEY().DDG());
        }

        if (var2 != null) {
            this.fxml_include_propertyPkcs11LibraryFile_boxController.fxml_component_main_element.textProperty().bindBidirectional(var2.DEY().DDG());
        }

        if (var3 != null) {
            this.fxml_include_performVerificationLabeledCheckBox_boxController.fxml_component_main_element.selectedProperty().bindBidirectional(var3.DEY().DDS());
        }

        if (var4 != null) {
            this.GAV.textProperty().bindBidirectional(var4.DEY().DDG());
        }

        if (var5 != null) {
            this.GAW.textProperty().bindBidirectional(var5.DEY().DDG());
        }

        this.HSH(this.GAV, this.fxml_config_f_container, this.GAU);
        this.HSH(this.GAW, this.fxml_config_c_container, this.GAU);
        this.HSK();

    }

    public void HSJ(LS var1, LS var2, AILX var3, LS var4, LS var5) {

        if (var1 != null) {
            this.fxml_include_propertyWorkingDir_boxController.fxml_component_main_element.textProperty().unbindBidirectional(var1.DEY().DDG());
        }

        if (var2 != null) {
            this.fxml_include_propertyPkcs11LibraryFile_boxController.fxml_component_main_element.textProperty().unbindBidirectional(var2.DEY().DDG());
        }

        if (var3 != null) {
            this.fxml_include_performVerificationLabeledCheckBox_boxController.fxml_component_main_element.textProperty().unbindBidirectional(var3.DEY().DDS());
        }

        if (var4 != null) {
            this.GAV.textProperty().unbindBidirectional(var4.DEY().DDG());
        }

        if (var5 != null) {
            this.GAW.textProperty().unbindBidirectional(var5.DEY().DDG());
        }

    }

    private void HSK() {
        this.fxml_include_propertyWorkingDir_boxController.clearChangedProperty();
        this.fxml_include_propertyPkcs11LibraryFile_boxController.clearChangedProperty();
        this.fxml_include_performVerificationLabeledCheckBox_boxController.clearChangedProperty();
        this.GAV.changedProperty().set(false);
        this.GAW.changedProperty().set(false);
    }

    public void setSequences(Map<String, Map<JN, Integer>> var1) {
        this.QZS = var1;
    }

    public void setSequenceUpdater(QTC var1) {
        this.QZY = var1;
    }

    @FXML
    protected void fxml_handleButton_f_cleanup(ActionEvent var1) {

        this.fxml_config_f_container.getChildren().clear();
        this.GAV.clear();

    }

    public boolean QOT() {
        return this.QMB;
    }

    @FXML
    protected void fxml_handleButton_change_password(ActionEvent var1) {

        try {
            EML var2 = this.HSL();
            var2.getDialogStage().showAndWait();
            if (var2.FHT) {
                FCR.getMessageBoxDialog(this.resources.getString("micro.changePassword.title"), this.resources.getString("micro.changePassword.button.success.message"), 500.0, 75.0, this.getPrimaryStage());
                this.QMB = true;
                this.getApplication().initController(this.getFxmlName(), "login.fxml", new Consumer<EMM>() {
                    public void accept(EMM var1) {
                        var1.setLogout(true);
                    }
                });
            }
        } catch (IOException var6) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var6);
            throw new FFI(var6);
        }

    }

    @FXML
    protected void fxml_handleButton_create_backup(ActionEvent var1) {

        FEN var2 = FCR.getConfirmDataDialog(this.resources.getString("micro.config.controll.createBackupTitle"), this.resources.getString("micro.config.controll.createBackupHeader"), this.resources.getString("micro.config.controll.createBackupConfirm"), this.resources.getString("micro.config.controll.createBackupDeny"), 400.0, 100.0, this.resources.getString("micro.config.controll.createBackupDescription"));
        if (var2.equals(FEN.Confirm)) {
            try {
                DirectoryChooser var3 = new DirectoryChooser();
                var3.setTitle("Tworzenie kopii zapasowej");
                File var4 = Application.getHomeDir().toFile();
                var3.setInitialDirectory(var4);
                File var5 = var3.showDialog(this.primaryStage);
                if (var5 == null) {
                    return;
                }

                File var6 = EMB.getInstance().QQM(var5.getAbsolutePath());
                if (var6 != null) {
                    org.slf4j.LoggerFactory.getLogger(getClass()).info("creating backup done");
                    FCR.getMessageBoxDialogWithHyperLink(this.resources.getString("micro.config.controll.createBackupTitle"), this.resources.getString("micro.config.controll.createBackupSuccess"), var6, 400.0, 100.0);
                } else {
                    org.slf4j.LoggerFactory.getLogger(getClass()).warn("creating backup error. backupResult is null");
                    FCR.IGI("Błąd", this.resources.getString("micro.config.controll.createBackupFailure"), false);
                }
            } catch (FFK var7) {
                org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var7);
                FCR.IGI("Błąd", this.resources.getString("micro.config.controll.createBackupFailure"), false);
            }
        }

    }

    @FXML
    protected void fxml_handleButton_load_backup(ActionEvent var1) {

        FileChooser var2 = new FileChooser();
        FEN var3 = FCR.getConfirmDataDialog(this.resources.getString("micro.config.controll.restoreDatabaseTitle"), this.resources.getString("micro.config.controll.restoreDatabaseHeader"), this.resources.getString("micro.config.controll.createBackupConfirm"), this.resources.getString("micro.config.controll.createBackupDeny"), 650.0, 200.0, this.resources.getString("micro.config.controll.restoreDatabaseDescription"));
        if (var3.equals(FEN.Confirm)) {
            var2.setTitle("Wczytywanie kopii zapasowej");
            org.slf4j.LoggerFactory.getLogger(getClass()).info("loading backup ...");
            File var4 = Application.getHomeDir().toFile();
            var2.setInitialDirectory(var4);
            File var5 = var2.showOpenDialog(this.primaryStage.getScene().getWindow());
            if (var5 == null) {
                org.slf4j.LoggerFactory.getLogger(getClass()).info("loading backup cancelled");
                return;
            }

            try {
                EMB.getInstance().QQN(var5);
                org.slf4j.LoggerFactory.getLogger(getClass()).info("loading backup done");
                FCR.getMessageBoxDialog(this.resources.getString("micro.config.controll.restoreDatabaseTitle"), this.resources.getString("micro.config.controll.restoreDatabaseSuccess"), 550.0, 150.0, this.primaryStage);
                this.getApplication().initController(this.getFxmlName(), "login.fxml", new Consumer<EMM>() {
                    public void accept(EMM var1) {
                        var1.setLogout(true);
                    }
                });
            } catch (FFK var7) {
                org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var7);
                FCR.getMessageBoxDialog(this.resources.getString("micro.config.controll.restoreDatabaseTitle"), this.resources.getString("micro.config.controll.restoreDatabaseFailure"), 550.0, 150.0, this.primaryStage);
            } catch (FFI var8) {
                org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var8);
                FCR.getMessageBoxDialog(this.resources.getString("micro.config.controll.restoreDatabaseTitle"), var8.getMessage(), 550.0, 150.0, this.primaryStage);
            }
        }

    }

    @FXML
    protected void fxml_handleButton_delete_password(ActionEvent var1) {

        try {
            EMB.getInstance().HJC();
            FCR.getMessageBoxDialog(this.resources.getString("micro.changePassword.title"), "Usunieto haslo", 500.0, 75.0, this.getPrimaryStage());
            this.getApplication().initController(this.getFxmlName(), "login.fxml", new Consumer<EMM>() {
                public void accept(EMM var1) {
                    var1.setLogout(true);
                }
            });
        } catch (FFK var6) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var6);
        }

    }

    public EML HSL() throws IOException {

        EML var6;
        FXMLLoader var1 = new FXMLLoader();
        var1.setLocation(EML.class.getResource("/fxml/changePassword.fxml"));
        var1.setResources(this.resources);
        AnchorPane var2 = var1.load();
        Stage var3 = new Stage();
        var3.setTitle(this.resources.getString("micro.changePassword.title"));
        var3.initModality(Modality.WINDOW_MODAL);
        var3.initOwner(this.primaryStage);
        var3.setResizable(false);
        Scene var4 = new Scene(var2);
        var3.setScene(var4);
        var3.getIcons().add(new Image("/img/app/e_logo.png"));
        EML var5 = var1.getController();
        var5.setDialogStage(var3);
        var5.setResources(this.resources);
        var5.setDefault();
        var6 = var5;

        return var6;
    }

    @FXML
    protected void fxml_handleButton_c_cleanup(ActionEvent var1) {

        this.fxml_config_c_container.getChildren().clear();
        this.GAW.clear();

    }

    private void HSM(String var1) {

        this.GAV.setText(var1);
        this.HSH(this.GAV, this.fxml_config_f_container, this.GAU);

    }

    private void HSN(String var1) {

        this.GAW.setText(var1);
        this.HSH(this.GAW, this.fxml_config_c_container, this.GAU);

    }

    @FXML
    protected void fxml_handleButton_f_default0(ActionEvent var1) {

        this.getClass();
        this.HSM("FA/#%yyyy%#/#%MM%#/#%dd%#/#%sequence1%#");

    }

    @FXML
    protected void fxml_handleButton_f_default1(ActionEvent var1) {

        this.getClass();
        this.HSM("FV/#%yyyy%#/#%MM%#/#%dd%#-#%sequence1%#");

    }

    @FXML
    protected void fxml_handleButton_f_default2(ActionEvent var1) {

        this.getClass();
        this.HSM("#%sequence1%#/F/#%yyyy%#/#%MM%#");

    }

    @FXML
    protected void fxml_handleButton_f_default3(ActionEvent var1) {

        this.getClass();
        this.HSM("FV_#%sequence1%#/#%MM%#/#%yyyy%#");

    }

    @FXML
    protected void fxml_handleButton_f_default4(ActionEvent var1) {

        this.getClass();
        this.HSM("F_VAT-#%yyyy%#-#%MM%#-#%dd%#/#%sequence1%#");

    }

    @FXML
    protected void fxml_handleButton_c_default0(ActionEvent var1) {

        this.getClass();
        this.HSN("FK/#%yyyy%#/#%MM%#/#%dd%#/#%sequence2%#");

    }

    @FXML
    protected void fxml_handleButton_c_default1(ActionEvent var1) {

        this.getClass();
        this.HSN("FK/#%yyyy%#/#%MM%#/#%dd%#-#%sequence2%#");

    }

    @FXML
    protected void fxml_handleButton_c_default2(ActionEvent var1) {

        this.getClass();
        this.HSN("#%sequence2%#/KOR/#%yyyy%#/#%MM%#");

    }

    @FXML
    protected void fxml_handleButton_c_default3(ActionEvent var1) {

        this.getClass();
        this.HSN("FK_#%sequence2%#/#%MM%#/#%yyyy%#");

    }

    @FXML
    protected void fxml_handleButton_c_default4(ActionEvent var1) {

        this.getClass();
        this.HSN("F_KOR-#%yyyy%#-#%MM%#-#%dd%#/#%sequence2%#");

    }

    @FXML
    protected void fxml_handleButton_sequence_update(ActionEvent var1) {

        if (this.QZY != null) {
            this.QZY.RKK(this.QZT, this.QZV, this.QZW, this.QZX);
        }

    }

    public boolean HHB() {

        boolean var1;
        var1 = true;

        return var1;
    }

    public void HHC() {

        try {
            this.QMB = false;
            String var1 = EMB.getInstance().HJA();
            if (var1 != null) {
                this.fxml_config_change_password.setDisable(true);
                FCR.getMessageBoxDialogWithHyperLink(this.resources.getString("micro.changePassword.title"), "Zmiana hasła wyłączona, należy usunąć plik:\n", new File(var1), 500.0, 75.0);

                try {
                    Desktop var2 = null;
                    if (Desktop.isDesktopSupported()) {
                        var2 = Desktop.getDesktop();
                        var2.open(Application.getHomeDir().toFile());
                    }
                } catch (Exception var5) {
                    org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var5);
                }
            } else {
                this.fxml_config_change_password.setDisable(false);
                if (!(Boolean) EMB.getInstance().getCurrentUser().getUsePassword().getValue()) {
                    this.fxml_config_change_password.setText(this.resources.getString("micro.changePassword.addPassword.title"));
                } else {
                    this.fxml_config_change_password.setText(this.resources.getString("micro.changePassword.button.changePassword"));
                }
            }

            if (this.fxml_config_delete_password != null) {
                this.fxml_config_delete_password.setDisable(!(Boolean) EMB.getInstance().getCurrentUser().getUsePassword().getValue());
            }

            this.fxml_listview_sequence_names_list.getItems().clear();
            Iterator var7 = this.QZS.keySet().iterator();

            while (var7.hasNext()) {
                String var3 = (String) var7.next();
                ERP var4 = ERP.RKJ(var3);
                this.fxml_listview_sequence_names_list.getItems().add(var4);
            }

            this.fxml_listview_sequence_names_list.getItems().sort(new Comparator<ERP>() {
                public int compare(ERP var1, ERP var2) {
                    if (var1 != null && var2 != null) {
                        return var1.compareTo(var2);
                    } else if (var1 != null && var2 == null) {
                        return 1;
                    } else {
                        return var1 == null && var2 != null ? -1 : 0;
                    }
                }
            });
        } catch (FFK var6) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var6);
        }

    }

    public interface QTC {
        void RKK(String var1, JN var2, Integer var3, Integer var4);
    }
}
