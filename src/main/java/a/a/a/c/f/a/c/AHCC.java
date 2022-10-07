package a.a.a.c.f.a.c;

import a.a.a.c.e.a.k.a.EXF;

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
        EXF.getInstance().ICO();

        XMLGregorianCalendar var3;
        try {
            GregorianCalendar var2 = new GregorianCalendar();
            var2.setTime(var1);
            var3 = DatatypeFactory.newInstance().newXMLGregorianCalendar(var2);
        } finally {
            EXF.getInstance().ICP();
        }

        return var3;
    }

    protected Duration AICT(long var1) throws DatatypeConfigurationException {
        EXF.getInstance().ICO();

        Duration var3;
        try {
            var3 = DatatypeFactory.newInstance().newDuration(var1);
        } finally {
            EXF.getInstance().ICP();
        }

        return var3;
    }

    protected int AICU(XMLGregorianCalendar var1, XMLGregorianCalendar var2) {
        EXF.getInstance().ICO();
        EXF.getInstance().ICK("left " + var1);
        EXF.getInstance().ICK("right " + var2);

        int var6;
        try {
            BigInteger var3 = this.AICV(var1);
            BigInteger var4 = this.AICV(var2);
            EXF.getInstance().ICK("leftMiliseconds " + var3);
            EXF.getInstance().ICK("rightMiliseconds " + var4);
            int var5 = var3.compareTo(var4);
            EXF.getInstance().ICK("result " + var5);
            var6 = var5;
        } finally {
            EXF.getInstance().ICP();
        }

        return var6;
    }

    private BigInteger AICV(XMLGregorianCalendar var1) {
        EXF.getInstance().ICO();
        EXF.getInstance().ICK("xmlGregorianCalendar " + var1);

        BigInteger var3;
        try {
            BigInteger var2 = BigInteger.valueOf(var1.toGregorianCalendar().getTimeInMillis());
            EXF.getInstance().ICK("result " + var2);
            var3 = var2;
        } finally {
            EXF.getInstance().ICP();
        }

        return var3;
    }
}
