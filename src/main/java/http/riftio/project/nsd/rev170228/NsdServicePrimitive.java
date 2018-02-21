package http.riftio.project.nsd.rev170228;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import http.riftio.project.nsd.rev170228.nsd.service.primitive.ServicePrimitive;

import java.util.List;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>project-nsd</b>
 * <pre>
 * grouping nsd-service-primitive {
 *     list service-primitive {
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
 *         list parameter-group {
 *             key "name";
 *             leaf name {
 *                 type string;
 *             }
 *             list parameter {
 *                 key "name";
 *                 leaf name {
 *                     type string;
 *                 }
 *                 leaf data-type {
 *                     type parameter-data-type;
 *                 }
 *                 leaf mandatory {
 *                     type mandatory;
 *                 }
 *                 leaf default-value {
 *                     type string;
 *                 }
 *                 leaf parameter-pool {
 *                     type string;
 *                 }
 *                 leaf read-only {
 *                     type read-only;
 *                 }
 *                 leaf hidden {
 *                     type hidden;
 *                 }
 *                 uses primitive-parameter;
 *             }
 *             leaf mandatory {
 *                 type mandatory;
 *             }
 *         }
 *         list vnf-primitive-group {
 *             key "member-vnf-index-ref";
 *             leaf member-vnf-index-ref {
 *                 type string;
 *             }
 *             leaf vnfd-id-ref {
 *                 type leafref;
 *             }
 *             leaf vnfd-name {
 *                 type leafref;
 *             }
 *             list primitive {
 *                 key "index";
 *                 leaf index {
 *                     type uint32;
 *                 }
 *                 leaf name {
 *                     type string;
 *                 }
 *             }
 *         }
 *         leaf user-defined-script {
 *             type string;
 *         }
 *         uses ui-primitive-group;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>project-nsd/nsd-service-primitive</i>
 *
 */
public interface NsdServicePrimitive
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("http://riftio.com/ns/riftware-1.0/project-nsd",
        "2017-02-28", "nsd-service-primitive").intern();

    /**
     * Network service level service primitives.
     *
     *
     *
     * @return <code>java.util.List</code> <code>servicePrimitive</code>, or <code>null</code> if not present
     */
    List<ServicePrimitive> getServicePrimitive();

}

