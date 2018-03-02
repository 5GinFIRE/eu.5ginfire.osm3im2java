package ietf.params.xml.ns.yang.nfvo.nsr.rev170208.start.network.service.input.vnfd.placement.group.maps.user;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.start.network.service.input.vnfd.placement.group.maps.User;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * Used to configure the list of public keys to be injected as partof ns 
 * instantiation
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list ssh-authorized-key {
 *     key "key-pair-ref";
 *     leaf key-pair-ref {
 *         type leafref;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/start-network-service/input/vnfd-placement-group-maps/user/ssh-authorized-key</i>
 * 
 * <p>To create instances of this class use {@link SshAuthorizedKeyBuilder}.
 * @see SshAuthorizedKeyBuilder
 * @see SshAuthorizedKeyKey
 *
 */
public interface SshAuthorizedKey
    extends
    ChildOf<User>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.start.network.service.input.vnfd.placement.group.maps.user.SshAuthorizedKey>,
    Identifiable<SshAuthorizedKeyKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsr",
        "2017-02-08", "ssh-authorized-key").intern();

    /**
     * A reference to the key pair entry in the global key pair table
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>keyPairRef</code>, or <code>null</code> if not present
     */
    java.lang.Object getKeyPairRef();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.start.network.service.input.vnfd.placement.group.maps.user.SshAuthorizedKeyKey</code> <code>key</code>, or <code>null</code> if not present
     */
    SshAuthorizedKeyKey getKey();

}

