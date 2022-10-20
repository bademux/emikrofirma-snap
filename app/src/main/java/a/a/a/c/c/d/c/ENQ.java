package a.a.a.c.c.d.c;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ENQ {
    private final Object FNC;
    private final Class<?> FND;

    public ENQ(Object var1, Class<?> var2) {
        this.FNC = var1;
        this.FND = var2;
    }

    public <_T> _T getFieldValue(String var1) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
        Field var2 = this.FND.getDeclaredField(var1);
        var2.setAccessible(true);
        Object var3 = var2.get(this.FNC);
        return (_T) var3;
    }

    public void HNJ(String var1, Class<?>[] var2, Object[] var3) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
        Method var4 = this.FND.getDeclaredMethod(var1, var2);
        var4.setAccessible(true);
        var4.invoke(this.FNC, var3);
    }
}
