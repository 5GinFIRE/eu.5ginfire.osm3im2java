package http.riftio.nsd.base.rev170228.nsd.vld.common.init.params;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import http.riftio.nsd.base.rev170228.nsd.vld.common.InitParams;

import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd-base</b>
 * <pre>
 * case vim-network-ref {
 *     leaf vim-network-name {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd-base/nsd-vld-common/init-params/vim-network-ref</i>
 *
 */
public interface VimNetworkRef
    extends
    DataObject,
    Augmentable<http.riftio.nsd.base.rev170228.nsd.vld.common.init.params.VimNetworkRef>,
    InitParams
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("http://riftio.com/ns/riftware-1.0/nsd-base",
        "2017-02-28", "vim-network-ref").intern();

    /**
     * Name of network in VIM account. This is used to indicate pre-provisioned network
     * name in cloud account.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vimNetworkName</code>, or <code>null</code> if not present
     */
    java.lang.String getVimNetworkName();

}

