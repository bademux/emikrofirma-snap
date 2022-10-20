package a.a.a.b.d;

import org.glassfish.jaxb.runtime.marshaller.NamespacePrefixMapper;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.PropertyException;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;

public class FEO {
    private final JAXBContext HEY;
    private final Marshaller HEZ;

    public FEO(boolean var1, boolean var2, Charset var3, Class<?>... var4) throws JAXBException {
        this.HEY = JAXBContext.newInstance(var4);
        this.HEZ = this.HEY.createMarshaller();
        if (var1) {
            this.HEZ.setProperty("jaxb.fragment", Boolean.TRUE);
        }

        if (var2) {
            this.HEZ.setProperty("jaxb.formatted.output", Boolean.TRUE);
        }

        if (var3 != null) {
            this.HEZ.setProperty("jaxb.encoding", var3.name());
        }

        try {
            this.HEZ.setProperty("com.sun.xml.internal.bind.namespacePrefixMapper", new NamespacePrefixMapper() {
                public String[] getPreDeclaredNamespaceUris() {
                    return new String[]{"http://www.w3.org/2001/XMLSchema", "http://www.w3.org/2001/XMLSchema-instance"};
                }

                public String getPreferredPrefix(String var1, String var2, boolean var3) {
                    if (var1.equals("http://www.w3.org/2001/XMLSchema")) {
                        return "xs";
                    } else {
                        return var1.equals("http://www.w3.org/2001/XMLSchema-instance") ? "xsi" : var2;
                    }
                }
            });
        } catch (PropertyException var6) {
        }

    }

    public <_T> byte[] IKU(_T var1) throws JAXBException {
        ByteArrayOutputStream var2 = new ByteArrayOutputStream();
        this.HEZ.marshal(var1, var2);
        return var2.toByteArray();
    }
}
