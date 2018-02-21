package ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.link;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.ietf.network.rev150608.NodeId;
import ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.Link;

import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * This container holds the logical destination of aparticular link.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-network-topology</b>
 * <pre>
 * container destination {
 *     leaf dest-node {
 *         type leafref;
 *     }
 *     leaf dest-tp {
 *         type leafref;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-network-topology/network/(urn:ietf:params:xml:ns:yang:ietf-network-topology?revision=2015-06-08)link/destination</i>
 * 
 * <p>To create instances of this class use {@link DestinationBuilder}.
 * @see DestinationBuilder
 *
 */
public interface Destination
    extends
    ChildOf<Link>,
    Augmentable<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.link.Destination>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:ietf-network-topology",
        "2015-06-08", "destination").intern();

    /**
     * Destination node identifier, must be in the samenetwork.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.network.rev150608.NodeId</code> <code>destNode</code>, or <code>null</code> if not present
     */
    NodeId getDestNode();
    
    /**
     * Termination point within destination node thatterminates the link.
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>destTp</code>, or <code>null</code> if not present
     */
    java.lang.Object getDestTp();

}

