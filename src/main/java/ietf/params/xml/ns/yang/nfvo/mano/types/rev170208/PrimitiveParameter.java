package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping primitive-parameter {
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
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/primitive-parameter</i>
 *
 */
public interface PrimitiveParameter
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2017-02-08", "primitive-parameter").intern();

    /**
     * Name of the parameter.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    java.lang.String getName();
    
    /**
     * Data type associated with the name.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ParameterDataType</code> <code>dataType</code>, or <code>null</code> if not present
     */
    ParameterDataType getDataType();
    
    /**
     * Is this field mandatory
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>mandatory</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isMandatory();
    
    /**
     * The default value for this field
     *
     *
     *
     * @return <code>java.lang.String</code> <code>defaultValue</code>, or <code>null</code> if not present
     */
    java.lang.String getDefaultValue();
    
    /**
     * NSD parameter pool name to use for this parameter
     *
     *
     *
     * @return <code>java.lang.String</code> <code>parameterPool</code>, or <code>null</code> if not present
     */
    java.lang.String getParameterPool();
    
    /**
     * The value should be dimmed by the UI.Only applies to parameters with default 
     * values.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>readOnly</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isReadOnly();
    
    /**
     * The value should be hidden by the UI.Only applies to parameters with default 
     * values.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>hidden</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isHidden();

}

