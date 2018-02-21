package ietf.params.xml.ns.yang.ietf.network.rev150608.network;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.ietf.network.rev150608.Network;
import ietf.params.xml.ns.yang.ietf.network.rev150608.NetworkId;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * An underlay network, used to represent layered networktopologies.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-network</b>
 * <pre>
 * list supporting-network {
 *     key "network-ref";
 *     leaf network-ref {
 *         type leafref;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-network/network/supporting-network</i>
 * 
 * <p>To create instances of this class use {@link SupportingNetworkBuilder}.
 * @see SupportingNetworkBuilder
 * @see SupportingNetworkKey
 *
 */
public interface SupportingNetwork
    extends
    ChildOf<Network>,
    Augmentable<ietf.params.xml.ns.yang.ietf.network.rev150608.network.SupportingNetwork>,
    Identifiable<SupportingNetworkKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:ietf-network",
        "2015-06-08", "supporting-network").intern();

    /**
     * References the underlay network.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.network.rev150608.NetworkId</code> <code>networkRef</code>, or <code>null</code> if not present
     */
    NetworkId getNetworkRef();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.network.rev150608.network.SupportingNetworkKey</code> <code>key</code>, or <code>null</code> if not present
     */
    SupportingNetworkKey getKey();

}

