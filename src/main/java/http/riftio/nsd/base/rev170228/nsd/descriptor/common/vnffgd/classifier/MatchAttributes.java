package http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.classifier;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.Classifier;
import ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;
import ietf.params.xml.ns.yang.ietf.inet.types.rev130715.PortNumber;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of match attributes.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd-base</b>
 * <pre>
 * list match-attributes {
 *     key "id";
 *     leaf id {
 *         type string;
 *     }
 *     leaf ip-proto {
 *         type uint8;
 *     }
 *     leaf source-ip-address {
 *         type ip-address;
 *     }
 *     leaf destination-ip-address {
 *         type ip-address;
 *     }
 *     leaf source-port {
 *         type port-number;
 *     }
 *     leaf destination-port {
 *         type port-number;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd-base/nsd-descriptor-common/vnffgd/classifier/match-attributes</i>
 * 
 * <p>To create instances of this class use {@link MatchAttributesBuilder}.
 * @see MatchAttributesBuilder
 * @see MatchAttributesKey
 *
 */
public interface MatchAttributes
    extends
    ChildOf<Classifier>,
    Augmentable<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.classifier.MatchAttributes>,
    Identifiable<MatchAttributesKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("http://riftio.com/ns/riftware-1.0/nsd-base",
        "2017-02-28", "match-attributes").intern();

    /**
     * Identifier for the classifier match attribute rule.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    java.lang.String getId();
    
    /**
     * IP Protocol.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>ipProto</code>, or <code>null</code> if not present
     */
    java.lang.Short getIpProto();
    
    /**
     * Source IP address.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress</code> <code>sourceIpAddress</code>, or <code>null</code> if not present
     */
    IpAddress getSourceIpAddress();
    
    /**
     * Destination IP address.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress</code> <code>destinationIpAddress</code>, or <code>null</code> if not present
     */
    IpAddress getDestinationIpAddress();
    
    /**
     * Source port number.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.PortNumber</code> <code>sourcePort</code>, or <code>null</code> if not present
     */
    PortNumber getSourcePort();
    
    /**
     * Destination port number.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.PortNumber</code> <code>destinationPort</code>, or <code>null</code> if not present
     */
    PortNumber getDestinationPort();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.nsd.base.rev170228.nsd.descriptor.common.vnffgd.classifier.MatchAttributesKey</code> <code>key</code>, or <code>null</code> if not present
     */
    MatchAttributesKey getKey();

}

