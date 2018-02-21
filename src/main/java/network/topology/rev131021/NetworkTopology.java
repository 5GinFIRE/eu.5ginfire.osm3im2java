package network.topology.rev131021;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import network.topology.rev131021.network.topology.Topology;

import java.util.List;

import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>odl-network-topology</b>
 * <pre>
 * container network-topology {
 *     list topology {
 *         key "topology-id";
 *         leaf topology-id {
 *             type topology-id;
 *         }
 *         leaf server-provided {
 *             type boolean;
 *         }
 *         container topology-types {
 *         }
 *         list underlay-topology {
 *             key "topology-ref";
 *             leaf topology-ref {
 *                 type topology-ref;
 *             }
 *         }
 *         list node {
 *             key "node-id";
 *             leaf node-id {
 *                 type node-id;
 *             }
 *             list supporting-node {
 *                 key "topology-ref" "node-ref";
 *                 leaf topology-ref {
 *                     type topology-ref;
 *                 }
 *                 leaf node-ref {
 *                     type node-ref;
 *                 }
 *             }
 *             list termination-point {
 *                 key "tp-id";
 *                 leaf tp-id {
 *                     type tp-id;
 *                 }
 *                 leaf-list tp-ref {
 *                     type tp-ref;
 *                 }
 *                 uses tp-attributes;
 *             }
 *             uses node-attributes;
 *         }
 *         list link {
 *             key "link-id";
 *             leaf link-id {
 *                 type link-id;
 *             }
 *             container source {
 *                 leaf source-node {
 *                     type node-ref;
 *                 }
 *                 leaf source-tp {
 *                     type tp-ref;
 *                 }
 *             }
 *             container destination {
 *                 leaf dest-node {
 *                     type node-ref;
 *                 }
 *                 leaf dest-tp {
 *                     type tp-ref;
 *                 }
 *             }
 *             list supporting-link {
 *                 key "link-ref";
 *                 leaf link-ref {
 *                     type link-ref;
 *                 }
 *             }
 *             uses link-attributes;
 *         }
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>odl-network-topology/network-topology</i>
 * 
 * <p>To create instances of this class use {@link NetworkTopologyBuilder}.
 * @see NetworkTopologyBuilder
 *
 */
public interface NetworkTopology
    extends
    ChildOf<OdlNetworkTopologyData>,
    Augmentable<network.topology.rev131021.NetworkTopology>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:TBD:params:xml:ns:yang:network-topology",
        "2013-10-21", "network-topology").intern();

    /**
     * This is the model of an abstract topology.A topology contains nodes and 
     * links.Each topology MUST be identified byunique topology-id for reason that a 
     * network could contain manytopologies.
     *
     *
     *
     * @return <code>java.util.List</code> <code>topology</code>, or <code>null</code> if not present
     */
    List<Topology> getTopology();

}

