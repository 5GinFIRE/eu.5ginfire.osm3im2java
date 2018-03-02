package http.riftio.nsd.base.rev170228.nsd.vld.common;
import org.opendaylight.yangtools.yang.binding.DataContainer;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Extra parameters for VLD instantiation
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd-base</b>
 * <pre>
 * choice init-params {
 *     case vim-network-profile {
 *         leaf ip-profile-ref {
 *             type string;
 *         }
 *     }
 *     case vim-network-ref {
 *         leaf vim-network-name {
 *             type string;
 *         }
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd-base/nsd-vld-common/init-params</i>
 *
 */
public interface InitParams
    extends
    DataContainer
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("http://riftio.com/ns/riftware-1.0/nsd-base",
        "2017-02-28", "init-params").intern();


}

