package a.a.a.c.f.a.c;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigInteger;
import java.util.Date;
import java.util.GregorianCalendar;

public abstract class AHCC {
    public AHCC() {
    }

    protected XMLGregorianCalendar AICS(Date var1) throws DatatypeConfigurationException {

        XMLGregorianCalendar var3;
        GregorianCalendar var2 = new GregorianCalendar();
        var2.setTime(var1);
        var3 = DatatypeFactory.newInstance().newXMLGregorianCalendar(var2);

        return var3;
    }

    protected Duration AICT(long var1) throws DatatypeConfigurationException {

        Duration var3;
        var3 = DatatypeFactory.newInstance().newDuration(var1);

        return var3;
    }

    protected int AICU(XMLGregorianCalendar var1, XMLGregorianCalendar var2) {

        org.slf4j.LoggerFactory.getLogger(getClass()).debug("left " + var1);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("right " + var2);

        int var6;
        BigInteger var3 = this.AICV(var1);
        BigInteger var4 = this.AICV(var2);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("leftMiliseconds " + var3);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("rightMiliseconds " + var4);
        int var5 = var3.compareTo(var4);
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("result " + var5);
        var6 = var5;

        return var6;
    }

    private BigInteger AICV(XMLGregorianCalendar var1) {

        org.slf4j.LoggerFactory.getLogger(getClass()).debug("xmlGregorianCalendar " + var1);

        BigInteger var3;
        BigInteger var2 = BigInteger.valueOf(var1.toGregorianCalendar().getTimeInMillis());
        org.slf4j.LoggerFactory.getLogger(getClass()).debug("result " + var2);
        var3 = var2;

        return var3;
    }
}
