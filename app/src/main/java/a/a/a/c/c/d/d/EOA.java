package a.a.a.c.c.d.d;

import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.h.JG;
import javafx.scene.control.Tooltip;
import javafx.scene.control.TreeTableCell;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Callback;

public class EOA<_T> implements Callback<TreeTableColumn<_T, JG>, TreeTableCell<_T, JG>> {
    private final Image FNK;
    private final Image FNL;

    public EOA(Image var1, Image var2) {
        this.FNK = var1;
        this.FNL = var2;
    }

    public TreeTableCell<_T, JG> call(TreeTableColumn<_T, JG> var1) {
        TreeTableCell var2 = new TreeTableCell<_T, JG>() {
            final ImageView TVK = new ImageView();

            protected void updateItem(JG var1, boolean var2) {
                EXF.getInstance().ICO();

                try {
                    super.updateItem(var1, var2);
                    if (var1 != null) {
                        if (var1.equals(JG.SETTLED)) {
                            this.TVK.setFitWidth(15.0);
                            this.TVK.setFitHeight(15.0);
                            this.TVK.setImage(EOA.this.FNK);
                        } else {
                            this.TVK.setFitWidth(13.0);
                            this.TVK.setFitHeight(18.0);
                            this.TVK.setImage(EOA.this.FNL);
                        }

                        this.setGraphic(this.TVK);
                        this.setTooltip(new Tooltip(var1.getDescription()));
                    } else {
                        this.setText("");
                    }
                } finally {
                    EXF.getInstance().ICP();
                }

            }
        };
        return var2;
    }
}
