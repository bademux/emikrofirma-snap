package a.a.a.c.c.d.d;

import a.a.a.c.e.a.k.a.EXF;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeTableRow;
import javafx.scene.control.TreeTableView;
import javafx.util.Callback;

public class EOM<_T extends ENW> implements Callback<TreeTableView<_T>, TreeTableRow<_T>> {
   public EOM() {
   }

   public TreeTableRow<_T> call(TreeTableView<_T> var1) {
      TreeTableRow var2 = new TreeTableRow();
      var2.treeItemProperty().addListener(new EOP(var2));
      return var2;
   }

   private static void HNQ(TreeTableRow<? extends ENW> var0, boolean var1) {
      if (var1) {
         if (!var0.getStyleClass().contains("table-row-cell-bold")) {
            var0.getStyleClass().add("table-row-cell-bold");
         }
      } else {
         var0.getStyleClass().remove("table-row-cell-bold");
      }

   }

   private static void HNR(TreeTableRow<? extends ENW> var0, boolean var1) {
      if (var1) {
         if (!var0.getStyleClass().contains("table-row-cell-backroung-grey")) {
            var0.getStyleClass().add("table-row-cell-backroung-grey");
         }
      } else {
         var0.getStyleClass().remove("table-row-cell-backroung-grey");
      }

   }

   private class EOP implements ChangeListener<TreeItem<? extends ENW>> {
      private final TreeTableRow<? extends ENW> FNR;

      public EOP(TreeTableRow<? extends ENW> var2) {
         this.FNR = var2;
      }

      public void changed(ObservableValue<? extends TreeItem<? extends ENW>> var1, TreeItem<? extends ENW> var2, TreeItem<? extends ENW> var3) {
         if (var3 != null) {
            ((ENW)var3.getValue()).getBoldableProperty().addListener(EOM.this.new EON(this.FNR));
            ((ENW)var3.getValue()).getExpandedProperty().addListener(EOM.this.new EOO(this.FNR));
            EOM.HNQ(this.FNR, ((ENW)var3.getValue()).getBoldableProperty().get());
            EOM.HNR(this.FNR, ((ENW)var3.getValue()).getExpandedProperty().get());
         }

      }
   }

   private class EOO implements ChangeListener<Boolean> {
      private final TreeTableRow<? extends ENW> FNQ;

      EOO(TreeTableRow<? extends ENW> var2) {
         this.FNQ = var2;
      }

      public void changed(ObservableValue<? extends Boolean> var1, Boolean var2, Boolean var3) {
         EXF.getInstance().ICO();

         try {
            EOM.HNR(this.FNQ, var3);
         } finally {
            EXF.getInstance().ICP();
         }

      }
   }

   private class EON implements ChangeListener<Boolean> {
      private final TreeTableRow<? extends ENW> FNP;

      EON(TreeTableRow<? extends ENW> var2) {
         this.FNP = var2;
      }

      public void changed(ObservableValue<? extends Boolean> var1, Boolean var2, Boolean var3) {
         EXF.getInstance().ICO();

         try {
            EOM.HNQ(this.FNP, var3);
         } finally {
            EXF.getInstance().ICP();
         }

      }
   }
}
