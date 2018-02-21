package ietf.params.xml.ns.yang.nfvo.nsr.rev170208;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * grouping vnffgr {
 *     list vnffgr {
 *         key "id";
 *         leaf id {
 *             type uuid;
 *         }
 *         leaf vnffgd-id-ref {
 *             type leafref;
 *         }
 *         leaf vnffgd-name-ref {
 *             type leafref;
 *         }
 *         leaf sdn-account {
 *             type string;
 *         }
 *         leaf cloud-account {
 *             type string;
 *         }
 *         leaf operational-status {
 *             type vnffgr-operational-status;
 *         }
 *         list rsp {
 *             key "id";
 *             leaf id {
 *                 type uuid;
 *             }
 *             leaf name {
 *                 type string;
 *             }
 *             leaf rsp-id {
 *                 type uuid;
 *             }
 *             leaf vnffgd-rsp-id-ref {
 *                 type leafref;
 *             }
 *             leaf vnffgd-rsp-name-ref {
 *                 type leafref;
 *             }
 *             leaf classifier-name {
 *                 type string;
 *             }
 *             leaf path-id {
 *                 type uint32;
 *             }
 *             list vnfr-connection-point-ref {
 *                 key "hop-number";
 *                 leaf hop-number {
 *                     type uint8;
 *                 }
 *                 leaf service-function-type {
 *                     type string;
 *                 }
 *                 leaf member-vnf-index-ref {
 *                     type uint64;
 *                 }
 *                 leaf vnfd-id-ref {
 *                     type string;
 *                 }
 *                 leaf vnfr-id-ref {
 *                     type string;
 *                 }
 *                 leaf vnfr-name-ref {
 *                     type string;
 *                 }
 *                 leaf vnfr-connection-point-ref {
 *                     type leafref;
 *                 }
 *                 leaf service-index {
 *                     type uint8;
 *                 }
 *                 container connection-point-params {
 *                     leaf mgmt-address {
 *                         type ip-address;
 *                     }
 *                     leaf name {
 *                         type string;
 *                     }
 *                     leaf port-id {
 *                         type string;
 *                     }
 *                     leaf vm-id {
 *                         type string;
 *                     }
 *                     leaf address {
 *                         type ip-address;
 *                     }
 *                     leaf port {
 *                         type port-number;
 *                     }
 *                 }
 *                 container service-function-forwarder {
 *                     leaf name {
 *                         type string;
 *                     }
 *                     leaf ip-address {
 *                         type ip-address;
 *                     }
 *                     leaf port {
 *                         type port-number;
 *                     }
 *                 }
 *             }
 *         }
 *         list classifier {
 *             key "id";
 *             leaf id {
 *                 type uuid;
 *             }
 *             leaf name {
 *                 type string;
 *             }
 *             leaf-list classifier-id {
 *                 type uuid;
 *             }
 *             leaf rsp-id-ref {
 *                 type leafref;
 *             }
 *             leaf rsp-name {
 *                 type string;
 *             }
 *             leaf vnfr-id-ref {
 *                 type string;
 *             }
 *             leaf vnfr-name-ref {
 *                 type string;
 *             }
 *             leaf vnfr-connection-point-ref {
 *                 type leafref;
 *             }
 *             leaf port-id {
 *                 type string;
 *             }
 *             leaf vm-id {
 *                 type string;
 *             }
 *             leaf ip-address {
 *                 type string;
 *             }
 *             leaf sff-name {
 *                 type string;
 *             }
 *         }
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/vnffgr</i>
 *
 */
public interface Vnffgr
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsr",
        "2017-02-08", "vnffgr").intern();

    /**
     * @return <code>java.util.List</code> <code>vnffgr</code>, or <code>null</code> if not present
     */
    List<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.Vnffgr> getVnffgr();

}

