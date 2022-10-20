package a.a.a.c.g;

import a.a.a.b.f.FFI;
import a.a.a.b.f.FFK;
import a.a.a.c.g.c.FCZ;
import javafx.beans.property.BooleanProperty;
import javafx.concurrent.Task;
import javafx.concurrent.WorkerStateEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.WindowEvent;

import java.io.IOException;
import java.util.concurrent.Semaphore;

public abstract class MSX {
    private static final Semaphore QHL = new Semaphore(1);
    private final Stage QGJ;
    private final BooleanProperty QHM;
    public static final String MWS = "/fxml/waitingDialog.fxml";

    public MSX(Stage var1, BooleanProperty var2) {
        this.QGJ = var1;
        this.QHM = var2;
    }

    public void MXH() throws FFK {

        try {
            if (!QHL.tryAcquire()) {
                throw FCZ.getInstance().QIS();
            }

            FXMLLoader var1 = new FXMLLoader();
            var1.setLocation(MSX.class.getResource("/fxml/waitingDialog.fxml"));
            AnchorPane var2 = var1.load();
            final Stage var3 = new Stage();
            var3.initStyle(StageStyle.TRANSPARENT);
            var3.setResizable(false);
            var3.initModality(Modality.APPLICATION_MODAL);
            var3.setOnCloseRequest(new EventHandler<WindowEvent>() {
                public void handle(WindowEvent var1) {
                    var1.consume();
                }
            });
            var3.initOwner(this.QGJ);
            Scene var4 = new Scene(var2);
            var4.setFill(Color.TRANSPARENT);
            var3.setScene(var4);
            Task var5 = new Task<Boolean>() {
                public Boolean call() {
                    MSX.this.MXI();
                    return true;
                }
            };
            var5.setOnRunning(new EventHandler<WorkerStateEvent>() {
                public void handle(WorkerStateEvent var1) {
                    var3.show();
                }
            });
            var5.setOnSucceeded(new EventHandler<WorkerStateEvent>() {
                public void handle(WorkerStateEvent var1) {
                    try {
                        MSX.this.QHM.set(false);
                        var3.hide();
                        MSX.this.MXJ();
                    } finally {
                        MSX.QHL.release();
                    }

                }
            });
            var5.setOnFailed(new EventHandler<WorkerStateEvent>() {
                public void handle(WorkerStateEvent var1) {
                    try {
                        var3.hide();
                    } finally {
                        MSX.QHL.release();
                    }

                }
            });
            this.QHM.set(true);
            (new Thread(var5)).start();
        } catch (IOException var9) {
            org.slf4j.LoggerFactory.getLogger(getClass()).error("Something bad happened", var9);
            throw new FFI(var9);
        }

    }

    public abstract void MXI();

    public abstract void MXJ();
}
