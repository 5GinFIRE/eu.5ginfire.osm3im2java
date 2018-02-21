package ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.scaling.group.record;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ConfigStates;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.ScalingGroupRecord;

import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * Reference to scaling group instance record
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list instance {
 *     key "instance-id";
 *     leaf instance-id {
 *         type uint16;
 *     }
 *     leaf is-default {
 *         type boolean;
 *     }
 *     leaf op-status {
 *         type enumeration;
 *     }
 *     leaf config-status {
 *         type config-states;
 *     }
 *     leaf error-msg {
 *         type string;
 *     }
 *     leaf create-time {
 *         type uint32;
 *     }
 *     leaf-list vnfrs {
 *         type leafref;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/project/(urn:ietf:params:xml:ns:yang:nfvo:nsr?revision=2017-02-08)ns-instance-opdata/nsr/scaling-group-record/instance</i>
 * 
 * <p>To create instances of this class use {@link InstanceBuilder}.
 * @see InstanceBuilder
 * @see InstanceKey
 *
 */
public interface Instance
    extends
    ChildOf<ScalingGroupRecord>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.scaling.group.record.Instance>,
    Identifiable<InstanceKey>
{


    public enum OpStatus {
        Init(0, "init"),
        
        VnfInitPhase(1, "vnf-init-phase"),
        
        Running(2, "running"),
        
        Terminate(3, "terminate"),
        
        VnfTerminatePhase(4, "vnf-terminate-phase"),
        
        Terminated(5, "terminated"),
        
        Failed(6, "failed")
        ;
    
        private static final java.util.Map<java.lang.Integer, OpStatus> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, OpStatus> b = com.google.common.collect.ImmutableMap.builder();
            for (OpStatus enumItem : OpStatus.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private OpStatus(int value, java.lang.String name) {
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
         * @return corresponding OpStatus item
         */
        public static OpStatus forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }

    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsr",
        "2017-02-08", "instance").intern();

    /**
     * Scaling group instance id
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>instanceId</code>, or <code>null</code> if not present
     */
    java.lang.Integer getInstanceId();
    
    /**
     * Flag indicating whether this instance was part ofdefault scaling group (and thus
     * undeletable)
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>isDefault</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isIsDefault();
    
    /**
     * The operational status of the NS instanceinit : The scaling group has just 
     * started.vnf-init-phase : The VNFs in the scaling group are being 
     * instantiated.running : The scaling group is in running state.terminate : The 
     * scaling group is being terminated.vnf-terminate-phase : The VNFs in the scaling 
     * group are being terminated.terminated : The scaling group is in the terminated 
     * state.failed : The scaling group instantiation failed.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.scaling.group.record.Instance.OpStatus</code> <code>opStatus</code>, or <code>null</code> if not present
     */
    OpStatus getOpStatus();
    
    /**
     * The configuration status of the scaling group instanceconfiguring : At least one
     * of the VNFs in this scaling group instance is in configuring stateconfigured : 
     * All the VNFs in this scaling group instance are configured or config-not-needed 
     * statefailed : Configuring this scaling group instance failed
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ConfigStates</code> <code>configStatus</code>, or <code>null</code> if not present
     */
    ConfigStates getConfigStatus();
    
    /**
     * Reason for failure in configuration of this scaling instance
     *
     *
     *
     * @return <code>java.lang.String</code> <code>errorMsg</code>, or <code>null</code> if not present
     */
    java.lang.String getErrorMsg();
    
    /**
     * Creation timestamp of this scaling group record.The timestamp is expressed as 
     * secondssince unix epoch - 1970-01-01T00:00:00Z
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>createTime</code>, or <code>null</code> if not present
     */
    java.lang.Long getCreateTime();
    
    /**
     * Reference to VNFR within the scale instance
     *
     *
     *
     * @return <code>java.util.List</code> <code>vnfrs</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getVnfrs();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.scaling.group.record.InstanceKey</code> <code>key</code>, or <code>null</code> if not present
     */
    InstanceKey getKey();

}

