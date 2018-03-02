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
 * container destination {
 *     leaf dest-node {
 *         type node-ref;
 *     }
 *     leaf dest-tp {
 *         type tp-ref;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>odl-network-topology/link-attributes/destination</i>
 * 
 * <p>To create instances of this class use {@link DestinationBuilder}.
 * @see DestinationBuilder
 *
 */
public interface Destination
    extends
    ChildOf<LinkAttributes>,
    Augmentable<network.topology.rev131021.link.attributes.Destination>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:TBD:params:xml:ns:yang:network-topology",
        "2013-10-21", "destination").intern();

    /**
     * Destination node identifier, must be in same topology.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.NodeId</code> <code>destNode</code>, or <code>null</code> if not present
     */
    NodeId getDestNode();
    
    /**
     * Termination point within destination node that terminates the link.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.TpId</code> <code>destTp</code>, or <code>null</code> if not present
     */
    TpId getDestTp();

}

