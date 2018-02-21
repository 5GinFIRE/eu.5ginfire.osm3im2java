package http.riftio.vnfd.base.rev170228.vnfd.descriptor;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import http.riftio.vnfd.base.rev170228.VnfdDescriptor;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of VDU dependencies.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * list vdu-dependency {
 *     key "vdu-source-ref";
 *     leaf vdu-source-ref {
 *         type string;
 *     }
 *     leaf vdu-depends-on-ref {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/vdu-dependency</i>
 * 
 * <p>To create instances of this class use {@link VduDependencyBuilder}.
 * @see VduDependencyBuilder
 * @see VduDependencyKey
 *
 */
public interface VduDependency
    extends
    ChildOf<VnfdDescriptor>,
    Augmentable<http.riftio.vnfd.base.rev170228.vnfd.descriptor.VduDependency>,
    Identifiable<VduDependencyKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("http://riftio.com/ns/riftware-1.0/vnfd-base",
        "2017-02-28", "vdu-dependency").intern();

    /**
     * @return <code>java.lang.String</code> <code>vduSourceRef</code>, or <code>null</code> if not present
     */
    java.lang.String getVduSourceRef();
    
    /**
     * Reference to the VDU on whichthe source VDU depends.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vduDependsOnRef</code>, or <code>null</code> if not present
     */
    java.lang.String getVduDependsOnRef();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.vnfd.base.rev170228.vnfd.descriptor.VduDependencyKey</code> <code>key</code>, or <code>null</code> if not present
     */
    VduDependencyKey getKey();

}

