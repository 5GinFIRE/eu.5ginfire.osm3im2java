package http.riftio.nsd.base.rev170228;
import org.opendaylight.yangtools.yang.common.QName;

import http.riftio.nsd.base.rev170228.nsd.descriptor.common.ConnectionPoint;
import http.riftio.nsd.base.rev170228.nsd.descriptor.common.InitialServicePrimitive;
import http.riftio.nsd.base.rev170228.nsd.descriptor.common.KeyPair;
import http.riftio.nsd.base.rev170228.nsd.descriptor.common.ParameterPool;
import http.riftio.nsd.base.rev170228.nsd.descriptor.common.ScalingGroupDescriptor;
import http.riftio.nsd.base.rev170228.nsd.descriptor.common.TerminateServicePrimitive;
import http.riftio.nsd.base.rev170228.nsd.descriptor.common.User;
import http.riftio.nsd.base.rev170228.nsd.descriptor.common.Vnffgd;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.InputParameterXpath;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.IpProfileList;

import org.opendaylight.yangtools.yang.binding.DataObject;

import java.util.List;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd-base</b>
 * <pre>
 * grouping nsd-descriptor-common {
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
 *     leaf logo {
 *         type string;
 *     }
 *     leaf description {
 *         type string;
 *     }
 *     leaf version {
 *         type string;
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
 *     list scaling-group-descriptor {
 *         key "name";
 *         leaf name {
 *             type string;
 *         }
 *         list scaling-policy {
 *             key "name";
 *             leaf name {
 *                 type string;
 *             }
 *             leaf scaling-type {
 *                 type scaling-policy-type;
 *             }
 *             leaf enabled {
 *                 type enabled;
 *             }
 *             leaf scale-in-operation-type {
 *                 type scale-in-operation-type;
 *             }
 *             leaf scale-out-operation-type {
 *                 type scale-out-operation-type;
 *             }
 *             leaf threshold-time {
 *                 type uint32;
 *             }
 *             leaf cooldown-time {
 *                 type uint32;
 *             }
 *             list scaling-criteria {
 *                 key "name";
 *                 leaf name {
 *                     type string;
 *                 }
 *                 leaf scale-in-threshold {
 *                     type uint64;
 *                 }
 *                 leaf scale-out-threshold {
 *                     type uint64;
 *                 }
 *                 leaf ns-monitoring-param-ref {
 *                     type string;
 *                 }
 *             }
 *         }
 *         list vnfd-member {
 *             key "member-vnf-index-ref";
 *             leaf member-vnf-index-ref {
 *                 type string;
 *             }
 *             leaf count {
 *                 type count;
 *             }
 *         }
 *         leaf min-instance-count {
 *             type min-instance-count;
 *         }
 *         leaf max-instance-count {
 *             type max-instance-count;
 *         }
 *         list scaling-config-action {
 *             key "trigger";
 *             leaf trigger {
 *                 type scaling-trigger;
 *             }
 *             leaf ns-service-primitive-name-ref {
 *                 type string;
 *             }
 *         }
 *     }
 *     list vnffgd {
 *         key "id";
 *         leaf id {
 *             type string;
 *         }
 *         leaf name {
 *             type string;
 *         }
 *         leaf short-name {
 *             type string;
 *         }
 *         leaf vendor {
 *             type string;
 *         }
 *         leaf description {
 *             type string;
 *         }
 *         leaf version {
 *             type string;
 *         }
 *         list rsp {
 *             key "id";
 *             leaf id {
 *                 type string;
 *             }
 *             leaf name {
 *                 type string;
 *             }
 *             list vnfd-connection-point-ref {
 *                 key "member-vnf-index-ref";
 *                 leaf member-vnf-index-ref {
 *                     type string;
 *                 }
 *                 leaf order {
 *                     type uint8;
 *                 }
 *                 leaf vnfd-id-ref {
 *                     type leafref;
 *                 }
 *                 leaf vnfd-connection-point-ref {
 *                     type string;
 *                 }
 *             }
 *         }
 *         list classifier {
 *             key "id";
 *             leaf id {
 *                 type string;
 *             }
 *             leaf name {
 *                 type string;
 *             }
 *             leaf rsp-id-ref {
 *                 type leafref;
 *             }
 *             leaf member-vnf-index-ref {
 *                 type string;
 *             }
 *             leaf vnfd-id-ref {
 *                 type leafref;
 *             }
 *             leaf vnfd-connection-point-ref {
 *                 type string;
 *             }
 *             list match-attributes {
 *                 key "id";
 *                 leaf id {
 *                     type string;
 *                 }
 *                 leaf ip-proto {
 *                     type uint8;
 *                 }
 *                 leaf source-ip-address {
 *                     type ip-address;
 *                 }
 *                 leaf destination-ip-address {
 *                     type ip-address;
 *                 }
 *                 leaf source-port {
 *                     type port-number;
 *                 }
 *                 leaf destination-port {
 *                     type port-number;
 *                 }
 *             }
 *         }
 *     }
 *     list ip-profiles {
 *         key "name";
 *         leaf name {
 *             type string;
 *         }
 *         leaf description {
 *             type string;
 *         }
 *         container ip-profile-params {
 *             leaf ip-version {
 *                 type ip-version;
 *             }
 *             leaf subnet-address {
 *                 type ip-prefix;
 *             }
 *             leaf gateway-address {
 *                 type ip-address;
 *             }
 *             leaf security-group {
 *                 type string;
 *             }
 *             list dns-server {
 *                 key "address";
 *                 leaf address {
 *                     type ip-address;
 *                 }
 *             }
 *             container dhcp-params {
 *                 leaf enabled {
 *                     type enabled;
 *                 }
 *                 leaf start-address {
 *                     type ip-address;
 *                 }
 *                 leaf count {
 *                     type uint32;
 *                 }
 *             }
 *             leaf subnet-prefix-pool {
 *                 type string;
 *             }
 *         }
 *         uses ip-profile-info;
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
 *         uses event-config;
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
 *         uses event-config;
 *     }
 *     list input-parameter-xpath {
 *         key "xpath";
 *         leaf xpath {
 *             type string;
 *         }
 *         leaf label {
 *             type string;
 *         }
 *         leaf default-value {
 *             type string;
 *         }
 *     }
 *     list parameter-pool {
 *         key "name";
 *         leaf name {
 *             type string;
 *         }
 *         container range {
 *             leaf start-value {
 *                 type uint32;
 *             }
 *             leaf end-value {
 *                 type uint32;
 *             }
 *         }
 *     }
 *     list key-pair {
 *         key "name";
 *         leaf name {
 *             type string;
 *         }
 *         leaf akey {
 *             type string;
 *         }
 *     }
 *     list user {
 *         key "name";
 *         leaf name {
 *             type string;
 *         }
 *         leaf user-info {
 *             type string;
 *         }
 *         list key-pair {
 *             key "name";
 *             leaf name {
 *                 type string;
 *             }
 *             leaf akey {
 *                 type string;
 *             }
 *         }
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd-base/nsd-descriptor-common</i>
 *
 */
public interface NsdDescriptorCommon
    extends
    DataObject,
    IpProfileList,
    InputParameterXpath
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("http://riftio.com/ns/riftware-1.0/nsd-base",
        "2017-02-28", "nsd-descriptor-common").intern();

    /**
     * Identifier for the NSD.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    java.lang.String getId();
    
    /**
     * NSD name.
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
     * Vendor of the NSD.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vendor</code>, or <code>null</code> if not present
     */
    java.lang.String getVendor();
    
    /**
     * File path for the vendor specific logo. For example icons/mylogo.png.The logo 
     * should be part of the network service
     *
     *
     *
     * @return <code>java.lang.String</code> <code>logo</code>, or <code>null</code> if not present
     */
    java.lang.String getLogo();
    
    /**
     * Description of the NSD.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>description</code>, or <code>null</code> if not present
     */
    java.lang.String getDescription();
    
    /**
     * Version of the NSD
     *
     *
     *
     * @return <code>java.lang.String</code> <code>version</code>, or <code>null</code> if not present
     */
    java.lang.String getVersion();
    
    /**
     * List for external connection points.Each NS has one or more external 
     * connectionpoints. As the name implies that externalconnection points are used 
     * for connectingthe NS to other NS or to external networks.Each NS exposes these 
     * connection points tothe orchestrator. The orchestrator canconstruct network 
     * service chains byconnecting the connection points betweendifferent NS.
     *
     *
     *
     * @return <code>java.util.List</code> <code>connectionPoint</code>, or <code>null</code> if not present
     */
    List<ConnectionPoint> getConnectionPoint();
    
    /**
     * scaling group descriptor within this network service.The scaling group defines a
     * group of VNFs,and the ratio of VNFs in the network servicethat is used as target
     * for scaling action
     *
     *
     *
     * @return <code>java.util.List</code> <code>scalingGroupDescriptor</code>, or <code>null</code> if not present
     */
    List<ScalingGroupDescriptor> getScalingGroupDescriptor();
    
    /**
     * List of VNF Forwarding Graph Descriptors (VNFFGD).
     *
     *
     *
     * @return <code>java.util.List</code> <code>vnffgd</code>, or <code>null</code> if not present
     */
    List<Vnffgd> getVnffgd();
    
    /**
     * Initial set of service primitives for NSD.
     *
     *
     *
     * @return <code>java.util.List</code> <code>initialServicePrimitive</code>, or <code>null</code> if not present
     */
    List<InitialServicePrimitive> getInitialServicePrimitive();
    
    /**
     * Set of service primitives duringtermination for NSD.
     *
     *
     *
     * @return <code>java.util.List</code> <code>terminateServicePrimitive</code>, or <code>null</code> if not present
     */
    List<TerminateServicePrimitive> getTerminateServicePrimitive();
    
    /**
     * Pool of parameter values which must bepulled from during configuration
     *
     *
     *
     * @return <code>java.util.List</code> <code>parameterPool</code>, or <code>null</code> if not present
     */
    List<ParameterPool> getParameterPool();
    
    /**
     * Used to configure the list of public keys to be injected as partof ns 
     * instantiation
     *
     *
     *
     * @return <code>java.util.List</code> <code>keyPair</code>, or <code>null</code> if not present
     */
    List<KeyPair> getKeyPair();
    
    /**
     * List of users to be added through cloud-config
     *
     *
     *
     * @return <code>java.util.List</code> <code>user</code>, or <code>null</code> if not present
     */
    List<User> getUser();

}

