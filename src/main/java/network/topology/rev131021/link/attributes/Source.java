package network.topology.rev131021.link.attributes;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import network.topology.rev131021.LinkAttributes;
import network.topology.rev131021.NodeId;
import network.topology.rev131021.TpId;

import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>odl-network-topology</b>
 * <pre>
 * container source {
 *     leaf source-node {
 *         type node-ref;
 *     }
 *     leaf source-tp {
 *         type tp-ref;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>odl-network-topology/link-attributes/source</i>
 * 
 * <p>To create instances of this class use {@link SourceBuilder}.
 * @see SourceBuilder
 *
 */
public interface Source
    extends
    ChildOf<LinkAttributes>,
    Augmentable<network.topology.rev131021.link.attributes.Source>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:TBD:params:xml:ns:yang:network-topology",
        "2013-10-21", "source").intern();

    /**
     * Source node identifier, must be in same topology.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.NodeId</code> <code>sourceNode</code>, or <code>null</code> if not present
     */
    NodeId getSourceNode();
    
    /**
     * Termination point within source node that terminates the link.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.TpId</code> <code>sourceTp</code>, or <code>null</code> if not present
     */
    TpId getSourceTp();

}

