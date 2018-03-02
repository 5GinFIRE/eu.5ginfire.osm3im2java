package ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import http.riftio.vnfd.base.rev170228.CommonConnectionPoint;
import ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;
import ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid;
import ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.AssociatedVirtualCps;
import ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.Vnfr;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List for external connection points. Each VNF has oneor more external 
 * points. As the nameimplies that external connection points are used 
 * forconnecting the VNF to other VNFs or to external networks.Each VNF exposes 
 * these connection points to theorchestrator. The orchestrator can construct 
 * networkservices by connecting the connection points betweendifferent VNFs. The 
 * NFVO will use VLDs and VNFFGs atthe network service level to construct network 
 * services.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfr</b>
 * <pre>
 * list connection-point {
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
 *     leaf vlr-ref {
 *         type leafref;
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
 * <i>vnfr/project/(urn:ietf:params:xml:ns:yang:nfvo:vnfr?revision=2017-02-28)vnfr-catalog/vnfr/connection-point</i>
 * 
 * <p>To create instances of this class use {@link ConnectionPointBuilder}.
 * @see ConnectionPointBuilder
 * @see ConnectionPointKey
 *
 */
public interface ConnectionPoint
    extends
    ChildOf<Vnfr>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.ConnectionPoint>,
    CommonConnectionPoint,
    AssociatedVirtualCps,
    Identifiable<ConnectionPointKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:vnfr",
        "2017-02-28", "connection-point").intern();

    /**
     * Reference to the VLR associated with this connection point
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid</code> <code>vlrRef</code>, or <code>null</code> if not present
     */
    Uuid getVlrRef();
    
    /**
     * IP address assigned to the external connection point
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress</code> <code>ipAddress</code>, or <code>null</code> if not present
     */
    IpAddress getIpAddress();
    
    /**
     * MAC address assigned to the external connection point
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
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.ConnectionPointKey</code> <code>key</code>, or <code>null</code> if not present
     */
    ConnectionPointKey getKey();

}

