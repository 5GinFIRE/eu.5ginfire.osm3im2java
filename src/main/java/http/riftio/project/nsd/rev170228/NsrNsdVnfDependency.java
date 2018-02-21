package http.riftio.project.nsd.rev170228;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import http.riftio.project.nsd.rev170228.nsr.nsd.vnf.dependency.VnfDependency;

import java.util.List;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>project-nsd</b>
 * <pre>
 * grouping nsr-nsd-vnf-dependency {
 *     list vnf-dependency {
 *         key "vnf-source-ref";
 *         leaf vnf-source-ref {
 *             type string;
 *         }
 *         leaf vnf-depends-on-ref {
 *             type string;
 *         }
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>project-nsd/nsr-nsd-vnf-dependency</i>
 *
 */
public interface NsrNsdVnfDependency
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("http://riftio.com/ns/riftware-1.0/project-nsd",
        "2017-02-28", "nsr-nsd-vnf-dependency").intern();

    /**
     * List of VNF dependencies.
     *
     *
     *
     * @return <code>java.util.List</code> <code>vnfDependency</code>, or <code>null</code> if not present
     */
    List<VnfDependency> getVnfDependency();

}

