package ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PrimitiveParameterValue;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.TriggerType;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.Nsr;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.config.agent.job.ParameterGroup;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.config.agent.job.Vnfr;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

import java.math.BigInteger;
import java.util.List;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list config-agent-job {
 *     key "job-id";
 *     leaf job-id {
 *         type uint64;
 *     }
 *     leaf job-name {
 *         type string;
 *     }
 *     leaf job-status {
 *         type enumeration;
 *     }
 *     leaf triggered-by {
 *         type trigger-type;
 *     }
 *     leaf create-time {
 *         type uint32;
 *     }
 *     leaf job-status-details {
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
 *     list parameter-group {
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
 *         uses primitive-parameter-value;
 *     }
 *     list vnfr {
 *         key "id";
 *         leaf id {
 *             type uuid;
 *         }
 *         leaf vnf-job-status {
 *             type enumeration;
 *         }
 *         list primitive {
 *             key "name";
 *             leaf name {
 *                 type string;
 *             }
 *             list parameter {
 *                 key "name";
 *                 leaf name {
 *                     type string;
 *                 }
 *                 leaf value {
 *                     type string;
 *                 }
 *             }
 *             leaf execution-id {
 *                 type string;
 *             }
 *             leaf execution-status {
 *                 type enumeration;
 *             }
 *             leaf execution-error-details {
 *                 type string;
 *             }
 *             uses primitive-parameter-value;
 *         }
 *     }
 *     uses primitive-parameter-value;
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/project/(urn:ietf:params:xml:ns:yang:nfvo:nsr?revision=2017-02-08)ns-instance-opdata/nsr/config-agent-job</i>
 * 
 * <p>To create instances of this class use {@link ConfigAgentJobBuilder}.
 * @see ConfigAgentJobBuilder
 * @see ConfigAgentJobKey
 *
 */
public interface ConfigAgentJob
    extends
    ChildOf<Nsr>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.ConfigAgentJob>,
    PrimitiveParameterValue,
    Identifiable<ConfigAgentJobKey>
{


    public enum JobStatus {
        Pending(0, "pending"),
        
        Success(1, "success"),
        
        Failure(2, "failure")
        ;
    
        private static final java.util.Map<java.lang.Integer, JobStatus> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, JobStatus> b = com.google.common.collect.ImmutableMap.builder();
            for (JobStatus enumItem : JobStatus.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private JobStatus(int value, java.lang.String name) {
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
         * @return corresponding JobStatus item
         */
        public static JobStatus forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }

    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsr",
        "2017-02-08", "config-agent-job").intern();

    /**
     * config agent job Identifier for the NS.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>jobId</code>, or <code>null</code> if not present
     */
    BigInteger getJobId();
    
    /**
     * Config agent job name
     *
     *
     *
     * @return <code>java.lang.String</code> <code>jobName</code>, or <code>null</code> if not present
     */
    java.lang.String getJobName();
    
    /**
     * Job status to be set based on each VNF primitive execution,pending - if at least
     * one VNF is in pending state and remaining VNFs are in success state.Success - if
     * all VNF executions are in success statefailure - if one of the VNF executions is
     * failure
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.ConfigAgentJob.JobStatus</code> <code>jobStatus</code>, or <code>null</code> if not present
     */
    JobStatus getJobStatus();
    
    /**
     * The primitive is triggered from NS or VNF level
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.TriggerType</code> <code>triggeredBy</code>, or <code>null</code> if not present
     */
    TriggerType getTriggeredBy();
    
    /**
     * Creation timestamp of this Config Agent Job.The timestamp is expressed as 
     * secondssince unix epoch - 1970-01-01T00:00:00Z
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>createTime</code>, or <code>null</code> if not present
     */
    java.lang.Long getCreateTime();
    
    /**
     * Config agent job status details, in case of errors
     *
     *
     *
     * @return <code>java.lang.String</code> <code>jobStatusDetails</code>, or <code>null</code> if not present
     */
    java.lang.String getJobStatusDetails();
    
    /**
     * List of NS Primitive parameter groups
     *
     *
     *
     * @return <code>java.util.List</code> <code>parameterGroup</code>, or <code>null</code> if not present
     */
    List<ParameterGroup> getParameterGroup();
    
    /**
     * @return <code>java.util.List</code> <code>vnfr</code>, or <code>null</code> if not present
     */
    List<Vnfr> getVnfr();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.ConfigAgentJobKey</code> <code>key</code>, or <code>null</code> if not present
     */
    ConfigAgentJobKey getKey();

}

