package ietf.params.xml.ns.yang.nfvo.nsr.rev170208;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PrimitiveParameterValue;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output.ParameterGroup;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output.VnfOutList;

import java.math.BigInteger;
import java.util.List;

import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * container output {
 *     leaf job-id {
 *         type uint64;
 *     }
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
 *         type trigger-type;
 *     }
 *     leaf create-time {
 *         type uint32;
 *     }
 *     leaf job-status-details {
 *         type string;
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
 *     list vnf-out-list {
 *         key "member_vnf_index_ref";
 *         leaf member_vnf_index_ref {
 *             type uint64;
 *         }
 *         leaf vnfr-id-ref {
 *             type uuid;
 *         }
 *         list vnf-out-primitive {
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
 *             leaf execution-id {
 *                 type string;
 *             }
 *             leaf execution-status {
 *                 type string;
 *             }
 *             leaf execution-error-details {
 *                 type string;
 *             }
 *             uses primitive-parameter-value;
 *         }
 *     }
 *     uses primitive-parameter-value;
 *     uses rpc-common;
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/exec-ns-service-primitive/output</i>
 * 
 * <p>To create instances of this class use {@link ExecNsServicePrimitiveOutputBuilder}.
 * @see ExecNsServicePrimitiveOutputBuilder
 *
 */
public interface ExecNsServicePrimitiveOutput
    extends
    PrimitiveParameterValue,
    RpcCommon,
    DataObject,
    Augmentable<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecNsServicePrimitiveOutput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsr",
        "2017-02-08", "output").intern();

    /**
     * Job identifier for this RPC
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>jobId</code>, or <code>null</code> if not present
     */
    BigInteger getJobId();
    
    /**
     * Name of the service primitive
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
     * Creation timestamp of this config agent JOB.The timestamp is expressed as 
     * secondssince unix epoch - 1970-01-01T00:00:00Z
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>createTime</code>, or <code>null</code> if not present
     */
    java.lang.Long getCreateTime();
    
    /**
     * Job status details, in case of any errors
     *
     *
     *
     * @return <code>java.lang.String</code> <code>jobStatusDetails</code>, or <code>null</code> if not present
     */
    java.lang.String getJobStatusDetails();
    
    /**
     * List of NS Primitive parameter groups
     *
     *
     *
     * @return <code>java.util.List</code> <code>parameterGroup</code>, or <code>null</code> if not present
     */
    List<ParameterGroup> getParameterGroup();
    
    /**
     * List of VNFs whose primitives were set.
     *
     *
     *
     * @return <code>java.util.List</code> <code>vnfOutList</code>, or <code>null</code> if not present
     */
    List<VnfOutList> getVnfOutList();

}

