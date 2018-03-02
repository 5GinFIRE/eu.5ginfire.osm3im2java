package ietf.params.xml.ns.yang.nfvo.nsr.rev170208;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.cloud.config.SshAuthorizedKey;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.cloud.config.User;

import java.util.List;

/**
 * List of cloud config parameters
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * grouping cloud-config {
 *     list ssh-authorized-key {
 *         key "key-pair-ref";
 *         leaf key-pair-ref {
 *             type string;
 *         }
 *     }
 *     list user {
 *         key "name";
 *         leaf name {
 *             type string;
 *         }
 *         leaf user-info {
 *             type string;
 *         }
 *         list ssh-authorized-key {
 *             key "key-pair-ref";
 *             leaf key-pair-ref {
 *                 type string;
 *             }
 *         }
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/cloud-config</i>
 *
 */
public interface CloudConfig
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsr",
        "2017-02-08", "cloud-config").intern();

    /**
     * List of authorized ssh keys as part of cloud-config
     *
     *
     *
     * @return <code>java.util.List</code> <code>sshAuthorizedKey</code>, or <code>null</code> if not present
     */
    List<SshAuthorizedKey> getSshAuthorizedKey();
    
    /**
     * Used to configure the list of public keys to be injected as partof ns 
     * instantiation
     *
     *
     *
     * @return <code>java.util.List</code> <code>user</code>, or <code>null</code> if not present
     */
    List<User> getUser();

}

