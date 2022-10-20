package a.a.a.c.f.a.g;

import a.a.a.c.f.c.LW;

public class JB<_T extends LW> extends JA<_T> {
    private final Integer ANI;

    public JB(Class<_T> var1, Integer var2) {
        super(var1);
        this.ANI = var2;
    }

    public JB(Class<_T> var1) {
        this(var1, null);
    }

    public Integer getVersion() {
        return this.ANI;
    }
}
