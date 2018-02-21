package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping input-parameter-xpath {
 *     list input-parameter-xpath {
 *         key "xpath";
 *         leaf xpath {
 *             type string;
 *         }
 *         leaf label {
 *             type string;
 *         }
 *         leaf default-value {
 *             type string;
 *         }
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/input-parameter-xpath</i>
 *
 */
public interface InputParameterXpath
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2017-02-08", "input-parameter-xpath").intern();

    /**
     * List of xpaths to parameters inside the NSDthe can be customized during the 
     * instantiation.
     *
     *
     *
     * @return <code>java.util.List</code> <code>inputParameterXpath</code>, or <code>null</code> if not present
     */
    List<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.input.parameter.xpath.InputParameterXpath> getInputParameterXpath();

}

