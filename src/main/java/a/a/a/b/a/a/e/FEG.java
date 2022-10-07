package a.a.a.b.a.a.e;

public enum FEG {
    NOT_NULL("NOT NULL"),
    DEFAULT("DEFAULT"),
    UNIQUE("UNIQUE"),
    PRIMARY("PRIMARY KEY"),
    CHECK("CHECK"),
    FOREIGN("FOREIGN KEY");

    private final String HEP;

    FEG(String var3) {
        this.HEP = var3;
    }

    public String getKeyWord() {
        return this.HEP;
    }
}
