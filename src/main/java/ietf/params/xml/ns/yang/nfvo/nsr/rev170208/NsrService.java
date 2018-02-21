package ietf.params.xml.ns.yang.nfvo.nsr.rev170208;
import org.opendaylight.yangtools.yang.common.RpcResult;
import javax.annotation.CheckReturnValue;
import org.opendaylight.yangtools.yang.binding.RpcService;
import java.util.concurrent.Future;

/**
 * Interface for implementing the following YANG RPCs defined in module <b>nsr</b>
 * <pre>
 * rpc start-network-service {
 *     "Start the network service";
 *     input {
 *         leaf name {
 *             type string;
 *         }
 *         leaf project-name {
 *             type project-name;
 *         }
 *         leaf nsd_id_ref {
 *             type leafref;
 *         }
 *         list scaling-group {
 *             key "scaling-group-name-ref";
 *             leaf scaling-group-name-ref {
 *                 type string;
 *             }
 *             list instance {
 *                 key "id";
 *                 leaf id {
 *                     type uint16;
 *                 }
 *             }
 *         }
 *         list nsd-placement-group-maps {
 *             key "placement-group-ref";
 *             leaf placement-group-ref {
 *                 type string;
 *             }
 *             leaf cloud-type {
 *                 type cloud-account-type;
 *             }
 *             choice cloud-provider {
 *                 case aws {
 *                     leaf aws-construct {
 *                         type empty;
 *                     }
 *                 }
 *                 case cloudsim {
 *                     leaf cloudsim-construct {
 *                         type empty;
 *                     }
 *                 }
 *                 case mock {
 *                     leaf mock-construct {
 *                         type empty;
 *                     }
 *                 }
 *                 case openmano {
 *                     leaf openmano-construct {
 *                         type empty;
 *                     }
 *                 }
 *                 case openstack {
 *                     container availability-zone {
 *                         leaf name {
 *                             type string;
 *                         }
 *                     }
 *                     container server-group {
 *                         leaf name {
 *                             type string;
 *                         }
 *                     }
 *                     list host-aggregate {
 *                         key "metadata-key";
 *                         leaf metadata-key {
 *                             type string;
 *                         }
 *                         leaf metadata-value {
 *                             type string;
 *                         }
 *                     }
 *                 }
 *                 case vsphere {
 *                     leaf vsphere-construct {
 *                         type empty;
 *                     }
 *                 }
 *             }
 *             uses placement-group-input;
 *         }
 *         list input-parameter {
 *             key "xpath";
 *             leaf xpath {
 *                 type string;
 *             }
 *             leaf value {
 *                 type string;
 *             }
 *         }
 *         list vnfd-placement-group-maps {
 *             key "placement-group-ref" "vnfd-id-ref";
 *             leaf vnfd-id-ref {
 *                 type uuid;
 *             }
 *             leaf placement-group-ref {
 *                 type leafref;
 *             }
 *             leaf cloud-type {
 *                 type cloud-account-type;
 *             }
 *             choice cloud-provider {
 *                 case aws {
 *                     leaf aws-construct {
 *                         type empty;
 *                     }
 *                 }
 *                 case cloudsim {
 *                     leaf cloudsim-construct {
 *                         type empty;
 *                     }
 *                 }
 *                 case mock {
 *                     leaf mock-construct {
 *                         type empty;
 *                     }
 *                 }
 *                 case openmano {
 *                     leaf openmano-construct {
 *                         type empty;
 *                     }
 *                 }
 *                 case openstack {
 *                     container availability-zone {
 *                         leaf name {
 *                             type string;
 *                         }
 *                     }
 *                     container server-group {
 *                         leaf name {
 *                             type string;
 *                         }
 *                     }
 *                     list host-aggregate {
 *                         key "metadata-key";
 *                         leaf metadata-key {
 *                             type string;
 *                         }
 *                         leaf metadata-value {
 *                             type string;
 *                         }
 *                     }
 *                 }
 *                 case vsphere {
 *                     leaf vsphere-construct {
 *                         type empty;
 *                     }
 *                 }
 *             }
 *             list ssh-authorized-key {
 *                 key "key-pair-ref";
 *                 leaf key-pair-ref {
 *                     type leafref;
 *                 }
 *             }
 *             list user {
 *                 key "name";
 *                 leaf name {
 *                     type string;
 *                 }
 *                 leaf user-info {
 *                     type string;
 *                 }
 *                 list ssh-authorized-key {
 *                     key "key-pair-ref";
 *                     leaf key-pair-ref {
 *                         type leafref;
 *                     }
 *                 }
 *             }
 *             uses placement-group-input;
 *         }
 *     }
 *     
 *     output {
 *         leaf nsr-id {
 *             type uuid;
 *         }
 *     }
 * }
 * rpc exec-scale-out {
 *     "Executes scale out request";
 *     input {
 *         leaf nsr_id_ref {
 *             type leafref;
 *         }
 *         leaf project-name {
 *             type project-name;
 *         }
 *         leaf scaling-group-name-ref {
 *             type leafref;
 *         }
 *         leaf instance-id {
 *             type uint64;
 *         }
 *     }
 *     
 *     output {
 *         leaf instance-id {
 *             type uint64;
 *         }
 *     }
 * }
 * rpc get-ns-service-primitive-values {
 *     "Get the service primitive parameter values";
 *     input {
 *         leaf name {
 *             type string;
 *         }
 *         leaf nsr_id_ref {
 *             type leafref;
 *         }
 *         leaf project-name {
 *             type project-name;
 *         }
 *     }
 *     
 *     output {
 *         list ns-parameter {
 *             key "name";
 *             leaf name {
 *                 type string;
 *             }
 *             leaf value {
 *                 type string;
 *             }
 *         }
 *         list ns-parameter-group {
 *             key "name";
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
 *         }
 *         list vnf-primitive-group {
 *             key "member-vnf-index-ref";
 *             leaf member-vnf-index-ref {
 *                 type uint64;
 *             }
 *             leaf vnfd-id-ref {
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
 *                 list parameter {
 *                     key "name";
 *                     leaf name {
 *                         type string;
 *                     }
 *                     leaf value {
 *                         type string;
 *                     }
 *                 }
 *             }
 *         }
 *     }
 * }
 * rpc exec-scale-in {
 *     "Executes scale out request";
 *     input {
 *         leaf nsr_id_ref {
 *             type leafref;
 *         }
 *         leaf project-name {
 *             type project-name;
 *         }
 *         leaf scaling-group-name-ref {
 *             type leafref;
 *         }
 *         leaf instance-id {
 *             type leafref;
 *         }
 *     }
 *     
 *     output {
 *         leaf instance-id {
 *             type uint64;
 *         }
 *     }
 * }
 * rpc exec-ns-service-primitive {
 *     "Executes a NS service primitive or script";
 *     input {
 *         leaf name {
 *             type string;
 *         }
 *         leaf nsr_id_ref {
 *             type leafref;
 *         }
 *         leaf project-name {
 *             type project-name;
 *         }
 *         leaf triggered-by {
 *             type triggered-by;
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
 *                 leaf value {
 *                     type string;
 *                 }
 *             }
 *             uses primitive-parameter-value;
 *         }
 *         list vnf-list {
 *             key "member_vnf_index_ref";
 *             leaf member_vnf_index_ref {
 *                 type uint64;
 *             }
 *             leaf vnfr-id-ref {
 *                 type uuid;
 *             }
 *             list vnf-primitive {
 *                 key "index";
 *                 leaf index {
 *                     type uint32;
 *                 }
 *                 leaf name {
 *                     type string;
 *                 }
 *                 list parameter {
 *                     key "name";
 *                     leaf name {
 *                         type string;
 *                     }
 *                     leaf value {
 *                         type string;
 *                     }
 *                 }
 *                 uses primitive-parameter-value;
 *             }
 *         }
 *         leaf user-defined-script {
 *             type string;
 *         }
 *     }
 *     
 *     output {
 *         leaf job-id {
 *             type uint64;
 *         }
 *         leaf name {
 *             type string;
 *         }
 *         leaf nsr_id_ref {
 *             type leafref;
 *         }
 *         leaf project-name {
 *             type project-name;
 *         }
 *         leaf triggered-by {
 *             type trigger-type;
 *         }
 *         leaf create-time {
 *             type uint32;
 *         }
 *         leaf job-status-details {
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
 *                 leaf value {
 *                     type string;
 *                 }
 *             }
 *             uses primitive-parameter-value;
 *         }
 *         list vnf-out-list {
 *             key "member_vnf_index_ref";
 *             leaf member_vnf_index_ref {
 *                 type uint64;
 *             }
 *             leaf vnfr-id-ref {
 *                 type uuid;
 *             }
 *             list vnf-out-primitive {
 *                 key "index";
 *                 leaf index {
 *                     type uint32;
 *                 }
 *                 leaf name {
 *                     type string;
 *                 }
 *                 list parameter {
 *                     key "name";
 *                     leaf name {
 *                         type string;
 *                     }
 *                     leaf value {
 *                         type string;
 *                     }
 *                 }
 *                 leaf execution-id {
 *                     type string;
 *                 }
 *                 leaf execution-status {
 *                     type string;
 *                 }
 *                 leaf execution-error-details {
 *                     type string;
 *                 }
 *                 uses primitive-parameter-value;
 *             }
 *         }
 *     }
 * }
 * </pre>
 *
 */
public interface NsrService
    extends
    RpcService
{




    /**
     * Start the network service
     *
     */
    @CheckReturnValue
    Future<RpcResult<StartNetworkServiceOutput>> startNetworkService(StartNetworkServiceInput input);
    
    /**
     * Executes scale out request
     *
     */
    @CheckReturnValue
    Future<RpcResult<ExecScaleOutOutput>> execScaleOut(ExecScaleOutInput input);
    
    /**
     * Get the service primitive parameter values
     *
     *
     *
     * @return <code>java.util.concurrent.Future</code> <code>nsServicePrimitiveValues</code>, or <code>null</code> if not present
     */
    @CheckReturnValue
    Future<RpcResult<GetNsServicePrimitiveValuesOutput>> getNsServicePrimitiveValues(GetNsServicePrimitiveValuesInput input);
    
    /**
     * Executes scale out request
     *
     */
    @CheckReturnValue
    Future<RpcResult<ExecScaleInOutput>> execScaleIn(ExecScaleInInput input);
    
    /**
     * Executes a NS service primitive or script
     *
     */
    @CheckReturnValue
    Future<RpcResult<ExecNsServicePrimitiveOutput>> execNsServicePrimitive(ExecNsServicePrimitiveInput input);

}

