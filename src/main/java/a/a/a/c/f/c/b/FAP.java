package a.a.a.c.f.c.b;

import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.c.c.ImageViewRequired;
import javafx.scene.image.Image;

public class FAP<_T extends ImageViewRequired> extends FAQ<_T> {
   public FAP(_T var1) {
      super(var1);
   }

   protected void IFV(Image var1, Image var2) {
      EXF.getInstance().ICO();

      try {
         if (var2 != null) {
            ((ImageViewRequired)this.GXV).validProperty().set(true);
         } else {
            ((ImageViewRequired)this.GXV).validProperty().set(!((ImageViewRequired)this.GXV).isRequired());
         }

         super.IFV(var1, var2);
      } finally {
         EXF.getInstance().ICP();
      }

   }
}
