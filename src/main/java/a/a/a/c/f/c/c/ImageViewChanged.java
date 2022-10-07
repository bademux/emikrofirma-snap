package a.a.a.c.f.c.c;

import a.a.a.c.f.c.b.FAQ;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ImageViewChanged extends ImageView {
   protected FAQ<ImageViewChanged> GZU;
   protected BooleanProperty GZV;

   public ImageViewChanged() {
      this((Image)null);
   }

   public ImageViewChanged(Image var1) {
      super(var1);
      this.GZV = new SimpleBooleanProperty(this, "changed", false);
      this.IGB();
   }

   public final boolean isChanged() {
      return this.GZV.getValue();
   }

   public final void setChanged(boolean var1) {
      this.GZV.setValue(var1);
   }

   public final BooleanProperty changedProperty() {
      return this.GZV;
   }

   private void IGB() {
      this.changedProperty().set(false);
      this.GZU = new FAQ(this);
      this.imageProperty().addListener(this.GZU);
   }
}
