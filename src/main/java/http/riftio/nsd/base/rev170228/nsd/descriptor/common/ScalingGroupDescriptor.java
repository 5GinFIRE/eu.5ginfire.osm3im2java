package http.riftio.nsd.base.rev170228.nsd.descriptor.common;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import http.riftio.nsd.base.rev170228.NsdDescriptorCommon;
import http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.ScalingConfigAction;
import http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.ScalingPolicy;
import http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.VnfdMember;

import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * scaling group descriptor within this network service.The scaling group defines 
 * group of VNFs,and the ratio of VNFs in the network servicethat is used as 
 * for scaling action
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd-base</b>
 * <pre>
 * list scaling-group-descriptor {
 *     key "name";
 *     leaf name {
 *         type string;
 *     }
 *     list scaling-policy {
 *         key "name";
 *         leaf name {
 *             type string;
 *         }
 *         leaf scaling-type {
 *             type scaling-policy-type;
 *         }
 *         leaf enabled {
 *             type enabled;
 *         }
 *         leaf scale-in-operation-type {
 *             type scale-in-operation-type;
 *         }
 *         leaf scale-out-operation-type {
 *             type scale-out-operation-type;
 *         }
 *         leaf threshold-time {
 *             type uint32;
 *         }
 *         leaf cooldown-time {
 *             type uint32;
 *         }
 *         list scaling-criteria {
 *             key "name";
 *             leaf name {
 *                 type string;
 *             }
 *             leaf scale-in-threshold {
 *                 type uint64;
 *             }
 *             leaf scale-out-threshold {
 *                 type uint64;
 *             }
 *             leaf ns-monitoring-param-ref {
 *                 type string;
 *             }
 *         }
 *     }
 *     list vnfd-member {
 *         key "member-vnf-index-ref";
 *         leaf member-vnf-index-ref {
 *             type string;
 *         }
 *         leaf count {
 *             type count;
 *         }
 *     }
 *     leaf min-instance-count {
 *         type min-instance-count;
 *     }
 *     leaf max-instance-count {
 *         type max-instance-count;
 *     }
 *     list scaling-config-action {
 *         key "trigger";
 *         leaf trigger {
 *             type scaling-trigger;
 *         }
 *         leaf ns-service-primitive-name-ref {
 *             type string;
 *         }
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd-base/nsd-descriptor-common/scaling-group-descriptor</i>
 * 
 * <p>To create instances of this class use {@link ScalingGroupDescriptorBuilder}.
 * @see ScalingGroupDescriptorBuilder
 * @see ScalingGroupDescriptorKey
 *
 */
public interface ScalingGroupDescriptor
    extends
    ChildOf<NsdDescriptorCommon>,
    Augmentable<http.riftio.nsd.base.rev170228.nsd.descriptor.common.ScalingGroupDescriptor>,
    Identifiable<ScalingGroupDescriptorKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("http://riftio.com/ns/riftware-1.0/nsd-base",
        "2017-02-28", "scaling-group-descriptor").intern();

    /**
     * Name of this scaling group.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    java.lang.String getName();
    
    /**
     * @return <code>java.util.List</code> <code>scalingPolicy</code>, or <code>null</code> if not present
     */
    List<ScalingPolicy> getScalingPolicy();
    
    /**
     * List of VNFs in this scaling group
     *
     *
     *
     * @return <code>java.util.List</code> <code>vnfdMember</code>, or <code>null</code> if not present
     */
    List<VnfdMember> getVnfdMember();
    
    /**
     * Minimum instances of the scaling group which are allowed.These instances are 
     * created by default when the network serviceis instantiated.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>minInstanceCount</code>, or <code>null</code> if not present
     */
    java.lang.Long getMinInstanceCount();
    
    /**
     * Maximum instances of this scaling group that are allowedin a single network 
     * service. The network service scalingwill fail, when the number of service group 
     * instancesexceed the max-instance-count specified.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>maxInstanceCount</code>, or <code>null</code> if not present
     */
    java.lang.Long getMaxInstanceCount();
    
    /**
     * List of scaling config actions
     *
     *
     *
     * @return <code>java.util.List</code> <code>scalingConfigAction</code>, or <code>null</code> if not present
     */
    List<ScalingConfigAction> getScalingConfigAction();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.nsd.base.rev170228.nsd.descriptor.common.ScalingGroupDescriptorKey</code> <code>key</code>, or <code>null</code> if not present
     */
    ScalingGroupDescriptorKey getKey();

}

