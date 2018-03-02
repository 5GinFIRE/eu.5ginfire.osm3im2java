package ietf.params.xml.ns.yang.nfvo.nsr.rev170208.start.network.service.input.vnfd.placement.group.maps;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.start.network.service.input.VnfdPlacementGroupMaps;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.start.network.service.input.vnfd.placement.group.maps.user.SshAuthorizedKey;

import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of users to be added through cloud-config
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list user {
 *     key "name";
 *     leaf name {
 *         type string;
 *     }
 *     leaf user-info {
 *         type string;
 *     }
 *     list ssh-authorized-key {
 *         key "key-pair-ref";
 *         leaf key-pair-ref {
 *             type leafref;
 *         }
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/start-network-service/input/vnfd-placement-group-maps/user</i>
 * 
 * <p>To create instances of this class use {@link UserBuilder}.
 * @see UserBuilder
 * @see UserKey
 *
 */
public interface User
    extends
    ChildOf<VnfdPlacementGroupMaps>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.start.network.service.input.vnfd.placement.group.maps.User>,
    Identifiable<UserKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsr",
        "2017-02-08", "user").intern();

    /**
     * Name of the user 
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    java.lang.String getName();
    
    /**
     * The user name's real name
     *
     *
     *
     * @return <code>java.lang.String</code> <code>userInfo</code>, or <code>null</code> if not present
     */
    java.lang.String getUserInfo();
    
    /**
     * Used to configure the list of public keys to be injected as partof ns 
     * instantiation
     *
     *
     *
     * @return <code>java.util.List</code> <code>sshAuthorizedKey</code>, or <code>null</code> if not present
     */
    List<SshAuthorizedKey> getSshAuthorizedKey();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.start.network.service.input.vnfd.placement.group.maps.UserKey</code> <code>key</code>, or <code>null</code> if not present
     */
    UserKey getKey();

}

