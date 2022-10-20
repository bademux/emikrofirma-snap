package a.a.a.c.f.a;

import a.a.a.b.f.FFI;
import a.a.a.c.f.a.g.*;

public enum IM {
    ModelElementCriteria(JA.class),
    ModelTechnicalElementCriteria(JB.class),
    ModelTechnicalNamedElementCriteria(JC.class),
    ModelBusinessElementCriteria(IW.class),
    ModelBusinessPeriodElementCriteria(IX.class),
    ModelBusinessPeriodElementTypedCriteria(IY.class),
    SettlementCriteria(JE.class),
    ReceiptRecordCriteria(JD.class),
    DeclarationCriteria(IT.class),
    InvoiceRecordCriteria(IV.class),
    ModelBusinessPeriodElementTypedIdCriteria(IZ.class),
    InvoiceCriteria(IU.class);

    private final Class<? extends JA> AMI;

    IM(Class var3) {
        this.AMI = var3;
    }

    public static IM getByType(Class<? extends JA> var0) {
        IM[] var1 = values();
        int var2 = var1.length;

        for (int var3 = 0; var3 < var2; ++var3) {
            IM var4 = var1[var3];
            if (var4.getType().equals(var0)) {
                return var4;
            }
        }

        throw new FFI("Type [" + var0 + "] not found!");
    }

    public Class<? extends JA> getType() {
        return this.AMI;
    }
}
