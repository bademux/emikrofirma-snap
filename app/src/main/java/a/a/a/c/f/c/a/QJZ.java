package a.a.a.c.f.c.a;

import com.github.bademux.emk.Application;
import a.a.a.c.g.ConfigurationProperty;

import java.io.File;

public class QJZ {
    public QJZ() {
    }

    public static a.a.a.c.f.c.a.ConfigurationProperty<?, ?> getDefaultConfigurationProperty(ConfigurationProperty var0) {
        if (var0 == ConfigurationProperty.WorkingDir) {
            File var5 = Application.getHomeDir().toFile();
            File var2 = new File(var5, "emikrofirma");
            var2.mkdirs();
            PropertyString var3 = new PropertyString(ConfigurationProperty.WorkingDir.getPropertyName(), var2.getAbsolutePath());
            return var3;
        } else if (var0 == ConfigurationProperty.PerformVerification) {
            PropertyBoolean var4 = new PropertyBoolean(ConfigurationProperty.PerformVerification.getPropertyName(), true);
            return var4;
        } else {
            PropertyString var1;
            if (var0 == ConfigurationProperty.Pkcs11LibraryFile) {
                var1 = new PropertyString(ConfigurationProperty.Pkcs11LibraryFile.getPropertyName(), null);
                return var1;
            } else if (var0 == ConfigurationProperty.SellRefIdPattern) {
                var1 = new PropertyString(ConfigurationProperty.SellRefIdPattern.getPropertyName(), "FA/#%yyyy%#/#%MM%#/#%dd%#/#%sequence1%#");
                return var1;
            } else if (var0 == ConfigurationProperty.SellCorrectionRefIdPattern) {
                var1 = new PropertyString(ConfigurationProperty.SellCorrectionRefIdPattern.getPropertyName(), "FK/#%yyyy%#/#%MM%#/#%dd%#/#%sequence2%#");
                return var1;
            } else if (var0 == ConfigurationProperty.CalculationMethod) {
                var1 = new PropertyString(ConfigurationProperty.CalculationMethod.getPropertyName(), "NET");
                return var1;
            } else {
                return null;
            }
        }
    }
}
