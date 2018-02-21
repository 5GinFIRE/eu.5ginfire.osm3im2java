package network.topology.rev131021;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import network.topology.rev131021.link.attributes.Destination;
import network.topology.rev131021.link.attributes.Source;
import network.topology.rev131021.link.attributes.SupportingLink;

import java.util.List;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>odl-network-topology</b>
 * <pre>
 * grouping link-attributes {
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
 * }
 * </pre>The schema path to identify an instance is
 * <i>odl-network-topology/link-attributes</i>
 *
 */
public interface LinkAttributes
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:TBD:params:xml:ns:yang:network-topology",
        "2013-10-21", "link-attributes").intern();

    /**
     * The identifier of a link in the topology.A link is specific to a topology to 
     * which it belongs.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.LinkId</code> <code>linkId</code>, or <code>null</code> if not present
     */
    LinkId getLinkId();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.link.attributes.Source</code> <code>source</code>, or <code>null</code> if not present
     */
    Source getSource();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.link.attributes.Destination</code> <code>destination</code>, or <code>null</code> if not present
     */
    Destination getDestination();
    
    /**
     * @return <code>java.util.List</code> <code>supportingLink</code>, or <code>null</code> if not present
     */
    List<SupportingLink> getSupportingLink();

}

