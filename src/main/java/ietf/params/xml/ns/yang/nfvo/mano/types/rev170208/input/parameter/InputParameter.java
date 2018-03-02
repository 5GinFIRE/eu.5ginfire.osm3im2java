package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.input.parameter;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of input parameters
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * list input-parameter {
 *     key "xpath";
 *     leaf xpath {
 *         type string;
 *     }
 *     leaf value {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/input-parameter/input-parameter</i>
 * 
 * <p>To create instances of this class use {@link InputParameterBuilder}.
 * @see InputParameterBuilder
 * @see InputParameterKey
 *
 */
public interface InputParameter
    extends
    ChildOf<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.InputParameter>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.input.parameter.InputParameter>,
    Identifiable<InputParameterKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2017-02-08", "input-parameter").intern();

    /**
     * An xpath that specfies which element in a descriptor is to bemodified.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>xpath</code>, or <code>null</code> if not present
     */
    java.lang.String getXpath();
    
    /**
     * The value that the element specified by the xpath should take when arecord is 
     * created.
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
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.input.parameter.InputParameterKey</code> <code>key</code>, or <code>null</code> if not present
     */
    InputParameterKey getKey();

}

