package http.riftio.project.nsd.rev170228;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import http.riftio.project.nsd.rev170228.nsr.nsd.constituent.vnfd.ConstituentVnfd;

import java.util.List;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>project-nsd</b>
 * <pre>
 * grouping nsr-nsd-constituent-vnfd {
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
 * <i>project-nsd/nsr-nsd-constituent-vnfd</i>
 *
 */
public interface NsrNsdConstituentVnfd
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("http://riftio.com/ns/riftware-1.0/project-nsd",
        "2017-02-28", "nsr-nsd-constituent-vnfd").intern();

    /**
     * List of VNFDs that are part of thisnetwork service.
     *
     *
     *
     * @return <code>java.util.List</code> <code>constituentVnfd</code>, or <code>null</code> if not present
     */
    List<ConstituentVnfd> getConstituentVnfd();

}

