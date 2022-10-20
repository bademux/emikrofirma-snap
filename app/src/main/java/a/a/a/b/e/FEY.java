package a.a.a.b.e;

import a.a.a.c.e.a.i.a.EWZ;

import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;

public class FEY {
    private static volatile FEY HFE;
    private final EWZ HFF;

    public static FEY getInstance() throws NoSuchAlgorithmException {
        if (HFE == null) {
            Class var0 = FEY.class;
            synchronized (FEY.class) {
                if (HFE == null) {
                    HFE = new FEY();
                }
            }
        }

        return HFE;
    }

    private FEY() throws NoSuchAlgorithmException {

        this.HFF = new EWZ();

    }

    public boolean ILA(byte[] var1, char[] var2, byte[] var3) throws NoSuchAlgorithmException, InvalidKeySpecException {

        boolean var5;
        SecretKey var4 = this.HFF.getKey(var2, var3);
        var5 = Arrays.equals(var1, var4.getEncoded());

        return var5;
    }

    public byte[] ILB() throws NoSuchAlgorithmException {

        byte[] var1;
        var1 = this.HFF.IBO();

        return var1;
    }

    public byte[] ILC(char[] var1, byte[] var2) throws NoSuchAlgorithmException, InvalidKeySpecException {

        byte[] var3;
        var3 = this.HFF.getKey(var1, var2).getEncoded();

        return var3;
    }
}
