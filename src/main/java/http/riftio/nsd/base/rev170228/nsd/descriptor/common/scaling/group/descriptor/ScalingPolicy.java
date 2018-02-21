package http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import http.riftio.nsd.base.rev170228.ScalingCriteriaOperation;
import http.riftio.nsd.base.rev170228.ScalingPolicyType;
import http.riftio.nsd.base.rev170228.nsd.descriptor.common.ScalingGroupDescriptor;
import http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.scaling.policy.ScalingCriteria;

import java.util.List;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd-base</b>
 * <pre>
 * list scaling-policy {
 *     key "name";
 *     leaf name {
 *         type string;
 *     }
 *     leaf scaling-type {
 *         type scaling-policy-type;
 *     }
 *     leaf enabled {
 *         type enabled;
 *     }
 *     leaf scale-in-operation-type {
 *         type scale-in-operation-type;
 *     }
 *     leaf scale-out-operation-type {
 *         type scale-out-operation-type;
 *     }
 *     leaf threshold-time {
 *         type uint32;
 *     }
 *     leaf cooldown-time {
 *         type uint32;
 *     }
 *     list scaling-criteria {
 *         key "name";
 *         leaf name {
 *             type string;
 *         }
 *         leaf scale-in-threshold {
 *             type uint64;
 *         }
 *         leaf scale-out-threshold {
 *             type uint64;
 *         }
 *         leaf ns-monitoring-param-ref {
 *             type string;
 *         }
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd-base/nsd-descriptor-common/scaling-group-descriptor/scaling-policy</i>
 * 
 * <p>To create instances of this class use {@link ScalingPolicyBuilder}.
 * @see ScalingPolicyBuilder
 * @see ScalingPolicyKey
 *
 */
public interface ScalingPolicy
    extends
    ChildOf<ScalingGroupDescriptor>,
    Augmentable<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.ScalingPolicy>,
    Identifiable<ScalingPolicyKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("http://riftio.com/ns/riftware-1.0/nsd-base",
        "2017-02-28", "scaling-policy").intern();

    /**
     * Name of the scaling policy
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    java.lang.String getName();
    
    /**
     * Type of scaling
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.nsd.base.rev170228.ScalingPolicyType</code> <code>scalingType</code>, or <code>null</code> if not present
     */
    ScalingPolicyType getScalingType();
    
    /**
     * Specifies if the scaling policy can be applied
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>enabled</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isEnabled();
    
    /**
     * Operation to be applied to check between scaling criterias tocheck if the scale 
     * in threshold condition has been met.Defaults to AND
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.nsd.base.rev170228.ScalingCriteriaOperation</code> <code>scaleInOperationType</code>, or <code>null</code> if not present
     */
    ScalingCriteriaOperation getScaleInOperationType();
    
    /**
     * Operation to be applied to check between scaling criterias tocheck if the scale 
     * out threshold condition has been met.Defauls to OR
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.nsd.base.rev170228.ScalingCriteriaOperation</code> <code>scaleOutOperationType</code>, or <code>null</code> if not present
     */
    ScalingCriteriaOperation getScaleOutOperationType();
    
    /**
     * The duration for which the criteria must hold true
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>thresholdTime</code>, or <code>null</code> if not present
     */
    java.lang.Long getThresholdTime();
    
    /**
     * The duration after a scaling-in/scaling-out action has beentriggered, for which 
     * there will be no further optional
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>cooldownTime</code>, or <code>null</code> if not present
     */
    java.lang.Long getCooldownTime();
    
    /**
     * list of conditions to be met for generating scaling requests
     *
     *
     *
     * @return <code>java.util.List</code> <code>scalingCriteria</code>, or <code>null</code> if not present
     */
    List<ScalingCriteria> getScalingCriteria();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.ScalingPolicyKey</code> <code>key</code>, or <code>null</code> if not present
     */
    ScalingPolicyKey getKey();

}

