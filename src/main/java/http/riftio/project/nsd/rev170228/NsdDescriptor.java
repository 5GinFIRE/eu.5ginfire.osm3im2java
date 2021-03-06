package http.riftio.project.nsd.rev170228;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import http.riftio.nsd.base.rev170228.NsdDescriptorCommon;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>project-nsd</b>
 * <pre>
 * grouping nsd-descriptor {
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
 *     list vld {
 *         key "id";
 *         list vnfd-connection-point-ref {
 *             key "member-vnf-index-ref" "vnfd-connection-point-ref";
 *             leaf member-vnf-index-ref {
 *                 type string;
 *             }
 *             leaf vnfd-id-ref {
 *                 type leafref;
 *             }
 *             leaf vnfd-connection-point-ref {
 *                 type leafref;
 *             }
 *         }
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
 *         leaf type {
 *             type virtual-link-type;
 *         }
 *         leaf root-bandwidth {
 *             type uint64;
 *         }
 *         leaf leaf-bandwidth {
 *             type uint64;
 *         }
 *         leaf mgmt-network {
 *             type mgmt-network;
 *         }
 *         choice init-params {
 *             case vim-network-profile {
 *                 leaf ip-profile-ref {
 *                     type string;
 *                 }
 *             }
 *             case vim-network-ref {
 *                 leaf vim-network-name {
 *                     type string;
 *                 }
 *             }
 *         }
 *         container provider-network {
 *             leaf physical-network {
 *                 type string;
 *             }
 *             leaf segmentation_id {
 *                 type uint32;
 *             }
 *         }
 *         uses nsd-vld-common;
 *     }
 *     list constituent-vnfd {
 *         key "member-vnf-index";
 *         leaf member-vnf-index {
 *             type uint64;
 *         }
 *         leaf vnfd-id-ref {
 *             type leafref;
 *         }
 *         leaf start-by-default {
 *             type start-by-default;
 *         }
 *     }
 *     list placement-groups {
 *         key "name";
 *         list member-vnfd {
 *             key "member-vnf-index-ref";
 *             leaf member-vnf-index-ref {
 *                 type string;
 *             }
 *             leaf vnfd-id-ref {
 *                 type string;
 *             }
 *         }
 *         leaf name {
 *             type string;
 *         }
 *         leaf requirement {
 *             type string;
 *         }
 *         leaf strategy {
 *             type strategy;
 *         }
 *         uses placement-group-info;
 *     }
 *     list vnf-dependency {
 *         key "vnf-source-ref";
 *         leaf vnf-source-ref {
 *             type string;
 *         }
 *         leaf vnf-depends-on-ref {
 *             type string;
 *         }
 *     }
 *     list monitoring-param {
 *         key "id";
 *         list vnfd-monitoring-param {
 *             key "member-vnf-index-ref" "vnfd-monitoring-param-ref";
 *             leaf vnfd-id-ref {
 *                 type leafref;
 *             }
 *             leaf vnfd-monitoring-param-ref {
 *                 type leafref;
 *             }
 *             leaf member-vnf-index-ref {
 *                 type string;
 *             }
 *         }
 *         leaf id {
 *             type string;
 *         }
 *         leaf name {
 *             type string;
 *         }
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
 *         leaf aggregation-type {
 *             type aggregation-type;
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
 *         uses monitoring-param-common;
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
 *         uses ui-primitive-group;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>project-nsd/nsd-descriptor</i>
 *
 */
public interface NsdDescriptor
    extends
    DataObject,
    NsdMonitoringParam,
    NsdVnfDependency,
    NsdVld,
    NsdConstituentVnfd,
    NsdPlacementGroups,
    NsdServicePrimitive,
    NsdDescriptorCommon
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("http://riftio.com/ns/riftware-1.0/project-nsd",
        "2017-02-28", "nsd-descriptor").intern();


}

