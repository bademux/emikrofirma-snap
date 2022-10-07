package a.a.a.c.f;

import a.a.a.b.f.FFI;
import a.a.a.c.e.a.EXR;
import a.a.a.c.e.a.k.a.EXF;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.image.Image;

import javax.imageio.ImageIO;
import javax.xml.bind.annotation.XmlTransient;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

@XmlTransient
public abstract class LC extends KX<byte[]> {
    @XmlTransient
    private final ObjectProperty<byte[]> APQ;
    @XmlTransient
    private final ObjectProperty<Image> APR;

    public LC(byte[] var1) {
        super(var1);
        this.APQ = new LD(this);
        this.APR = new LE(this);
        EXF.getInstance().ICQ();
    }

    public LC() {
        this(null);
        EXF.getInstance().ICQ();
    }

    public String getValueBase64String() {
        return EXR.IEQ(this.getValue());
    }

    public String getValueHexString() {
        EXF.getInstance().ICO();

        String var1;
        try {
            if (this.getValue() == null) {
                var1 = "";
                return var1;
            }

            var1 = this.AICR(this.getValue(), "");
        } finally {
            EXF.getInstance().ICP();
        }

        return var1;
    }

    private String AICR(byte[] var1, String var2) {
        EXF.getInstance().ICO();

        try {
            StringBuffer var3 = new StringBuffer();
            byte[] var4 = var1;
            int var5 = var1.length;

            for (int var6 = 0; var6 < var5; ++var6) {
                byte var7 = var4[var6];
                var3.append(String.format("%02x", var7)).append(var2);
            }

            String var11 = var3.toString();
            return var11;
        } finally {
            EXF.getInstance().ICP();
        }
    }

    public int compareTo(KX<byte[]> var1) {
        throw new FFI("Do NOT use!");
    }

    public final ObjectProperty<byte[]> DDT() {
        return this.APQ;
    }

    public final ObjectProperty<Image> DDU() {
        return this.APR;
    }

    public static byte[] DDV(Image var0) throws IOException {
        EXF.getInstance().ICO();

        byte[] var3;
        try {
            BufferedImage var1;
            if (var0 == null) {
                return null;
            }

            var1 = SwingFXUtils.fromFXImage(var0, null);
            ByteArrayOutputStream var2 = new ByteArrayOutputStream();
            ImageIO.write(var1, "png", var2);
            var3 = var2.toByteArray();
        } finally {
            EXF.getInstance().ICP();
        }

        return var3;
    }

    public static Image DDW(byte[] var0) throws IOException {
        EXF.getInstance().ICO();

        ByteArrayInputStream var1;
        try {
            if (var0 != null) {
                var1 = new ByteArrayInputStream(var0);
                Image var2 = new Image(var1);
                BufferedImage var3 = SwingFXUtils.fromFXImage(var2, null);
                ByteArrayOutputStream var4 = new ByteArrayOutputStream();
                ImageIO.write(var3, "png", var4);
                Image var5 = new Image(new ByteArrayInputStream(var4.toByteArray()));
                return var5;
            }

        } finally {
            EXF.getInstance().ICP();
        }

        return null;
    }

    public String getValueAsString() {
        throw new FFI("Do NOT use!");
    }

    public void setValueFromString(String var1) {
        throw new FFI("Do NOT use!");
    }

    private class LE extends SimpleObjectProperty<Image> {
        private final LC APP;

        public LE(LC var2) {
            this.APP = var2;
        }

        public Image get() {
            return this.APP.getValue() != null ? new Image(new ByteArrayInputStream(this.APP.getValue())) : null;
        }

        public void set(Image var1) {
            try {
                if (var1 != null) {
                    BufferedImage var2 = SwingFXUtils.fromFXImage(var1, null);
                    ByteArrayOutputStream var3 = new ByteArrayOutputStream();
                    ImageIO.write(var2, "png", var3);
                    this.APP.setValue(var3.toByteArray());
                } else {
                    this.APP.setValue(null);
                }

            } catch (IOException var4) {
                EXF.getInstance().ICA(var4);
                throw new FFI(var4);
            }
        }
    }

    private class LD extends SimpleObjectProperty<byte[]> {
        private final LC APO;

        public LD(LC var2) {
            this.APO = var2;
        }

        public byte[] get() {
            return this.APO.getValue();
        }

        public void set(byte[] var1) {
            this.APO.setValue(var1);
        }
    }
}
