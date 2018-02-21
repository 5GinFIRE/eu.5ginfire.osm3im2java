package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.cloud.config;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.CloudConfig;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * Used to configure the list of public keys to be injected as partof ns 
 * instantiation
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * list key-pair {
 *     key "name";
 *     leaf name {
 *         type string;
 *     }
 *     leaf akey {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/cloud-config/key-pair</i>
 * 
 * <p>To create instances of this class use {@link KeyPairBuilder}.
 * @see KeyPairBuilder
 * @see KeyPairKey
 *
 */
public interface KeyPair
    extends
    ChildOf<CloudConfig>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.cloud.config.KeyPair>,
    Identifiable<KeyPairKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2017-02-08", "key-pair").intern();

    /**
     * Name of this key pair
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    java.lang.String getName();
    
    /**
     * Key associated with this key pair
     *
     *
     *
     * @return <code>java.lang.String</code> <code>akey</code>, or <code>null</code> if not present
     */
    java.lang.String getAkey();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.cloud.config.KeyPairKey</code> <code>key</code>, or <code>null</code> if not present
     */
    KeyPairKey getKey();

}

