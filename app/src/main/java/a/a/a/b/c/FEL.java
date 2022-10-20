package a.a.a.b.c;

import a.a.a.c.e.a.d.ValueContainer1;
import javafx.application.Platform;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Semaphore;
import java.util.function.Supplier;

@Slf4j
public class FEL {
    public FEL() {
    }

    public static <_A> _A IKS(final Supplier<_A> var0) {

        final Semaphore var2;
        try {
            if (Platform.isFxApplicationThread()) {
                Object var9 = var0.get();
                return (_A) var9;
            }

            final ValueContainer1 var1 = new ValueContainer1();
            var2 = new Semaphore(1);
            var2.acquire();
            Platform.runLater(new Runnable() {
                public void run() {
                    var1.setFirstValue(var0.get());
                    var2.release();
                }
            });
            var2.acquire();
            Object var3 = var1.getFirstValue();
            return (_A) var3;
        } catch (InterruptedException e) {
            log.error("Something bad happened", e);
            return null;
        }
    }
}
