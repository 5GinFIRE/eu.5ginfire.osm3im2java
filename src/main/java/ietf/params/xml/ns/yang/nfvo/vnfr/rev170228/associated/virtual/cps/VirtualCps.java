package ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.associated.virtual.cps;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import http.riftio.vnfd.base.rev170228.CommonConnectionPoint;
import ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;
import ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.AssociatedVirtualCps;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfr</b>
 * <pre>
 * list virtual-cps {
 *     key "name";
 *     leaf name {
 *         type string;
 *     }
 *     leaf id {
 *         type string;
 *     }
 *     leaf short-name {
 *         type string;
 *     }
 *     leaf type {
 *         type connection-point-type;
 *     }
 *     leaf port-security-enabled {
 *         type boolean;
 *     }
 *     leaf ip-address {
 *         type ip-address;
 *     }
 *     leaf mac-address {
 *         type string;
 *     }
 *     leaf connection-point-id {
 *         type string;
 *     }
 *     uses common-connection-point;
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfr/associated-virtual-cps/virtual-cps</i>
 * 
 * <p>To create instances of this class use {@link VirtualCpsBuilder}.
 * @see VirtualCpsBuilder
 * @see VirtualCpsKey
 *
 */
public interface VirtualCps
    extends
    ChildOf<AssociatedVirtualCps>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.associated.virtual.cps.VirtualCps>,
    CommonConnectionPoint,
    Identifiable<VirtualCpsKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:vnfr",
        "2017-02-28", "virtual-cps").intern();

    /**
     * IP address assigned to the virtual connection point
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress</code> <code>ipAddress</code>, or <code>null</code> if not present
     */
    IpAddress getIpAddress();
    
    /**
     * MAC address assigned to the virtual connection point
     *
     *
     *
     * @return <code>java.lang.String</code> <code>macAddress</code>, or <code>null</code> if not present
     */
    java.lang.String getMacAddress();
    
    /**
     * VIM identifier for connection point
     *
     *
     *
     * @return <code>java.lang.String</code> <code>connectionPointId</code>, or <code>null</code> if not present
     */
    java.lang.String getConnectionPointId();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.associated.virtual.cps.VirtualCpsKey</code> <code>key</code>, or <code>null</code> if not present
     */
    VirtualCpsKey getKey();

}

