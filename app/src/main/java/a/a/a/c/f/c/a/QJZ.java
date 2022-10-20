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
            PropertyString var3 = new PropertyString(FCQ.WorkingDir.getPropertyName(), var2.getAbsolutePath());
            return var3;
        } else if (var0 == FCQ.PerformVerification) {
            PropertyBoolean var4 = new PropertyBoolean(FCQ.PerformVerification.getPropertyName(), true);
            return var4;
        } else {
            PropertyString var1;
            if (var0 == FCQ.Pkcs11LibraryFile) {
                var1 = new PropertyString(FCQ.Pkcs11LibraryFile.getPropertyName(), null);
                return var1;
            } else if (var0 == FCQ.SellRefIdPattern) {
                var1 = new PropertyString(FCQ.SellRefIdPattern.getPropertyName(), "FA/#%yyyy%#/#%MM%#/#%dd%#/#%sequence1%#");
                return var1;
            } else if (var0 == FCQ.SellCorrectionRefIdPattern) {
                var1 = new PropertyString(FCQ.SellCorrectionRefIdPattern.getPropertyName(), "FK/#%yyyy%#/#%MM%#/#%dd%#/#%sequence2%#");
                return var1;
            } else if (var0 == FCQ.CalculationMethod) {
                var1 = new PropertyString(FCQ.CalculationMethod.getPropertyName(), "NET");
                return var1;
            } else {
                return null;
            }
        }
    }
}
