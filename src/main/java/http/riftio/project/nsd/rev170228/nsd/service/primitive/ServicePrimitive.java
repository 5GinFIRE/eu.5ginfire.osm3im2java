package http.riftio.project.nsd.rev170228.nsd.service.primitive;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import http.riftio.project.nsd.rev170228.NsdServicePrimitive;
import http.riftio.project.nsd.rev170228.nsd.service.primitive.service.primitive.Parameter;
import http.riftio.project.nsd.rev170228.nsd.service.primitive.service.primitive.VnfPrimitiveGroup;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.UiPrimitiveGroup;

import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * Network service level service primitives.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>project-nsd</b>
 * <pre>
 * list service-primitive {
 *     key "name";
 *     leaf name {
 *         type string;
 *     }
 *     list parameter {
 *         key "name";
 *         leaf name {
 *             type string;
 *         }
 *         leaf data-type {
 *             type parameter-data-type;
 *         }
 *         leaf mandatory {
 *             type mandatory;
 *         }
 *         leaf default-value {
 *             type string;
 *         }
 *         leaf parameter-pool {
 *             type string;
 *         }
 *         leaf read-only {
 *             type read-only;
 *         }
 *         leaf hidden {
 *             type hidden;
 *         }
 *         uses primitive-parameter;
 *     }
 *     list parameter-group {
 *         key "name";
 *         leaf name {
 *             type string;
 *         }
 *         list parameter {
 *             key "name";
 *             leaf name {
 *                 type string;
 *             }
 *             leaf data-type {
 *                 type parameter-data-type;
 *             }
 *             leaf mandatory {
 *                 type mandatory;
 *             }
 *             leaf default-value {
 *                 type string;
 *             }
 *             leaf parameter-pool {
 *                 type string;
 *             }
 *             leaf read-only {
 *                 type read-only;
 *             }
 *             leaf hidden {
 *                 type hidden;
 *             }
 *             uses primitive-parameter;
 *         }
 *         leaf mandatory {
 *             type mandatory;
 *         }
 *     }
 *     list vnf-primitive-group {
 *         key "member-vnf-index-ref";
 *         leaf member-vnf-index-ref {
 *             type string;
 *         }
 *         leaf vnfd-id-ref {
 *             type leafref;
 *         }
 *         leaf vnfd-name {
 *             type leafref;
 *         }
 *         list primitive {
 *             key "index";
 *             leaf index {
 *                 type uint32;
 *             }
 *             leaf name {
 *                 type string;
 *             }
 *         }
 *     }
 *     leaf user-defined-script {
 *         type string;
 *     }
 *     uses ui-primitive-group;
 * }
 * </pre>The schema path to identify an instance is
 * <i>project-nsd/nsd-service-primitive/service-primitive</i>
 * 
 * <p>To create instances of this class use {@link ServicePrimitiveBuilder}.
 * @see ServicePrimitiveBuilder
 * @see ServicePrimitiveKey
 *
 */
public interface ServicePrimitive
    extends
    ChildOf<NsdServicePrimitive>,
    Augmentable<http.riftio.project.nsd.rev170228.nsd.service.primitive.ServicePrimitive>,
    UiPrimitiveGroup,
    Identifiable<ServicePrimitiveKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("http://riftio.com/ns/riftware-1.0/project-nsd",
        "2017-02-28", "service-primitive").intern();

    /**
     * Name of the service primitive.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    java.lang.String getName();
    
    /**
     * List of parameters for the service primitive.
     *
     *
     *
     * @return <code>java.util.List</code> <code>parameter</code>, or <code>null</code> if not present
     */
    List<Parameter> getParameter();
    
    /**
     * List of service primitives grouped by VNF.
     *
     *
     *
     * @return <code>java.util.List</code> <code>vnfPrimitiveGroup</code>, or <code>null</code> if not present
     */
    List<VnfPrimitiveGroup> getVnfPrimitiveGroup();
    
    /**
     * A user defined script.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>userDefinedScript</code>, or <code>null</code> if not present
     */
    java.lang.String getUserDefinedScript();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.project.nsd.rev170228.nsd.service.primitive.ServicePrimitiveKey</code> <code>key</code>, or <code>null</code> if not present
     */
    ServicePrimitiveKey getKey();

}

