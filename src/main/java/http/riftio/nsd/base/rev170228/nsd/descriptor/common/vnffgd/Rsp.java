package http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import http.riftio.nsd.base.rev170228.nsd.descriptor.common.Vnffgd;
import http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.rsp.VnfdConnectionPointRef;

import java.util.List;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of Rendered Service Paths (RSP).
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd-base</b>
 * <pre>
 * list rsp {
 *     key "id";
 *     leaf id {
 *         type string;
 *     }
 *     leaf name {
 *         type string;
 *     }
 *     list vnfd-connection-point-ref {
 *         key "member-vnf-index-ref";
 *         leaf member-vnf-index-ref {
 *             type string;
 *         }
 *         leaf order {
 *             type uint8;
 *         }
 *         leaf vnfd-id-ref {
 *             type leafref;
 *         }
 *         leaf vnfd-connection-point-ref {
 *             type string;
 *         }
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd-base/nsd-descriptor-common/vnffgd/rsp</i>
 * 
 * <p>To create instances of this class use {@link RspBuilder}.
 * @see RspBuilder
 * @see RspKey
 *
 */
public interface Rsp
    extends
    ChildOf<Vnffgd>,
    Augmentable<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.Rsp>,
    Identifiable<RspKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("http://riftio.com/ns/riftware-1.0/nsd-base",
        "2017-02-28", "rsp").intern();

    /**
     * Identifier for the RSP.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    java.lang.String getId();
    
    /**
     * RSP name.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    java.lang.String getName();
    
    /**
     * A list of references to connection points.
     *
     *
     *
     * @return <code>java.util.List</code> <code>vnfdConnectionPointRef</code>, or <code>null</code> if not present
     */
    List<VnfdConnectionPointRef> getVnfdConnectionPointRef();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.nsd.base.rev170228.nsd.descriptor.common.vnffgd.RspKey</code> <code>key</code>, or <code>null</code> if not present
     */
    RspKey getKey();

}

