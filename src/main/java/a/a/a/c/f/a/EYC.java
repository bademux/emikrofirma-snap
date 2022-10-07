package a.a.a.c.f.a;

import a.a.a.c.f.c.a.RequiredGridPane;

public class EYC<_PARENT extends RequiredGridPane, _CONTEXT extends EYE> extends EYI<_PARENT, _CONTEXT> {
   public EYC() {
      this((String)null);
   }

   public EYC(String var1) {
      super(var1);
   }

   public void initialize() {
      super.initialize();
      ((EYE)this.fxml_component_main_element).IFH().bind(this.fxml_component_root_element.allowNegativeProperty());
      ((EYE)this.fxml_component_main_element).RHU().bind(this.fxml_component_root_element.allowOnlyNegativeProperty());
      ((EYE)this.fxml_component_main_element).IFI().bind(this.fxml_component_root_element.minimumFractionDigitsProperty());
      ((EYE)this.fxml_component_main_element).IFJ().bind(this.fxml_component_root_element.maximumFractionDigitsProperty());
      ((EYE)this.fxml_component_main_element).IFK().bind(this.fxml_component_root_element.minimumValueProperty());
      ((EYE)this.fxml_component_main_element).IFL().bind(this.fxml_component_root_element.maximumValueProperty());
   }
}
