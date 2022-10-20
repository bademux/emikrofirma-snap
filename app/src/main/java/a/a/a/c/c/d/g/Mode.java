package a.a.a.c.c.d.g;

public enum Mode {
    NEW(false, true),
    EDIT(false, true),
    EDIT_CORRECTION(true, true),
    CORRECT(true, true),
    VIEW(false, false),
    VIEW_CORRECTION(true, false);

    private final boolean FPG;
    private final boolean FPH;

    Mode(boolean var3, boolean var4) {
        this.FPG = var3;
        this.FPH = var4;
    }

    public boolean getCorrectFields() {
        return this.FPG;
    }

    public boolean getFieldsEditable() {
        return this.FPH;
    }
}
