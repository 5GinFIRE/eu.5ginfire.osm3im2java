package http.riftio.project.nsd.rev170228.nsr.nsd.vld.vld;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import http.riftio.project.nsd.rev170228.nsr.nsd.vld.Vld;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * A list of references to connection points.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>project-nsd</b>
 * <pre>
 * list vnfd-connection-point-ref {
 *     key "member-vnf-index-ref" "vnfd-connection-point-ref";
 *     leaf member-vnf-index-ref {
 *         type string;
 *     }
 *     leaf vnfd-id-ref {
 *         type string;
 *     }
 *     leaf vnfd-connection-point-ref {
 *         type leafref;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>project-nsd/nsr-nsd-vld/vld/vnfd-connection-point-ref</i>
 * 
 * <p>To create instances of this class use {@link VnfdConnectionPointRefBuilder}.
 * @see VnfdConnectionPointRefBuilder
 * @see VnfdConnectionPointRefKey
 *
 */
public interface VnfdConnectionPointRef
    extends
    ChildOf<Vld>,
    Augmentable<http.riftio.project.nsd.rev170228.nsr.nsd.vld.vld.VnfdConnectionPointRef>,
    Identifiable<VnfdConnectionPointRefKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("http://riftio.com/ns/riftware-1.0/project-nsd",
        "2017-02-28", "vnfd-connection-point-ref").intern();

    /**
     * Reference to member-vnf within constituent-vnfds
     *
     *
     *
     * @return <code>java.lang.String</code> <code>memberVnfIndexRef</code>, or <code>null</code> if not present
     */
    java.lang.String getMemberVnfIndexRef();
    
    /**
     * A reference to a vnfd. This is aleafref to path: ../../nsd:constituent-vnfd + 
     * [nsd:id = current()/../nsd:id-ref] + /nsd:vnfd-id-refNOTE: An issue with confd 
     * is preventing theuse of xpath. Seems to be an issue with leafrefto leafref, 
     * whose target is in a different module.Once that is resolved this will switched 
     * to useleafref
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vnfdIdRef</code>, or <code>null</code> if not present
     */
    java.lang.String getVnfdIdRef();
    
    /**
     * A reference to a connection point name
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>vnfdConnectionPointRef</code>, or <code>null</code> if not present
     */
    java.lang.Object getVnfdConnectionPointRef();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.project.nsd.rev170228.nsr.nsd.vld.vld.VnfdConnectionPointRefKey</code> <code>key</code>, or <code>null</code> if not present
     */
    VnfdConnectionPointRefKey getKey();

}

