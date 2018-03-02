package http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu._interface;
import org.opendaylight.yangtools.yang.binding.DataContainer;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * choice connection-point-type {
 *     case external {
 *         leaf external-connection-point-ref {
 *             type string;
 *         }
 *     }
 *     case internal {
 *         leaf internal-connection-point-ref {
 *             type string;
 *         }
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/vdu/interface/connection-point-type</i>
 *
 */
public interface ConnectionPointType
    extends
    DataContainer
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("http://riftio.com/ns/riftware-1.0/vnfd-base",
        "2017-02-28", "connection-point-type").intern();


}

