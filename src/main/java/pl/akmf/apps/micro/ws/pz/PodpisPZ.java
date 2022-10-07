package pl.akmf.apps.micro.ws.pz;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.WebParam.Mode;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import pl.akmf.apps.micro.jaxb.pz.type.ListaDokDoPobraniaType;
import pl.akmf.apps.micro.jaxb.pz.type.ListaDokPodpisaneType;
import pl.akmf.apps.micro.jaxb.pz.type.ListaDokWynikType;
import pl.akmf.apps.micro.jaxb.pz.type.ListaDokumentowType;

@WebService(
   targetNamespace = "http://www.mf.gov.pl/uslugiBiznesowe/AP/PodpisPZ/2017/01/27",
   name = "PodpisPZ"
)
public interface PodpisPZ {
   @WebMethod(
      action = "http://www.mf.gov.pl/uslugiBiznesowe/AP/PodpisPZ/2017/01/27/pobierzDokumenty"
   )
   @RequestWrapper(
      localName = "pobierzDokumenty",
      targetNamespace = "http://www.mf.gov.pl/schematy/AP/PodpisPZ/2017/01/27"
   )
   @ResponseWrapper(
      localName = "pobierzDokumentyOdpowiedz",
      targetNamespace = "http://www.mf.gov.pl/schematy/AP/PodpisPZ/2017/01/27"
   )
   void pobierzDokumenty(@WebParam(name = "adresZadania",targetNamespace = "") String var1, @WebParam(name = "listaDokumentow",targetNamespace = "") ListaDokDoPobraniaType var2, @WebParam(mode = Mode.OUT,name = "wynik",targetNamespace = "") Holder<String> var3, @WebParam(mode = Mode.OUT,name = "listaDokumentow",targetNamespace = "") Holder<ListaDokPodpisaneType> var4);

   @WebMethod(
      action = "http://www.mf.gov.pl/uslugiBiznesowe/AP/PodpisPZ/2017/01/27/zadaniePodpisu"
   )
   @RequestWrapper(
      localName = "zadaniePodpisu",
      targetNamespace = "http://www.mf.gov.pl/schematy/AP/PodpisPZ/2017/01/27"
   )
   @ResponseWrapper(
      localName = "zadaniePodpisuOdpowiedz",
      targetNamespace = "http://www.mf.gov.pl/schematy/AP/PodpisPZ/2017/01/27"
   )
   void zadaniePodpisu(@WebParam(name = "opisZadania",targetNamespace = "") String var1, @WebParam(name = "listaDokumentow",targetNamespace = "") ListaDokumentowType var2, @WebParam(mode = Mode.OUT,name = "wynik",targetNamespace = "") Holder<String> var3, @WebParam(mode = Mode.OUT,name = "adresZadania",targetNamespace = "") Holder<String> var4, @WebParam(mode = Mode.OUT,name = "listaDokumentow",targetNamespace = "") Holder<ListaDokWynikType> var5);
}
