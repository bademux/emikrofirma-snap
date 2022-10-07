package a.a.a.c.e.a.h;

import java.lang.reflect.Array;
import java.util.Arrays;

public class EWY {
    public EWY() {
    }

    public static byte[] IBK(byte[] var0) {
        return var0 != null ? Arrays.copyOf(var0, var0.length) : null;
    }

    public static char[] IBL(char[] var0) {
        return var0 != null ? Arrays.copyOf(var0, var0.length) : null;
    }

    public static <_X> _X[] IBM(Class<_X> var0, _X[] var1) {
        Object[] var2 = IBN(var1);
        if (var2 == null) {
            var2 = (Object[]) Array.newInstance(var0, 0);
        }

        return (_X[]) var2;
    }

    public static <_X> _X[] IBN(_X[] var0) {
        return var0 != null ? Arrays.copyOf(var0, var0.length) : null;
    }
}
