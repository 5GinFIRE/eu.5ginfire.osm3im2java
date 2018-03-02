package ietf.params.xml.ns.yang.ietf.network.rev150608;
import org.opendaylight.yangtools.yang.binding.DataRoot;
import java.util.List;

/**
 * This module defines a common base model for a collectionof nodes in a network. 
 * Node definitions s are further usedin network topologies and inventories.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-network</b>
 * <pre>
 * module ietf-network {
 *     yang-version 1;
 *     namespace "urn:ietf:params:xml:ns:yang:ietf-network";
 *     prefix "nd";
 * 
 *     import ietf-inet-types { prefix "inet"; }
 *     revision 2015-06-08 {
 *         description "This module defines a common base model for a collectionof nodes in a network. 
 *                     Node definitions s are further usedin network topologies and inventories.
 *         ";
 *     }
 * 
 *     list network {
 *         key "network-id";
 *         container network-types {
 *             container l2-network {
 *             }
 *             augment \(urn:ietf:params:xml:ns:yang:ietf-network)network\(urn:ietf:params:xml:ns:yang:ietf-network)network-types {
 *                 when "Optional.empty";
 *                 description
 *                     "Introduce new network type for L2 topology";
 *                 status CURRENT;
 *                 container l2-network {
 *                 }
 *                 uses l2-network-type;
 *             }
 *         }
 *         leaf network-id {
 *             type network-id;
 *         }
 *         leaf server-provided {
 *             type boolean;
 *         }
 *         list supporting-network {
 *             key "network-ref";
 *             leaf network-ref {
 *                 type leafref;
 *             }
 *         }
 *         list node {
 *             key "node-id";
 *             leaf node-id {
 *                 type node-id;
 *             }
 *             list supporting-node {
 *                 key "network-ref" "node-ref";
 *                 leaf network-ref {
 *                     type leafref;
 *                 }
 *                 leaf node-ref {
 *                     type leafref;
 *                 }
 *             }
 *             list termination-point {
 *                 key "tp-id";
 *                 leaf tp-id {
 *                     type tp-id;
 *                 }
 *                 list supporting-termination-point {
 *                     key "network-ref" "node-ref" "tp-ref";
 *                     leaf network-ref {
 *                         type leafref;
 *                     }
 *                     leaf node-ref {
 *                         type leafref;
 *                     }
 *                     leaf tp-ref {
 *                         type leafref;
 *                     }
 *                 }
 *                 container l2-termination-point-attributes {
 *                     leaf description {
 *                         type string;
 *                     }
 *                     leaf maximum-frame-size {
 *                         type uint32;
 *                     }
 *                     choice l2-termination-point-type {
 *                         case ethernet {
 *                             leaf mac-address {
 *                                 type mac-address;
 *                             }
 *                             leaf eth-encapsulation {
 *                                 type identityref;
 *                             }
 *                             leaf port-vlan-id {
 *                                 type vlan;
 *                             }
 *                             list vlan-id-name {
 *                                 key "vlan-id";
 *                                 leaf vlan-id {
 *                                     type vlan;
 *                                 }
 *                                 leaf vlan-name {
 *                                     type string;
 *                                 }
 *                             }
 *                         }
 *                         case legacy {
 *                             leaf encapsulation {
 *                                 type identityref;
 *                             }
 *                         }
 *                     }
 *                     leaf tp-state {
 *                         type enumeration;
 *                     }
 *                 }
 *                 augment \(urn:ietf:params:xml:ns:yang:ietf-network)network\(urn:ietf:params:xml:ns:yang:ietf-network)node\(urn:ietf:params:xml:ns:yang:ietf-network-topology)termination-point {
 *                     when "Optional.empty";
 *                     description
 *                         "Augment L2 topology termination point configuration";
 *                     status CURRENT;
 *                     container l2-termination-point-attributes {
 *                         leaf description {
 *                             type string;
 *                         }
 *                         leaf maximum-frame-size {
 *                             type uint32;
 *                         }
 *                         choice l2-termination-point-type {
 *                             case ethernet {
 *                                 leaf mac-address {
 *                                     type mac-address;
 *                                 }
 *                                 leaf eth-encapsulation {
 *                                     type identityref;
 *                                 }
 *                                 leaf port-vlan-id {
 *                                     type vlan;
 *                                 }
 *                                 list vlan-id-name {
 *                                     key "vlan-id";
 *                                     leaf vlan-id {
 *                                         type vlan;
 *                                     }
 *                                     leaf vlan-name {
 *                                         type string;
 *                                     }
 *                                 }
 *                             }
 *                             case legacy {
 *                                 leaf encapsulation {
 *                                     type identityref;
 *                                 }
 *                             }
 *                         }
 *                         leaf tp-state {
 *                             type enumeration;
 *                         }
 *                     }
 *                     uses l2-termination-point-attributes;
 *                 }
 *             }
 *             container l2-node-attributes {
 *                 leaf name {
 *                     type string;
 *                 }
 *                 leaf description {
 *                     type string;
 *                 }
 *                 leaf-list management-address {
 *                     type ip-address;
 *                 }
 *                 leaf management-vid {
 *                     type vlan;
 *                 }
 *                 leaf-list nick-name {
 *                     type trill-nickname;
 *                 }
 *                 leaf-list flag {
 *                     type flag-type;
 *                 }
 *             }
 *             augment \(urn:ietf:params:xml:ns:yang:ietf-network)network\(urn:ietf:params:xml:ns:yang:ietf-network)node {
 *                 when "Optional.empty";
 *                 description
 *                     "Augment termination points which terminate links.
 *                     Termination points can ultimately be mapped to interfaces.";
 *                 status CURRENT;
 *                 list termination-point {
 *                     key "tp-id";
 *                     leaf tp-id {
 *                         type tp-id;
 *                     }
 *                     list supporting-termination-point {
 *                         key "network-ref" "node-ref" "tp-ref";
 *                         leaf network-ref {
 *                             type leafref;
 *                         }
 *                         leaf node-ref {
 *                             type leafref;
 *                         }
 *                         leaf tp-ref {
 *                             type leafref;
 *                         }
 *                     }
 *                 }
 *             }
 *             augment \(urn:ietf:params:xml:ns:yang:ietf-network)network\(urn:ietf:params:xml:ns:yang:ietf-network)node {
 *                 when "Optional.empty";
 *                 description
 *                     "Configuration parameters for L2 at the node
 *                     level";
 *                 status CURRENT;
 *                 container l2-node-attributes {
 *                     leaf name {
 *                         type string;
 *                     }
 *                     leaf description {
 *                         type string;
 *                     }
 *                     leaf-list management-address {
 *                         type ip-address;
 *                     }
 *                     leaf management-vid {
 *                         type vlan;
 *                     }
 *                     leaf-list nick-name {
 *                         type trill-nickname;
 *                     }
 *                     leaf-list flag {
 *                         type flag-type;
 *                     }
 *                 }
 *                 uses l2-node-attributes;
 *             }
 *         }
 *         list link {
 *             key "link-id";
 *             container source {
 *                 leaf source-node {
 *                     type leafref;
 *                 }
 *                 leaf source-tp {
 *                     type leafref;
 *                 }
 *             }
 *             container destination {
 *                 leaf dest-node {
 *                     type leafref;
 *                 }
 *                 leaf dest-tp {
 *                     type leafref;
 *                 }
 *             }
 *             leaf link-id {
 *                 type link-id;
 *             }
 *             list supporting-link {
 *                 key "network-ref" "link-ref";
 *                 leaf network-ref {
 *                     type leafref;
 *                 }
 *                 leaf link-ref {
 *                     type leafref;
 *                 }
 *             }
 *             container l2-link-attributes {
 *                 leaf name {
 *                     type string;
 *                 }
 *                 leaf-list flag {
 *                     type flag-type;
 *                 }
 *                 leaf rate {
 *                     type decimal64;
 *                 }
 *                 leaf delay {
 *                     type uint32;
 *                 }
 *                 leaf-list srlg {
 *                     type uint32;
 *                 }
 *             }
 *             augment \(urn:ietf:params:xml:ns:yang:ietf-network)network\(urn:ietf:params:xml:ns:yang:ietf-network-topology)link {
 *                 when "Optional.empty";
 *                 description
 *                     "Augment L2 topology link information";
 *                 status CURRENT;
 *                 container l2-link-attributes {
 *                     leaf name {
 *                         type string;
 *                     }
 *                     leaf-list flag {
 *                         type flag-type;
 *                     }
 *                     leaf rate {
 *                         type decimal64;
 *                     }
 *                     leaf delay {
 *                         type uint32;
 *                     }
 *                     leaf-list srlg {
 *                         type uint32;
 *                     }
 *                 }
 *                 uses l2-link-attributes;
 *             }
 *         }
 *         container l2-network-attributes {
 *             leaf name {
 *                 type string;
 *             }
 *             leaf-list flag {
 *                 type flag-type;
 *             }
 *         }
 *         augment \(urn:ietf:params:xml:ns:yang:ietf-network)network {
 *             when "Optional.empty";
 *             description
 *                 "Add links to the network model.";
 *             status CURRENT;
 *             list link {
 *                 key "link-id";
 *                 container source {
 *                     leaf source-node {
 *                         type leafref;
 *                     }
 *                     leaf source-tp {
 *                         type leafref;
 *                     }
 *                 }
 *                 container destination {
 *                     leaf dest-node {
 *                         type leafref;
 *                     }
 *                     leaf dest-tp {
 *                         type leafref;
 *                     }
 *                 }
 *                 leaf link-id {
 *                     type link-id;
 *                 }
 *                 list supporting-link {
 *                     key "network-ref" "link-ref";
 *                     leaf network-ref {
 *                         type leafref;
 *                     }
 *                     leaf link-ref {
 *                         type leafref;
 *                     }
 *                 }
 *             }
 *         }
 *         augment \(urn:ietf:params:xml:ns:yang:ietf-network)network {
 *             when "Optional.empty";
 *             description
 *                 "Configuration parameters for the L2 network
 *                 as a whole";
 *             status CURRENT;
 *             container l2-network-attributes {
 *                 leaf name {
 *                     type string;
 *                 }
 *                 leaf-list flag {
 *                     type flag-type;
 *                 }
 *             }
 *             uses l2-network-attributes;
 *         }
 *     }
 * 
 *     grouping node-ref {
 *         leaf node-ref {
 *             type leafref;
 *         }
 *         leaf network-ref {
 *             type leafref;
 *         }
 *     }
 *     grouping network-ref {
 *         leaf network-ref {
 *             type leafref;
 *         }
 *     }
 * }
 * </pre>
 *
 */
public interface IetfNetworkData
    extends
    DataRoot
{




    /**
     * Describes a network.A network typically contains an inventory of 
     * nodes,topological information (augmented throughnetwork-topology model), as well
     * as layeringinformation.
     *
     *
     *
     * @return <code>java.util.List</code> <code>network</code>, or <code>null</code> if not present
     */
    List<Network> getNetwork();

}

