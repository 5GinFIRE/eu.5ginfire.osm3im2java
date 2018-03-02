package ietf.params.xml.ns.yang.ietf.l2.topology.rev150623;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Grouping for an absolute reference to a link instance.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-l2-topology</b>
 * <pre>
 * grouping link-ref {
 *     leaf network-ref {
 *         type leafref;
 *     }
 *     leaf link-ref {
 *         type leafref;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-l2-topology/link-ref</i>
 *
 */
public interface LinkRef
    extends
    DataObject,
    NetworkRef
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:ietf-l2-topology",
        "2015-06-23", "link-ref").intern();

    /**
     * An absolute reference to a link instance.
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>linkRef</code>, or <code>null</code> if not present
     */
    java.lang.Object getLinkRef();

}

