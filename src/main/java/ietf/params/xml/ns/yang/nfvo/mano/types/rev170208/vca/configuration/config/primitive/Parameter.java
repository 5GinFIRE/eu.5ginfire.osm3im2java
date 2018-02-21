package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.primitive;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PrimitiveParameter;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.ConfigPrimitive;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of parameters to the config primitive.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * list parameter {
 *     key "name";
 *     leaf name {
 *         type string;
 *     }
 *     leaf data-type {
 *         type parameter-data-type;
 *     }
 *     leaf mandatory {
 *         type mandatory;
 *     }
 *     leaf default-value {
 *         type string;
 *     }
 *     leaf parameter-pool {
 *         type string;
 *     }
 *     leaf read-only {
 *         type read-only;
 *     }
 *     leaf hidden {
 *         type hidden;
 *     }
 *     uses primitive-parameter;
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/vca-configuration/config-primitive/parameter</i>
 * 
 * <p>To create instances of this class use {@link ParameterBuilder}.
 * @see ParameterBuilder
 * @see ParameterKey
 *
 */
public interface Parameter
    extends
    ChildOf<ConfigPrimitive>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.primitive.Parameter>,
    PrimitiveParameter,
    Identifiable<ParameterKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2017-02-08", "parameter").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.primitive.ParameterKey</code> <code>key</code>, or <code>null</code> if not present
     */
    ParameterKey getKey();

}

