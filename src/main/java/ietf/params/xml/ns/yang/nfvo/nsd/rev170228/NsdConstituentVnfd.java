package ietf.params.xml.ns.yang.nfvo.nsd.rev170228;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.constituent.vnfd.ConstituentVnfd;

import java.util.List;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd</b>
 * <pre>
 * grouping nsd-constituent-vnfd {
 *     list constituent-vnfd {
 *         key "member-vnf-index";
 *         leaf member-vnf-index {
 *             type uint64;
 *         }
 *         leaf vnfd-id-ref {
 *             type leafref;
 *         }
 *         leaf start-by-default {
 *             type start-by-default;
 *         }
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd/nsd-constituent-vnfd</i>
 *
 */
public interface NsdConstituentVnfd
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsd",
        "2017-02-28", "nsd-constituent-vnfd").intern();

    /**
     * List of VNFDs that are part of thisnetwork service.
     *
     *
     *
     * @return <code>java.util.List</code> <code>constituentVnfd</code>, or <code>null</code> if not present
     */
    List<ConstituentVnfd> getConstituentVnfd();

}

