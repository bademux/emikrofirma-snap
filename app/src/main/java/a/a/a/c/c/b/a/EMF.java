package a.a.a.c.c.b.a;

import a.a.a.b.f.FFI;
import a.a.a.c.c.a.a.ELU;
import a.a.a.c.c.b.EMC;
import a.a.a.c.c.b.a.a.EMI;
import a.a.a.c.c.b.b.EMT;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.EXU;
import javafx.stage.Stage;
import javafx.util.Callback;

import java.lang.reflect.Constructor;

public class EMF implements Callback<Class<?>, Object> {
    private final EMC FGX;
    private final Stage FGY;
    private final EMT FGZ;
    private final String FHA;
    private final String FHB;

    public EMF(EMC var1, Stage var2, EMT var3, String var4, String var5) {
        EXF.getInstance().ICO();

        try {
            this.FGX = var1;
            this.FGY = var2;
            this.FGZ = var3;
            this.FHA = var4;
            this.FHB = var5;
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public Object call(Class<?> var1) {
        EXF.getInstance().ICO();

        EMI var4;
        try {
            Constructor var2;
            if (ELU.class.isAssignableFrom(var1)) {
                var2 = var1.getConstructor(EMC.class, EMT.class, String.class, String.class);
                ELU var12 = (ELU) var2.newInstance(this.FGX, this.FGZ, this.FHA, this.FHB);
                var12.setPrimaryStage(this.FGY);
                ELU var15 = var12;
                return var15;
            }

            if (!EMI.class.isAssignableFrom(var1)) {
                if (EMD.class.isAssignableFrom(var1)) {
                    var2 = var1.getConstructor(EMC.class, String.class);
                    EMD var11 = (EMD) var2.newInstance(this.FGX, this.FHB);
                    var11.setPrimaryStage(this.FGY);
                    EMD var14 = var11;
                    return var14;
                }

                if (EXU.class.isAssignableFrom(var1)) {
                    var2 = var1.getConstructor(String.class);
                    EXU var10 = (EXU) var2.newInstance(this.FHB);
                    var10.setPrimaryStage(this.FGY);
                    EXU var13 = var10;
                    return var13;
                }

                throw new FFI("Type [" + var1 + "] invalid!");
            }

            var2 = var1.getConstructor(EMC.class, String.class);
            EMI var3 = (EMI) var2.newInstance(this.FGX, this.FHB);
            var3.setPrimaryStage(this.FGY);
            var4 = var3;
        } catch (Exception var8) {
            EXF.getInstance().ICA(var8);
            throw new FFI(var8);
        } finally {
            EXF.getInstance().ICP();
        }

        return var4;
    }
}
