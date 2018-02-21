package ietf.params.xml.ns.yang.ietf.l2.topology.rev150623;
import org.opendaylight.yangtools.yang.binding.NotificationListener;

/**
 * Interface for receiving the following YANG notifications defined in module <b>ietf-l2-topology</b>
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
 * </pre>
 *
 */
public interface IetfL2TopologyListener
    extends
    NotificationListener
{




    /**
     * Notification event for L2 node
     *
     */
    void onL2NodeEvent(L2NodeEvent notification);
    
    /**
     * Notification event for L2 termination point
     *
     */
    void onL2TerminationPointEvent(L2TerminationPointEvent notification);
    
    /**
     * Notification event for L2 link
     *
     */
    void onL2LinkEvent(L2LinkEvent notification);

}

