package ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.node.termination.point;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.ietf.network.rev150608.NetworkId;
import ietf.params.xml.ns.yang.ietf.network.rev150608.NodeId;
import ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.node.TerminationPoint;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * The leaf list identifies any termination points thatthe termination point is 
 * dependent on, or maps onto.Those termination points will themselves be 
 * containedin a supporting node.This dependency information can be inferred 
 * fromthe dependencies between links. For this reason,this item is not separately 
 * configurable. Hence nocorresponding constraint needs to be articulated.The 
 * corresponding information is simply provided by theimplementing system.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-network-topology</b>
 * <pre>
 * list supporting-termination-point {
 *     key "network-ref" "node-ref" "tp-ref";
 *     leaf network-ref {
 *         type leafref;
 *     }
 *     leaf node-ref {
 *         type leafref;
 *     }
 *     leaf tp-ref {
 *         type leafref;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-network-topology/network/node/(urn:ietf:params:xml:ns:yang:ietf-network-topology?revision=2015-06-08)termination-point/supporting-termination-point</i>
 * 
 * <p>To create instances of this class use {@link SupportingTerminationPointBuilder}.
 * @see SupportingTerminationPointBuilder
 * @see SupportingTerminationPointKey
 *
 */
public interface SupportingTerminationPoint
    extends
    ChildOf<TerminationPoint>,
    Augmentable<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.node.termination.point.SupportingTerminationPoint>,
    Identifiable<SupportingTerminationPointKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:ietf-network-topology",
        "2015-06-08", "supporting-termination-point").intern();

    /**
     * This leaf identifies in which topology thesupporting termination point is 
     * present.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.network.rev150608.NetworkId</code> <code>networkRef</code>, or <code>null</code> if not present
     */
    NetworkId getNetworkRef();
    
    /**
     * This leaf identifies in which node the supportingtermination point is present.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.network.rev150608.NodeId</code> <code>nodeRef</code>, or <code>null</code> if not present
     */
    NodeId getNodeRef();
    
    /**
     * Reference to the underlay node, must be in adifferent topology
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>tpRef</code>, or <code>null</code> if not present
     */
    java.lang.Object getTpRef();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.node.termination.point.SupportingTerminationPointKey</code> <code>key</code>, or <code>null</code> if not present
     */
    SupportingTerminationPointKey getKey();

}

