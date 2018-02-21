package http.riftio.vnfd.base.rev170228.vnfd.descriptor;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import http.riftio.vnfd.base.rev170228.CommonConnectionPoint;
import http.riftio.vnfd.base.rev170228.VnfdDescriptor;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List for external connection points. Each VNF has oneor more external 
 * points that connect the VNFto other VNFs or to external networks. Each VNF 
 * exposesconnection points to the orchestrator, which can constructnetwork 
 * services by connecting the connection pointsbetween different VNFs. The NFVO 
 * will use VLDs and VNFFGsat the network service level to construct network 
 * services.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * list connection-point {
 *     key "name";
 *     leaf name {
 *         type string;
 *     }
 *     leaf id {
 *         type string;
 *     }
 *     leaf short-name {
 *         type string;
 *     }
 *     leaf type {
 *         type connection-point-type;
 *     }
 *     leaf port-security-enabled {
 *         type boolean;
 *     }
 *     uses common-connection-point;
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/connection-point</i>
 * 
 * <p>To create instances of this class use {@link ConnectionPointBuilder}.
 * @see ConnectionPointBuilder
 * @see ConnectionPointKey
 *
 */
public interface ConnectionPoint
    extends
    ChildOf<VnfdDescriptor>,
    Augmentable<http.riftio.vnfd.base.rev170228.vnfd.descriptor.ConnectionPoint>,
    CommonConnectionPoint,
    Identifiable<ConnectionPointKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("http://riftio.com/ns/riftware-1.0/vnfd-base",
        "2017-02-28", "connection-point").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.vnfd.base.rev170228.vnfd.descriptor.ConnectionPointKey</code> <code>key</code>, or <code>null</code> if not present
     */
    ConnectionPointKey getKey();

}

