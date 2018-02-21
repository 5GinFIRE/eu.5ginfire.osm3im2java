package http.riftio.nsd.base.rev170228.nsd.descriptor.common;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import http.riftio.nsd.base.rev170228.NsdDescriptorCommon;
import http.riftio.nsd.base.rev170228.nsd.descriptor.common.user.KeyPair;

import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of users to be added through cloud-config
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd-base</b>
 * <pre>
 * list user {
 *     key "name";
 *     leaf name {
 *         type string;
 *     }
 *     leaf user-info {
 *         type string;
 *     }
 *     list key-pair {
 *         key "name";
 *         leaf name {
 *             type string;
 *         }
 *         leaf akey {
 *             type string;
 *         }
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd-base/nsd-descriptor-common/user</i>
 * 
 * <p>To create instances of this class use {@link UserBuilder}.
 * @see UserBuilder
 * @see UserKey
 *
 */
public interface User
    extends
    ChildOf<NsdDescriptorCommon>,
    Augmentable<http.riftio.nsd.base.rev170228.nsd.descriptor.common.User>,
    Identifiable<UserKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("http://riftio.com/ns/riftware-1.0/nsd-base",
        "2017-02-28", "user").intern();

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
     * @return <code>java.util.List</code> <code>keyPair</code>, or <code>null</code> if not present
     */
    List<KeyPair> getKeyPair();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.nsd.base.rev170228.nsd.descriptor.common.UserKey</code> <code>key</code>, or <code>null</code> if not present
     */
    UserKey getKey();

}

