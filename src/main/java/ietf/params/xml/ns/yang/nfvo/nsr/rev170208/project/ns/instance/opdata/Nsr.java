package ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ConfigStates;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.NsOperationalStatus;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.Vnffgr;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.NsInstanceOpdata;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.ConfigAgentJob;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.ConnectionPoint;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.ConstituentVnfrRef;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.InitialServicePrimitive;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.MonitoringParam;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.ScalingGroupRecord;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.ServicePrimitive;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.TerminateServicePrimitive;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.Vlr;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

import java.util.List;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list nsr {
 *     key "ns-instance-config-ref";
 *     leaf ns-instance-config-ref {
 *         type leafref;
 *     }
 *     leaf name-ref {
 *         type leafref;
 *     }
 *     leaf nsd-ref {
 *         type leafref;
 *     }
 *     leaf nsd-name-ref {
 *         type leafref;
 *     }
 *     leaf create-time {
 *         type uint32;
 *     }
 *     leaf uptime {
 *         type uint32;
 *     }
 *     list connection-point {
 *         key "name";
 *         leaf name {
 *             type string;
 *         }
 *         leaf type {
 *             type connection-point-type;
 *         }
 *     }
 *     list vlr {
 *         key "vlr-ref";
 *         leaf vlr-ref {
 *             type leafref;
 *         }
 *         list vnfr-connection-point-ref {
 *             key "vnfr-id";
 *             leaf vnfr-id {
 *                 type string;
 *             }
 *             leaf connection-point {
 *                 type leafref;
 *             }
 *         }
 *     }
 *     list constituent-vnfr-ref {
 *         key "vnfr-id";
 *         leaf vnfr-id {
 *             type string;
 *         }
 *     }
 *     list scaling-group-record {
 *         key "scaling-group-name-ref";
 *         leaf scaling-group-name-ref {
 *             type leafref;
 *         }
 *         list instance {
 *             key "instance-id";
 *             leaf instance-id {
 *                 type uint16;
 *             }
 *             leaf is-default {
 *                 type boolean;
 *             }
 *             leaf op-status {
 *                 type enumeration;
 *             }
 *             leaf config-status {
 *                 type config-states;
 *             }
 *             leaf error-msg {
 *                 type string;
 *             }
 *             leaf create-time {
 *                 type uint32;
 *             }
 *             leaf-list vnfrs {
 *                 type leafref;
 *             }
 *         }
 *     }
 *     list vnffgr {
 *         key "id";
 *         leaf id {
 *             type uuid;
 *         }
 *         leaf vnffgd-id-ref {
 *             type leafref;
 *         }
 *         leaf vnffgd-name-ref {
 *             type leafref;
 *         }
 *         leaf sdn-account {
 *             type string;
 *         }
 *         leaf cloud-account {
 *             type string;
 *         }
 *         leaf operational-status {
 *             type vnffgr-operational-status;
 *         }
 *         list rsp {
 *             key "id";
 *             leaf id {
 *                 type uuid;
 *             }
 *             leaf name {
 *                 type string;
 *             }
 *             leaf rsp-id {
 *                 type uuid;
 *             }
 *             leaf vnffgd-rsp-id-ref {
 *                 type leafref;
 *             }
 *             leaf vnffgd-rsp-name-ref {
 *                 type leafref;
 *             }
 *             leaf classifier-name {
 *                 type string;
 *             }
 *             leaf path-id {
 *                 type uint32;
 *             }
 *             list vnfr-connection-point-ref {
 *                 key "hop-number";
 *                 leaf hop-number {
 *                     type uint8;
 *                 }
 *                 leaf service-function-type {
 *                     type string;
 *                 }
 *                 leaf member-vnf-index-ref {
 *                     type uint64;
 *                 }
 *                 leaf vnfd-id-ref {
 *                     type string;
 *                 }
 *                 leaf vnfr-id-ref {
 *                     type string;
 *                 }
 *                 leaf vnfr-name-ref {
 *                     type string;
 *                 }
 *                 leaf vnfr-connection-point-ref {
 *                     type leafref;
 *                 }
 *                 leaf service-index {
 *                     type uint8;
 *                 }
 *                 container connection-point-params {
 *                     leaf mgmt-address {
 *                         type ip-address;
 *                     }
 *                     leaf name {
 *                         type string;
 *                     }
 *                     leaf port-id {
 *                         type string;
 *                     }
 *                     leaf vm-id {
 *                         type string;
 *                     }
 *                     leaf address {
 *                         type ip-address;
 *                     }
 *                     leaf port {
 *                         type port-number;
 *                     }
 *                 }
 *                 container service-function-forwarder {
 *                     leaf name {
 *                         type string;
 *                     }
 *                     leaf ip-address {
 *                         type ip-address;
 *                     }
 *                     leaf port {
 *                         type port-number;
 *                     }
 *                 }
 *             }
 *         }
 *         list classifier {
 *             key "id";
 *             leaf id {
 *                 type uuid;
 *             }
 *             leaf name {
 *                 type string;
 *             }
 *             leaf-list classifier-id {
 *                 type uuid;
 *             }
 *             leaf rsp-id-ref {
 *                 type leafref;
 *             }
 *             leaf rsp-name {
 *                 type string;
 *             }
 *             leaf vnfr-id-ref {
 *                 type string;
 *             }
 *             leaf vnfr-name-ref {
 *                 type string;
 *             }
 *             leaf vnfr-connection-point-ref {
 *                 type leafref;
 *             }
 *             leaf port-id {
 *                 type string;
 *             }
 *             leaf vm-id {
 *                 type string;
 *             }
 *             leaf ip-address {
 *                 type string;
 *             }
 *             leaf sff-name {
 *                 type string;
 *             }
 *         }
 *     }
 *     leaf operational-status {
 *         type ns-operational-status;
 *     }
 *     leaf config-status {
 *         type config-states;
 *     }
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
 *         uses ui-primitive-group;
 *     }
 *     list initial-service-primitive {
 *         key "seq";
 *         leaf seq {
 *             type uint64;
 *         }
 *         leaf name {
 *             type string;
 *         }
 *         leaf user-defined-script {
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
 *         uses event-service-primitive;
 *     }
 *     list terminate-service-primitive {
 *         key "seq";
 *         leaf seq {
 *             type uint64;
 *         }
 *         leaf name {
 *             type string;
 *         }
 *         leaf user-defined-script {
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
 *         uses event-service-primitive;
 *     }
 *     list monitoring-param {
 *         key "id";
 *         leaf value-type {
 *             type value-type;
 *         }
 *         container numeric-constraints {
 *             leaf min-value {
 *                 type uint64;
 *             }
 *             leaf max-value {
 *                 type uint64;
 *             }
 *         }
 *         container text-constraints {
 *             leaf min-length {
 *                 type uint8;
 *             }
 *             leaf max-length {
 *                 type uint8;
 *             }
 *         }
 *         leaf value-integer {
 *             type int64;
 *         }
 *         leaf value-decimal {
 *             type decimal64;
 *         }
 *         leaf value-string {
 *             type string;
 *         }
 *         leaf description {
 *             type string;
 *         }
 *         leaf group-tag {
 *             type string;
 *         }
 *         leaf widget-type {
 *             type widget-type;
 *         }
 *         leaf units {
 *             type string;
 *         }
 *         leaf aggregation-type {
 *             type aggregation-type;
 *         }
 *         leaf id {
 *             type string;
 *         }
 *         leaf name {
 *             type string;
 *         }
 *         leaf nsd-mon-param-ref {
 *             type leafref;
 *         }
 *         list vnfr-mon-param-ref {
 *             key "vnfr-id-ref" "vnfr-mon-param-ref";
 *             leaf vnfr-id-ref {
 *                 type uuid;
 *             }
 *             leaf vnfr-mon-param-ref {
 *                 type leafref;
 *             }
 *         }
 *         uses monitoring-param-ui-data;
 *         uses monitoring-param-aggregation;
 *         uses monitoring-param-value;
 *     }
 *     list config-agent-job {
 *         key "job-id";
 *         leaf job-id {
 *             type uint64;
 *         }
 *         leaf job-name {
 *             type string;
 *         }
 *         leaf job-status {
 *             type enumeration;
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
 *         list vnfr {
 *             key "id";
 *             leaf id {
 *                 type uuid;
 *             }
 *             leaf vnf-job-status {
 *                 type enumeration;
 *             }
 *             list primitive {
 *                 key "name";
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
 *                     type enumeration;
 *                 }
 *                 leaf execution-error-details {
 *                     type string;
 *                 }
 *                 uses primitive-parameter-value;
 *             }
 *         }
 *         uses primitive-parameter-value;
 *     }
 *     uses vnffgr;
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/project/(urn:ietf:params:xml:ns:yang:nfvo:nsr?revision=2017-02-08)ns-instance-opdata/nsr</i>
 * 
 * <p>To create instances of this class use {@link NsrBuilder}.
 * @see NsrBuilder
 * @see NsrKey
 *
 */
public interface Nsr
    extends
    ChildOf<NsInstanceOpdata>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.Nsr>,
    Vnffgr,
    Identifiable<NsrKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsr",
        "2017-02-08", "nsr").intern();

    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid</code> <code>nsInstanceConfigRef</code>, or <code>null</code> if not present
     */
    Uuid getNsInstanceConfigRef();
    
    /**
     * Network service name reference
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>nameRef</code>, or <code>null</code> if not present
     */
    java.lang.Object getNameRef();
    
    /**
     * Network service descriptor id reference
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>nsdRef</code>, or <code>null</code> if not present
     */
    java.lang.Object getNsdRef();
    
    /**
     * Network service descriptor name reference
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>nsdNameRef</code>, or <code>null</code> if not present
     */
    java.lang.Object getNsdNameRef();
    
    /**
     * Creation timestamp of this Network Service.The timestamp is expressed as 
     * secondssince unix epoch - 1970-01-01T00:00:00Z
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>createTime</code>, or <code>null</code> if not present
     */
    java.lang.Long getCreateTime();
    
    /**
     * Active period of this Network Service.Uptime is expressed in seconds
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>uptime</code>, or <code>null</code> if not present
     */
    java.lang.Long getUptime();
    
    /**
     * List for external connection points.Each NS has one or more external connection 
     * points.As the name implies that external connection pointsare used for 
     * connecting the NS to other NS or toexternal networks. Each NS exposes these 
     * connectionpoints to the orchestrator. The orchestrator canconstruct network 
     * service chains by connecting theconnection points between different NS.
     *
     *
     *
     * @return <code>java.util.List</code> <code>connectionPoint</code>, or <code>null</code> if not present
     */
    List<ConnectionPoint> getConnectionPoint();
    
    /**
     * @return <code>java.util.List</code> <code>vlr</code>, or <code>null</code> if not present
     */
    List<Vlr> getVlr();
    
    /**
     * List of VNFRs that are part of thisnetwork service.
     *
     *
     *
     * @return <code>java.util.List</code> <code>constituentVnfrRef</code>, or <code>null</code> if not present
     */
    List<ConstituentVnfrRef> getConstituentVnfrRef();
    
    /**
     * List of scaling group records
     *
     *
     *
     * @return <code>java.util.List</code> <code>scalingGroupRecord</code>, or <code>null</code> if not present
     */
    List<ScalingGroupRecord> getScalingGroupRecord();
    
    /**
     * The operational status of the NS instanceinit : The network service has just 
     * started.vl-init-phase : The VLs in the NS are being instantiated.vnf-init-phase 
     * : The VNFs in the NS are being instantiated.running : The NS is in running 
     * state.terminate : The NS is being terminated.vnf-terminate-phase : The NS is 
     * terminating the VNFs in the NS.vl-terminate-phase : The NS is terminating the 
     * VLs in the NS.terminated : The NS is in the terminated state.failed : The NS 
     * instantiation failed.scaling-out : The NS is scaling outscaling-in : The NS is 
     * scaling invl-instantiate : The NS is initiating a new VLvl-terminate : The NS is
     * terminating a VL
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.NsOperationalStatus</code> <code>operationalStatus</code>, or <code>null</code> if not present
     */
    NsOperationalStatus getOperationalStatus();
    
    /**
     * The configuration status of the NS instanceconfiguring: At least one of the VNFs
     * in this instance is in configuring stateconfigured: All the VNFs in this NS 
     * instance are configured or config-not-needed state
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ConfigStates</code> <code>configStatus</code>, or <code>null</code> if not present
     */
    ConfigStates getConfigStatus();
    
    /**
     * Network service level service primitives.
     *
     *
     *
     * @return <code>java.util.List</code> <code>servicePrimitive</code>, or <code>null</code> if not present
     */
    List<ServicePrimitive> getServicePrimitive();
    
    /**
     * Initial set of service primitives for NSD.
     *
     *
     *
     * @return <code>java.util.List</code> <code>initialServicePrimitive</code>, or <code>null</code> if not present
     */
    List<InitialServicePrimitive> getInitialServicePrimitive();
    
    /**
     * Set of service primitives toexecute during termination of NSD.
     *
     *
     *
     * @return <code>java.util.List</code> <code>terminateServicePrimitive</code>, or <code>null</code> if not present
     */
    List<TerminateServicePrimitive> getTerminateServicePrimitive();
    
    /**
     * List of NS level params.
     *
     *
     *
     * @return <code>java.util.List</code> <code>monitoringParam</code>, or <code>null</code> if not present
     */
    List<MonitoringParam> getMonitoringParam();
    
    /**
     * @return <code>java.util.List</code> <code>configAgentJob</code>, or <code>null</code> if not present
     */
    List<ConfigAgentJob> getConfigAgentJob();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.NsrKey</code> <code>key</code>, or <code>null</code> if not present
     */
    NsrKey getKey();

}

