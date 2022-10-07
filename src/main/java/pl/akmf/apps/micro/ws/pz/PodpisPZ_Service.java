package pl.akmf.apps.micro.ws.pz;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

@WebServiceClient(
   name = "PodpisPZ",
   targetNamespace = "http://www.mf.gov.pl/uslugiBiznesowe/AP/PodpisPZ/2017/01/27"
)
public class PodpisPZ_Service extends Service {
   public static final URL WSDL_LOCATION = PodpisPZ_Service.class.getResource("/pz/PodpisPZ.wsdl");
   public static final QName SERVICE = new QName("http://www.mf.gov.pl/uslugiBiznesowe/AP/PodpisPZ/2017/01/27", "PodpisPZ");
   public static final QName PodpisPZSOAP = new QName("http://www.mf.gov.pl/uslugiBiznesowe/AP/PodpisPZ/2017/01/27", "PodpisPZSOAP");

   public PodpisPZ_Service(URL var1) {
      super(var1, SERVICE);
   }

   public PodpisPZ_Service(URL var1, QName var2) {
      super(var1, var2);
   }

   public PodpisPZ_Service() {
      super(WSDL_LOCATION, SERVICE);
   }

   public PodpisPZ_Service(WebServiceFeature... var1) {
      super(WSDL_LOCATION, SERVICE, var1);
   }

   public PodpisPZ_Service(URL var1, WebServiceFeature... var2) {
      super(var1, SERVICE, var2);
   }

   public PodpisPZ_Service(URL var1, QName var2, WebServiceFeature... var3) {
      super(var1, var2, var3);
   }

   @WebEndpoint(
      name = "PodpisPZSOAP"
   )
   public PodpisPZ getPodpisPZSOAP() {
      return (PodpisPZ)super.getPort(PodpisPZSOAP, PodpisPZ.class);
   }

   @WebEndpoint(
      name = "PodpisPZSOAP"
   )
   public PodpisPZ getPodpisPZSOAP(WebServiceFeature... var1) {
      return (PodpisPZ)super.getPort(PodpisPZSOAP, PodpisPZ.class, var1);
   }
}
