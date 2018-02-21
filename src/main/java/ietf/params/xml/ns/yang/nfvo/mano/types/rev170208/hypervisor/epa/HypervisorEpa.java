package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.hypervisor.epa;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * container hypervisor-epa {
 *     leaf type {
 *         type enumeration;
 *     }
 *     leaf version {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/hypervisor-epa/hypervisor-epa</i>
 * 
 * <p>To create instances of this class use {@link HypervisorEpaBuilder}.
 * @see HypervisorEpaBuilder
 *
 */
public interface HypervisorEpa
    extends
    ChildOf<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.HypervisorEpa>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.hypervisor.epa.HypervisorEpa>
{


    public enum Type {
        PREFERKVM(0, "PREFER_KVM"),
        
        REQUIREKVM(1, "REQUIRE_KVM")
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

    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2017-02-08", "hypervisor-epa").intern();

    /**
     * Specifies the type of hypervisor.KVM: KVMXEN: XEN
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.hypervisor.epa.HypervisorEpa.Type</code> <code>type</code>, or <code>null</code> if not present
     */
    Type getType();
    
    /**
     * @return <code>java.lang.String</code> <code>version</code>, or <code>null</code> if not present
     */
    java.lang.String getVersion();

}

