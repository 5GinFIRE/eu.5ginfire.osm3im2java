package http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import http.riftio.nsd.base.rev170228.nsd.descriptor.common.Vnffgd;
import http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.classifier.MatchAttributes;

import java.util.List;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of classifier rules.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd-base</b>
 * <pre>
 * list classifier {
 *     key "id";
 *     leaf id {
 *         type string;
 *     }
 *     leaf name {
 *         type string;
 *     }
 *     leaf rsp-id-ref {
 *         type leafref;
 *     }
 *     leaf member-vnf-index-ref {
 *         type string;
 *     }
 *     leaf vnfd-id-ref {
 *         type leafref;
 *     }
 *     leaf vnfd-connection-point-ref {
 *         type string;
 *     }
 *     list match-attributes {
 *         key "id";
 *         leaf id {
 *             type string;
 *         }
 *         leaf ip-proto {
 *             type uint8;
 *         }
 *         leaf source-ip-address {
 *             type ip-address;
 *         }
 *         leaf destination-ip-address {
 *             type ip-address;
 *         }
 *         leaf source-port {
 *             type port-number;
 *         }
 *         leaf destination-port {
 *             type port-number;
 *         }
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd-base/nsd-descriptor-common/vnffgd/classifier</i>
 * 
 * <p>To create instances of this class use {@link ClassifierBuilder}.
 * @see ClassifierBuilder
 * @see ClassifierKey
 *
 */
public interface Classifier
    extends
    ChildOf<Vnffgd>,
    Augmentable<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.Classifier>,
    Identifiable<ClassifierKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("http://riftio.com/ns/riftware-1.0/nsd-base",
        "2017-02-28", "classifier").intern();

    /**
     * Identifier for the classifier rule.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    java.lang.String getId();
    
    /**
     * Name of the classifier.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    java.lang.String getName();
    
    /**
     * A reference to the RSP.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>rspIdRef</code>, or <code>null</code> if not present
     */
    java.lang.String getRspIdRef();
    
    /**
     * Reference to member-vnf within constituent-vnfds
     *
     *
     *
     * @return <code>java.lang.String</code> <code>memberVnfIndexRef</code>, or <code>null</code> if not present
     */
    java.lang.String getMemberVnfIndexRef();
    
    /**
     * A reference to a vnfd. This is a leafref to path: ../../../nsd:constituent-vnfd 
     * + [nsd:id = current()/../nsd:id-ref] + /nsd:vnfd-id-ref
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>vnfdIdRef</code>, or <code>null</code> if not present
     */
    java.lang.Object getVnfdIdRef();
    
    /**
     * A reference to a connection point name in a vnfd. This is a leafref to path: 
     * /vnfd:vnfd-catalog/vnfd:vnfd + [vnfd:id = current()/../nsd:vnfd-id-ref] + 
     * /vnfd:connection-point/vnfd:name NOTE: An issue with confd is preventing the use
     * of xpath. Seems to be an issue with leafref to leafref, whose target is in a 
     * different module. Once that is resolved this will switched to use leafref
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vnfdConnectionPointRef</code>, or <code>null</code> if not present
     */
    java.lang.String getVnfdConnectionPointRef();
    
    /**
     * List of match attributes.
     *
     *
     *
     * @return <code>java.util.List</code> <code>matchAttributes</code>, or <code>null</code> if not present
     */
    List<MatchAttributes> getMatchAttributes();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.nsd.base.rev170228.nsd.descriptor.common.vnffgd.ClassifierKey</code> <code>key</code>, or <code>null</code> if not present
     */
    ClassifierKey getKey();

}

