package ietf.params.xml.ns.yang.nfvo.nsd.rev170228;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.vnf.dependency.VnfDependency;

import java.util.List;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd</b>
 * <pre>
 * grouping nsd-vnf-dependency {
 *     list vnf-dependency {
 *         key "vnf-source-ref";
 *         leaf vnf-source-ref {
 *             type leafref;
 *         }
 *         leaf vnf-depends-on-ref {
 *             type leafref;
 *         }
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd/nsd-vnf-dependency</i>
 *
 */
public interface NsdVnfDependency
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsd",
        "2017-02-28", "nsd-vnf-dependency").intern();

    /**
     * List of VNF dependencies.
     *
     *
     *
     * @return <code>java.util.List</code> <code>vnfDependency</code>, or <code>null</code> if not present
     */
    List<VnfDependency> getVnfDependency();

}

