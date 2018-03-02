package http.riftio.vnfd.base.rev170228;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * grouping virtual-interface {
 *     container virtual-interface {
 *         leaf type {
 *             type type;
 *         }
 *         leaf vpci {
 *             type string;
 *         }
 *         leaf bandwidth {
 *             type uint64;
 *         }
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/virtual-interface</i>
 *
 */
public interface VirtualInterface
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("http://riftio.com/ns/riftware-1.0/vnfd-base",
        "2017-02-28", "virtual-interface").intern();

    /**
     * Container for the virtual interface properties
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.vnfd.base.rev170228.virtual._interface.VirtualInterface</code> <code>virtualInterface</code>, or <code>null</code> if not present
     */
    http.riftio.vnfd.base.rev170228.virtual._interface.VirtualInterface getVirtualInterface();

}

