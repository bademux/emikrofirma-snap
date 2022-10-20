package a.a.a.c.c.e.i.a;

import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.c.b.a.BaseFxController;
import a.a.a.c.c.d.d.*;
import a.a.a.c.c.e.i.a.a.ETW;
import a.a.a.c.c.e.i.c.EUE;
import a.a.a.c.c.e.i.d.EUF;
import a.a.a.c.f.a.a.EYQ;
import a.a.a.c.f.a.d.*;
import a.a.a.c.f.b.b.Period;
import a.a.a.c.f.b.c.JY;
import a.a.a.c.g.MSX;
import a.a.a.c.g.MTI;
import a.a.a.c.g.a.FCR;
import a.a.a.c.g.a.FCT;
import a.a.a.c.g.b.FCW;
import com.github.bademux.emk.app.FXApp;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Pagination;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import lombok.extern.slf4j.Slf4j;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.util.Date;
import java.util.List;

@Slf4j
public class ETZ extends BaseFxController {
    private static final int GJQ = 50;
    @FXML
    private TableView<DeclarationJPK> fxml_declaration_list_declaration_table;
    @FXML
    private TableColumn<DeclarationJPK, String> fxml_declaration_list_declaration_table_declaration_docname;
    @FXML
    private TableColumn<DeclarationJPK, String> fxml_declaration_list_declaration_table_declaration_filename;
    @FXML
    private TableColumn<DeclarationJPK, Period> fxml_declaration_list_declaration_table_declaration_period;
    @FXML
    private TableColumn<DeclarationJPK, Date> fxml_declaration_list_declaration_table_declaration_send_date;
    @FXML
    private TableColumn<DeclarationJPK, AGWW> fxml_declaration_list_declaration_table_declaration_subtype;
    @FXML
    private TableColumn<DeclarationJPK, JY> fxml_declaration_list_declaration_table_declaration_purpose;
    @FXML
    private TableColumn<DeclarationJPK, Period> fxml_declaration_list_declaration_table_declaration_source;
    @FXML
    private TableColumn<DeclarationJPK, HL> fxml_declaration_list_declaration_table_declaration_status;
    @FXML
    private TableColumn<DeclarationJPK, EHK> fxml_declaration_list_declaration_table_declaration_sign_type;
    @FXML
    private EYQ fxml_declaration_list_jpk_ref_idController;
    @FXML
    private Button fxml_declaration_list_track_jpk_status_button;
    @FXML
    Pagination fxml_declaration_list_pagination;
    private int GJR = 1;
    private List<DeclarationJPK> GJS;
    public BooleanProperty GJT = new SimpleBooleanProperty(false);
    public BooleanProperty GJU = new SimpleBooleanProperty(false);
    public BooleanProperty GJV = new SimpleBooleanProperty(false);
    public BooleanProperty QHS = new SimpleBooleanProperty(false);
    private EUF QHT;
    private EUA QHU;
    private Node QHV;

    public ETZ(FXApp var1, String var2) {
        super(var1, var2);
    }

    public void setFxml_parent_node(Node var1) {
        this.QHV = var1;
    }

    public void setImplementation(EUF var1) {
        this.QHT = var1;
    }

    public void setParent(EUA var1) {
        this.QHU = var1;
    }

    @FXML
    public void initialize() {
        this.fxml_declaration_list_declaration_table_declaration_docname.setCellValueFactory(new PropertyValueFactory("referenceId"));
        this.fxml_declaration_list_declaration_table_declaration_filename.setCellValueFactory(new PropertyValueFactory("declarationFileName"));
        this.fxml_declaration_list_declaration_table_declaration_period.setCellValueFactory(new PropertyValueFactory("period"));
        this.fxml_declaration_list_declaration_table_declaration_period.setCellFactory(new ENZ());
        this.fxml_declaration_list_declaration_table_declaration_purpose.setCellValueFactory(new PropertyValueFactory("declarationReason"));
        this.fxml_declaration_list_declaration_table_declaration_purpose.setCellFactory(new EOJ());
        this.fxml_declaration_list_declaration_table_declaration_send_date.setCellValueFactory(new PropertyValueFactory("creationDateTime"));
        this.fxml_declaration_list_declaration_table_declaration_send_date.setCellFactory(new ENT());
        this.fxml_declaration_list_declaration_table_declaration_subtype.setCellValueFactory(new PropertyValueFactory("declarationSubType"));
        this.fxml_declaration_list_declaration_table_declaration_subtype.setCellFactory(new EOG());
        this.fxml_declaration_list_declaration_table_declaration_source.setCellValueFactory(new PropertyValueFactory("period"));
        this.fxml_declaration_list_declaration_table_declaration_source.setCellFactory(new EOI());
        this.fxml_declaration_list_declaration_table_declaration_status.setCellValueFactory(new PropertyValueFactory("declarationStatus"));
        this.fxml_declaration_list_declaration_table_declaration_status.setCellFactory(new EOG());
        this.fxml_declaration_list_declaration_table_declaration_sign_type.setCellValueFactory(new PropertyValueFactory("signatureType"));
        this.fxml_declaration_list_declaration_table_declaration_sign_type.setCellFactory(new EOG());
        this.fxml_declaration_list_declaration_table.getSelectionModel().selectedItemProperty().addListener(new ETW(this));
        this.fxml_declaration_list_declaration_table.setFixedCellSize(30.0);
        this.fxml_declaration_list_declaration_table.setMinHeight(this.fxml_declaration_list_declaration_table.getFixedCellSize() * 2.0);
        this.fxml_declaration_list_declaration_table.maxHeightProperty().bind(this.fxml_declaration_list_declaration_table.prefHeightProperty());
        this.fxml_declaration_list_declaration_table.setRowFactory(new EUE());
        this.fxml_declaration_list_track_jpk_status_button.disableProperty().bind(this.fxml_declaration_list_jpk_ref_idController.validProperty().not());
    }

    public boolean HHB() {

        boolean var1;
        this.fxml_declaration_list_declaration_table.getItems().clear();
        var1 = true;

        return var1;
    }

    public void HHC() {

        this.HWK();

    }

    private Node HWI(int var1) {

        VBox var2;
        this.GJR = var1;
        this.HWJ();
        this.setTableHeight();
        var2 = new VBox(this.fxml_declaration_list_declaration_table);

        return var2;
    }

    private void setTableHeight() {

        this.fxml_declaration_list_declaration_table.setPrefHeight(this.fxml_declaration_list_declaration_table.getFixedCellSize() * ((double) this.fxml_declaration_list_declaration_table.getItems().size() + 1.1));

    }

    private void HWJ() {

        if (this.GJS == null) {
            return;
        }

        int var1 = this.GJR * 50;
        int var2 = Math.min(var1 + 50, this.GJS.size());
        List var3 = this.GJS.subList(var1, var2);
        this.fxml_declaration_list_declaration_table.setItems(FXCollections.observableArrayList(var3));

    }

    public List<DeclarationJPK> getDeclarations() {
        return this.GJS;
    }

    public Declaration getSelectedDeclaration() {
        return this.fxml_declaration_list_declaration_table.getSelectionModel().getSelectedItem();
    }

    public void setDeclarations(List<DeclarationJPK> var1) {
        this.GJS = var1;
    }

    public void HWK() {

        this.fxml_declaration_list_declaration_table.getItems().clear();
        this.fxml_declaration_list_pagination.setPageCount(1);
        this.fxml_declaration_list_pagination.setPageFactory(this::HWI);
        this.fxml_declaration_list_pagination.setCurrentPageIndex(0);
        if (this.GJS != null) {
            if (this.GJS.size() % 50 > 0) {
                this.fxml_declaration_list_pagination.setPageCount(this.GJS.size() / 50 + 1);
            } else {
                this.fxml_declaration_list_pagination.setPageCount(this.GJS.size() / 50);
            }

            this.fxml_declaration_list_declaration_table.setItems(FXCollections.observableArrayList(this.GJS));
        }

    }

    @FXML
    protected void fxml_handleButton_declaration_list_track_jpk_status(ActionEvent var1) {

        try {
            final DeclarationJPK_StatusTracker var2 = new DeclarationJPK_StatusTracker(this.fxml_declaration_list_jpk_ref_idController.fxml_component_main_element.getText());
            Integer var3 = this.QHT.HXA(Period.AOE, HM.JPK, AGWW.STATUS_TRACKER);
            var2.FJI().setValue(var3);
            final MTI var4 = new MTI(null);
            final MTI var5 = new MTI(Boolean.FALSE);
            MSX var6 = new MSX(this.primaryStage, this.QHV.disableProperty()) {
                public void MXI() {

                    try {
                        var5.setObject(ETZ.this.QHT.QIX(var2));
                    } catch (FFO | FFK var6) {
                        log.error("Something bad happened", var6);
                        var4.setObject(var6);
                    } catch (Exception var7) {
                        log.error("Something bad happened", var7);
                        var4.setObject(var7);
                    }

                }

                public void MXJ() {

                    try {
                        if (var4.getObject() == null) {
                            if ((Boolean) var5.getObject()) {
                                JSONString var1 = var2.getStatusResponseJSON();
                                JSONObject var2x = var1.getValueAsJSONObject();
                                Long var3 = (Long) var2x.get("Code");
                                String var4x = (String) var2x.get("Description");
                                FCR.QGV var5x = FCR.getJpkStatusDialogResult(FCW.getInstance().getMessageForKey("micro.process.jpk_list.checkstatusdialog.title"), FCW.getInstance().getMessageForKey("micro.process.jpk_list.checkstatusdialog.header"), 800.0, 150.0, var3 + ",  " + var4x, var3 == 200L);
                                if (var5x == FCR.QGV.PRINT_UPO) {
                                    ETZ.this.QHU.HWM(var2);
                                }

                                ETZ.this.fxml_declaration_list_jpk_ref_idController.fxml_component_main_element.setText("");
                            } else {
                                FCR.IGM(ETZ.this.resources.getString("micro.process.common.jpk.jpkobservererror.title"), ETZ.this.resources.getString("micro.process.common.jpk.jpkobservererror.header"), ETZ.this.resources.getString("micro.process.common.jpk.jpkobservererror.content"), false);
                            }
                        } else {
                            log.error("Something bad happened", (Throwable) var4.getObject());
                            FCT.IGX(ETZ.this.resources.getString("micro.process.common.jpk.error.checkState"), (Exception) var4.getObject());
                        }
                    } catch (ParseException var9) {
                        log.error("Something bad happened", var9);
                        FCT.IGX(ETZ.this.resources.getString("micro.process.common.jpk.error.checkState"), var9);
                    } finally {
                        ETZ.this.QHV.requestFocus();

                    }

                }
            };
            var6.MXH();
        } catch (FFK var10) {
            log.error("Something bad happened", var10);
            FCT.IGX(this.resources.getString("micro.process.common.jpk.error.checkState"), var10);
        }

    }
}
