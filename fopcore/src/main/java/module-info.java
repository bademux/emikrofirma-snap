module fopcore {

    requires java.desktop;
    requires jdk.xml.dom;
    requires java.logging;
    requires transitive java.xml;

    exports org.apache.fop.apps;
    exports org.apache.fop.configuration;
    exports org.apache.xmlgraphics.io;
}