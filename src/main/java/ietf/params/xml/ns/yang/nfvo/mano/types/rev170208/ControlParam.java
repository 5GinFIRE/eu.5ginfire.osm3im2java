package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping control-param {
 *     list control-param {
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
 *         leaf min-value {
 *             type uint64;
 *         }
 *         leaf max-value {
 *             type uint64;
 *         }
 *         leaf current-value {
 *             type uint64;
 *         }
 *         leaf step-value {
 *             type uint64;
 *         }
 *         leaf units {
 *             type string;
 *         }
 *         leaf widget-type {
 *             type widget-type;
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
 * <i>mano-types/control-param</i>
 *
 */
public interface ControlParam
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2017-02-08", "control-param").intern();

    /**
     * List of control parameters to manage andupdate the running configuration of the 
     * VNF
     *
     *
     *
     * @return <code>java.util.List</code> <code>controlParam</code>, or <code>null</code> if not present
     */
    List<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.control.param.ControlParam> getControlParam();

}

