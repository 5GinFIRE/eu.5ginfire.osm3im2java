package http.riftio.nsd.base.rev170228.nsd.descriptor.common;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import http.riftio.nsd.base.rev170228.NsdDescriptorCommon;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * Used to configure the list of public keys to be injected as partof ns 
 * instantiation
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd-base</b>
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
 * <i>nsd-base/nsd-descriptor-common/key-pair</i>
 * 
 * <p>To create instances of this class use {@link KeyPairBuilder}.
 * @see KeyPairBuilder
 * @see KeyPairKey
 *
 */
public interface KeyPair
    extends
    ChildOf<NsdDescriptorCommon>,
    Augmentable<http.riftio.nsd.base.rev170228.nsd.descriptor.common.KeyPair>,
    Identifiable<KeyPairKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("http://riftio.com/ns/riftware-1.0/nsd-base",
        "2017-02-28", "key-pair").intern();

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
     * @return <code>org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.nsd.base.rev170228.nsd.descriptor.common.KeyPairKey</code> <code>key</code>, or <code>null</code> if not present
     */
    KeyPairKey getKey();

}

