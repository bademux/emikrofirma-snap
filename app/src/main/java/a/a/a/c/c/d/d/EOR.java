package a.a.a.c.c.d.d;

import a.a.a.c.f.a.d.DeclarationStatus;
import javafx.scene.control.Tooltip;
import javafx.scene.control.TreeTableCell;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Callback;

public class EOR<_T> implements Callback<TreeTableColumn<_T, DeclarationStatus>, TreeTableCell<_T, DeclarationStatus>> {
    private final Image FNS;
    private final Image FNT;
    private final Image FNU;
    private final Image MWJ;

    public EOR(Image var1, Image var2, Image var3, Image var4) {
        this.FNS = var1;
        this.FNT = var2;
        this.FNU = var3;
        this.MWJ = var4;
    }

    public TreeTableCell<_T, DeclarationStatus> call(TreeTableColumn<_T, DeclarationStatus> var1) {
        TreeTableCell var2 = new TreeTableCell<_T, DeclarationStatus>() {
            final ImageView TXZ = new ImageView();

            protected void updateItem(DeclarationStatus var1, boolean var2) {

                super.updateItem(var1, var2);
                if (var1 != null) {
                    if (var1.equals(DeclarationStatus.SUCCESS)) {
                        this.TXZ.setFitWidth(15.0);
                        this.TXZ.setFitHeight(15.0);
                        this.TXZ.setImage(EOR.this.FNS);
                    } else if (var1.equals(DeclarationStatus.FAILURE)) {
                        this.TXZ.setFitWidth(13.0);
                        this.TXZ.setFitHeight(18.0);
                        this.TXZ.setImage(EOR.this.FNT);
                    } else {
                        this.TXZ.setFitWidth(7.0);
                        this.TXZ.setFitHeight(15.0);
                        this.TXZ.setImage(EOR.this.FNU);
                    }

                    this.setGraphic(this.TXZ);
                    this.setTooltip(new Tooltip(var1.getDescription()));
                } else {
                    this.TXZ.setFitWidth(13.0);
                    this.TXZ.setFitHeight(18.0);
                    this.TXZ.setImage(EOR.this.MWJ);
                    this.setGraphic(this.TXZ);
                }

            }
        };
        return var2;
    }
}
