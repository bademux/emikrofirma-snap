package a.a.a.c.c.e.i.c;

import a.a.a.c.f.a.d.AGWN;
import a.a.a.c.g.b.FCW;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;
import javafx.util.Callback;

public class EUE implements Callback<TableView<AGWN>, TableRow<AGWN>> {
    private final String GKJ = FCW.getInstance().getMessageForKey("micro.process.jpk_list.copyReferenceId");

    public EUE() {
    }

    public TableRow<AGWN> call(TableView<AGWN> var1) {
        final TableRow var2 = new TableRow();
        ContextMenu var3 = new ContextMenu();
        MenuItem var4 = new MenuItem(this.GKJ);
        var4.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent var1) {
                Clipboard var2x = Clipboard.getSystemClipboard();
                ClipboardContent var3 = new ClipboardContent();
                var3.putString(((AGWN) var2.getItem()).getReferenceId());
                var2x.setContent(var3);
            }
        });
        var3.getItems().add(var4);
        var2.setContextMenu(var3);
        return var2;
    }
}
