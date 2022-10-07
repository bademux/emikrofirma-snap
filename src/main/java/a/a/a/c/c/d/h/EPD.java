package a.a.a.c.c.d.h;

import a.a.a.b.f.FFK;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.d.AGWN;
import a.a.a.c.f.b.c.a.KK;
import a.a.a.c.g.c.FCZ;
import org.apache.avalon.framework.configuration.Configuration;
import org.apache.avalon.framework.configuration.ConfigurationException;
import org.apache.avalon.framework.configuration.DefaultConfigurationBuilder;
import org.apache.fop.apps.FOUserAgent;
import org.apache.fop.apps.Fop;
import org.apache.fop.apps.FopFactory;
import org.apache.fop.apps.FopFactoryBuilder;
import org.apache.xmlgraphics.io.Resource;
import org.apache.xmlgraphics.io.ResourceResolver;
import org.xml.sax.SAXException;
import pl.akmf.apps.micro.jaxb.upo.v1_6.Potwierdzenie;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.sax.SAXResult;
import javax.xml.transform.stream.StreamSource;
import java.io.*;
import java.net.URI;
import java.util.ResourceBundle;

public class EPD extends EPJ {
    private final Potwierdzenie FPL;
    private final AGWN FPM;

    public EPD(ResourceBundle var1, File var2, AGWN var3) {
        super(var1, var2);
        EXF.getInstance().ICO();

        try {
            this.FPL = var3.getUpo();
            this.FPM = var3;
        } finally {
            EXF.getInstance().ICP();
        }

    }

    public void HOF() throws FFK {
        EXF.getInstance().ICO();

        try {
            InputStream var1 = null;
            FileOutputStream var2 = null;
            EXF.getInstance().ICK("potwierdzenie " + this.FPL);
            DefaultConfigurationBuilder var3 = new DefaultConfigurationBuilder();
            var1 = EPD.class.getResourceAsStream("/fop/jpkFont.xsl");
            Configuration var4 = var3.build(var1);
            FopFactoryBuilder var5 = new FopFactoryBuilder((new File(".")).toURI(), new ResourceResolver() {
                public Resource getResource(URI var1) throws IOException {
                    return new Resource(this.getClass().getResourceAsStream(var1.getPath()));
                }

                public OutputStream getOutputStream(URI var1) throws IOException {
                    return new FileOutputStream(new File(var1));
                }
            });
            var5.setConfiguration(var4);
            FopFactory var6 = var5.build();
            var2 = new FileOutputStream(this.FPP);
            FOUserAgent var7 = var6.newFOUserAgent();
            Fop var8 = var6.newFop("application/pdf", var7, var2);
            TransformerFactory var9 = TransformerFactory.newInstance();
            Transformer var10 = var9.newTransformer(new StreamSource(EPD.class.getResourceAsStream("/fop/upo.xsl")));
            var10.setParameter("documentReceiver", this.FPL.getNazwaPodmiotuPrzyjmujacego());
            var10.setParameter("documentId", this.FPL.getNumerReferencyjny());
            var10.setParameter("documentDateTime", this.FPL.getDataWplyniecia());
            var10.setParameter("documentCheckSum", this.FPL.getSkrotDokumentu());
            var10.setParameter("documentSignedCheckSum", this.FPL.getSkrotZlozonejStruktury());
            var10.setParameter("documentLogicalStructure", this.FPL.getNazwaStrukturyLogicznej());
            if (this.FPL.getNIP1() != null) {
                var10.setParameter("documentIdentifierFirst", this.FPL.getNIP1());
            } else if (this.FPL.getPESEL1() != null) {
                var10.setParameter("documentIdentifierFirst", this.FPL.getPESEL1());
            } else if (this.FPL.getNumerIdentyfikacyjny() != null) {
                var10.setParameter("documentIdentifierFirst", this.FPL.getNumerIdentyfikacyjny());
            }

            if (this.FPL.getNIP2() != null) {
                var10.setParameter("documentIdentifierSecond", this.FPL.getNIP2());
            } else if (this.FPL.getPESEL2() != null) {
                var10.setParameter("documentIdentifierSecond", this.FPL.getPESEL2());
            }

            var10.setParameter("documentTaxOffice", KK.getValueForKey(this.FPL.getKodUrzedu()));
            var10.setParameter("documentBase64Timestamp", this.FPL.getStempelCzasu());
            var10.setParameter("documentFormSchema", this.FPL.getWersjaSchemy());
            var10.setParameter("documentGenerationDateTime", this.FPM.getUpoSigningTime());
            SAXResult var11 = new SAXResult(var8.getDefaultHandler());
            var10.transform(new StreamSource(EPD.class.getResourceAsStream("/fop/upo.xml")), var11);
            var2.flush();
            var2.close();
        } catch (TransformerException | ConfigurationException | SAXException | IOException var15) {
            EXF.getInstance().ICA(var15);
            throw FCZ.getInstance().IHL();
        } finally {
            EXF.getInstance().ICP();
        }

    }

    protected void HOG() throws FFK {
    }
}
