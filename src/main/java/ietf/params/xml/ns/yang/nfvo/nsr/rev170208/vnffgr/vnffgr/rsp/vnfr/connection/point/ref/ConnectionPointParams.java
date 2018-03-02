package ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp.vnfr.connection.point.ref;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;
import ietf.params.xml.ns.yang.ietf.inet.types.rev130715.PortNumber;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp.VnfrConnectionPointRef;

import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * container connection-point-params {
 *     leaf mgmt-address {
 *         type ip-address;
 *     }
 *     leaf name {
 *         type string;
 *     }
 *     leaf port-id {
 *         type string;
 *     }
 *     leaf vm-id {
 *         type string;
 *     }
 *     leaf address {
 *         type ip-address;
 *     }
 *     leaf port {
 *         type port-number;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/vnffgr/vnffgr/rsp/vnfr-connection-point-ref/connection-point-params</i>
 * 
 * <p>To create instances of this class use {@link ConnectionPointParamsBuilder}.
 * @see ConnectionPointParamsBuilder
 *
 */
public interface ConnectionPointParams
    extends
    ChildOf<VnfrConnectionPointRef>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp.vnfr.connection.point.ref.ConnectionPointParams>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsr",
        "2017-02-08", "connection-point-params").intern();

    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress</code> <code>mgmtAddress</code>, or <code>null</code> if not present
     */
    IpAddress getMgmtAddress();
    
    /**
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    java.lang.String getName();
    
    /**
     * @return <code>java.lang.String</code> <code>portId</code>, or <code>null</code> if not present
     */
    java.lang.String getPortId();
    
    /**
     * @return <code>java.lang.String</code> <code>vmId</code>, or <code>null</code> if not present
     */
    java.lang.String getVmId();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress</code> <code>address</code>, or <code>null</code> if not present
     */
    IpAddress getAddress();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.PortNumber</code> <code>port</code>, or <code>null</code> if not present
     */
    PortNumber getPort();

}

