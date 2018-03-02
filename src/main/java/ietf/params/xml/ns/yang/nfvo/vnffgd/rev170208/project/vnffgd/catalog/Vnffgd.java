package ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.project.vnffgd.catalog;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid;
import ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.project.VnffgdCatalog;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnffgd</b>
 * <pre>
 * list vnffgd {
 *     key "id";
 *     leaf name {
 *         type string;
 *     }
 *     leaf id {
 *         type uuid;
 *     }
 *     leaf provider {
 *         type string;
 *     }
 *     leaf description {
 *         type string;
 *     }
 *     leaf version {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnffgd/project/(urn:ietf:params:xml:ns:yang:nfvo:vnffgd?revision=2017-02-08)vnffgd-catalog/vnffgd</i>
 * 
 * <p>To create instances of this class use {@link VnffgdBuilder}.
 * @see VnffgdBuilder
 * @see VnffgdKey
 *
 */
public interface Vnffgd
    extends
    ChildOf<VnffgdCatalog>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.project.vnffgd.catalog.Vnffgd>,
    Identifiable<VnffgdKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:vnffgd",
        "2017-02-08", "vnffgd").intern();

    /**
     * VNF Forwarding Graph Descriptor name.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    java.lang.String getName();
    
    /**
     * Identifier for the VNFFGD.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid</code> <code>id</code>, or <code>null</code> if not present
     */
    Uuid getId();
    
    /**
     * Provider of the VNFFGD.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>provider</code>, or <code>null</code> if not present
     */
    java.lang.String getProvider();
    
    /**
     * Description of the VNFFGD.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>description</code>, or <code>null</code> if not present
     */
    java.lang.String getDescription();
    
    /**
     * Version of the VNFFGD
     *
     *
     *
     * @return <code>java.lang.String</code> <code>version</code>, or <code>null</code> if not present
     */
    java.lang.String getVersion();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.project.vnffgd.catalog.VnffgdKey</code> <code>key</code>, or <code>null</code> if not present
     */
    VnffgdKey getKey();

}

