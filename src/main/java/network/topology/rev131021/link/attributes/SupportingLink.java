package network.topology.rev131021.link.attributes;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import network.topology.rev131021.LinkAttributes;
import network.topology.rev131021.LinkId;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>odl-network-topology</b>
 * <pre>
 * list supporting-link {
 *     key "link-ref";
 *     leaf link-ref {
 *         type link-ref;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>odl-network-topology/link-attributes/supporting-link</i>
 * 
 * <p>To create instances of this class use {@link SupportingLinkBuilder}.
 * @see SupportingLinkBuilder
 * @see SupportingLinkKey
 *
 */
public interface SupportingLink
    extends
    ChildOf<LinkAttributes>,
    Augmentable<network.topology.rev131021.link.attributes.SupportingLink>,
    Identifiable<SupportingLinkKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:TBD:params:xml:ns:yang:network-topology",
        "2013-10-21", "supporting-link").intern();

    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.LinkId</code> <code>linkRef</code>, or <code>null</code> if not present
     */
    LinkId getLinkRef();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.link.attributes.SupportingLinkKey</code> <code>key</code>, or <code>null</code> if not present
     */
    SupportingLinkKey getKey();

}

