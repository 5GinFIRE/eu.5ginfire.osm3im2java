package ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.Rsp;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp.vnfr.connection.point.ref.ConnectionPointParams;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp.vnfr.connection.point.ref.ServiceFunctionForwarder;

import java.math.BigInteger;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list vnfr-connection-point-ref {
 *     key "hop-number";
 *     leaf hop-number {
 *         type uint8;
 *     }
 *     leaf service-function-type {
 *         type string;
 *     }
 *     leaf member-vnf-index-ref {
 *         type uint64;
 *     }
 *     leaf vnfd-id-ref {
 *         type string;
 *     }
 *     leaf vnfr-id-ref {
 *         type string;
 *     }
 *     leaf vnfr-name-ref {
 *         type string;
 *     }
 *     leaf vnfr-connection-point-ref {
 *         type leafref;
 *     }
 *     leaf service-index {
 *         type uint8;
 *     }
 *     container connection-point-params {
 *         leaf mgmt-address {
 *             type ip-address;
 *         }
 *         leaf name {
 *             type string;
 *         }
 *         leaf port-id {
 *             type string;
 *         }
 *         leaf vm-id {
 *             type string;
 *         }
 *         leaf address {
 *             type ip-address;
 *         }
 *         leaf port {
 *             type port-number;
 *         }
 *     }
 *     container service-function-forwarder {
 *         leaf name {
 *             type string;
 *         }
 *         leaf ip-address {
 *             type ip-address;
 *         }
 *         leaf port {
 *             type port-number;
 *         }
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/vnffgr/vnffgr/rsp/vnfr-connection-point-ref</i>
 * 
 * <p>To create instances of this class use {@link VnfrConnectionPointRefBuilder}.
 * @see VnfrConnectionPointRefBuilder
 * @see VnfrConnectionPointRefKey
 *
 */
public interface VnfrConnectionPointRef
    extends
    ChildOf<Rsp>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp.VnfrConnectionPointRef>,
    Identifiable<VnfrConnectionPointRefKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsr",
        "2017-02-08", "vnfr-connection-point-ref").intern();

    /**
     * Monotonically increasing number to show service path hoporder
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>hopNumber</code>, or <code>null</code> if not present
     */
    java.lang.Short getHopNumber();
    
    /**
     * Type of Service Function.NOTE: This needs to map with Service Function Type in 
     * ODL tosupport VNFFG. Service Function Type is mandatory param in ODLSFC. This is
     * temporarily set to string for ease of use
     *
     *
     *
     * @return <code>java.lang.String</code> <code>serviceFunctionType</code>, or <code>null</code> if not present
     */
    java.lang.String getServiceFunctionType();
    
    /**
     * @return <code>java.math.BigInteger</code> <code>memberVnfIndexRef</code>, or <code>null</code> if not present
     */
    BigInteger getMemberVnfIndexRef();
    
    /**
     * Reference to VNF Descriptor Id
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vnfdIdRef</code>, or <code>null</code> if not present
     */
    java.lang.String getVnfdIdRef();
    
    /**
     * A reference to a vnfr id
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vnfrIdRef</code>, or <code>null</code> if not present
     */
    java.lang.String getVnfrIdRef();
    
    /**
     * A reference to a vnfr name
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vnfrNameRef</code>, or <code>null</code> if not present
     */
    java.lang.String getVnfrNameRef();
    
    /**
     * A reference to a vnfr connection point.
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>vnfrConnectionPointRef</code>, or <code>null</code> if not present
     */
    java.lang.Object getVnfrConnectionPointRef();
    
    /**
     * Location within the service path
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>serviceIndex</code>, or <code>null</code> if not present
     */
    java.lang.Short getServiceIndex();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp.vnfr.connection.point.ref.ConnectionPointParams</code> <code>connectionPointParams</code>, or <code>null</code> if not present
     */
    ConnectionPointParams getConnectionPointParams();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp.vnfr.connection.point.ref.ServiceFunctionForwarder</code> <code>serviceFunctionForwarder</code>, or <code>null</code> if not present
     */
    ServiceFunctionForwarder getServiceFunctionForwarder();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp.VnfrConnectionPointRefKey</code> <code>key</code>, or <code>null</code> if not present
     */
    VnfrConnectionPointRefKey getKey();

}

