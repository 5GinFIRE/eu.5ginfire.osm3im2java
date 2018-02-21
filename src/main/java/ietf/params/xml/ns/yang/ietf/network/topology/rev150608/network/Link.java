package ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.ietf.network.topology.rev150608.LinkId;
import ietf.params.xml.ns.yang.ietf.network.topology.rev150608.Network1;
import ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.link.Destination;
import ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.link.Source;
import ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.link.SupportingLink;

import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * A Network Link connects a by Local (Source) node anda Remote (Destination) 
 * Network Nodes via a set of thenodes' termination points.As it is possible to 
 * have several links between the samesource and destination nodes, and as a link 
 * couldpotentially be re-homed between termination points, toensure that we would 
 * always know to distinguish betweenlinks, every link is identified by a 
 * linkidentifier.Note that a link models a point-to-point link, not amultipoint 
 * link.Layering dependencies on links in underlay topologies arenot represented 
 * the layering information of nodes and oftermination points is sufficient.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-network-topology</b>
 * <pre>
 * list link {
 *     key "link-id";
 *     container source {
 *         leaf source-node {
 *             type leafref;
 *         }
 *         leaf source-tp {
 *             type leafref;
 *         }
 *     }
 *     container destination {
 *         leaf dest-node {
 *             type leafref;
 *         }
 *         leaf dest-tp {
 *             type leafref;
 *         }
 *     }
 *     leaf link-id {
 *         type link-id;
 *     }
 *     list supporting-link {
 *         key "network-ref" "link-ref";
 *         leaf network-ref {
 *             type leafref;
 *         }
 *         leaf link-ref {
 *             type leafref;
 *         }
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-network-topology/network/(urn:ietf:params:xml:ns:yang:ietf-network-topology?revision=2015-06-08)link</i>
 * 
 * <p>To create instances of this class use {@link LinkBuilder}.
 * @see LinkBuilder
 * @see LinkKey
 *
 */
public interface Link
    extends
    ChildOf<Network1>,
    Augmentable<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.Link>,
    Identifiable<LinkKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:ietf-network-topology",
        "2015-06-08", "link").intern();

    /**
     * This container holds the logical source of a particularlink.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.link.Source</code> <code>source</code>, or <code>null</code> if not present
     */
    Source getSource();
    
    /**
     * This container holds the logical destination of aparticular link.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.link.Destination</code> <code>destination</code>, or <code>null</code> if not present
     */
    Destination getDestination();
    
    /**
     * The identifier of a link in the topology.A link is specific to a topology to 
     * which it belongs.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.network.topology.rev150608.LinkId</code> <code>linkId</code>, or <code>null</code> if not present
     */
    LinkId getLinkId();
    
    /**
     * Identifies the link, or links, that this linkis dependent on.
     *
     *
     *
     * @return <code>java.util.List</code> <code>supportingLink</code>, or <code>null</code> if not present
     */
    List<SupportingLink> getSupportingLink();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.LinkKey</code> <code>key</code>, or <code>null</code> if not present
     */
    LinkKey getKey();

}

