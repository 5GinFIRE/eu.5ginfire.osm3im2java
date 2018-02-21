package ietf.params.xml.ns.yang.nfvo.mano.rift.groupings.norev.ssh.key.generated;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * SSH key pair generated for this NS
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-rift-groupings</b>
 * <pre>
 * container ssh-key-generated {
 *     leaf public-key {
 *         type string;
 *     }
 *     leaf private-key-file {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-rift-groupings/ssh-key-generated/ssh-key-generated</i>
 * 
 * <p>To create instances of this class use {@link SshKeyGeneratedBuilder}.
 * @see SshKeyGeneratedBuilder
 *
 */
public interface SshKeyGenerated
    extends
    ChildOf<ietf.params.xml.ns.yang.nfvo.mano.rift.groupings.norev.SshKeyGenerated>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.mano.rift.groupings.norev.ssh.key.generated.SshKeyGenerated>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-rift-groupings",
        "ssh-key-generated").intern();

    /**
     * Public key generated
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

