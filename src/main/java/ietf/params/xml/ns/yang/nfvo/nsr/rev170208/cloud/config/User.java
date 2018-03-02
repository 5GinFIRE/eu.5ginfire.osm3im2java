package ietf.params.xml.ns.yang.nfvo.nsr.rev170208.cloud.config;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.CloudConfig;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.cloud.config.user.SshAuthorizedKey;

import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * Used to configure the list of public keys to be injected as partof ns 
 * instantiation
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
 *             type string;
 *         }
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/cloud-config/user</i>
 * 
 * <p>To create instances of this class use {@link UserBuilder}.
 * @see UserBuilder
 * @see UserKey
 *
 */
public interface User
    extends
    ChildOf<CloudConfig>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.cloud.config.User>,
    Identifiable<UserKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsr",
        "2017-02-08", "user").intern();

    /**
     * Name of this key pair
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
     * Used to configure the list of public keys to be injected as part of ns 
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
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.cloud.config.UserKey</code> <code>key</code>, or <code>null</code> if not present
     */
    UserKey getKey();

}

