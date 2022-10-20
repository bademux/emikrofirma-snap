package a.a.a.c.c.e.f.a;

import a.a.a.b.f.FFK;
import a.a.a.c.c.d.d.b.EOB;
import a.a.a.c.c.d.d.b.EOC;
import a.a.a.c.e.a.d.ValueContainer2;
import a.a.a.c.f.a.c.Contractor;
import a.a.a.c.f.a.e.a.InvoiceRecord;
import a.a.a.c.f.a.e.a.InvoiceRecordElement;
import a.a.a.c.f.a.e.a.InvoiceRecordElementPurchase;
import a.a.a.c.f.b.a.JJ;
import a.a.a.c.f.b.c.JR;
import a.a.a.c.g.b.FCW;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.BooleanBinding;
import javafx.beans.binding.DoubleBinding;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.util.Callback;

import java.util.Optional;
import java.util.ResourceBundle;

class ETF {
    private final TableView<InvoiceRecordElement> GGA;
    private final ResourceBundle GGB;
    private TableColumn<InvoiceRecordElement, Integer> GGC;
    private TableColumn<InvoiceRecordElement, String> GGD;
    private TableColumn<InvoiceRecordElement, String> GGE;
    private TableColumn<InvoiceRecordElement, String> GGF;
    private TableColumn<InvoiceRecordElement, Contractor> GGG;
    private TableColumn<InvoiceRecordElement, Contractor> GGH;
    private TableColumn<InvoiceRecordElement, ?> GGI;
    private TableColumn<InvoiceRecordElement, ?> GGJ;
    private TableColumn<InvoiceRecordElement, ?> GGK;
    private TableColumn<InvoiceRecordElement, ValueContainer2<JR, JR>> GGL;
    private TableColumn<InvoiceRecordElement, ValueContainer2<JR, JR>> GGM;
    private TableColumn<InvoiceRecordElement, ValueContainer2<JR, JR>> GGN;
    private TableColumn<InvoiceRecordElement, ValueContainer2<JR, JR>> QMR;
    private TableColumn<InvoiceRecordElement, ValueContainer2<JR, JR>> GGO;
    private TableColumn<InvoiceRecordElement, ValueContainer2<JR, JR>> GGP;
    private TableColumn<InvoiceRecordElement, ValueContainer2<JR, JR>> GGQ;
    private TableColumn<InvoiceRecordElement, ValueContainer2<JR, JR>> GGR;
    private TableColumn<InvoiceRecordElement, ValueContainer2<JR, JR>> GGS;
    private TableColumn<InvoiceRecordElement, JR> GGT;
    private TableColumn<InvoiceRecordElement, JR> GGU;
    private TableColumn<InvoiceRecordElement, JR> GGV;
    private final Boolean GGW;
    private final TableView<InvoiceRecord> GGX;

    ETF(TableView<InvoiceRecordElement> var1, Boolean var2, ResourceBundle var3, TableView<InvoiceRecord> var4) {
        this.GGA = var1;
        this.GGW = var2;
        this.GGB = var3;
        this.GGX = var4;
    }

    BooleanBinding HUS() {
        return Bindings.size(this.GGA.getItems()).isEqualTo(0);
    }

    void initialize() {
        this.HUX(this.GGW);
        this.setColumnsWidth();
        this.HUU();
    }

    private void setColumnsWidth() {
        this.GGC.minWidthProperty().bind(this.GGA.widthProperty().multiply(0.025));
        this.GGD.minWidthProperty().bind(this.GGA.widthProperty().multiply(0.06));
        this.GGE.minWidthProperty().bind(this.GGA.widthProperty().multiply(0.065));
        this.GGG.minWidthProperty().bind(this.GGA.widthProperty().multiply(0.08));
        this.GGH.minWidthProperty().bind(this.GGA.widthProperty().multiply(0.08));
        if (this.GGF != null) {
            this.GGF.minWidthProperty().bind(this.GGA.widthProperty().multiply(0.08));
        }

        this.GGT.minWidthProperty().bind(this.GGA.widthProperty().multiply(0.05));
        this.GGU.minWidthProperty().bind(this.GGA.widthProperty().multiply(0.05));
        this.GGV.minWidthProperty().bind(this.GGA.widthProperty().multiply(0.05));
        double var1 = 0.04;
        this.GGL.minWidthProperty().bind(this.GGA.widthProperty().multiply(var1));
        this.GGM.minWidthProperty().bind(this.GGA.widthProperty().multiply(var1));
        this.GGN.minWidthProperty().bind(this.GGA.widthProperty().multiply(var1));
        this.QMR.minWidthProperty().bind(this.GGA.widthProperty().multiply(var1));
        this.GGO.minWidthProperty().bind(this.GGA.widthProperty().multiply(var1));
        this.GGP.minWidthProperty().bind(this.GGA.widthProperty().multiply(var1));
        this.GGQ.minWidthProperty().bind(this.GGA.widthProperty().multiply(var1));
        this.GGR.minWidthProperty().bind(this.GGA.widthProperty().multiply(var1));
        this.GGS.minWidthProperty().bind(this.GGA.widthProperty().multiply(var1));
    }

    void HUT(InvoiceRecord var1, boolean var2) {
        this.GGA.getItems().clear();
        Label var3 = new Label();
        if (!var2) {
            var3.setText(this.GGB.getString("micro.process.invoices_records.empty"));
        }

        this.GGA.setPlaceholder(var3);
        if (var1 != null) {
            this.GGA.setItems(FXCollections.observableArrayList(var1.getInvoiceRecordElements()));
        }

        this.GGX.getItems().clear();
        this.GGX.getItems().add(var1);
    }

    private void HUU() {
        this.GGX.getColumns().clear();
        TableColumn var1 = new TableColumn();
        var1.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<InvoiceRecord, String>, ObservableValue<String>>() {
            public ObservableValue<String> call(TableColumn.CellDataFeatures<InvoiceRecord, String> var1) {
                return new ReadOnlyObjectWrapper(ETF.this.GGB.getString("micro.process.invoices_records.summary"));
            }
        });
        DoubleBinding var2 = this.GGC.widthProperty().add(this.GGD.widthProperty()).add(this.GGE.widthProperty()).add(this.GGG.widthProperty()).add(this.GGH.widthProperty());
        if (this.GGF != null) {
            var2 = var2.add(this.GGF.widthProperty());
        }

        var1.minWidthProperty().bind(var2);
        var1.maxWidthProperty().bind(var2);
        this.GGX.getColumns().add(var1);
        this.HUV("gross", this.GGT);
        this.HUV("net", this.GGU);
        this.HUV("vat", this.GGV);
        this.HUW("vat23", this.GGL);
        this.HUW("vat8", this.GGM);
        this.HUW("vat5", this.GGN);
        this.HUW("vat4", this.QMR);
        this.HUW("vat0", this.GGO);
        this.HUW("vatZw", this.GGP);
        this.HUW("vatNp", this.GGQ);
        this.HUW("vatOo23", this.GGR);
        this.HUW("vatOo8", this.GGS);
    }

    private void HUV(String var1, TableColumn<InvoiceRecordElement, ?> var2) {
        TableColumn var3 = new TableColumn();
        var3.setCellFactory(new EOB());
        var3.setCellValueFactory(new PropertyValueFactory(var1));
        var3.minWidthProperty().bind(var2.widthProperty());
        var3.maxWidthProperty().bind(var2.widthProperty());
        this.GGX.getColumns().add(var3);
    }

    private void HUW(String var1, TableColumn<InvoiceRecordElement, ?> var2) {
        TableColumn var3 = new TableColumn();
        var3.setCellValueFactory(new PropertyValueFactory(var1));
        var3.setCellFactory(new ETH());
        var3.minWidthProperty().bind(var2.widthProperty());
        var3.maxWidthProperty().bind(var2.widthProperty());
        this.GGX.getColumns().add(var3);
    }

    private void HUX(Boolean var1) {
        this.GGA.getColumns().clear();
        this.HUY(this.GGA);
        this.HUZ(this.GGA);
        this.GGF = new TableColumn(this.GGB.getString("micro.process.invoices_records.reason"));
        this.GGF.setCellFactory(new Callback<TableColumn<InvoiceRecordElement, String>, TableCell<InvoiceRecordElement, String>>() {
            public TableCell<InvoiceRecordElement, String> call(TableColumn<InvoiceRecordElement, String> var1) {
                TableCell var2 = new TableCell();
                Text var3 = new Text();
                var2.setGraphic(var3);
                var2.setPrefHeight(-1.0);
                var3.wrappingWidthProperty().bind(var2.widthProperty());
                var3.textProperty().bind(var2.itemProperty());
                return var2;
            }
        });
        this.GGF.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<InvoiceRecordElement, String>, ObservableValue<String>>() {
            public ObservableValue<String> call(TableColumn.CellDataFeatures<InvoiceRecordElement, String> var1) {
                InvoiceRecordElement var2 = var1.getValue();
                if (var2 != null) {
                    if (!(var2 instanceof InvoiceRecordElementPurchase)) {
                        if (var2.getInvoiceOtherSubType() != null) {
                            return new SimpleStringProperty(var2.getInvoiceOtherSubType().getDescription());
                        }

                        return new SimpleStringProperty(FCW.getInstance().getMessageForKey("micro.process.invoices_records.reason.sell"));
                    }

                    if (((InvoiceRecordElementPurchase) var2).DCD().getValue() != null) {
                        return new SimpleStringProperty(((InvoiceRecordElementPurchase) var2).DCD().getValue().getDescription());
                    }

                    if (var2.getInvoiceOtherSubType() != null) {
                        return new SimpleStringProperty(var2.getInvoiceOtherSubType().getDescription());
                    }
                }

                return new SimpleStringProperty("");
            }
        });
        this.GGA.getColumns().add(this.GGF);
        this.HVA(this.GGA);
        this.HVB(this.GGA);
    }

    private void HUY(final TableView<InvoiceRecordElement> var1) {
        this.GGC = new TableColumn(this.GGB.getString("micro.process.invoices_records.number"));
        this.GGC.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<InvoiceRecordElement, Integer>, ObservableValue<Integer>>() {
            public ObservableValue<Integer> call(TableColumn.CellDataFeatures<InvoiceRecordElement, Integer> var1x) {
                return new ReadOnlyObjectWrapper(var1.getItems().indexOf(var1x.getValue()) + 1);
            }
        });
        this.GGC.getStyleClass().add("column-text");
        var1.getColumns().add(this.GGC);
        this.GGD = new TableColumn(this.GGB.getString("micro.process.invoices_records.date"));
        this.GGD.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<InvoiceRecordElement, String>, ObservableValue<String>>() {
            public ObservableValue<String> call(TableColumn.CellDataFeatures<InvoiceRecordElement, String> var1) {
                if (var1 != null && var1.getValue() != null && var1.getValue().QRF().getValue() != null) {
                    try {
                        return new SimpleStringProperty(var1.getValue().QRF().DDZ());
                    } catch (FFK var3) {
                        org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var3);
                    }
                }

                return new SimpleStringProperty("");
            }
        });
        this.GGD.getStyleClass().add("column-text");
        var1.getColumns().add(this.GGD);
        this.GGE = new TableColumn(this.GGB.getString("micro.process.invoices_records.documentNumber"));
        this.GGE.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<InvoiceRecordElement, String>, ObservableValue<String>>() {
            public ObservableValue<String> call(TableColumn.CellDataFeatures<InvoiceRecordElement, String> var1) {
                return var1 != null && var1.getValue() != null && var1.getValue().HGX().getValue() != null ? new SimpleStringProperty(var1.getValue().HGX().getValue()) : new SimpleStringProperty();
            }
        });
        this.GGE.getStyleClass().add("column-text");
        var1.getColumns().add(this.GGE);
    }

    private void HUZ(TableView<InvoiceRecordElement> var1) {
        String var2 = "%s, %s";
        this.GGI = new TableColumn(this.GGB.getString("micro.process.invoices_records.contractor"));
        this.GGG = new TableColumn(String.format(var2, this.GGB.getString("micro.process.invoices_records.contractorName"), this.GGB.getString("micro.process.invoices_records.contractorNip")));
        this.GGG.setCellValueFactory(new PropertyValueFactory("contractor"));
        this.GGG.setCellFactory(new ETG<InvoiceRecordElement, Contractor>() {
            String getFirstValue(Contractor var1) {
                return var1.getName().getValue();
            }

            String getSecondValue(Contractor var1) {
                return var1.getNip().getValue();
            }
        });
        this.GGI.getColumns().add(this.GGG);
        this.GGH = new TableColumn(this.GGB.getString("micro.process.invoices_records.contractorAddress"));
        this.GGH.setCellValueFactory(new PropertyValueFactory("contractor"));
        this.GGH.setCellFactory(new ETG<InvoiceRecordElement, Contractor>() {
            String getFirstValue(Contractor var1) {
                StringBuilder var2 = new StringBuilder();
                JJ var3 = var1.getAddress();
                if (var3 != null) {
                    var2.append(Optional.ofNullable(var3.getStreet().getValue()).orElse(""));
                    var2.append(" ");
                    var2.append(Optional.ofNullable(var3.getHouseNumber().getValue()).orElse(""));
                    String var4 = Optional.ofNullable(var3.getApartmentNumber().getValue()).orElse("");
                    if (var4.trim().length() > 0) {
                        var2.append(" ");
                        var2.append(ETF.this.GGB.getString("micro.process.invoices_records.apartmentAbbr"));
                        var2.append(" ");
                        var2.append(var3.getApartmentNumber().getValue());
                    }
                }

                return var2.toString();
            }

            String getSecondValue(Contractor var1) {
                StringBuilder var2 = new StringBuilder();
                JJ var3 = var1.getAddress();
                if (var3 != null) {
                    if (var3.getPostalCode() != null && var3.getPostalCode().getValue() != null) {
                        var2.append(var3.getPostalCode().getValue());
                    }

                    var2.append(" ");
                    if (var3.getCity() != null && var3.getCity().getValue() != null) {
                        var2.append(var3.getCity().getValue());
                    }
                }

                return var2.toString();
            }
        });
        this.GGI.getColumns().add(this.GGH);
        var1.getColumns().add(this.GGI);
    }

    private void HVA(TableView<InvoiceRecordElement> var1) {
        this.GGJ = new TableColumn(this.GGB.getString("micro.process.invoices_records.value"));
        this.GGT = new TableColumn();
        this.HVC(this.GGT, this.GGB.getString("micro.process.invoices_records.grossValue"));
        this.GGT.setCellValueFactory(new PropertyValueFactory("gross"));
        this.GGT.setCellFactory(new EOB());
        this.GGT.getStyleClass().add("single-line-cell");
        this.GGT.getStyleClass().add("column-child");
        this.GGJ.getColumns().add(this.GGT);
        this.GGU = new TableColumn();
        this.HVC(this.GGU, this.GGB.getString("micro.process.invoices_records.netValue"));
        this.GGU.setCellValueFactory(new PropertyValueFactory("net"));
        this.GGU.setCellFactory(new EOB());
        this.GGU.getStyleClass().add("single-line-cell");
        this.GGU.getStyleClass().add("column-child");
        this.GGJ.getColumns().add(this.GGU);
        this.GGV = new TableColumn();
        this.HVC(this.GGV, this.GGB.getString("micro.process.invoices_records.vatValue"));
        this.GGV.setCellValueFactory(new PropertyValueFactory("vat"));
        this.GGV.setCellFactory(new EOB());
        this.GGV.getStyleClass().add("single-line-cell");
        this.GGV.getStyleClass().add("column-child");
        this.GGJ.getColumns().add(this.GGV);
        var1.getColumns().add(this.GGJ);
    }

    private void HVB(TableView<InvoiceRecordElement> var1) {
        this.GGK = new TableColumn(this.GGB.getString("micro.process.invoices_records.vatRates"));
        this.GGL = new TableColumn();
        this.HVC(this.GGL, this.GGB.getString("micro.process.invoices_records.vat23Col"));
        this.GGL.setCellValueFactory(new PropertyValueFactory("vat23"));
        this.GGL.setCellFactory(new ETH());
        this.GGL.getStyleClass().add("column-child");
        this.GGK.getColumns().add(this.GGL);
        this.GGM = new TableColumn();
        this.HVC(this.GGM, this.GGB.getString("micro.process.invoices_records.vat8Col"));
        this.GGM.setCellValueFactory(new PropertyValueFactory("vat8"));
        this.GGM.setCellFactory(new ETH());
        this.GGM.getStyleClass().add("column-child");
        this.GGK.getColumns().add(this.GGM);
        this.GGN = new TableColumn();
        this.HVC(this.GGN, this.GGB.getString("micro.process.invoices_records.vat5Col"));
        this.GGN.setCellValueFactory(new PropertyValueFactory("vat5"));
        this.GGN.setCellFactory(new ETH());
        this.GGN.getStyleClass().add("column-child");
        this.GGK.getColumns().add(this.GGN);
        this.QMR = new TableColumn();
        this.HVC(this.QMR, this.GGB.getString("micro.process.invoices_records.vat4Col"));
        this.QMR.setCellValueFactory(new PropertyValueFactory("vat4"));
        this.QMR.setCellFactory(new ETH());
        this.QMR.getStyleClass().add("column-child");
        this.GGK.getColumns().add(this.QMR);
        this.GGO = new TableColumn();
        this.HVC(this.GGO, this.GGB.getString("micro.process.invoices_records.vat0Col"));
        this.GGO.setCellValueFactory(new PropertyValueFactory("vat0"));
        this.GGO.setCellFactory(new ETH());
        this.GGO.getStyleClass().add("column-child");
        this.GGK.getColumns().add(this.GGO);
        this.GGP = new TableColumn();
        this.HVC(this.GGP, this.GGB.getString("micro.process.invoices_records.vatZwColAbbr"));
        this.GGP.setCellValueFactory(new PropertyValueFactory("vatZw"));
        this.GGP.setCellFactory(new ETH());
        this.GGP.getStyleClass().add("column-child");
        this.GGK.getColumns().add(this.GGP);
        this.GGQ = new TableColumn();
        this.HVC(this.GGQ, this.GGB.getString("micro.process.invoices_records.vatNpColAbbr"));
        this.GGQ.setCellValueFactory(new PropertyValueFactory("vatNp"));
        this.GGQ.setCellFactory(new ETH());
        this.GGQ.getStyleClass().add("column-child");
        this.GGK.getColumns().add(this.GGQ);
        this.GGR = new TableColumn();
        this.HVC(this.GGR, this.GGB.getString("micro.process.invoices_records.vatOo23ColAbbr"));
        this.GGR.setCellValueFactory(new PropertyValueFactory("vatOo23"));
        this.GGR.setCellFactory(new ETH());
        this.GGR.getStyleClass().add("column-child");
        this.GGK.getColumns().add(this.GGR);
        this.GGS = new TableColumn();
        this.HVC(this.GGS, this.GGB.getString("micro.process.invoices_records.vatOo8ColAbbr"));
        this.GGS.setCellValueFactory(new PropertyValueFactory("vatOo8"));
        this.GGS.setCellFactory(new ETH());
        this.GGS.getStyleClass().add("column-child");
        this.GGK.getColumns().add(this.GGS);
        var1.getColumns().add(this.GGK);
    }

    private void HVC(TableColumn<InvoiceRecordElement, ?> var1, String var2) {
        VBox var3 = new VBox();
        Label var4 = new Label(var2);
        var4.setTextOverrun(OverrunStyle.ELLIPSIS);
        Label var5 = new Label(this.GGB.getString("micro.process.invoices_records.currency"));
        var5.setTextOverrun(OverrunStyle.ELLIPSIS);
        var3.getChildren().addAll(var4, var5);
        var1.setGraphic(var3);
    }

    private class ETH<_T> extends ETG<_T, ValueContainer2<JR, JR>> {
        private ETH() {
            super();
        }

        String getFirstValue(ValueContainer2<JR, JR> var1) {
            String var2 = "";
            if (var1 != null && var1.getFirstValue() != null && var1.getFirstValue().getValue() != null) {
                var2 = EOC.HNN(var1.getFirstValue().getValue());
            }

            return var2;
        }

        String getSecondValue(ValueContainer2<JR, JR> var1) {
            String var2 = "";
            if (var1 != null && var1.getSecondValue() != null && var1.getSecondValue().getValue() != null) {
                var2 = EOC.HNN(var1.getSecondValue().getValue());
            }

            return var2;
        }
    }

    private abstract class ETG<_T, _U> implements Callback<TableColumn<_T, _U>, TableCell<_T, _U>> {
        private ETG() {
        }

        abstract String getFirstValue(_U var1);

        abstract String getSecondValue(_U var1);

        public TableCell<_T, _U> call(TableColumn<_T, _U> var1) {
            return new TableCell<_T, _U>() {
                private void addValue(VBox var1, String var2) {
                    String var3 = "";
                    if (var2 != null) {
                        var3 = var2;
                    }

                    Label var4 = new Label(var3);
                    var4.setTextOverrun(OverrunStyle.ELLIPSIS);
                    var1.getChildren().add(var4);
                }

                protected void updateItem(_U var1, boolean var2) {
                    super.updateItem(var1, var2);
                    VBox var3 = new VBox();
                    if (var1 != null) {
                        this.addValue(var3, ETG.this.getFirstValue(var1));
                        this.addValue(var3, ETG.this.getSecondValue(var1));
                    }

                    this.setGraphic(var3);
                }
            };
        }
    }
}
