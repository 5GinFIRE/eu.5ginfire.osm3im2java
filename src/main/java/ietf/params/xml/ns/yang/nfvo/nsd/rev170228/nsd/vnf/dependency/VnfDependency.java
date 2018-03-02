package ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.vnf.dependency;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.nsd.rev170228.NsdVnfDependency;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of VNF dependencies.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd</b>
 * <pre>
 * list vnf-dependency {
 *     key "vnf-source-ref";
 *     leaf vnf-source-ref {
 *         type leafref;
 *     }
 *     leaf vnf-depends-on-ref {
 *         type leafref;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd/nsd-vnf-dependency/vnf-dependency</i>
 * 
 * <p>To create instances of this class use {@link VnfDependencyBuilder}.
 * @see VnfDependencyBuilder
 * @see VnfDependencyKey
 *
 */
public interface VnfDependency
    extends
    ChildOf<NsdVnfDependency>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.vnf.dependency.VnfDependency>,
    Identifiable<VnfDependencyKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsd",
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
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.vnf.dependency.VnfDependencyKey</code> <code>key</code>, or <code>null</code> if not present
     */
    VnfDependencyKey getKey();

}

