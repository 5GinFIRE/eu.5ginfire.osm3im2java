package ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.config.agent.job;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.ConfigAgentJob;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.config.agent.job.vnfr.Primitive;

import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list vnfr {
 *     key "id";
 *     leaf id {
 *         type uuid;
 *     }
 *     leaf vnf-job-status {
 *         type enumeration;
 *     }
 *     list primitive {
 *         key "name";
 *         leaf name {
 *             type string;
 *         }
 *         list parameter {
 *             key "name";
 *             leaf name {
 *                 type string;
 *             }
 *             leaf value {
 *                 type string;
 *             }
 *         }
 *         leaf execution-id {
 *             type string;
 *         }
 *         leaf execution-status {
 *             type enumeration;
 *         }
 *         leaf execution-error-details {
 *             type string;
 *         }
 *         uses primitive-parameter-value;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/project/(urn:ietf:params:xml:ns:yang:nfvo:nsr?revision=2017-02-08)ns-instance-opdata/nsr/config-agent-job/vnfr</i>
 * 
 * <p>To create instances of this class use {@link VnfrBuilder}.
 * @see VnfrBuilder
 * @see VnfrKey
 *
 */
public interface Vnfr
    extends
    ChildOf<ConfigAgentJob>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.config.agent.job.Vnfr>,
    Identifiable<VnfrKey>
{


    public enum VnfJobStatus {
        Pending(0, "pending"),
        
        Success(1, "success"),
        
        Failure(2, "failure")
        ;
    
        private static final java.util.Map<java.lang.Integer, VnfJobStatus> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, VnfJobStatus> b = com.google.common.collect.ImmutableMap.builder();
            for (VnfJobStatus enumItem : VnfJobStatus.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private VnfJobStatus(int value, java.lang.String name) {
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
         * @return corresponding VnfJobStatus item
         */
        public static VnfJobStatus forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }

    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsr",
        "2017-02-08", "vnfr").intern();

    /**
     * Identifier for the VNFR.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid</code> <code>id</code>, or <code>null</code> if not present
     */
    Uuid getId();
    
    /**
     * Job status to be set based on each VNF primitive execution,pending - if at least
     * one primitive is in pending state and remaining primitives are in success 
     * state.Success - if all primitive executions are in success statefailure - if one
     * of the primitive executions is failure
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.config.agent.job.Vnfr.VnfJobStatus</code> <code>vnfJobStatus</code>, or <code>null</code> if not present
     */
    VnfJobStatus getVnfJobStatus();
    
    /**
     * @return <code>java.util.List</code> <code>primitive</code>, or <code>null</code> if not present
     */
    List<Primitive> getPrimitive();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.config.agent.job.VnfrKey</code> <code>key</code>, or <code>null</code> if not present
     */
    VnfrKey getKey();

}

