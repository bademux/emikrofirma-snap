package a.a.a.c.c.d.e;

import a.a.a.b.f.FFK;
import a.a.a.c.c.b.EMB;
import a.a.a.c.c.b.a.EMO;
import a.a.a.c.c.d.d.EOQ;
import a.a.a.c.d.g.ERF;
import a.a.a.c.f.*;
import a.a.a.c.f.a.e.HO;
import a.a.a.c.f.a.f.a.IP;
import a.a.a.c.f.a.n.QSH;
import a.a.a.c.f.b.JM;
import a.a.a.c.f.b.c.a.QSV;
import a.a.a.c.f.c.a.LP;
import a.a.a.c.f.c.a.QJZ;
import a.a.a.c.f.c.c.TextFieldRequired;
import a.a.a.c.f.c.c.TextFieldValidated_Number;
import a.a.a.c.g.FCQ;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.util.Callback;

import java.util.Set;

public class EOT<_T> implements Callback<TableColumn<_T, Object>, TableCell<_T, Object>> {
    private final EMO FNX;
    private final boolean FNY;
    _T QGF;
    private final Set<JM> REY;

    public EOT(EMO var1, boolean var2) {
        this(var1, var2, null);
    }

    public EOT(EMO var1, boolean var2, Set<JM> var3) {
        this.FNX = var1;
        this.FNY = var2;
        this.REY = var3;
    }

    public TableCell<_T, Object> call(TableColumn<_T, Object> var1) {

        TableCell var3;
        TableCell var2 = new TableCell<_T, Object>() {
            public void startEdit() {
                if (EOT.this.FNY) {
                    super.startEdit();
                    Object var1 = this.getItem();
                    TableRow var2 = this.getTableRow();
                    if (var2.getItem() instanceof HO) {
                        EOT.this.QGF = (_T) ((HO) var2.getItem()).RIH();
                    } else if (var2.getItem() instanceof IP) {
                        EOT.this.QGF = (_T) ((IP) var2.getItem()).RJT();
                    } else if (var2.getItem() instanceof QSH) {
                        EOT.this.QGF = (_T) ((QSH) var2.getItem()).RJJ();
                    }

                    if (var1 instanceof final LH var3) {
                        final ComboBox var4 = new ComboBox();
                        var4.setCellFactory(new EOQ());
                        var4.setButtonCell((ListCell) var4.getCellFactory().call(null));
                        if (EOT.this.REY == null) {
                            var4.getItems().addAll(((JM) var3.getValue()).getEnumTypeValues());
                        } else {
                            var4.getItems().addAll(EOT.this.REY);
                        }

                        var4.getSelectionModel().select(var3.getValue());
                        final ChangeListenerFocus var5 = new ChangeListenerFocus() {
                            @Override
                            public Object updateAndReturnObject() {
                                var3.setValue(var4.getSelectionModel().getSelectedItem());
                                return var3;
                            }
                        };
                        var4.focusedProperty().addListener(var5);
                        var4.setOnKeyPressed(new EventHandlerKey() {
                            @Override
                            public void cleanUp() {
                                var4.focusedProperty().removeListener(var5);
                            }

                            @Override
                            public Object updateAndReturnObject() {
                                var3.setValue(var4.getSelectionModel().getSelectedItem());
                                return var3;
                            }
                        });
                        this.setText(null);
                        this.setGraphic(var4);
                    } else if (var1 instanceof final LA var7) {
                        final CheckBox var11 = new CheckBox();
                        var11.setSelected(var7.getValue());
                        final ChangeListenerFocus var15 = new ChangeListenerFocus() {
                            @Override
                            public Object updateAndReturnObject() {
                                var7.setValue(Boolean.valueOf(var11.isSelected()));
                                return var7;
                            }
                        };
                        var11.focusedProperty().addListener(var15);
                        var11.setOnKeyPressed(new EventHandlerKey() {
                            @Override
                            public void cleanUp() {
                                var11.focusedProperty().removeListener(var15);
                            }

                            @Override
                            public Object updateAndReturnObject() {
                                var7.setValue(Boolean.valueOf(var11.isSelected()));
                                return var7;
                            }
                        });
                        this.setText(null);
                        this.setGraphic(var11);
                    } else if (var1 instanceof final KY var8) {
                        final ERF var12 = new ERF(var8.DDQ(), var8.getScale(), var8.getPresicion());
                        final TextFieldValidated_Number var16 = new TextFieldValidated_Number();
                        var16.setText(var12.HRW(var8.getValue()));
                        var16.setMaxLength(var8.getScale());
                        var16.setMinimumFractionDigits(var8.getPresicion());
                        var16.setMaximumFractionDigits(var8.getPresicion());
                        var16.setAllowNegative(var8.DDQ());
                        var16.setAllowOnlyNegative(var8.RJU());
                        final ChangeListenerFocus var6 = new ChangeListenerFocus() {
                            @Override
                            public Object updateAndReturnObject() {
                                var8.setValue(var12.HRX(var16.getText()));
                                return var8;
                            }
                        };
                        var16.focusedProperty().addListener(var6);
                        var16.setOnKeyPressed(new EventHandlerKey() {
                            @Override
                            public void cleanUp() {
                                var16.focusedProperty().removeListener(var6);
                            }

                            @Override
                            public Object updateAndReturnObject() {
                                var8.setValue(var12.HRX(var16.getText()));
                                return var8;
                            }
                        });
                        this.setText(null);
                        this.setGraphic(var16);
                    } else if (var1 instanceof final LL var9) {
                        final TextFieldRequired var13 = new TextFieldRequired();
                        var13.setText(var9.getValue());
                        var13.setMaxLength(var9.getMaxLength());
                        final ChangeListenerFocus var17 = new ChangeListenerFocus() {
                            @Override
                            public Object updateAndReturnObject() {
                                var9.setValue(var13.getText());
                                return var9;
                            }
                        };
                        var13.focusedProperty().addListener(var17);
                        var13.setOnKeyPressed(new EventHandlerKey() {
                            @Override
                            public void cleanUp() {
                                var13.focusedProperty().removeListener(var17);
                            }

                            @Override
                            public Object updateAndReturnObject() {
                                var9.setValue(var13.getText());
                                return var9;
                            }
                        });
                        this.setText(null);
                        this.setGraphic(var13);
                    } else if (var1 instanceof final KX var14) {
                        String var10 = null;
                        if (var14.getValue() != null) {
                            var10 = var14.getValueAsString();
                        }

                        final TextField var18 = new TextField(var10);
                        final ChangeListenerFocus var19 = new ChangeListenerFocus() {
                            @Override
                            public Object updateAndReturnObject() {
                                var14.setValueFromString(var18.getText());
                                return var14;
                            }
                        };
                        var18.focusedProperty().addListener(var19);
                        var18.setOnKeyPressed(new EventHandlerKey() {
                            @Override
                            public void cleanUp() {
                                var18.focusedProperty().removeListener(var19);
                            }

                            @Override
                            public Object updateAndReturnObject() {
                                var14.setValueFromString(var18.getText());
                                return var14;
                            }
                        });
                        this.setText(null);
                        this.setGraphic(var18);
                    }

                }
            }

            public void cancelEdit() {
                super.cancelEdit();
                Object var1 = this.getItem();
                if (var1 instanceof LA var2) {
                    CheckBox var3 = new CheckBox();
                    var3.setDisable(true);
                    var3.setSelected(var2.getValue());
                    this.setGraphic(var3);
                } else if (var1 instanceof KY var4) {
                    ERF var6 = new ERF(var4.DDQ(), var4.getScale(), var4.getPresicion());
                    this.setText(var6.HRW(var4.getValue()));
                    this.setGraphic(null);
                } else if (var1 instanceof KX var7) {
                    String var5 = null;
                    if (var7.getValue() != null) {
                        var5 = var7.getValueAsString();
                    }

                    this.setText(var5);
                    this.setGraphic(null);
                }

            }

            public void commitEdit(Object var1) {
                super.commitEdit(var1);
                TableRow var2 = this.getTableRow();
                Object var3 = var2.getItem();
                Object var4 = null;

                String var7;
                try {
                    LP var5 = EMB.getInstance().HHU();
                    var7 = (String) var5.getConfigurationPropertyOrDefault(FCQ.CalculationMethod).DEY().getValue();
                } catch (FFK var6) {
                    var7 = (String) QJZ.getDefaultConfigurationProperty(FCQ.CalculationMethod).DEY().getValue();
                }

                EOT.this.FNX.RJV(EOT.this.QGF, var3, QSV.valueOf(var7));
                EOT.this.FNX.HJJ();
                this.getTableView().refresh();
            }

            protected void updateItem(Object var1, boolean var2) {
                super.updateItem(var1, var2);
                if (!var2) {
                    this.setGraphic(null);
                    if (var1 instanceof LA var3) {
                        CheckBox var4 = new CheckBox();
                        var4.setDisable(true);
                        var4.setSelected(var3.getValue());
                        this.setGraphic(var4);
                    } else if (var1 instanceof KY var5) {
                        ERF var7 = new ERF(var5.DDQ(), var5.getScale(), var5.getPresicion());
                        this.setText(var7.HRW(var5.getValue()));
                    } else if (var1 instanceof KX var6) {
                        this.setText(var6.getValueAsString());
                    }
                }

            }

            abstract class ChangeListenerFocus implements ChangeListener<Boolean> {
                ChangeListenerFocus() {
                }

                public abstract Object updateAndReturnObject();

                public void changed(ObservableValue<? extends Boolean> var1, Boolean var2, Boolean var3) {
                    if (!var3) {
                        try {
                            commitEdit(this.updateAndReturnObject());
                        } catch (Exception var5) {
                            cancelEdit();
                        }
                    }

                }
            }

            abstract class EventHandlerKey implements EventHandler<KeyEvent> {
                EventHandlerKey() {
                }

                public abstract void cleanUp();

                public abstract Object updateAndReturnObject();

                public void handle(KeyEvent var1) {
                    if (KeyCode.ENTER.equals(var1.getCode())) {
                        try {
                            this.cleanUp();
                            commitEdit(this.updateAndReturnObject());
                        } catch (Exception var6) {
                            cancelEdit();
                        } finally {
                            EOT.this.FNX.HJK();
                        }
                    }

                    if (KeyCode.ESCAPE.equals(var1.getCode())) {
                        this.cleanUp();
                        cancelEdit();
                    }

                }
            }
        };
        var3 = var2;

        return var3;
    }
}
