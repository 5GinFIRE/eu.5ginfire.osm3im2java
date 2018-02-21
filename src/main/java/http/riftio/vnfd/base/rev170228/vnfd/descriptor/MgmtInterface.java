package http.riftio.vnfd.base.rev170228.vnfd.descriptor;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import http.riftio.vnfd.base.rev170228.VnfdDescriptor;
import http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.DashboardParams;
import http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.EndpointType;
import ietf.params.xml.ns.yang.ietf.inet.types.rev130715.PortNumber;

import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Interface over which the VNF is managed.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * container mgmt-interface {
 *     choice endpoint-type {
 *         case cp {
 *             leaf cp {
 *                 type string;
 *             }
 *         }
 *         case ip {
 *             leaf ip-address {
 *                 type ip-address;
 *             }
 *         }
 *         case vdu-id {
 *             leaf vdu-id {
 *                 type string;
 *             }
 *         }
 *     }
 *     leaf port {
 *         type port-number;
 *     }
 *     container dashboard-params {
 *         leaf path {
 *             type string;
 *         }
 *         leaf https {
 *             type boolean;
 *         }
 *         leaf port {
 *             type port-number;
 *         }
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/mgmt-interface</i>
 * 
 * <p>To create instances of this class use {@link MgmtInterfaceBuilder}.
 * @see MgmtInterfaceBuilder
 *
 */
public interface MgmtInterface
    extends
    ChildOf<VnfdDescriptor>,
    Augmentable<http.riftio.vnfd.base.rev170228.vnfd.descriptor.MgmtInterface>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("http://riftio.com/ns/riftware-1.0/vnfd-base",
        "2017-02-28", "mgmt-interface").intern();

    /**
     * Indicates the type of management endpoint.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.EndpointType</code> <code>endpointType</code>, or <code>null</code> if not present
     */
    EndpointType getEndpointType();
    
    /**
     * Port for the management interface.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.PortNumber</code> <code>port</code>, or <code>null</code> if not present
     */
    PortNumber getPort();
    
    /**
     * Parameters for the VNF dashboard
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.DashboardParams</code> <code>dashboardParams</code>, or <code>null</code> if not present
     */
    DashboardParams getDashboardParams();

}

