package a.a.a.c.e.a.c;

public interface EVW {
    String GPW = System.getProperty("user.home") + "/AKMF";
    String GPX = "jpk.helpdesk@mf.gov.pl";
    String GPY = "jpk.helpdesk@mf.gov.pl";
    String GPZ = "support@akmf.pl";
    String GQA = System.getProperty("os.name").toLowerCase();
    String GQB = System.getProperty("os.arch").toLowerCase();

    static EVX getOS() {
        if (GQA.indexOf("win") >= 0) {
            return EVW.EVX.Windows;
        } else if (GQA.indexOf("mac") >= 0) {
            return EVW.EVX.Mac;
        } else {
            return GQA.indexOf("nix") < 0 && GQA.indexOf("nux") < 0 && GQA.indexOf("aix") <= 0 ? null : EVW.EVX.Unix;
        }
    }

    static EVY getARCH() {
        if (!GQB.equalsIgnoreCase("x64") && !GQB.equalsIgnoreCase("amd64")) {
            return !GQB.equalsIgnoreCase("x86") && !GQB.equalsIgnoreCase("i386") ? null : EVW.EVY.x86;
        } else {
            return EVW.EVY.x64;
        }
    }

    enum EVY {
        x64,
        x86;

        EVY() {
        }
    }

    enum EVX {
        Windows("exe"),
        Mac("lib"),
        Unix("lib");

        private final String GPV;

        EVX(String var3) {
            this.GPV = var3;
        }

        public String getSuffix() {
            return this.GPV;
        }
    }
}
