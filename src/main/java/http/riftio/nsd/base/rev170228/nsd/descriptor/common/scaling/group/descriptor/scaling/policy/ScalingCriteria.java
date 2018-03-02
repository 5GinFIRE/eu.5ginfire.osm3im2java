package http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.scaling.policy;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.ScalingPolicy;

import java.math.BigInteger;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * list of conditions to be met for generating scaling requests
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd-base</b>
 * <pre>
 * list scaling-criteria {
 *     key "name";
 *     leaf name {
 *         type string;
 *     }
 *     leaf scale-in-threshold {
 *         type uint64;
 *     }
 *     leaf scale-out-threshold {
 *         type uint64;
 *     }
 *     leaf ns-monitoring-param-ref {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd-base/nsd-descriptor-common/scaling-group-descriptor/scaling-policy/scaling-criteria</i>
 * 
 * <p>To create instances of this class use {@link ScalingCriteriaBuilder}.
 * @see ScalingCriteriaBuilder
 * @see ScalingCriteriaKey
 *
 */
public interface ScalingCriteria
    extends
    ChildOf<ScalingPolicy>,
    Augmentable<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.scaling.policy.ScalingCriteria>,
    Identifiable<ScalingCriteriaKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("http://riftio.com/ns/riftware-1.0/nsd-base",
        "2017-02-28", "scaling-criteria").intern();

    /**
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    java.lang.String getName();
    
    /**
     * Value below which scale-in requests are generated
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>scaleInThreshold</code>, or <code>null</code> if not present
     */
    BigInteger getScaleInThreshold();
    
    /**
     * Value above which scale-out requests are generated
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>scaleOutThreshold</code>, or <code>null</code> if not present
     */
    BigInteger getScaleOutThreshold();
    
    /**
     * Reference to the NS level monitoring parameterthat is aggregated
     *
     *
     *
     * @return <code>java.lang.String</code> <code>nsMonitoringParamRef</code>, or <code>null</code> if not present
     */
    java.lang.String getNsMonitoringParamRef();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.scaling.policy.ScalingCriteriaKey</code> <code>key</code>, or <code>null</code> if not present
     */
    ScalingCriteriaKey getKey();

}

