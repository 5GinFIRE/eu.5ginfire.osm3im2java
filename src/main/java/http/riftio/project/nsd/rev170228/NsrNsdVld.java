package http.riftio.project.nsd.rev170228;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import http.riftio.project.nsd.rev170228.nsr.nsd.vld.Vld;

import java.util.List;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>project-nsd</b>
 * <pre>
 * grouping nsr-nsd-vld {
 *     list vld {
 *         key "id";
 *         leaf id {
 *             type string;
 *         }
 *         leaf name {
 *             type string;
 *         }
 *         leaf short-name {
 *             type string;
 *         }
 *         leaf vendor {
 *             type string;
 *         }
 *         leaf description {
 *             type string;
 *         }
 *         leaf version {
 *             type string;
 *         }
 *         leaf type {
 *             type virtual-link-type;
 *         }
 *         leaf root-bandwidth {
 *             type uint64;
 *         }
 *         leaf leaf-bandwidth {
 *             type uint64;
 *         }
 *         leaf mgmt-network {
 *             type mgmt-network;
 *         }
 *         choice init-params {
 *             case vim-network-profile {
 *                 leaf ip-profile-ref {
 *                     type string;
 *                 }
 *             }
 *             case vim-network-ref {
 *                 leaf vim-network-name {
 *                     type string;
 *                 }
 *             }
 *         }
 *         container provider-network {
 *             leaf physical-network {
 *                 type string;
 *             }
 *             leaf segmentation_id {
 *                 type uint32;
 *             }
 *         }
 *         list vnfd-connection-point-ref {
 *             key "member-vnf-index-ref" "vnfd-connection-point-ref";
 *             leaf member-vnf-index-ref {
 *                 type string;
 *             }
 *             leaf vnfd-id-ref {
 *                 type string;
 *             }
 *             leaf vnfd-connection-point-ref {
 *                 type leafref;
 *             }
 *         }
 *         uses nsd-vld-common;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>project-nsd/nsr-nsd-vld</i>
 *
 */
public interface NsrNsdVld
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("http://riftio.com/ns/riftware-1.0/project-nsd",
        "2017-02-28", "nsr-nsd-vld").intern();

    /**
     * @return <code>java.util.List</code> <code>vld</code>, or <code>null</code> if not present
     */
    List<Vld> getVld();

}

