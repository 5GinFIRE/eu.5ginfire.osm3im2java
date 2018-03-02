package http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.rsp;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.Rsp;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * A list of references to connection points.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd-base</b>
 * <pre>
 * list vnfd-connection-point-ref {
 *     key "member-vnf-index-ref";
 *     leaf member-vnf-index-ref {
 *         type string;
 *     }
 *     leaf order {
 *         type uint8;
 *     }
 *     leaf vnfd-id-ref {
 *         type leafref;
 *     }
 *     leaf vnfd-connection-point-ref {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd-base/nsd-descriptor-common/vnffgd/rsp/vnfd-connection-point-ref</i>
 * 
 * <p>To create instances of this class use {@link VnfdConnectionPointRefBuilder}.
 * @see VnfdConnectionPointRefBuilder
 * @see VnfdConnectionPointRefKey
 *
 */
public interface VnfdConnectionPointRef
    extends
    ChildOf<Rsp>,
    Augmentable<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.rsp.VnfdConnectionPointRef>,
    Identifiable<VnfdConnectionPointRefKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("http://riftio.com/ns/riftware-1.0/nsd-base",
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
     * A number that denotes the order of a VNF in a chain
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>order</code>, or <code>null</code> if not present
     */
    java.lang.Short getOrder();
    
    /**
     * A reference to a vnfd. This is a leafref to path: 
     * ../../../../nsd:constituent-vnfd + [nsd:id = current()/../nsd:id-ref] + 
     * /nsd:vnfd-id-ref
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>vnfdIdRef</code>, or <code>null</code> if not present
     */
    java.lang.Object getVnfdIdRef();
    
    /**
     * A reference to a connection point name in a vnfd. This is a leafref to path: 
     * /vnfd:vnfd-catalog/vnfd:vnfd + [vnfd:id = current()/../nsd:vnfd-id-ref] + 
     * /vnfd:connection-point/vnfd:name NOTE: An issue with confd is preventing the use
     * of xpath. Seems to be an issue with leafref to leafref, whose target is in a 
     * different module. Once that is resolved this will switched to use leafref
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vnfdConnectionPointRef</code>, or <code>null</code> if not present
     */
    java.lang.String getVnfdConnectionPointRef();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.nsd.base.rev170228.nsd.descriptor.common.vnffgd.rsp.VnfdConnectionPointRefKey</code> <code>key</code>, or <code>null</code> if not present
     */
    VnfdConnectionPointRefKey getKey();

}

