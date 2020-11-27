
package ru.lama;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.lama package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Packet_QNAME = new QName("http://www.lama.ru/test/", "packet");
    private final static QName _Response_QNAME = new QName("http://www.lama.ru/test/", "response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.lama
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PacketType }
     * 
     */
    public PacketType createPacketType() {
        return new PacketType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PacketType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PacketType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.lama.ru/test/", name = "packet")
    public JAXBElement<PacketType> createPacket(PacketType value) {
        return new JAXBElement<PacketType>(_Packet_QNAME, PacketType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.lama.ru/test/", name = "response")
    public JAXBElement<String> createResponse(String value) {
        return new JAXBElement<String>(_Response_QNAME, String.class, null, value);
    }

}
