package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping monitoring-param-aggregation {
 *     leaf aggregation-type {
 *         type aggregation-type;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/monitoring-param-aggregation</i>
 *
 */
public interface MonitoringParamAggregation
    extends
    DataObject
{


    public enum AggregationType {
        AVERAGE(0, "AVERAGE"),
        
        MINIMUM(1, "MINIMUM"),
        
        MAXIMUM(2, "MAXIMUM"),
        
        COUNT(3, "COUNT"),
        
        SUM(4, "SUM")
        ;
    
        private static final java.util.Map<java.lang.Integer, AggregationType> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, AggregationType> b = com.google.common.collect.ImmutableMap.builder();
            for (AggregationType enumItem : AggregationType.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private AggregationType(int value, java.lang.String name) {
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
         * @return corresponding AggregationType item
         */
        public static AggregationType forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }

    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2017-02-08", "monitoring-param-aggregation").intern();

    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.MonitoringParamAggregation.AggregationType</code> <code>aggregationType</code>, or <code>null</code> if not present
     */
    AggregationType getAggregationType();

}

