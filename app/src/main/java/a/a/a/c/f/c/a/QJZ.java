package a.a.a.c.f.c.a;

import com.github.bademux.emk.Application;
import a.a.a.c.g.FCQ;

import java.io.File;

public class QJZ {
    public QJZ() {
    }

    public static ConfigurationProperty<?, ?> getDefaultConfigurationProperty(FCQ var0) {
        if (var0 == FCQ.WorkingDir) {
            File var5 = Application.getHomeDir().toFile();
            File var2 = new File(var5, "emikrofirma");
            var2.mkdirs();
            LS var3 = new LS(FCQ.WorkingDir.getPropertyName(), var2.getAbsolutePath());
            return var3;
        } else if (var0 == FCQ.PerformVerification) {
            AILX var4 = new AILX(FCQ.PerformVerification.getPropertyName(), true);
            return var4;
        } else {
            LS var1;
            if (var0 == FCQ.Pkcs11LibraryFile) {
                var1 = new LS(FCQ.Pkcs11LibraryFile.getPropertyName(), null);
                return var1;
            } else if (var0 == FCQ.SellRefIdPattern) {
                var1 = new LS(FCQ.SellRefIdPattern.getPropertyName(), "FA/#%yyyy%#/#%MM%#/#%dd%#/#%sequence1%#");
                return var1;
            } else if (var0 == FCQ.SellCorrectionRefIdPattern) {
                var1 = new LS(FCQ.SellCorrectionRefIdPattern.getPropertyName(), "FK/#%yyyy%#/#%MM%#/#%dd%#/#%sequence2%#");
                return var1;
            } else if (var0 == FCQ.CalculationMethod) {
                var1 = new LS(FCQ.CalculationMethod.getPropertyName(), "NET");
                return var1;
            } else {
                return null;
            }
        }
    }
}
