package ietf.params.xml.ns.yang.nfvo.mano.rift.groupings.norev.custom.meta.data;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.MetaDataType;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of meta-data to be associated with the instance
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-rift-groupings</b>
 * <pre>
 * list custom-meta-data {
 *     key "name";
 *     leaf name {
 *         type string;
 *     }
 *     leaf data-type {
 *         type data-type;
 *     }
 *     leaf value {
 *         type string;
 *     }
 *     leaf destination {
 *         type destination;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-rift-groupings/custom-meta-data/custom-meta-data</i>
 * 
 * <p>To create instances of this class use {@link CustomMetaDataBuilder}.
 * @see CustomMetaDataBuilder
 * @see CustomMetaDataKey
 *
 */
public interface CustomMetaData
    extends
    ChildOf<ietf.params.xml.ns.yang.nfvo.mano.rift.groupings.norev.CustomMetaData>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.mano.rift.groupings.norev.custom.meta.data.CustomMetaData>,
    Identifiable<CustomMetaDataKey>
{


    public enum Destination {
        CLOUDINIT(0, "CLOUD_INIT"),
        
        CLOUDMETADATA(1, "CLOUD_METADATA")
        ;
    
        private static final java.util.Map<java.lang.Integer, Destination> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, Destination> b = com.google.common.collect.ImmutableMap.builder();
            for (Destination enumItem : Destination.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private Destination(int value, java.lang.String name) {
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
         * @return corresponding Destination item
         */
        public static Destination forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }

    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-rift-groupings",
        "custom-meta-data").intern();

    /**
     * Name of the meta-data parameter
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    java.lang.String getName();
    
    /**
     * Data-type the meta-data parameter
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.MetaDataType</code> <code>dataType</code>, or <code>null</code> if not present
     */
    MetaDataType getDataType();
    
    /**
     * Value of the meta-data parameter
     *
     *
     *
     * @return <code>java.lang.String</code> <code>value</code>, or <code>null</code> if not present
     */
    java.lang.String getValue();
    
    /**
     * Type of input parameter
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.rift.groupings.norev.custom.meta.data.CustomMetaData.Destination</code> <code>destination</code>, or <code>null</code> if not present
     */
    Destination getDestination();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.rift.groupings.norev.custom.meta.data.CustomMetaDataKey</code> <code>key</code>, or <code>null</code> if not present
     */
    CustomMetaDataKey getKey();

}

