package ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.mgmt._interface;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.MgmtInterface;

import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * SSH key pair used for this VNF
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfr</b>
 * <pre>
 * container ssh-key {
 *     leaf public-key {
 *         type string;
 *     }
 *     leaf private-key-file {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfr/project/(urn:ietf:params:xml:ns:yang:nfvo:vnfr?revision=2017-02-28)vnfr-catalog/vnfr/mgmt-interface/ssh-key</i>
 * 
 * <p>To create instances of this class use {@link SshKeyBuilder}.
 * @see SshKeyBuilder
 *
 */
public interface SshKey
    extends
    ChildOf<MgmtInterface>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.mgmt._interface.SshKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:vnfr",
        "2017-02-28", "ssh-key").intern();

    /**
     * Public key configured on this VNF
     *
     *
     *
     * @return <code>java.lang.String</code> <code>publicKey</code>, or <code>null</code> if not present
     */
    java.lang.String getPublicKey();
    
    /**
     * Path to the private key file
     *
     *
     *
     * @return <code>java.lang.String</code> <code>privateKeyFile</code>, or <code>null</code> if not present
     */
    java.lang.String getPrivateKeyFile();

}

