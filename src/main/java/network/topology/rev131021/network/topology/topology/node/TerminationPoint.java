package network.topology.rev131021.network.topology.topology.node;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import network.topology.rev131021.TpAttributes;
import network.topology.rev131021.network.topology.topology.Node;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * A termination point can terminate a link.Depending on the type of topology, a 
 * termination point could,for example, refer to a port or an interface.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>odl-network-topology</b>
 * <pre>
 * list termination-point {
 *     key "tp-id";
 *     leaf tp-id {
 *         type tp-id;
 *     }
 *     leaf-list tp-ref {
 *         type tp-ref;
 *     }
 *     uses tp-attributes;
 * }
 * </pre>The schema path to identify an instance is
 * <i>odl-network-topology/network-topology/topology/node/termination-point</i>
 * 
 * <p>To create instances of this class use {@link TerminationPointBuilder}.
 * @see TerminationPointBuilder
 * @see TerminationPointKey
 *
 */
public interface TerminationPoint
    extends
    ChildOf<Node>,
    Augmentable<network.topology.rev131021.network.topology.topology.node.TerminationPoint>,
    TpAttributes,
    Identifiable<TerminationPointKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:TBD:params:xml:ns:yang:network-topology",
        "2013-10-21", "termination-point").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.topology.node.TerminationPointKey</code> <code>key</code>, or <code>null</code> if not present
     */
    TerminationPointKey getKey();

}

