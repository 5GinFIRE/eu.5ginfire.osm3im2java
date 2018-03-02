package ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.project;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.Project1;
import ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.project.vnffgd.catalog.Vnffgd;

import java.util.List;

import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnffgd</b>
 * <pre>
 * container vnffgd-catalog {
 *     list vnffgd {
 *         key "id";
 *         leaf name {
 *             type string;
 *         }
 *         leaf id {
 *             type uuid;
 *         }
 *         leaf provider {
 *             type string;
 *         }
 *         leaf description {
 *             type string;
 *         }
 *         leaf version {
 *             type string;
 *         }
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnffgd/project/(urn:ietf:params:xml:ns:yang:nfvo:vnffgd?revision=2017-02-08)vnffgd-catalog</i>
 * 
 * <p>To create instances of this class use {@link VnffgdCatalogBuilder}.
 * @see VnffgdCatalogBuilder
 *
 */
public interface VnffgdCatalog
    extends
    ChildOf<Project1>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.project.VnffgdCatalog>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:vnffgd",
        "2017-02-08", "vnffgd-catalog").intern();

    /**
     * @return <code>java.util.List</code> <code>vnffgd</code>, or <code>null</code> if not present
     */
    List<Vnffgd> getVnffgd();

}

