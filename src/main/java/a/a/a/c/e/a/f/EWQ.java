package a.a.a.c.e.a.f;

public enum EWQ {
    OCTETSTREAM("application/octet-stream"),
    MULTIPART_RELATED("multipart/related"),
    XML("application/xml"),
    JSON("application/json"),
    TEXT("text/plain"),
    TEXT_XML("text/xml"),
    NONE("NONE");

    private final String GRA;

    EWQ(String var3) {
        this.GRA = var3;
    }

    public String getMimeType() {
        return this.GRA;
    }
}
