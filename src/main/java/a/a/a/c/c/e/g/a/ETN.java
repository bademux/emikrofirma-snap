package a.a.a.c.c.e.g.a;

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
import a.a.a.c.c.d.d.EOQ;
import a.a.a.c.c.d.g.EOX;
import a.a.a.c.c.d.g.EPA;
import a.a.a.c.c.d.g.EPB;
import a.a.a.c.c.e.g.c.ETS;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.a.EZG;
import a.a.a.c.f.a.e.HR;
import a.a.a.c.f.a.e.IA;
import a.a.a.c.f.a.h.JG;
import a.a.a.c.f.b.b.JN;
import a.a.a.c.f.b.c.a.KH;
import a.a.a.c.f.c.c.TextFieldValidated_Text;
import a.a.a.c.g.MSX;
import a.a.a.c.g.MTI;
import a.a.a.c.g.a.FCR;
import a.a.a.c.g.a.FCT;
import a.a.a.c.g.c.FCZ;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Collection;
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
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.Pagination;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.VBox;
import javafx.util.Callback;

public class ETN extends ENO<ETS> {
   private static final int GHT = 50;
   @FXML
   private Pagination fxml_invoice_purchase_list_pagination;
   @FXML
   private Button fxml_invoice_purchase_list_button_edit;
   @FXML
   private Button fxml_invoice_purchase_list_button_view;
   @FXML
   private Button fxml_invoice_purchase_list_button_new_invoice;
   @FXML
   private Button fxml_invoice_purchase_list_button_new_aggregate_invoice;
   @FXML
   private Button fxml_invoice_purchase_list_button_delete;
   @FXML
   private Label fxml_invoice_purchase_list_button_edit_error_label;
   @FXML
   private Label fxml_invoice_purchase_list_button_correct_error_label;
   @FXML
   private Label fxml_invoice_purchase_list_button_view_error_label;
   @FXML
   private Label fxml_invoice_purchase_list_button_set_receive_date_error_label;
   @FXML
   private TableView<ETQ> fxml_invoice_purchase_list_table_tree;
   @FXML
   private TableColumn<ETQ, String> fxml_invoice_purchase_list_tree_table_column_invoice_type;
   @FXML
   private TableColumn<ETQ, String> fxml_invoice_purchase_list_tree_table_column_ref_id;
   @FXML
   private TableColumn<ETQ, LocalDate> fxml_invoice_purchase_list_tree_table_column_invoicing_date;
   @FXML
   private TableColumn<ETQ, String> fxml_invoice_purchase_new_elements_tree_table_contractor_name;
   @FXML
   private TableColumn<ETQ, String> fxml_invoice_purchase_new_elements_tree_table_contractor_nip;
   @FXML
   private TableColumn<ETQ, BigDecimal> fxml_invoice_purchase_list_tree_table_column_sum_net;
   @FXML
   private TableColumn<ETQ, BigDecimal> fxml_invoice_purchase_list_tree_table_column_sum_tax;
   @FXML
   private TableColumn<ETQ, BigDecimal> fxml_invoice_purchase_list_tree_table_column_sum_brut;
   @FXML
   private ComboBox<KH> fxml_invoice_purchase_list_month;
   @FXML
   private ComboBox<String> fxml_invoice_purchase_list_year;
   @FXML
   private EZG fxml_invoice_purchase_list_searchController;
   @FXML
   private ComboBox<String> fxml_invoice_purchase_list_year_search;
   @FXML
   private TableView<EOX<String>> fxml_invoice_purchase_list_summary_table;
   @FXML
   private TableColumn<EOX<String>, String> fxml_invoice_purchase_list_summary_table_column_name;
   @FXML
   private TableColumn<EOX<String>, BigDecimal> fxml_invoice_purchase_list_summary_table_column_sum_net;
   @FXML
   private TableColumn<EOX<String>, BigDecimal> fxml_invoice_purchase_list_summary_table_column_sum_tax;
   @FXML
   private TableColumn<EOX<String>, BigDecimal> fxml_invoice_purchase_list_summary_table_column_sum_brut;
   @FXML
   private ScrollPane fxml_invoice_purchase_list_scroll_pane;
   private SortedMap<String, SortedSet<KH>> GHU;
   private DecimalFormat GHV = ENI.get();
   private int GHW = 0;
   private boolean GHX = true;
   private String GHY;
   private ListProperty<ETQ> GHZ = new SimpleListProperty(FXCollections.observableArrayList());
   private String GIA;
   private KH GIB;
   protected final ListProperty<EOX<String>> GIC = new SimpleListProperty(FXCollections.observableArrayList());
   private List<EPA<HR>> GID;
   private QGY GIE = new QGY();
   private QGZ GIF = new QGZ();
   private QHA QIF = new QHA();
   private JN GIH = null;
   @FXML
   private EMP fxml_include_left_barController;
   @FXML
   private EMR fxml_include_top_menuController;

   public ETN(EMC var1, EMT var2, String var3, String var4) {
      super(var1, var2, var3, var4);
      EXF.getInstance().ICQ();
   }

   @FXML
   public void initialize() {
      this.GHY = this.resources.getString("micro.process.invoice_purchase_list.SearchAll");
   }

   public void HHE() {
      EXF.getInstance().ICO();

      try {
         ((TextFieldValidated_Text)this.fxml_invoice_purchase_list_searchController.fxml_component_main_element).setPromptText(this.resources.getString("micro.process.invoice_purchase_list.Find"));
         super.HHE();
         this.fxml_invoice_purchase_list_table_tree.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<ETQ>() {
            public void changed(ObservableValue<? extends ETQ> var1, ETQ var2, ETQ var3) {
               if (var3 != null) {
                  ETN.this.HVV();
               } else {
                  ETN.this.setAllDisabled();
               }

            }
         });
         this.fxml_invoice_purchase_list_tree_table_column_sum_net.setCellFactory(TextFieldTableCell.forTableColumn(new EOK(this.GHV, 2)));
         this.fxml_invoice_purchase_list_tree_table_column_sum_tax.setCellFactory(TextFieldTableCell.forTableColumn(new EOK(this.GHV, 2)));
         this.fxml_invoice_purchase_list_tree_table_column_sum_brut.setCellFactory(TextFieldTableCell.forTableColumn(new EOK(this.GHV, 2)));
         this.fxml_invoice_purchase_list_tree_table_column_invoice_type.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<ETQ, String>, ObservableValue<String>>() {
            public ObservableValue<String> call(TableColumn.CellDataFeatures<ETQ, String> var1) {
               return ((ETQ)var1.getValue()).getInvoicetype();
            }
         });
         this.fxml_invoice_purchase_list_tree_table_column_ref_id.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<ETQ, String>, ObservableValue<String>>() {
            public ObservableValue<String> call(TableColumn.CellDataFeatures<ETQ, String> var1) {
               return ((ETQ)var1.getValue()).getRefId();
            }
         });
         this.fxml_invoice_purchase_list_tree_table_column_invoicing_date.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<ETQ, LocalDate>, ObservableValue<LocalDate>>() {
            public ObservableValue<LocalDate> call(TableColumn.CellDataFeatures<ETQ, LocalDate> var1) {
               return ((ETQ)var1.getValue()).getInvoicingDate();
            }
         });
         this.fxml_invoice_purchase_new_elements_tree_table_contractor_name.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<ETQ, String>, ObservableValue<String>>() {
            public ObservableValue<String> call(TableColumn.CellDataFeatures<ETQ, String> var1) {
               return ((ETQ)var1.getValue()).getContractorName();
            }
         });
         this.fxml_invoice_purchase_new_elements_tree_table_contractor_nip.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<ETQ, String>, ObservableValue<String>>() {
            public ObservableValue<String> call(TableColumn.CellDataFeatures<ETQ, String> var1) {
               return ((ETQ)var1.getValue()).getContractorNip();
            }
         });
         this.fxml_invoice_purchase_list_tree_table_column_sum_net.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<ETQ, BigDecimal>, ObservableValue<BigDecimal>>() {
            public ObservableValue<BigDecimal> call(TableColumn.CellDataFeatures<ETQ, BigDecimal> var1) {
               return ((ETQ)var1.getValue()).getSumNet();
            }
         });
         this.fxml_invoice_purchase_list_tree_table_column_sum_tax.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<ETQ, BigDecimal>, ObservableValue<BigDecimal>>() {
            public ObservableValue<BigDecimal> call(TableColumn.CellDataFeatures<ETQ, BigDecimal> var1) {
               return ((ETQ)var1.getValue()).getSumTax();
            }
         });
         this.fxml_invoice_purchase_list_tree_table_column_sum_brut.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<ETQ, BigDecimal>, ObservableValue<BigDecimal>>() {
            public ObservableValue<BigDecimal> call(TableColumn.CellDataFeatures<ETQ, BigDecimal> var1) {
               return ((ETQ)var1.getValue()).getSumBrut();
            }
         });
         this.fxml_invoice_purchase_list_table_tree.setItems(this.GHZ);
         this.fxml_invoice_purchase_list_month.setCellFactory(new EOQ());
         this.fxml_invoice_purchase_list_month.setButtonCell((ListCell)this.fxml_invoice_purchase_list_month.getCellFactory().call(null));
         this.fxml_invoice_purchase_list_year.valueProperty().addListener(this.GIF);
         this.fxml_invoice_purchase_list_month.valueProperty().addListener(this.GIE);
         this.fxml_invoice_purchase_list_year_search.valueProperty().addListener(this.QIF);
         ((TextFieldValidated_Text)this.fxml_invoice_purchase_list_searchController.fxml_component_main_element).textProperty().addListener(this.QIF);
         this.fxml_invoice_purchase_list_summary_table_column_sum_net.setCellFactory(TextFieldTableCell.forTableColumn(new EOK(this.GHV, 2)));
         this.fxml_invoice_purchase_list_summary_table_column_sum_tax.setCellFactory(TextFieldTableCell.forTableColumn(new EOK(this.GHV, 2)));
         this.fxml_invoice_purchase_list_summary_table_column_sum_brut.setCellFactory(TextFieldTableCell.forTableColumn(new EOK(this.GHV, 2)));
         this.fxml_invoice_purchase_list_summary_table_column_sum_net.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<EOX<String>, BigDecimal>, ObservableValue<BigDecimal>>() {
            public ObservableValue<BigDecimal> call(TableColumn.CellDataFeatures<EOX<String>, BigDecimal> var1) {
               return ((EOX)var1.getValue()).getSumNet();
            }
         });
         this.fxml_invoice_purchase_list_summary_table_column_sum_tax.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<EOX<String>, BigDecimal>, ObservableValue<BigDecimal>>() {
            public ObservableValue<BigDecimal> call(TableColumn.CellDataFeatures<EOX<String>, BigDecimal> var1) {
               return ((EOX)var1.getValue()).getSumTax();
            }
         });
         this.fxml_invoice_purchase_list_summary_table_column_sum_brut.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<EOX<String>, BigDecimal>, ObservableValue<BigDecimal>>() {
            public ObservableValue<BigDecimal> call(TableColumn.CellDataFeatures<EOX<String>, BigDecimal> var1) {
               return ((EOX)var1.getValue()).getSumBrut();
            }
         });
         this.fxml_invoice_purchase_list_summary_table_column_name.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<EOX<String>, String>, ObservableValue<String>>() {
            public ObservableValue<String> call(TableColumn.CellDataFeatures<EOX<String>, String> var1) {
               return ((EOX)var1.getValue()).getTaxRate();
            }
         });
         this.fxml_invoice_purchase_list_summary_table.setItems(this.GIC);
         this.fxml_invoice_purchase_list_table_tree.setFixedCellSize(30.0);
         this.fxml_invoice_purchase_list_table_tree.setMinHeight(this.fxml_invoice_purchase_list_table_tree.getFixedCellSize() * 2.0);
         this.fxml_invoice_purchase_list_table_tree.maxHeightProperty().bind(this.fxml_invoice_purchase_list_table_tree.prefHeightProperty());
         this.fxml_invoice_purchase_list_summary_table_column_name.minWidthProperty().bind(this.fxml_invoice_purchase_list_tree_table_column_invoice_type.widthProperty().add(this.fxml_invoice_purchase_list_tree_table_column_ref_id.widthProperty()).add(this.fxml_invoice_purchase_list_tree_table_column_invoicing_date.widthProperty()).add(this.fxml_invoice_purchase_new_elements_tree_table_contractor_name.widthProperty()).add(this.fxml_invoice_purchase_new_elements_tree_table_contractor_nip.widthProperty()));
         this.fxml_invoice_purchase_list_summary_table_column_name.maxWidthProperty().bind(this.fxml_invoice_purchase_list_tree_table_column_invoice_type.widthProperty().add(this.fxml_invoice_purchase_list_tree_table_column_ref_id.widthProperty()).add(this.fxml_invoice_purchase_list_tree_table_column_invoicing_date.widthProperty()).add(this.fxml_invoice_purchase_new_elements_tree_table_contractor_name.widthProperty()).add(this.fxml_invoice_purchase_new_elements_tree_table_contractor_nip.widthProperty()));
         this.fxml_invoice_purchase_list_summary_table_column_sum_net.minWidthProperty().bind(this.fxml_invoice_purchase_list_tree_table_column_sum_net.widthProperty());
         this.fxml_invoice_purchase_list_summary_table_column_sum_net.maxWidthProperty().bind(this.fxml_invoice_purchase_list_tree_table_column_sum_net.widthProperty());
         this.fxml_invoice_purchase_list_summary_table_column_sum_tax.minWidthProperty().bind(this.fxml_invoice_purchase_list_tree_table_column_sum_tax.widthProperty());
         this.fxml_invoice_purchase_list_summary_table_column_sum_tax.maxWidthProperty().bind(this.fxml_invoice_purchase_list_tree_table_column_sum_tax.widthProperty());
         this.fxml_invoice_purchase_list_summary_table_column_sum_brut.minWidthProperty().bind(this.fxml_invoice_purchase_list_tree_table_column_sum_brut.widthProperty());
         this.fxml_invoice_purchase_list_summary_table_column_sum_brut.maxWidthProperty().bind(this.fxml_invoice_purchase_list_tree_table_column_sum_brut.widthProperty());
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
         this.GIH = null;
         this.fxml_include_left_barController.HHB();
         this.fxml_include_top_menuController.HHB();
         var1 = true;
      } finally {
         EXF.getInstance().ICP();
      }

      return var1;
   }

   private void HVR(boolean var1) {
      EXF.getInstance().ICO();

      try {
         this.GIF.QJB();
         this.GIE.QIZ();
         this.QIF.QJE();
         ETS var2 = (ETS)this.getProcess();
         this.GHU = var2.getPossibleDates();
         Calendar var3 = Calendar.getInstance();
         int var4 = var3.get(1);
         int var5 = var3.get(2);
         this.GIB = KH.getMonthByNumber(var5 + 1);
         this.GIA = String.valueOf(var4);
         EXF.getInstance().ICE("Actual year: " + this.GIA + " Actual month: " + (var5 + 1));
         if (this.GHU.get(this.GIA) == null) {
            this.GHU.put(this.GIA, new TreeSet());
         }

         if (!((SortedSet)this.GHU.get(this.GIA)).contains(this.GIB)) {
            ((SortedSet)this.GHU.get(this.GIA)).add(this.GIB);
         }

         this.fxml_invoice_purchase_list_pagination.setPageCount(1);
         this.fxml_invoice_purchase_list_year_search.getItems().clear();
         this.fxml_invoice_purchase_list_year.getItems().clear();
         if (this.GHU.keySet().size() > 0) {
            this.fxml_invoice_purchase_list_year.getItems().addAll(this.GHU.keySet());
            this.fxml_invoice_purchase_list_year.setValue(this.GIA);
            this.fxml_invoice_purchase_list_year_search.getItems().addAll(this.GHU.keySet());
            this.fxml_invoice_purchase_list_year_search.getItems().add(this.GHY);
            this.fxml_invoice_purchase_list_year_search.setValue(this.GHY);
            this.setPossibleMonths(this.GIA, true);
         }

         this.GIF.QJC();
         this.GIE.QJA();
         this.QIF.QJF();
      } catch (FFO | FFK var9) {
         EXF.getInstance().ICA((Throwable)var9);
         FCT.IGX(this.resources.getString("micro.process.invoice_purchase_list.Error.GetPossibleDatesError"), var9);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   private void setPossibleMonths(String var1, boolean var2) {
      EXF.getInstance().ICO();

      try {
         boolean var3 = this.GIE.isDisabled();
         this.GIE.QIZ();
         this.fxml_invoice_purchase_list_month.getItems().clear();
         if (this.GHU.get(var1) != null) {
            this.fxml_invoice_purchase_list_month.getItems().addAll((Collection)this.GHU.get(var1));
         }

         if (this.GIA.equals(var1) && var2) {
            this.fxml_invoice_purchase_list_month.setValue(this.GIB);
         } else if (this.GHU.get(var1) != null && ((SortedSet)this.GHU.get(var1)).size() > 0) {
            this.fxml_invoice_purchase_list_month.setValue((KH) ((SortedSet)this.GHU.get(var1)).last());
         }

         if (!var3) {
            this.GIE.QJA();
         }
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public void HHC() {
      EXF.getInstance().ICO();

      try {
         this.QIF.QJE();
         ((TextFieldValidated_Text)this.fxml_invoice_purchase_list_searchController.fxml_component_main_element).setText("");
         this.QIF.QJF();
         this.HHG();
         if (this.GIH == null) {
            this.HVR(true);
         } else {
            EXF.getInstance().ICE("Initial period present");
            this.HVR(false);
         }

         this.fxml_invoice_purchase_list_scroll_pane.setVvalue(this.fxml_invoice_purchase_list_scroll_pane.getVmin());
         this.GIF.setDontLoad(true);
         this.GIE.QIZ();
         if (this.GIH != null && this.GIH.getYear() != null && this.GIH.getYear().getValue() != null && this.GIH.getMonth() != null && this.GIH.getMonth().getValue() != null) {
            EXF.getInstance().ICE("Initial period " + this.GIH);
            if (this.GHU.get(String.valueOf(this.GIH.DDJ().getValue())) != null && ((SortedSet)this.GHU.get(String.valueOf(this.GIH.DDJ().getValue()))).contains(KH.getMonthByNumber((Integer)this.GIH.DDK().getValue()))) {
               this.fxml_invoice_purchase_list_year.getSelectionModel().select(String.valueOf(this.GIH.DDJ().getValue()));
               this.fxml_invoice_purchase_list_month.getSelectionModel().select(KH.getMonthByNumber((Integer)this.GIH.DDK().getValue()));
            } else {
               this.fxml_invoice_purchase_list_year.getSelectionModel().select(this.GIA);
               this.fxml_invoice_purchase_list_month.getSelectionModel().select(this.GIB);
            }
         }

         this.GIF.setDontLoad(false);
         this.GIE.QJA();
         this.fxml_invoice_purchase_list_month.setDisable(false);
         this.fxml_invoice_purchase_list_year.setDisable(false);
         this.getInvoicesByPeriod();
         this.fxml_include_left_barController.HHC();
         this.fxml_include_top_menuController.HHC();
      } catch (FFO | FFK var5) {
         EXF.getInstance().ICA((Throwable)var5);
         FCT.IGX("", var5);
         this.HWB();
      } finally {
         this.HVV();
         EXF.getInstance().ICP();
      }

   }

   protected void getInvoicesByPeriod() {
      this.getInvoicesByPeriod(false);
   }

   protected void getInvoicesByPeriod(final boolean var1) {
      EXF.getInstance().ICO();
      final MTI var2 = new MTI(null);

      try {
         final ETS var3 = (ETS)this.getProcess();
         this.fxml_invoice_purchase_list_pagination.setPageCount(1);
         Integer var4 = null;
         Integer var5 = null;
         if (this.fxml_invoice_purchase_list_year.getValue() != null) {
            var4 = Integer.valueOf((String)this.fxml_invoice_purchase_list_year.getValue());
         }

         if (this.fxml_invoice_purchase_list_month.getValue() != null) {
            var5 = Integer.valueOf(((KH)this.fxml_invoice_purchase_list_month.getValue()).getMonthNumberString());
         }

         final Callback<Integer, Node> var8 = this::HVS;
         Integer finalVar = var4;
         Integer finalVar1 = var5;
         MSX var9 = new MSX(this.FGW, this.fxml_parent.disableProperty()) {
            public void MXI() {
               EXF.getInstance().ICO();

               try {
                  ETN.this.GID = var3.getInvoices(ENP.ALL, finalVar, finalVar1, (String)null, (String)null);
               } catch (FFO | FFK var6) {
                  EXF.getInstance().ICA((Throwable)var6);
                  var2.setObject(var6);
               } catch (Exception var7) {
                  EXF.getInstance().ICA((Throwable)var7);
                  var2.setObject(var7);
               } finally {
                  EXF.getInstance().ICP();
               }

            }

            public void MXJ() {
               if (var2.getObject() == null) {
                  if (ETN.this.GID.size() % 50 > 0) {
                     ETN.this.fxml_invoice_purchase_list_pagination.setPageCount(ETN.this.GID.size() / 50 + 1);
                  } else {
                     ETN.this.fxml_invoice_purchase_list_pagination.setPageCount(ETN.this.GID.size() / 50);
                  }

                  ETN.this.fxml_invoice_purchase_list_pagination.setPageFactory(var8);
                  ETN.this.fxml_invoice_purchase_list_pagination.setCurrentPageIndex(0);
                  ETN.this.HVU();
                  ETN.this.GHX = false;
                  if (var1) {
                     ((TextFieldValidated_Text)ETN.this.fxml_invoice_purchase_list_searchController.fxml_component_main_element).requestFocus();
                     if (((TextFieldValidated_Text)ETN.this.fxml_invoice_purchase_list_searchController.fxml_component_main_element).getText() != null) {
                        ((TextFieldValidated_Text)ETN.this.fxml_invoice_purchase_list_searchController.fxml_component_main_element).selectPositionCaret(((TextFieldValidated_Text)ETN.this.fxml_invoice_purchase_list_searchController.fxml_component_main_element).getText().length());
                     }
                  } else {
                     ETN.this.fxml_parent.requestFocus();
                  }
               } else {
                  EXF.getInstance().ICA((Throwable)var2.getObject());
                  FCT.IGX(ETN.this.resources.getString("micro.process.invoice_purchase_list.Error.GetInvoicesError"), (Exception)var2.getObject());
               }

            }
         };
         var9.MXH();
      } catch (FFO | FFK var13) {
         EXF.getInstance().ICA((Throwable)var13);
         FCT.IGX(this.resources.getString("micro.process.invoice_purchase_list.Error.GetInvoicesError"), var13);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   protected void getInvoicesBySearch() {
      EXF.getInstance().ICO();

      try {
         String var1 = ((TextFieldValidated_Text)this.fxml_invoice_purchase_list_searchController.fxml_component_main_element).getText();
         if (var1 == null || var1.trim().length() < 3) {
            if (this.GHX) {
               this.fxml_invoice_purchase_list_month.setDisable(false);
               this.fxml_invoice_purchase_list_year.setDisable(false);
               this.getInvoicesByPeriod(true);
            }

            return;
         }

         final String var2 = var1.trim();
         this.fxml_invoice_purchase_list_month.setDisable(true);
         this.fxml_invoice_purchase_list_year.setDisable(true);
         final Callback<Integer, Node> var3 = this::HVS;
         final MTI var4 = new MTI(null);
         MSX var5 = new MSX(this.FGW, this.fxml_parent.disableProperty()) {
            public void MXI() {
               EXF.getInstance().ICO();

               try {
                  ETS var1 = (ETS)ETN.this.getProcess();
                  if (((String)ETN.this.fxml_invoice_purchase_list_year_search.getValue()).equals(ETN.this.GHY)) {
                     ETN.this.GID = var1.getInvoices(ENP.ALL, (Integer)null, (Integer)null, var2, (String)null);
                  } else {
                     ETN.this.GID = var1.getInvoices(ENP.ALL, Integer.valueOf((String)ETN.this.fxml_invoice_purchase_list_year_search.getValue()), (Integer)null, var2, (String)null);
                  }
               } catch (FFO | FFK var6) {
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
                  if (ETN.this.GID.size() % 50 > 0) {
                     ETN.this.fxml_invoice_purchase_list_pagination.setPageCount(ETN.this.GID.size() / 50 + 1);
                  } else {
                     ETN.this.fxml_invoice_purchase_list_pagination.setPageCount(ETN.this.GID.size() / 50);
                  }

                  ETN.this.fxml_invoice_purchase_list_pagination.setPageFactory(var3);
                  ETN.this.fxml_invoice_purchase_list_pagination.setCurrentPageIndex(0);
                  ETN.this.HVU();
                  ETN.this.GHX = true;
                  ((TextFieldValidated_Text)ETN.this.fxml_invoice_purchase_list_searchController.fxml_component_main_element).requestFocus();
                  if (((TextFieldValidated_Text)ETN.this.fxml_invoice_purchase_list_searchController.fxml_component_main_element).getText() != null) {
                     ((TextFieldValidated_Text)ETN.this.fxml_invoice_purchase_list_searchController.fxml_component_main_element).selectPositionCaret(((TextFieldValidated_Text)ETN.this.fxml_invoice_purchase_list_searchController.fxml_component_main_element).getText().length());
                  }
               } else {
                  EXF.getInstance().ICA((Throwable)var4.getObject());
                  FCT.IGX(ETN.this.resources.getString("micro.process.invoice_purchase_list.Error.GetInvoicesError"), (Exception)var4.getObject());
               }

            }
         };
         var5.MXH();
      } catch (FFK var9) {
         EXF.getInstance().ICA((Throwable)var9);
         FCT.IGX(this.resources.getString("micro.process.invoice_purchase_list.Error.GetInvoicesError"), var9);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   private Node HVS(int var1) {
      EXF.getInstance().ICO();

      VBox var3;
      try {
         this.GHW = var1;
         this.HVT();
         this.setTableHeight();
         VBox var2 = new VBox(new Node[]{this.fxml_invoice_purchase_list_table_tree, this.fxml_invoice_purchase_list_summary_table});
         var3 = var2;
      } finally {
         EXF.getInstance().ICP();
      }

      return var3;
   }

   protected void HVT() {
      if (this.GID != null) {
         int var1 = this.GHW * 50;
         int var2 = Math.min(var1 + 50, this.GID.size());
         ((ObservableList)this.GHZ.get()).clear();
         List var3 = this.GID.subList(var1, var2);
         Iterator var4 = var3.iterator();

         while(var4.hasNext()) {
            EPA var5 = (EPA)var4.next();
            String var6 = this.resources.getString("micro.process.common.invoices.InvoicePurchase");
            if (var5.getSubType().equals(IA.AGGREGATE.toString())) {
               var6 = this.resources.getString("micro.process.common.invoices.AggregatePurchase");
            }

            ETQ var7 = new ETQ(var5.getNr(), var5.getInvoicingDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), var5.getRefId(), var5.getContractorName(), var5.getContractorNip(), var5.getSumNet(), var5.getSumTax(), var5.getSumBrut(), var5.getInvoiceWrapper(), var6);
            ((ObservableList)this.GHZ.get()).add(var7);
         }

      }
   }

   private void setTableHeight() {
      this.fxml_invoice_purchase_list_table_tree.setPrefHeight(this.fxml_invoice_purchase_list_table_tree.getFixedCellSize() * (double)(this.fxml_invoice_purchase_list_table_tree.getItems().size() + 1));
   }

   @FXML
   protected void fxml_handleButton_back(ActionEvent var1) {
      EXF.getInstance().ICO();

      try {
         EXF.getInstance().ICE("Button [back] clicked");
         this.HHB();
         this.getApplication().HJD(this.getFxmlName(), "main.fxml");
      } finally {
         EXF.getInstance().ICP();
      }

   }

   @FXML
   protected void fxml_handleButton_invoice_purchase_list_edit(ActionEvent var1) {
      EXF.getInstance().ICO();

      try {
         EXF.getInstance().ICE("Button [invoice_edit] clicked");
         this.HHB();
         this.getApplication().HJE(this.getFxmlName(), this.getFxmlForItem(), new ENB<ENN<?>>() {
            public void HNE(ENN<?> var1) {
               EXF.getInstance().ICO();

               try {
                  var1.setInvoice((HR)((ETQ)ETN.this.fxml_invoice_purchase_list_table_tree.getSelectionModel().getSelectedItem()).getInvoice().getModelBaseElementWithIdObject());
                  var1.setMode(EPB.EDIT);
               } catch (FFK var6) {
                  EXF.getInstance().ICA((Throwable)var6);
                  throw new FFI(var6);
               } finally {
                  EXF.getInstance().ICP();
               }

            }
         });
      } finally {
         EXF.getInstance().ICP();
      }

   }

   private String getFxmlForItem() {
      String var1 = EOS.INVOICE_PURCHASE_NEW.getProcessFxmlFileName();

      try {
         if (((HR)((ETQ)this.fxml_invoice_purchase_list_table_tree.getSelectionModel().getSelectedItem()).getInvoice().getModelBaseElementWithIdObject()).getIsAggregatePurchase() != null && ((HR)((ETQ)this.fxml_invoice_purchase_list_table_tree.getSelectionModel().getSelectedItem()).getInvoice().getModelBaseElementWithIdObject()).getIsAggregatePurchase()) {
            var1 = EOS.AGGREGATE_PURCHASE_NEW.getProcessFxmlFileName();
         }
      } catch (FFK var3) {
         var3.printStackTrace();
      }

      return var1;
   }

   @FXML
   protected void fxml_handleButton_invoice_purchase_list_view(ActionEvent var1) {
      EXF.getInstance().ICO();

      try {
         EXF.getInstance().ICE("Button [view] clicked");
         this.HHB();
         this.getApplication().HJE(this.getFxmlName(), this.getFxmlForItem(), new ENB<ENN<?>>() {
            public void HNE(ENN<?> var1) {
               EXF.getInstance().ICO();

               try {
                  HR var2 = (HR)((ETQ)ETN.this.fxml_invoice_purchase_list_table_tree.getSelectionModel().getSelectedItem()).getInvoice().getModelBaseElementWithIdObject();
                  var1.setInvoice(var2);
                  var1.setMode(EPB.VIEW);
               } catch (FFK var6) {
                  EXF.getInstance().ICA((Throwable)var6);
                  throw new FFI(var6);
               } finally {
                  EXF.getInstance().ICP();
               }

            }
         });
      } finally {
         EXF.getInstance().ICP();
      }

   }

   @FXML
   protected void fxml_invoice_purchase_list_button_new_invoice(ActionEvent var1) {
      EXF.getInstance().ICO();

      try {
         EXF.getInstance().ICE("Button [new_invoice] clicked");
         this.HHB();
         this.getApplication().HJE(this.getFxmlName(), EOS.INVOICE_PURCHASE_NEW.getProcessFxmlFileName(), new ENB<ENN<?>>() {
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

   @FXML
   protected void fxml_invoice_purchase_list_button_new_aggregate_invoice(ActionEvent var1) {
      EXF.getInstance().ICO();

      try {
         EXF.getInstance().ICE("Button [new_aggregate_invoice] clicked");
         this.HHB();
         this.getApplication().HJE(this.getFxmlName(), EOS.AGGREGATE_PURCHASE_NEW.getProcessFxmlFileName(), new ENB<ENN<?>>() {
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

   @FXML
   protected void fxml_handleButton_invoice_purchase_list_delete(ActionEvent var1) {
      EXF.getInstance().ICO();

      try {
         FEN var2 = null;
         EXF.getInstance().ICE("Button [delete] clicked");
         if (((HR)((ETQ)this.fxml_invoice_purchase_list_table_tree.getSelectionModel().getSelectedItem()).getInvoice().getModelBaseElementWithIdObject()).getIsAggregatePurchase() != null && ((HR)((ETQ)this.fxml_invoice_purchase_list_table_tree.getSelectionModel().getSelectedItem()).getInvoice().getModelBaseElementWithIdObject()).getIsAggregatePurchase()) {
            var2 = FCR.getConfirmDataDialog(this.resources.getString("micro.process.other_sale_list.Dialog.deleteAreYouSure.title"), (String)null, this.resources.getString("micro.dialog.remove.confirm.button.remove"), this.resources.getString("micro.dialog.remove.confirm.button.cancel"), 500.0, 100.0, this.resources.getString("micro.process.invoice_purchase_listt.Dialog.deleteAreYouSure.header2"));
         } else {
            var2 = FCR.getConfirmDataDialog(this.resources.getString("micro.process.invoice_purchase_list.Dialog.deleteAreYouSure.title"), (String)null, this.resources.getString("micro.dialog.remove.confirm.button.remove"), this.resources.getString("micro.dialog.remove.confirm.button.cancel"), 500.0, 100.0, this.resources.getString("micro.process.invoice_purchase_list.Dialog.deleteAreYouSure.header"));
         }

         switch (var2) {
            case Confirm:
               ((ETS)this.getProcess()).QPH((HR)((ETQ)this.fxml_invoice_purchase_list_table_tree.getSelectionModel().getSelectedItem()).getInvoice().getModelBaseElementWithIdObject());
               if (this.GHX) {
                  this.getInvoicesBySearch();
               } else {
                  this.getInvoicesByPeriod();
               }

               EXF.getInstance().ICE("Invoice deleted");
            case Reject:
            case CancelExit:
         }
      } catch (FFO | FFK var6) {
         EXF.getInstance().ICA((Throwable)var6);
         FCT.IGX(this.resources.getString("micro.process.invoice_purchase_list.Error.DeleteInvoice"), var6);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   private void HVU() {
      EXF.getInstance().ICO();

      try {
         BigDecimal var1 = new BigDecimal(0);
         BigDecimal var2 = new BigDecimal(0);
         BigDecimal var3 = new BigDecimal(0);

         EPA var5;
         for(Iterator var4 = this.GID.iterator(); var4.hasNext(); var3 = var3.add(var5.getSumTax())) {
            var5 = (EPA)var4.next();
            var1 = var1.add(var5.getSumNet());
            var2 = var2.add(var5.getSumBrut());
         }

         ((ObservableList)this.GIC.get()).clear();
         EOX var9 = new EOX(this.resources.getString("micro.process.invoice_purchase_new.SummaryTaxRow"), var1, var3, var2);
         this.GIC.add(var9);
      } finally {
         EXF.getInstance().ICP();
      }
   }

   private void setEditDisable(boolean var1, String var2) {
      EXF.getInstance().ICO();

      try {
         this.fxml_invoice_purchase_list_button_edit.setDisable(var1);
         this.fxml_invoice_purchase_list_button_edit_error_label.setText(var2);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   private void setViewDisable(boolean var1, String var2) {
      EXF.getInstance().ICO();

      try {
         this.fxml_invoice_purchase_list_button_view.setDisable(var1);
         this.fxml_invoice_purchase_list_button_view_error_label.setText(var2);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   private void setDeleteDisable(boolean var1, String var2) {
      EXF.getInstance().ICO();

      try {
         this.fxml_invoice_purchase_list_button_delete.setDisable(var1);
         this.fxml_invoice_purchase_list_button_edit_error_label.setText(var2);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   private void HVV() {
      EXF.getInstance().ICO();

      try {
         if (this.fxml_invoice_purchase_list_table_tree.getSelectionModel().getSelectedIndex() == -1) {
            this.setAllDisabled();
            return;
         }

         EDF var1 = ((ETQ)this.fxml_invoice_purchase_list_table_tree.getSelectionModel().getSelectedItem()).getInvoice();
         if (var1 != null) {
            ETO var2 = this.HVW(var1);
            if (var2.HVQ()) {
               this.setEditDisable(false, (String)null);
            } else {
               this.setEditDisable(true, var2.getText());
            }

            var2 = this.HVX(var1);
            if (var2.HVQ()) {
               this.setViewDisable(false, (String)null);
            } else {
               this.setViewDisable(true, var2.getText());
            }

            var2 = this.QPG(var1);
            if (var2.HVQ()) {
               this.setDeleteDisable(false, (String)null);
            } else {
               this.setDeleteDisable(true, var2.getText());
            }

            return;
         }

         this.setAllDisabled();
      } finally {
         EXF.getInstance().ICP();
      }

   }

   private void setAllDisabled() {
      this.setEditDisable(true, (String)null);
      this.setViewDisable(true, (String)null);
      this.setDeleteDisable(true, (String)null);
   }

   private ETO HVW(EDF<HR> var1) {
      EXF.getInstance().ICO();

      ETO var3;
      try {
         boolean var2 = false;

         try {
            var2 = this.HVY(var1);
         } catch (FFO | FFK var8) {
            EXF.getInstance().ICA((Throwable)var8);
            FCT.IGX(this.resources.getString("micro.process.invoice_purchase_list.Error.GetInvoiceSettlement"), var8);
            ETO var4 = new ETO(false, this.resources.getString("micro.process.invoice_purchase_list.Error.GetInvoiceSettlement"));
            return var4;
         }

         if (var2) {
            var3 = new ETO(false, this.resources.getString("micro.process.invoice_purchase_list.PossibleResult.SettlementSetted"));
            return var3;
         }

         var3 = new ETO(true, (String)null);
      } finally {
         EXF.getInstance().ICP();
      }

      return var3;
   }

   private ETO QPG(EDF<HR> var1) {
      EXF.getInstance().ICO();

      ETO var2;
      try {
         var2 = this.HVW(var1);
      } finally {
         EXF.getInstance().ICP();
      }

      return var2;
   }

   private ETO HVX(EDF<HR> var1) {
      EXF.getInstance().ICO();

      ETO var2;
      try {
         var2 = new ETO(true, (String)null);
      } finally {
         EXF.getInstance().ICP();
      }

      return var2;
   }

   public boolean HVY(EDF<HR> var1) throws FFK, FFO {
      EXF.getInstance().ICO();

      boolean var3;
      try {
         boolean var2 = this.HVZ(var1.getPeriod());
         var3 = var2;
      } finally {
         EXF.getInstance().ICP();
      }

      return var3;
   }

   public boolean HVZ(JN var1) throws FFK, FFO {
      EXF.getInstance().ICO();

      boolean var4;
      try {
         ETS var2 = (ETS)this.getProcess();
         if (var2 == null) {
            throw FCZ.getInstance().IHJ();
         }

         JG var3 = var2.getSettlementStatus(var1);
         if (var3 == JG.SETTLED) {
            var4 = true;
            return var4;
         }

         var4 = false;
      } finally {
         EXF.getInstance().ICP();
      }

      return var4;
   }

   public boolean HWA(LocalDate var1) throws FFK, FFO {
      EXF.getInstance().ICO();

      boolean var4;
      try {
         ETS var2 = (ETS)this.getProcess();
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

   private void HWB() {
      EXF.getInstance().ICO();

      try {
         this.getApplication().HJD(this.getFxmlName(), "main.fxml");
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public void setPeriod(JN var1) throws FFK {
      EXF.getInstance().ICO();

      try {
         this.GIH = var1;
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public void setOnlyEmptyPeriod() {
   }

   private class QHA implements ChangeListener<String> {
      protected boolean QIE;

      private QHA() {
      }

      public void QJE() {
         this.QIE = true;
      }

      public void QJF() {
         this.QIE = false;
      }

      public boolean isDisabled() {
         return this.QIE;
      }

      public void changed(ObservableValue<? extends String> var1, String var2, String var3) {
         EXF.getInstance().ICO();

         try {
            if (var3 != null && !this.QIE) {
               ETN.this.getInvoicesBySearch();
            }
         } finally {
            EXF.getInstance().ICP();
         }

      }
   }

   private class QGZ implements ChangeListener<String> {
      protected boolean QID;
      private boolean QIC;

      private QGZ() {
         this.QIC = false;
      }

      public void QJB() {
         this.QID = true;
      }

      public void QJC() {
         this.QID = false;
      }

      public boolean isDisabled() {
         return this.QID;
      }

      public void changed(ObservableValue<? extends String> var1, String var2, String var3) {
         EXF.getInstance().ICO();

         try {
            if (var3 != null && !this.QID) {
               ETN.this.setPossibleMonths(var3, false);
               if (!this.QIC) {
                  ETN.this.getInvoicesByPeriod();
               }
            }
         } finally {
            EXF.getInstance().ICP();
         }

      }

      public void setDontLoad(boolean var1) {
         this.QIC = var1;
      }
   }

   private class QGY implements ChangeListener<KH> {
      protected boolean QIB;

      private QGY() {
      }

      public void QIZ() {
         this.QIB = true;
      }

      public void QJA() {
         this.QIB = false;
      }

      public boolean isDisabled() {
         return this.QIB;
      }

      public void changed(ObservableValue<? extends KH> var1, KH var2, KH var3) {
         EXF.getInstance().ICO();

         try {
            if (var3 != null && !this.QIB) {
               ETN.this.getInvoicesByPeriod();
            }
         } finally {
            EXF.getInstance().ICP();
         }

      }
   }

   private class ETO {
      private boolean GHR;
      private String GHS;

      public ETO(boolean var2, String var3) {
         this.GHR = var2;
         this.GHS = var3;
      }

      public boolean HVQ() {
         return this.GHR;
      }

      public String getText() {
         return this.GHS;
      }
   }
}
