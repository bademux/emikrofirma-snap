package a.a.a.c.f.c.c;

import a.a.a.c.f.c.b.FAP;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.scene.image.Image;

public class ImageViewRequired extends ImageViewValidated {
   protected FAP<ImageViewRequired> GZC;
   protected BooleanProperty GZD;
   protected BooleanProperty GZE;

   public ImageViewRequired() {
      this((Image)null);
   }

   public ImageViewRequired(Image var1) {
      super(var1);
      this.GZD = new SimpleBooleanProperty(this, "required", true);
      this.GZE = new SimpleBooleanProperty(this, "requiredAndValid", true);
      this.IGB();
   }

   public final boolean isRequired() {
      return this.GZD.getValue();
   }

   public final void setRequired(boolean var1) {
      this.GZD.setValue(var1);
   }

   public final BooleanProperty requiredProperty() {
      return this.GZD;
   }

   public final boolean isRequiredAndValid() {
      return this.GZE.getValue();
   }

   public final void setRequiredAndValid(boolean var1) {
      this.GZE.setValue(var1);
   }

   public final BooleanProperty requiredAndValidProperty() {
      return this.GZE;
   }

   private void IGB() {
      this.GZE.bind(this.GZD.and(this.HAO).or(this.GZD.not()));
      this.imageProperty().removeListener(this.GZU);
      this.GZC = new FAP(this);
      this.imageProperty().addListener(this.GZU);
   }
}
