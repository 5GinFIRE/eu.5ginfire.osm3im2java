package ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.node;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.ietf.network.topology.rev150608.Node1;
import ietf.params.xml.ns.yang.ietf.network.topology.rev150608.TpId;
import ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.node.termination.point.SupportingTerminationPoint;

import java.util.List;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * A termination point can terminate a link.Depending on the type of topology, a 
 * termination pointcould, for example, refer to a port or an interface.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-network-topology</b>
 * <pre>
 * list termination-point {
 *     key "tp-id";
 *     leaf tp-id {
 *         type tp-id;
 *     }
 *     list supporting-termination-point {
 *         key "network-ref" "node-ref" "tp-ref";
 *         leaf network-ref {
 *             type leafref;
 *         }
 *         leaf node-ref {
 *             type leafref;
 *         }
 *         leaf tp-ref {
 *             type leafref;
 *         }
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-network-topology/network/node/(urn:ietf:params:xml:ns:yang:ietf-network-topology?revision=2015-06-08)termination-point</i>
 * 
 * <p>To create instances of this class use {@link TerminationPointBuilder}.
 * @see TerminationPointBuilder
 * @see TerminationPointKey
 *
 */
public interface TerminationPoint
    extends
    ChildOf<Node1>,
    Augmentable<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.node.TerminationPoint>,
    Identifiable<TerminationPointKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:ietf-network-topology",
        "2015-06-08", "termination-point").intern();

    /**
     * Termination point identifier.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.network.topology.rev150608.TpId</code> <code>tpId</code>, or <code>null</code> if not present
     */
    TpId getTpId();
    
    /**
     * The leaf list identifies any termination points thatthe termination point is 
     * dependent on, or maps onto.Those termination points will themselves be 
     * containedin a supporting node.This dependency information can be inferred 
     * fromthe dependencies between links. For this reason,this item is not separately 
     * configurable. Hence nocorresponding constraint needs to be articulated.The 
     * corresponding information is simply provided by theimplementing system.
     *
     *
     *
     * @return <code>java.util.List</code> <code>supportingTerminationPoint</code>, or <code>null</code> if not present
     */
    List<SupportingTerminationPoint> getSupportingTerminationPoint();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.node.TerminationPointKey</code> <code>key</code>, or <code>null</code> if not present
     */
    TerminationPointKey getKey();

}

