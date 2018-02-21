package network.topology.rev131021.network.topology.topology;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import network.topology.rev131021.LinkAttributes;
import network.topology.rev131021.network.topology.Topology;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * A Network Link connects a by Local (Source) node anda Remote (Destination) 
 * Network Nodes via a set of thenodes' termination points.As it is possible to 
 * have several links between the samesource and destination nodes, and as a link 
 * could potentiallybe re-homed between termination points, to ensure that wewould 
 * always know to distinguish between links, every linkis identified by a 
 * link identifier.Note that a link models a point-to-point link, not a 
 * multipointlink.Layering dependencies on links in underlay topologies arenot 
 * represented as the layering information of nodes and oftermination points is 
 * sufficient.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>odl-network-topology</b>
 * <pre>
 * list link {
 *     key "link-id";
 *     leaf link-id {
 *         type link-id;
 *     }
 *     container source {
 *         leaf source-node {
 *             type node-ref;
 *         }
 *         leaf source-tp {
 *             type tp-ref;
 *         }
 *     }
 *     container destination {
 *         leaf dest-node {
 *             type node-ref;
 *         }
 *         leaf dest-tp {
 *             type tp-ref;
 *         }
 *     }
 *     list supporting-link {
 *         key "link-ref";
 *         leaf link-ref {
 *             type link-ref;
 *         }
 *     }
 *     uses link-attributes;
 * }
 * </pre>The schema path to identify an instance is
 * <i>odl-network-topology/network-topology/topology/link</i>
 * 
 * <p>To create instances of this class use {@link LinkBuilder}.
 * @see LinkBuilder
 * @see LinkKey
 *
 */
public interface Link
    extends
    ChildOf<Topology>,
    Augmentable<network.topology.rev131021.network.topology.topology.Link>,
    LinkAttributes,
    Identifiable<LinkKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:TBD:params:xml:ns:yang:network-topology",
        "2013-10-21", "link").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.topology.LinkKey</code> <code>key</code>, or <code>null</code> if not present
     */
    LinkKey getKey();

}

