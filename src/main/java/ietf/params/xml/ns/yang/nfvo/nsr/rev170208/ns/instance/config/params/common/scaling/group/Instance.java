package ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.scaling.group;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.ScalingGroup;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * The instance of the scaling group
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list instance {
 *     key "id";
 *     leaf id {
 *         type uint16;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/ns-instance-config-params-common/scaling-group/instance</i>
 * 
 * <p>To create instances of this class use {@link InstanceBuilder}.
 * @see InstanceBuilder
 * @see InstanceKey
 *
 */
public interface Instance
    extends
    ChildOf<ScalingGroup>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.scaling.group.Instance>,
    Identifiable<InstanceKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsr",
        "2017-02-08", "instance").intern();

    /**
     * Scaling group instance uuid
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>id</code>, or <code>null</code> if not present
     */
    java.lang.Integer getId();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.scaling.group.InstanceKey</code> <code>key</code>, or <code>null</code> if not present
     */
    InstanceKey getKey();

}

