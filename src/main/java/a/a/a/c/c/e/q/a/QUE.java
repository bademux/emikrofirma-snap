package a.a.a.c.c.e.q.a;

import a.a.a.b.c.FEN;
import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.c.b.EMC;
import a.a.a.c.c.b.ENB;
import a.a.a.c.c.b.a.b.a.EMP;
import a.a.a.c.c.b.a.b.a.EMR;
import a.a.a.c.c.b.b.EMT;
import a.a.a.c.c.d.ENI;
import a.a.a.c.c.d.EOS;
import a.a.a.c.c.d.a.ENO;
import a.a.a.c.c.d.a.QUV;
import a.a.a.c.c.d.d.EOG;
import a.a.a.c.c.d.d.EOK;
import a.a.a.c.c.d.d.EOQ;
import a.a.a.c.c.d.d.QUZ;
import a.a.a.c.c.d.g.EOX;
import a.a.a.c.c.d.g.EPB;
import a.a.a.c.c.d.n.QVB;
import a.a.a.c.c.e.q.c.QUL;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.a.EZG;
import a.a.a.c.f.a.h.JG;
import a.a.a.c.f.a.n.QSN;
import a.a.a.c.f.a.n.QSQ;
import a.a.a.c.f.b.b.JN;
import a.a.a.c.f.b.c.a.KH;
import a.a.a.c.f.b.c.a.QSW;
import a.a.a.c.f.c.c.TextFieldValidated_Text;
import a.a.a.c.g.MSX;
import a.a.a.c.g.MTI;
import a.a.a.c.g.a.FCR;
import a.a.a.c.g.a.FCT;
import a.a.a.c.g.c.FCZ;
import java.math.BigDecimal;
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
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.Pagination;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.VBox;
import javafx.util.Callback;

public class QUE extends ENO<QUL> {
   @FXML
   private EMR fxml_include_top_menuController;
   @FXML
   private EMP fxml_include_left_barController;
   @FXML
   private Button fxml_other_sale_list_button_new_other;
   @FXML
   private ComboBox<KH> fxml_other_sale_list_month;
   @FXML
   private ComboBox<String> fxml_other_sale_list_year;
   @FXML
   private EZG fxml_other_sale_list_searchController;
   @FXML
   private ComboBox<String> fxml_other_sale_list_year_search;
   @FXML
   private TableView<QVB<QSN>> fxml_other_sale_list_table;
   @FXML
   private TableColumn<QVB<QSN>, Date> fxml_other_sale_list_table_column_invoicing_date;
   @FXML
   private TableColumn<QVB<QSN>, String> fxml_other_sale_list_table_column_ref_id;
   @FXML
   private TableColumn<QVB<QSN>, QSQ> fxml_other_sale_list_table_column_other_type;
   @FXML
   private TableColumn<QVB<QSN>, BigDecimal> fxml_other_sale_list_table_column_sum_net;
   @FXML
   private TableColumn<QVB<QSN>, BigDecimal> fxml_other_sale_list_table_column_sum_tax;
   @FXML
   private TableColumn<QVB<QSN>, BigDecimal> fxml_other_sale_list_table_column_sum_brut;
   @FXML
   private TableView<EOX<String>> fxml_other_sale_list_summary_table;
   @FXML
   private TableColumn<EOX<String>, String> fxml_other_sale_list_summary_table_column_name;
   @FXML
   private TableColumn<EOX<String>, BigDecimal> fxml_other_sale_list_summary_table_column_sum_net;
   @FXML
   private TableColumn<EOX<String>, BigDecimal> fxml_other_sale_list_summary_table_column_sum_tax;
   @FXML
   private TableColumn<EOX<String>, BigDecimal> fxml_other_sale_list_summary_table_column_sum_brut;
   @FXML
   private Pagination fxml_other_sale_list_pagination;
   @FXML
   private Button fxml_other_sale_list_button_view;
   @FXML
   private Button fxml_other_sale_list_button_edit;
   @FXML
   private Button fxml_other_sale_list_button_delete;
   @FXML
   private Label fxml_other_sale_list_button_error_label;
   private SortedMap<String, SortedSet<KH>> RDA = null;
   private JN RDB = null;
   private String RDC;
   private KH RDD;
   private String RDE;
   private static final int RDF = 50;
   private int RDG = 0;
   private List<QVB<QSN>> RDH;
   private boolean RDI = true;
   protected final ListProperty<EOX<String>> RDJ = new SimpleListProperty(FXCollections.observableArrayList());
   private QUF RDK = new QUF();
   private QUG RDL = new QUG();
   private QUH RDM = new QUH();

   public QUE(EMC var1, EMT var2, String var3, String var4) {
      super(var1, var2, var3, var4);
      EXF.getInstance().ICQ();
   }

   @FXML
   public void initialize() {
      EXF.getInstance().ICO();

      try {
         this.RDE = this.resources.getString("micro.process.other_sale_list.SearchAll");
         ((TextFieldValidated_Text)this.fxml_other_sale_list_searchController.fxml_component_main_element).setPromptText(this.resources.getString("micro.process.other_sale_list.Find"));
         this.fxml_other_sale_list_table.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<QVB<QSN>>() {
            public void changed(ObservableValue<? extends QVB<QSN>> var1, QVB<QSN> var2, QVB<QSN> var3) {
               if (var3 != null) {
                  QUE.this.RMZ();
               } else {
                  QUE.this.setAllDisabled();
               }

            }
         });
         this.fxml_other_sale_list_month.valueProperty().addListener(this.RDK);
         this.fxml_other_sale_list_year.valueProperty().addListener(this.RDL);
         this.fxml_other_sale_list_table_column_invoicing_date.setCellValueFactory(new PropertyValueFactory("invoicingDate"));
         this.fxml_other_sale_list_table_column_ref_id.setCellValueFactory(new PropertyValueFactory("refId"));
         this.fxml_other_sale_list_table_column_other_type.setCellValueFactory(new PropertyValueFactory("invoiceOtherSubType"));
         this.fxml_other_sale_list_table_column_sum_net.setCellValueFactory(new PropertyValueFactory("sumNet"));
         this.fxml_other_sale_list_table_column_sum_tax.setCellValueFactory(new PropertyValueFactory("sumTax"));
         this.fxml_other_sale_list_table_column_sum_brut.setCellValueFactory(new PropertyValueFactory("sumBrut"));
         this.fxml_other_sale_list_table_column_other_type.setCellFactory(new EOG());
         this.fxml_other_sale_list_table_column_invoicing_date.setCellFactory(new QUZ());
         this.fxml_other_sale_list_table_column_sum_net.setCellFactory(TextFieldTableCell.forTableColumn(new EOK(ENI.get(), 2)));
         this.fxml_other_sale_list_table_column_sum_tax.setCellFactory(TextFieldTableCell.forTableColumn(new EOK(ENI.get(), 2)));
         this.fxml_other_sale_list_table_column_sum_brut.setCellFactory(TextFieldTableCell.forTableColumn(new EOK(ENI.get(), 2)));
         ((TextFieldValidated_Text)this.fxml_other_sale_list_searchController.fxml_component_main_element).textProperty().addListener(this.RDM);
         this.fxml_other_sale_list_month.setCellFactory(new EOQ());
         this.fxml_other_sale_list_month.setButtonCell((ListCell)this.fxml_other_sale_list_month.getCellFactory().call(null));
         this.fxml_other_sale_list_summary_table_column_sum_net.setCellFactory(TextFieldTableCell.forTableColumn(new EOK(ENI.get(), 2)));
         this.fxml_other_sale_list_summary_table_column_sum_tax.setCellFactory(TextFieldTableCell.forTableColumn(new EOK(ENI.get(), 2)));
         this.fxml_other_sale_list_summary_table_column_sum_brut.setCellFactory(TextFieldTableCell.forTableColumn(new EOK(ENI.get(), 2)));
         this.fxml_other_sale_list_summary_table_column_sum_net.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<EOX<String>, BigDecimal>, ObservableValue<BigDecimal>>() {
            public ObservableValue<BigDecimal> call(TableColumn.CellDataFeatures<EOX<String>, BigDecimal> var1) {
               return ((EOX)var1.getValue()).getSumNet();
            }
         });
         this.fxml_other_sale_list_summary_table_column_sum_tax.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<EOX<String>, BigDecimal>, ObservableValue<BigDecimal>>() {
            public ObservableValue<BigDecimal> call(TableColumn.CellDataFeatures<EOX<String>, BigDecimal> var1) {
               return ((EOX)var1.getValue()).getSumTax();
            }
         });
         this.fxml_other_sale_list_summary_table_column_sum_brut.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<EOX<String>, BigDecimal>, ObservableValue<BigDecimal>>() {
            public ObservableValue<BigDecimal> call(TableColumn.CellDataFeatures<EOX<String>, BigDecimal> var1) {
               return ((EOX)var1.getValue()).getSumBrut();
            }
         });
         this.fxml_other_sale_list_summary_table_column_name.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<EOX<String>, String>, ObservableValue<String>>() {
            public ObservableValue<String> call(TableColumn.CellDataFeatures<EOX<String>, String> var1) {
               return ((EOX)var1.getValue()).getTaxRate();
            }
         });
         this.fxml_other_sale_list_summary_table.setItems(this.RDJ);
         this.fxml_other_sale_list_table.setFixedCellSize(30.0);
         this.fxml_other_sale_list_table.setMinHeight(this.fxml_other_sale_list_table.getFixedCellSize() * 2.0);
         this.fxml_other_sale_list_table.maxHeightProperty().bind(this.fxml_other_sale_list_table.prefHeightProperty());
         this.fxml_other_sale_list_summary_table_column_name.minWidthProperty().bind(this.fxml_other_sale_list_table_column_invoicing_date.widthProperty().add(this.fxml_other_sale_list_table_column_ref_id.widthProperty()).add(this.fxml_other_sale_list_table_column_other_type.widthProperty()));
         this.fxml_other_sale_list_summary_table_column_name.maxWidthProperty().bind(this.fxml_other_sale_list_table_column_invoicing_date.widthProperty().add(this.fxml_other_sale_list_table_column_ref_id.widthProperty()).add(this.fxml_other_sale_list_table_column_other_type.widthProperty()));
         this.fxml_other_sale_list_summary_table_column_sum_net.minWidthProperty().bind(this.fxml_other_sale_list_table_column_sum_net.widthProperty());
         this.fxml_other_sale_list_summary_table_column_sum_net.maxWidthProperty().bind(this.fxml_other_sale_list_table_column_sum_net.widthProperty());
         this.fxml_other_sale_list_summary_table_column_sum_tax.minWidthProperty().bind(this.fxml_other_sale_list_table_column_sum_tax.widthProperty());
         this.fxml_other_sale_list_summary_table_column_sum_tax.maxWidthProperty().bind(this.fxml_other_sale_list_table_column_sum_tax.widthProperty());
         this.fxml_other_sale_list_summary_table_column_sum_brut.minWidthProperty().bind(this.fxml_other_sale_list_table_column_sum_brut.widthProperty());
         this.fxml_other_sale_list_summary_table_column_sum_brut.maxWidthProperty().bind(this.fxml_other_sale_list_table_column_sum_brut.widthProperty());
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public void HHE() {
      EXF.getInstance().ICO();

      try {
         super.HHE();
      } catch (FFK var5) {
         EXF.getInstance().ICA((Throwable)var5);
         throw new FFI(var5);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public boolean HHB() {
      EXF.getInstance().ICO();

      boolean var1;
      try {
         this.fxml_include_top_menuController.HHB();
         this.fxml_include_left_barController.HHB();
         var1 = true;
      } finally {
         EXF.getInstance().ICP();
      }

      return var1;
   }

   public void HHC() {
      EXF.getInstance().ICO();

      try {
         this.fxml_include_top_menuController.HHC();
         this.fxml_include_left_barController.HHC();
         this.HHG();
         if (this.RDB == null) {
            this.RMV(true);
         } else {
            this.RMV(false);
         }

         this.RDL.RMQ();
         this.RDK.RMO();
         if (this.RDB != null && this.RDB.getYear() != null && this.RDB.getYear().getValue() != null && this.RDB.getMonth() != null && this.RDB.getMonth().getValue() != null) {
            EXF.getInstance().ICE("Initial period " + this.RDB);
            if (this.RDA.get(String.valueOf(this.RDB.DDJ().getValue())) != null && ((SortedSet)this.RDA.get(String.valueOf(this.RDB.DDJ().getValue()))).contains(KH.getMonthByNumber((Integer)this.RDB.DDK().getValue()))) {
               this.fxml_other_sale_list_year.getSelectionModel().select(String.valueOf(this.RDB.DDJ().getValue()));
               this.fxml_other_sale_list_month.getSelectionModel().select(KH.getMonthByNumber((Integer)this.RDB.DDK().getValue()));
            } else {
               this.fxml_other_sale_list_year.getSelectionModel().select(this.RDC);
               this.fxml_other_sale_list_month.getSelectionModel().select(this.RDD);
            }
         }

         this.RDL.RMR();
         this.RDK.RMP();
         this.fxml_other_sale_list_year.setDisable(false);
         this.getInvoicesByPeriod(false);
         this.fxml_parent.requestFocus();
      } catch (FFO | FFK var5) {
         EXF.getInstance().ICA((Throwable)var5);
         throw new FFI(var5);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public void setOnlyEmptyPeriod() {
   }

   public void setPeriod(JN var1) throws FFK {
      EXF.getInstance().ICO();

      try {
         this.RDB = var1;
      } finally {
         EXF.getInstance().ICP();
      }

   }

   @FXML
   private void fxml_handleButton_other_sale_list_view() {
      EXF.getInstance().ICO();

      try {
         EXF.getInstance().ICE("Button [view] clicked");
         final QSN var1 = (QSN)((QVB)this.fxml_other_sale_list_table.getSelectionModel().getSelectedItem()).getRealInvoice();
         this.getApplication().HJE(this.getFxmlName(), EOS.SALE_NEW.getProcessFxmlFileName(), new ENB<QUV<?>>() {
            public void HNE(QUV<?> var1x) {
               EXF.getInstance().ICO();

               try {
                  var1x.setInvoice(var1);
                  var1x.setMode(EPB.VIEW);
               } catch (FFK var6) {
                  EXF.getInstance().ICA((Throwable)var6);
                  throw new FFI(var6);
               } finally {
                  EXF.getInstance().ICP();
               }

            }
         });
      } catch (FFK var5) {
         EXF.getInstance().ICA((Throwable)var5);
         throw new FFI(var5);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   @FXML
   private void fxml_handleButton_other_sale_list_edit() {
      EXF.getInstance().ICO();

      try {
         EXF.getInstance().ICE("Button [edit] clicked");
         final QSN var1 = (QSN)((QVB)this.fxml_other_sale_list_table.getSelectionModel().getSelectedItem()).getRealInvoice();
         this.getApplication().HJE(this.getFxmlName(), EOS.SALE_NEW.getProcessFxmlFileName(), new ENB<QUV<?>>() {
            public void HNE(QUV<?> var1x) {
               EXF.getInstance().ICO();

               try {
                  var1x.setInvoice(var1);
                  var1x.setMode(EPB.EDIT);
               } catch (FFK var6) {
                  EXF.getInstance().ICA((Throwable)var6);
                  throw new FFI(var6);
               } finally {
                  EXF.getInstance().ICP();
               }

            }
         });
      } catch (FFK var5) {
         EXF.getInstance().ICA((Throwable)var5);
         throw new FFI(var5);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   @FXML
   private void fxml_handleButton_other_sale_list_delete() {
      EXF.getInstance().ICO();

      try {
         EXF.getInstance().ICE("Button [delete] clicked");
         FEN var1 = FCR.getConfirmDataDialog(this.resources.getString("micro.process.other_sale_list.Dialog.deleteAreYouSure.title"), (String)null, this.resources.getString("micro.dialog.remove.confirm.button.remove"), this.resources.getString("micro.dialog.remove.confirm.button.cancel"), 500.0, 100.0, this.resources.getString("micro.process.other_sale_list.Dialog.deleteAreYouSure.header"));
         switch (var1) {
            case Confirm:
               ((QUL)this.getProcess()).RNF(((QVB)this.fxml_other_sale_list_table.getSelectionModel().getSelectedItem()).getInvoiceWrapper());
               if (this.RDI) {
                  this.getInvoicesBySearch();
               } else {
                  this.getInvoicesByPeriod(false);
               }

               EXF.getInstance().ICE("Invoice deleted");
            case Reject:
            case CancelExit:
         }
      } catch (FFO | FFK var5) {
         EXF.getInstance().ICA((Throwable)var5);
         FCT.IGX(this.resources.getString("micro.process.other_sale_list.error.cancel"), var5);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   @FXML
   private void fxml_other_sale_list_button_new_other_sale() {
      EXF.getInstance().ICO();

      try {
         EXF.getInstance().ICE("Button [SALE_NEW_OTHER] clicked");
         this.getApplication().HJD(this.getFxmlName(), EOS.SALE_NEW.getProcessFxmlFileName());
      } finally {
         EXF.getInstance().ICP();
      }

   }

   private void RMV(boolean var1) {
      EXF.getInstance().ICO();

      try {
         this.RDL.RMQ();
         this.RDK.RMO();
         this.RDM.RMS();
         QUL var2 = (QUL)this.getProcess();
         this.RDA = var2.getPossibleDates();
         Calendar var3 = Calendar.getInstance();
         int var4 = var3.get(1);
         int var5 = var3.get(2);
         this.RDD = KH.getMonthByNumber(var5 + 1);
         this.RDC = String.valueOf(var4);
         if (this.RDA != null && this.RDA.get(this.RDC) == null) {
            this.RDA.put(this.RDC, new TreeSet());
         }

         if (this.RDA != null && !((SortedSet)this.RDA.get(this.RDC)).contains(this.RDD)) {
            ((SortedSet)this.RDA.get(this.RDC)).add(this.RDD);
         }

         this.fxml_other_sale_list_pagination.setPageCount(1);
         if (this.RDA != null) {
            this.fxml_other_sale_list_year_search.getItems().clear();
            this.fxml_other_sale_list_year.getItems().clear();
            if (this.RDA.keySet().size() > 0) {
               this.fxml_other_sale_list_year.getItems().addAll(this.RDA.keySet());
               this.fxml_other_sale_list_year.setValue(this.RDC);
               this.fxml_other_sale_list_year_search.getItems().addAll(this.RDA.keySet());
               this.fxml_other_sale_list_year_search.getItems().add(this.RDE);
               this.fxml_other_sale_list_year_search.setValue(this.RDE);
               this.setPossibleMonths(this.RDC, true);
            } else {
               this.fxml_other_sale_list_pagination.setPageCount(1);
            }
         }

         this.RDL.RMR();
         this.RDK.RMP();
         this.RDM.RMT();
      } catch (FFO | FFK var9) {
         EXF.getInstance().ICA((Throwable)var9);
         FCT.IGX(this.resources.getString("micro.process.other_sale_list.Error.GetPossibleDatesError"), var9);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   private void setPossibleMonths(String var1, boolean var2) {
      EXF.getInstance().ICO();

      try {
         boolean var3 = this.RDK.isDisabled();
         this.RDK.RMO();
         this.fxml_other_sale_list_month.getItems().clear();
         if (this.RDA.get(var1) != null) {
            this.fxml_other_sale_list_month.getItems().addAll((Collection)this.RDA.get(var1));
         }

         if (this.RDC.equals(var1) && var2) {
            this.fxml_other_sale_list_month.setValue(this.RDD);
         } else if (this.RDA.get(var1) != null && ((SortedSet)this.RDA.get(var1)).size() > 0) {
            this.fxml_other_sale_list_month.setValue((KH) ((SortedSet)this.RDA.get(var1)).last());
         }

         if (!var3) {
            this.RDK.RMP();
         }
      } finally {
         EXF.getInstance().ICP();
      }

   }

   private void getInvoicesByPeriod(final boolean var1) {
      EXF.getInstance().ICO();

      try {
         final Callback<Integer, Node> var2 = this::RMX;
         final MTI var3 = new MTI(null);
         MSX var4 = new MSX(this.FGW, this.fxml_parent.disableProperty()) {
            public void MXI() {
               EXF.getInstance().ICO();

               try {
                  QUE.this.RDH = ((QUL)QUE.this.getProcess()).getInvoicesOtherSell(Integer.valueOf((String)QUE.this.fxml_other_sale_list_year.getValue()), Integer.valueOf(((KH)QUE.this.fxml_other_sale_list_month.getValue()).getMonthNumberString()), (String)null, QSW.ACTIVE);
               } catch (Exception var5) {
                  EXF.getInstance().ICA((Throwable)var5);
                  var3.setObject(var5);
               } finally {
                  EXF.getInstance().ICP();
               }

            }

            public void MXJ() {
               if (var3.getObject() == null) {
                  if (QUE.this.RDH.size() % 50 > 0) {
                     QUE.this.fxml_other_sale_list_pagination.setPageCount(QUE.this.RDH.size() / 50 + 1);
                  } else {
                     QUE.this.fxml_other_sale_list_pagination.setPageCount(QUE.this.RDH.size() / 50);
                  }

                  QUE.this.fxml_other_sale_list_pagination.setPageFactory(var2);
                  QUE.this.fxml_other_sale_list_pagination.setCurrentPageIndex(0);
                  if (var1) {
                     ((TextFieldValidated_Text)QUE.this.fxml_other_sale_list_searchController.fxml_component_main_element).requestFocus();
                     if (((TextFieldValidated_Text)QUE.this.fxml_other_sale_list_searchController.fxml_component_main_element).getText() != null) {
                        ((TextFieldValidated_Text)QUE.this.fxml_other_sale_list_searchController.fxml_component_main_element).selectPositionCaret(((TextFieldValidated_Text)QUE.this.fxml_other_sale_list_searchController.fxml_component_main_element).getText().length());
                     }
                  } else {
                     QUE.this.fxml_parent.requestFocus();
                  }

                  QUE.this.RMW();
                  QUE.this.RDI = false;
                  if (var1) {
                     ((TextFieldValidated_Text)QUE.this.fxml_other_sale_list_searchController.fxml_component_main_element).requestFocus();
                     if (((TextFieldValidated_Text)QUE.this.fxml_other_sale_list_searchController.fxml_component_main_element).getText() != null) {
                        ((TextFieldValidated_Text)QUE.this.fxml_other_sale_list_searchController.fxml_component_main_element).selectPositionCaret(((TextFieldValidated_Text)QUE.this.fxml_other_sale_list_searchController.fxml_component_main_element).getText().length());
                     }
                  } else {
                     QUE.this.fxml_parent.requestFocus();
                  }
               } else {
                  FCT.IGX(QUE.this.resources.getString("micro.process.other_sale_list.Error.GetInvoicesError"), (Exception)var3.getObject());
               }

            }
         };
         var4.MXH();
      } catch (FFK | NumberFormatException var8) {
         EXF.getInstance().ICA((Throwable)var8);
         FCT.IGX(this.resources.getString("micro.process.other_sale_list.Error.GetInvoicesError"), var8);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   private void getInvoicesBySearch() {
      EXF.getInstance().ICO();

      try {
         String var1 = ((TextFieldValidated_Text)this.fxml_other_sale_list_searchController.fxml_component_main_element).getText();
         if (var1 == null || var1.trim().length() < 3) {
            if (this.RDI) {
               this.fxml_other_sale_list_month.setDisable(false);
               this.fxml_other_sale_list_year.setDisable(false);
               this.getInvoicesByPeriod(true);
            }

            return;
         }

         final String var2 = var1.trim();
         this.fxml_other_sale_list_month.setDisable(true);
         this.fxml_other_sale_list_year.setDisable(true);
         final Callback<Integer, Node> var3 = this::RMX;
         final MTI var4 = new MTI(null);
         MSX var5 = new MSX(this.FGW, this.fxml_parent.disableProperty()) {
            public void MXI() {
               EXF.getInstance().ICO();

               try {
                  if (((String)QUE.this.fxml_other_sale_list_year_search.getValue()).equals(QUE.this.RDE)) {
                     QUE.this.RDH = ((QUL)QUE.this.getProcess()).getInvoicesOtherSell((Integer)null, (Integer)null, var2, (QSW)null);
                  } else {
                     QUE.this.RDH = ((QUL)QUE.this.getProcess()).getInvoicesOtherSell(Integer.valueOf((String)QUE.this.fxml_other_sale_list_year.getValue()), (Integer)null, var2, (QSW)null);
                  }
               } catch (Exception var5) {
                  EXF.getInstance().ICA((Throwable)var5);
                  var4.setObject(var5);
               } finally {
                  EXF.getInstance().ICP();
               }

            }

            public void MXJ() {
               if (var4.getObject() == null) {
                  if (QUE.this.RDH.size() % 50 > 0) {
                     QUE.this.fxml_other_sale_list_pagination.setPageCount(QUE.this.RDH.size() / 50 + 1);
                  } else {
                     QUE.this.fxml_other_sale_list_pagination.setPageCount(QUE.this.RDH.size() / 50);
                  }

                  QUE.this.fxml_other_sale_list_pagination.setPageFactory(var3);
                  QUE.this.fxml_other_sale_list_pagination.setCurrentPageIndex(0);
                  QUE.this.RDI = true;
                  QUE.this.RMW();
                  ((TextFieldValidated_Text)QUE.this.fxml_other_sale_list_searchController.fxml_component_main_element).requestFocus();
                  if (((TextFieldValidated_Text)QUE.this.fxml_other_sale_list_searchController.fxml_component_main_element).getText() != null) {
                     ((TextFieldValidated_Text)QUE.this.fxml_other_sale_list_searchController.fxml_component_main_element).selectPositionCaret(((TextFieldValidated_Text)QUE.this.fxml_other_sale_list_searchController.fxml_component_main_element).getText().length());
                  }
               } else {
                  FCT.IGX(QUE.this.resources.getString("micro.process.other_sale_list.Error.GetInvoicesError"), (Exception)var4.getObject());
               }

            }
         };
         var5.MXH();
      } catch (FFK | NumberFormatException var9) {
         EXF.getInstance().ICA((Throwable)var9);
         FCT.IGX(this.resources.getString("micro.process.other_sale_list.Error.GetInvoicesError"), var9);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   private void RMW() {
      EXF.getInstance().ICO();

      try {
         BigDecimal var1 = new BigDecimal(0);
         BigDecimal var2 = new BigDecimal(0);
         BigDecimal var3 = new BigDecimal(0);
         QVB var5;
         if (this.RDH != null) {
            for(Iterator var4 = this.RDH.iterator(); var4.hasNext(); var3 = var3.add(var5.getSumTax())) {
               var5 = (QVB)var4.next();
               var1 = var1.add(var5.getSumNet());
               var2 = var2.add(var5.getSumBrut());
            }
         }

         ((ObservableList)this.RDJ.get()).clear();
         EOX var9 = new EOX(this.resources.getString("micro.process.other_sale_list.SummaryTaxRow"), var1, var3, var2);
         this.RDJ.add(var9);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   private Node RMX(int var1) {
      EXF.getInstance().ICO();

      VBox var3;
      try {
         this.RDG = var1;
         this.RMY();
         this.setTableHeight();
         VBox var2 = new VBox(new Node[]{this.fxml_other_sale_list_table, this.fxml_other_sale_list_summary_table});
         var3 = var2;
      } finally {
         EXF.getInstance().ICP();
      }

      return var3;
   }

   private void setTableHeight() {
      EXF.getInstance().ICO();

      try {
         this.fxml_other_sale_list_table.setPrefHeight(this.fxml_other_sale_list_table.getFixedCellSize() * ((double)this.fxml_other_sale_list_table.getItems().size() + 1.2));
      } finally {
         EXF.getInstance().ICP();
      }

   }

   private void RMY() {
      EXF.getInstance().ICO();

      try {
         if (this.RDH != null) {
            int var1 = this.RDG * 50;
            int var2 = Math.min(var1 + 50, this.RDH.size());
            List var3 = this.RDH.subList(var1, var2);
            this.fxml_other_sale_list_table.setItems(FXCollections.observableArrayList(var3));
            this.fxml_other_sale_list_table.refresh();
            return;
         }
      } finally {
         EXF.getInstance().ICP();
      }

   }

   private void RMZ() {
      EXF.getInstance().ICO();

      try {
         if (this.fxml_other_sale_list_table.getSelectionModel().getSelectedIndex() == -1) {
            this.setAllDisabled();
            return;
         }

         QVB var1 = (QVB)this.fxml_other_sale_list_table.getSelectionModel().getSelectedItem();
         if (var1 == null) {
            this.setAllDisabled();
            return;
         }

         QUI var2 = this.RNA(var1);
         if (var2.RMU()) {
            this.setEditDisable(false, (String)null);
         } else {
            this.setEditDisable(true, var2.getText());
         }

         var2 = this.RNB(var1);
         if (var2.RMU()) {
            this.setViewDisable(false, (String)null);
         } else {
            this.setViewDisable(true, var2.getText());
         }

         var2 = this.RNC(var1);
         if (var2.RMU()) {
            this.setDeleteDisable(false, (String)null);
         } else {
            this.setDeleteDisable(true, var2.getText());
         }
      } finally {
         EXF.getInstance().ICP();
      }

   }

   private void setEditDisable(boolean var1, String var2) {
      EXF.getInstance().ICO();

      try {
         this.fxml_other_sale_list_button_edit.setDisable(var1);
         this.fxml_other_sale_list_button_error_label.setText(var2);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   private void setViewDisable(boolean var1, String var2) {
      EXF.getInstance().ICO();

      try {
         this.fxml_other_sale_list_button_view.setDisable(var1);
         this.fxml_other_sale_list_button_error_label.setText(var2);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   private void setDeleteDisable(boolean var1, String var2) {
      EXF.getInstance().ICO();

      try {
         this.fxml_other_sale_list_button_delete.setDisable(var1);
         this.fxml_other_sale_list_button_error_label.setText(var2);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   private QUI RNA(QVB<QSN> var1) {
      EXF.getInstance().ICO();

      QUI var3;
      try {
         if (var1.getState().equals(QSW.CANCELED)) {
            QUI var10 = new QUI(false, (String)null);
            return var10;
         }

         boolean var2 = false;

         try {
            var2 = this.RND(var1);
         } catch (FFO | FFK var8) {
            EXF.getInstance().ICA((Throwable)var8);
            FCT.IGX(this.resources.getString("micro.process.other_sale_list.Error.GetInvoiceSettlement"), var8);
            QUI var4 = new QUI(false, this.resources.getString("micro.process.other_sale_list.Error.GetInvoiceSettlement"));
            return var4;
         }

         if (!var2) {
            var3 = new QUI(true, (String)null);
            return var3;
         }

         var3 = new QUI(false, this.resources.getString("micro.process.other_sale_list.PossibleResult.SettlementSetted"));
      } finally {
         EXF.getInstance().ICP();
      }

      return var3;
   }

   private QUI RNB(QVB<QSN> var1) {
      EXF.getInstance().ICO();

      QUI var2;
      try {
         var2 = new QUI(true, (String)null);
      } finally {
         EXF.getInstance().ICP();
      }

      return var2;
   }

   private QUI RNC(QVB<QSN> var1) {
      EXF.getInstance().ICO();

      QUI var3;
      try {
         boolean var2 = false;

         try {
            var2 = this.RND(var1);
         } catch (FFO | FFK var8) {
            EXF.getInstance().ICA((Throwable)var8);
            FCT.IGX(this.resources.getString("micro.process.other_sale_list.Error.GetInvoiceSettlement"), var8);
            QUI var4 = new QUI(false, this.resources.getString("micro.process.other_sale_list.Error.GetInvoiceSettlement"));
            return var4;
         }

         if (var2) {
            var3 = new QUI(false, this.resources.getString("micro.process.other_sale_list.PossibleResult.SettlementSetted"));
            return var3;
         }

         var3 = new QUI(true, (String)null);
      } finally {
         EXF.getInstance().ICP();
      }

      return var3;
   }

   private void setAllDisabled() {
      EXF.getInstance().ICO();

      try {
         this.setEditDisable(true, (String)null);
         this.setViewDisable(true, (String)null);
         this.setDeleteDisable(true, (String)null);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public boolean RND(QVB<QSN> var1) throws FFK, FFO {
      EXF.getInstance().ICO();

      boolean var3;
      try {
         boolean var2 = this.RNE(var1.getPeriod());
         var3 = var2;
      } finally {
         EXF.getInstance().ICP();
      }

      return var3;
   }

   public boolean RNE(JN var1) throws FFK, FFO {
      EXF.getInstance().ICO();

      boolean var4;
      try {
         QUL var2 = (QUL)this.getProcess();
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

   private class QUI {
      private boolean RCY;
      private String RCZ;

      public QUI(boolean var2, String var3) {
         this.RCY = var2;
         this.RCZ = var3;
      }

      public boolean RMU() {
         return this.RCY;
      }

      public String getText() {
         return this.RCZ;
      }
   }

   private class QUH implements ChangeListener<String> {
      protected boolean RCX;

      private QUH() {
      }

      public void RMS() {
         this.RCX = true;
      }

      public void RMT() {
         this.RCX = false;
      }

      public boolean isDisabled() {
         return this.RCX;
      }

      public void changed(ObservableValue<? extends String> var1, String var2, String var3) {
         EXF.getInstance().ICO();

         try {
            if (var3 != null && !this.RCX) {
               QUE.this.getInvoicesBySearch();
            }
         } finally {
            EXF.getInstance().ICP();
         }

      }
   }

   private class QUG implements ChangeListener<String> {
      protected boolean RCW;

      private QUG() {
      }

      public void RMQ() {
         this.RCW = true;
      }

      public void RMR() {
         this.RCW = false;
      }

      public boolean isDisabled() {
         return this.RCW;
      }

      public void changed(ObservableValue<? extends String> var1, String var2, String var3) {
         EXF.getInstance().ICO();

         try {
            if (var3 != null && !this.RCW) {
               QUE.this.setPossibleMonths(var3, false);
               QUE.this.getInvoicesByPeriod(false);
            }
         } finally {
            EXF.getInstance().ICP();
         }

      }
   }

   private class QUF implements ChangeListener<KH> {
      protected boolean RCV;

      private QUF() {
      }

      public void RMO() {
         this.RCV = true;
      }

      public void RMP() {
         this.RCV = false;
      }

      public boolean isDisabled() {
         return this.RCV;
      }

      public void changed(ObservableValue<? extends KH> var1, KH var2, KH var3) {
         EXF.getInstance().ICO();

         try {
            if (var3 != null && !this.RCV) {
               QUE.this.getInvoicesByPeriod(false);
            }
         } finally {
            EXF.getInstance().ICP();
         }

      }
   }
}
