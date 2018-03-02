package ietf.params.xml.ns.yang.nfvo.vlr.rev170208.project.vlr.catalog;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.IpProfileInfo;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ProviderNetwork;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.VirtualLinkType;
import ietf.params.xml.ns.yang.nfvo.vlr.rev170208.project.VlrCatalog;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

import java.math.BigInteger;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vlr</b>
 * <pre>
 * list vlr {
 *     key "id";
 *     leaf id {
 *         type uuid;
 *     }
 *     leaf name {
 *         type string;
 *     }
 *     leaf nsr-id-ref {
 *         type uuid;
 *     }
 *     leaf vld-ref {
 *         type string;
 *     }
 *     leaf res-id {
 *         type uuid;
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
 *     leaf create-time {
 *         type uint32;
 *     }
 *     leaf uptime {
 *         type uint32;
 *     }
 *     leaf network-id {
 *         type string;
 *     }
 *     leaf vim-network-name {
 *         type string;
 *     }
 *     container provider-network {
 *         leaf physical-network {
 *             type string;
 *         }
 *         leaf segmentation_id {
 *             type uint32;
 *         }
 *     }
 *     container ip-profile-params {
 *         leaf ip-version {
 *             type ip-version;
 *         }
 *         leaf subnet-address {
 *             type ip-prefix;
 *         }
 *         leaf gateway-address {
 *             type ip-address;
 *         }
 *         leaf security-group {
 *             type string;
 *         }
 *         list dns-server {
 *             key "address";
 *             leaf address {
 *                 type ip-address;
 *             }
 *         }
 *         container dhcp-params {
 *             leaf enabled {
 *                 type enabled;
 *             }
 *             leaf start-address {
 *                 type ip-address;
 *             }
 *             leaf count {
 *                 type uint32;
 *             }
 *         }
 *         leaf subnet-prefix-pool {
 *             type string;
 *         }
 *     }
 *     leaf status {
 *         type enumeration;
 *     }
 *     leaf operational-status {
 *         type enumeration;
 *     }
 *     uses ip-profile-info;
 *     uses provider-network;
 * }
 * </pre>The schema path to identify an instance is
 * <i>vlr/project/(urn:ietf:params:xml:ns:yang:nfvo:vlr?revision=2017-02-08)vlr-catalog/vlr</i>
 * 
 * <p>To create instances of this class use {@link VlrBuilder}.
 * @see VlrBuilder
 * @see VlrKey
 *
 */
public interface Vlr
    extends
    ChildOf<VlrCatalog>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.vlr.rev170208.project.vlr.catalog.Vlr>,
    IpProfileInfo,
    ProviderNetwork,
    Identifiable<VlrKey>
{


    public enum Status {
        LINKUP(0, "LINK_UP"),
        
        DEGRADED(1, "DEGRADED"),
        
        LINKDOWN(2, "LINK_DOWN")
        ;
    
        private static final java.util.Map<java.lang.Integer, Status> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, Status> b = com.google.common.collect.ImmutableMap.builder();
            for (Status enumItem : Status.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private Status(int value, java.lang.String name) {
            this.value = value;
            this.name = name;
        }
    
        /**
         * Returns the name of the enumeration item as it is specified in the input yang.
         *
         * @return the name of the enumeration item as it is specified in the input yang
         */
        public java.lang.String getName() {
            return name;
        }
    
        /**
         * @return integer value
         */
        public int getIntValue() {
            return value;
        }
    
        /**
         * @param valueArg integer value
         * @return corresponding Status item
         */
        public static Status forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }
    
    public enum OperationalStatus {
        Init(0, "init"),
        
        VlAllocPending(1, "vl-alloc-pending"),
        
        Running(2, "running"),
        
        VlTerminatePending(3, "vl-terminate-pending"),
        
        Terminated(4, "terminated"),
        
        Failed(5, "failed")
        ;
    
        private static final java.util.Map<java.lang.Integer, OperationalStatus> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, OperationalStatus> b = com.google.common.collect.ImmutableMap.builder();
            for (OperationalStatus enumItem : OperationalStatus.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private OperationalStatus(int value, java.lang.String name) {
            this.value = value;
            this.name = name;
        }
    
        /**
         * Returns the name of the enumeration item as it is specified in the input yang.
         *
         * @return the name of the enumeration item as it is specified in the input yang
         */
        public java.lang.String getName() {
            return name;
        }
    
        /**
         * @return integer value
         */
        public int getIntValue() {
            return value;
        }
    
        /**
         * @param valueArg integer value
         * @return corresponding OperationalStatus item
         */
        public static OperationalStatus forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }

    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:vlr",
        "2017-02-08", "vlr").intern();

    /**
     * Identifier for the VLR.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid</code> <code>id</code>, or <code>null</code> if not present
     */
    Uuid getId();
    
    /**
     * VLR name.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    java.lang.String getName();
    
    /**
     * NS instance identifier.This is a leafref 
     * /rw-project:project/nsr:ns-instance-config/nsr:nsr/nsr:id
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid</code> <code>nsrIdRef</code>, or <code>null</code> if not present
     */
    Uuid getNsrIdRef();
    
    /**
     * Reference to 
     * VLD/rw-project:project/nsr:ns-instance-config/nsr:nsr[nsr:id=../nsr-id-ref]/nsd/vld:vld/vld:id
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vldRef</code>, or <code>null</code> if not present
     */
    java.lang.String getVldRef();
    
    /**
     * Identifier for resmgr id mapping
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid</code> <code>resId</code>, or <code>null</code> if not present
     */
    Uuid getResId();
    
    /**
     * Short name to appear as label in the UI
     *
     *
     *
     * @return <code>java.lang.String</code> <code>shortName</code>, or <code>null</code> if not present
     */
    java.lang.String getShortName();
    
    /**
     * Provider of the VLR.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vendor</code>, or <code>null</code> if not present
     */
    java.lang.String getVendor();
    
    /**
     * Description of the VLR.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>description</code>, or <code>null</code> if not present
     */
    java.lang.String getDescription();
    
    /**
     * Version of the VLR
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
     * Creation timestamp of this Virtual Link.The timestamp is expressed as 
     * secondssince unix epoch - 1970-01-01T00:00:00Z
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>createTime</code>, or <code>null</code> if not present
     */
    java.lang.Long getCreateTime();
    
    /**
     * Active period of this Virtual Link.Uptime is expressed in seconds
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>uptime</code>, or <code>null</code> if not present
     */
    java.lang.Long getUptime();
    
    /**
     * Identifier for the allocated network resource.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>networkId</code>, or <code>null</code> if not present
     */
    java.lang.String getNetworkId();
    
    /**
     * Name of network in VIM account. This is used to indicatepre-provisioned network 
     * name in cloud account.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vimNetworkName</code>, or <code>null</code> if not present
     */
    java.lang.String getVimNetworkName();
    
    /**
     * Status of the virtual link record.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.vlr.rev170208.project.vlr.catalog.Vlr.Status</code> <code>status</code>, or <code>null</code> if not present
     */
    Status getStatus();
    
    /**
     * The operational status of the Virtual Linkinit : The VL is in init 
     * stat.vl-alloc-pending : The VL alloc is pending in VIMrunning : The VL is up and
     * running in VMvl-terminate-pending : The VL is being terminated in VIM.terminated
     * : The VL is terminated in the VM.failed : The VL instantiation failed in VIM.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.vlr.rev170208.project.vlr.catalog.Vlr.OperationalStatus</code> <code>operationalStatus</code>, or <code>null</code> if not present
     */
    OperationalStatus getOperationalStatus();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.vlr.rev170208.project.vlr.catalog.VlrKey</code> <code>key</code>, or <code>null</code> if not present
     */
    VlrKey getKey();

}

