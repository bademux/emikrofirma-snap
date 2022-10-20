package a.a.a.c.g;

public enum ConfigurationProperty {
    WorkingDir("WorkingDir"),
    Pkcs11LibraryFile("Pkcs11LibraryFile"),
    PerformVerification("PerformVerification"),
    SellRefIdPattern("SellRefIdPattern"),
    SellCorrectionRefIdPattern("SellCorrectionRefIdPattern"),
    CalculationMethod("CalculationMethod");

    private final String HBB;

    ConfigurationProperty(String var3) {
        this.HBB = var3;
    }

    public String getPropertyName() {
        return this.HBB;
    }
}
