package a.a.a.c.f.a.g;

import a.a.a.c.f.c.LW;

public class ModelTechnicalNamedElementCriteria<_T extends LW> extends ModelTechnicalElementCriteria<_T> {
    private final String ANJ;

    public ModelTechnicalNamedElementCriteria(Class<_T> var1, String var2) {
        super(var1);
        this.ANJ = var2;
    }

    public String getName() {
        return this.ANJ;
    }
}
