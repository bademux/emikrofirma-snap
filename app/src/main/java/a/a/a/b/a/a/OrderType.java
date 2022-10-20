package a.a.a.b.a.a;

public enum OrderType {
    NONE(""),
    ASC("asc"),
    DESC("desc");

    private final String HDQ;

    OrderType(String var3) {
        this.HDQ = var3;
    }

    public String getKeyWord() {
        return this.HDQ;
    }
}
