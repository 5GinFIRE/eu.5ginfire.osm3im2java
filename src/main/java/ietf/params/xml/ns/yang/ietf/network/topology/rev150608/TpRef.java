package ietf.params.xml.ns.yang.ietf.network.topology.rev150608;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.ietf.network.rev150608.NodeRef;

/**
 * References a termination point in a specific node.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-network-topology</b>
 * <pre>
 * grouping tp-ref {
 *     leaf tp-ref {
 *         type leafref;
 *     }
 *     leaf node-ref {
 *         type leafref;
 *     }
 *     leaf network-ref {
 *         type leafref;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-network-topology/tp-ref</i>
 *
 */
public interface TpRef
    extends
    DataObject,
    NodeRef
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:ietf-network-topology",
        "2015-06-08", "tp-ref").intern();

    /**
     * A type for an absolute reference to a termination point.(This type should not be
     * used for relative references.In such a case, a relative path should be used 
     * instead.)
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>tpRef</code>, or <code>null</code> if not present
     */
    java.lang.Object getTpRef();

}

