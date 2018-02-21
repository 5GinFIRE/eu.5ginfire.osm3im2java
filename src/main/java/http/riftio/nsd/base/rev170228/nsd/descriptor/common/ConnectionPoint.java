package http.riftio.nsd.base.rev170228.nsd.descriptor.common;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import http.riftio.nsd.base.rev170228.NsdDescriptorCommon;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ConnectionPointType;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List for external connection points.Each NS has one or more external 
 * connectionpoints. As the name implies that externalconnection points are used 
 * for connectingthe NS to other NS or to external networks.Each NS exposes these 
 * connection points tothe orchestrator. The orchestrator canconstruct network 
 * service chains byconnecting the connection points betweendifferent NS.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd-base</b>
 * <pre>
 * list connection-point {
 *     key "name";
 *     leaf name {
 *         type string;
 *     }
 *     leaf type {
 *         type connection-point-type;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd-base/nsd-descriptor-common/connection-point</i>
 * 
 * <p>To create instances of this class use {@link ConnectionPointBuilder}.
 * @see ConnectionPointBuilder
 * @see ConnectionPointKey
 *
 */
public interface ConnectionPoint
    extends
    ChildOf<NsdDescriptorCommon>,
    Augmentable<http.riftio.nsd.base.rev170228.nsd.descriptor.common.ConnectionPoint>,
    Identifiable<ConnectionPointKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("http://riftio.com/ns/riftware-1.0/nsd-base",
        "2017-02-28", "connection-point").intern();

    /**
     * Name of the NS connection point.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    java.lang.String getName();
    
    /**
     * Type of the connection point.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ConnectionPointType</code> <code>type</code>, or <code>null</code> if not present
     */
    ConnectionPointType getType();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.nsd.base.rev170228.nsd.descriptor.common.ConnectionPointKey</code> <code>key</code>, or <code>null</code> if not present
     */
    ConnectionPointKey getKey();

}

