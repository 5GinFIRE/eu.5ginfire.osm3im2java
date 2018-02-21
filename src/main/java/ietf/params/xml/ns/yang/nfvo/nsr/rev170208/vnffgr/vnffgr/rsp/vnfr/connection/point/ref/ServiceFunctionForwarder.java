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
 * container service-function-forwarder {
 *     leaf name {
 *         type string;
 *     }
 *     leaf ip-address {
 *         type ip-address;
 *     }
 *     leaf port {
 *         type port-number;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/vnffgr/vnffgr/rsp/vnfr-connection-point-ref/service-function-forwarder</i>
 * 
 * <p>To create instances of this class use {@link ServiceFunctionForwarderBuilder}.
 * @see ServiceFunctionForwarderBuilder
 *
 */
public interface ServiceFunctionForwarder
    extends
    ChildOf<VnfrConnectionPointRef>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp.vnfr.connection.point.ref.ServiceFunctionForwarder>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsr",
        "2017-02-08", "service-function-forwarder").intern();

    /**
     * Service Function Forwarder name
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    java.lang.String getName();
    
    /**
     * Data Plane IP Address of the SFF
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress</code> <code>ipAddress</code>, or <code>null</code> if not present
     */
    IpAddress getIpAddress();
    
    /**
     * Data Plane Port of the SFF
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.PortNumber</code> <code>port</code>, or <code>null</code> if not present
     */
    PortNumber getPort();

}

