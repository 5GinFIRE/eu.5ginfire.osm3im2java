package network.topology.rev131021.network.topology.topology;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import network.topology.rev131021.NodeAttributes;
import network.topology.rev131021.network.topology.Topology;
import network.topology.rev131021.network.topology.topology.node.TerminationPoint;

import java.util.List;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * The list of network nodes defined for the topology.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>odl-network-topology</b>
 * <pre>
 * list node {
 *     key "node-id";
 *     leaf node-id {
 *         type node-id;
 *     }
 *     list supporting-node {
 *         key "topology-ref" "node-ref";
 *         leaf topology-ref {
 *             type topology-ref;
 *         }
 *         leaf node-ref {
 *             type node-ref;
 *         }
 *     }
 *     list termination-point {
 *         key "tp-id";
 *         leaf tp-id {
 *             type tp-id;
 *         }
 *         leaf-list tp-ref {
 *             type tp-ref;
 *         }
 *         uses tp-attributes;
 *     }
 *     uses node-attributes;
 * }
 * </pre>The schema path to identify an instance is
 * <i>odl-network-topology/network-topology/topology/node</i>
 * 
 * <p>To create instances of this class use {@link NodeBuilder}.
 * @see NodeBuilder
 * @see NodeKey
 *
 */
public interface Node
    extends
    ChildOf<Topology>,
    Augmentable<network.topology.rev131021.network.topology.topology.Node>,
    NodeAttributes,
    Identifiable<NodeKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:TBD:params:xml:ns:yang:network-topology",
        "2013-10-21", "node").intern();

    /**
     * A termination point can terminate a link.Depending on the type of topology, a 
     * termination point could,for example, refer to a port or an interface.
     *
     *
     *
     * @return <code>java.util.List</code> <code>terminationPoint</code>, or <code>null</code> if not present
     */
    List<TerminationPoint> getTerminationPoint();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.topology.NodeKey</code> <code>key</code>, or <code>null</code> if not present
     */
    NodeKey getKey();

}

