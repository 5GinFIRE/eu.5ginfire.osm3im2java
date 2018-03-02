package ietf.params.xml.ns.yang.ietf.l2.topology.rev150623;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Grouping for an absolute reference to a node instance.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-l2-topology</b>
 * <pre>
 * grouping node-ref {
 *     leaf network-ref {
 *         type leafref;
 *     }
 *     leaf node-ref {
 *         type leafref;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-l2-topology/node-ref</i>
 *
 */
public interface NodeRef
    extends
    DataObject,
    NetworkRef
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:ietf-l2-topology",
        "2015-06-23", "node-ref").intern();

    /**
     * An absolute reference to a node instance.
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>nodeRef</code>, or <code>null</code> if not present
     */
    java.lang.Object getNodeRef();

}

