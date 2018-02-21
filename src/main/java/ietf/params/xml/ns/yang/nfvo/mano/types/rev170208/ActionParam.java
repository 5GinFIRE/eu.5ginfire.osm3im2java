package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping action-param {
 *     list action-param {
 *         key "id";
 *         leaf id {
 *             type string;
 *         }
 *         leaf name {
 *             type string;
 *         }
 *         leaf description {
 *             type string;
 *         }
 *         leaf group-tag {
 *             type string;
 *         }
 *         leaf url {
 *             type uri;
 *         }
 *         leaf method {
 *             type method;
 *         }
 *         leaf payload {
 *             type string;
 *         }
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/action-param</i>
 *
 */
public interface ActionParam
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2017-02-08", "action-param").intern();

    /**
     * List of action parameters tocontrol VNF
     *
     *
     *
     * @return <code>java.util.List</code> <code>actionParam</code>, or <code>null</code> if not present
     */
    List<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.action.param.ActionParam> getActionParam();

}

