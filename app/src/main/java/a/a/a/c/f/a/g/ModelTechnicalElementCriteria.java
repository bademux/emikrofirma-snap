package a.a.a.c.f.a.g;

import a.a.a.c.f.c.LW;

public class ModelTechnicalElementCriteria<_T extends LW> extends ModelElementCriteria<_T> {
    private final Integer ANI;

    public ModelTechnicalElementCriteria(Class<_T> var1, Integer var2) {
        super(var1);
        this.ANI = var2;
    }

    public ModelTechnicalElementCriteria(Class<_T> var1) {
        this(var1, null);
    }

    public Integer getVersion() {
        return this.ANI;
    }
}
