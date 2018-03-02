package http.riftio.nsd.base.rev170228;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import http.riftio.nsd.base.rev170228.nsd.vld.common.InitParams;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ProviderNetwork;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.VirtualLinkType;

import java.math.BigInteger;

/**
 * List of Virtual Link Descriptors.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd-base</b>
 * <pre>
 * grouping nsd-vld-common {
 *     leaf id {
 *         type string;
 *     }
 *     leaf name {
 *         type string;
 *     }
 *     leaf short-name {
 *         type string;
 *     }
 *     leaf vendor {
 *         type string;
 *     }
 *     leaf description {
 *         type string;
 *     }
 *     leaf version {
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
 *     container provider-network {
 *         leaf physical-network {
 *             type string;
 *         }
 *         leaf segmentation_id {
 *             type uint32;
 *         }
 *     }
 *     leaf mgmt-network {
 *         type mgmt-network;
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
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd-base/nsd-vld-common</i>
 *
 */
public interface NsdVldCommon
    extends
    DataObject,
    ProviderNetwork
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("http://riftio.com/ns/riftware-1.0/nsd-base",
        "2017-02-28", "nsd-vld-common").intern();

    /**
     * Identifier for the VLD.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    java.lang.String getId();
    
    /**
     * Virtual Link Descriptor (VLD) name.
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
     * Provider of the VLD.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vendor</code>, or <code>null</code> if not present
     */
    java.lang.String getVendor();
    
    /**
     * Description of the VLD.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>description</code>, or <code>null</code> if not present
     */
    java.lang.String getDescription();
    
    /**
     * Version of the VLD
     *
     *
     *
     * @return <code>java.lang.String</code> <code>version</code>, or <code>null</code> if not present
     */
    java.lang.String getVersion();
    
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
     * Flag indicating whether this network is a VIM management network
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>mgmtNetwork</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isMgmtNetwork();
    
    /**
     * Extra parameters for VLD instantiation
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.nsd.base.rev170228.nsd.vld.common.InitParams</code> <code>initParams</code>, or <code>null</code> if not present
     */
    InitParams getInitParams();

}

