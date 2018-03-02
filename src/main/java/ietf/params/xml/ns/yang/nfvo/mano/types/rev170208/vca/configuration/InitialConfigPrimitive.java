package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.VcaConfiguration;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.InitialConfigPrimitiveBuilder.InitialConfigPrimitiveImpl;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.initial.config.primitive.PrimitiveType;
import ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.VnfdBuilder.VnfdImpl;

import java.math.BigInteger;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * Initial set of configuration primitives.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * list initial-config-primitive {
 *     key "seq";
 *     leaf seq {
 *         type uint64;
 *     }
 *     choice primitive-type {
 *         case primitive-definition {
 *             leaf name {
 *                 type string;
 *             }
 *             list parameter {
 *                 key "name";
 *                 leaf name {
 *                     type string;
 *                 }
 *                 leaf value {
 *                     type string;
 *                 }
 *             }
 *             leaf user-defined-script {
 *                 type string;
 *             }
 *         }
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/vca-configuration/initial-config-primitive</i>
 * 
 * <p>To create instances of this class use {@link InitialConfigPrimitiveBuilder}.
 * @see InitialConfigPrimitiveBuilder
 * @see InitialConfigPrimitiveKey
 *
 */
@JsonDeserialize(as = InitialConfigPrimitiveImpl.class)
public interface InitialConfigPrimitive
    extends
    ChildOf<VcaConfiguration>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.InitialConfigPrimitive>,
    Identifiable<InitialConfigPrimitiveKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2017-02-08", "initial-config-primitive").intern();

    /**
     * Sequence number for the configuration primitive.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>seq</code>, or <code>null</code> if not present
     */
    BigInteger getSeq();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.initial.config.primitive.PrimitiveType</code> <code>primitiveType</code>, or <code>null</code> if not present
     */
    PrimitiveType getPrimitiveType();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.InitialConfigPrimitiveKey</code> <code>key</code>, or <code>null</code> if not present
     */
    InitialConfigPrimitiveKey getKey();

}

