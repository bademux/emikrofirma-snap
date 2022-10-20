package a.a.a.c.c.b.a;

import a.a.a.b.f.FFI;
import a.a.a.c.c.a.a.BaseProgressFxController;
import a.a.a.c.c.b.a.a.BaseSceneFxController;
import a.a.a.c.c.b.b.a.EMW;
import a.a.a.c.f.a.BaseBoxController;
import com.github.bademux.emk.app.FXApp;
import javafx.stage.Stage;
import javafx.util.Callback;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class ControllerFactory implements Callback<Class<?>, Object> {
    private final FXApp fxApp;
    private final Stage stage;
    private final EMW FGZ;
    private final String fxmlTitle;
    private final String fxmlName;

    public Object call(Class<?> clazz) {

        try {
            if (BaseProgressFxController.class.isAssignableFrom(clazz)) {
                var constructor = clazz.getConstructor(FXApp.class, EMW.class, String.class, String.class);
                var controller = (BaseFxController) constructor.newInstance(this.fxApp, this.FGZ, this.fxmlTitle, this.fxmlName);
                controller.setPrimaryStage(this.stage);
                return controller;
            }

            if (BaseSceneFxController.class.isAssignableFrom(clazz)) {
                var constructor = clazz.getConstructor(FXApp.class, String.class);
                var controller = (BaseFxController) constructor.newInstance(this.fxApp, this.fxmlName);
                controller.setPrimaryStage(this.stage);
                return controller;
            }

            if (BaseFxController.class.isAssignableFrom(clazz)) {
                var constructor = clazz.getConstructor(FXApp.class, String.class);
                var controller = (BaseFxController) constructor.newInstance(this.fxApp, this.fxmlName);
                controller.setPrimaryStage(this.stage);
                return controller;
            }

            if (BaseBoxController.class.isAssignableFrom(clazz)) {
                var constructor = clazz.getConstructor(String.class);
                var controller = (BaseBoxController) constructor.newInstance(this.fxmlName);
                controller.setPrimaryStage(this.stage);
                return controller;
            }

            throw new FFI("Type [" + clazz + "] invalid!");

        } catch (Exception e) {
            log.error("Something bad happened", e);
            throw new FFI(e);
        }

    }
}
