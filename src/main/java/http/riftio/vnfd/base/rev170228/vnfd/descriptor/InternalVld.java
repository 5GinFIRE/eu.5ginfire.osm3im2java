package http.riftio.vnfd.base.rev170228.vnfd.descriptor;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import http.riftio.vnfd.base.rev170228.VnfdDescriptor;
import http.riftio.vnfd.base.rev170228.vnfd.descriptor.internal.vld.InitParams;
import http.riftio.vnfd.base.rev170228.vnfd.descriptor.internal.vld.InternalConnectionPoint;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ProviderNetwork;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.VirtualLinkType;

import java.math.BigInteger;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of Internal Virtual Link Descriptors (VLD).The internal VLD describes the 
 * basic topology ofthe connectivity such as E-LAN, E-Line, E-Tree.between 
 * VNF components of the system.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * list internal-vld {
 *     key "id";
 *     leaf id {
 *         type string;
 *     }
 *     leaf name {
 *         type string;
 *     }
 *     leaf short-name {
 *         type string;
 *     }
 *     leaf description {
 *         type string;
 *     }
 *     leaf type {
 *         type virtual-link-type;
 *     }
 *     leaf root-bandwidth {
 *         type uint64;
 *     }
 *     leaf leaf-bandwidth {
 *         type uint64;
 *     }
 *     list internal-connection-point {
 *         key "id-ref";
 *         leaf id-ref {
 *             type string;
 *         }
 *         leaf ip-address {
 *             type ip-address;
 *         }
 *     }
 *     container provider-network {
 *         leaf physical-network {
 *             type string;
 *         }
 *         leaf segmentation_id {
 *             type uint32;
 *         }
 *     }
 *     choice init-params {
 *         case vim-network-profile {
 *             leaf ip-profile-ref {
 *                 type string;
 *             }
 *         }
 *         case vim-network-ref {
 *             leaf vim-network-name {
 *                 type string;
 *             }
 *         }
 *     }
 *     uses provider-network;
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/internal-vld</i>
 * 
 * <p>To create instances of this class use {@link InternalVldBuilder}.
 * @see InternalVldBuilder
 * @see InternalVldKey
 *
 */
public interface InternalVld
    extends
    ChildOf<VnfdDescriptor>,
    Augmentable<http.riftio.vnfd.base.rev170228.vnfd.descriptor.InternalVld>,
    ProviderNetwork,
    Identifiable<InternalVldKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("http://riftio.com/ns/riftware-1.0/vnfd-base",
        "2017-02-28", "internal-vld").intern();

    /**
     * Identifier for the VLD
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    java.lang.String getId();
    
    /**
     * Name of the internal VLD
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    java.lang.String getName();
    
    /**
     * Short name to appear as label in the UI
     *
     *
     *
     * @return <code>java.lang.String</code> <code>shortName</code>, or <code>null</code> if not present
     */
    java.lang.String getShortName();
    
    /**
     * @return <code>java.lang.String</code> <code>description</code>, or <code>null</code> if not present
     */
    java.lang.String getDescription();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.VirtualLinkType</code> <code>type</code>, or <code>null</code> if not present
     */
    VirtualLinkType getType();
    
    /**
     * For ELAN this is the aggregate bandwidth.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>rootBandwidth</code>, or <code>null</code> if not present
     */
    BigInteger getRootBandwidth();
    
    /**
     * For ELAN this is the bandwidth of branches.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>leafBandwidth</code>, or <code>null</code> if not present
     */
    BigInteger getLeafBandwidth();
    
    /**
     * List of internal connection points in this VLD
     *
     *
     *
     * @return <code>java.util.List</code> <code>internalConnectionPoint</code>, or <code>null</code> if not present
     */
    List<InternalConnectionPoint> getInternalConnectionPoint();
    
    /**
     * Extra parameters for VLD instantiation
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.vnfd.base.rev170228.vnfd.descriptor.internal.vld.InitParams</code> <code>initParams</code>, or <code>null</code> if not present
     */
    InitParams getInitParams();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.vnfd.base.rev170228.vnfd.descriptor.InternalVldKey</code> <code>key</code>, or <code>null</code> if not present
     */
    InternalVldKey getKey();

}

