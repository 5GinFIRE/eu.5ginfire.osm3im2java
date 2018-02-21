package ietf.params.xml.ns.yang.ietf.l2.topology.rev150623;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Notification;

/**
 * Notification event for L2 termination point
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-l2-topology</b>
 * <pre>
 * notification l2-termination-point-event {
 *     description
 *         "Notification event for L2 termination point";
 *     leaf event-type {
 *         type l2-network-event-type;
 *     }
 *     leaf tp-ref {
 *         type leafref;
 *     }
 *     leaf node-ref {
 *         type leafref;
 *     }
 *     leaf network-ref {
 *         type leafref;
 *     }
 *     container l2-network {
 *     }
 *     container l2-termination-point-attributes {
 *         leaf description {
 *             type string;
 *         }
 *         leaf maximum-frame-size {
 *             type uint32;
 *         }
 *         choice l2-termination-point-type {
 *             case ethernet {
 *                 leaf mac-address {
 *                     type mac-address;
 *                 }
 *                 leaf eth-encapsulation {
 *                     type identityref;
 *                 }
 *                 leaf port-vlan-id {
 *                     type vlan;
 *                 }
 *                 list vlan-id-name {
 *                     key "vlan-id";
 *                     leaf vlan-id {
 *                         type vlan;
 *                     }
 *                     leaf vlan-name {
 *                         type string;
 *                     }
 *                 }
 *             }
 *             case legacy {
 *                 leaf encapsulation {
 *                     type identityref;
 *                 }
 *             }
 *         }
 *         leaf tp-state {
 *             type enumeration;
 *         }
 *     }
 *     uses tp-ref;
 *     uses l2-network-type;
 *     uses l2-termination-point-attributes;
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-l2-topology/l2-termination-point-event</i>
 * 
 * <p>To create instances of this class use {@link L2TerminationPointEventBuilder}.
 * @see L2TerminationPointEventBuilder
 *
 */
public interface L2TerminationPointEvent
    extends
    DataObject,
    Augmentable<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2TerminationPointEvent>,
    TpRef,
    L2NetworkType,
    L2TerminationPointAttributes,
    Notification
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:ietf-l2-topology",
        "2015-06-23", "l2-termination-point-event").intern();

    /**
     * Event type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2NetworkEventType</code> <code>eventType</code>, or <code>null</code> if not present
     */
    L2NetworkEventType getEventType();

}

