package a.a.a.c.c.e.l.a;

import a.a.a.b.c.FEN;
import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.b.EDF;
import a.a.a.c.c.b.EMC;
import a.a.a.c.c.b.ENB;
import a.a.a.c.c.b.a.b.a.EMP;
import a.a.a.c.c.b.a.b.a.EMR;
import a.a.a.c.c.b.b.EMT;
import a.a.a.c.c.d.ENI;
import a.a.a.c.c.d.EOS;
import a.a.a.c.c.d.a.ENN;
import a.a.a.c.c.d.a.ENO;
import a.a.a.c.c.d.b.ENP;
import a.a.a.c.c.d.d.EOK;
import a.a.a.c.c.d.d.EOM;
import a.a.a.c.c.d.d.EOQ;
import a.a.a.c.c.d.g.EOX;
import a.a.a.c.c.d.g.EOZ;
import a.a.a.c.c.d.g.EPA;
import a.a.a.c.c.d.g.EPB;
import a.a.a.c.c.d.h.EPE;
import a.a.a.c.c.d.h.EPI;
import a.a.a.c.c.e.l.c.EVJ;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.a.EZG;
import a.a.a.c.f.a.e.HN;
import a.a.a.c.f.a.e.HU;
import a.a.a.c.f.a.e.HV;
import a.a.a.c.f.a.e.HY;
import a.a.a.c.f.a.h.JG;
import a.a.a.c.f.b.b.JN;
import a.a.a.c.f.b.c.JS;
import a.a.a.c.f.b.c.JV;
import a.a.a.c.f.b.c.a.KH;
import a.a.a.c.f.b.c.a.QSW;
import a.a.a.c.f.c.b.LY;
import a.a.a.c.f.c.c.DatePickerRequired;
import a.a.a.c.f.c.c.TextFieldValidated_Text;
import a.a.a.c.g.MSX;
import a.a.a.c.g.MTI;
import a.a.a.c.g.a.FCR;
import a.a.a.c.g.a.FCT;
import a.a.a.c.g.c.FCZ;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeSet;
import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.Pagination;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.control.cell.TextFieldTreeTableCell;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Callback;

public class EVD extends ENO<EVJ> {
   @FXML
   private EMP fxml_include_left_barController;
   @FXML
   private EMR fxml_include_top_menuController;
   private static final int GNT = 50;
   @FXML
   private Pagination fxml_invoice_sale_list_pagination;
   @FXML
   private Button fxml_invoice_sale_list_button_edit;
   @FXML
   private Button fxml_invoice_sale_list_button_correct;
   @FXML
   private Button fxml_invoice_sale_list_button_view;
   @FXML
   private Button fxml_invoice_sale_list_button_set_receive_date;
   @FXML
   private Button fxml_invoice_sale_list_button_print;
   @FXML
   private Button fxml_invoice_sale_list_button_new_invoice;
   @FXML
   private Button fxml_invoice_sale_list_button_cancel;
   @FXML
   private Label fxml_invoice_sale_list_button_edit_error_label;
   @FXML
   private Label fxml_invoice_sale_list_button_correct_error_label;
   @FXML
   private Label fxml_invoice_sale_list_button_view_error_label;
   @FXML
   private Label fxml_invoice_sale_list_button_set_receive_date_error_label;
   @FXML
   private TreeTableView<EVG> fxml_invoice_sale_list_table_tree;
   @FXML
   private TreeTableColumn<EVG, String> fxml_invoice_sale_list_tree_table_column_invoice_type;
   @FXML
   private TreeTableColumn<EVG, String> fxml_invoice_sale_list_tree_table_column_ref_id;
   @FXML
   private TreeTableColumn<EVG, String> fxml_invoice_sale_list_tree_table_column_parent_ref_id;
   @FXML
   private TreeTableColumn<EVG, LocalDate> fxml_invoice_sale_list_tree_table_column_invoicing_date;
   @FXML
   private TreeTableColumn<EVG, String> fxml_invoice_sale_new_elements_tree_table_contractor_name;
   @FXML
   private TreeTableColumn<EVG, String> fxml_invoice_sale_new_elements_tree_table_contractor_nip;
   @FXML
   private TreeTableColumn<EVG, BigDecimal> fxml_invoice_sale_list_tree_table_column_sum_net;
   @FXML
   private TreeTableColumn<EVG, BigDecimal> fxml_invoice_sale_list_tree_table_column_sum_tax;
   @FXML
   private TreeTableColumn<EVG, BigDecimal> fxml_invoice_sale_list_tree_table_column_sum_brut;
   @FXML
   private TreeTableColumn<EVG, String> fxml_invoice_sale_list_tree_table_column_canceled;
   @FXML
   private ComboBox<KH> fxml_invoice_sale_list_month;
   @FXML
   private ComboBox<String> fxml_invoice_sale_list_year;
   @FXML
   private EZG fxml_invoice_sale_list_searchController;
   @FXML
   private ComboBox<String> fxml_invoice_sale_list_year_search;
   @FXML
   private CheckBox fxml_invoice_sale_list_only_empty_period;
   @FXML
   private CheckBox fxml_invoice_sale_list_canceled_invoices;
   @FXML
   private TableView<EOX<String>> fxml_invoice_sale_list_summary_table;
   @FXML
   private TableColumn<EOX<String>, String> fxml_invoice_sale_list_summary_table_column_name;
   @FXML
   private TableColumn<EOX<String>, BigDecimal> fxml_invoice_sale_list_summary_table_column_sum_net;
   @FXML
   private TableColumn<EOX<String>, BigDecimal> fxml_invoice_sale_list_summary_table_column_sum_tax;
   @FXML
   private TableColumn<EOX<String>, BigDecimal> fxml_invoice_sale_list_summary_table_column_sum_brut;
   @FXML
   private CheckBox fxml_invoice_sale_list_extended_view;
   @FXML
   private ScrollPane fxml_invoice_sale_list_scroll_pane;
   private SortedMap<String, SortedSet<KH>> GNU;
   private DecimalFormat GNV = ENI.get();
   private boolean GNW = false;
   private int GNX = 0;
   private boolean GNY = true;
   private String GNZ;
   private String GOA;
   private KH GOB;
   protected final ListProperty<EOX<String>> GOC = new SimpleListProperty(FXCollections.observableArrayList());
   private List<EPA<HY>> GOD;
   private ChangeListener<Boolean> GOE = new ChangeListener<Boolean>() {
      public void changed(ObservableValue<? extends Boolean> var1, Boolean var2, Boolean var3) {
         EXF.getInstance().ICO();

         try {
            EVD.this.setExtendedView(var3);
            EXF.getInstance().ICE("Extended view checkbox set to " + var3);
         } finally {
            EXF.getInstance().ICP();
         }

      }
   };
   private QHB GOF = new QHB();
   private QHC GOG = new QHC();
   private QHD QIL = new QHD();
   private QHE QIM = new QHE();
   private QTK RAP = new QTK();
   private ChangeListener<Boolean> GOH = new ChangeListener<Boolean>() {
      public void changed(ObservableValue<? extends Boolean> var1, Boolean var2, Boolean var3) {
         EVD.this.setTableHeight();
      }
   };
   private JN GOI = null;

   public EVD(EMC var1, EMT var2, String var3, String var4) {
      super(var1, var2, var3, var4);
      EXF.getInstance().ICQ();
   }

   @FXML
   public void initialize() {
      EXF.getInstance().ICO();

      try {
         this.GNZ = this.resources.getString("micro.process.invoice_sale_list.SearchAll");
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public void HHE() {
      EXF.getInstance().ICO();

      try {
         super.HHE();
         ((TextFieldValidated_Text)this.fxml_invoice_sale_list_searchController.fxml_component_main_element).setPromptText(this.resources.getString("micro.process.invoice_sale_list.Find"));
         this.fxml_invoice_sale_list_table_tree.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<TreeItem<EVG>>() {
            public void changed(ObservableValue<? extends TreeItem<EVG>> var1, TreeItem<EVG> var2, TreeItem<EVG> var3) {
               if (var3 != null) {
                  EVD.this.HYS();
               } else {
                  EVD.this.setAllDisabled();
               }

            }
         });
         this.fxml_invoice_sale_list_table_tree.setShowRoot(false);
         this.fxml_invoice_sale_list_table_tree.setRowFactory(new EOM());
         this.fxml_invoice_sale_list_tree_table_column_sum_net.setCellFactory(TextFieldTreeTableCell.forTreeTableColumn(new EOK(this.GNV, 2)));
         this.fxml_invoice_sale_list_tree_table_column_sum_tax.setCellFactory(TextFieldTreeTableCell.forTreeTableColumn(new EOK(this.GNV, 2)));
         this.fxml_invoice_sale_list_tree_table_column_sum_brut.setCellFactory(TextFieldTreeTableCell.forTreeTableColumn(new EOK(this.GNV, 2)));
         this.fxml_invoice_sale_list_tree_table_column_invoice_type.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<EVG, String>, ObservableValue<String>>() {
            public ObservableValue<String> call(TreeTableColumn.CellDataFeatures<EVG, String> var1) {
               return ((EVG)var1.getValue().getValue()).getInvoicetype();
            }
         });
         this.fxml_invoice_sale_list_tree_table_column_ref_id.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<EVG, String>, ObservableValue<String>>() {
            public ObservableValue<String> call(TreeTableColumn.CellDataFeatures<EVG, String> var1) {
               return ((EVG)var1.getValue().getValue()).getRefId();
            }
         });
         this.fxml_invoice_sale_list_tree_table_column_parent_ref_id.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<EVG, String>, ObservableValue<String>>() {
            public ObservableValue<String> call(TreeTableColumn.CellDataFeatures<EVG, String> var1) {
               return ((EVG)var1.getValue().getValue()).getParentRefId();
            }
         });
         this.fxml_invoice_sale_list_tree_table_column_invoicing_date.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<EVG, LocalDate>, ObservableValue<LocalDate>>() {
            public ObservableValue<LocalDate> call(TreeTableColumn.CellDataFeatures<EVG, LocalDate> var1) {
               return ((EVG)var1.getValue().getValue()).getInvoicingDate();
            }
         });
         this.fxml_invoice_sale_new_elements_tree_table_contractor_name.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<EVG, String>, ObservableValue<String>>() {
            public ObservableValue<String> call(TreeTableColumn.CellDataFeatures<EVG, String> var1) {
               return ((EVG)var1.getValue().getValue()).getContractorName();
            }
         });
         this.fxml_invoice_sale_new_elements_tree_table_contractor_nip.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<EVG, String>, ObservableValue<String>>() {
            public ObservableValue<String> call(TreeTableColumn.CellDataFeatures<EVG, String> var1) {
               return ((EVG)var1.getValue().getValue()).getContractorNip();
            }
         });
         this.fxml_invoice_sale_list_tree_table_column_sum_net.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<EVG, BigDecimal>, ObservableValue<BigDecimal>>() {
            public ObservableValue<BigDecimal> call(TreeTableColumn.CellDataFeatures<EVG, BigDecimal> var1) {
               return ((EVG)var1.getValue().getValue()).getSumNet();
            }
         });
         this.fxml_invoice_sale_list_tree_table_column_sum_tax.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<EVG, BigDecimal>, ObservableValue<BigDecimal>>() {
            public ObservableValue<BigDecimal> call(TreeTableColumn.CellDataFeatures<EVG, BigDecimal> var1) {
               return ((EVG)var1.getValue().getValue()).getSumTax();
            }
         });
         this.fxml_invoice_sale_list_tree_table_column_sum_brut.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<EVG, BigDecimal>, ObservableValue<BigDecimal>>() {
            public ObservableValue<BigDecimal> call(TreeTableColumn.CellDataFeatures<EVG, BigDecimal> var1) {
               return ((EVG)var1.getValue().getValue()).getSumBrut();
            }
         });
         this.fxml_invoice_sale_list_tree_table_column_canceled.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<EVG, String>, ObservableValue<String>>() {
            public ObservableValue<String> call(TreeTableColumn.CellDataFeatures<EVG, String> var1) {
               return ((EVG)var1.getValue().getValue()).getCanceled();
            }
         });
         this.fxml_invoice_sale_list_month.setCellFactory(new EOQ());
         this.fxml_invoice_sale_list_month.setButtonCell((ListCell)this.fxml_invoice_sale_list_month.getCellFactory().call(null));
         this.fxml_invoice_sale_list_year.valueProperty().addListener(this.GOG);
         this.fxml_invoice_sale_list_month.valueProperty().addListener(this.GOF);
         this.fxml_invoice_sale_list_year_search.valueProperty().addListener(this.QIL);
         ((TextFieldValidated_Text)this.fxml_invoice_sale_list_searchController.fxml_component_main_element).textProperty().addListener(this.QIL);
         this.fxml_invoice_sale_list_summary_table_column_sum_net.setCellFactory(TextFieldTableCell.forTableColumn(new EOK(this.GNV, 2)));
         this.fxml_invoice_sale_list_summary_table_column_sum_tax.setCellFactory(TextFieldTableCell.forTableColumn(new EOK(this.GNV, 2)));
         this.fxml_invoice_sale_list_summary_table_column_sum_brut.setCellFactory(TextFieldTableCell.forTableColumn(new EOK(this.GNV, 2)));
         this.fxml_invoice_sale_list_summary_table_column_sum_net.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<EOX<String>, BigDecimal>, ObservableValue<BigDecimal>>() {
            public ObservableValue<BigDecimal> call(TableColumn.CellDataFeatures<EOX<String>, BigDecimal> var1) {
               return ((EOX)var1.getValue()).getSumNet();
            }
         });
         this.fxml_invoice_sale_list_summary_table_column_sum_tax.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<EOX<String>, BigDecimal>, ObservableValue<BigDecimal>>() {
            public ObservableValue<BigDecimal> call(TableColumn.CellDataFeatures<EOX<String>, BigDecimal> var1) {
               return ((EOX)var1.getValue()).getSumTax();
            }
         });
         this.fxml_invoice_sale_list_summary_table_column_sum_brut.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<EOX<String>, BigDecimal>, ObservableValue<BigDecimal>>() {
            public ObservableValue<BigDecimal> call(TableColumn.CellDataFeatures<EOX<String>, BigDecimal> var1) {
               return ((EOX)var1.getValue()).getSumBrut();
            }
         });
         this.fxml_invoice_sale_list_summary_table_column_name.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<EOX<String>, String>, ObservableValue<String>>() {
            public ObservableValue<String> call(TableColumn.CellDataFeatures<EOX<String>, String> var1) {
               return ((EOX)var1.getValue()).getTaxRate();
            }
         });
         this.fxml_invoice_sale_list_summary_table.setItems(this.GOC);
         this.fxml_invoice_sale_list_table_tree.setFixedCellSize(30.0);
         this.fxml_invoice_sale_list_table_tree.setMinHeight(this.fxml_invoice_sale_list_table_tree.getFixedCellSize() * 2.0);
         this.fxml_invoice_sale_list_table_tree.maxHeightProperty().bind(this.fxml_invoice_sale_list_table_tree.prefHeightProperty());
         this.fxml_invoice_sale_list_summary_table_column_name.minWidthProperty().bind(this.fxml_invoice_sale_list_tree_table_column_invoice_type.widthProperty().add(this.fxml_invoice_sale_list_tree_table_column_ref_id.widthProperty()).add(this.fxml_invoice_sale_list_tree_table_column_parent_ref_id.widthProperty()).add(this.fxml_invoice_sale_list_tree_table_column_invoicing_date.widthProperty()).add(this.fxml_invoice_sale_new_elements_tree_table_contractor_name.widthProperty()).add(this.fxml_invoice_sale_new_elements_tree_table_contractor_nip.widthProperty()).add(this.fxml_invoice_sale_list_tree_table_column_canceled.widthProperty()));
         this.fxml_invoice_sale_list_summary_table_column_name.maxWidthProperty().bind(this.fxml_invoice_sale_list_tree_table_column_invoice_type.widthProperty().add(this.fxml_invoice_sale_list_tree_table_column_ref_id.widthProperty()).add(this.fxml_invoice_sale_list_tree_table_column_parent_ref_id.widthProperty()).add(this.fxml_invoice_sale_list_tree_table_column_invoicing_date.widthProperty()).add(this.fxml_invoice_sale_new_elements_tree_table_contractor_name.widthProperty()).add(this.fxml_invoice_sale_new_elements_tree_table_contractor_nip.widthProperty().add(this.fxml_invoice_sale_list_tree_table_column_canceled.widthProperty())));
         this.fxml_invoice_sale_list_summary_table_column_sum_net.minWidthProperty().bind(this.fxml_invoice_sale_list_tree_table_column_sum_net.widthProperty());
         this.fxml_invoice_sale_list_summary_table_column_sum_net.maxWidthProperty().bind(this.fxml_invoice_sale_list_tree_table_column_sum_net.widthProperty());
         this.fxml_invoice_sale_list_summary_table_column_sum_tax.minWidthProperty().bind(this.fxml_invoice_sale_list_tree_table_column_sum_tax.widthProperty());
         this.fxml_invoice_sale_list_summary_table_column_sum_tax.maxWidthProperty().bind(this.fxml_invoice_sale_list_tree_table_column_sum_tax.widthProperty());
         this.fxml_invoice_sale_list_summary_table_column_sum_brut.minWidthProperty().bind(this.fxml_invoice_sale_list_tree_table_column_sum_brut.widthProperty());
         this.fxml_invoice_sale_list_summary_table_column_sum_brut.maxWidthProperty().bind(this.fxml_invoice_sale_list_tree_table_column_sum_brut.widthProperty());
         this.fxml_invoice_sale_list_only_empty_period.selectedProperty().addListener(this.QIM);
         this.fxml_invoice_sale_list_canceled_invoices.selectedProperty().addListener(this.RAP);
      } catch (FFK var5) {
         EXF.getInstance().ICA((Throwable)var5);
         FCT.IGX("", var5);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public boolean HHB() {
      EXF.getInstance().ICO();

      boolean var1;
      try {
         this.fxml_invoice_sale_list_extended_view.selectedProperty().removeListener(this.GOE);
         this.GOI = null;
         this.fxml_include_left_barController.HHB();
         this.fxml_include_top_menuController.HHB();
         this.QIM.QJN();
         this.fxml_invoice_sale_list_only_empty_period.setSelected(false);
         this.QIM.QJO();
         this.RAP.RKT();
         this.fxml_invoice_sale_list_canceled_invoices.setSelected(false);
         this.RAP.RKU();
         var1 = true;
      } finally {
         EXF.getInstance().ICP();
      }

      return var1;
   }

   private void HYO(boolean var1) {
      EXF.getInstance().ICO();

      try {
         this.GOG.QJI();
         this.GOF.QJG();
         this.QIL.QJL();
         EVJ var2 = (EVJ)this.getProcess();
         this.GNU = var2.getPossibleDates();
         Calendar var3 = Calendar.getInstance();
         int var4 = var3.get(1);
         int var5 = var3.get(2);
         this.GOB = KH.getMonthByNumber(var5 + 1);
         this.GOA = String.valueOf(var4);
         if (this.GNU != null && this.GNU.get(this.GOA) == null) {
            this.GNU.put(this.GOA, new TreeSet());
         }

         if (this.GNU != null && !((SortedSet)this.GNU.get(this.GOA)).contains(this.GOB)) {
            ((SortedSet)this.GNU.get(this.GOA)).add(this.GOB);
         }

         this.fxml_invoice_sale_list_pagination.setPageCount(1);
         if (this.GNU != null) {
            this.fxml_invoice_sale_list_year_search.getItems().clear();
            this.fxml_invoice_sale_list_year.getItems().clear();
            if (this.GNU.keySet().size() > 0) {
               this.fxml_invoice_sale_list_year.getItems().addAll(this.GNU.keySet());
               this.fxml_invoice_sale_list_year.setValue(this.GOA);
               this.fxml_invoice_sale_list_year_search.getItems().addAll(this.GNU.keySet());
               this.fxml_invoice_sale_list_year_search.getItems().add(this.GNZ);
               this.fxml_invoice_sale_list_year_search.setValue(this.GNZ);
               this.setPossibleMonths(this.GOA, true);
            } else {
               this.fxml_invoice_sale_list_pagination.setPageCount(1);
            }
         }

         this.fxml_invoice_sale_list_only_empty_period.setDisable(false);
         this.GOG.QJJ();
         this.GOF.QJH();
         this.QIL.QJM();
      } catch (FFO | FFK var9) {
         EXF.getInstance().ICA((Throwable)var9);
         FCT.IGX(this.resources.getString("micro.process.invoice_sale_list.Error.GetPossibleDatesError"), var9);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   private void setPossibleMonths(String var1, boolean var2) {
      EXF.getInstance().ICO();

      try {
         boolean var3 = this.GOF.isDisabled();
         this.GOF.QJG();
         this.fxml_invoice_sale_list_month.getItems().clear();
         if (this.GNU.get(var1) != null) {
            this.fxml_invoice_sale_list_month.getItems().addAll((Collection)this.GNU.get(var1));
         }

         if (this.GOA.equals(var1) && var2) {
            this.fxml_invoice_sale_list_month.setValue(this.GOB);
         } else if (this.GNU.get(var1) != null && ((SortedSet)this.GNU.get(var1)).size() > 0) {
            this.fxml_invoice_sale_list_month.setValue((KH) ((SortedSet)this.GNU.get(var1)).last());
         }

         if (!var3) {
            this.GOF.QJH();
         }
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public void HHC() {
      EXF.getInstance().ICO();

      try {
         this.fxml_include_left_barController.HHC();
         this.fxml_include_top_menuController.HHC();
         this.QIL.QJL();
         ((TextFieldValidated_Text)this.fxml_invoice_sale_list_searchController.fxml_component_main_element).setText("");
         this.QIL.QJM();
         this.HHG();
         if (this.GOI == null) {
            this.HYO(true);
         } else {
            this.HYO(false);
         }

         this.fxml_invoice_sale_list_extended_view.selectedProperty().addListener(this.GOE);
         this.fxml_invoice_sale_list_scroll_pane.setVvalue(this.fxml_invoice_sale_list_scroll_pane.getVmin());
         this.GOG.setDontLoad(true);
         this.GOF.QJG();
         if (this.GOI != null && this.GOI.getYear() != null && this.GOI.getYear().getValue() != null && this.GOI.getMonth() != null && this.GOI.getMonth().getValue() != null) {
            if (this.GNU.get(String.valueOf(this.GOI.DDJ().getValue())) != null && ((SortedSet)this.GNU.get(String.valueOf(this.GOI.DDJ().getValue()))).contains(KH.getMonthByNumber((Integer)this.GOI.DDK().getValue()))) {
               this.fxml_invoice_sale_list_year.getSelectionModel().select(String.valueOf(this.GOI.DDJ().getValue()));
               this.fxml_invoice_sale_list_month.getSelectionModel().select(KH.getMonthByNumber((Integer)this.GOI.DDK().getValue()));
            } else {
               this.fxml_invoice_sale_list_year.getSelectionModel().select(this.GOA);
               this.fxml_invoice_sale_list_month.getSelectionModel().select(this.GOB);
            }
         }

         this.GOG.setDontLoad(false);
         this.GOF.QJH();
         this.getInvoicesByPeriod();
         this.fxml_parent.requestFocus();
      } catch (FFO | FFK var5) {
         EXF.getInstance().ICA((Throwable)var5);
         FCT.IGX("", var5);
         this.HZB();
      } finally {
         this.HYS();
         EXF.getInstance().ICP();
      }

   }

   public void setOnlyEmptyPeriod() {
      EXF.getInstance().ICO();

      try {
         this.QIM.QJN();
         this.fxml_invoice_sale_list_only_empty_period.setSelected(true);
         this.QIM.QJO();
      } finally {
         EXF.getInstance().ICP();
      }

   }

   protected void getInvoicesByPeriod() {
      this.getInvoicesByPeriod(false);
   }

   protected void getInvoicesByPeriod(final boolean var1) {
      EXF.getInstance().ICO();

      try {
         final MTI var2 = new MTI(null);
         this.fxml_invoice_sale_list_pagination.setPageCount(1);
         final Callback<Integer, Node> var3 = this::HYP;
         MSX var4 = new MSX(this.FGW, this.fxml_parent.disableProperty()) {
            public void MXI() {
               EXF.getInstance().ICO();

               try {
                  EVJ var1x = (EVJ)EVD.this.getProcess();
                  if (EVD.this.fxml_invoice_sale_list_only_empty_period.isSelected()) {
                     EVD.this.GOD = var1x.getInvoices(ENP.ONLY_EMPTY, (Integer)null, (Integer)null, (String)null, (String)null);
                     return;
                  }

                  if (EVD.this.fxml_invoice_sale_list_canceled_invoices.isSelected()) {
                     EVD.this.GOD = var1x.getInvoices(ENP.ONLY_CANCELED, (Integer)null, (Integer)null, (String)null, (String)null);
                     return;
                  }

                  if (EVD.this.fxml_invoice_sale_list_year.getValue() != null && EVD.this.fxml_invoice_sale_list_month.getValue() != null) {
                     EVD.this.GOD = var1x.getInvoices(ENP.WITHOUT_EMPTY, Integer.valueOf((String)EVD.this.fxml_invoice_sale_list_year.getValue()), Integer.valueOf(((KH)EVD.this.fxml_invoice_sale_list_month.getValue()).getMonthNumberString()), (String)null, (String)null);
                     return;
                  }
               } catch (FFO | FFK var6) {
                  EXF.getInstance().ICA((Throwable)var6);
                  var2.setObject(var6);
                  return;
               } catch (Exception var7) {
                  EXF.getInstance().ICA((Throwable)var7);
                  var2.setObject(var7);
                  return;
               } finally {
                  EXF.getInstance().ICP();
               }

            }

            public void MXJ() {
               if (var2.getObject() == null) {
                  if (EVD.this.GOD.size() % 50 > 0) {
                     EVD.this.fxml_invoice_sale_list_pagination.setPageCount(EVD.this.GOD.size() / 50 + 1);
                  } else {
                     EVD.this.fxml_invoice_sale_list_pagination.setPageCount(EVD.this.GOD.size() / 50);
                  }

                  EVD.this.fxml_invoice_sale_list_pagination.setPageFactory(var3);
                  EVD.this.fxml_invoice_sale_list_pagination.setCurrentPageIndex(0);
                  EVD.this.HYR();
                  EVD.this.GNY = false;
                  if (var1) {
                     ((TextFieldValidated_Text)EVD.this.fxml_invoice_sale_list_searchController.fxml_component_main_element).requestFocus();
                     if (((TextFieldValidated_Text)EVD.this.fxml_invoice_sale_list_searchController.fxml_component_main_element).getText() != null) {
                        ((TextFieldValidated_Text)EVD.this.fxml_invoice_sale_list_searchController.fxml_component_main_element).selectPositionCaret(((TextFieldValidated_Text)EVD.this.fxml_invoice_sale_list_searchController.fxml_component_main_element).getText().length());
                     }
                  } else {
                     EVD.this.fxml_parent.requestFocus();
                  }
               } else {
                  FCT.IGX(EVD.this.resources.getString("micro.process.invoice_sale_list.Error.GetInvoicesError"), (Exception)var2.getObject());
               }

            }
         };
         var4.MXH();
      } catch (FFK var8) {
         EXF.getInstance().ICA((Throwable)var8);
         FCT.IGX(this.resources.getString("micro.process.invoice_sale_list.Error.GetInvoicesError"), var8);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   protected void getInvoicesBySearch() {
      EXF.getInstance().ICO();

      try {
         String var1 = ((TextFieldValidated_Text)this.fxml_invoice_sale_list_searchController.fxml_component_main_element).getText();
         if (var1 == null || var1.trim().length() < 3) {
            if (this.GNY) {
               this.fxml_invoice_sale_list_month.setDisable(false);
               this.fxml_invoice_sale_list_year.setDisable(false);
               this.fxml_invoice_sale_list_only_empty_period.setDisable(false);
               this.fxml_invoice_sale_list_canceled_invoices.setDisable(false);
               this.getInvoicesByPeriod(true);
            }

            return;
         }

         final String var2 = var1.trim();
         this.fxml_invoice_sale_list_month.setDisable(true);
         this.fxml_invoice_sale_list_year.setDisable(true);
         this.fxml_invoice_sale_list_only_empty_period.setDisable(true);
         this.fxml_invoice_sale_list_canceled_invoices.setDisable(true);
         final Callback<Integer, Node> var3 = this::HYP;
         final MTI var4 = new MTI(null);
         MSX var5 = new MSX(this.FGW, this.fxml_parent.disableProperty()) {
            public void MXI() {
               EXF.getInstance().ICO();

               try {
                  EVJ var1 = (EVJ)EVD.this.getProcess();
                  if (((String)EVD.this.fxml_invoice_sale_list_year_search.getValue()).equals(EVD.this.GNZ)) {
                     EVD.this.GOD = var1.getInvoices(ENP.ALL, (Integer)null, (Integer)null, var2, (String)null);
                  } else {
                     EVD.this.GOD = var1.getInvoices(ENP.WITHOUT_EMPTY, Integer.valueOf((String)EVD.this.fxml_invoice_sale_list_year_search.getValue()), (Integer)null, var2, (String)null);
                  }
               } catch (FFK | FFO | NumberFormatException var6) {
                  EXF.getInstance().ICA((Throwable)var6);
                  var4.setObject(var6);
               } catch (Exception var7) {
                  EXF.getInstance().ICA((Throwable)var7);
                  var4.setObject(var7);
               } finally {
                  EXF.getInstance().ICP();
               }

            }

            public void MXJ() {
               if (var4.getObject() == null) {
                  if (EVD.this.GOD.size() % 50 > 0) {
                     EVD.this.fxml_invoice_sale_list_pagination.setPageCount(EVD.this.GOD.size() / 50 + 1);
                  } else {
                     EVD.this.fxml_invoice_sale_list_pagination.setPageCount(EVD.this.GOD.size() / 50);
                  }

                  EVD.this.fxml_invoice_sale_list_pagination.setPageFactory(var3);
                  EVD.this.fxml_invoice_sale_list_pagination.setCurrentPageIndex(0);
                  EVD.this.HYR();
                  EVD.this.GNY = true;
                  ((TextFieldValidated_Text)EVD.this.fxml_invoice_sale_list_searchController.fxml_component_main_element).requestFocus();
                  if (((TextFieldValidated_Text)EVD.this.fxml_invoice_sale_list_searchController.fxml_component_main_element).getText() != null) {
                     ((TextFieldValidated_Text)EVD.this.fxml_invoice_sale_list_searchController.fxml_component_main_element).selectPositionCaret(((TextFieldValidated_Text)EVD.this.fxml_invoice_sale_list_searchController.fxml_component_main_element).getText().length());
                  }
               } else {
                  EXF.getInstance().ICA((Throwable)var4.getObject());
                  FCT.IGX(EVD.this.resources.getString("micro.process.invoice_sale_list.Error.GetInvoicesError"), (Exception)var4.getObject());
               }

            }
         };
         var5.MXH();
      } catch (FFK var9) {
         EXF.getInstance().ICA((Throwable)var9);
         FCT.IGX(this.resources.getString("micro.process.invoice_sale_list.Error.GetInvoicesError"), var9);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   private Node HYP(int var1) {
      EXF.getInstance().ICO();

      VBox var3;
      try {
         this.GNX = var1;
         this.HYQ();
         this.setTableHeight();
         VBox var2 = new VBox(new Node[]{this.fxml_invoice_sale_list_table_tree, this.fxml_invoice_sale_list_summary_table});
         var3 = var2;
      } finally {
         EXF.getInstance().ICP();
      }

      return var3;
   }

   protected void HYQ() {
      if (this.GOD != null) {
         int var1 = this.GNX * 50;
         int var2 = Math.min(var1 + 50, this.GOD.size());
         TreeItem var3 = new TreeItem(new EVG(0, (LocalDate)null, "Faktury", (String)null, (String)null, (String)null, (BigDecimal)null, (BigDecimal)null, (BigDecimal)null, (EDF)null, (String)null, false, false));
         List var4 = this.GOD.subList(var1, var2);
         Iterator var5 = var4.iterator();

         while(true) {
            while(var5.hasNext()) {
               EPA var6 = (EPA)var5.next();
               String var7;
               if (EOZ.HOD(var6)) {
                  var7 = this.resources.getString("micro.process.common.invoices.InvoiceSellCorrection");
               } else {
                  var7 = this.resources.getString("micro.process.common.invoices.InvoiceSell");
               }

               LocalDate var8 = null;
               if (var6.getInvoicingDate() != null) {
                  var8 = var6.getInvoicingDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
               }

               EVG var9 = new EVG(var6.getNr(), var8, var6.getRefId(), var6.getParentRefId(), var6.getContractorName(), var6.getContractorNip(), var6.getSumNet(), var6.getSumTax(), var6.getSumBrut(), var6.getInvoiceWrapper(), var7, false, false);
               TreeItem var10 = new TreeItem(var9);
               EDF var11 = var6.getInvoiceWrapper();
               ArrayList var12 = new ArrayList();
               var12.add(var6.getInvoiceWrapper());
               if (!this.GNW) {
                  var3.getChildren().add(var10);
               } else {
                  while((var11 = (EDF)var11.getParentWrapperWithCanceledState()) != null) {
                     var12.add(0, var11);
                  }

                  var11 = var6.getInvoiceWrapper();

                  while((var11 = (EDF)var11.getChildWrapperWithCanceledState()) != null) {
                     var12.add(var11);
                  }

                  if (var12.size() > 1) {
                     int var13 = 0;
                     Iterator var14 = var12.iterator();

                     while(var14.hasNext()) {
                        EDF var15 = (EDF)var14.next();
                        ++var13;
                        Date var16 = (Date)var15.getValue("business_invoicingDate");
                        LocalDate var17 = null;
                        if (var16 != null) {
                           var17 = var16.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                        }

                        String var18 = (String)var15.getValue("business_refid");
                        String var19 = (String)var15.getValue("business_contractorName");
                        String var20 = (String)var15.getValue("business_contractorNIP");
                        BigDecimal var21 = (BigDecimal)var15.getValue("business_netValue");
                        BigDecimal var22 = (BigDecimal)var15.getValue("business_grossValue");
                        BigDecimal var23 = var22.subtract(var21);
                        if (EOZ.HOD(var15)) {
                           var7 = this.resources.getString("micro.process.common.invoices.InvoiceSellCorrection");
                        } else {
                           var7 = this.resources.getString("micro.process.common.invoices.InvoiceSell");
                        }

                        EDF var24;
                        for(var24 = var15; var24.getParentWrapperWithCanceledState() != null; var24 = (EDF)var24.getParentWrapperWithCanceledState()) {
                        }

                        String var25 = null;
                        if (var24 != var15) {
                           var25 = (String)var24.getValue("business_refid");
                        }

                        boolean var26 = false;
                        if (var15 == var6.getInvoiceWrapper()) {
                           var26 = true;
                        }

                        EVG var27 = new EVG(var13, var17, var18, var25, var19, var20, var21, var23, var22, var15, var7, var26, true);
                        TreeItem var28 = new TreeItem(var27);
                        var10.expandedProperty().addListener(this.GOH);
                        var10.getChildren().add(var28);
                     }
                  }

                  var3.getChildren().add(var10);
               }
            }

            this.fxml_invoice_sale_list_table_tree.setRoot(var3);
            return;
         }
      }
   }

   private void setTableHeight() {
      this.fxml_invoice_sale_list_table_tree.setPrefHeight(this.fxml_invoice_sale_list_table_tree.getFixedCellSize() * ((double)this.fxml_invoice_sale_list_table_tree.getExpandedItemCount() + 1.2));
   }

   @FXML
   protected void fxml_handleButton_back(ActionEvent var1) {
      EXF.getInstance().ICO();

      try {
         EXF.getInstance().ICE("Button [back] clicked");
         this.getApplication().HJD(this.getFxmlName(), "main.fxml");
      } finally {
         EXF.getInstance().ICP();
      }

   }

   @FXML
   protected void fxml_handleButton_invoice_sale_list_edit(ActionEvent var1) {
      EXF.getInstance().ICO();

      try {
         EXF.getInstance().ICE("Button [invoice_edit] clicked");
         final HN var2 = (HN)((EVG)((TreeItem)this.fxml_invoice_sale_list_table_tree.getSelectionModel().getSelectedItem()).getValue()).getInvoice().getModelBaseElementWithIdObject();
         this.getApplication().HJE(this.getFxmlName(), EOS.INVOICE_SALE_NEW.getProcessFxmlFileName(), new ENB<ENN<?>>() {
            public void HNE(ENN<?> var1) {
               EXF.getInstance().ICO();

               try {
                  if (EOZ.HOD(var2)) {
                     var1.setInvoice((HV)var2);
                     var1.setMode(EPB.EDIT_CORRECTION);
                  } else {
                     var1.setInvoice((HU)var2);
                     var1.setMode(EPB.EDIT);
                  }
               } catch (FFK var6) {
                  EXF.getInstance().ICA((Throwable)var6);
                  throw new FFI(var6);
               } finally {
                  EXF.getInstance().ICP();
               }

            }
         });
      } catch (FFK var6) {
         EXF.getInstance().ICA((Throwable)var6);
         throw new FFI(var6);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   @FXML
   protected void fxml_handleButton_invoice_sale_list_correct(ActionEvent var1) {
      EXF.getInstance().ICO();

      try {
         EXF.getInstance().ICE("Button [invoice_correct] clicked");
         final HU var2 = (HU)((EVG)((TreeItem)this.fxml_invoice_sale_list_table_tree.getSelectionModel().getSelectedItem()).getValue()).getInvoice().getModelBaseElementWithIdObject();
         this.getApplication().HJE(this.getFxmlName(), EOS.INVOICE_SALE_NEW.getProcessFxmlFileName(), new ENB<ENN<?>>() {
            public void HNE(ENN<?> var1) {
               EXF.getInstance().ICO();

               try {
                  var1.setInvoice(var2);
                  var1.setMode(EPB.CORRECT);
               } catch (FFK var6) {
                  EXF.getInstance().ICA((Throwable)var6);
                  throw new FFI(var6);
               } finally {
                  EXF.getInstance().ICP();
               }

            }
         });
      } catch (FFK var6) {
         EXF.getInstance().ICA((Throwable)var6);
         throw new FFI(var6);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   @FXML
   protected void fxml_handleButton_invoice_sale_list_view(ActionEvent var1) {
      EXF.getInstance().ICO();

      try {
         EXF.getInstance().ICE("Button [invoice_view] clicked");
         final HN var2 = (HN)((EVG)((TreeItem)this.fxml_invoice_sale_list_table_tree.getSelectionModel().getSelectedItem()).getValue()).getInvoice().getModelBaseElementWithIdObject();
         this.getApplication().HJE(this.getFxmlName(), EOS.INVOICE_SALE_NEW.getProcessFxmlFileName(), new ENB<ENN<?>>() {
            public void HNE(ENN<?> var1) {
               EXF.getInstance().ICO();

               try {
                  if (EOZ.HOD(var2)) {
                     var1.setInvoice(var2);
                     var1.setMode(EPB.VIEW_CORRECTION);
                  } else {
                     var1.setInvoice(var2);
                     var1.setMode(EPB.VIEW);
                  }
               } catch (FFK var6) {
                  EXF.getInstance().ICA((Throwable)var6);
                  throw new FFI(var6);
               } finally {
                  EXF.getInstance().ICP();
               }

            }
         });
      } catch (FFK var6) {
         EXF.getInstance().ICA((Throwable)var6);
         throw new FFI(var6);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   @FXML
   protected void fxml_handleButton_invoice_sale_list_set_receive_date(ActionEvent var1) {
      EXF.getInstance().ICO();

      try {
         EXF.getInstance().ICE("Button [TODO_set_receive_date] clicked");
         FXMLLoader var2 = new FXMLLoader();
         var2.setLocation(EVD.class.getResource("/fxml/invoice_sale_list_set_receive_date.fxml"));
         var2.setResources(this.resources);
         AnchorPane var3 = null;

         try {
            var3 = (AnchorPane)var2.load();
         } catch (IOException var15) {
            EXF.getInstance().ICA((Throwable)var15);
            throw FCZ.getInstance().IHI(new File("/fxml/invoice_sale_list_set_receive_date.fxml"));
         }

         Stage var4 = new Stage();
         var4.setTitle(this.resources.getString("micro.process.invoice_sale_list.SetInvoicingDate.title"));
         var4.initModality(Modality.WINDOW_MODAL);
         var4.initOwner(this.FGW);
         Scene var5 = new Scene(var3);
         var4.setScene(var5);
         var4.setResizable(false);
         var4.getIcons().add(new Image("/img/app/e_logo.png"));
         EVH var6 = (EVH)var2.getController();
         var6.setDialogStage(var4);
         var6.setResources(this.resources);
         var6.setParentController(this);
         var6.setImplematation((EVJ)this.getProcess());
         HV var7 = (HV)((EVG)((TreeItem)this.fxml_invoice_sale_list_table_tree.getSelectionModel().getSelectedItem()).getValue()).getInvoice().getModelBaseElementWithIdObject();
         var7.setPreviousPeriod(var7.getPeriod().DDN());
         var6.setInvoiceSellCorrection(var7);
         var6.HZC();
         var4.showAndWait();
         if (var6.HZD() && ((DatePickerRequired)var6.fxml_invoicing_date_dateController.fxml_component_main_element).getValue() != null) {
            Date var8 = Date.from(((LocalDate)((DatePickerRequired)var6.fxml_invoicing_date_dateController.fxml_component_main_element).getValue()).atStartOfDay(ZoneId.systemDefault()).toInstant());
            var7.setInvoicingDate(new JV(var8));
            JN var9 = new JN(var8);
            var7.setPeriod(var9);
            var7.setUsingInvoicingDate(new JS(true));
            EVJ var10 = (EVJ)this.getProcess();
            if (var10 == null) {
               throw FCZ.getInstance().IHJ();
            }

            var10.HZE(var7);
         }

         this.fxml_parent.requestFocus();
      } catch (FFO | FFK var16) {
         EXF.getInstance().ICA((Throwable)var16);
         FCT.IGX(this.resources.getString("micro.process.invoice_sale_list.Error.InvoiceSetInvoicingDate"), var16);
      } finally {
         this.HYO(true);
         this.HYS();
         this.getInvoicesByPeriod();
         EXF.getInstance().ICP();
      }

   }

   @FXML
   protected void fxml_invoice_sale_list_button_print(ActionEvent var1) {
      EXF.getInstance().ICO();

      try {
         EXF.getInstance().ICE("Button [print] clicked");
         HN var2 = null;

         try {
            var2 = (HN)((EVG)((TreeItem)this.fxml_invoice_sale_list_table_tree.getSelectionModel().getSelectedItem()).getValue()).getInvoice().getModelBaseElementWithIdObject();
         } catch (FFK var11) {
            EXF.getInstance().ICA((Throwable)var11);
            FCT.IGX(this.resources.getString("micro.process.invoice_sale_list.Error.InvoiceLoading"), var11);
         }

         if (var2 != null) {
            EVJ var3;
            File var4;
            LY var5;
            if (EOZ.HOD(var2)) {
               var3 = (EVJ)this.getProcess();
               var4 = var3.getTempFile("pdf");
               var5 = var3.getUserDataForInvoice(var2);
               EPI var6 = new EPI(this.resources, (HV)var2, var5, var4);
               var6.HOE();
            } else {
               var3 = (EVJ)this.getProcess();
               var4 = var3.getTempFile("pdf");
               var5 = var3.getUserDataForInvoice(var2);
               EPE var14 = new EPE(this.resources, (HU)var2, var5, var4);
               var14.HOE();
            }
         }
      } catch (FFO | FFK var12) {
         EXF.getInstance().ICA((Throwable)var12);
         FCT.IGX(this.resources.getString("micro.process.invoice_sale_list.Error.PrintError"), var12);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   @FXML
   protected void fxml_invoice_sale_list_button_cancel(ActionEvent var1) {
      EXF.getInstance().ICO();

      try {
         EXF.getInstance().ICE("Button [cancel] clicked");
         FEN var2 = FCR.getConfirmDataDialog(this.resources.getString("micro.process.invoice_sale_list.Dialog.deleteAreYouSure.title"), (String)null, this.resources.getString("micro.dialog.remove.confirm.button.remove"), this.resources.getString("micro.dialog.remove.confirm.button.cancel"), 500.0, 100.0, this.resources.getString("micro.process.invoice_sale_list.Dialog.deleteAreYouSure.header"));
         switch (var2) {
            case Confirm:
               ((EVJ)this.getProcess()).RKY(((EVG)((TreeItem)this.fxml_invoice_sale_list_table_tree.getSelectionModel().getSelectedItem()).getValue()).getInvoice());
               EXF.getInstance().ICE("Invoice cancelled");
               if (this.GNY) {
                  this.getInvoicesBySearch();
               } else {
                  this.getInvoicesByPeriod();
               }
            case Reject:
            case CancelExit:
         }
      } catch (FFO | FFK var6) {
         EXF.getInstance().ICA((Throwable)var6);
         FCT.IGX(this.resources.getString("micro.process.invoice_sale_list.error.cancel"), var6);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   @FXML
   protected void fxml_invoice_sale_list_button_new_invoice(ActionEvent var1) {
      EXF.getInstance().ICO();

      try {
         EXF.getInstance().ICE("Button [new_invoice] clicked");
         this.getApplication().HJE(this.getFxmlName(), EOS.INVOICE_SALE_NEW.getProcessFxmlFileName(), new ENB<ENN<?>>() {
            public void HNE(ENN<?> var1) {
               EXF.getInstance().ICO();

               try {
                  var1.setMode(EPB.NEW);
               } finally {
                  EXF.getInstance().ICP();
               }

            }
         });
      } finally {
         EXF.getInstance().ICP();
      }

   }

   private void HYR() {
      EXF.getInstance().ICO();

      try {
         BigDecimal var1 = new BigDecimal(0);
         BigDecimal var2 = new BigDecimal(0);
         BigDecimal var3 = new BigDecimal(0);
         EPA var5;
         if (this.GOD != null) {
            for(Iterator var4 = this.GOD.iterator(); var4.hasNext(); var3 = var3.add(var5.getSumTax())) {
               var5 = (EPA)var4.next();
               var1 = var1.add(var5.getSumNet());
               var2 = var2.add(var5.getSumBrut());
            }
         }

         ((ObservableList)this.GOC.get()).clear();
         EOX var9 = new EOX(this.resources.getString("micro.process.invoice_sale_new.SummaryTaxRow"), var1, var3, var2);
         this.GOC.add(var9);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   private void setEditDisable(boolean var1, String var2) {
      EXF.getInstance().ICO();

      try {
         this.fxml_invoice_sale_list_button_edit.setDisable(var1);
         this.fxml_invoice_sale_list_button_edit_error_label.setText(var2);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   private void setViewDisable(boolean var1, String var2) {
      EXF.getInstance().ICO();

      try {
         this.fxml_invoice_sale_list_button_view.setDisable(var1);
         this.fxml_invoice_sale_list_button_view_error_label.setText(var2);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   private void setCorrectDisable(boolean var1, String var2) {
      EXF.getInstance().ICO();

      try {
         this.fxml_invoice_sale_list_button_correct.setDisable(var1);
         this.fxml_invoice_sale_list_button_correct_error_label.setText(var2);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   private void setChangeReceiveDateDisable(boolean var1, String var2) {
      EXF.getInstance().ICO();

      try {
         this.fxml_invoice_sale_list_button_set_receive_date.setVisible(!var1);
         this.fxml_invoice_sale_list_button_set_receive_date_error_label.setVisible(!var1);
         this.fxml_invoice_sale_list_button_set_receive_date_error_label.setText(var2);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   private void setPrintDisable(boolean var1) {
      EXF.getInstance().ICO();

      try {
         this.fxml_invoice_sale_list_button_print.setDisable(var1);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   private void setCancelDisable(boolean var1) {
      EXF.getInstance().ICO();

      try {
         this.fxml_invoice_sale_list_button_cancel.setDisable(var1);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   private void HYS() {
      EXF.getInstance().ICO();

      try {
         if (this.fxml_invoice_sale_list_table_tree.getSelectionModel().getSelectedIndex() != -1) {
            EDF var1 = ((EVG)((TreeItem)this.fxml_invoice_sale_list_table_tree.getSelectionModel().getSelectedItem()).getValue()).getInvoice();
            if (var1 == null) {
               this.setAllDisabled();
               return;
            }

            EVE var2 = this.HYV(var1);
            if (var2.HYN()) {
               this.setCorrectDisable(false, (String)null);
            } else {
               this.setCorrectDisable(true, var2.getText());
            }

            var2 = this.HYT(var1);
            if (var2.HYN()) {
               this.setEditDisable(false, (String)null);
            } else {
               this.setEditDisable(true, var2.getText());
            }

            var2 = this.HYU(var1);
            if (var2.HYN()) {
               this.setViewDisable(false, (String)null);
            } else {
               this.setViewDisable(true, var2.getText());
            }

            var2 = this.HYW(var1);
            if (var2.HYN()) {
               this.setChangeReceiveDateDisable(false, (String)null);
            } else {
               this.setChangeReceiveDateDisable(true, var2.getText());
            }

            var2 = this.HYX(var1);
            if (var2.HYN()) {
               this.setPrintDisable(false);
            } else {
               this.setPrintDisable(true);
            }

            var2 = this.RKX(var1);
            if (var2.HYN()) {
               this.setCancelDisable(false);
            } else {
               this.setCancelDisable(true);
            }

            return;
         }

         this.setAllDisabled();
      } finally {
         EXF.getInstance().ICP();
      }

   }

   private void setAllDisabled() {
      this.setCorrectDisable(true, (String)null);
      this.setEditDisable(true, (String)null);
      this.setViewDisable(true, (String)null);
      this.setChangeReceiveDateDisable(true, (String)null);
      this.setPrintDisable(true);
      this.setCancelDisable(true);
   }

   private EVE HYT(EDF<HY> var1) {
      EXF.getInstance().ICO();

      EVE var3;
      try {
         if (var1.getState().equals(QSW.CANCELED)) {
            EVE var10 = new EVE(false, (String)null);
            return var10;
         }

         boolean var2 = false;

         try {
            var2 = this.HYY(var1);
         } catch (FFO | FFK var8) {
            EXF.getInstance().ICA((Throwable)var8);
            FCT.IGX(this.resources.getString("micro.process.invoice_sale_list.Error.GetInvoiceSettlement"), var8);
            EVE var4 = new EVE(false, this.resources.getString("micro.process.invoice_sale_list.Error.GetInvoiceSettlement"));
            return var4;
         }

         if (!var2) {
            if (var1.getChildWrapperOnlyActiveState() == null) {
               var3 = new EVE(true, (String)null);
               return var3;
            }

            var3 = new EVE(false, (String)null);
            return var3;
         }

         var3 = new EVE(false, this.resources.getString("micro.process.invoice_sale_list.PossibleResult.SettlementSetted"));
      } finally {
         EXF.getInstance().ICP();
      }

      return var3;
   }

   private EVE RKX(EDF<HY> var1) {
      EXF.getInstance().ICO();

      EVE var3;
      try {
         boolean var2 = false;

         try {
            var2 = this.HYY(var1);
         } catch (FFO | FFK var8) {
            EXF.getInstance().ICA((Throwable)var8);
            FCT.IGX(this.resources.getString("micro.process.invoice_sale_list.Error.GetInvoiceSettlement"), var8);
            EVE var4 = new EVE(false, this.resources.getString("micro.process.invoice_sale_list.Error.GetInvoiceSettlement"));
            return var4;
         }

         if (var2) {
            var3 = new EVE(false, this.resources.getString("micro.process.invoice_sale_list.error.CantCancelSettledInvoice"));
            return var3;
         }

         if (!var1.getState().equals(QSW.CANCELED)) {
            if (var1.getChildWrapperOnlyActiveState() != null) {
               var3 = new EVE(false, this.resources.getString("micro.process.invoice_sale_list.error.CantCancelInvoiceWithChildren"));
               return var3;
            }

            var3 = new EVE(true, (String)null);
            return var3;
         }

         var3 = new EVE(false, this.resources.getString("micro.process.invoice_sale_list.error.CantCancelCanceledInvoice"));
      } finally {
         EXF.getInstance().ICP();
      }

      return var3;
   }

   private EVE HYU(EDF<HY> var1) {
      EXF.getInstance().ICO();

      EVE var2;
      try {
         if (!var1.getState().equals(QSW.CANCELED) || !EOZ.HOD(var1) || var1.getParentWrapperOnlyActiveState() != null) {
            var2 = new EVE(true, (String)null);
            return var2;
         }

         var2 = new EVE(false, (String)null);
      } finally {
         EXF.getInstance().ICP();
      }

      return var2;
   }

   private EVE HYV(EDF<HY> var1) {
      EXF.getInstance().ICO();

      EVE var2;
      try {
         if (!var1.getState().equals(QSW.CANCELED)) {
            if (EOZ.HOD(var1)) {
               var2 = new EVE(false, (String)null);
               return var2;
            }

            var2 = new EVE(true, (String)null);
            return var2;
         }

         var2 = new EVE(false, (String)null);
      } finally {
         EXF.getInstance().ICP();
      }

      return var2;
   }

   private EVE HYW(EDF<HY> var1) {
      EXF.getInstance().ICO();

      EVE var2;
      try {
         if (var1.getState().equals(QSW.CANCELED)) {
            var2 = new EVE(false, (String)null);
            return var2;
         }

         if (!var1.getPeriod().equals(JN.AOE)) {
            var2 = new EVE(false, (String)null);
            return var2;
         }

         var2 = new EVE(true, (String)null);
      } finally {
         EXF.getInstance().ICP();
      }

      return var2;
   }

   private EVE HYX(EDF<HY> var1) {
      EXF.getInstance().ICO();

      EVE var2;
      try {
         var2 = new EVE(true, (String)null);
      } finally {
         EXF.getInstance().ICP();
      }

      return var2;
   }

   public boolean HYY(EDF<HY> var1) throws FFK, FFO {
      EXF.getInstance().ICO();

      boolean var3;
      try {
         boolean var2 = this.HYZ(var1.getPeriod());
         var3 = var2;
      } finally {
         EXF.getInstance().ICP();
      }

      return var3;
   }

   public boolean HYZ(JN var1) throws FFK, FFO {
      EXF.getInstance().ICO();

      boolean var4;
      try {
         EVJ var2 = (EVJ)this.getProcess();
         if (var2 == null) {
            throw FCZ.getInstance().IHJ();
         }

         JG var3 = var2.getSettlementStatus(var1);
         if (var3 != JG.SETTLED) {
            var4 = false;
            return var4;
         }

         var4 = true;
      } finally {
         EXF.getInstance().ICP();
      }

      return var4;
   }

   public boolean HZA(LocalDate var1) throws FFK, FFO {
      EXF.getInstance().ICO();

      boolean var4;
      try {
         EVJ var2 = (EVJ)this.getProcess();
         if (var2 == null) {
            throw FCZ.getInstance().IHJ();
         }

         JG var3 = var2.getSettlementStatus(var1);
         if (var3 != JG.SETTLED) {
            var4 = false;
            return var4;
         }

         var4 = true;
      } finally {
         EXF.getInstance().ICP();
      }

      return var4;
   }

   private void HZB() {
      EXF.getInstance().ICO();

      try {
         this.getApplication().HJD(this.getFxmlName(), "main.fxml");
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public void setExtendedView(boolean var1) {
      this.GNW = var1;
      this.HYQ();
      this.setTableHeight();
   }

   public void setPeriod(JN var1) throws FFK {
      EXF.getInstance().ICO();

      try {
         this.GOI = var1;
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public abstract class QTL<_T> implements ChangeListener<_T> {
      protected boolean RAO;

      public QTL() {
      }

      public void RKV() {
         this.RAO = true;
      }

      public void RKW() {
         this.RAO = false;
      }

      public boolean isDisabled() {
         return this.RAO;
      }
   }

   private class QTK implements ChangeListener<Boolean> {
      protected boolean RAN;

      private QTK() {
      }

      public void RKT() {
         this.RAN = true;
      }

      public void RKU() {
         this.RAN = false;
      }

      public boolean isDisabled() {
         return this.RAN;
      }

      public void changed(ObservableValue<? extends Boolean> var1, Boolean var2, Boolean var3) {
         EXF.getInstance().ICO();

         try {
            if (var3) {
               EVD.this.QIM.QJN();
               EVD.this.fxml_invoice_sale_list_only_empty_period.setSelected(false);
               EVD.this.QIM.QJO();
               EVD.this.fxml_invoice_sale_list_month.setDisable(true);
               EVD.this.fxml_invoice_sale_list_year.setDisable(true);
               if (!this.RAN) {
                  EVD.this.getInvoicesByPeriod();
               }
            } else {
               EVD.this.fxml_invoice_sale_list_month.setDisable(false);
               EVD.this.fxml_invoice_sale_list_year.setDisable(false);
               if (!this.RAN) {
                  EVD.this.getInvoicesByPeriod();
               }
            }

            EXF.getInstance().ICE("Cancelled checkbox changed to " + var3);
         } finally {
            EXF.getInstance().ICP();
         }

      }
   }

   private class QHE implements ChangeListener<Boolean> {
      protected boolean QIK;

      private QHE() {
      }

      public void QJN() {
         this.QIK = true;
      }

      public void QJO() {
         this.QIK = false;
      }

      public boolean isDisabled() {
         return this.QIK;
      }

      public void changed(ObservableValue<? extends Boolean> var1, Boolean var2, Boolean var3) {
         EXF.getInstance().ICO();

         try {
            if (var3) {
               EVD.this.RAP.RKT();
               EVD.this.fxml_invoice_sale_list_canceled_invoices.setSelected(false);
               EVD.this.RAP.RKU();
               EVD.this.fxml_invoice_sale_list_month.setDisable(true);
               EVD.this.fxml_invoice_sale_list_year.setDisable(true);
               if (!this.QIK) {
                  EVD.this.getInvoicesByPeriod();
               }
            } else {
               EVD.this.fxml_invoice_sale_list_month.setDisable(false);
               EVD.this.fxml_invoice_sale_list_year.setDisable(false);
               if (!this.QIK) {
                  EVD.this.getInvoicesByPeriod();
               }
            }

            EXF.getInstance().ICE("Unsettled checkbox changed to " + var3);
         } finally {
            EXF.getInstance().ICP();
         }

      }
   }

   private class QHD implements ChangeListener<String> {
      protected boolean QIJ;

      private QHD() {
      }

      public void QJL() {
         this.QIJ = true;
      }

      public void QJM() {
         this.QIJ = false;
      }

      public boolean isDisabled() {
         return this.QIJ;
      }

      public void changed(ObservableValue<? extends String> var1, String var2, String var3) {
         EXF.getInstance().ICO();

         try {
            if (var3 != null && !this.QIJ) {
               EVD.this.getInvoicesBySearch();
            }
         } finally {
            EXF.getInstance().ICP();
         }

      }
   }

   private class QHC implements ChangeListener<String> {
      protected boolean QII;
      private boolean QIH;

      private QHC() {
         this.QIH = false;
      }

      public void QJI() {
         this.QII = true;
      }

      public void QJJ() {
         this.QII = false;
      }

      public boolean isDisabled() {
         return this.QII;
      }

      public void changed(ObservableValue<? extends String> var1, String var2, String var3) {
         EXF.getInstance().ICO();

         try {
            if (var3 != null && !this.QII) {
               EVD.this.setPossibleMonths(var3, false);
               if (!this.QIH) {
                  EVD.this.getInvoicesByPeriod();
               }
            }
         } finally {
            EXF.getInstance().ICP();
         }

      }

      public void setDontLoad(boolean var1) {
         this.QIH = var1;
      }
   }

   private class QHB implements ChangeListener<KH> {
      protected boolean QIG;

      private QHB() {
      }

      public void QJG() {
         this.QIG = true;
      }

      public void QJH() {
         this.QIG = false;
      }

      public boolean isDisabled() {
         return this.QIG;
      }

      public void changed(ObservableValue<? extends KH> var1, KH var2, KH var3) {
         EXF.getInstance().ICO();

         try {
            if (var3 != null && !this.QIG) {
               EVD.this.getInvoicesByPeriod();
            }
         } finally {
            EXF.getInstance().ICP();
         }

      }
   }

   private class EVE {
      private boolean GNR;
      private String GNS;

      public EVE(boolean var2, String var3) {
         this.GNR = var2;
         this.GNS = var3;
      }

      public boolean HYN() {
         return this.GNR;
      }

      public String getText() {
         return this.GNS;
      }
   }
}
