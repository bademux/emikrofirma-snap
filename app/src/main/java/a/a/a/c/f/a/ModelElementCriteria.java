package a.a.a.c.f.a;

import a.a.a.b.f.FFI;

public enum ModelElementCriteria {
    ModelElementCriteria(a.a.a.c.f.a.g.ModelElementCriteria.class),
    ModelTechnicalElementCriteria(a.a.a.c.f.a.g.ModelTechnicalElementCriteria.class),
    ModelTechnicalNamedElementCriteria(a.a.a.c.f.a.g.ModelTechnicalNamedElementCriteria.class),
    ModelBusinessElementCriteria(a.a.a.c.f.a.g.ModelBusinessElementCriteria.class),
    ModelBusinessPeriodElementCriteria(a.a.a.c.f.a.g.ModelBusinessPeriodElementCriteria.class),
    ModelBusinessPeriodElementTypedCriteria(a.a.a.c.f.a.g.ModelBusinessPeriodElementTypedCriteria.class),
    SettlementCriteria(a.a.a.c.f.a.g.SettlementCriteria.class),
    ReceiptRecordCriteria(a.a.a.c.f.a.g.ReceiptRecordCriteria.class),
    DeclarationCriteria(a.a.a.c.f.a.g.DeclarationCriteria.class),
    InvoiceRecordCriteria(a.a.a.c.f.a.g.InvoiceRecordCriteria.class),
    ModelBusinessPeriodElementTypedIdCriteria(a.a.a.c.f.a.g.ModelBusinessPeriodElementTypedIdCriteria.class),
    InvoiceCriteria(a.a.a.c.f.a.g.InvoiceCriteria.class);

    private final Class<? extends a.a.a.c.f.a.g.ModelElementCriteria> AMI;

    ModelElementCriteria(Class var3) {
        this.AMI = var3;
    }

    public static a.a.a.c.f.a.ModelElementCriteria getByType(Class<? extends a.a.a.c.f.a.g.ModelElementCriteria> var0) {
        a.a.a.c.f.a.ModelElementCriteria[] var1 = values();
        int var2 = var1.length;

        for (int var3 = 0; var3 < var2; ++var3) {
            a.a.a.c.f.a.ModelElementCriteria var4 = var1[var3];
            if (var4.getType().equals(var0)) {
                return var4;
            }
        }

        throw new FFI("Type [" + var0 + "] not found!");
    }

    public Class<? extends a.a.a.c.f.a.g.ModelElementCriteria> getType() {
        return this.AMI;
    }
}
