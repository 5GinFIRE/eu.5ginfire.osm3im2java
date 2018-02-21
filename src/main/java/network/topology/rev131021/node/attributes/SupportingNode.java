package network.topology.rev131021.node.attributes;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import network.topology.rev131021.NodeAttributes;
import network.topology.rev131021.NodeId;
import network.topology.rev131021.TopologyId;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * This list defines vertical layering information for nodes.It allows to capture 
 * for any given node, which node (or nodes)in the corresponding underlay topology 
 * it maps onto.A node can map to zero, one, or more nodes below it;accordingly 
 * there can be zero, one, or more elements in the list.If there are specific 
 * layering requirements, for examplespecific to a particular type of topology 
 * only allowsfor certain layering relationships, the choicebelow can be augmented 
 * with additional cases.A list has been chosen rather than a leaf-list in orderto 
 * provide room for augmentations, e.g. forstatistics or priorization information 
 * associated withsupporting nodes.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>odl-network-topology</b>
 * <pre>
 * list supporting-node {
 *     key "topology-ref" "node-ref";
 *     leaf topology-ref {
 *         type topology-ref;
 *     }
 *     leaf node-ref {
 *         type node-ref;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>odl-network-topology/node-attributes/supporting-node</i>
 * 
 * <p>To create instances of this class use {@link SupportingNodeBuilder}.
 * @see SupportingNodeBuilder
 * @see SupportingNodeKey
 *
 */
public interface SupportingNode
    extends
    ChildOf<NodeAttributes>,
    Augmentable<network.topology.rev131021.node.attributes.SupportingNode>,
    Identifiable<SupportingNodeKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:TBD:params:xml:ns:yang:network-topology",
        "2013-10-21", "supporting-node").intern();

    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.TopologyId</code> <code>topologyRef</code>, or <code>null</code> if not present
     */
    TopologyId getTopologyRef();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.NodeId</code> <code>nodeRef</code>, or <code>null</code> if not present
     */
    NodeId getNodeRef();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.node.attributes.SupportingNodeKey</code> <code>key</code>, or <code>null</code> if not present
     */
    SupportingNodeKey getKey();

}

