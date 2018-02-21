package ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.Vnffgr;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp.VnfrConnectionPointRef;

import java.util.List;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list rsp {
 *     key "id";
 *     leaf id {
 *         type uuid;
 *     }
 *     leaf name {
 *         type string;
 *     }
 *     leaf rsp-id {
 *         type uuid;
 *     }
 *     leaf vnffgd-rsp-id-ref {
 *         type leafref;
 *     }
 *     leaf vnffgd-rsp-name-ref {
 *         type leafref;
 *     }
 *     leaf classifier-name {
 *         type string;
 *     }
 *     leaf path-id {
 *         type uint32;
 *     }
 *     list vnfr-connection-point-ref {
 *         key "hop-number";
 *         leaf hop-number {
 *             type uint8;
 *         }
 *         leaf service-function-type {
 *             type string;
 *         }
 *         leaf member-vnf-index-ref {
 *             type uint64;
 *         }
 *         leaf vnfd-id-ref {
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
 *         leaf service-index {
 *             type uint8;
 *         }
 *         container connection-point-params {
 *             leaf mgmt-address {
 *                 type ip-address;
 *             }
 *             leaf name {
 *                 type string;
 *             }
 *             leaf port-id {
 *                 type string;
 *             }
 *             leaf vm-id {
 *                 type string;
 *             }
 *             leaf address {
 *                 type ip-address;
 *             }
 *             leaf port {
 *                 type port-number;
 *             }
 *         }
 *         container service-function-forwarder {
 *             leaf name {
 *                 type string;
 *             }
 *             leaf ip-address {
 *                 type ip-address;
 *             }
 *             leaf port {
 *                 type port-number;
 *             }
 *         }
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/vnffgr/vnffgr/rsp</i>
 * 
 * <p>To create instances of this class use {@link RspBuilder}.
 * @see RspBuilder
 * @see RspKey
 *
 */
public interface Rsp
    extends
    ChildOf<Vnffgr>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.Rsp>,
    Identifiable<RspKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsr",
        "2017-02-08", "rsp").intern();

    /**
     * Identifier for the RSP.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid</code> <code>id</code>, or <code>null</code> if not present
     */
    Uuid getId();
    
    /**
     * Name for the RSP
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    java.lang.String getName();
    
    /**
     * Returned Identifier for the RSP.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid</code> <code>rspId</code>, or <code>null</code> if not present
     */
    Uuid getRspId();
    
    /**
     * Identifier for the VNFFG Descriptor RSP reference
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>vnffgdRspIdRef</code>, or <code>null</code> if not present
     */
    java.lang.Object getVnffgdRspIdRef();
    
    /**
     * Name for the VNFFG Descriptor RSP reference
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>vnffgdRspNameRef</code>, or <code>null</code> if not present
     */
    java.lang.Object getVnffgdRspNameRef();
    
    /**
     * @return <code>java.lang.String</code> <code>classifierName</code>, or <code>null</code> if not present
     */
    java.lang.String getClassifierName();
    
    /**
     * Unique Identifier for the service path
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>pathId</code>, or <code>null</code> if not present
     */
    java.lang.Long getPathId();
    
    /**
     * @return <code>java.util.List</code> <code>vnfrConnectionPointRef</code>, or <code>null</code> if not present
     */
    List<VnfrConnectionPointRef> getVnfrConnectionPointRef();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.RspKey</code> <code>key</code>, or <code>null</code> if not present
     */
    RspKey getKey();

}

