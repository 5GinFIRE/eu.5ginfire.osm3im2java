package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.input.parameter.xpath;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of xpaths to parameters inside the NSDthe can be customized during the 
 * instantiation.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * list input-parameter-xpath {
 *     key "xpath";
 *     leaf xpath {
 *         type string;
 *     }
 *     leaf label {
 *         type string;
 *     }
 *     leaf default-value {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/input-parameter-xpath/input-parameter-xpath</i>
 * 
 * <p>To create instances of this class use {@link InputParameterXpathBuilder}.
 * @see InputParameterXpathBuilder
 * @see InputParameterXpathKey
 *
 */
public interface InputParameterXpath
    extends
    ChildOf<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.InputParameterXpath>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.input.parameter.xpath.InputParameterXpath>,
    Identifiable<InputParameterXpathKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2017-02-08", "input-parameter-xpath").intern();

    /**
     * An xpath that specifies the element in a descriptor.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>xpath</code>, or <code>null</code> if not present
     */
    java.lang.String getXpath();
    
    /**
     * A descriptive string
     *
     *
     *
     * @return <code>java.lang.String</code> <code>label</code>, or <code>null</code> if not present
     */
    java.lang.String getLabel();
    
    /**
     * Default Value for the Input Parameter
     *
     *
     *
     * @return <code>java.lang.String</code> <code>defaultValue</code>, or <code>null</code> if not present
     */
    java.lang.String getDefaultValue();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.input.parameter.xpath.InputParameterXpathKey</code> <code>key</code>, or <code>null</code> if not present
     */
    InputParameterXpathKey getKey();

}

