package ietf.params.xml.ns.yang.ietf.network.rev150608.network.node;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.ietf.network.rev150608.NetworkId;
import ietf.params.xml.ns.yang.ietf.network.rev150608.NodeId;
import ietf.params.xml.ns.yang.ietf.network.rev150608.network.Node;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * Represents another node, in an underlay network, thatthis node is supported by. 
 * Used to represent layeringstructure.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-network</b>
 * <pre>
 * list supporting-node {
 *     key "network-ref" "node-ref";
 *     leaf network-ref {
 *         type leafref;
 *     }
 *     leaf node-ref {
 *         type leafref;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-network/network/node/supporting-node</i>
 * 
 * <p>To create instances of this class use {@link SupportingNodeBuilder}.
 * @see SupportingNodeBuilder
 * @see SupportingNodeKey
 *
 */
public interface SupportingNode
    extends
    ChildOf<Node>,
    Augmentable<ietf.params.xml.ns.yang.ietf.network.rev150608.network.node.SupportingNode>,
    Identifiable<SupportingNodeKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:ietf-network",
        "2015-06-08", "supporting-node").intern();

    /**
     * References the underlay network that theunderlay node is part of.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.network.rev150608.NetworkId</code> <code>networkRef</code>, or <code>null</code> if not present
     */
    NetworkId getNetworkRef();
    
    /**
     * References the underlay node itself.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.network.rev150608.NodeId</code> <code>nodeRef</code>, or <code>null</code> if not present
     */
    NodeId getNodeRef();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.network.rev150608.network.node.SupportingNodeKey</code> <code>key</code>, or <code>null</code> if not present
     */
    SupportingNodeKey getKey();

}

