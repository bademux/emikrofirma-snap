package a.a.a.c.d.d;

import a.a.a.c.e.a.k.a.EXF;

import javax.xml.namespace.QName;
import jakarta.xml.soap.SOAPElement;
import jakarta.xml.soap.SOAPEnvelope;
import jakarta.xml.soap.SOAPHeader;
import jakarta.xml.ws.handler.MessageContext;
import jakarta.xml.ws.handler.soap.SOAPHandler;
import jakarta.xml.ws.handler.soap.SOAPMessageContext;
import java.util.Set;

public class EQX implements SOAPHandler<SOAPMessageContext> {
    private static final String FXV = "Password";
    private static final String FXW = "Username";
    private static final String FXX = "UsernameToken";
    private static final String FXY = "Security";
    private static final String FXZ = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd";
    private static final String FYA = "wsse";
    private final String FYB;
    private final String FYC;

    public EQX(String var1, String var2) {
        EXF.getInstance().ICO();

        try {
            this.FYB = var1;
            this.FYC = var2;
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public boolean handleMessage(SOAPMessageContext var1) {
        EXF.getInstance().ICO();
        EXF.getInstance().ICK("soapMessageContext " + var1);

        boolean var14;
        try {
            Boolean var2 = (Boolean) var1.get("jakarta.xml.ws.handler.message.outbound");
            if (var2) {
                try {
                    SOAPEnvelope var3 = var1.getMessage().getSOAPPart().getEnvelope();
                    SOAPHeader var4 = var3.getHeader();
                    if (var4 == null) {
                        var4 = var3.addHeader();
                    }

                    SOAPElement var5 = var4.addChildElement("Security", "wsse", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd");
                    SOAPElement var6 = var5.addChildElement("UsernameToken", "wsse");
                    SOAPElement var7 = var6.addChildElement("Username", "wsse");
                    var7.addTextNode(this.FYB);
                    SOAPElement var8 = var6.addChildElement("Password", "wsse");
                    var8.addTextNode(this.FYC);
                } catch (Exception var12) {
                    throw new RuntimeException("Error on wsSecurityHandler: " + var12.getMessage());
                }
            }

            var14 = true;
        } finally {
            EXF.getInstance().ICP();
        }

        return var14;
    }

    public void close(MessageContext var1) {
        EXF.getInstance().ICQ();
    }

    public boolean handleFault(SOAPMessageContext var1) {
        EXF.getInstance().ICO();
        EXF.getInstance().ICK("context " + var1);

        boolean var2;
        try {
            var2 = true;
        } finally {
            EXF.getInstance().ICP();
        }

        return var2;
    }

    public Set<QName> getHeaders() {
        EXF.getInstance().ICO();

        Object var1;
        try {
            var1 = null;
        } finally {
            EXF.getInstance().ICP();
        }

        return (Set) var1;
    }
}
