package ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.config.agent.job.vnfr;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PrimitiveParameterValue;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.config.agent.job.Vnfr;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list primitive {
 *     key "name";
 *     leaf name {
 *         type string;
 *     }
 *     list parameter {
 *         key "name";
 *         leaf name {
 *             type string;
 *         }
 *         leaf value {
 *             type string;
 *         }
 *     }
 *     leaf execution-id {
 *         type string;
 *     }
 *     leaf execution-status {
 *         type enumeration;
 *     }
 *     leaf execution-error-details {
 *         type string;
 *     }
 *     uses primitive-parameter-value;
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/project/(urn:ietf:params:xml:ns:yang:nfvo:nsr?revision=2017-02-08)ns-instance-opdata/nsr/config-agent-job/vnfr/primitive</i>
 * 
 * <p>To create instances of this class use {@link PrimitiveBuilder}.
 * @see PrimitiveBuilder
 * @see PrimitiveKey
 *
 */
public interface Primitive
    extends
    ChildOf<Vnfr>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.config.agent.job.vnfr.Primitive>,
    PrimitiveParameterValue,
    Identifiable<PrimitiveKey>
{


    public enum ExecutionStatus {
        Pending(0, "pending"),
        
        Success(1, "success"),
        
        Failure(2, "failure")
        ;
    
        private static final java.util.Map<java.lang.Integer, ExecutionStatus> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, ExecutionStatus> b = com.google.common.collect.ImmutableMap.builder();
            for (ExecutionStatus enumItem : ExecutionStatus.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private ExecutionStatus(int value, java.lang.String name) {
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
         * @return corresponding ExecutionStatus item
         */
        public static ExecutionStatus forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }

    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsr",
        "2017-02-08", "primitive").intern();

    /**
     * the name of the primitive
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    java.lang.String getName();
    
    /**
     * Execution id of the primitive
     *
     *
     *
     * @return <code>java.lang.String</code> <code>executionId</code>, or <code>null</code> if not present
     */
    java.lang.String getExecutionId();
    
    /**
     * status of the Execution
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.config.agent.job.vnfr.Primitive.ExecutionStatus</code> <code>executionStatus</code>, or <code>null</code> if not present
     */
    ExecutionStatus getExecutionStatus();
    
    /**
     * Error details if execution-status is failure
     *
     *
     *
     * @return <code>java.lang.String</code> <code>executionErrorDetails</code>, or <code>null</code> if not present
     */
    java.lang.String getExecutionErrorDetails();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.config.agent.job.vnfr.PrimitiveKey</code> <code>key</code>, or <code>null</code> if not present
     */
    PrimitiveKey getKey();

}

