package ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.VnffgrOperationalStatus;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.Classifier;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.Rsp;

import java.util.List;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list vnffgr {
 *     key "id";
 *     leaf id {
 *         type uuid;
 *     }
 *     leaf vnffgd-id-ref {
 *         type leafref;
 *     }
 *     leaf vnffgd-name-ref {
 *         type leafref;
 *     }
 *     leaf sdn-account {
 *         type string;
 *     }
 *     leaf cloud-account {
 *         type string;
 *     }
 *     leaf operational-status {
 *         type vnffgr-operational-status;
 *     }
 *     list rsp {
 *         key "id";
 *         leaf id {
 *             type uuid;
 *         }
 *         leaf name {
 *             type string;
 *         }
 *         leaf rsp-id {
 *             type uuid;
 *         }
 *         leaf vnffgd-rsp-id-ref {
 *             type leafref;
 *         }
 *         leaf vnffgd-rsp-name-ref {
 *             type leafref;
 *         }
 *         leaf classifier-name {
 *             type string;
 *         }
 *         leaf path-id {
 *             type uint32;
 *         }
 *         list vnfr-connection-point-ref {
 *             key "hop-number";
 *             leaf hop-number {
 *                 type uint8;
 *             }
 *             leaf service-function-type {
 *                 type string;
 *             }
 *             leaf member-vnf-index-ref {
 *                 type uint64;
 *             }
 *             leaf vnfd-id-ref {
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
 *             leaf service-index {
 *                 type uint8;
 *             }
 *             container connection-point-params {
 *                 leaf mgmt-address {
 *                     type ip-address;
 *                 }
 *                 leaf name {
 *                     type string;
 *                 }
 *                 leaf port-id {
 *                     type string;
 *                 }
 *                 leaf vm-id {
 *                     type string;
 *                 }
 *                 leaf address {
 *                     type ip-address;
 *                 }
 *                 leaf port {
 *                     type port-number;
 *                 }
 *             }
 *             container service-function-forwarder {
 *                 leaf name {
 *                     type string;
 *                 }
 *                 leaf ip-address {
 *                     type ip-address;
 *                 }
 *                 leaf port {
 *                     type port-number;
 *                 }
 *             }
 *         }
 *     }
 *     list classifier {
 *         key "id";
 *         leaf id {
 *             type uuid;
 *         }
 *         leaf name {
 *             type string;
 *         }
 *         leaf-list classifier-id {
 *             type uuid;
 *         }
 *         leaf rsp-id-ref {
 *             type leafref;
 *         }
 *         leaf rsp-name {
 *             type string;
 *         }
 *         leaf vnfr-id-ref {
 *             type string;
 *         }
 *         leaf vnfr-name-ref {
 *             type string;
 *         }
 *         leaf vnfr-connection-point-ref {
 *             type leafref;
 *         }
 *         leaf port-id {
 *             type string;
 *         }
 *         leaf vm-id {
 *             type string;
 *         }
 *         leaf ip-address {
 *             type string;
 *         }
 *         leaf sff-name {
 *             type string;
 *         }
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/vnffgr/vnffgr</i>
 * 
 * <p>To create instances of this class use {@link VnffgrBuilder}.
 * @see VnffgrBuilder
 * @see VnffgrKey
 *
 */
public interface Vnffgr
    extends
    ChildOf<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.Vnffgr>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.Vnffgr>,
    Identifiable<VnffgrKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsr",
        "2017-02-08", "vnffgr").intern();

    /**
     * Identifier for the VNFFGR.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid</code> <code>id</code>, or <code>null</code> if not present
     */
    Uuid getId();
    
    /**
     * VNFFG descriptor id reference
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>vnffgdIdRef</code>, or <code>null</code> if not present
     */
    java.lang.Object getVnffgdIdRef();
    
    /**
     * VNFFG descriptor name reference
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>vnffgdNameRef</code>, or <code>null</code> if not present
     */
    java.lang.Object getVnffgdNameRef();
    
    /**
     * The SDN account to use when requesting resources forthis vnffgr
     *
     *
     *
     * @return <code>java.lang.String</code> <code>sdnAccount</code>, or <code>null</code> if not present
     */
    java.lang.String getSdnAccount();
    
    /**
     * Cloud Account in which NSR is instantiated
     *
     *
     *
     * @return <code>java.lang.String</code> <code>cloudAccount</code>, or <code>null</code> if not present
     */
    java.lang.String getCloudAccount();
    
    /**
     * The operational status of the VNFFGR instance init : The VNFFGR has just 
     * started. running : The VNFFGR is in running state. terminate : The VNFFGR is 
     * being terminated. terminated : The VNFFGR is in the terminated state. failed : 
     * The VNFFGR instantiation failed
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.VnffgrOperationalStatus</code> <code>operationalStatus</code>, or <code>null</code> if not present
     */
    VnffgrOperationalStatus getOperationalStatus();
    
    /**
     * @return <code>java.util.List</code> <code>rsp</code>, or <code>null</code> if not present
     */
    List<Rsp> getRsp();
    
    /**
     * @return <code>java.util.List</code> <code>classifier</code>, or <code>null</code> if not present
     */
    List<Classifier> getClassifier();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.VnffgrKey</code> <code>key</code>, or <code>null</code> if not present
     */
    VnffgrKey getKey();

}

