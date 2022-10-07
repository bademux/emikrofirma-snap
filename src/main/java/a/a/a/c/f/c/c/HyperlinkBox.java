package a.a.a.c.f.c.c;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.control.Hyperlink;

public class HyperlinkBox extends Hyperlink {
   private StringProperty QVY = new SimpleStringProperty(this, "href");

   public HyperlinkBox() {
   }

   public final String getHref() {
      return this.QVY.getValue();
   }

   public final void setHref(String var1) {
      this.QVY.setValue(var1);
   }

   public final StringProperty hrefProperty() {
      return this.QVY;
   }
}
