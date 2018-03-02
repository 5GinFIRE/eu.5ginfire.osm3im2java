package ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.link;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.ietf.network.rev150608.NetworkId;
import ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.Link;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * Identifies the link, or links, that this linkis dependent on.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-network-topology</b>
 * <pre>
 * list supporting-link {
 *     key "network-ref" "link-ref";
 *     leaf network-ref {
 *         type leafref;
 *     }
 *     leaf link-ref {
 *         type leafref;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-network-topology/network/(urn:ietf:params:xml:ns:yang:ietf-network-topology?revision=2015-06-08)link/supporting-link</i>
 * 
 * <p>To create instances of this class use {@link SupportingLinkBuilder}.
 * @see SupportingLinkBuilder
 * @see SupportingLinkKey
 *
 */
public interface SupportingLink
    extends
    ChildOf<Link>,
    Augmentable<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.link.SupportingLink>,
    Identifiable<SupportingLinkKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:ietf-network-topology",
        "2015-06-08", "supporting-link").intern();

    /**
     * This leaf identifies in which underlay topologysupporting link is present.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.network.rev150608.NetworkId</code> <code>networkRef</code>, or <code>null</code> if not present
     */
    NetworkId getNetworkRef();
    
    /**
     * This leaf identifies a link which is a partof this link's underlay. Reference 
     * loops, in whicha link identifies itself as its underlay, eitherdirectly or 
     * transitively, are not allowed.
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>linkRef</code>, or <code>null</code> if not present
     */
    java.lang.Object getLinkRef();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.link.SupportingLinkKey</code> <code>key</code>, or <code>null</code> if not present
     */
    SupportingLinkKey getKey();

}

