package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;

/**
 * List of input parameters that can be specified when instantiating a network 
 * service.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping input-parameter {
 *     list input-parameter {
 *         key "xpath";
 *         leaf xpath {
 *             type string;
 *         }
 *         leaf value {
 *             type string;
 *         }
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/input-parameter</i>
 *
 */
public interface InputParameter
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2017-02-08", "input-parameter").intern();

    /**
     * List of input parameters
     *
     *
     *
     * @return <code>java.util.List</code> <code>inputParameter</code>, or <code>null</code> if not present
     */
    List<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.input.parameter.InputParameter> getInputParameter();

}

