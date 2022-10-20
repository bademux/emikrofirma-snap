module fopcore {

    requires java.desktop;
    requires jdk.xml.dom;
    requires java.logging;
    requires java.xml;
    requires org.apache.commons.logging;

    exports org.apache.fop.apps;
    exports org.apache.fop.configuration;
    exports org.apache.xmlgraphics.io;

    uses org.apache.commons.logging.LogFactory;
}