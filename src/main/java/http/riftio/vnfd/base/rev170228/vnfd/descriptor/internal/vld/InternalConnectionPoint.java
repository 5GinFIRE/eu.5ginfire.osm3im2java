package http.riftio.vnfd.base.rev170228.vnfd.descriptor.internal.vld;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import http.riftio.vnfd.base.rev170228.vnfd.descriptor.InternalVld;
import ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of internal connection points in this VLD
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * list internal-connection-point {
 *     key "id-ref";
 *     leaf id-ref {
 *         type string;
 *     }
 *     leaf ip-address {
 *         type ip-address;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/internal-vld/internal-connection-point</i>
 * 
 * <p>To create instances of this class use {@link InternalConnectionPointBuilder}.
 * @see InternalConnectionPointBuilder
 * @see InternalConnectionPointKey
 *
 */
public interface InternalConnectionPoint
    extends
    ChildOf<InternalVld>,
    Augmentable<http.riftio.vnfd.base.rev170228.vnfd.descriptor.internal.vld.InternalConnectionPoint>,
    Identifiable<InternalConnectionPointKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("http://riftio.com/ns/riftware-1.0/vnfd-base",
        "2017-02-28", "internal-connection-point").intern();

    /**
     * reference to the internal connection point id
     *
     *
     *
     * @return <code>java.lang.String</code> <code>idRef</code>, or <code>null</code> if not present
     */
    java.lang.String getIdRef();
    
    /**
     * IP address of the internal connection point
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress</code> <code>ipAddress</code>, or <code>null</code> if not present
     */
    IpAddress getIpAddress();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.vnfd.base.rev170228.vnfd.descriptor.internal.vld.InternalConnectionPointKey</code> <code>key</code>, or <code>null</code> if not present
     */
    InternalConnectionPointKey getKey();

}

