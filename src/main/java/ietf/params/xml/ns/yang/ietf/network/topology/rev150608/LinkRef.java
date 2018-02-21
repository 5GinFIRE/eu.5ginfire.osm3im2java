package ietf.params.xml.ns.yang.ietf.network.topology.rev150608;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.ietf.network.rev150608.NetworkRef;

/**
 * References a link in a specific network.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-network-topology</b>
 * <pre>
 * grouping link-ref {
 *     leaf link-ref {
 *         type leafref;
 *     }
 *     leaf network-ref {
 *         type leafref;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-network-topology/link-ref</i>
 *
 */
public interface LinkRef
    extends
    DataObject,
    NetworkRef
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:ietf-network-topology",
        "2015-06-08", "link-ref").intern();

    /**
     * A type for an absolute reference a link instance.(This type should not be used 
     * for relative references.In such a case, a relative path should be used instead.)
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>linkRef</code>, or <code>null</code> if not present
     */
    java.lang.Object getLinkRef();

}

