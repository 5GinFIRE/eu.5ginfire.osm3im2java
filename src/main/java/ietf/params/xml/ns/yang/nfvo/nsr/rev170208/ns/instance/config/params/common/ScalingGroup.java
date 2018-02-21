package ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.NsInstanceConfigParamsCommon;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.scaling.group.Instance;

import java.util.List;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of ns scaling group instances
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list scaling-group {
 *     key "scaling-group-name-ref";
 *     leaf scaling-group-name-ref {
 *         type string;
 *     }
 *     list instance {
 *         key "id";
 *         leaf id {
 *             type uint16;
 *         }
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/ns-instance-config-params-common/scaling-group</i>
 * 
 * <p>To create instances of this class use {@link ScalingGroupBuilder}.
 * @see ScalingGroupBuilder
 * @see ScalingGroupKey
 *
 */
public interface ScalingGroup
    extends
    ChildOf<NsInstanceConfigParamsCommon>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.ScalingGroup>,
    Identifiable<ScalingGroupKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsr",
        "2017-02-08", "scaling-group").intern();

    /**
     * name of the scaling groupleafref path ../nsd/scaling-group-descriptor/name
     *
     *
     *
     * @return <code>java.lang.String</code> <code>scalingGroupNameRef</code>, or <code>null</code> if not present
     */
    java.lang.String getScalingGroupNameRef();
    
    /**
     * The instance of the scaling group
     *
     *
     *
     * @return <code>java.util.List</code> <code>instance</code>, or <code>null</code> if not present
     */
    List<Instance> getInstance();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.ScalingGroupKey</code> <code>key</code>, or <code>null</code> if not present
     */
    ScalingGroupKey getKey();

}

