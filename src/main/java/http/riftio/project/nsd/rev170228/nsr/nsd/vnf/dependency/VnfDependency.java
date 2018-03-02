package http.riftio.project.nsd.rev170228.nsr.nsd.vnf.dependency;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import http.riftio.project.nsd.rev170228.NsrNsdVnfDependency;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of VNF dependencies.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>project-nsd</b>
 * <pre>
 * list vnf-dependency {
 *     key "vnf-source-ref";
 *     leaf vnf-source-ref {
 *         type string;
 *     }
 *     leaf vnf-depends-on-ref {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>project-nsd/nsr-nsd-vnf-dependency/vnf-dependency</i>
 * 
 * <p>To create instances of this class use {@link VnfDependencyBuilder}.
 * @see VnfDependencyBuilder
 * @see VnfDependencyKey
 *
 */
public interface VnfDependency
    extends
    ChildOf<NsrNsdVnfDependency>,
    Augmentable<http.riftio.project.nsd.rev170228.nsr.nsd.vnf.dependency.VnfDependency>,
    Identifiable<VnfDependencyKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("http://riftio.com/ns/riftware-1.0/project-nsd",
        "2017-02-28", "vnf-dependency").intern();

    /**
     * @return <code>java.lang.String</code> <code>vnfSourceRef</code>, or <code>null</code> if not present
     */
    java.lang.String getVnfSourceRef();
    
    /**
     * Reference to VNF that sorce VNF depends.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vnfDependsOnRef</code>, or <code>null</code> if not present
     */
    java.lang.String getVnfDependsOnRef();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.project.nsd.rev170228.nsr.nsd.vnf.dependency.VnfDependencyKey</code> <code>key</code>, or <code>null</code> if not present
     */
    VnfDependencyKey getKey();

}

