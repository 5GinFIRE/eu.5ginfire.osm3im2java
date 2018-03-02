package http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface;
import org.opendaylight.yangtools.yang.binding.DataContainer;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Indicates the type of management endpoint.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * choice endpoint-type {
 *     case cp {
 *         leaf cp {
 *             type string;
 *         }
 *     }
 *     case ip {
 *         leaf ip-address {
 *             type ip-address;
 *         }
 *     }
 *     case vdu-id {
 *         leaf vdu-id {
 *             type string;
 *         }
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/mgmt-interface/endpoint-type</i>
 *
 */
public interface EndpointType
    extends
    DataContainer
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("http://riftio.com/ns/riftware-1.0/vnfd-base",
        "2017-02-28", "endpoint-type").intern();


}

