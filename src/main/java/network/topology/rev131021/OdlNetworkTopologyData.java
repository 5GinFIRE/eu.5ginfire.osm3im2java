package network.topology.rev131021;
import org.opendaylight.yangtools.yang.binding.DataRoot;

/**
 * This module defines a model for the topology of a network.Key design decisions 
 * are as follows:A topology consists of a set of nodes and links.Links are 
 * point-to-point and unidirectional.Bidirectional connections need to be 
 * represented throughtwo separate links.Multipoint connections, broadcast domains 
 * etc can be representedthrough a hierarchy of nodes, then connecting nodes 
 * atupper layers of the hierarchy.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>odl-network-topology</b>
 * <pre>
 * module odl-network-topology {
 *     yang-version 1;
 *     namespace "urn:TBD:params:xml:ns:yang:network-topology";
 *     prefix "nt";
 * 
 *     import ietf-inet-types { prefix "inet"; }
 *     revision 2013-10-21 {
 *         description "This module defines a model for the topology of a network.Key design decisions 
 *                     are as follows:A topology consists of a set of nodes and links.Links are 
 *                     point-to-point and unidirectional.Bidirectional connections need to be 
 *                     represented throughtwo separate links.Multipoint connections, broadcast domains 
 *                     etc can be representedthrough a hierarchy of nodes, then connecting nodes 
 *                     atupper layers of the hierarchy.
 *         ";
 *     }
 * 
 *     container network-topology {
 *         list topology {
 *             key "topology-id";
 *             leaf topology-id {
 *                 type topology-id;
 *             }
 *             leaf server-provided {
 *                 type boolean;
 *             }
 *             container topology-types {
 *             }
 *             list underlay-topology {
 *                 key "topology-ref";
 *                 leaf topology-ref {
 *                     type topology-ref;
 *                 }
 *             }
 *             list node {
 *                 key "node-id";
 *                 leaf node-id {
 *                     type node-id;
 *                 }
 *                 list supporting-node {
 *                     key "topology-ref" "node-ref";
 *                     leaf topology-ref {
 *                         type topology-ref;
 *                     }
 *                     leaf node-ref {
 *                         type node-ref;
 *                     }
 *                 }
 *                 list termination-point {
 *                     key "tp-id";
 *                     leaf tp-id {
 *                         type tp-id;
 *                     }
 *                     leaf-list tp-ref {
 *                         type tp-ref;
 *                     }
 *                     uses tp-attributes;
 *                 }
 *                 uses node-attributes;
 *             }
 *             list link {
 *                 key "link-id";
 *                 leaf link-id {
 *                     type link-id;
 *                 }
 *                 container source {
 *                     leaf source-node {
 *                         type node-ref;
 *                     }
 *                     leaf source-tp {
 *                         type tp-ref;
 *                     }
 *                 }
 *                 container destination {
 *                     leaf dest-node {
 *                         type node-ref;
 *                     }
 *                     leaf dest-tp {
 *                         type tp-ref;
 *                     }
 *                 }
 *                 list supporting-link {
 *                     key "link-ref";
 *                     leaf link-ref {
 *                         type link-ref;
 *                     }
 *                 }
 *                 uses link-attributes;
 *             }
 *         }
 *     }
 * 
 *     grouping link-attributes {
 *         leaf link-id {
 *             type link-id;
 *         }
 *         container source {
 *             leaf source-node {
 *                 type node-ref;
 *             }
 *             leaf source-tp {
 *                 type tp-ref;
 *             }
 *         }
 *         container destination {
 *             leaf dest-node {
 *                 type node-ref;
 *             }
 *             leaf dest-tp {
 *                 type tp-ref;
 *             }
 *         }
 *         list supporting-link {
 *             key "link-ref";
 *             leaf link-ref {
 *                 type link-ref;
 *             }
 *         }
 *     }
 *     grouping tp-attributes {
 *         leaf tp-id {
 *             type tp-id;
 *         }
 *         leaf-list tp-ref {
 *             type tp-ref;
 *         }
 *     }
 *     grouping node-attributes {
 *         leaf node-id {
 *             type node-id;
 *         }
 *         list supporting-node {
 *             key "topology-ref" "node-ref";
 *             leaf topology-ref {
 *                 type topology-ref;
 *             }
 *             leaf node-ref {
 *                 type node-ref;
 *             }
 *         }
 *     }
 * }
 * </pre>
 *
 */
public interface OdlNetworkTopologyData
    extends
    DataRoot
{




    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.NetworkTopology</code> <code>networkTopology</code>, or <code>null</code> if not present
     */
    NetworkTopology getNetworkTopology();

}

