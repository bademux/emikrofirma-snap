package a.a.a.c.c.e.f.a;

import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.c.b.EMC;
import a.a.a.c.c.b.a.b.a.EMP;
import a.a.a.c.c.b.a.b.a.EMR;
import a.a.a.c.c.b.b.EMT;
import a.a.a.c.c.d.a.ENJ;
import a.a.a.c.c.e.f.c.ETM;
import a.a.a.c.f.a.a.EYX;
import a.a.a.c.f.a.e.a.IC;
import a.a.a.c.f.a.e.a.ID;
import a.a.a.c.f.a.e.a.IH;
import a.a.a.c.f.a.h.JF;
import a.a.a.c.f.b.b.JN;
import a.a.a.c.g.a.FCT;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import org.xml.sax.SAXException;

import java.util.Date;
import java.util.Iterator;
import java.util.Set;

public class ETJ extends ENJ<ETM> {
    @FXML
    private TableView<ID> fxml_vat_invoice_record_sales_table;
    @FXML
    private TableView<ID> fxml_vat_invoice_record_purchases_table;
    @FXML
    private Button fxml_button_print;
    @FXML
    private Button fxml_button_close;
    @FXML
    private EYX fxml_include_period_boxController;
    @FXML
    private HBox fxml_vat_invoice_record_sales_summary;
    @FXML
    private HBox fxml_vat_invoice_record_purchases_summary;
    @FXML
    private ScrollPane fxml_vat_invoice_record_sales_summary_scroll;
    @FXML
    private ScrollPane fxml_vat_invoice_record_purchases_summary_scroll;
    @FXML
    private VBox fxml_vat_invoice_record_key;
    @FXML
    private TableView<IC> fxml_vat_invoice_record_sales_summary_table;
    @FXML
    private TableView<IC> fxml_vat_invoice_record_purchases_summary_table;
    @FXML
    private TabPane fxml_tab_pane;
    private JN GGZ;
    private JF GHA;
    private String GHB;
    private IC GHC;
    private IC GHD;
    private Date GHE;
    private ETK GHF;
    private ETF GHG;
    private ETF GHH;
    @FXML
    private EMR fxml_include_top_menuController;
    @FXML
    private EMP fxml_include_left_barController;

    public ETJ(EMC var1, EMT var2, String var3, String var4) {
        super(var1, var2, var3, var4);

    }

    public void HHE() throws FFK {

        super.HHE();
        this.fxml_include_top_menuController.fxml_top_menu.labelProperty().set(this.resources.getString("micro.process.invoices_records.title"));
        this.GHE = new Date();
        this.GHF = new ETK(this.resources);
        this.GHG = new ETF(this.fxml_vat_invoice_record_sales_table, false, this.resources, this.fxml_vat_invoice_record_sales_summary_table);
        this.GHH = new ETF(this.fxml_vat_invoice_record_purchases_table, true, this.resources, this.fxml_vat_invoice_record_purchases_summary_table);
        this.GHG.initialize();
        this.GHH.initialize();
        this.fxml_include_period_boxController.initialize(false);
        this.setBackIfEmpty();
        this.HVD();

    }

    public boolean HHB() {

        boolean var1;
        this.fxml_include_period_boxController.setListener(null);
        this.fxml_include_period_boxController.setPeriod(null);
        this.GGZ = null;
        this.GHA = null;
        this.fxml_button_print.disableProperty().unbind();
        this.fxml_include_top_menuController.HHB();
        this.fxml_include_left_barController.HHB();
        var1 = true;

        return var1;
    }

    public void HHC() {

        try {
            ETM var1 = this.HHG();
            org.slf4j.LoggerFactory.getLogger(getClass()).debug("implementation " + var1);
            this.HVE();
            this.fxml_include_period_boxController.setListener(new ChangeListener<Integer>() {
                public void changed(ObservableValue<? extends Integer> var1, Integer var2, Integer var3) {
                    ETJ.this.HVG();
                }
            });
            this.HVG();
            this.setBackIfEmpty();
            this.fxml_include_top_menuController.fxml_top_menu.labelProperty().set(this.resources.getString("micro.process.invoices_records.title"));
            this.fxml_include_top_menuController.HHC();
            this.fxml_include_left_barController.HHC();
            this.fxml_parent.requestFocus();
        } catch (FFO | FFK var5) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var5);
            FCT.IGX("", var5);
        }

    }

    private void HVD() {

        String var1 = "%s - %s";
        this.fxml_vat_invoice_record_key.getChildren().add(new Text(String.format(var1, this.resources.getString("micro.process.invoices_records.vatNpColAbbr"), this.resources.getString("micro.process.invoices_records.vatNpCol"))));
        this.fxml_vat_invoice_record_key.getChildren().add(new Text(String.format(var1, this.resources.getString("micro.process.invoices_records.vatZwColAbbr"), this.resources.getString("micro.process.invoices_records.vatZwCol"))));
        this.fxml_vat_invoice_record_key.getChildren().add(new Text(String.format(var1, this.resources.getString("micro.process.invoices_records.vatOoColAbbr"), this.resources.getString("micro.process.invoices_records.vatOoCol"))));

    }

    private void HVE() {

        if (this.GGZ == null) {
            this.GGZ = this.getLastPeriod();
        }

        this.fxml_include_period_boxController.setPeriod(this.GGZ);

    }

    private void setBackIfEmpty() {
        if (this.GHB == null) {
            this.GHB = "main.fxml";
        }

    }

    private void HVF() throws FFK, FFO {

        if (this.GHA != null || this.GGZ != null) {
            Set var1 = null;
            if (this.GHA != null) {
                this.GGZ = this.GHA.getPeriod();
                var1 = this.getProcess().getInvoiceRecords(this.GHA);
                this.GHA = null;
            } else if (this.GGZ != null) {
                var1 = this.getProcess().getInvoiceRecords(this.GGZ);
            }

            if (var1 != null && var1.size() == 2) {
                Iterator var2 = var1.iterator();

                while (var2.hasNext()) {
                    IC var3 = (IC) var2.next();
                    if (IH.SELL.equals(var3.getInvoiceRecordType())) {
                        this.GHC = var3;
                    } else {
                        this.GHD = var3;
                    }
                }

                this.GHF.setSalesRegister(this.GHC, this.getProcess().getUserData(this.GHC.getUserDataVersion().getValue()));
                this.GHF.setPurchasesRegister(this.GHD, this.getProcess().getUserData(this.GHD.getUserDataVersion().getValue()));
                this.fxml_button_print.setDisable(false);
            } else {
                this.GHC = null;
                this.GHD = null;
                this.fxml_button_print.setDisable(true);
            }

            boolean var4 = this.GHC != null || this.GHD != null;
            this.GHG.HUT(this.GHC, var4);
            this.GHH.HUT(this.GHD, var4);
        }

    }

    private void HVG() {

        JN var1;
        if (this.fxml_include_period_boxController.getPeriod() != null) {
            var1 = new JN(this.fxml_include_period_boxController.getPeriod());
        } else {
            var1 = JN.AOE;
        }

        if (var1 != null) {
            this.GGZ = var1;

            try {
                this.HVF();
            } catch (FFO | FFK var3) {
                org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var3);
                throw new FFI(var3);
            }
        }

    }

    @FXML
    protected void fxml_handleButton_close(ActionEvent var1) {

        org.slf4j.LoggerFactory.getLogger(getClass()).info("Button [close] clicked");
        this.getApplication().HJD(this.getFxmlName(), this.GHB);

    }

    @FXML
    protected void fxml_handleButton_print(ActionEvent var1) throws FFK, FFO {

        try {
            if (this.fxml_tab_pane.getSelectionModel().getSelectedIndex() == 0) {
                org.slf4j.LoggerFactory.getLogger(getClass()).info("Button [print sales] clicked ");
                this.GHF.HVH(this.getProcess().getTempFile("pdf"));
            } else {
                org.slf4j.LoggerFactory.getLogger(getClass()).info("Button [print purchases] clicked");
                this.GHF.HVI(this.getProcess().getTempFile("pdf"));
            }
        } catch (SAXException var6) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var6);
            FCT.IGX("", var6);
        }

    }

    public void setPeriod(JN var1) throws FFK {
        this.setCurrentPeriod(var1);
    }

    public void setSettlement(JF var1) throws FFK {
        this.GHA = var1;
        if (this.GHA != null) {
            this.setCurrentPeriod(this.GHA.getPeriod());
        }

    }

    private void setCurrentPeriod(JN var1) {
        this.GGZ = var1;
    }

    public void setExplicitBack(String var1) {
        this.GHB = var1;
    }

    public JN getLastPeriod() {

        JN var1;
        try {
            var1 = new JN(this.GHE);
        } catch (FFK var5) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var5);
            throw new FFI(var5);
        }

        return var1;
    }
}
