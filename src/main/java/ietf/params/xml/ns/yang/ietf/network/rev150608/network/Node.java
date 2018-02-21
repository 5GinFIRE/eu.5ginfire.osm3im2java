package ietf.params.xml.ns.yang.ietf.network.rev150608.network;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.ietf.network.rev150608.Network;
import ietf.params.xml.ns.yang.ietf.network.rev150608.NodeId;
import ietf.params.xml.ns.yang.ietf.network.rev150608.network.node.SupportingNode;

import java.util.List;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * The inventory of nodes of this network.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-network</b>
 * <pre>
 * list node {
 *     key "node-id";
 *     leaf node-id {
 *         type node-id;
 *     }
 *     list supporting-node {
 *         key "network-ref" "node-ref";
 *         leaf network-ref {
 *             type leafref;
 *         }
 *         leaf node-ref {
 *             type leafref;
 *         }
 *     }
 *     list termination-point {
 *         key "tp-id";
 *         leaf tp-id {
 *             type tp-id;
 *         }
 *         list supporting-termination-point {
 *             key "network-ref" "node-ref" "tp-ref";
 *             leaf network-ref {
 *                 type leafref;
 *             }
 *             leaf node-ref {
 *                 type leafref;
 *             }
 *             leaf tp-ref {
 *                 type leafref;
 *             }
 *         }
 *         container l2-termination-point-attributes {
 *             leaf description {
 *                 type string;
 *             }
 *             leaf maximum-frame-size {
 *                 type uint32;
 *             }
 *             choice l2-termination-point-type {
 *                 case ethernet {
 *                     leaf mac-address {
 *                         type mac-address;
 *                     }
 *                     leaf eth-encapsulation {
 *                         type identityref;
 *                     }
 *                     leaf port-vlan-id {
 *                         type vlan;
 *                     }
 *                     list vlan-id-name {
 *                         key "vlan-id";
 *                         leaf vlan-id {
 *                             type vlan;
 *                         }
 *                         leaf vlan-name {
 *                             type string;
 *                         }
 *                     }
 *                 }
 *                 case legacy {
 *                     leaf encapsulation {
 *                         type identityref;
 *                     }
 *                 }
 *             }
 *             leaf tp-state {
 *                 type enumeration;
 *             }
 *         }
 *         augment \(urn:ietf:params:xml:ns:yang:ietf-network)network\(urn:ietf:params:xml:ns:yang:ietf-network)node\(urn:ietf:params:xml:ns:yang:ietf-network-topology)termination-point {
 *             when "Optional.empty";
 *             description
 *                 "Augment L2 topology termination point configuration";
 *             status CURRENT;
 *             container l2-termination-point-attributes {
 *                 leaf description {
 *                     type string;
 *                 }
 *                 leaf maximum-frame-size {
 *                     type uint32;
 *                 }
 *                 choice l2-termination-point-type {
 *                     case ethernet {
 *                         leaf mac-address {
 *                             type mac-address;
 *                         }
 *                         leaf eth-encapsulation {
 *                             type identityref;
 *                         }
 *                         leaf port-vlan-id {
 *                             type vlan;
 *                         }
 *                         list vlan-id-name {
 *                             key "vlan-id";
 *                             leaf vlan-id {
 *                                 type vlan;
 *                             }
 *                             leaf vlan-name {
 *                                 type string;
 *                             }
 *                         }
 *                     }
 *                     case legacy {
 *                         leaf encapsulation {
 *                             type identityref;
 *                         }
 *                     }
 *                 }
 *                 leaf tp-state {
 *                     type enumeration;
 *                 }
 *             }
 *             uses l2-termination-point-attributes;
 *         }
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
 *     augment \(urn:ietf:params:xml:ns:yang:ietf-network)network\(urn:ietf:params:xml:ns:yang:ietf-network)node {
 *         when "Optional.empty";
 *         description
 *             "Augment termination points which terminate links.
 *             Termination points can ultimately be mapped to interfaces.";
 *         status CURRENT;
 *         list termination-point {
 *             key "tp-id";
 *             leaf tp-id {
 *                 type tp-id;
 *             }
 *             list supporting-termination-point {
 *                 key "network-ref" "node-ref" "tp-ref";
 *                 leaf network-ref {
 *                     type leafref;
 *                 }
 *                 leaf node-ref {
 *                     type leafref;
 *                 }
 *                 leaf tp-ref {
 *                     type leafref;
 *                 }
 *             }
 *         }
 *     }
 *     augment \(urn:ietf:params:xml:ns:yang:ietf-network)network\(urn:ietf:params:xml:ns:yang:ietf-network)node {
 *         when "Optional.empty";
 *         description
 *             "Configuration parameters for L2 at the node
 *             level";
 *         status CURRENT;
 *         container l2-node-attributes {
 *             leaf name {
 *                 type string;
 *             }
 *             leaf description {
 *                 type string;
 *             }
 *             leaf-list management-address {
 *                 type ip-address;
 *             }
 *             leaf management-vid {
 *                 type vlan;
 *             }
 *             leaf-list nick-name {
 *                 type trill-nickname;
 *             }
 *             leaf-list flag {
 *                 type flag-type;
 *             }
 *         }
 *         uses l2-node-attributes;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-network/network/node</i>
 * 
 * <p>To create instances of this class use {@link NodeBuilder}.
 * @see NodeBuilder
 * @see NodeKey
 *
 */
public interface Node
    extends
    ChildOf<Network>,
    Augmentable<ietf.params.xml.ns.yang.ietf.network.rev150608.network.Node>,
    Identifiable<NodeKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:ietf-network",
        "2015-06-08", "node").intern();

    /**
     * Identifies a node uniquely within the containingnetwork.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.network.rev150608.NodeId</code> <code>nodeId</code>, or <code>null</code> if not present
     */
    NodeId getNodeId();
    
    /**
     * Represents another node, in an underlay network, thatthis node is supported by. 
     * Used to represent layeringstructure.
     *
     *
     *
     * @return <code>java.util.List</code> <code>supportingNode</code>, or <code>null</code> if not present
     */
    List<SupportingNode> getSupportingNode();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.network.rev150608.network.NodeKey</code> <code>key</code>, or <code>null</code> if not present
     */
    NodeKey getKey();

}

