package ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import http.riftio.vnfd.base.rev170228.CommonConnectionPoint;
import ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;
import ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.AssociatedVirtualCps;
import ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.Vdur;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List for internal connection points. Each VNFChas zero or more internal 
 * connection points.Internal connection points are used for connectingthe VNF 
 * components internal to the VNF. If a VNFhas only one VNFC, it may not have any 
 * internalconnection points.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfr</b>
 * <pre>
 * list internal-connection-point {
 *     key "id";
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
 *     list virtual-cps {
 *         key "name";
 *         leaf ip-address {
 *             type ip-address;
 *         }
 *         leaf mac-address {
 *             type string;
 *         }
 *         leaf connection-point-id {
 *             type string;
 *         }
 *         leaf name {
 *             type string;
 *         }
 *         leaf id {
 *             type string;
 *         }
 *         leaf short-name {
 *             type string;
 *         }
 *         leaf type {
 *             type connection-point-type;
 *         }
 *         leaf port-security-enabled {
 *             type boolean;
 *         }
 *         uses common-connection-point;
 *     }
 *     uses common-connection-point;
 *     uses associated-virtual-cps;
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfr/project/(urn:ietf:params:xml:ns:yang:nfvo:vnfr?revision=2017-02-28)vnfr-catalog/vnfr/vdur/internal-connection-point</i>
 * 
 * <p>To create instances of this class use {@link InternalConnectionPointBuilder}.
 * @see InternalConnectionPointBuilder
 * @see InternalConnectionPointKey
 *
 */
public interface InternalConnectionPoint
    extends
    ChildOf<Vdur>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.InternalConnectionPoint>,
    CommonConnectionPoint,
    AssociatedVirtualCps,
    Identifiable<InternalConnectionPointKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:vnfr",
        "2017-02-28", "internal-connection-point").intern();

    /**
     * IP address assigned to the internal connection point
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress</code> <code>ipAddress</code>, or <code>null</code> if not present
     */
    IpAddress getIpAddress();
    
    /**
     * MAC address assigned to the internal connection point
     *
     *
     *
     * @return <code>java.lang.String</code> <code>macAddress</code>, or <code>null</code> if not present
     */
    java.lang.String getMacAddress();
    
    /**
     * @return <code>java.lang.String</code> <code>connectionPointId</code>, or <code>null</code> if not present
     */
    java.lang.String getConnectionPointId();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.InternalConnectionPointKey</code> <code>key</code>, or <code>null</code> if not present
     */
    InternalConnectionPointKey getKey();

}

