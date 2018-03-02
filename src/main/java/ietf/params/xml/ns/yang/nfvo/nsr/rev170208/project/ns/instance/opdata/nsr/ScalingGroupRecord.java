package ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.Nsr;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.scaling.group.record.Instance;

import java.util.List;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of scaling group records
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list scaling-group-record {
 *     key "scaling-group-name-ref";
 *     leaf scaling-group-name-ref {
 *         type leafref;
 *     }
 *     list instance {
 *         key "instance-id";
 *         leaf instance-id {
 *             type uint16;
 *         }
 *         leaf is-default {
 *             type boolean;
 *         }
 *         leaf op-status {
 *             type enumeration;
 *         }
 *         leaf config-status {
 *             type config-states;
 *         }
 *         leaf error-msg {
 *             type string;
 *         }
 *         leaf create-time {
 *             type uint32;
 *         }
 *         leaf-list vnfrs {
 *             type leafref;
 *         }
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/project/(urn:ietf:params:xml:ns:yang:nfvo:nsr?revision=2017-02-08)ns-instance-opdata/nsr/scaling-group-record</i>
 * 
 * <p>To create instances of this class use {@link ScalingGroupRecordBuilder}.
 * @see ScalingGroupRecordBuilder
 * @see ScalingGroupRecordKey
 *
 */
public interface ScalingGroupRecord
    extends
    ChildOf<Nsr>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.ScalingGroupRecord>,
    Identifiable<ScalingGroupRecordKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsr",
        "2017-02-08", "scaling-group-record").intern();

    /**
     * name of the scaling group
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>scalingGroupNameRef</code>, or <code>null</code> if not present
     */
    java.lang.Object getScalingGroupNameRef();
    
    /**
     * Reference to scaling group instance record
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
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.ScalingGroupRecordKey</code> <code>key</code>, or <code>null</code> if not present
     */
    ScalingGroupRecordKey getKey();

}

