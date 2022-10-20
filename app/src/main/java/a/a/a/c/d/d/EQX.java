package a.a.a.c.d.d;

import jakarta.xml.soap.SOAPElement;
import jakarta.xml.soap.SOAPEnvelope;
import jakarta.xml.soap.SOAPHeader;
import jakarta.xml.ws.handler.MessageContext;
import jakarta.xml.ws.handler.soap.SOAPHandler;
import jakarta.xml.ws.handler.soap.SOAPMessageContext;

import javax.xml.namespace.QName;
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

        this.FYB = var1;
        this.FYC = var2;

    }

    public boolean handleMessage(SOAPMessageContext var1) {

        org.slf4j.LoggerFactory.getLogger(getClass()).debug("soapMessageContext " + var1);

        boolean var14;
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

        return var14;
    }

    public void close(MessageContext var1) {

    }

    public boolean handleFault(SOAPMessageContext var1) {

        org.slf4j.LoggerFactory.getLogger(getClass()).debug("context " + var1);

        boolean var2;
        var2 = true;

        return var2;
    }

    public Set<QName> getHeaders() {

        Object var1;
        var1 = null;

        return (Set) var1;
    }
}
