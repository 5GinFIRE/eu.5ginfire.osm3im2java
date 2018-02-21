package http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import http.riftio.vnfd.base.rev170228.vnfd.descriptor.MgmtInterface;
import ietf.params.xml.ns.yang.ietf.inet.types.rev130715.PortNumber;

import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Parameters for the VNF dashboard
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * container dashboard-params {
 *     leaf path {
 *         type string;
 *     }
 *     leaf https {
 *         type boolean;
 *     }
 *     leaf port {
 *         type port-number;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/mgmt-interface/dashboard-params</i>
 * 
 * <p>To create instances of this class use {@link DashboardParamsBuilder}.
 * @see DashboardParamsBuilder
 *
 */
public interface DashboardParams
    extends
    ChildOf<MgmtInterface>,
    Augmentable<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.DashboardParams>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("http://riftio.com/ns/riftware-1.0/vnfd-base",
        "2017-02-28", "dashboard-params").intern();

    /**
     * The HTTP path for the dashboard
     *
     *
     *
     * @return <code>java.lang.String</code> <code>path</code>, or <code>null</code> if not present
     */
    java.lang.String getPath();
    
    /**
     * Pick HTTPS instead of HTTP , Default is false
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>https</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isHttps();
    
    /**
     * The HTTP port for the dashboard
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.PortNumber</code> <code>port</code>, or <code>null</code> if not present
     */
    PortNumber getPort();

}

