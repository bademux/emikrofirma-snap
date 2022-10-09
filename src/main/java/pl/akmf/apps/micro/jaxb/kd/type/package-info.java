@XmlSchema(
        xmlns = {@XmlNs(
                namespaceURI = "http://e-deklaracje.mf.gov.pl/Repozytorium/Definicje/Podpis/",
                prefix = "podp"
        ), @XmlNs(
                namespaceURI = "http://jpk.mf.gov.pl/wzor/2018/01/23/jpkmicro",
                prefix = "tns"
        )},
        namespace = "http://e-deklaracje.mf.gov.pl/Repozytorium/Definicje/Podpis/",
        elementFormDefault = XmlNsForm.QUALIFIED
)
package pl.akmf.apps.micro.jaxb.kd.type;

import jakarta.xml.bind.annotation.XmlNs;
import jakarta.xml.bind.annotation.XmlNsForm;
import jakarta.xml.bind.annotation.XmlSchema;
