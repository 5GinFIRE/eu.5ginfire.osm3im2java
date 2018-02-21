package http.riftio.nsd.base.rev170228.nsd.descriptor.common;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import http.riftio.nsd.base.rev170228.NsdDescriptorCommon;
import http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.Classifier;
import http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.Rsp;

import java.util.List;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of VNF Forwarding Graph Descriptors (VNFFGD).
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd-base</b>
 * <pre>
 * list vnffgd {
 *     key "id";
 *     leaf id {
 *         type string;
 *     }
 *     leaf name {
 *         type string;
 *     }
 *     leaf short-name {
 *         type string;
 *     }
 *     leaf vendor {
 *         type string;
 *     }
 *     leaf description {
 *         type string;
 *     }
 *     leaf version {
 *         type string;
 *     }
 *     list rsp {
 *         key "id";
 *         leaf id {
 *             type string;
 *         }
 *         leaf name {
 *             type string;
 *         }
 *         list vnfd-connection-point-ref {
 *             key "member-vnf-index-ref";
 *             leaf member-vnf-index-ref {
 *                 type string;
 *             }
 *             leaf order {
 *                 type uint8;
 *             }
 *             leaf vnfd-id-ref {
 *                 type leafref;
 *             }
 *             leaf vnfd-connection-point-ref {
 *                 type string;
 *             }
 *         }
 *     }
 *     list classifier {
 *         key "id";
 *         leaf id {
 *             type string;
 *         }
 *         leaf name {
 *             type string;
 *         }
 *         leaf rsp-id-ref {
 *             type leafref;
 *         }
 *         leaf member-vnf-index-ref {
 *             type string;
 *         }
 *         leaf vnfd-id-ref {
 *             type leafref;
 *         }
 *         leaf vnfd-connection-point-ref {
 *             type string;
 *         }
 *         list match-attributes {
 *             key "id";
 *             leaf id {
 *                 type string;
 *             }
 *             leaf ip-proto {
 *                 type uint8;
 *             }
 *             leaf source-ip-address {
 *                 type ip-address;
 *             }
 *             leaf destination-ip-address {
 *                 type ip-address;
 *             }
 *             leaf source-port {
 *                 type port-number;
 *             }
 *             leaf destination-port {
 *                 type port-number;
 *             }
 *         }
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd-base/nsd-descriptor-common/vnffgd</i>
 * 
 * <p>To create instances of this class use {@link VnffgdBuilder}.
 * @see VnffgdBuilder
 * @see VnffgdKey
 *
 */
public interface Vnffgd
    extends
    ChildOf<NsdDescriptorCommon>,
    Augmentable<http.riftio.nsd.base.rev170228.nsd.descriptor.common.Vnffgd>,
    Identifiable<VnffgdKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("http://riftio.com/ns/riftware-1.0/nsd-base",
        "2017-02-28", "vnffgd").intern();

    /**
     * Identifier for the VNFFGD.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    java.lang.String getId();
    
    /**
     * VNFFGD name.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    java.lang.String getName();
    
    /**
     * Short name to appear as label in the UI
     *
     *
     *
     * @return <code>java.lang.String</code> <code>shortName</code>, or <code>null</code> if not present
     */
    java.lang.String getShortName();
    
    /**
     * Provider of the VNFFGD.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vendor</code>, or <code>null</code> if not present
     */
    java.lang.String getVendor();
    
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
     * List of Rendered Service Paths (RSP).
     *
     *
     *
     * @return <code>java.util.List</code> <code>rsp</code>, or <code>null</code> if not present
     */
    List<Rsp> getRsp();
    
    /**
     * List of classifier rules.
     *
     *
     *
     * @return <code>java.util.List</code> <code>classifier</code>, or <code>null</code> if not present
     */
    List<Classifier> getClassifier();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.nsd.base.rev170228.nsd.descriptor.common.VnffgdKey</code> <code>key</code>, or <code>null</code> if not present
     */
    VnffgdKey getKey();

}

