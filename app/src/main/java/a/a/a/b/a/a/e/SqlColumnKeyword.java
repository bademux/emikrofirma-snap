package a.a.a.b.a.a.e;

public enum SqlColumnKeyword {
    NOT_NULL("NOT NULL"),
    DEFAULT("DEFAULT"),
    UNIQUE("UNIQUE"),
    PRIMARY("PRIMARY KEY"),
    CHECK("CHECK"),
    FOREIGN("FOREIGN KEY");

    private final String HEP;

    SqlColumnKeyword(String var3) {
        this.HEP = var3;
    }

    public String getKeyWord() {
        return this.HEP;
    }
}
