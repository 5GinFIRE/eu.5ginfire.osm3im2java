package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.event.config;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.EventConfig;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * list parameter {
 *     key "name";
 *     leaf name {
 *         type string;
 *     }
 *     leaf value {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/event-config/parameter</i>
 * 
 * <p>To create instances of this class use {@link ParameterBuilder}.
 * @see ParameterBuilder
 * @see ParameterKey
 *
 */
public interface Parameter
    extends
    ChildOf<EventConfig>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.event.config.Parameter>,
    Identifiable<ParameterKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2017-02-08", "parameter").intern();

    /**
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    java.lang.String getName();
    
    /**
     * Value of the configuration primitive.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>value</code>, or <code>null</code> if not present
     */
    java.lang.String getValue();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.event.config.ParameterKey</code> <code>key</code>, or <code>null</code> if not present
     */
    ParameterKey getKey();

}

