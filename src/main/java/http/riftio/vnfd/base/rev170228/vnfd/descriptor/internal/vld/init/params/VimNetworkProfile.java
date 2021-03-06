package http.riftio.vnfd.base.rev170228.vnfd.descriptor.internal.vld.init.params;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import http.riftio.vnfd.base.rev170228.vnfd.descriptor.internal.vld.InitParams;

import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * case vim-network-profile {
 *     leaf ip-profile-ref {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/internal-vld/init-params/vim-network-profile</i>
 *
 */
public interface VimNetworkProfile
    extends
    DataObject,
    Augmentable<http.riftio.vnfd.base.rev170228.vnfd.descriptor.internal.vld.init.params.VimNetworkProfile>,
    InitParams
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("http://riftio.com/ns/riftware-1.0/vnfd-base",
        "2017-02-28", "vim-network-profile").intern();

    /**
     * Named reference to IP-profile object
     *
     *
     *
     * @return <code>java.lang.String</code> <code>ipProfileRef</code>, or <code>null</code> if not present
     */
    java.lang.String getIpProfileRef();

}

