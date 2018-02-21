package ietf.params.xml.ns.yang.ietf.network.rev150608;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Contains the information necessary to reference a node.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-network</b>
 * <pre>
 * grouping node-ref {
 *     leaf node-ref {
 *         type leafref;
 *     }
 *     leaf network-ref {
 *         type leafref;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-network/node-ref</i>
 *
 */
public interface NodeRef
    extends
    DataObject,
    NetworkRef
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:ietf-network",
        "2015-06-08", "node-ref").intern();

    /**
     * Used to reference a node.Nodes are identified relative to the network they 
     * arecontained in.
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>nodeRef</code>, or <code>null</code> if not present
     */
    java.lang.Object getNodeRef();

}

