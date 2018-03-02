package ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.virtual._interface;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import java.math.BigInteger;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for the virtual interface properties
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfr</b>
 * <pre>
 * container virtual-interface {
 *     leaf type {
 *         type enumeration;
 *     }
 *     leaf bandwidth {
 *         type uint64;
 *     }
 *     leaf ovs-offload {
 *         type enumeration;
 *     }
 *     leaf vendor-id {
 *         type string;
 *     }
 *     leaf datapath-library {
 *         type string;
 *     }
 *     leaf provider-network-name {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfr/virtual-interface/virtual-interface</i>
 * 
 * <p>To create instances of this class use {@link VirtualInterfaceBuilder}.
 * @see VirtualInterfaceBuilder
 *
 */
public interface VirtualInterface
    extends
    ChildOf<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.VirtualInterface>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.virtual._interface.VirtualInterface>
{


    public enum Type {
        VIRTIO(0, "VIRTIO"),
        
        PCIPASSTHROUGH(1, "PCI-PASSTHROUGH"),
        
        SRIOV(2, "SR-IOV")
        ;
    
        private static final java.util.Map<java.lang.Integer, Type> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, Type> b = com.google.common.collect.ImmutableMap.builder();
            for (Type enumItem : Type.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private Type(int value, java.lang.String name) {
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
         * @return corresponding Type item
         */
        public static Type forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }
    
    public enum OvsOffload {
        MANDATORY(0, "MANDATORY"),
        
        PREFERRED(1, "PREFERRED")
        ;
    
        private static final java.util.Map<java.lang.Integer, OvsOffload> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, OvsOffload> b = com.google.common.collect.ImmutableMap.builder();
            for (OvsOffload enumItem : OvsOffload.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private OvsOffload(int value, java.lang.String name) {
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
         * @return corresponding OvsOffload item
         */
        public static OvsOffload forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }

    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:vnfr",
        "2017-02-28", "virtual-interface").intern();

    /**
     * Specifies the type of virtual interfacebetween VM and host.VIRTIO : Use the 
     * traditional VIRTIO interface.PCI-PASSTHROUGH : Use PCI-PASSTHROUGH 
     * interface.SR-IOV : Use SR-IOV interface.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.virtual._interface.VirtualInterface.Type</code> <code>type</code>, or <code>null</code> if not present
     */
    Type getType();
    
    /**
     * Aggregate bandwidth of the NIC.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>bandwidth</code>, or <code>null</code> if not present
     */
    BigInteger getBandwidth();
    
    /**
     * Defines if the NIC supports OVS offload.MANDATORY : OVS offload support in the 
     * NIC is mandatory.PREFERRED : OVS offload support in the NIC is preferred.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.virtual._interface.VirtualInterface.OvsOffload</code> <code>ovsOffload</code>, or <code>null</code> if not present
     */
    OvsOffload getOvsOffload();
    
    /**
     * Specifies the vendor specific id forthe device. This is used when a NIC 
     * fromspecific HW vendor is required.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vendorId</code>, or <code>null</code> if not present
     */
    java.lang.String getVendorId();
    
    /**
     * Specifies the name and version of the datapathlibrary the NIC is expected to 
     * support.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>datapathLibrary</code>, or <code>null</code> if not present
     */
    java.lang.String getDatapathLibrary();
    
    /**
     * Name of the provider network to which thisNIC is attached.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>providerNetworkName</code>, or <code>null</code> if not present
     */
    java.lang.String getProviderNetworkName();

}

