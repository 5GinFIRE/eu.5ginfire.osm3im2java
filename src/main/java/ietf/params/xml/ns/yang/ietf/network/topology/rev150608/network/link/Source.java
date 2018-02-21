package ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.link;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.ietf.network.rev150608.NodeId;
import ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.Link;

import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * This container holds the logical source of a particularlink.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-network-topology</b>
 * <pre>
 * container source {
 *     leaf source-node {
 *         type leafref;
 *     }
 *     leaf source-tp {
 *         type leafref;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-network-topology/network/(urn:ietf:params:xml:ns:yang:ietf-network-topology?revision=2015-06-08)link/source</i>
 * 
 * <p>To create instances of this class use {@link SourceBuilder}.
 * @see SourceBuilder
 *
 */
public interface Source
    extends
    ChildOf<Link>,
    Augmentable<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.link.Source>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:ietf-network-topology",
        "2015-06-08", "source").intern();

    /**
     * Source node identifier, must be in same topology.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.network.rev150608.NodeId</code> <code>sourceNode</code>, or <code>null</code> if not present
     */
    NodeId getSourceNode();
    
    /**
     * Termination point within source node that terminatesthe link.
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>sourceTp</code>, or <code>null</code> if not present
     */
    java.lang.Object getSourceTp();

}

