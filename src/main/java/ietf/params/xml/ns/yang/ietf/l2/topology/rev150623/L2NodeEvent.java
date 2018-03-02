package ietf.params.xml.ns.yang.ietf.l2.topology.rev150623;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Notification;

/**
 * Notification event for L2 node
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-l2-topology</b>
 * <pre>
 * notification l2-node-event {
 *     description
 *         "Notification event for L2 node";
 *     leaf event-type {
 *         type l2-network-event-type;
 *     }
 *     leaf node-ref {
 *         type leafref;
 *     }
 *     leaf network-ref {
 *         type leafref;
 *     }
 *     container l2-network {
 *     }
 *     container l2-node-attributes {
 *         leaf name {
 *             type string;
 *         }
 *         leaf description {
 *             type string;
 *         }
 *         leaf-list management-address {
 *             type ip-address;
 *         }
 *         leaf management-vid {
 *             type vlan;
 *         }
 *         leaf-list nick-name {
 *             type trill-nickname;
 *         }
 *         leaf-list flag {
 *             type flag-type;
 *         }
 *     }
 *     uses node-ref;
 *     uses l2-network-type;
 *     uses l2-node-attributes;
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-l2-topology/l2-node-event</i>
 * 
 * <p>To create instances of this class use {@link L2NodeEventBuilder}.
 * @see L2NodeEventBuilder
 *
 */
public interface L2NodeEvent
    extends
    DataObject,
    Augmentable<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2NodeEvent>,
    NodeRef,
    L2NetworkType,
    L2NodeAttributes,
    Notification
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:ietf-l2-topology",
        "2015-06-23", "l2-node-event").intern();

    /**
     * Event type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2NetworkEventType</code> <code>eventType</code>, or <code>null</code> if not present
     */
    L2NetworkEventType getEventType();

}

