package ietf.params.xml.ns.yang.nfvo.nsr.rev170208;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PrimitiveParameterValue;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.input.ParameterGroup;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.input.VnfList;

import java.util.List;

import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * container input {
 *     leaf name {
 *         type string;
 *     }
 *     leaf nsr_id_ref {
 *         type leafref;
 *     }
 *     leaf project-name {
 *         type project-name;
 *     }
 *     leaf triggered-by {
 *         type triggered-by;
 *     }
 *     list parameter {
 *         key "name";
 *         leaf name {
 *             type string;
 *         }
 *         leaf value {
 *             type string;
 *         }
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
 *             leaf value {
 *                 type string;
 *             }
 *         }
 *         uses primitive-parameter-value;
 *     }
 *     list vnf-list {
 *         key "member_vnf_index_ref";
 *         leaf member_vnf_index_ref {
 *             type uint64;
 *         }
 *         leaf vnfr-id-ref {
 *             type uuid;
 *         }
 *         list vnf-primitive {
 *             key "index";
 *             leaf index {
 *                 type uint32;
 *             }
 *             leaf name {
 *                 type string;
 *             }
 *             list parameter {
 *                 key "name";
 *                 leaf name {
 *                     type string;
 *                 }
 *                 leaf value {
 *                     type string;
 *                 }
 *             }
 *             uses primitive-parameter-value;
 *         }
 *     }
 *     leaf user-defined-script {
 *         type string;
 *     }
 *     uses primitive-parameter-value;
 *     uses rpc-common;
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/exec-ns-service-primitive/input</i>
 * 
 * <p>To create instances of this class use {@link ExecNsServicePrimitiveInputBuilder}.
 * @see ExecNsServicePrimitiveInputBuilder
 *
 */
public interface ExecNsServicePrimitiveInput
    extends
    PrimitiveParameterValue,
    RpcCommon,
    DataObject,
    Augmentable<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecNsServicePrimitiveInput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsr",
        "2017-02-08", "input").intern();

    /**
     * Name of the primitive
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    java.lang.String getName();
    
    /**
     * The primitive is triggered from NS or VNF level
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.TriggerType</code> <code>triggeredBy</code>, or <code>null</code> if not present
     */
    TriggerType getTriggeredBy();
    
    /**
     * List of NS Primitive parameter groups
     *
     *
     *
     * @return <code>java.util.List</code> <code>parameterGroup</code>, or <code>null</code> if not present
     */
    List<ParameterGroup> getParameterGroup();
    
    /**
     * List of VNFs whose primitives are being set.
     *
     *
     *
     * @return <code>java.util.List</code> <code>vnfList</code>, or <code>null</code> if not present
     */
    List<VnfList> getVnfList();
    
    /**
     * A user defined script.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>userDefinedScript</code>, or <code>null</code> if not present
     */
    java.lang.String getUserDefinedScript();

}

