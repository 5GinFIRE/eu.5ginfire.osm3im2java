package ietf.params.xml.ns.yang.ietf.l2.topology.rev150623;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Notification;

/**
 * Notification event for L2 link
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-l2-topology</b>
 * <pre>
 * notification l2-link-event {
 *     description
 *         "Notification event for L2 link";
 *     leaf event-type {
 *         type l2-network-event-type;
 *     }
 *     leaf link-ref {
 *         type leafref;
 *     }
 *     leaf network-ref {
 *         type leafref;
 *     }
 *     container l2-network {
 *     }
 *     container l2-link-attributes {
 *         leaf name {
 *             type string;
 *         }
 *         leaf-list flag {
 *             type flag-type;
 *         }
 *         leaf rate {
 *             type decimal64;
 *         }
 *         leaf delay {
 *             type uint32;
 *         }
 *         leaf-list srlg {
 *             type uint32;
 *         }
 *     }
 *     uses l2-link-attributes;
 *     uses l2-network-type;
 *     uses link-ref;
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-l2-topology/l2-link-event</i>
 * 
 * <p>To create instances of this class use {@link L2LinkEventBuilder}.
 * @see L2LinkEventBuilder
 *
 */
public interface L2LinkEvent
    extends
    DataObject,
    Augmentable<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2LinkEvent>,
    L2LinkAttributes,
    L2NetworkType,
    LinkRef,
    Notification
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:ietf-l2-topology",
        "2015-06-23", "l2-link-event").intern();

    /**
     * Event type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2NetworkEventType</code> <code>eventType</code>, or <code>null</code> if not present
     */
    L2NetworkEventType getEventType();

}

