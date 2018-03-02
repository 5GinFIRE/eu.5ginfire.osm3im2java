package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ns.service.primitive.ServicePrimitive;

import java.util.List;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping ns-service-primitive {
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
 *                 type uint64;
 *             }
 *             leaf vnfd-id-ref {
 *                 type string;
 *             }
 *             leaf vnfd-name {
 *                 type string;
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
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/ns-service-primitive</i>
 *
 */
public interface NsServicePrimitive
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2017-02-08", "ns-service-primitive").intern();

    /**
     * Network service level service primitives.
     *
     *
     *
     * @return <code>java.util.List</code> <code>servicePrimitive</code>, or <code>null</code> if not present
     */
    List<ServicePrimitive> getServicePrimitive();

}

