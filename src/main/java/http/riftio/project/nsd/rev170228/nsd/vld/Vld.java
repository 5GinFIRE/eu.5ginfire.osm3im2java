package http.riftio.project.nsd.rev170228.nsd.vld;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import http.riftio.nsd.base.rev170228.NsdVldCommon;
import http.riftio.project.nsd.rev170228.NsdVld;
import http.riftio.project.nsd.rev170228.nsd.vld.vld.VnfdConnectionPointRef;

import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>project-nsd</b>
 * <pre>
 * list vld {
 *     key "id";
 *     leaf id {
 *         type string;
 *     }
 *     leaf name {
 *         type string;
 *     }
 *     leaf short-name {
 *         type string;
 *     }
 *     leaf vendor {
 *         type string;
 *     }
 *     leaf description {
 *         type string;
 *     }
 *     leaf version {
 *         type string;
 *     }
 *     leaf type {
 *         type virtual-link-type;
 *     }
 *     leaf root-bandwidth {
 *         type uint64;
 *     }
 *     leaf leaf-bandwidth {
 *         type uint64;
 *     }
 *     leaf mgmt-network {
 *         type mgmt-network;
 *     }
 *     choice init-params {
 *         case vim-network-profile {
 *             leaf ip-profile-ref {
 *                 type string;
 *             }
 *         }
 *         case vim-network-ref {
 *             leaf vim-network-name {
 *                 type string;
 *             }
 *         }
 *     }
 *     container provider-network {
 *         leaf physical-network {
 *             type string;
 *         }
 *         leaf segmentation_id {
 *             type uint32;
 *         }
 *     }
 *     list vnfd-connection-point-ref {
 *         key "member-vnf-index-ref" "vnfd-connection-point-ref";
 *         leaf member-vnf-index-ref {
 *             type string;
 *         }
 *         leaf vnfd-id-ref {
 *             type leafref;
 *         }
 *         leaf vnfd-connection-point-ref {
 *             type leafref;
 *         }
 *     }
 *     uses nsd-vld-common;
 * }
 * </pre>The schema path to identify an instance is
 * <i>project-nsd/nsd-vld/vld</i>
 * 
 * <p>To create instances of this class use {@link VldBuilder}.
 * @see VldBuilder
 * @see VldKey
 *
 */
public interface Vld
    extends
    ChildOf<NsdVld>,
    Augmentable<http.riftio.project.nsd.rev170228.nsd.vld.Vld>,
    NsdVldCommon,
    Identifiable<VldKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("http://riftio.com/ns/riftware-1.0/project-nsd",
        "2017-02-28", "vld").intern();

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
     * @return <code>org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.project.nsd.rev170228.nsd.vld.VldKey</code> <code>key</code>, or <code>null</code> if not present
     */
    VldKey getKey();

}

