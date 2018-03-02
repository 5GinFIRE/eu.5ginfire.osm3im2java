package ietf.params.xml.ns.yang.ietf.l2.topology.rev150623;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Grouping for an absolute reference to a termination point.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-l2-topology</b>
 * <pre>
 * grouping tp-ref {
 *     leaf node-ref {
 *         type leafref;
 *     }
 *     leaf network-ref {
 *         type leafref;
 *     }
 *     leaf tp-ref {
 *         type leafref;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-l2-topology/tp-ref</i>
 *
 */
public interface TpRef
    extends
    DataObject,
    NodeRef
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:ietf-l2-topology",
        "2015-06-23", "tp-ref").intern();

    /**
     * Grouping for an absolute reference to a TP.
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>tpRef</code>, or <code>null</code> if not present
     */
    java.lang.Object getTpRef();

}

