package a.a.a.c.c.d.h;

import a.a.a.b.f.FFK;
import a.a.a.c.e.a.k.a.EXF;
import a.a.a.c.f.a.d.AGWN;
import a.a.a.c.f.b.c.a.KK;
import a.a.a.c.g.c.FCZ;
import com.github.bademux.emk.utils.FopUtils;
import org.apache.fop.configuration.ConfigurationException;
import org.xml.sax.SAXException;
import pl.akmf.apps.micro.jaxb.upo.v1_6.Potwierdzenie;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.sax.SAXResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
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
            EXF.getInstance().ICK("potwierdzenie " + this.FPL);
            Transformer transformer = TransformerFactory.newInstance().newTransformer(new StreamSource(EPD.class.getResourceAsStream("/fop/upo.xsl")));
            transformer.setParameter("documentReceiver", this.FPL.getNazwaPodmiotuPrzyjmujacego());
            transformer.setParameter("documentId", this.FPL.getNumerReferencyjny());
            transformer.setParameter("documentDateTime", this.FPL.getDataWplyniecia());
            transformer.setParameter("documentCheckSum", this.FPL.getSkrotDokumentu());
            transformer.setParameter("documentSignedCheckSum", this.FPL.getSkrotZlozonejStruktury());
            transformer.setParameter("documentLogicalStructure", this.FPL.getNazwaStrukturyLogicznej());
            if (this.FPL.getNIP1() != null) {
                transformer.setParameter("documentIdentifierFirst", this.FPL.getNIP1());
            } else if (this.FPL.getPESEL1() != null) {
                transformer.setParameter("documentIdentifierFirst", this.FPL.getPESEL1());
            } else if (this.FPL.getNumerIdentyfikacyjny() != null) {
                transformer.setParameter("documentIdentifierFirst", this.FPL.getNumerIdentyfikacyjny());
            }

            if (this.FPL.getNIP2() != null) {
                transformer.setParameter("documentIdentifierSecond", this.FPL.getNIP2());
            } else if (this.FPL.getPESEL2() != null) {
                transformer.setParameter("documentIdentifierSecond", this.FPL.getPESEL2());
            }

            transformer.setParameter("documentTaxOffice", KK.getValueForKey(this.FPL.getKodUrzedu()));
            transformer.setParameter("documentBase64Timestamp", this.FPL.getStempelCzasu());
            transformer.setParameter("documentFormSchema", this.FPL.getWersjaSchemy());
            transformer.setParameter("documentGenerationDateTime", this.FPM.getUpoSigningTime());

            try (var fos = new FileOutputStream(this.FPP)) {
                transformer.transform(new StreamSource(EPD.class.getResourceAsStream("/fop/upo.xml")), new SAXResult(FopUtils.createFopHandler(fos)));
                fos.flush();
            }
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
