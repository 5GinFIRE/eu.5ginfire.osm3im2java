package ietf.params.xml.ns.yang.ietf.network.rev150608.network;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.ietf.network.rev150608.Network;

import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Serves as an augmentation target.The network type is indicated through 
 * correspondingpresence containers augmented into this container.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-network</b>
 * <pre>
 * container network-types {
 *     container l2-network {
 *     }
 *     augment \(urn:ietf:params:xml:ns:yang:ietf-network)network\(urn:ietf:params:xml:ns:yang:ietf-network)network-types {
 *         when "Optional.empty";
 *         description
 *             "Introduce new network type for L2 topology";
 *         status CURRENT;
 *         container l2-network {
 *         }
 *         uses l2-network-type;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-network/network/network-types</i>
 * 
 * <p>To create instances of this class use {@link NetworkTypesBuilder}.
 * @see NetworkTypesBuilder
 *
 */
public interface NetworkTypes
    extends
    ChildOf<Network>,
    Augmentable<ietf.params.xml.ns.yang.ietf.network.rev150608.network.NetworkTypes>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:ietf-network",
        "2015-06-08", "network-types").intern();


}

