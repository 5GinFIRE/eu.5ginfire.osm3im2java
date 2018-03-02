package network.topology.rev131021.network.topology.topology;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import network.topology.rev131021.TopologyId;
import network.topology.rev131021.network.topology.Topology;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * Identifies the topology, or topologies, that this topologyis dependent on.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>odl-network-topology</b>
 * <pre>
 * list underlay-topology {
 *     key "topology-ref";
 *     leaf topology-ref {
 *         type topology-ref;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>odl-network-topology/network-topology/topology/underlay-topology</i>
 * 
 * <p>To create instances of this class use {@link UnderlayTopologyBuilder}.
 * @see UnderlayTopologyBuilder
 * @see UnderlayTopologyKey
 *
 */
public interface UnderlayTopology
    extends
    ChildOf<Topology>,
    Augmentable<network.topology.rev131021.network.topology.topology.UnderlayTopology>,
    Identifiable<UnderlayTopologyKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:TBD:params:xml:ns:yang:network-topology",
        "2013-10-21", "underlay-topology").intern();

    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.TopologyId</code> <code>topologyRef</code>, or <code>null</code> if not present
     */
    TopologyId getTopologyRef();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.topology.UnderlayTopologyKey</code> <code>key</code>, or <code>null</code> if not present
     */
    UnderlayTopologyKey getKey();

}

