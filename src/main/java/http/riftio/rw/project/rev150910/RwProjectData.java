package http.riftio.rw.project.rev150910;
import org.opendaylight.yangtools.yang.binding.DataRoot;
import java.util.List;

/**
 * This yang module defines project-based tenancy for RIFT.ware.Authorization for 
 * project access is defined in terms of RIFT.ware'sRole-Based Access Control 
 * (RBAC) model.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>rw-project</b>
 * <pre>
 * module rw-project {
 *     yang-version 1;
 *     namespace "http://riftio.com/ns/riftware-1.0/rw-project";
 *     prefix "rw-project";
 * 
 *     revision 2015-09-10 {
 *         description "This yang module defines project-based tenancy for RIFT.ware.Authorization for 
 *                     project access is defined in terms of RIFT.ware'sRole-Based Access Control 
 *                     (RBAC) model.
 *         ";
 *     }
 * 
 *     list project {
 *         key "name";
 *         leaf name {
 *             type string;
 *         }
 *         leaf description {
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
 *         container vnffgd-catalog {
 *             list vnffgd {
 *                 key "id";
 *                 leaf name {
 *                     type string;
 *                 }
 *                 leaf id {
 *                     type uuid;
 *                 }
 *                 leaf provider {
 *                     type string;
 *                 }
 *                 leaf description {
 *                     type string;
 *                 }
 *                 leaf version {
 *                     type string;
 *                 }
 *             }
 *         }
 *         container ns-instance-opdata {
 *             list nsr {
 *                 key "ns-instance-config-ref";
 *                 leaf ns-instance-config-ref {
 *                     type leafref;
 *                 }
 *                 leaf name-ref {
 *                     type leafref;
 *                 }
 *                 leaf nsd-ref {
 *                     type leafref;
 *                 }
 *                 leaf nsd-name-ref {
 *                     type leafref;
 *                 }
 *                 leaf create-time {
 *                     type uint32;
 *                 }
 *                 leaf uptime {
 *                     type uint32;
 *                 }
 *                 list connection-point {
 *                     key "name";
 *                     leaf name {
 *                         type string;
 *                     }
 *                     leaf type {
 *                         type connection-point-type;
 *                     }
 *                 }
 *                 list vlr {
 *                     key "vlr-ref";
 *                     leaf vlr-ref {
 *                         type leafref;
 *                     }
 *                     list vnfr-connection-point-ref {
 *                         key "vnfr-id";
 *                         leaf vnfr-id {
 *                             type string;
 *                         }
 *                         leaf connection-point {
 *                             type leafref;
 *                         }
 *                     }
 *                 }
 *                 list constituent-vnfr-ref {
 *                     key "vnfr-id";
 *                     leaf vnfr-id {
 *                         type string;
 *                     }
 *                 }
 *                 list scaling-group-record {
 *                     key "scaling-group-name-ref";
 *                     leaf scaling-group-name-ref {
 *                         type leafref;
 *                     }
 *                     list instance {
 *                         key "instance-id";
 *                         leaf instance-id {
 *                             type uint16;
 *                         }
 *                         leaf is-default {
 *                             type boolean;
 *                         }
 *                         leaf op-status {
 *                             type enumeration;
 *                         }
 *                         leaf config-status {
 *                             type config-states;
 *                         }
 *                         leaf error-msg {
 *                             type string;
 *                         }
 *                         leaf create-time {
 *                             type uint32;
 *                         }
 *                         leaf-list vnfrs {
 *                             type leafref;
 *                         }
 *                     }
 *                 }
 *                 leaf operational-status {
 *                     type ns-operational-status;
 *                 }
 *                 leaf config-status {
 *                     type config-states;
 *                 }
 *                 list service-primitive {
 *                     key "name";
 *                     leaf name {
 *                         type string;
 *                     }
 *                     list parameter {
 *                         key "name";
 *                         leaf name {
 *                             type string;
 *                         }
 *                         leaf data-type {
 *                             type parameter-data-type;
 *                         }
 *                         leaf mandatory {
 *                             type mandatory;
 *                         }
 *                         leaf default-value {
 *                             type string;
 *                         }
 *                         leaf parameter-pool {
 *                             type string;
 *                         }
 *                         leaf read-only {
 *                             type read-only;
 *                         }
 *                         leaf hidden {
 *                             type hidden;
 *                         }
 *                         uses primitive-parameter;
 *                     }
 *                     list vnf-primitive-group {
 *                         key "member-vnf-index-ref";
 *                         leaf member-vnf-index-ref {
 *                             type uint64;
 *                         }
 *                         leaf vnfd-id-ref {
 *                             type string;
 *                         }
 *                         leaf vnfd-name {
 *                             type string;
 *                         }
 *                         list primitive {
 *                             key "index";
 *                             leaf index {
 *                                 type uint32;
 *                             }
 *                             leaf name {
 *                                 type string;
 *                             }
 *                         }
 *                     }
 *                     leaf user-defined-script {
 *                         type string;
 *                     }
 *                     list parameter-group {
 *                         key "name";
 *                         leaf name {
 *                             type string;
 *                         }
 *                         list parameter {
 *                             key "name";
 *                             leaf name {
 *                                 type string;
 *                             }
 *                             leaf data-type {
 *                                 type parameter-data-type;
 *                             }
 *                             leaf mandatory {
 *                                 type mandatory;
 *                             }
 *                             leaf default-value {
 *                                 type string;
 *                             }
 *                             leaf parameter-pool {
 *                                 type string;
 *                             }
 *                             leaf read-only {
 *                                 type read-only;
 *                             }
 *                             leaf hidden {
 *                                 type hidden;
 *                             }
 *                             uses primitive-parameter;
 *                         }
 *                         leaf mandatory {
 *                             type mandatory;
 *                         }
 *                     }
 *                     uses ui-primitive-group;
 *                 }
 *                 list initial-service-primitive {
 *                     key "seq";
 *                     leaf seq {
 *                         type uint64;
 *                     }
 *                     leaf name {
 *                         type string;
 *                     }
 *                     leaf user-defined-script {
 *                         type string;
 *                     }
 *                     list parameter {
 *                         key "name";
 *                         leaf name {
 *                             type string;
 *                         }
 *                         leaf value {
 *                             type string;
 *                         }
 *                     }
 *                     uses event-service-primitive;
 *                 }
 *                 list terminate-service-primitive {
 *                     key "seq";
 *                     leaf seq {
 *                         type uint64;
 *                     }
 *                     leaf name {
 *                         type string;
 *                     }
 *                     leaf user-defined-script {
 *                         type string;
 *                     }
 *                     list parameter {
 *                         key "name";
 *                         leaf name {
 *                             type string;
 *                         }
 *                         leaf value {
 *                             type string;
 *                         }
 *                     }
 *                     uses event-service-primitive;
 *                 }
 *                 list monitoring-param {
 *                     key "id";
 *                     leaf id {
 *                         type string;
 *                     }
 *                     leaf name {
 *                         type string;
 *                     }
 *                     leaf nsd-mon-param-ref {
 *                         type leafref;
 *                     }
 *                     list vnfr-mon-param-ref {
 *                         key "vnfr-id-ref" "vnfr-mon-param-ref";
 *                         leaf vnfr-id-ref {
 *                             type uuid;
 *                         }
 *                         leaf vnfr-mon-param-ref {
 *                             type leafref;
 *                         }
 *                     }
 *                     leaf value-type {
 *                         type value-type;
 *                     }
 *                     container numeric-constraints {
 *                         leaf min-value {
 *                             type uint64;
 *                         }
 *                         leaf max-value {
 *                             type uint64;
 *                         }
 *                     }
 *                     container text-constraints {
 *                         leaf min-length {
 *                             type uint8;
 *                         }
 *                         leaf max-length {
 *                             type uint8;
 *                         }
 *                     }
 *                     leaf value-integer {
 *                         type int64;
 *                     }
 *                     leaf value-decimal {
 *                         type decimal64;
 *                     }
 *                     leaf value-string {
 *                         type string;
 *                     }
 *                     leaf description {
 *                         type string;
 *                     }
 *                     leaf group-tag {
 *                         type string;
 *                     }
 *                     leaf widget-type {
 *                         type widget-type;
 *                     }
 *                     leaf units {
 *                         type string;
 *                     }
 *                     leaf aggregation-type {
 *                         type aggregation-type;
 *                     }
 *                     uses monitoring-param-ui-data;
 *                     uses monitoring-param-aggregation;
 *                     uses monitoring-param-value;
 *                 }
 *                 list config-agent-job {
 *                     key "job-id";
 *                     leaf job-id {
 *                         type uint64;
 *                     }
 *                     leaf job-name {
 *                         type string;
 *                     }
 *                     leaf job-status {
 *                         type enumeration;
 *                     }
 *                     leaf triggered-by {
 *                         type trigger-type;
 *                     }
 *                     leaf create-time {
 *                         type uint32;
 *                     }
 *                     leaf job-status-details {
 *                         type string;
 *                     }
 *                     list parameter-group {
 *                         key "name";
 *                         leaf name {
 *                             type string;
 *                         }
 *                         list parameter {
 *                             key "name";
 *                             leaf name {
 *                                 type string;
 *                             }
 *                             leaf value {
 *                                 type string;
 *                             }
 *                         }
 *                         uses primitive-parameter-value;
 *                     }
 *                     list vnfr {
 *                         key "id";
 *                         leaf id {
 *                             type uuid;
 *                         }
 *                         leaf vnf-job-status {
 *                             type enumeration;
 *                         }
 *                         list primitive {
 *                             key "name";
 *                             leaf name {
 *                                 type string;
 *                             }
 *                             leaf execution-id {
 *                                 type string;
 *                             }
 *                             leaf execution-status {
 *                                 type enumeration;
 *                             }
 *                             leaf execution-error-details {
 *                                 type string;
 *                             }
 *                             list parameter {
 *                                 key "name";
 *                                 leaf name {
 *                                     type string;
 *                                 }
 *                                 leaf value {
 *                                     type string;
 *                                 }
 *                             }
 *                             uses primitive-parameter-value;
 *                         }
 *                     }
 *                     list parameter {
 *                         key "name";
 *                         leaf name {
 *                             type string;
 *                         }
 *                         leaf value {
 *                             type string;
 *                         }
 *                     }
 *                     uses primitive-parameter-value;
 *                 }
 *                 list vnffgr {
 *                     key "id";
 *                     leaf id {
 *                         type uuid;
 *                     }
 *                     leaf vnffgd-id-ref {
 *                         type leafref;
 *                     }
 *                     leaf vnffgd-name-ref {
 *                         type leafref;
 *                     }
 *                     leaf sdn-account {
 *                         type string;
 *                     }
 *                     leaf cloud-account {
 *                         type string;
 *                     }
 *                     leaf operational-status {
 *                         type vnffgr-operational-status;
 *                     }
 *                     list rsp {
 *                         key "id";
 *                         leaf id {
 *                             type uuid;
 *                         }
 *                         leaf name {
 *                             type string;
 *                         }
 *                         leaf rsp-id {
 *                             type uuid;
 *                         }
 *                         leaf vnffgd-rsp-id-ref {
 *                             type leafref;
 *                         }
 *                         leaf vnffgd-rsp-name-ref {
 *                             type leafref;
 *                         }
 *                         leaf classifier-name {
 *                             type string;
 *                         }
 *                         leaf path-id {
 *                             type uint32;
 *                         }
 *                         list vnfr-connection-point-ref {
 *                             key "hop-number";
 *                             leaf hop-number {
 *                                 type uint8;
 *                             }
 *                             leaf service-function-type {
 *                                 type string;
 *                             }
 *                             leaf member-vnf-index-ref {
 *                                 type uint64;
 *                             }
 *                             leaf vnfd-id-ref {
 *                                 type string;
 *                             }
 *                             leaf vnfr-id-ref {
 *                                 type string;
 *                             }
 *                             leaf vnfr-name-ref {
 *                                 type string;
 *                             }
 *                             leaf vnfr-connection-point-ref {
 *                                 type leafref;
 *                             }
 *                             leaf service-index {
 *                                 type uint8;
 *                             }
 *                             container connection-point-params {
 *                                 leaf mgmt-address {
 *                                     type ip-address;
 *                                 }
 *                                 leaf name {
 *                                     type string;
 *                                 }
 *                                 leaf port-id {
 *                                     type string;
 *                                 }
 *                                 leaf vm-id {
 *                                     type string;
 *                                 }
 *                                 leaf address {
 *                                     type ip-address;
 *                                 }
 *                                 leaf port {
 *                                     type port-number;
 *                                 }
 *                             }
 *                             container service-function-forwarder {
 *                                 leaf name {
 *                                     type string;
 *                                 }
 *                                 leaf ip-address {
 *                                     type ip-address;
 *                                 }
 *                                 leaf port {
 *                                     type port-number;
 *                                 }
 *                             }
 *                         }
 *                     }
 *                     list classifier {
 *                         key "id";
 *                         leaf id {
 *                             type uuid;
 *                         }
 *                         leaf name {
 *                             type string;
 *                         }
 *                         leaf-list classifier-id {
 *                             type uuid;
 *                         }
 *                         leaf rsp-id-ref {
 *                             type leafref;
 *                         }
 *                         leaf rsp-name {
 *                             type string;
 *                         }
 *                         leaf vnfr-id-ref {
 *                             type string;
 *                         }
 *                         leaf vnfr-name-ref {
 *                             type string;
 *                         }
 *                         leaf vnfr-connection-point-ref {
 *                             type leafref;
 *                         }
 *                         leaf port-id {
 *                             type string;
 *                         }
 *                         leaf vm-id {
 *                             type string;
 *                         }
 *                         leaf ip-address {
 *                             type string;
 *                         }
 *                         leaf sff-name {
 *                             type string;
 *                         }
 *                     }
 *                 }
 *                 uses vnffgr;
 *             }
 *         }
 *         container vlr-catalog {
 *             leaf schema-version {
 *                 type schema-version;
 *             }
 *             list vlr {
 *                 key "id";
 *                 leaf id {
 *                     type uuid;
 *                 }
 *                 leaf name {
 *                     type string;
 *                 }
 *                 leaf nsr-id-ref {
 *                     type uuid;
 *                 }
 *                 leaf vld-ref {
 *                     type string;
 *                 }
 *                 leaf res-id {
 *                     type uuid;
 *                 }
 *                 leaf short-name {
 *                     type string;
 *                 }
 *                 leaf vendor {
 *                     type string;
 *                 }
 *                 leaf description {
 *                     type string;
 *                 }
 *                 leaf version {
 *                     type string;
 *                 }
 *                 leaf type {
 *                     type virtual-link-type;
 *                 }
 *                 leaf root-bandwidth {
 *                     type uint64;
 *                 }
 *                 leaf leaf-bandwidth {
 *                     type uint64;
 *                 }
 *                 leaf create-time {
 *                     type uint32;
 *                 }
 *                 leaf uptime {
 *                     type uint32;
 *                 }
 *                 leaf network-id {
 *                     type string;
 *                 }
 *                 leaf vim-network-name {
 *                     type string;
 *                 }
 *                 leaf status {
 *                     type enumeration;
 *                 }
 *                 leaf operational-status {
 *                     type enumeration;
 *                 }
 *                 container provider-network {
 *                     leaf physical-network {
 *                         type string;
 *                     }
 *                     leaf segmentation_id {
 *                         type uint32;
 *                     }
 *                 }
 *                 container ip-profile-params {
 *                     leaf ip-version {
 *                         type ip-version;
 *                     }
 *                     leaf subnet-address {
 *                         type ip-prefix;
 *                     }
 *                     leaf gateway-address {
 *                         type ip-address;
 *                     }
 *                     leaf security-group {
 *                         type string;
 *                     }
 *                     list dns-server {
 *                         key "address";
 *                         leaf address {
 *                             type ip-address;
 *                         }
 *                     }
 *                     container dhcp-params {
 *                         leaf enabled {
 *                             type enabled;
 *                         }
 *                         leaf start-address {
 *                             type ip-address;
 *                         }
 *                         leaf count {
 *                             type uint32;
 *                         }
 *                     }
 *                     leaf subnet-prefix-pool {
 *                         type string;
 *                     }
 *                 }
 *                 uses ip-profile-info;
 *                 uses provider-network;
 *             }
 *         }
 *         container vnfd-catalog {
 *             list vnfd {
 *                 key "id";
 *                 leaf id {
 *                     type string;
 *                 }
 *                 leaf name {
 *                     type string;
 *                 }
 *                 leaf short-name {
 *                     type string;
 *                 }
 *                 leaf vendor {
 *                     type string;
 *                 }
 *                 leaf logo {
 *                     type string;
 *                 }
 *                 leaf description {
 *                     type string;
 *                 }
 *                 leaf version {
 *                     type string;
 *                 }
 *                 container vnf-configuration {
 *                     choice config-method {
 *                         case juju {
 *                             container juju {
 *                                 leaf charm {
 *                                     type string;
 *                                 }
 *                                 leaf proxy {
 *                                     type proxy;
 *                                 }
 *                                 container vca-relationships {
 *                                     list relation {
 *                                         key "requires" "provides";
 *                                         leaf requires {
 *                                             type string;
 *                                         }
 *                                         leaf provides {
 *                                             type string;
 *                                         }
 *                                     }
 *                                 }
 *                                 uses vca-relationships;
 *                             }
 *                         }
 *                         case script {
 *                             container script {
 *                                 leaf script-type {
 *                                     type enumeration;
 *                                 }
 *                             }
 *                         }
 *                     }
 *                     list config-primitive {
 *                         key "name";
 *                         leaf name {
 *                             type string;
 *                         }
 *                         list parameter {
 *                             key "name";
 *                             leaf name {
 *                                 type string;
 *                             }
 *                             leaf data-type {
 *                                 type parameter-data-type;
 *                             }
 *                             leaf mandatory {
 *                                 type mandatory;
 *                             }
 *                             leaf default-value {
 *                                 type string;
 *                             }
 *                             leaf parameter-pool {
 *                                 type string;
 *                             }
 *                             leaf read-only {
 *                                 type read-only;
 *                             }
 *                             leaf hidden {
 *                                 type hidden;
 *                             }
 *                             uses primitive-parameter;
 *                         }
 *                         leaf user-defined-script {
 *                             type string;
 *                         }
 *                     }
 *                     list initial-config-primitive {
 *                         key "seq";
 *                         leaf seq {
 *                             type uint64;
 *                         }
 *                         choice primitive-type {
 *                             case primitive-definition {
 *                                 leaf name {
 *                                     type string;
 *                                 }
 *                                 leaf user-defined-script {
 *                                     type string;
 *                                 }
 *                                 list parameter {
 *                                     key "name";
 *                                     leaf name {
 *                                         type string;
 *                                     }
 *                                     leaf value {
 *                                         type string;
 *                                     }
 *                                 }
 *                             }
 *                         }
 *                     }
 *                     uses vca-configuration;
 *                 }
 *                 leaf operational-status {
 *                     type vnf-operational-status;
 *                 }
 *                 container mgmt-interface {
 *                     choice endpoint-type {
 *                         case cp {
 *                             leaf cp {
 *                                 type string;
 *                             }
 *                         }
 *                         case ip {
 *                             leaf ip-address {
 *                                 type ip-address;
 *                             }
 *                         }
 *                         case vdu-id {
 *                             leaf vdu-id {
 *                                 type string;
 *                             }
 *                         }
 *                     }
 *                     leaf port {
 *                         type port-number;
 *                     }
 *                     container dashboard-params {
 *                         leaf path {
 *                             type string;
 *                         }
 *                         leaf https {
 *                             type boolean;
 *                         }
 *                         leaf port {
 *                             type port-number;
 *                         }
 *                     }
 *                 }
 *                 list internal-vld {
 *                     key "id";
 *                     leaf id {
 *                         type string;
 *                     }
 *                     leaf name {
 *                         type string;
 *                     }
 *                     leaf short-name {
 *                         type string;
 *                     }
 *                     leaf description {
 *                         type string;
 *                     }
 *                     leaf type {
 *                         type virtual-link-type;
 *                     }
 *                     leaf root-bandwidth {
 *                         type uint64;
 *                     }
 *                     leaf leaf-bandwidth {
 *                         type uint64;
 *                     }
 *                     list internal-connection-point {
 *                         key "id-ref";
 *                         leaf id-ref {
 *                             type string;
 *                         }
 *                         leaf ip-address {
 *                             type ip-address;
 *                         }
 *                     }
 *                     choice init-params {
 *                         case vim-network-profile {
 *                             leaf ip-profile-ref {
 *                                 type string;
 *                             }
 *                         }
 *                         case vim-network-ref {
 *                             leaf vim-network-name {
 *                                 type string;
 *                             }
 *                         }
 *                     }
 *                     container provider-network {
 *                         leaf physical-network {
 *                             type string;
 *                         }
 *                         leaf segmentation_id {
 *                             type uint32;
 *                         }
 *                     }
 *                     uses provider-network;
 *                 }
 *                 list connection-point {
 *                     key "name";
 *                     leaf name {
 *                         type string;
 *                     }
 *                     leaf id {
 *                         type string;
 *                     }
 *                     leaf short-name {
 *                         type string;
 *                     }
 *                     leaf type {
 *                         type connection-point-type;
 *                     }
 *                     leaf port-security-enabled {
 *                         type boolean;
 *                     }
 *                     uses common-connection-point;
 *                 }
 *                 list vdu {
 *                     key "id";
 *                     leaf id {
 *                         type string;
 *                     }
 *                     leaf name {
 *                         type string;
 *                     }
 *                     leaf description {
 *                         type string;
 *                     }
 *                     leaf count {
 *                         type uint64;
 *                     }
 *                     leaf mgmt-vpci {
 *                         type string;
 *                     }
 *                     list alarm {
 *                         key "alarm-id";
 *                         leaf alarm-id {
 *                             type string;
 *                         }
 *                         leaf name {
 *                             type string;
 *                         }
 *                         leaf description {
 *                             type string;
 *                         }
 *                         leaf vdur-id {
 *                             type string;
 *                         }
 *                         container actions {
 *                             list ok {
 *                                 key "url";
 *                                 leaf url {
 *                                     type string;
 *                                 }
 *                             }
 *                             list insufficient-data {
 *                                 key "url";
 *                                 leaf url {
 *                                     type string;
 *                                 }
 *                             }
 *                             list alarm {
 *                                 key "url";
 *                                 leaf url {
 *                                     type string;
 *                                 }
 *                             }
 *                         }
 *                         leaf repeat {
 *                             type repeat;
 *                         }
 *                         leaf enabled {
 *                             type enabled;
 *                         }
 *                         leaf severity {
 *                             type alarm-severity-type;
 *                         }
 *                         leaf metric {
 *                             type alarm-metric-type;
 *                         }
 *                         leaf statistic {
 *                             type alarm-statistic-type;
 *                         }
 *                         leaf operation {
 *                             type alarm-operation-type;
 *                         }
 *                         leaf value {
 *                             type decimal64;
 *                         }
 *                         leaf period {
 *                             type uint32;
 *                         }
 *                         leaf evaluations {
 *                             type uint32;
 *                         }
 *                         uses alarm;
 *                     }
 *                     list alternative-images {
 *                         key "vim-type";
 *                         leaf vim-type {
 *                             type string;
 *                         }
 *                         leaf image {
 *                             type string;
 *                         }
 *                         leaf image-checksum {
 *                             type string;
 *                         }
 *                         uses image-properties;
 *                     }
 *                     container vdu-configuration {
 *                         choice config-method {
 *                             case juju {
 *                                 container juju {
 *                                     leaf charm {
 *                                         type string;
 *                                     }
 *                                     leaf proxy {
 *                                         type proxy;
 *                                     }
 *                                     container vca-relationships {
 *                                         list relation {
 *                                             key "requires" "provides";
 *                                             leaf requires {
 *                                                 type string;
 *                                             }
 *                                             leaf provides {
 *                                                 type string;
 *                                             }
 *                                         }
 *                                     }
 *                                     uses vca-relationships;
 *                                 }
 *                             }
 *                             case script {
 *                                 container script {
 *                                     leaf script-type {
 *                                         type enumeration;
 *                                     }
 *                                 }
 *                             }
 *                         }
 *                         list config-primitive {
 *                             key "name";
 *                             leaf name {
 *                                 type string;
 *                             }
 *                             list parameter {
 *                                 key "name";
 *                                 leaf name {
 *                                     type string;
 *                                 }
 *                                 leaf data-type {
 *                                     type parameter-data-type;
 *                                 }
 *                                 leaf mandatory {
 *                                     type mandatory;
 *                                 }
 *                                 leaf default-value {
 *                                     type string;
 *                                 }
 *                                 leaf parameter-pool {
 *                                     type string;
 *                                 }
 *                                 leaf read-only {
 *                                     type read-only;
 *                                 }
 *                                 leaf hidden {
 *                                     type hidden;
 *                                 }
 *                                 uses primitive-parameter;
 *                             }
 *                             leaf user-defined-script {
 *                                 type string;
 *                             }
 *                         }
 *                         list initial-config-primitive {
 *                             key "seq";
 *                             leaf seq {
 *                                 type uint64;
 *                             }
 *                             choice primitive-type {
 *                                 case primitive-definition {
 *                                     leaf name {
 *                                         type string;
 *                                     }
 *                                     leaf user-defined-script {
 *                                         type string;
 *                                     }
 *                                     list parameter {
 *                                         key "name";
 *                                         leaf name {
 *                                             type string;
 *                                         }
 *                                         leaf value {
 *                                             type string;
 *                                         }
 *                                     }
 *                                 }
 *                             }
 *                         }
 *                         uses vca-configuration;
 *                     }
 *                     choice cloud-init-input {
 *                         case filename {
 *                             leaf cloud-init-file {
 *                                 type string;
 *                             }
 *                         }
 *                         case inline {
 *                             leaf cloud-init {
 *                                 type string;
 *                             }
 *                         }
 *                     }
 *                     list internal-connection-point {
 *                         key "id";
 *                         leaf internal-vld-ref {
 *                             type leafref;
 *                         }
 *                         leaf name {
 *                             type string;
 *                         }
 *                         leaf id {
 *                             type string;
 *                         }
 *                         leaf short-name {
 *                             type string;
 *                         }
 *                         leaf type {
 *                             type connection-point-type;
 *                         }
 *                         leaf port-security-enabled {
 *                             type boolean;
 *                         }
 *                         uses common-connection-point;
 *                     }
 *                     list interface {
 *                         key "name";
 *                         leaf name {
 *                             type string;
 *                         }
 *                         leaf position {
 *                             type uint32;
 *                         }
 *                         leaf type {
 *                             type type;
 *                         }
 *                         leaf mac-address {
 *                             type string;
 *                         }
 *                         choice connection-point-type {
 *                             case external {
 *                                 leaf external-connection-point-ref {
 *                                     type string;
 *                                 }
 *                             }
 *                             case internal {
 *                                 leaf internal-connection-point-ref {
 *                                     type string;
 *                                 }
 *                             }
 *                         }
 *                         container virtual-interface {
 *                             leaf type {
 *                                 type type;
 *                             }
 *                             leaf vpci {
 *                                 type string;
 *                             }
 *                             leaf bandwidth {
 *                                 type uint64;
 *                             }
 *                         }
 *                         uses virtual-interface;
 *                     }
 *                     list volumes {
 *                         key "name";
 *                         leaf name {
 *                             type string;
 *                         }
 *                         leaf description {
 *                             type string;
 *                         }
 *                         leaf size {
 *                             type uint64;
 *                         }
 *                         choice volume-source {
 *                             case ephemeral {
 *                                 leaf ephemeral {
 *                                     type empty;
 *                                 }
 *                             }
 *                             case image {
 *                                 leaf image {
 *                                     type string;
 *                                 }
 *                                 leaf image-checksum {
 *                                     type string;
 *                                 }
 *                             }
 *                         }
 *                         leaf device-bus {
 *                             type enumeration;
 *                         }
 *                         leaf device-type {
 *                             type enumeration;
 *                         }
 *                         uses volume-info;
 *                     }
 *                     container vm-flavor {
 *                         leaf vcpu-count {
 *                             type uint16;
 *                         }
 *                         leaf memory-mb {
 *                             type uint64;
 *                         }
 *                         leaf storage-gb {
 *                             type uint64;
 *                         }
 *                     }
 *                     container guest-epa {
 *                         leaf trusted-execution {
 *                             type boolean;
 *                         }
 *                         leaf mempage-size {
 *                             type enumeration;
 *                         }
 *                         leaf cpu-pinning-policy {
 *                             type cpu-pinning-policy;
 *                         }
 *                         leaf cpu-thread-pinning-policy {
 *                             type enumeration;
 *                         }
 *                         list pcie-device {
 *                             key "device-id";
 *                             leaf device-id {
 *                                 type string;
 *                             }
 *                             leaf count {
 *                                 type uint64;
 *                             }
 *                         }
 *                         choice numa-policy {
 *                             case numa-aware {
 *                                 container numa-node-policy {
 *                                     leaf node-cnt {
 *                                         type uint16;
 *                                     }
 *                                     leaf mem-policy {
 *                                         type enumeration;
 *                                     }
 *                                     list node {
 *                                         key "id";
 *                                         leaf id {
 *                                             type uint64;
 *                                         }
 *                                         list vcpu {
 *                                             key "id";
 *                                             leaf id {
 *                                                 type uint64;
 *                                             }
 *                                         }
 *                                         leaf memory-mb {
 *                                             type uint64;
 *                                         }
 *                                         choice om-numa-type {
 *                                             case cores {
 *                                                 leaf num-cores {
 *                                                     type uint8;
 *                                                 }
 *                                             }
 *                                             case paired-threads {
 *                                                 container paired-threads {
 *                                                     leaf num-paired-threads {
 *                                                         type uint8;
 *                                                     }
 *                                                     list paired-thread-ids {
 *                                                         key "thread-a";
 *                                                         leaf thread-a {
 *                                                             type uint8;
 *                                                         }
 *                                                         leaf thread-b {
 *                                                             type uint8;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                             }
 *                                             case threads {
 *                                                 leaf num-threads {
 *                                                     type uint8;
 *                                                 }
 *                                             }
 *                                         }
 *                                     }
 *                                 }
 *                             }
 *                             case numa-unaware {
 *                                 leaf numa-unaware {
 *                                     type empty;
 *                                 }
 *                             }
 *                         }
 *                     }
 *                     container hypervisor-epa {
 *                         leaf type {
 *                             type enumeration;
 *                         }
 *                         leaf version {
 *                             type string;
 *                         }
 *                     }
 *                     leaf image {
 *                         type string;
 *                     }
 *                     leaf image-checksum {
 *                         type string;
 *                     }
 *                     container vswitch-epa {
 *                         leaf ovs-acceleration {
 *                             type enumeration;
 *                         }
 *                         leaf ovs-offload {
 *                             type enumeration;
 *                         }
 *                     }
 *                     container host-epa {
 *                         leaf cpu-model {
 *                             type enumeration;
 *                         }
 *                         leaf cpu-arch {
 *                             type enumeration;
 *                         }
 *                         leaf cpu-vendor {
 *                             type enumeration;
 *                         }
 *                         leaf cpu-socket-count {
 *                             type uint64;
 *                         }
 *                         leaf cpu-core-count {
 *                             type uint64;
 *                         }
 *                         leaf cpu-core-thread-count {
 *                             type uint64;
 *                         }
 *                         list cpu-feature {
 *                             key "feature";
 *                             leaf feature {
 *                                 type cpu-feature-type;
 *                             }
 *                         }
 *                         leaf om-cpu-model-string {
 *                             type string;
 *                         }
 *                         list om-cpu-feature {
 *                             key "feature";
 *                             leaf feature {
 *                                 type string;
 *                             }
 *                         }
 *                     }
 *                     container supplemental-boot-data {
 *                         leaf boot-data-drive {
 *                             type boot-data-drive;
 *                         }
 *                         list config-file {
 *                             key "source";
 *                             leaf source {
 *                                 type string;
 *                             }
 *                             leaf dest {
 *                                 type string;
 *                             }
 *                         }
 *                         uses config-file;
 *                     }
 *                     uses guest-epa;
 *                     uses supplemental-boot-data;
 *                     uses host-epa;
 *                     uses vm-flavor;
 *                     uses image-properties;
 *                     uses vswitch-epa;
 *                     uses hypervisor-epa;
 *                 }
 *                 list vdu-dependency {
 *                     key "vdu-source-ref";
 *                     leaf vdu-source-ref {
 *                         type string;
 *                     }
 *                     leaf vdu-depends-on-ref {
 *                         type string;
 *                     }
 *                 }
 *                 leaf service-function-chain {
 *                     type service-function-chain;
 *                 }
 *                 leaf service-function-type {
 *                     type string;
 *                 }
 *                 list placement-groups {
 *                     key "name";
 *                     list member-vdus {
 *                         key "member-vdu-ref";
 *                         leaf member-vdu-ref {
 *                             type string;
 *                         }
 *                     }
 *                     leaf name {
 *                         type string;
 *                     }
 *                     leaf requirement {
 *                         type string;
 *                     }
 *                     leaf strategy {
 *                         type strategy;
 *                     }
 *                     uses placement-group-info;
 *                 }
 *                 list http-endpoint {
 *                     key "path";
 *                     leaf path {
 *                         type string;
 *                     }
 *                     leaf https {
 *                         type https;
 *                     }
 *                     leaf port {
 *                         type port-number;
 *                     }
 *                     leaf username {
 *                         type string;
 *                     }
 *                     leaf password {
 *                         type string;
 *                     }
 *                     leaf polling-interval-secs {
 *                         type polling-interval-secs;
 *                     }
 *                     leaf method {
 *                         type method;
 *                     }
 *                     list headers {
 *                         key "akey";
 *                         leaf akey {
 *                             type string;
 *                         }
 *                         leaf value {
 *                             type string;
 *                         }
 *                     }
 *                 }
 *                 list monitoring-param {
 *                     key "id";
 *                     leaf id {
 *                         type string;
 *                     }
 *                     leaf name {
 *                         type string;
 *                     }
 *                     leaf http-endpoint-ref {
 *                         type leafref;
 *                     }
 *                     leaf json-query-method {
 *                         type json-query-method;
 *                     }
 *                     container json-query-params {
 *                         leaf json-path {
 *                             type string;
 *                         }
 *                         leaf object-path {
 *                             type string;
 *                         }
 *                     }
 *                     leaf value-type {
 *                         type value-type;
 *                     }
 *                     container numeric-constraints {
 *                         leaf min-value {
 *                             type uint64;
 *                         }
 *                         leaf max-value {
 *                             type uint64;
 *                         }
 *                     }
 *                     container text-constraints {
 *                         leaf min-length {
 *                             type uint8;
 *                         }
 *                         leaf max-length {
 *                             type uint8;
 *                         }
 *                     }
 *                     leaf value-integer {
 *                         type int64;
 *                     }
 *                     leaf value-decimal {
 *                         type decimal64;
 *                     }
 *                     leaf value-string {
 *                         type string;
 *                     }
 *                     leaf description {
 *                         type string;
 *                     }
 *                     leaf group-tag {
 *                         type string;
 *                     }
 *                     leaf widget-type {
 *                         type widget-type;
 *                     }
 *                     leaf units {
 *                         type string;
 *                     }
 *                     uses monitoring-param-ui-data;
 *                     uses monitoring-param-value;
 *                 }
 *                 list ip-profiles {
 *                     key "name";
 *                     leaf name {
 *                         type string;
 *                     }
 *                     leaf description {
 *                         type string;
 *                     }
 *                     container ip-profile-params {
 *                         leaf ip-version {
 *                             type ip-version;
 *                         }
 *                         leaf subnet-address {
 *                             type ip-prefix;
 *                         }
 *                         leaf gateway-address {
 *                             type ip-address;
 *                         }
 *                         leaf security-group {
 *                             type string;
 *                         }
 *                         list dns-server {
 *                             key "address";
 *                             leaf address {
 *                                 type ip-address;
 *                             }
 *                         }
 *                         container dhcp-params {
 *                             leaf enabled {
 *                                 type enabled;
 *                             }
 *                             leaf start-address {
 *                                 type ip-address;
 *                             }
 *                             leaf count {
 *                                 type uint32;
 *                             }
 *                         }
 *                         leaf subnet-prefix-pool {
 *                             type string;
 *                         }
 *                     }
 *                     uses ip-profile-info;
 *                 }
 *                 uses vnfd-descriptor;
 *             }
 *         }
 *         container vnfr-catalog {
 *             leaf schema-version {
 *                 type schema-version;
 *             }
 *             list vnfr {
 *                 key "id";
 *                 leaf id {
 *                     type uuid;
 *                 }
 *                 leaf nsr-id-ref {
 *                     type uuid;
 *                 }
 *                 leaf member-vnf-index-ref {
 *                     type leafref;
 *                 }
 *                 leaf dashboard-url {
 *                     type uri;
 *                 }
 *                 leaf name {
 *                     type string;
 *                 }
 *                 leaf short-name {
 *                     type string;
 *                 }
 *                 leaf vendor {
 *                     type string;
 *                 }
 *                 leaf description {
 *                     type string;
 *                 }
 *                 leaf version {
 *                     type string;
 *                 }
 *                 leaf create-time {
 *                     type uint32;
 *                 }
 *                 leaf uptime {
 *                     type uint32;
 *                 }
 *                 container vnfd {
 *                     leaf id {
 *                         type string;
 *                     }
 *                     leaf name {
 *                         type string;
 *                     }
 *                     leaf short-name {
 *                         type string;
 *                     }
 *                     leaf vendor {
 *                         type string;
 *                     }
 *                     leaf logo {
 *                         type string;
 *                     }
 *                     leaf description {
 *                         type string;
 *                     }
 *                     leaf version {
 *                         type string;
 *                     }
 *                     container vnf-configuration {
 *                         choice config-method {
 *                             case juju {
 *                                 container juju {
 *                                     leaf charm {
 *                                         type string;
 *                                     }
 *                                     leaf proxy {
 *                                         type proxy;
 *                                     }
 *                                     container vca-relationships {
 *                                         list relation {
 *                                             key "requires" "provides";
 *                                             leaf requires {
 *                                                 type string;
 *                                             }
 *                                             leaf provides {
 *                                                 type string;
 *                                             }
 *                                         }
 *                                     }
 *                                     uses vca-relationships;
 *                                 }
 *                             }
 *                             case script {
 *                                 container script {
 *                                     leaf script-type {
 *                                         type enumeration;
 *                                     }
 *                                 }
 *                             }
 *                         }
 *                         list config-primitive {
 *                             key "name";
 *                             leaf name {
 *                                 type string;
 *                             }
 *                             list parameter {
 *                                 key "name";
 *                                 leaf name {
 *                                     type string;
 *                                 }
 *                                 leaf data-type {
 *                                     type parameter-data-type;
 *                                 }
 *                                 leaf mandatory {
 *                                     type mandatory;
 *                                 }
 *                                 leaf default-value {
 *                                     type string;
 *                                 }
 *                                 leaf parameter-pool {
 *                                     type string;
 *                                 }
 *                                 leaf read-only {
 *                                     type read-only;
 *                                 }
 *                                 leaf hidden {
 *                                     type hidden;
 *                                 }
 *                                 uses primitive-parameter;
 *                             }
 *                             leaf user-defined-script {
 *                                 type string;
 *                             }
 *                         }
 *                         list initial-config-primitive {
 *                             key "seq";
 *                             leaf seq {
 *                                 type uint64;
 *                             }
 *                             choice primitive-type {
 *                                 case primitive-definition {
 *                                     leaf name {
 *                                         type string;
 *                                     }
 *                                     leaf user-defined-script {
 *                                         type string;
 *                                     }
 *                                     list parameter {
 *                                         key "name";
 *                                         leaf name {
 *                                             type string;
 *                                         }
 *                                         leaf value {
 *                                             type string;
 *                                         }
 *                                     }
 *                                 }
 *                             }
 *                         }
 *                         uses vca-configuration;
 *                     }
 *                     leaf operational-status {
 *                         type vnf-operational-status;
 *                     }
 *                     container mgmt-interface {
 *                         choice endpoint-type {
 *                             case cp {
 *                                 leaf cp {
 *                                     type string;
 *                                 }
 *                             }
 *                             case ip {
 *                                 leaf ip-address {
 *                                     type ip-address;
 *                                 }
 *                             }
 *                             case vdu-id {
 *                                 leaf vdu-id {
 *                                     type string;
 *                                 }
 *                             }
 *                         }
 *                         leaf port {
 *                             type port-number;
 *                         }
 *                         container dashboard-params {
 *                             leaf path {
 *                                 type string;
 *                             }
 *                             leaf https {
 *                                 type boolean;
 *                             }
 *                             leaf port {
 *                                 type port-number;
 *                             }
 *                         }
 *                     }
 *                     list internal-vld {
 *                         key "id";
 *                         leaf id {
 *                             type string;
 *                         }
 *                         leaf name {
 *                             type string;
 *                         }
 *                         leaf short-name {
 *                             type string;
 *                         }
 *                         leaf description {
 *                             type string;
 *                         }
 *                         leaf type {
 *                             type virtual-link-type;
 *                         }
 *                         leaf root-bandwidth {
 *                             type uint64;
 *                         }
 *                         leaf leaf-bandwidth {
 *                             type uint64;
 *                         }
 *                         list internal-connection-point {
 *                             key "id-ref";
 *                             leaf id-ref {
 *                                 type string;
 *                             }
 *                             leaf ip-address {
 *                                 type ip-address;
 *                             }
 *                         }
 *                         choice init-params {
 *                             case vim-network-profile {
 *                                 leaf ip-profile-ref {
 *                                     type string;
 *                                 }
 *                             }
 *                             case vim-network-ref {
 *                                 leaf vim-network-name {
 *                                     type string;
 *                                 }
 *                             }
 *                         }
 *                         container provider-network {
 *                             leaf physical-network {
 *                                 type string;
 *                             }
 *                             leaf segmentation_id {
 *                                 type uint32;
 *                             }
 *                         }
 *                         uses provider-network;
 *                     }
 *                     list connection-point {
 *                         key "name";
 *                         leaf name {
 *                             type string;
 *                         }
 *                         leaf id {
 *                             type string;
 *                         }
 *                         leaf short-name {
 *                             type string;
 *                         }
 *                         leaf type {
 *                             type connection-point-type;
 *                         }
 *                         leaf port-security-enabled {
 *                             type boolean;
 *                         }
 *                         uses common-connection-point;
 *                     }
 *                     list vdu {
 *                         key "id";
 *                         leaf id {
 *                             type string;
 *                         }
 *                         leaf name {
 *                             type string;
 *                         }
 *                         leaf description {
 *                             type string;
 *                         }
 *                         leaf count {
 *                             type uint64;
 *                         }
 *                         leaf mgmt-vpci {
 *                             type string;
 *                         }
 *                         list alarm {
 *                             key "alarm-id";
 *                             leaf alarm-id {
 *                                 type string;
 *                             }
 *                             leaf name {
 *                                 type string;
 *                             }
 *                             leaf description {
 *                                 type string;
 *                             }
 *                             leaf vdur-id {
 *                                 type string;
 *                             }
 *                             container actions {
 *                                 list ok {
 *                                     key "url";
 *                                     leaf url {
 *                                         type string;
 *                                     }
 *                                 }
 *                                 list insufficient-data {
 *                                     key "url";
 *                                     leaf url {
 *                                         type string;
 *                                     }
 *                                 }
 *                                 list alarm {
 *                                     key "url";
 *                                     leaf url {
 *                                         type string;
 *                                     }
 *                                 }
 *                             }
 *                             leaf repeat {
 *                                 type repeat;
 *                             }
 *                             leaf enabled {
 *                                 type enabled;
 *                             }
 *                             leaf severity {
 *                                 type alarm-severity-type;
 *                             }
 *                             leaf metric {
 *                                 type alarm-metric-type;
 *                             }
 *                             leaf statistic {
 *                                 type alarm-statistic-type;
 *                             }
 *                             leaf operation {
 *                                 type alarm-operation-type;
 *                             }
 *                             leaf value {
 *                                 type decimal64;
 *                             }
 *                             leaf period {
 *                                 type uint32;
 *                             }
 *                             leaf evaluations {
 *                                 type uint32;
 *                             }
 *                             uses alarm;
 *                         }
 *                         list alternative-images {
 *                             key "vim-type";
 *                             leaf vim-type {
 *                                 type string;
 *                             }
 *                             leaf image {
 *                                 type string;
 *                             }
 *                             leaf image-checksum {
 *                                 type string;
 *                             }
 *                             uses image-properties;
 *                         }
 *                         container vdu-configuration {
 *                             choice config-method {
 *                                 case juju {
 *                                     container juju {
 *                                         leaf charm {
 *                                             type string;
 *                                         }
 *                                         leaf proxy {
 *                                             type proxy;
 *                                         }
 *                                         container vca-relationships {
 *                                             list relation {
 *                                                 key "requires" "provides";
 *                                                 leaf requires {
 *                                                     type string;
 *                                                 }
 *                                                 leaf provides {
 *                                                     type string;
 *                                                 }
 *                                             }
 *                                         }
 *                                         uses vca-relationships;
 *                                     }
 *                                 }
 *                                 case script {
 *                                     container script {
 *                                         leaf script-type {
 *                                             type enumeration;
 *                                         }
 *                                     }
 *                                 }
 *                             }
 *                             list config-primitive {
 *                                 key "name";
 *                                 leaf name {
 *                                     type string;
 *                                 }
 *                                 list parameter {
 *                                     key "name";
 *                                     leaf name {
 *                                         type string;
 *                                     }
 *                                     leaf data-type {
 *                                         type parameter-data-type;
 *                                     }
 *                                     leaf mandatory {
 *                                         type mandatory;
 *                                     }
 *                                     leaf default-value {
 *                                         type string;
 *                                     }
 *                                     leaf parameter-pool {
 *                                         type string;
 *                                     }
 *                                     leaf read-only {
 *                                         type read-only;
 *                                     }
 *                                     leaf hidden {
 *                                         type hidden;
 *                                     }
 *                                     uses primitive-parameter;
 *                                 }
 *                                 leaf user-defined-script {
 *                                     type string;
 *                                 }
 *                             }
 *                             list initial-config-primitive {
 *                                 key "seq";
 *                                 leaf seq {
 *                                     type uint64;
 *                                 }
 *                                 choice primitive-type {
 *                                     case primitive-definition {
 *                                         leaf name {
 *                                             type string;
 *                                         }
 *                                         leaf user-defined-script {
 *                                             type string;
 *                                         }
 *                                         list parameter {
 *                                             key "name";
 *                                             leaf name {
 *                                                 type string;
 *                                             }
 *                                             leaf value {
 *                                                 type string;
 *                                             }
 *                                         }
 *                                     }
 *                                 }
 *                             }
 *                             uses vca-configuration;
 *                         }
 *                         choice cloud-init-input {
 *                             case filename {
 *                                 leaf cloud-init-file {
 *                                     type string;
 *                                 }
 *                             }
 *                             case inline {
 *                                 leaf cloud-init {
 *                                     type string;
 *                                 }
 *                             }
 *                         }
 *                         list internal-connection-point {
 *                             key "id";
 *                             leaf internal-vld-ref {
 *                                 type leafref;
 *                             }
 *                             leaf name {
 *                                 type string;
 *                             }
 *                             leaf id {
 *                                 type string;
 *                             }
 *                             leaf short-name {
 *                                 type string;
 *                             }
 *                             leaf type {
 *                                 type connection-point-type;
 *                             }
 *                             leaf port-security-enabled {
 *                                 type boolean;
 *                             }
 *                             uses common-connection-point;
 *                         }
 *                         list interface {
 *                             key "name";
 *                             leaf name {
 *                                 type string;
 *                             }
 *                             leaf position {
 *                                 type uint32;
 *                             }
 *                             leaf type {
 *                                 type type;
 *                             }
 *                             leaf mac-address {
 *                                 type string;
 *                             }
 *                             choice connection-point-type {
 *                                 case external {
 *                                     leaf external-connection-point-ref {
 *                                         type string;
 *                                     }
 *                                 }
 *                                 case internal {
 *                                     leaf internal-connection-point-ref {
 *                                         type string;
 *                                     }
 *                                 }
 *                             }
 *                             container virtual-interface {
 *                                 leaf type {
 *                                     type type;
 *                                 }
 *                                 leaf vpci {
 *                                     type string;
 *                                 }
 *                                 leaf bandwidth {
 *                                     type uint64;
 *                                 }
 *                             }
 *                             uses virtual-interface;
 *                         }
 *                         list volumes {
 *                             key "name";
 *                             leaf name {
 *                                 type string;
 *                             }
 *                             leaf description {
 *                                 type string;
 *                             }
 *                             leaf size {
 *                                 type uint64;
 *                             }
 *                             choice volume-source {
 *                                 case ephemeral {
 *                                     leaf ephemeral {
 *                                         type empty;
 *                                     }
 *                                 }
 *                                 case image {
 *                                     leaf image {
 *                                         type string;
 *                                     }
 *                                     leaf image-checksum {
 *                                         type string;
 *                                     }
 *                                 }
 *                             }
 *                             leaf device-bus {
 *                                 type enumeration;
 *                             }
 *                             leaf device-type {
 *                                 type enumeration;
 *                             }
 *                             uses volume-info;
 *                         }
 *                         container vm-flavor {
 *                             leaf vcpu-count {
 *                                 type uint16;
 *                             }
 *                             leaf memory-mb {
 *                                 type uint64;
 *                             }
 *                             leaf storage-gb {
 *                                 type uint64;
 *                             }
 *                         }
 *                         container guest-epa {
 *                             leaf trusted-execution {
 *                                 type boolean;
 *                             }
 *                             leaf mempage-size {
 *                                 type enumeration;
 *                             }
 *                             leaf cpu-pinning-policy {
 *                                 type cpu-pinning-policy;
 *                             }
 *                             leaf cpu-thread-pinning-policy {
 *                                 type enumeration;
 *                             }
 *                             list pcie-device {
 *                                 key "device-id";
 *                                 leaf device-id {
 *                                     type string;
 *                                 }
 *                                 leaf count {
 *                                     type uint64;
 *                                 }
 *                             }
 *                             choice numa-policy {
 *                                 case numa-aware {
 *                                     container numa-node-policy {
 *                                         leaf node-cnt {
 *                                             type uint16;
 *                                         }
 *                                         leaf mem-policy {
 *                                             type enumeration;
 *                                         }
 *                                         list node {
 *                                             key "id";
 *                                             leaf id {
 *                                                 type uint64;
 *                                             }
 *                                             list vcpu {
 *                                                 key "id";
 *                                                 leaf id {
 *                                                     type uint64;
 *                                                 }
 *                                             }
 *                                             leaf memory-mb {
 *                                                 type uint64;
 *                                             }
 *                                             choice om-numa-type {
 *                                                 case cores {
 *                                                     leaf num-cores {
 *                                                         type uint8;
 *                                                     }
 *                                                 }
 *                                                 case paired-threads {
 *                                                     container paired-threads {
 *                                                         leaf num-paired-threads {
 *                                                             type uint8;
 *                                                         }
 *                                                         list paired-thread-ids {
 *                                                             key "thread-a";
 *                                                             leaf thread-a {
 *                                                                 type uint8;
 *                                                             }
 *                                                             leaf thread-b {
 *                                                                 type uint8;
 *                                                             }
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 case threads {
 *                                                     leaf num-threads {
 *                                                         type uint8;
 *                                                     }
 *                                                 }
 *                                             }
 *                                         }
 *                                     }
 *                                 }
 *                                 case numa-unaware {
 *                                     leaf numa-unaware {
 *                                         type empty;
 *                                     }
 *                                 }
 *                             }
 *                         }
 *                         container hypervisor-epa {
 *                             leaf type {
 *                                 type enumeration;
 *                             }
 *                             leaf version {
 *                                 type string;
 *                             }
 *                         }
 *                         leaf image {
 *                             type string;
 *                         }
 *                         leaf image-checksum {
 *                             type string;
 *                         }
 *                         container vswitch-epa {
 *                             leaf ovs-acceleration {
 *                                 type enumeration;
 *                             }
 *                             leaf ovs-offload {
 *                                 type enumeration;
 *                             }
 *                         }
 *                         container host-epa {
 *                             leaf cpu-model {
 *                                 type enumeration;
 *                             }
 *                             leaf cpu-arch {
 *                                 type enumeration;
 *                             }
 *                             leaf cpu-vendor {
 *                                 type enumeration;
 *                             }
 *                             leaf cpu-socket-count {
 *                                 type uint64;
 *                             }
 *                             leaf cpu-core-count {
 *                                 type uint64;
 *                             }
 *                             leaf cpu-core-thread-count {
 *                                 type uint64;
 *                             }
 *                             list cpu-feature {
 *                                 key "feature";
 *                                 leaf feature {
 *                                     type cpu-feature-type;
 *                                 }
 *                             }
 *                             leaf om-cpu-model-string {
 *                                 type string;
 *                             }
 *                             list om-cpu-feature {
 *                                 key "feature";
 *                                 leaf feature {
 *                                     type string;
 *                                 }
 *                             }
 *                         }
 *                         container supplemental-boot-data {
 *                             leaf boot-data-drive {
 *                                 type boot-data-drive;
 *                             }
 *                             list config-file {
 *                                 key "source";
 *                                 leaf source {
 *                                     type string;
 *                                 }
 *                                 leaf dest {
 *                                     type string;
 *                                 }
 *                             }
 *                             uses config-file;
 *                         }
 *                         uses guest-epa;
 *                         uses supplemental-boot-data;
 *                         uses host-epa;
 *                         uses vm-flavor;
 *                         uses image-properties;
 *                         uses vswitch-epa;
 *                         uses hypervisor-epa;
 *                     }
 *                     list vdu-dependency {
 *                         key "vdu-source-ref";
 *                         leaf vdu-source-ref {
 *                             type string;
 *                         }
 *                         leaf vdu-depends-on-ref {
 *                             type string;
 *                         }
 *                     }
 *                     leaf service-function-chain {
 *                         type service-function-chain;
 *                     }
 *                     leaf service-function-type {
 *                         type string;
 *                     }
 *                     list placement-groups {
 *                         key "name";
 *                         list member-vdus {
 *                             key "member-vdu-ref";
 *                             leaf member-vdu-ref {
 *                                 type string;
 *                             }
 *                         }
 *                         leaf name {
 *                             type string;
 *                         }
 *                         leaf requirement {
 *                             type string;
 *                         }
 *                         leaf strategy {
 *                             type strategy;
 *                         }
 *                         uses placement-group-info;
 *                     }
 *                     list http-endpoint {
 *                         key "path";
 *                         leaf path {
 *                             type string;
 *                         }
 *                         leaf https {
 *                             type https;
 *                         }
 *                         leaf port {
 *                             type port-number;
 *                         }
 *                         leaf username {
 *                             type string;
 *                         }
 *                         leaf password {
 *                             type string;
 *                         }
 *                         leaf polling-interval-secs {
 *                             type polling-interval-secs;
 *                         }
 *                         leaf method {
 *                             type method;
 *                         }
 *                         list headers {
 *                             key "akey";
 *                             leaf akey {
 *                                 type string;
 *                             }
 *                             leaf value {
 *                                 type string;
 *                             }
 *                         }
 *                     }
 *                     list monitoring-param {
 *                         key "id";
 *                         leaf id {
 *                             type string;
 *                         }
 *                         leaf name {
 *                             type string;
 *                         }
 *                         leaf http-endpoint-ref {
 *                             type leafref;
 *                         }
 *                         leaf json-query-method {
 *                             type json-query-method;
 *                         }
 *                         container json-query-params {
 *                             leaf json-path {
 *                                 type string;
 *                             }
 *                             leaf object-path {
 *                                 type string;
 *                             }
 *                         }
 *                         leaf value-type {
 *                             type value-type;
 *                         }
 *                         container numeric-constraints {
 *                             leaf min-value {
 *                                 type uint64;
 *                             }
 *                             leaf max-value {
 *                                 type uint64;
 *                             }
 *                         }
 *                         container text-constraints {
 *                             leaf min-length {
 *                                 type uint8;
 *                             }
 *                             leaf max-length {
 *                                 type uint8;
 *                             }
 *                         }
 *                         leaf value-integer {
 *                             type int64;
 *                         }
 *                         leaf value-decimal {
 *                             type decimal64;
 *                         }
 *                         leaf value-string {
 *                             type string;
 *                         }
 *                         leaf description {
 *                             type string;
 *                         }
 *                         leaf group-tag {
 *                             type string;
 *                         }
 *                         leaf widget-type {
 *                             type widget-type;
 *                         }
 *                         leaf units {
 *                             type string;
 *                         }
 *                         uses monitoring-param-ui-data;
 *                         uses monitoring-param-value;
 *                     }
 *                     list ip-profiles {
 *                         key "name";
 *                         leaf name {
 *                             type string;
 *                         }
 *                         leaf description {
 *                             type string;
 *                         }
 *                         container ip-profile-params {
 *                             leaf ip-version {
 *                                 type ip-version;
 *                             }
 *                             leaf subnet-address {
 *                                 type ip-prefix;
 *                             }
 *                             leaf gateway-address {
 *                                 type ip-address;
 *                             }
 *                             leaf security-group {
 *                                 type string;
 *                             }
 *                             list dns-server {
 *                                 key "address";
 *                                 leaf address {
 *                                     type ip-address;
 *                                 }
 *                             }
 *                             container dhcp-params {
 *                                 leaf enabled {
 *                                     type enabled;
 *                                 }
 *                                 leaf start-address {
 *                                     type ip-address;
 *                                 }
 *                                 leaf count {
 *                                     type uint32;
 *                                 }
 *                             }
 *                             leaf subnet-prefix-pool {
 *                                 type string;
 *                             }
 *                         }
 *                         uses ip-profile-info;
 *                     }
 *                     uses vnfd-descriptor;
 *                 }
 *                 leaf vnfd-ref {
 *                     type leafref;
 *                 }
 *                 container vnf-configuration {
 *                     choice config-method {
 *                         case juju {
 *                             container juju {
 *                                 leaf charm {
 *                                     type string;
 *                                 }
 *                                 leaf proxy {
 *                                     type proxy;
 *                                 }
 *                                 container vca-relationships {
 *                                     list relation {
 *                                         key "requires" "provides";
 *                                         leaf requires {
 *                                             type string;
 *                                         }
 *                                         leaf provides {
 *                                             type string;
 *                                         }
 *                                     }
 *                                 }
 *                                 uses vca-relationships;
 *                             }
 *                         }
 *                         case script {
 *                             container script {
 *                                 leaf script-type {
 *                                     type enumeration;
 *                                 }
 *                             }
 *                         }
 *                     }
 *                     list config-primitive {
 *                         key "name";
 *                         leaf name {
 *                             type string;
 *                         }
 *                         list parameter {
 *                             key "name";
 *                             leaf name {
 *                                 type string;
 *                             }
 *                             leaf data-type {
 *                                 type parameter-data-type;
 *                             }
 *                             leaf mandatory {
 *                                 type mandatory;
 *                             }
 *                             leaf default-value {
 *                                 type string;
 *                             }
 *                             leaf parameter-pool {
 *                                 type string;
 *                             }
 *                             leaf read-only {
 *                                 type read-only;
 *                             }
 *                             leaf hidden {
 *                                 type hidden;
 *                             }
 *                             uses primitive-parameter;
 *                         }
 *                         leaf user-defined-script {
 *                             type string;
 *                         }
 *                     }
 *                     list initial-config-primitive {
 *                         key "seq";
 *                         leaf seq {
 *                             type uint64;
 *                         }
 *                         choice primitive-type {
 *                             case primitive-definition {
 *                                 leaf name {
 *                                     type string;
 *                                 }
 *                                 leaf user-defined-script {
 *                                     type string;
 *                                 }
 *                                 list parameter {
 *                                     key "name";
 *                                     leaf name {
 *                                         type string;
 *                                     }
 *                                     leaf value {
 *                                         type string;
 *                                     }
 *                                 }
 *                             }
 *                         }
 *                     }
 *                     uses vca-configuration;
 *                 }
 *                 container mgmt-interface {
 *                     leaf ip-address {
 *                         type ip-address;
 *                     }
 *                     leaf port {
 *                         type port-number;
 *                     }
 *                     container ssh-key {
 *                         leaf public-key {
 *                             type string;
 *                         }
 *                         leaf private-key-file {
 *                             type string;
 *                         }
 *                     }
 *                 }
 *                 list internal-vlr {
 *                     key "vlr-ref";
 *                     leaf vlr-ref {
 *                         type leafref;
 *                     }
 *                     leaf-list internal-connection-point-ref {
 *                         type string;
 *                     }
 *                 }
 *                 list connection-point {
 *                     key "name";
 *                     leaf vlr-ref {
 *                         type leafref;
 *                     }
 *                     leaf ip-address {
 *                         type ip-address;
 *                     }
 *                     leaf mac-address {
 *                         type string;
 *                     }
 *                     leaf connection-point-id {
 *                         type string;
 *                     }
 *                     leaf name {
 *                         type string;
 *                     }
 *                     leaf id {
 *                         type string;
 *                     }
 *                     leaf short-name {
 *                         type string;
 *                     }
 *                     leaf type {
 *                         type connection-point-type;
 *                     }
 *                     leaf port-security-enabled {
 *                         type boolean;
 *                     }
 *                     list virtual-cps {
 *                         key "name";
 *                         leaf ip-address {
 *                             type ip-address;
 *                         }
 *                         leaf mac-address {
 *                             type string;
 *                         }
 *                         leaf connection-point-id {
 *                             type string;
 *                         }
 *                         leaf name {
 *                             type string;
 *                         }
 *                         leaf id {
 *                             type string;
 *                         }
 *                         leaf short-name {
 *                             type string;
 *                         }
 *                         leaf type {
 *                             type connection-point-type;
 *                         }
 *                         leaf port-security-enabled {
 *                             type boolean;
 *                         }
 *                         uses common-connection-point;
 *                     }
 *                     uses common-connection-point;
 *                     uses associated-virtual-cps;
 *                 }
 *                 list vdur {
 *                     key "id";
 *                     leaf id {
 *                         type uuid;
 *                     }
 *                     leaf name {
 *                         type string;
 *                     }
 *                     leaf unique-short-name {
 *                         type string;
 *                     }
 *                     leaf vdu-id-ref {
 *                         type leafref;
 *                     }
 *                     leaf vim-id {
 *                         type string;
 *                     }
 *                     leaf flavor-id {
 *                         type string;
 *                     }
 *                     leaf image-id {
 *                         type string;
 *                     }
 *                     leaf management-ip {
 *                         type ip-address;
 *                     }
 *                     leaf vm-management-ip {
 *                         type ip-address;
 *                     }
 *                     leaf console-url {
 *                         type uri;
 *                     }
 *                     container vdu-configuration {
 *                         choice config-method {
 *                             case juju {
 *                                 container juju {
 *                                     leaf charm {
 *                                         type string;
 *                                     }
 *                                     leaf proxy {
 *                                         type proxy;
 *                                     }
 *                                     container vca-relationships {
 *                                         list relation {
 *                                             key "requires" "provides";
 *                                             leaf requires {
 *                                                 type string;
 *                                             }
 *                                             leaf provides {
 *                                                 type string;
 *                                             }
 *                                         }
 *                                     }
 *                                     uses vca-relationships;
 *                                 }
 *                             }
 *                             case script {
 *                                 container script {
 *                                     leaf script-type {
 *                                         type enumeration;
 *                                     }
 *                                 }
 *                             }
 *                         }
 *                         list config-primitive {
 *                             key "name";
 *                             leaf name {
 *                                 type string;
 *                             }
 *                             list parameter {
 *                                 key "name";
 *                                 leaf name {
 *                                     type string;
 *                                 }
 *                                 leaf data-type {
 *                                     type parameter-data-type;
 *                                 }
 *                                 leaf mandatory {
 *                                     type mandatory;
 *                                 }
 *                                 leaf default-value {
 *                                     type string;
 *                                 }
 *                                 leaf parameter-pool {
 *                                     type string;
 *                                 }
 *                                 leaf read-only {
 *                                     type read-only;
 *                                 }
 *                                 leaf hidden {
 *                                     type hidden;
 *                                 }
 *                                 uses primitive-parameter;
 *                             }
 *                             leaf user-defined-script {
 *                                 type string;
 *                             }
 *                         }
 *                         list initial-config-primitive {
 *                             key "seq";
 *                             leaf seq {
 *                                 type uint64;
 *                             }
 *                             choice primitive-type {
 *                                 case primitive-definition {
 *                                     leaf name {
 *                                         type string;
 *                                     }
 *                                     leaf user-defined-script {
 *                                         type string;
 *                                     }
 *                                     list parameter {
 *                                         key "name";
 *                                         leaf name {
 *                                             type string;
 *                                         }
 *                                         leaf value {
 *                                             type string;
 *                                         }
 *                                     }
 *                                 }
 *                             }
 *                         }
 *                         uses vca-configuration;
 *                     }
 *                     list volumes {
 *                         key "name";
 *                         leaf name {
 *                             type string;
 *                         }
 *                         leaf volume-id {
 *                             type string;
 *                         }
 *                         leaf description {
 *                             type string;
 *                         }
 *                         leaf size {
 *                             type uint64;
 *                         }
 *                         choice volume-source {
 *                             case ephemeral {
 *                                 leaf ephemeral {
 *                                     type empty;
 *                                 }
 *                             }
 *                             case image {
 *                                 leaf image {
 *                                     type string;
 *                                 }
 *                                 leaf image-checksum {
 *                                     type string;
 *                                 }
 *                             }
 *                         }
 *                         leaf device-bus {
 *                             type enumeration;
 *                         }
 *                         leaf device-type {
 *                             type enumeration;
 *                         }
 *                         uses volume-info;
 *                     }
 *                     list internal-connection-point {
 *                         key "id";
 *                         leaf ip-address {
 *                             type ip-address;
 *                         }
 *                         leaf mac-address {
 *                             type string;
 *                         }
 *                         leaf connection-point-id {
 *                             type string;
 *                         }
 *                         leaf name {
 *                             type string;
 *                         }
 *                         leaf id {
 *                             type string;
 *                         }
 *                         leaf short-name {
 *                             type string;
 *                         }
 *                         leaf type {
 *                             type connection-point-type;
 *                         }
 *                         leaf port-security-enabled {
 *                             type boolean;
 *                         }
 *                         list virtual-cps {
 *                             key "name";
 *                             leaf ip-address {
 *                                 type ip-address;
 *                             }
 *                             leaf mac-address {
 *                                 type string;
 *                             }
 *                             leaf connection-point-id {
 *                                 type string;
 *                             }
 *                             leaf name {
 *                                 type string;
 *                             }
 *                             leaf id {
 *                                 type string;
 *                             }
 *                             leaf short-name {
 *                                 type string;
 *                             }
 *                             leaf type {
 *                                 type connection-point-type;
 *                             }
 *                             leaf port-security-enabled {
 *                                 type boolean;
 *                             }
 *                             uses common-connection-point;
 *                         }
 *                         uses common-connection-point;
 *                         uses associated-virtual-cps;
 *                     }
 *                     list interface {
 *                         key "name";
 *                         leaf name {
 *                             type string;
 *                         }
 *                         leaf position {
 *                             type uint32;
 *                         }
 *                         leaf type {
 *                             type type;
 *                         }
 *                         choice connection-point-type {
 *                             case external {
 *                                 leaf external-connection-point-ref {
 *                                     type string;
 *                                 }
 *                             }
 *                             case internal {
 *                                 leaf internal-connection-point-ref {
 *                                     type string;
 *                                 }
 *                             }
 *                         }
 *                         container virtual-interface {
 *                             leaf type {
 *                                 type enumeration;
 *                             }
 *                             leaf bandwidth {
 *                                 type uint64;
 *                             }
 *                             leaf ovs-offload {
 *                                 type enumeration;
 *                             }
 *                             leaf vendor-id {
 *                                 type string;
 *                             }
 *                             leaf datapath-library {
 *                                 type string;
 *                             }
 *                             leaf provider-network-name {
 *                                 type string;
 *                             }
 *                         }
 *                         uses virtual-interface;
 *                     }
 *                     leaf operational-status {
 *                         type vdu-operational-status;
 *                     }
 *                     container vswitch-epa {
 *                         leaf ovs-acceleration {
 *                             type enumeration;
 *                         }
 *                         leaf ovs-offload {
 *                             type enumeration;
 *                         }
 *                     }
 *                     container hypervisor-epa {
 *                         leaf type {
 *                             type enumeration;
 *                         }
 *                         leaf version {
 *                             type string;
 *                         }
 *                     }
 *                     container vm-flavor {
 *                         leaf vcpu-count {
 *                             type uint16;
 *                         }
 *                         leaf memory-mb {
 *                             type uint64;
 *                         }
 *                         leaf storage-gb {
 *                             type uint64;
 *                         }
 *                     }
 *                     container guest-epa {
 *                         leaf trusted-execution {
 *                             type boolean;
 *                         }
 *                         leaf mempage-size {
 *                             type enumeration;
 *                         }
 *                         leaf cpu-pinning-policy {
 *                             type cpu-pinning-policy;
 *                         }
 *                         leaf cpu-thread-pinning-policy {
 *                             type enumeration;
 *                         }
 *                         list pcie-device {
 *                             key "device-id";
 *                             leaf device-id {
 *                                 type string;
 *                             }
 *                             leaf count {
 *                                 type uint64;
 *                             }
 *                         }
 *                         choice numa-policy {
 *                             case numa-aware {
 *                                 container numa-node-policy {
 *                                     leaf node-cnt {
 *                                         type uint16;
 *                                     }
 *                                     leaf mem-policy {
 *                                         type enumeration;
 *                                     }
 *                                     list node {
 *                                         key "id";
 *                                         leaf id {
 *                                             type uint64;
 *                                         }
 *                                         list vcpu {
 *                                             key "id";
 *                                             leaf id {
 *                                                 type uint64;
 *                                             }
 *                                         }
 *                                         leaf memory-mb {
 *                                             type uint64;
 *                                         }
 *                                         choice om-numa-type {
 *                                             case cores {
 *                                                 leaf num-cores {
 *                                                     type uint8;
 *                                                 }
 *                                             }
 *                                             case paired-threads {
 *                                                 container paired-threads {
 *                                                     leaf num-paired-threads {
 *                                                         type uint8;
 *                                                     }
 *                                                     list paired-thread-ids {
 *                                                         key "thread-a";
 *                                                         leaf thread-a {
 *                                                             type uint8;
 *                                                         }
 *                                                         leaf thread-b {
 *                                                             type uint8;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                             }
 *                                             case threads {
 *                                                 leaf num-threads {
 *                                                     type uint8;
 *                                                 }
 *                                             }
 *                                         }
 *                                     }
 *                                 }
 *                             }
 *                             case numa-unaware {
 *                                 leaf numa-unaware {
 *                                     type empty;
 *                                 }
 *                             }
 *                         }
 *                     }
 *                     container supplemental-boot-data {
 *                         leaf boot-data-drive {
 *                             type boot-data-drive;
 *                         }
 *                         list config-file {
 *                             key "source";
 *                             leaf source {
 *                                 type string;
 *                             }
 *                             leaf dest {
 *                                 type string;
 *                             }
 *                         }
 *                         uses config-file;
 *                     }
 *                     container host-epa {
 *                         leaf cpu-model {
 *                             type enumeration;
 *                         }
 *                         leaf cpu-arch {
 *                             type enumeration;
 *                         }
 *                         leaf cpu-vendor {
 *                             type enumeration;
 *                         }
 *                         leaf cpu-socket-count {
 *                             type uint64;
 *                         }
 *                         leaf cpu-core-count {
 *                             type uint64;
 *                         }
 *                         leaf cpu-core-thread-count {
 *                             type uint64;
 *                         }
 *                         list cpu-feature {
 *                             key "feature";
 *                             leaf feature {
 *                                 type cpu-feature-type;
 *                             }
 *                         }
 *                         leaf om-cpu-model-string {
 *                             type string;
 *                         }
 *                         list om-cpu-feature {
 *                             key "feature";
 *                             leaf feature {
 *                                 type string;
 *                             }
 *                         }
 *                     }
 *                     list placement-groups-info {
 *                         key "name";
 *                         leaf name {
 *                             type string;
 *                         }
 *                         leaf requirement {
 *                             type string;
 *                         }
 *                         leaf strategy {
 *                             type strategy;
 *                         }
 *                         leaf cloud-type {
 *                             type cloud-account-type;
 *                         }
 *                         choice cloud-provider {
 *                             case aws {
 *                                 leaf aws-construct {
 *                                     type empty;
 *                                 }
 *                             }
 *                             case cloudsim {
 *                                 leaf cloudsim-construct {
 *                                     type empty;
 *                                 }
 *                             }
 *                             case mock {
 *                                 leaf mock-construct {
 *                                     type empty;
 *                                 }
 *                             }
 *                             case openmano {
 *                                 leaf openmano-construct {
 *                                     type empty;
 *                                 }
 *                             }
 *                             case openstack {
 *                                 container availability-zone {
 *                                     leaf name {
 *                                         type string;
 *                                     }
 *                                 }
 *                                 container server-group {
 *                                     leaf name {
 *                                         type string;
 *                                     }
 *                                 }
 *                                 list host-aggregate {
 *                                     key "metadata-key";
 *                                     leaf metadata-key {
 *                                         type string;
 *                                     }
 *                                     leaf metadata-value {
 *                                         type string;
 *                                     }
 *                                 }
 *                             }
 *                             case vsphere {
 *                                 leaf vsphere-construct {
 *                                     type empty;
 *                                 }
 *                             }
 *                         }
 *                         uses placement-group-info;
 *                         uses placement-group-input;
 *                     }
 *                     uses guest-epa;
 *                     uses supplemental-boot-data;
 *                     uses host-epa;
 *                     uses vm-flavor;
 *                     uses vswitch-epa;
 *                     uses placement-group-info;
 *                     uses hypervisor-epa;
 *                 }
 *                 leaf operational-status {
 *                     type vnf-operational-status;
 *                 }
 *                 leaf config-status {
 *                     type enumeration;
 *                 }
 *                 container cloud-config {
 *                     list key-pair {
 *                         key "name";
 *                         leaf name {
 *                             type string;
 *                         }
 *                         leaf akey {
 *                             type string;
 *                         }
 *                     }
 *                     list user {
 *                         key "name";
 *                         leaf name {
 *                             type string;
 *                         }
 *                         leaf user-info {
 *                             type string;
 *                         }
 *                         list key-pair {
 *                             key "name";
 *                             leaf name {
 *                                 type string;
 *                             }
 *                             leaf akey {
 *                                 type string;
 *                             }
 *                         }
 *                     }
 *                     uses cloud-config;
 *                 }
 *                 list placement-groups-info {
 *                     key "name";
 *                     leaf name {
 *                         type string;
 *                     }
 *                     leaf requirement {
 *                         type string;
 *                     }
 *                     leaf strategy {
 *                         type strategy;
 *                     }
 *                     leaf cloud-type {
 *                         type cloud-account-type;
 *                     }
 *                     choice cloud-provider {
 *                         case aws {
 *                             leaf aws-construct {
 *                                 type empty;
 *                             }
 *                         }
 *                         case cloudsim {
 *                             leaf cloudsim-construct {
 *                                 type empty;
 *                             }
 *                         }
 *                         case mock {
 *                             leaf mock-construct {
 *                                 type empty;
 *                             }
 *                         }
 *                         case openmano {
 *                             leaf openmano-construct {
 *                                 type empty;
 *                             }
 *                         }
 *                         case openstack {
 *                             container availability-zone {
 *                                 leaf name {
 *                                     type string;
 *                                 }
 *                             }
 *                             container server-group {
 *                                 leaf name {
 *                                     type string;
 *                                 }
 *                             }
 *                             list host-aggregate {
 *                                 key "metadata-key";
 *                                 leaf metadata-key {
 *                                     type string;
 *                                 }
 *                                 leaf metadata-value {
 *                                     type string;
 *                                 }
 *                             }
 *                         }
 *                         case vsphere {
 *                             leaf vsphere-construct {
 *                                 type empty;
 *                             }
 *                         }
 *                     }
 *                     uses placement-group-info;
 *                     uses placement-group-input;
 *                 }
 *                 list http-endpoint {
 *                     key "path";
 *                     leaf path {
 *                         type string;
 *                     }
 *                     leaf https {
 *                         type https;
 *                     }
 *                     leaf port {
 *                         type port-number;
 *                     }
 *                     leaf username {
 *                         type string;
 *                     }
 *                     leaf password {
 *                         type string;
 *                     }
 *                     leaf polling-interval-secs {
 *                         type polling-interval-secs;
 *                     }
 *                     leaf method {
 *                         type method;
 *                     }
 *                     list headers {
 *                         key "akey";
 *                         leaf akey {
 *                             type string;
 *                         }
 *                         leaf value {
 *                             type string;
 *                         }
 *                     }
 *                 }
 *                 list monitoring-param {
 *                     key "id";
 *                     leaf id {
 *                         type string;
 *                     }
 *                     leaf name {
 *                         type string;
 *                     }
 *                     leaf http-endpoint-ref {
 *                         type leafref;
 *                     }
 *                     leaf json-query-method {
 *                         type json-query-method;
 *                     }
 *                     container json-query-params {
 *                         leaf json-path {
 *                             type string;
 *                         }
 *                         leaf object-path {
 *                             type string;
 *                         }
 *                     }
 *                     leaf value-type {
 *                         type value-type;
 *                     }
 *                     container numeric-constraints {
 *                         leaf min-value {
 *                             type uint64;
 *                         }
 *                         leaf max-value {
 *                             type uint64;
 *                         }
 *                     }
 *                     container text-constraints {
 *                         leaf min-length {
 *                             type uint8;
 *                         }
 *                         leaf max-length {
 *                             type uint8;
 *                         }
 *                     }
 *                     leaf value-integer {
 *                         type int64;
 *                     }
 *                     leaf value-decimal {
 *                         type decimal64;
 *                     }
 *                     leaf value-string {
 *                         type string;
 *                     }
 *                     leaf description {
 *                         type string;
 *                     }
 *                     leaf group-tag {
 *                         type string;
 *                     }
 *                     leaf widget-type {
 *                         type widget-type;
 *                     }
 *                     leaf units {
 *                         type string;
 *                     }
 *                     uses monitoring-param-ui-data;
 *                     uses monitoring-param-value;
 *                 }
 *                 uses monitoring-param;
 *                 uses placement-group-info;
 *             }
 *         }
 *         container ns-instance-config {
 *             list nsr {
 *                 key "id";
 *                 leaf schema-version {
 *                     type schema-version;
 *                 }
 *                 leaf id {
 *                     type uuid;
 *                 }
 *                 leaf name {
 *                     type string;
 *                 }
 *                 leaf short-name {
 *                     type string;
 *                 }
 *                 leaf description {
 *                     type string;
 *                 }
 *                 leaf admin-status {
 *                     type enumeration;
 *                 }
 *                 container nsd {
 *                     list constituent-vnfd {
 *                         key "member-vnf-index";
 *                         leaf member-vnf-index {
 *                             type uint64;
 *                         }
 *                         leaf vnfd-id-ref {
 *                             type leafref;
 *                         }
 *                         leaf start-by-default {
 *                             type start-by-default;
 *                         }
 *                     }
 *                     list vnf-dependency {
 *                         key "vnf-source-ref";
 *                         leaf vnf-source-ref {
 *                             type string;
 *                         }
 *                         leaf vnf-depends-on-ref {
 *                             type string;
 *                         }
 *                     }
 *                     list placement-groups {
 *                         key "name";
 *                         list member-vnfd {
 *                             key "member-vnf-index-ref";
 *                             leaf member-vnf-index-ref {
 *                                 type string;
 *                             }
 *                             leaf vnfd-id-ref {
 *                                 type string;
 *                             }
 *                         }
 *                         leaf name {
 *                             type string;
 *                         }
 *                         leaf requirement {
 *                             type string;
 *                         }
 *                         leaf strategy {
 *                             type strategy;
 *                         }
 *                         uses placement-group-info;
 *                     }
 *                     list vld {
 *                         key "id";
 *                         list vnfd-connection-point-ref {
 *                             key "member-vnf-index-ref" "vnfd-connection-point-ref";
 *                             leaf member-vnf-index-ref {
 *                                 type string;
 *                             }
 *                             leaf vnfd-id-ref {
 *                                 type string;
 *                             }
 *                             leaf vnfd-connection-point-ref {
 *                                 type leafref;
 *                             }
 *                         }
 *                         leaf id {
 *                             type string;
 *                         }
 *                         leaf name {
 *                             type string;
 *                         }
 *                         leaf short-name {
 *                             type string;
 *                         }
 *                         leaf vendor {
 *                             type string;
 *                         }
 *                         leaf description {
 *                             type string;
 *                         }
 *                         leaf version {
 *                             type string;
 *                         }
 *                         leaf type {
 *                             type virtual-link-type;
 *                         }
 *                         leaf root-bandwidth {
 *                             type uint64;
 *                         }
 *                         leaf leaf-bandwidth {
 *                             type uint64;
 *                         }
 *                         leaf mgmt-network {
 *                             type mgmt-network;
 *                         }
 *                         choice init-params {
 *                             case vim-network-profile {
 *                                 leaf ip-profile-ref {
 *                                     type string;
 *                                 }
 *                             }
 *                             case vim-network-ref {
 *                                 leaf vim-network-name {
 *                                     type string;
 *                                 }
 *                             }
 *                         }
 *                         container provider-network {
 *                             leaf physical-network {
 *                                 type string;
 *                             }
 *                             leaf segmentation_id {
 *                                 type uint32;
 *                             }
 *                         }
 *                         uses nsd-vld-common;
 *                     }
 *                     list monitoring-param {
 *                         key "id";
 *                         list vnfd-monitoring-param {
 *                             key "member-vnf-index-ref" "vnfd-monitoring-param-ref";
 *                             leaf vnfd-id-ref {
 *                                 type string;
 *                             }
 *                             leaf vnfd-monitoring-param-ref {
 *                                 type leafref;
 *                             }
 *                             leaf member-vnf-index-ref {
 *                                 type string;
 *                             }
 *                         }
 *                         leaf id {
 *                             type string;
 *                         }
 *                         leaf name {
 *                             type string;
 *                         }
 *                         leaf value-type {
 *                             type value-type;
 *                         }
 *                         container numeric-constraints {
 *                             leaf min-value {
 *                                 type uint64;
 *                             }
 *                             leaf max-value {
 *                                 type uint64;
 *                             }
 *                         }
 *                         container text-constraints {
 *                             leaf min-length {
 *                                 type uint8;
 *                             }
 *                             leaf max-length {
 *                                 type uint8;
 *                             }
 *                         }
 *                         leaf value-integer {
 *                             type int64;
 *                         }
 *                         leaf value-decimal {
 *                             type decimal64;
 *                         }
 *                         leaf value-string {
 *                             type string;
 *                         }
 *                         leaf aggregation-type {
 *                             type aggregation-type;
 *                         }
 *                         leaf description {
 *                             type string;
 *                         }
 *                         leaf group-tag {
 *                             type string;
 *                         }
 *                         leaf widget-type {
 *                             type widget-type;
 *                         }
 *                         leaf units {
 *                             type string;
 *                         }
 *                         uses monitoring-param-common;
 *                     }
 *                     list service-primitive {
 *                         key "name";
 *                         leaf name {
 *                             type string;
 *                         }
 *                         list parameter {
 *                             key "name";
 *                             leaf name {
 *                                 type string;
 *                             }
 *                             leaf data-type {
 *                                 type parameter-data-type;
 *                             }
 *                             leaf mandatory {
 *                                 type mandatory;
 *                             }
 *                             leaf default-value {
 *                                 type string;
 *                             }
 *                             leaf parameter-pool {
 *                                 type string;
 *                             }
 *                             leaf read-only {
 *                                 type read-only;
 *                             }
 *                             leaf hidden {
 *                                 type hidden;
 *                             }
 *                             uses primitive-parameter;
 *                         }
 *                         list vnf-primitive-group {
 *                             key "member-vnf-index-ref";
 *                             leaf member-vnf-index-ref {
 *                                 type string;
 *                             }
 *                             leaf vnfd-id-ref {
 *                                 type leafref;
 *                             }
 *                             leaf vnfd-name {
 *                                 type leafref;
 *                             }
 *                             list primitive {
 *                                 key "index";
 *                                 leaf index {
 *                                     type uint32;
 *                                 }
 *                                 leaf name {
 *                                     type string;
 *                                 }
 *                             }
 *                         }
 *                         leaf user-defined-script {
 *                             type string;
 *                         }
 *                         list parameter-group {
 *                             key "name";
 *                             leaf name {
 *                                 type string;
 *                             }
 *                             list parameter {
 *                                 key "name";
 *                                 leaf name {
 *                                     type string;
 *                                 }
 *                                 leaf data-type {
 *                                     type parameter-data-type;
 *                                 }
 *                                 leaf mandatory {
 *                                     type mandatory;
 *                                 }
 *                                 leaf default-value {
 *                                     type string;
 *                                 }
 *                                 leaf parameter-pool {
 *                                     type string;
 *                                 }
 *                                 leaf read-only {
 *                                     type read-only;
 *                                 }
 *                                 leaf hidden {
 *                                     type hidden;
 *                                 }
 *                                 uses primitive-parameter;
 *                             }
 *                             leaf mandatory {
 *                                 type mandatory;
 *                             }
 *                         }
 *                         uses ui-primitive-group;
 *                     }
 *                     leaf id {
 *                         type string;
 *                     }
 *                     leaf name {
 *                         type string;
 *                     }
 *                     leaf short-name {
 *                         type string;
 *                     }
 *                     leaf vendor {
 *                         type string;
 *                     }
 *                     leaf logo {
 *                         type string;
 *                     }
 *                     leaf description {
 *                         type string;
 *                     }
 *                     leaf version {
 *                         type string;
 *                     }
 *                     list connection-point {
 *                         key "name";
 *                         leaf name {
 *                             type string;
 *                         }
 *                         leaf type {
 *                             type connection-point-type;
 *                         }
 *                     }
 *                     list scaling-group-descriptor {
 *                         key "name";
 *                         leaf name {
 *                             type string;
 *                         }
 *                         list scaling-policy {
 *                             key "name";
 *                             leaf name {
 *                                 type string;
 *                             }
 *                             leaf scaling-type {
 *                                 type scaling-policy-type;
 *                             }
 *                             leaf enabled {
 *                                 type enabled;
 *                             }
 *                             leaf scale-in-operation-type {
 *                                 type scale-in-operation-type;
 *                             }
 *                             leaf scale-out-operation-type {
 *                                 type scale-out-operation-type;
 *                             }
 *                             leaf threshold-time {
 *                                 type uint32;
 *                             }
 *                             leaf cooldown-time {
 *                                 type uint32;
 *                             }
 *                             list scaling-criteria {
 *                                 key "name";
 *                                 leaf name {
 *                                     type string;
 *                                 }
 *                                 leaf scale-in-threshold {
 *                                     type uint64;
 *                                 }
 *                                 leaf scale-out-threshold {
 *                                     type uint64;
 *                                 }
 *                                 leaf ns-monitoring-param-ref {
 *                                     type string;
 *                                 }
 *                             }
 *                         }
 *                         list vnfd-member {
 *                             key "member-vnf-index-ref";
 *                             leaf member-vnf-index-ref {
 *                                 type string;
 *                             }
 *                             leaf count {
 *                                 type count;
 *                             }
 *                         }
 *                         leaf min-instance-count {
 *                             type min-instance-count;
 *                         }
 *                         leaf max-instance-count {
 *                             type max-instance-count;
 *                         }
 *                         list scaling-config-action {
 *                             key "trigger";
 *                             leaf trigger {
 *                                 type scaling-trigger;
 *                             }
 *                             leaf ns-service-primitive-name-ref {
 *                                 type string;
 *                             }
 *                         }
 *                     }
 *                     list vnffgd {
 *                         key "id";
 *                         leaf id {
 *                             type string;
 *                         }
 *                         leaf name {
 *                             type string;
 *                         }
 *                         leaf short-name {
 *                             type string;
 *                         }
 *                         leaf vendor {
 *                             type string;
 *                         }
 *                         leaf description {
 *                             type string;
 *                         }
 *                         leaf version {
 *                             type string;
 *                         }
 *                         list rsp {
 *                             key "id";
 *                             leaf id {
 *                                 type string;
 *                             }
 *                             leaf name {
 *                                 type string;
 *                             }
 *                             list vnfd-connection-point-ref {
 *                                 key "member-vnf-index-ref";
 *                                 leaf member-vnf-index-ref {
 *                                     type string;
 *                                 }
 *                                 leaf order {
 *                                     type uint8;
 *                                 }
 *                                 leaf vnfd-id-ref {
 *                                     type leafref;
 *                                 }
 *                                 leaf vnfd-connection-point-ref {
 *                                     type string;
 *                                 }
 *                             }
 *                         }
 *                         list classifier {
 *                             key "id";
 *                             leaf id {
 *                                 type string;
 *                             }
 *                             leaf name {
 *                                 type string;
 *                             }
 *                             leaf rsp-id-ref {
 *                                 type leafref;
 *                             }
 *                             leaf member-vnf-index-ref {
 *                                 type string;
 *                             }
 *                             leaf vnfd-id-ref {
 *                                 type leafref;
 *                             }
 *                             leaf vnfd-connection-point-ref {
 *                                 type string;
 *                             }
 *                             list match-attributes {
 *                                 key "id";
 *                                 leaf id {
 *                                     type string;
 *                                 }
 *                                 leaf ip-proto {
 *                                     type uint8;
 *                                 }
 *                                 leaf source-ip-address {
 *                                     type ip-address;
 *                                 }
 *                                 leaf destination-ip-address {
 *                                     type ip-address;
 *                                 }
 *                                 leaf source-port {
 *                                     type port-number;
 *                                 }
 *                                 leaf destination-port {
 *                                     type port-number;
 *                                 }
 *                             }
 *                         }
 *                     }
 *                     list initial-service-primitive {
 *                         key "seq";
 *                         leaf seq {
 *                             type uint64;
 *                         }
 *                         leaf name {
 *                             type string;
 *                         }
 *                         leaf user-defined-script {
 *                             type string;
 *                         }
 *                         list parameter {
 *                             key "name";
 *                             leaf name {
 *                                 type string;
 *                             }
 *                             leaf value {
 *                                 type string;
 *                             }
 *                         }
 *                         uses event-config;
 *                     }
 *                     list terminate-service-primitive {
 *                         key "seq";
 *                         leaf seq {
 *                             type uint64;
 *                         }
 *                         leaf name {
 *                             type string;
 *                         }
 *                         leaf user-defined-script {
 *                             type string;
 *                         }
 *                         list parameter {
 *                             key "name";
 *                             leaf name {
 *                                 type string;
 *                             }
 *                             leaf value {
 *                                 type string;
 *                             }
 *                         }
 *                         uses event-config;
 *                     }
 *                     list parameter-pool {
 *                         key "name";
 *                         leaf name {
 *                             type string;
 *                         }
 *                         container range {
 *                             leaf start-value {
 *                                 type uint32;
 *                             }
 *                             leaf end-value {
 *                                 type uint32;
 *                             }
 *                         }
 *                     }
 *                     list key-pair {
 *                         key "name";
 *                         leaf name {
 *                             type string;
 *                         }
 *                         leaf akey {
 *                             type string;
 *                         }
 *                     }
 *                     list user {
 *                         key "name";
 *                         leaf name {
 *                             type string;
 *                         }
 *                         leaf user-info {
 *                             type string;
 *                         }
 *                         list key-pair {
 *                             key "name";
 *                             leaf name {
 *                                 type string;
 *                             }
 *                             leaf akey {
 *                                 type string;
 *                             }
 *                         }
 *                     }
 *                     list input-parameter-xpath {
 *                         key "xpath";
 *                         leaf xpath {
 *                             type string;
 *                         }
 *                         leaf label {
 *                             type string;
 *                         }
 *                         leaf default-value {
 *                             type string;
 *                         }
 *                     }
 *                     list ip-profiles {
 *                         key "name";
 *                         leaf name {
 *                             type string;
 *                         }
 *                         leaf description {
 *                             type string;
 *                         }
 *                         container ip-profile-params {
 *                             leaf ip-version {
 *                                 type ip-version;
 *                             }
 *                             leaf subnet-address {
 *                                 type ip-prefix;
 *                             }
 *                             leaf gateway-address {
 *                                 type ip-address;
 *                             }
 *                             leaf security-group {
 *                                 type string;
 *                             }
 *                             list dns-server {
 *                                 key "address";
 *                                 leaf address {
 *                                     type ip-address;
 *                                 }
 *                             }
 *                             container dhcp-params {
 *                                 leaf enabled {
 *                                     type enabled;
 *                                 }
 *                                 leaf start-address {
 *                                     type ip-address;
 *                                 }
 *                                 leaf count {
 *                                     type uint32;
 *                                 }
 *                             }
 *                             leaf subnet-prefix-pool {
 *                                 type string;
 *                             }
 *                         }
 *                         uses ip-profile-info;
 *                     }
 *                     uses nsr-nsd-placement-groups;
 *                     uses nsr-nsd-vld;
 *                     uses nsr-nsd-vnf-dependency;
 *                     uses nsr-nsd-service-primitive;
 *                     uses nsr-nsd-constituent-vnfd;
 *                     uses nsd-descriptor-common;
 *                     uses nsr-nsd-monitoring-param;
 *                 }
 *                 list vnfd-placement-group-maps {
 *                     key "placement-group-ref" "vnfd-id-ref";
 *                     leaf vnfd-id-ref {
 *                         type uuid;
 *                     }
 *                     leaf placement-group-ref {
 *                         type leafref;
 *                     }
 *                     leaf cloud-type {
 *                         type cloud-account-type;
 *                     }
 *                     choice cloud-provider {
 *                         case aws {
 *                             leaf aws-construct {
 *                                 type empty;
 *                             }
 *                         }
 *                         case cloudsim {
 *                             leaf cloudsim-construct {
 *                                 type empty;
 *                             }
 *                         }
 *                         case mock {
 *                             leaf mock-construct {
 *                                 type empty;
 *                             }
 *                         }
 *                         case openmano {
 *                             leaf openmano-construct {
 *                                 type empty;
 *                             }
 *                         }
 *                         case openstack {
 *                             container availability-zone {
 *                                 leaf name {
 *                                     type string;
 *                                 }
 *                             }
 *                             container server-group {
 *                                 leaf name {
 *                                     type string;
 *                                 }
 *                             }
 *                             list host-aggregate {
 *                                 key "metadata-key";
 *                                 leaf metadata-key {
 *                                     type string;
 *                                 }
 *                                 leaf metadata-value {
 *                                     type string;
 *                                 }
 *                             }
 *                         }
 *                         case vsphere {
 *                             leaf vsphere-construct {
 *                                 type empty;
 *                             }
 *                         }
 *                     }
 *                     uses placement-group-input;
 *                 }
 *                 list ssh-authorized-key {
 *                     key "key-pair-ref";
 *                     leaf key-pair-ref {
 *                         type string;
 *                     }
 *                 }
 *                 list user {
 *                     key "name";
 *                     leaf name {
 *                         type string;
 *                     }
 *                     leaf user-info {
 *                         type string;
 *                     }
 *                     list ssh-authorized-key {
 *                         key "key-pair-ref";
 *                         leaf key-pair-ref {
 *                             type string;
 *                         }
 *                     }
 *                 }
 *                 list scaling-group {
 *                     key "scaling-group-name-ref";
 *                     leaf scaling-group-name-ref {
 *                         type string;
 *                     }
 *                     list instance {
 *                         key "id";
 *                         leaf id {
 *                             type uint16;
 *                         }
 *                     }
 *                 }
 *                 list nsd-placement-group-maps {
 *                     key "placement-group-ref";
 *                     leaf placement-group-ref {
 *                         type string;
 *                     }
 *                     leaf cloud-type {
 *                         type cloud-account-type;
 *                     }
 *                     choice cloud-provider {
 *                         case aws {
 *                             leaf aws-construct {
 *                                 type empty;
 *                             }
 *                         }
 *                         case cloudsim {
 *                             leaf cloudsim-construct {
 *                                 type empty;
 *                             }
 *                         }
 *                         case mock {
 *                             leaf mock-construct {
 *                                 type empty;
 *                             }
 *                         }
 *                         case openmano {
 *                             leaf openmano-construct {
 *                                 type empty;
 *                             }
 *                         }
 *                         case openstack {
 *                             container availability-zone {
 *                                 leaf name {
 *                                     type string;
 *                                 }
 *                             }
 *                             container server-group {
 *                                 leaf name {
 *                                     type string;
 *                                 }
 *                             }
 *                             list host-aggregate {
 *                                 key "metadata-key";
 *                                 leaf metadata-key {
 *                                     type string;
 *                                 }
 *                                 leaf metadata-value {
 *                                     type string;
 *                                 }
 *                             }
 *                         }
 *                         case vsphere {
 *                             leaf vsphere-construct {
 *                                 type empty;
 *                             }
 *                         }
 *                     }
 *                     uses placement-group-input;
 *                 }
 *                 list input-parameter {
 *                     key "xpath";
 *                     leaf xpath {
 *                         type string;
 *                     }
 *                     leaf value {
 *                         type string;
 *                     }
 *                 }
 *                 uses ns-instance-config-params;
 *             }
 *         }
 *         container nsd-catalog {
 *             list nsd {
 *                 key "id";
 *                 list constituent-vnfd {
 *                     key "member-vnf-index";
 *                     leaf member-vnf-index {
 *                         type uint64;
 *                     }
 *                     leaf vnfd-id-ref {
 *                         type leafref;
 *                     }
 *                     leaf start-by-default {
 *                         type start-by-default;
 *                     }
 *                 }
 *                 list vnf-dependency {
 *                     key "vnf-source-ref";
 *                     leaf vnf-source-ref {
 *                         type string;
 *                     }
 *                     leaf vnf-depends-on-ref {
 *                         type string;
 *                     }
 *                 }
 *                 list placement-groups {
 *                     key "name";
 *                     list member-vnfd {
 *                         key "member-vnf-index-ref";
 *                         leaf member-vnf-index-ref {
 *                             type string;
 *                         }
 *                         leaf vnfd-id-ref {
 *                             type string;
 *                         }
 *                     }
 *                     leaf name {
 *                         type string;
 *                     }
 *                     leaf requirement {
 *                         type string;
 *                     }
 *                     leaf strategy {
 *                         type strategy;
 *                     }
 *                     uses placement-group-info;
 *                 }
 *                 list vld {
 *                     key "id";
 *                     list vnfd-connection-point-ref {
 *                         key "member-vnf-index-ref" "vnfd-connection-point-ref";
 *                         leaf member-vnf-index-ref {
 *                             type string;
 *                         }
 *                         leaf vnfd-id-ref {
 *                             type leafref;
 *                         }
 *                         leaf vnfd-connection-point-ref {
 *                             type leafref;
 *                         }
 *                     }
 *                     leaf id {
 *                         type string;
 *                     }
 *                     leaf name {
 *                         type string;
 *                     }
 *                     leaf short-name {
 *                         type string;
 *                     }
 *                     leaf vendor {
 *                         type string;
 *                     }
 *                     leaf description {
 *                         type string;
 *                     }
 *                     leaf version {
 *                         type string;
 *                     }
 *                     leaf type {
 *                         type virtual-link-type;
 *                     }
 *                     leaf root-bandwidth {
 *                         type uint64;
 *                     }
 *                     leaf leaf-bandwidth {
 *                         type uint64;
 *                     }
 *                     leaf mgmt-network {
 *                         type mgmt-network;
 *                     }
 *                     choice init-params {
 *                         case vim-network-profile {
 *                             leaf ip-profile-ref {
 *                                 type string;
 *                             }
 *                         }
 *                         case vim-network-ref {
 *                             leaf vim-network-name {
 *                                 type string;
 *                             }
 *                         }
 *                     }
 *                     container provider-network {
 *                         leaf physical-network {
 *                             type string;
 *                         }
 *                         leaf segmentation_id {
 *                             type uint32;
 *                         }
 *                     }
 *                     uses nsd-vld-common;
 *                 }
 *                 list monitoring-param {
 *                     key "id";
 *                     list vnfd-monitoring-param {
 *                         key "member-vnf-index-ref" "vnfd-monitoring-param-ref";
 *                         leaf vnfd-id-ref {
 *                             type leafref;
 *                         }
 *                         leaf vnfd-monitoring-param-ref {
 *                             type leafref;
 *                         }
 *                         leaf member-vnf-index-ref {
 *                             type string;
 *                         }
 *                     }
 *                     leaf id {
 *                         type string;
 *                     }
 *                     leaf name {
 *                         type string;
 *                     }
 *                     leaf value-type {
 *                         type value-type;
 *                     }
 *                     container numeric-constraints {
 *                         leaf min-value {
 *                             type uint64;
 *                         }
 *                         leaf max-value {
 *                             type uint64;
 *                         }
 *                     }
 *                     container text-constraints {
 *                         leaf min-length {
 *                             type uint8;
 *                         }
 *                         leaf max-length {
 *                             type uint8;
 *                         }
 *                     }
 *                     leaf value-integer {
 *                         type int64;
 *                     }
 *                     leaf value-decimal {
 *                         type decimal64;
 *                     }
 *                     leaf value-string {
 *                         type string;
 *                     }
 *                     leaf aggregation-type {
 *                         type aggregation-type;
 *                     }
 *                     leaf description {
 *                         type string;
 *                     }
 *                     leaf group-tag {
 *                         type string;
 *                     }
 *                     leaf widget-type {
 *                         type widget-type;
 *                     }
 *                     leaf units {
 *                         type string;
 *                     }
 *                     uses monitoring-param-common;
 *                 }
 *                 list service-primitive {
 *                     key "name";
 *                     leaf name {
 *                         type string;
 *                     }
 *                     list parameter {
 *                         key "name";
 *                         leaf name {
 *                             type string;
 *                         }
 *                         leaf data-type {
 *                             type parameter-data-type;
 *                         }
 *                         leaf mandatory {
 *                             type mandatory;
 *                         }
 *                         leaf default-value {
 *                             type string;
 *                         }
 *                         leaf parameter-pool {
 *                             type string;
 *                         }
 *                         leaf read-only {
 *                             type read-only;
 *                         }
 *                         leaf hidden {
 *                             type hidden;
 *                         }
 *                         uses primitive-parameter;
 *                     }
 *                     list vnf-primitive-group {
 *                         key "member-vnf-index-ref";
 *                         leaf member-vnf-index-ref {
 *                             type string;
 *                         }
 *                         leaf vnfd-id-ref {
 *                             type leafref;
 *                         }
 *                         leaf vnfd-name {
 *                             type leafref;
 *                         }
 *                         list primitive {
 *                             key "index";
 *                             leaf index {
 *                                 type uint32;
 *                             }
 *                             leaf name {
 *                                 type string;
 *                             }
 *                         }
 *                     }
 *                     leaf user-defined-script {
 *                         type string;
 *                     }
 *                     list parameter-group {
 *                         key "name";
 *                         leaf name {
 *                             type string;
 *                         }
 *                         list parameter {
 *                             key "name";
 *                             leaf name {
 *                                 type string;
 *                             }
 *                             leaf data-type {
 *                                 type parameter-data-type;
 *                             }
 *                             leaf mandatory {
 *                                 type mandatory;
 *                             }
 *                             leaf default-value {
 *                                 type string;
 *                             }
 *                             leaf parameter-pool {
 *                                 type string;
 *                             }
 *                             leaf read-only {
 *                                 type read-only;
 *                             }
 *                             leaf hidden {
 *                                 type hidden;
 *                             }
 *                             uses primitive-parameter;
 *                         }
 *                         leaf mandatory {
 *                             type mandatory;
 *                         }
 *                     }
 *                     uses ui-primitive-group;
 *                 }
 *                 leaf id {
 *                     type string;
 *                 }
 *                 leaf name {
 *                     type string;
 *                 }
 *                 leaf short-name {
 *                     type string;
 *                 }
 *                 leaf vendor {
 *                     type string;
 *                 }
 *                 leaf logo {
 *                     type string;
 *                 }
 *                 leaf description {
 *                     type string;
 *                 }
 *                 leaf version {
 *                     type string;
 *                 }
 *                 list connection-point {
 *                     key "name";
 *                     leaf name {
 *                         type string;
 *                     }
 *                     leaf type {
 *                         type connection-point-type;
 *                     }
 *                 }
 *                 list scaling-group-descriptor {
 *                     key "name";
 *                     leaf name {
 *                         type string;
 *                     }
 *                     list scaling-policy {
 *                         key "name";
 *                         leaf name {
 *                             type string;
 *                         }
 *                         leaf scaling-type {
 *                             type scaling-policy-type;
 *                         }
 *                         leaf enabled {
 *                             type enabled;
 *                         }
 *                         leaf scale-in-operation-type {
 *                             type scale-in-operation-type;
 *                         }
 *                         leaf scale-out-operation-type {
 *                             type scale-out-operation-type;
 *                         }
 *                         leaf threshold-time {
 *                             type uint32;
 *                         }
 *                         leaf cooldown-time {
 *                             type uint32;
 *                         }
 *                         list scaling-criteria {
 *                             key "name";
 *                             leaf name {
 *                                 type string;
 *                             }
 *                             leaf scale-in-threshold {
 *                                 type uint64;
 *                             }
 *                             leaf scale-out-threshold {
 *                                 type uint64;
 *                             }
 *                             leaf ns-monitoring-param-ref {
 *                                 type string;
 *                             }
 *                         }
 *                     }
 *                     list vnfd-member {
 *                         key "member-vnf-index-ref";
 *                         leaf member-vnf-index-ref {
 *                             type string;
 *                         }
 *                         leaf count {
 *                             type count;
 *                         }
 *                     }
 *                     leaf min-instance-count {
 *                         type min-instance-count;
 *                     }
 *                     leaf max-instance-count {
 *                         type max-instance-count;
 *                     }
 *                     list scaling-config-action {
 *                         key "trigger";
 *                         leaf trigger {
 *                             type scaling-trigger;
 *                         }
 *                         leaf ns-service-primitive-name-ref {
 *                             type string;
 *                         }
 *                     }
 *                 }
 *                 list vnffgd {
 *                     key "id";
 *                     leaf id {
 *                         type string;
 *                     }
 *                     leaf name {
 *                         type string;
 *                     }
 *                     leaf short-name {
 *                         type string;
 *                     }
 *                     leaf vendor {
 *                         type string;
 *                     }
 *                     leaf description {
 *                         type string;
 *                     }
 *                     leaf version {
 *                         type string;
 *                     }
 *                     list rsp {
 *                         key "id";
 *                         leaf id {
 *                             type string;
 *                         }
 *                         leaf name {
 *                             type string;
 *                         }
 *                         list vnfd-connection-point-ref {
 *                             key "member-vnf-index-ref";
 *                             leaf member-vnf-index-ref {
 *                                 type string;
 *                             }
 *                             leaf order {
 *                                 type uint8;
 *                             }
 *                             leaf vnfd-id-ref {
 *                                 type leafref;
 *                             }
 *                             leaf vnfd-connection-point-ref {
 *                                 type string;
 *                             }
 *                         }
 *                     }
 *                     list classifier {
 *                         key "id";
 *                         leaf id {
 *                             type string;
 *                         }
 *                         leaf name {
 *                             type string;
 *                         }
 *                         leaf rsp-id-ref {
 *                             type leafref;
 *                         }
 *                         leaf member-vnf-index-ref {
 *                             type string;
 *                         }
 *                         leaf vnfd-id-ref {
 *                             type leafref;
 *                         }
 *                         leaf vnfd-connection-point-ref {
 *                             type string;
 *                         }
 *                         list match-attributes {
 *                             key "id";
 *                             leaf id {
 *                                 type string;
 *                             }
 *                             leaf ip-proto {
 *                                 type uint8;
 *                             }
 *                             leaf source-ip-address {
 *                                 type ip-address;
 *                             }
 *                             leaf destination-ip-address {
 *                                 type ip-address;
 *                             }
 *                             leaf source-port {
 *                                 type port-number;
 *                             }
 *                             leaf destination-port {
 *                                 type port-number;
 *                             }
 *                         }
 *                     }
 *                 }
 *                 list initial-service-primitive {
 *                     key "seq";
 *                     leaf seq {
 *                         type uint64;
 *                     }
 *                     leaf name {
 *                         type string;
 *                     }
 *                     leaf user-defined-script {
 *                         type string;
 *                     }
 *                     list parameter {
 *                         key "name";
 *                         leaf name {
 *                             type string;
 *                         }
 *                         leaf value {
 *                             type string;
 *                         }
 *                     }
 *                     uses event-config;
 *                 }
 *                 list terminate-service-primitive {
 *                     key "seq";
 *                     leaf seq {
 *                         type uint64;
 *                     }
 *                     leaf name {
 *                         type string;
 *                     }
 *                     leaf user-defined-script {
 *                         type string;
 *                     }
 *                     list parameter {
 *                         key "name";
 *                         leaf name {
 *                             type string;
 *                         }
 *                         leaf value {
 *                             type string;
 *                         }
 *                     }
 *                     uses event-config;
 *                 }
 *                 list parameter-pool {
 *                     key "name";
 *                     leaf name {
 *                         type string;
 *                     }
 *                     container range {
 *                         leaf start-value {
 *                             type uint32;
 *                         }
 *                         leaf end-value {
 *                             type uint32;
 *                         }
 *                     }
 *                 }
 *                 list key-pair {
 *                     key "name";
 *                     leaf name {
 *                         type string;
 *                     }
 *                     leaf akey {
 *                         type string;
 *                     }
 *                 }
 *                 list user {
 *                     key "name";
 *                     leaf name {
 *                         type string;
 *                     }
 *                     leaf user-info {
 *                         type string;
 *                     }
 *                     list key-pair {
 *                         key "name";
 *                         leaf name {
 *                             type string;
 *                         }
 *                         leaf akey {
 *                             type string;
 *                         }
 *                     }
 *                 }
 *                 list input-parameter-xpath {
 *                     key "xpath";
 *                     leaf xpath {
 *                         type string;
 *                     }
 *                     leaf label {
 *                         type string;
 *                     }
 *                     leaf default-value {
 *                         type string;
 *                     }
 *                 }
 *                 list ip-profiles {
 *                     key "name";
 *                     leaf name {
 *                         type string;
 *                     }
 *                     leaf description {
 *                         type string;
 *                     }
 *                     container ip-profile-params {
 *                         leaf ip-version {
 *                             type ip-version;
 *                         }
 *                         leaf subnet-address {
 *                             type ip-prefix;
 *                         }
 *                         leaf gateway-address {
 *                             type ip-address;
 *                         }
 *                         leaf security-group {
 *                             type string;
 *                         }
 *                         list dns-server {
 *                             key "address";
 *                             leaf address {
 *                                 type ip-address;
 *                             }
 *                         }
 *                         container dhcp-params {
 *                             leaf enabled {
 *                                 type enabled;
 *                             }
 *                             leaf start-address {
 *                                 type ip-address;
 *                             }
 *                             leaf count {
 *                                 type uint32;
 *                             }
 *                         }
 *                         leaf subnet-prefix-pool {
 *                             type string;
 *                         }
 *                     }
 *                     uses ip-profile-info;
 *                 }
 *                 uses nsd-descriptor;
 *             }
 *         }
 *         augment \(http://riftio.com/ns/riftware-1.0/rw-project)project {
 *             when "Optional.empty";
 *             status CURRENT;
 *             list key-pair {
 *                 key "name";
 *                 leaf name {
 *                     type string;
 *                 }
 *                 leaf akey {
 *                     type string;
 *                 }
 *             }
 *         }
 *         augment \(http://riftio.com/ns/riftware-1.0/rw-project)project {
 *             when "Optional.empty";
 *             status CURRENT;
 *             container vnffgd-catalog {
 *                 list vnffgd {
 *                     key "id";
 *                     leaf name {
 *                         type string;
 *                     }
 *                     leaf id {
 *                         type uuid;
 *                     }
 *                     leaf provider {
 *                         type string;
 *                     }
 *                     leaf description {
 *                         type string;
 *                     }
 *                     leaf version {
 *                         type string;
 *                     }
 *                 }
 *             }
 *         }
 *         augment \(http://riftio.com/ns/riftware-1.0/rw-project)project {
 *             when "Optional.empty";
 *             status CURRENT;
 *             container ns-instance-opdata {
 *                 list nsr {
 *                     key "ns-instance-config-ref";
 *                     leaf ns-instance-config-ref {
 *                         type leafref;
 *                     }
 *                     leaf name-ref {
 *                         type leafref;
 *                     }
 *                     leaf nsd-ref {
 *                         type leafref;
 *                     }
 *                     leaf nsd-name-ref {
 *                         type leafref;
 *                     }
 *                     leaf create-time {
 *                         type uint32;
 *                     }
 *                     leaf uptime {
 *                         type uint32;
 *                     }
 *                     list connection-point {
 *                         key "name";
 *                         leaf name {
 *                             type string;
 *                         }
 *                         leaf type {
 *                             type connection-point-type;
 *                         }
 *                     }
 *                     list vlr {
 *                         key "vlr-ref";
 *                         leaf vlr-ref {
 *                             type leafref;
 *                         }
 *                         list vnfr-connection-point-ref {
 *                             key "vnfr-id";
 *                             leaf vnfr-id {
 *                                 type string;
 *                             }
 *                             leaf connection-point {
 *                                 type leafref;
 *                             }
 *                         }
 *                     }
 *                     list constituent-vnfr-ref {
 *                         key "vnfr-id";
 *                         leaf vnfr-id {
 *                             type string;
 *                         }
 *                     }
 *                     list scaling-group-record {
 *                         key "scaling-group-name-ref";
 *                         leaf scaling-group-name-ref {
 *                             type leafref;
 *                         }
 *                         list instance {
 *                             key "instance-id";
 *                             leaf instance-id {
 *                                 type uint16;
 *                             }
 *                             leaf is-default {
 *                                 type boolean;
 *                             }
 *                             leaf op-status {
 *                                 type enumeration;
 *                             }
 *                             leaf config-status {
 *                                 type config-states;
 *                             }
 *                             leaf error-msg {
 *                                 type string;
 *                             }
 *                             leaf create-time {
 *                                 type uint32;
 *                             }
 *                             leaf-list vnfrs {
 *                                 type leafref;
 *                             }
 *                         }
 *                     }
 *                     list vnffgr {
 *                         key "id";
 *                         leaf id {
 *                             type uuid;
 *                         }
 *                         leaf vnffgd-id-ref {
 *                             type leafref;
 *                         }
 *                         leaf vnffgd-name-ref {
 *                             type leafref;
 *                         }
 *                         leaf sdn-account {
 *                             type string;
 *                         }
 *                         leaf cloud-account {
 *                             type string;
 *                         }
 *                         leaf operational-status {
 *                             type vnffgr-operational-status;
 *                         }
 *                         list rsp {
 *                             key "id";
 *                             leaf id {
 *                                 type uuid;
 *                             }
 *                             leaf name {
 *                                 type string;
 *                             }
 *                             leaf rsp-id {
 *                                 type uuid;
 *                             }
 *                             leaf vnffgd-rsp-id-ref {
 *                                 type leafref;
 *                             }
 *                             leaf vnffgd-rsp-name-ref {
 *                                 type leafref;
 *                             }
 *                             leaf classifier-name {
 *                                 type string;
 *                             }
 *                             leaf path-id {
 *                                 type uint32;
 *                             }
 *                             list vnfr-connection-point-ref {
 *                                 key "hop-number";
 *                                 leaf hop-number {
 *                                     type uint8;
 *                                 }
 *                                 leaf service-function-type {
 *                                     type string;
 *                                 }
 *                                 leaf member-vnf-index-ref {
 *                                     type uint64;
 *                                 }
 *                                 leaf vnfd-id-ref {
 *                                     type string;
 *                                 }
 *                                 leaf vnfr-id-ref {
 *                                     type string;
 *                                 }
 *                                 leaf vnfr-name-ref {
 *                                     type string;
 *                                 }
 *                                 leaf vnfr-connection-point-ref {
 *                                     type leafref;
 *                                 }
 *                                 leaf service-index {
 *                                     type uint8;
 *                                 }
 *                                 container connection-point-params {
 *                                     leaf mgmt-address {
 *                                         type ip-address;
 *                                     }
 *                                     leaf name {
 *                                         type string;
 *                                     }
 *                                     leaf port-id {
 *                                         type string;
 *                                     }
 *                                     leaf vm-id {
 *                                         type string;
 *                                     }
 *                                     leaf address {
 *                                         type ip-address;
 *                                     }
 *                                     leaf port {
 *                                         type port-number;
 *                                     }
 *                                 }
 *                                 container service-function-forwarder {
 *                                     leaf name {
 *                                         type string;
 *                                     }
 *                                     leaf ip-address {
 *                                         type ip-address;
 *                                     }
 *                                     leaf port {
 *                                         type port-number;
 *                                     }
 *                                 }
 *                             }
 *                         }
 *                         list classifier {
 *                             key "id";
 *                             leaf id {
 *                                 type uuid;
 *                             }
 *                             leaf name {
 *                                 type string;
 *                             }
 *                             leaf-list classifier-id {
 *                                 type uuid;
 *                             }
 *                             leaf rsp-id-ref {
 *                                 type leafref;
 *                             }
 *                             leaf rsp-name {
 *                                 type string;
 *                             }
 *                             leaf vnfr-id-ref {
 *                                 type string;
 *                             }
 *                             leaf vnfr-name-ref {
 *                                 type string;
 *                             }
 *                             leaf vnfr-connection-point-ref {
 *                                 type leafref;
 *                             }
 *                             leaf port-id {
 *                                 type string;
 *                             }
 *                             leaf vm-id {
 *                                 type string;
 *                             }
 *                             leaf ip-address {
 *                                 type string;
 *                             }
 *                             leaf sff-name {
 *                                 type string;
 *                             }
 *                         }
 *                     }
 *                     leaf operational-status {
 *                         type ns-operational-status;
 *                     }
 *                     leaf config-status {
 *                         type config-states;
 *                     }
 *                     list service-primitive {
 *                         key "name";
 *                         leaf name {
 *                             type string;
 *                         }
 *                         list parameter {
 *                             key "name";
 *                             leaf name {
 *                                 type string;
 *                             }
 *                             leaf data-type {
 *                                 type parameter-data-type;
 *                             }
 *                             leaf mandatory {
 *                                 type mandatory;
 *                             }
 *                             leaf default-value {
 *                                 type string;
 *                             }
 *                             leaf parameter-pool {
 *                                 type string;
 *                             }
 *                             leaf read-only {
 *                                 type read-only;
 *                             }
 *                             leaf hidden {
 *                                 type hidden;
 *                             }
 *                             uses primitive-parameter;
 *                         }
 *                         list parameter-group {
 *                             key "name";
 *                             leaf name {
 *                                 type string;
 *                             }
 *                             list parameter {
 *                                 key "name";
 *                                 leaf name {
 *                                     type string;
 *                                 }
 *                                 leaf data-type {
 *                                     type parameter-data-type;
 *                                 }
 *                                 leaf mandatory {
 *                                     type mandatory;
 *                                 }
 *                                 leaf default-value {
 *                                     type string;
 *                                 }
 *                                 leaf parameter-pool {
 *                                     type string;
 *                                 }
 *                                 leaf read-only {
 *                                     type read-only;
 *                                 }
 *                                 leaf hidden {
 *                                     type hidden;
 *                                 }
 *                                 uses primitive-parameter;
 *                             }
 *                             leaf mandatory {
 *                                 type mandatory;
 *                             }
 *                         }
 *                         list vnf-primitive-group {
 *                             key "member-vnf-index-ref";
 *                             leaf member-vnf-index-ref {
 *                                 type uint64;
 *                             }
 *                             leaf vnfd-id-ref {
 *                                 type string;
 *                             }
 *                             leaf vnfd-name {
 *                                 type string;
 *                             }
 *                             list primitive {
 *                                 key "index";
 *                                 leaf index {
 *                                     type uint32;
 *                                 }
 *                                 leaf name {
 *                                     type string;
 *                                 }
 *                             }
 *                         }
 *                         leaf user-defined-script {
 *                             type string;
 *                         }
 *                         uses ui-primitive-group;
 *                     }
 *                     list initial-service-primitive {
 *                         key "seq";
 *                         leaf seq {
 *                             type uint64;
 *                         }
 *                         leaf name {
 *                             type string;
 *                         }
 *                         leaf user-defined-script {
 *                             type string;
 *                         }
 *                         list parameter {
 *                             key "name";
 *                             leaf name {
 *                                 type string;
 *                             }
 *                             leaf value {
 *                                 type string;
 *                             }
 *                         }
 *                         uses event-service-primitive;
 *                     }
 *                     list terminate-service-primitive {
 *                         key "seq";
 *                         leaf seq {
 *                             type uint64;
 *                         }
 *                         leaf name {
 *                             type string;
 *                         }
 *                         leaf user-defined-script {
 *                             type string;
 *                         }
 *                         list parameter {
 *                             key "name";
 *                             leaf name {
 *                                 type string;
 *                             }
 *                             leaf value {
 *                                 type string;
 *                             }
 *                         }
 *                         uses event-service-primitive;
 *                     }
 *                     list monitoring-param {
 *                         key "id";
 *                         leaf value-type {
 *                             type value-type;
 *                         }
 *                         container numeric-constraints {
 *                             leaf min-value {
 *                                 type uint64;
 *                             }
 *                             leaf max-value {
 *                                 type uint64;
 *                             }
 *                         }
 *                         container text-constraints {
 *                             leaf min-length {
 *                                 type uint8;
 *                             }
 *                             leaf max-length {
 *                                 type uint8;
 *                             }
 *                         }
 *                         leaf value-integer {
 *                             type int64;
 *                         }
 *                         leaf value-decimal {
 *                             type decimal64;
 *                         }
 *                         leaf value-string {
 *                             type string;
 *                         }
 *                         leaf description {
 *                             type string;
 *                         }
 *                         leaf group-tag {
 *                             type string;
 *                         }
 *                         leaf widget-type {
 *                             type widget-type;
 *                         }
 *                         leaf units {
 *                             type string;
 *                         }
 *                         leaf aggregation-type {
 *                             type aggregation-type;
 *                         }
 *                         leaf id {
 *                             type string;
 *                         }
 *                         leaf name {
 *                             type string;
 *                         }
 *                         leaf nsd-mon-param-ref {
 *                             type leafref;
 *                         }
 *                         list vnfr-mon-param-ref {
 *                             key "vnfr-id-ref" "vnfr-mon-param-ref";
 *                             leaf vnfr-id-ref {
 *                                 type uuid;
 *                             }
 *                             leaf vnfr-mon-param-ref {
 *                                 type leafref;
 *                             }
 *                         }
 *                         uses monitoring-param-ui-data;
 *                         uses monitoring-param-aggregation;
 *                         uses monitoring-param-value;
 *                     }
 *                     list config-agent-job {
 *                         key "job-id";
 *                         leaf job-id {
 *                             type uint64;
 *                         }
 *                         leaf job-name {
 *                             type string;
 *                         }
 *                         leaf job-status {
 *                             type enumeration;
 *                         }
 *                         leaf triggered-by {
 *                             type trigger-type;
 *                         }
 *                         leaf create-time {
 *                             type uint32;
 *                         }
 *                         leaf job-status-details {
 *                             type string;
 *                         }
 *                         list parameter {
 *                             key "name";
 *                             leaf name {
 *                                 type string;
 *                             }
 *                             leaf value {
 *                                 type string;
 *                             }
 *                         }
 *                         list parameter-group {
 *                             key "name";
 *                             leaf name {
 *                                 type string;
 *                             }
 *                             list parameter {
 *                                 key "name";
 *                                 leaf name {
 *                                     type string;
 *                                 }
 *                                 leaf value {
 *                                     type string;
 *                                 }
 *                             }
 *                             uses primitive-parameter-value;
 *                         }
 *                         list vnfr {
 *                             key "id";
 *                             leaf id {
 *                                 type uuid;
 *                             }
 *                             leaf vnf-job-status {
 *                                 type enumeration;
 *                             }
 *                             list primitive {
 *                                 key "name";
 *                                 leaf name {
 *                                     type string;
 *                                 }
 *                                 list parameter {
 *                                     key "name";
 *                                     leaf name {
 *                                         type string;
 *                                     }
 *                                     leaf value {
 *                                         type string;
 *                                     }
 *                                 }
 *                                 leaf execution-id {
 *                                     type string;
 *                                 }
 *                                 leaf execution-status {
 *                                     type enumeration;
 *                                 }
 *                                 leaf execution-error-details {
 *                                     type string;
 *                                 }
 *                                 uses primitive-parameter-value;
 *                             }
 *                         }
 *                         uses primitive-parameter-value;
 *                     }
 *                     uses vnffgr;
 *                 }
 *             }
 *         }
 *         augment \(http://riftio.com/ns/riftware-1.0/rw-project)project {
 *             when "Optional.empty";
 *             status CURRENT;
 *             container vlr-catalog {
 *                 leaf schema-version {
 *                     type schema-version;
 *                 }
 *                 list vlr {
 *                     key "id";
 *                     leaf id {
 *                         type uuid;
 *                     }
 *                     leaf name {
 *                         type string;
 *                     }
 *                     leaf nsr-id-ref {
 *                         type uuid;
 *                     }
 *                     leaf vld-ref {
 *                         type string;
 *                     }
 *                     leaf res-id {
 *                         type uuid;
 *                     }
 *                     leaf short-name {
 *                         type string;
 *                     }
 *                     leaf vendor {
 *                         type string;
 *                     }
 *                     leaf description {
 *                         type string;
 *                     }
 *                     leaf version {
 *                         type string;
 *                     }
 *                     leaf type {
 *                         type virtual-link-type;
 *                     }
 *                     leaf root-bandwidth {
 *                         type uint64;
 *                     }
 *                     leaf leaf-bandwidth {
 *                         type uint64;
 *                     }
 *                     leaf create-time {
 *                         type uint32;
 *                     }
 *                     leaf uptime {
 *                         type uint32;
 *                     }
 *                     leaf network-id {
 *                         type string;
 *                     }
 *                     leaf vim-network-name {
 *                         type string;
 *                     }
 *                     container provider-network {
 *                         leaf physical-network {
 *                             type string;
 *                         }
 *                         leaf segmentation_id {
 *                             type uint32;
 *                         }
 *                     }
 *                     container ip-profile-params {
 *                         leaf ip-version {
 *                             type ip-version;
 *                         }
 *                         leaf subnet-address {
 *                             type ip-prefix;
 *                         }
 *                         leaf gateway-address {
 *                             type ip-address;
 *                         }
 *                         leaf security-group {
 *                             type string;
 *                         }
 *                         list dns-server {
 *                             key "address";
 *                             leaf address {
 *                                 type ip-address;
 *                             }
 *                         }
 *                         container dhcp-params {
 *                             leaf enabled {
 *                                 type enabled;
 *                             }
 *                             leaf start-address {
 *                                 type ip-address;
 *                             }
 *                             leaf count {
 *                                 type uint32;
 *                             }
 *                         }
 *                         leaf subnet-prefix-pool {
 *                             type string;
 *                         }
 *                     }
 *                     leaf status {
 *                         type enumeration;
 *                     }
 *                     leaf operational-status {
 *                         type enumeration;
 *                     }
 *                     uses ip-profile-info;
 *                     uses provider-network;
 *                 }
 *             }
 *         }
 *         augment \(http://riftio.com/ns/riftware-1.0/rw-project)project {
 *             when "Optional.empty";
 *             status CURRENT;
 *             container vnfd-catalog {
 *                 list vnfd {
 *                     key "id";
 *                     leaf id {
 *                         type string;
 *                     }
 *                     leaf name {
 *                         type string;
 *                     }
 *                     leaf short-name {
 *                         type string;
 *                     }
 *                     leaf vendor {
 *                         type string;
 *                     }
 *                     leaf logo {
 *                         type string;
 *                     }
 *                     leaf description {
 *                         type string;
 *                     }
 *                     leaf version {
 *                         type string;
 *                     }
 *                     container vnf-configuration {
 *                         choice config-method {
 *                             case juju {
 *                                 container juju {
 *                                     leaf charm {
 *                                         type string;
 *                                     }
 *                                     leaf proxy {
 *                                         type proxy;
 *                                     }
 *                                     container vca-relationships {
 *                                         list relation {
 *                                             key "requires" "provides";
 *                                             leaf requires {
 *                                                 type string;
 *                                             }
 *                                             leaf provides {
 *                                                 type string;
 *                                             }
 *                                         }
 *                                     }
 *                                     uses vca-relationships;
 *                                 }
 *                             }
 *                             case script {
 *                                 container script {
 *                                     leaf script-type {
 *                                         type enumeration;
 *                                     }
 *                                 }
 *                             }
 *                         }
 *                         list config-primitive {
 *                             key "name";
 *                             leaf name {
 *                                 type string;
 *                             }
 *                             list parameter {
 *                                 key "name";
 *                                 leaf name {
 *                                     type string;
 *                                 }
 *                                 leaf data-type {
 *                                     type parameter-data-type;
 *                                 }
 *                                 leaf mandatory {
 *                                     type mandatory;
 *                                 }
 *                                 leaf default-value {
 *                                     type string;
 *                                 }
 *                                 leaf parameter-pool {
 *                                     type string;
 *                                 }
 *                                 leaf read-only {
 *                                     type read-only;
 *                                 }
 *                                 leaf hidden {
 *                                     type hidden;
 *                                 }
 *                                 uses primitive-parameter;
 *                             }
 *                             leaf user-defined-script {
 *                                 type string;
 *                             }
 *                         }
 *                         list initial-config-primitive {
 *                             key "seq";
 *                             leaf seq {
 *                                 type uint64;
 *                             }
 *                             choice primitive-type {
 *                                 case primitive-definition {
 *                                     leaf name {
 *                                         type string;
 *                                     }
 *                                     leaf user-defined-script {
 *                                         type string;
 *                                     }
 *                                     list parameter {
 *                                         key "name";
 *                                         leaf name {
 *                                             type string;
 *                                         }
 *                                         leaf value {
 *                                             type string;
 *                                         }
 *                                     }
 *                                 }
 *                             }
 *                         }
 *                         uses vca-configuration;
 *                     }
 *                     leaf operational-status {
 *                         type vnf-operational-status;
 *                     }
 *                     container mgmt-interface {
 *                         choice endpoint-type {
 *                             case cp {
 *                                 leaf cp {
 *                                     type string;
 *                                 }
 *                             }
 *                             case ip {
 *                                 leaf ip-address {
 *                                     type ip-address;
 *                                 }
 *                             }
 *                             case vdu-id {
 *                                 leaf vdu-id {
 *                                     type string;
 *                                 }
 *                             }
 *                         }
 *                         leaf port {
 *                             type port-number;
 *                         }
 *                         container dashboard-params {
 *                             leaf path {
 *                                 type string;
 *                             }
 *                             leaf https {
 *                                 type boolean;
 *                             }
 *                             leaf port {
 *                                 type port-number;
 *                             }
 *                         }
 *                     }
 *                     list internal-vld {
 *                         key "id";
 *                         leaf id {
 *                             type string;
 *                         }
 *                         leaf name {
 *                             type string;
 *                         }
 *                         leaf short-name {
 *                             type string;
 *                         }
 *                         leaf description {
 *                             type string;
 *                         }
 *                         leaf type {
 *                             type virtual-link-type;
 *                         }
 *                         leaf root-bandwidth {
 *                             type uint64;
 *                         }
 *                         leaf leaf-bandwidth {
 *                             type uint64;
 *                         }
 *                         list internal-connection-point {
 *                             key "id-ref";
 *                             leaf id-ref {
 *                                 type string;
 *                             }
 *                             leaf ip-address {
 *                                 type ip-address;
 *                             }
 *                         }
 *                         choice init-params {
 *                             case vim-network-profile {
 *                                 leaf ip-profile-ref {
 *                                     type string;
 *                                 }
 *                             }
 *                             case vim-network-ref {
 *                                 leaf vim-network-name {
 *                                     type string;
 *                                 }
 *                             }
 *                         }
 *                         container provider-network {
 *                             leaf physical-network {
 *                                 type string;
 *                             }
 *                             leaf segmentation_id {
 *                                 type uint32;
 *                             }
 *                         }
 *                         uses provider-network;
 *                     }
 *                     list connection-point {
 *                         key "name";
 *                         leaf name {
 *                             type string;
 *                         }
 *                         leaf id {
 *                             type string;
 *                         }
 *                         leaf short-name {
 *                             type string;
 *                         }
 *                         leaf type {
 *                             type connection-point-type;
 *                         }
 *                         leaf port-security-enabled {
 *                             type boolean;
 *                         }
 *                         uses common-connection-point;
 *                     }
 *                     list vdu {
 *                         key "id";
 *                         leaf id {
 *                             type string;
 *                         }
 *                         leaf name {
 *                             type string;
 *                         }
 *                         leaf description {
 *                             type string;
 *                         }
 *                         leaf count {
 *                             type uint64;
 *                         }
 *                         leaf mgmt-vpci {
 *                             type string;
 *                         }
 *                         list alarm {
 *                             key "alarm-id";
 *                             leaf alarm-id {
 *                                 type string;
 *                             }
 *                             leaf name {
 *                                 type string;
 *                             }
 *                             leaf description {
 *                                 type string;
 *                             }
 *                             leaf vdur-id {
 *                                 type string;
 *                             }
 *                             container actions {
 *                                 list ok {
 *                                     key "url";
 *                                     leaf url {
 *                                         type string;
 *                                     }
 *                                 }
 *                                 list insufficient-data {
 *                                     key "url";
 *                                     leaf url {
 *                                         type string;
 *                                     }
 *                                 }
 *                                 list alarm {
 *                                     key "url";
 *                                     leaf url {
 *                                         type string;
 *                                     }
 *                                 }
 *                             }
 *                             leaf repeat {
 *                                 type repeat;
 *                             }
 *                             leaf enabled {
 *                                 type enabled;
 *                             }
 *                             leaf severity {
 *                                 type alarm-severity-type;
 *                             }
 *                             leaf metric {
 *                                 type alarm-metric-type;
 *                             }
 *                             leaf statistic {
 *                                 type alarm-statistic-type;
 *                             }
 *                             leaf operation {
 *                                 type alarm-operation-type;
 *                             }
 *                             leaf value {
 *                                 type decimal64;
 *                             }
 *                             leaf period {
 *                                 type uint32;
 *                             }
 *                             leaf evaluations {
 *                                 type uint32;
 *                             }
 *                             uses alarm;
 *                         }
 *                         list alternative-images {
 *                             key "vim-type";
 *                             leaf vim-type {
 *                                 type string;
 *                             }
 *                             leaf image {
 *                                 type string;
 *                             }
 *                             leaf image-checksum {
 *                                 type string;
 *                             }
 *                             uses image-properties;
 *                         }
 *                         container vdu-configuration {
 *                             choice config-method {
 *                                 case juju {
 *                                     container juju {
 *                                         leaf charm {
 *                                             type string;
 *                                         }
 *                                         leaf proxy {
 *                                             type proxy;
 *                                         }
 *                                         container vca-relationships {
 *                                             list relation {
 *                                                 key "requires" "provides";
 *                                                 leaf requires {
 *                                                     type string;
 *                                                 }
 *                                                 leaf provides {
 *                                                     type string;
 *                                                 }
 *                                             }
 *                                         }
 *                                         uses vca-relationships;
 *                                     }
 *                                 }
 *                                 case script {
 *                                     container script {
 *                                         leaf script-type {
 *                                             type enumeration;
 *                                         }
 *                                     }
 *                                 }
 *                             }
 *                             list config-primitive {
 *                                 key "name";
 *                                 leaf name {
 *                                     type string;
 *                                 }
 *                                 list parameter {
 *                                     key "name";
 *                                     leaf name {
 *                                         type string;
 *                                     }
 *                                     leaf data-type {
 *                                         type parameter-data-type;
 *                                     }
 *                                     leaf mandatory {
 *                                         type mandatory;
 *                                     }
 *                                     leaf default-value {
 *                                         type string;
 *                                     }
 *                                     leaf parameter-pool {
 *                                         type string;
 *                                     }
 *                                     leaf read-only {
 *                                         type read-only;
 *                                     }
 *                                     leaf hidden {
 *                                         type hidden;
 *                                     }
 *                                     uses primitive-parameter;
 *                                 }
 *                                 leaf user-defined-script {
 *                                     type string;
 *                                 }
 *                             }
 *                             list initial-config-primitive {
 *                                 key "seq";
 *                                 leaf seq {
 *                                     type uint64;
 *                                 }
 *                                 choice primitive-type {
 *                                     case primitive-definition {
 *                                         leaf name {
 *                                             type string;
 *                                         }
 *                                         leaf user-defined-script {
 *                                             type string;
 *                                         }
 *                                         list parameter {
 *                                             key "name";
 *                                             leaf name {
 *                                                 type string;
 *                                             }
 *                                             leaf value {
 *                                                 type string;
 *                                             }
 *                                         }
 *                                     }
 *                                 }
 *                             }
 *                             uses vca-configuration;
 *                         }
 *                         choice cloud-init-input {
 *                             case filename {
 *                                 leaf cloud-init-file {
 *                                     type string;
 *                                 }
 *                             }
 *                             case inline {
 *                                 leaf cloud-init {
 *                                     type string;
 *                                 }
 *                             }
 *                         }
 *                         list internal-connection-point {
 *                             key "id";
 *                             leaf internal-vld-ref {
 *                                 type leafref;
 *                             }
 *                             leaf name {
 *                                 type string;
 *                             }
 *                             leaf id {
 *                                 type string;
 *                             }
 *                             leaf short-name {
 *                                 type string;
 *                             }
 *                             leaf type {
 *                                 type connection-point-type;
 *                             }
 *                             leaf port-security-enabled {
 *                                 type boolean;
 *                             }
 *                             uses common-connection-point;
 *                         }
 *                         list interface {
 *                             key "name";
 *                             leaf name {
 *                                 type string;
 *                             }
 *                             leaf position {
 *                                 type uint32;
 *                             }
 *                             leaf type {
 *                                 type type;
 *                             }
 *                             leaf mac-address {
 *                                 type string;
 *                             }
 *                             choice connection-point-type {
 *                                 case external {
 *                                     leaf external-connection-point-ref {
 *                                         type string;
 *                                     }
 *                                 }
 *                                 case internal {
 *                                     leaf internal-connection-point-ref {
 *                                         type string;
 *                                     }
 *                                 }
 *                             }
 *                             container virtual-interface {
 *                                 leaf type {
 *                                     type type;
 *                                 }
 *                                 leaf vpci {
 *                                     type string;
 *                                 }
 *                                 leaf bandwidth {
 *                                     type uint64;
 *                                 }
 *                             }
 *                             uses virtual-interface;
 *                         }
 *                         list volumes {
 *                             key "name";
 *                             leaf name {
 *                                 type string;
 *                             }
 *                             leaf description {
 *                                 type string;
 *                             }
 *                             leaf size {
 *                                 type uint64;
 *                             }
 *                             choice volume-source {
 *                                 case ephemeral {
 *                                     leaf ephemeral {
 *                                         type empty;
 *                                     }
 *                                 }
 *                                 case image {
 *                                     leaf image {
 *                                         type string;
 *                                     }
 *                                     leaf image-checksum {
 *                                         type string;
 *                                     }
 *                                 }
 *                             }
 *                             leaf device-bus {
 *                                 type enumeration;
 *                             }
 *                             leaf device-type {
 *                                 type enumeration;
 *                             }
 *                             uses volume-info;
 *                         }
 *                         container vm-flavor {
 *                             leaf vcpu-count {
 *                                 type uint16;
 *                             }
 *                             leaf memory-mb {
 *                                 type uint64;
 *                             }
 *                             leaf storage-gb {
 *                                 type uint64;
 *                             }
 *                         }
 *                         container guest-epa {
 *                             leaf trusted-execution {
 *                                 type boolean;
 *                             }
 *                             leaf mempage-size {
 *                                 type enumeration;
 *                             }
 *                             leaf cpu-pinning-policy {
 *                                 type cpu-pinning-policy;
 *                             }
 *                             leaf cpu-thread-pinning-policy {
 *                                 type enumeration;
 *                             }
 *                             list pcie-device {
 *                                 key "device-id";
 *                                 leaf device-id {
 *                                     type string;
 *                                 }
 *                                 leaf count {
 *                                     type uint64;
 *                                 }
 *                             }
 *                             choice numa-policy {
 *                                 case numa-aware {
 *                                     container numa-node-policy {
 *                                         leaf node-cnt {
 *                                             type uint16;
 *                                         }
 *                                         leaf mem-policy {
 *                                             type enumeration;
 *                                         }
 *                                         list node {
 *                                             key "id";
 *                                             leaf id {
 *                                                 type uint64;
 *                                             }
 *                                             list vcpu {
 *                                                 key "id";
 *                                                 leaf id {
 *                                                     type uint64;
 *                                                 }
 *                                             }
 *                                             leaf memory-mb {
 *                                                 type uint64;
 *                                             }
 *                                             choice om-numa-type {
 *                                                 case cores {
 *                                                     leaf num-cores {
 *                                                         type uint8;
 *                                                     }
 *                                                 }
 *                                                 case paired-threads {
 *                                                     container paired-threads {
 *                                                         leaf num-paired-threads {
 *                                                             type uint8;
 *                                                         }
 *                                                         list paired-thread-ids {
 *                                                             key "thread-a";
 *                                                             leaf thread-a {
 *                                                                 type uint8;
 *                                                             }
 *                                                             leaf thread-b {
 *                                                                 type uint8;
 *                                                             }
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 case threads {
 *                                                     leaf num-threads {
 *                                                         type uint8;
 *                                                     }
 *                                                 }
 *                                             }
 *                                         }
 *                                     }
 *                                 }
 *                                 case numa-unaware {
 *                                     leaf numa-unaware {
 *                                         type empty;
 *                                     }
 *                                 }
 *                             }
 *                         }
 *                         container hypervisor-epa {
 *                             leaf type {
 *                                 type enumeration;
 *                             }
 *                             leaf version {
 *                                 type string;
 *                             }
 *                         }
 *                         leaf image {
 *                             type string;
 *                         }
 *                         leaf image-checksum {
 *                             type string;
 *                         }
 *                         container vswitch-epa {
 *                             leaf ovs-acceleration {
 *                                 type enumeration;
 *                             }
 *                             leaf ovs-offload {
 *                                 type enumeration;
 *                             }
 *                         }
 *                         container host-epa {
 *                             leaf cpu-model {
 *                                 type enumeration;
 *                             }
 *                             leaf cpu-arch {
 *                                 type enumeration;
 *                             }
 *                             leaf cpu-vendor {
 *                                 type enumeration;
 *                             }
 *                             leaf cpu-socket-count {
 *                                 type uint64;
 *                             }
 *                             leaf cpu-core-count {
 *                                 type uint64;
 *                             }
 *                             leaf cpu-core-thread-count {
 *                                 type uint64;
 *                             }
 *                             list cpu-feature {
 *                                 key "feature";
 *                                 leaf feature {
 *                                     type cpu-feature-type;
 *                                 }
 *                             }
 *                             leaf om-cpu-model-string {
 *                                 type string;
 *                             }
 *                             list om-cpu-feature {
 *                                 key "feature";
 *                                 leaf feature {
 *                                     type string;
 *                                 }
 *                             }
 *                         }
 *                         container supplemental-boot-data {
 *                             leaf boot-data-drive {
 *                                 type boot-data-drive;
 *                             }
 *                             list config-file {
 *                                 key "source";
 *                                 leaf source {
 *                                     type string;
 *                                 }
 *                                 leaf dest {
 *                                     type string;
 *                                 }
 *                             }
 *                             uses config-file;
 *                         }
 *                         uses guest-epa;
 *                         uses supplemental-boot-data;
 *                         uses host-epa;
 *                         uses vm-flavor;
 *                         uses image-properties;
 *                         uses vswitch-epa;
 *                         uses hypervisor-epa;
 *                     }
 *                     list vdu-dependency {
 *                         key "vdu-source-ref";
 *                         leaf vdu-source-ref {
 *                             type string;
 *                         }
 *                         leaf vdu-depends-on-ref {
 *                             type string;
 *                         }
 *                     }
 *                     leaf service-function-chain {
 *                         type service-function-chain;
 *                     }
 *                     leaf service-function-type {
 *                         type string;
 *                     }
 *                     list placement-groups {
 *                         key "name";
 *                         list member-vdus {
 *                             key "member-vdu-ref";
 *                             leaf member-vdu-ref {
 *                                 type string;
 *                             }
 *                         }
 *                         leaf name {
 *                             type string;
 *                         }
 *                         leaf requirement {
 *                             type string;
 *                         }
 *                         leaf strategy {
 *                             type strategy;
 *                         }
 *                         uses placement-group-info;
 *                     }
 *                     list http-endpoint {
 *                         key "path";
 *                         leaf path {
 *                             type string;
 *                         }
 *                         leaf https {
 *                             type https;
 *                         }
 *                         leaf port {
 *                             type port-number;
 *                         }
 *                         leaf username {
 *                             type string;
 *                         }
 *                         leaf password {
 *                             type string;
 *                         }
 *                         leaf polling-interval-secs {
 *                             type polling-interval-secs;
 *                         }
 *                         leaf method {
 *                             type method;
 *                         }
 *                         list headers {
 *                             key "akey";
 *                             leaf akey {
 *                                 type string;
 *                             }
 *                             leaf value {
 *                                 type string;
 *                             }
 *                         }
 *                     }
 *                     list monitoring-param {
 *                         key "id";
 *                         leaf id {
 *                             type string;
 *                         }
 *                         leaf name {
 *                             type string;
 *                         }
 *                         leaf http-endpoint-ref {
 *                             type leafref;
 *                         }
 *                         leaf json-query-method {
 *                             type json-query-method;
 *                         }
 *                         container json-query-params {
 *                             leaf json-path {
 *                                 type string;
 *                             }
 *                             leaf object-path {
 *                                 type string;
 *                             }
 *                         }
 *                         leaf value-type {
 *                             type value-type;
 *                         }
 *                         container numeric-constraints {
 *                             leaf min-value {
 *                                 type uint64;
 *                             }
 *                             leaf max-value {
 *                                 type uint64;
 *                             }
 *                         }
 *                         container text-constraints {
 *                             leaf min-length {
 *                                 type uint8;
 *                             }
 *                             leaf max-length {
 *                                 type uint8;
 *                             }
 *                         }
 *                         leaf value-integer {
 *                             type int64;
 *                         }
 *                         leaf value-decimal {
 *                             type decimal64;
 *                         }
 *                         leaf value-string {
 *                             type string;
 *                         }
 *                         leaf description {
 *                             type string;
 *                         }
 *                         leaf group-tag {
 *                             type string;
 *                         }
 *                         leaf widget-type {
 *                             type widget-type;
 *                         }
 *                         leaf units {
 *                             type string;
 *                         }
 *                         uses monitoring-param-ui-data;
 *                         uses monitoring-param-value;
 *                     }
 *                     list ip-profiles {
 *                         key "name";
 *                         leaf name {
 *                             type string;
 *                         }
 *                         leaf description {
 *                             type string;
 *                         }
 *                         container ip-profile-params {
 *                             leaf ip-version {
 *                                 type ip-version;
 *                             }
 *                             leaf subnet-address {
 *                                 type ip-prefix;
 *                             }
 *                             leaf gateway-address {
 *                                 type ip-address;
 *                             }
 *                             leaf security-group {
 *                                 type string;
 *                             }
 *                             list dns-server {
 *                                 key "address";
 *                                 leaf address {
 *                                     type ip-address;
 *                                 }
 *                             }
 *                             container dhcp-params {
 *                                 leaf enabled {
 *                                     type enabled;
 *                                 }
 *                                 leaf start-address {
 *                                     type ip-address;
 *                                 }
 *                                 leaf count {
 *                                     type uint32;
 *                                 }
 *                             }
 *                             leaf subnet-prefix-pool {
 *                                 type string;
 *                             }
 *                         }
 *                         uses ip-profile-info;
 *                     }
 *                     uses vnfd-descriptor;
 *                 }
 *             }
 *         }
 *         augment \(http://riftio.com/ns/riftware-1.0/rw-project)project {
 *             when "Optional.empty";
 *             status CURRENT;
 *             container vnfr-catalog {
 *                 leaf schema-version {
 *                     type schema-version;
 *                 }
 *                 list vnfr {
 *                     key "id";
 *                     leaf id {
 *                         type uuid;
 *                     }
 *                     leaf nsr-id-ref {
 *                         type uuid;
 *                     }
 *                     leaf member-vnf-index-ref {
 *                         type leafref;
 *                     }
 *                     leaf dashboard-url {
 *                         type uri;
 *                     }
 *                     leaf name {
 *                         type string;
 *                     }
 *                     leaf short-name {
 *                         type string;
 *                     }
 *                     leaf vendor {
 *                         type string;
 *                     }
 *                     leaf description {
 *                         type string;
 *                     }
 *                     leaf version {
 *                         type string;
 *                     }
 *                     leaf create-time {
 *                         type uint32;
 *                     }
 *                     leaf uptime {
 *                         type uint32;
 *                     }
 *                     container vnfd {
 *                         leaf id {
 *                             type string;
 *                         }
 *                         leaf name {
 *                             type string;
 *                         }
 *                         leaf short-name {
 *                             type string;
 *                         }
 *                         leaf vendor {
 *                             type string;
 *                         }
 *                         leaf logo {
 *                             type string;
 *                         }
 *                         leaf description {
 *                             type string;
 *                         }
 *                         leaf version {
 *                             type string;
 *                         }
 *                         container vnf-configuration {
 *                             choice config-method {
 *                                 case juju {
 *                                     container juju {
 *                                         leaf charm {
 *                                             type string;
 *                                         }
 *                                         leaf proxy {
 *                                             type proxy;
 *                                         }
 *                                         container vca-relationships {
 *                                             list relation {
 *                                                 key "requires" "provides";
 *                                                 leaf requires {
 *                                                     type string;
 *                                                 }
 *                                                 leaf provides {
 *                                                     type string;
 *                                                 }
 *                                             }
 *                                         }
 *                                         uses vca-relationships;
 *                                     }
 *                                 }
 *                                 case script {
 *                                     container script {
 *                                         leaf script-type {
 *                                             type enumeration;
 *                                         }
 *                                     }
 *                                 }
 *                             }
 *                             list config-primitive {
 *                                 key "name";
 *                                 leaf name {
 *                                     type string;
 *                                 }
 *                                 list parameter {
 *                                     key "name";
 *                                     leaf name {
 *                                         type string;
 *                                     }
 *                                     leaf data-type {
 *                                         type parameter-data-type;
 *                                     }
 *                                     leaf mandatory {
 *                                         type mandatory;
 *                                     }
 *                                     leaf default-value {
 *                                         type string;
 *                                     }
 *                                     leaf parameter-pool {
 *                                         type string;
 *                                     }
 *                                     leaf read-only {
 *                                         type read-only;
 *                                     }
 *                                     leaf hidden {
 *                                         type hidden;
 *                                     }
 *                                     uses primitive-parameter;
 *                                 }
 *                                 leaf user-defined-script {
 *                                     type string;
 *                                 }
 *                             }
 *                             list initial-config-primitive {
 *                                 key "seq";
 *                                 leaf seq {
 *                                     type uint64;
 *                                 }
 *                                 choice primitive-type {
 *                                     case primitive-definition {
 *                                         leaf name {
 *                                             type string;
 *                                         }
 *                                         leaf user-defined-script {
 *                                             type string;
 *                                         }
 *                                         list parameter {
 *                                             key "name";
 *                                             leaf name {
 *                                                 type string;
 *                                             }
 *                                             leaf value {
 *                                                 type string;
 *                                             }
 *                                         }
 *                                     }
 *                                 }
 *                             }
 *                             uses vca-configuration;
 *                         }
 *                         leaf operational-status {
 *                             type vnf-operational-status;
 *                         }
 *                         container mgmt-interface {
 *                             choice endpoint-type {
 *                                 case cp {
 *                                     leaf cp {
 *                                         type string;
 *                                     }
 *                                 }
 *                                 case ip {
 *                                     leaf ip-address {
 *                                         type ip-address;
 *                                     }
 *                                 }
 *                                 case vdu-id {
 *                                     leaf vdu-id {
 *                                         type string;
 *                                     }
 *                                 }
 *                             }
 *                             leaf port {
 *                                 type port-number;
 *                             }
 *                             container dashboard-params {
 *                                 leaf path {
 *                                     type string;
 *                                 }
 *                                 leaf https {
 *                                     type boolean;
 *                                 }
 *                                 leaf port {
 *                                     type port-number;
 *                                 }
 *                             }
 *                         }
 *                         list internal-vld {
 *                             key "id";
 *                             leaf id {
 *                                 type string;
 *                             }
 *                             leaf name {
 *                                 type string;
 *                             }
 *                             leaf short-name {
 *                                 type string;
 *                             }
 *                             leaf description {
 *                                 type string;
 *                             }
 *                             leaf type {
 *                                 type virtual-link-type;
 *                             }
 *                             leaf root-bandwidth {
 *                                 type uint64;
 *                             }
 *                             leaf leaf-bandwidth {
 *                                 type uint64;
 *                             }
 *                             list internal-connection-point {
 *                                 key "id-ref";
 *                                 leaf id-ref {
 *                                     type string;
 *                                 }
 *                                 leaf ip-address {
 *                                     type ip-address;
 *                                 }
 *                             }
 *                             choice init-params {
 *                                 case vim-network-profile {
 *                                     leaf ip-profile-ref {
 *                                         type string;
 *                                     }
 *                                 }
 *                                 case vim-network-ref {
 *                                     leaf vim-network-name {
 *                                         type string;
 *                                     }
 *                                 }
 *                             }
 *                             container provider-network {
 *                                 leaf physical-network {
 *                                     type string;
 *                                 }
 *                                 leaf segmentation_id {
 *                                     type uint32;
 *                                 }
 *                             }
 *                             uses provider-network;
 *                         }
 *                         list connection-point {
 *                             key "name";
 *                             leaf name {
 *                                 type string;
 *                             }
 *                             leaf id {
 *                                 type string;
 *                             }
 *                             leaf short-name {
 *                                 type string;
 *                             }
 *                             leaf type {
 *                                 type connection-point-type;
 *                             }
 *                             leaf port-security-enabled {
 *                                 type boolean;
 *                             }
 *                             uses common-connection-point;
 *                         }
 *                         list vdu {
 *                             key "id";
 *                             leaf id {
 *                                 type string;
 *                             }
 *                             leaf name {
 *                                 type string;
 *                             }
 *                             leaf description {
 *                                 type string;
 *                             }
 *                             leaf count {
 *                                 type uint64;
 *                             }
 *                             leaf mgmt-vpci {
 *                                 type string;
 *                             }
 *                             list alarm {
 *                                 key "alarm-id";
 *                                 leaf alarm-id {
 *                                     type string;
 *                                 }
 *                                 leaf name {
 *                                     type string;
 *                                 }
 *                                 leaf description {
 *                                     type string;
 *                                 }
 *                                 leaf vdur-id {
 *                                     type string;
 *                                 }
 *                                 container actions {
 *                                     list ok {
 *                                         key "url";
 *                                         leaf url {
 *                                             type string;
 *                                         }
 *                                     }
 *                                     list insufficient-data {
 *                                         key "url";
 *                                         leaf url {
 *                                             type string;
 *                                         }
 *                                     }
 *                                     list alarm {
 *                                         key "url";
 *                                         leaf url {
 *                                             type string;
 *                                         }
 *                                     }
 *                                 }
 *                                 leaf repeat {
 *                                     type repeat;
 *                                 }
 *                                 leaf enabled {
 *                                     type enabled;
 *                                 }
 *                                 leaf severity {
 *                                     type alarm-severity-type;
 *                                 }
 *                                 leaf metric {
 *                                     type alarm-metric-type;
 *                                 }
 *                                 leaf statistic {
 *                                     type alarm-statistic-type;
 *                                 }
 *                                 leaf operation {
 *                                     type alarm-operation-type;
 *                                 }
 *                                 leaf value {
 *                                     type decimal64;
 *                                 }
 *                                 leaf period {
 *                                     type uint32;
 *                                 }
 *                                 leaf evaluations {
 *                                     type uint32;
 *                                 }
 *                                 uses alarm;
 *                             }
 *                             list alternative-images {
 *                                 key "vim-type";
 *                                 leaf vim-type {
 *                                     type string;
 *                                 }
 *                                 leaf image {
 *                                     type string;
 *                                 }
 *                                 leaf image-checksum {
 *                                     type string;
 *                                 }
 *                                 uses image-properties;
 *                             }
 *                             container vdu-configuration {
 *                                 choice config-method {
 *                                     case juju {
 *                                         container juju {
 *                                             leaf charm {
 *                                                 type string;
 *                                             }
 *                                             leaf proxy {
 *                                                 type proxy;
 *                                             }
 *                                             container vca-relationships {
 *                                                 list relation {
 *                                                     key "requires" "provides";
 *                                                     leaf requires {
 *                                                         type string;
 *                                                     }
 *                                                     leaf provides {
 *                                                         type string;
 *                                                     }
 *                                                 }
 *                                             }
 *                                             uses vca-relationships;
 *                                         }
 *                                     }
 *                                     case script {
 *                                         container script {
 *                                             leaf script-type {
 *                                                 type enumeration;
 *                                             }
 *                                         }
 *                                     }
 *                                 }
 *                                 list config-primitive {
 *                                     key "name";
 *                                     leaf name {
 *                                         type string;
 *                                     }
 *                                     list parameter {
 *                                         key "name";
 *                                         leaf name {
 *                                             type string;
 *                                         }
 *                                         leaf data-type {
 *                                             type parameter-data-type;
 *                                         }
 *                                         leaf mandatory {
 *                                             type mandatory;
 *                                         }
 *                                         leaf default-value {
 *                                             type string;
 *                                         }
 *                                         leaf parameter-pool {
 *                                             type string;
 *                                         }
 *                                         leaf read-only {
 *                                             type read-only;
 *                                         }
 *                                         leaf hidden {
 *                                             type hidden;
 *                                         }
 *                                         uses primitive-parameter;
 *                                     }
 *                                     leaf user-defined-script {
 *                                         type string;
 *                                     }
 *                                 }
 *                                 list initial-config-primitive {
 *                                     key "seq";
 *                                     leaf seq {
 *                                         type uint64;
 *                                     }
 *                                     choice primitive-type {
 *                                         case primitive-definition {
 *                                             leaf name {
 *                                                 type string;
 *                                             }
 *                                             leaf user-defined-script {
 *                                                 type string;
 *                                             }
 *                                             list parameter {
 *                                                 key "name";
 *                                                 leaf name {
 *                                                     type string;
 *                                                 }
 *                                                 leaf value {
 *                                                     type string;
 *                                                 }
 *                                             }
 *                                         }
 *                                     }
 *                                 }
 *                                 uses vca-configuration;
 *                             }
 *                             choice cloud-init-input {
 *                                 case filename {
 *                                     leaf cloud-init-file {
 *                                         type string;
 *                                     }
 *                                 }
 *                                 case inline {
 *                                     leaf cloud-init {
 *                                         type string;
 *                                     }
 *                                 }
 *                             }
 *                             list internal-connection-point {
 *                                 key "id";
 *                                 leaf internal-vld-ref {
 *                                     type leafref;
 *                                 }
 *                                 leaf name {
 *                                     type string;
 *                                 }
 *                                 leaf id {
 *                                     type string;
 *                                 }
 *                                 leaf short-name {
 *                                     type string;
 *                                 }
 *                                 leaf type {
 *                                     type connection-point-type;
 *                                 }
 *                                 leaf port-security-enabled {
 *                                     type boolean;
 *                                 }
 *                                 uses common-connection-point;
 *                             }
 *                             list interface {
 *                                 key "name";
 *                                 leaf name {
 *                                     type string;
 *                                 }
 *                                 leaf position {
 *                                     type uint32;
 *                                 }
 *                                 leaf type {
 *                                     type type;
 *                                 }
 *                                 leaf mac-address {
 *                                     type string;
 *                                 }
 *                                 choice connection-point-type {
 *                                     case external {
 *                                         leaf external-connection-point-ref {
 *                                             type string;
 *                                         }
 *                                     }
 *                                     case internal {
 *                                         leaf internal-connection-point-ref {
 *                                             type string;
 *                                         }
 *                                     }
 *                                 }
 *                                 container virtual-interface {
 *                                     leaf type {
 *                                         type type;
 *                                     }
 *                                     leaf vpci {
 *                                         type string;
 *                                     }
 *                                     leaf bandwidth {
 *                                         type uint64;
 *                                     }
 *                                 }
 *                                 uses virtual-interface;
 *                             }
 *                             list volumes {
 *                                 key "name";
 *                                 leaf name {
 *                                     type string;
 *                                 }
 *                                 leaf description {
 *                                     type string;
 *                                 }
 *                                 leaf size {
 *                                     type uint64;
 *                                 }
 *                                 choice volume-source {
 *                                     case ephemeral {
 *                                         leaf ephemeral {
 *                                             type empty;
 *                                         }
 *                                     }
 *                                     case image {
 *                                         leaf image {
 *                                             type string;
 *                                         }
 *                                         leaf image-checksum {
 *                                             type string;
 *                                         }
 *                                     }
 *                                 }
 *                                 leaf device-bus {
 *                                     type enumeration;
 *                                 }
 *                                 leaf device-type {
 *                                     type enumeration;
 *                                 }
 *                                 uses volume-info;
 *                             }
 *                             container vm-flavor {
 *                                 leaf vcpu-count {
 *                                     type uint16;
 *                                 }
 *                                 leaf memory-mb {
 *                                     type uint64;
 *                                 }
 *                                 leaf storage-gb {
 *                                     type uint64;
 *                                 }
 *                             }
 *                             container guest-epa {
 *                                 leaf trusted-execution {
 *                                     type boolean;
 *                                 }
 *                                 leaf mempage-size {
 *                                     type enumeration;
 *                                 }
 *                                 leaf cpu-pinning-policy {
 *                                     type cpu-pinning-policy;
 *                                 }
 *                                 leaf cpu-thread-pinning-policy {
 *                                     type enumeration;
 *                                 }
 *                                 list pcie-device {
 *                                     key "device-id";
 *                                     leaf device-id {
 *                                         type string;
 *                                     }
 *                                     leaf count {
 *                                         type uint64;
 *                                     }
 *                                 }
 *                                 choice numa-policy {
 *                                     case numa-aware {
 *                                         container numa-node-policy {
 *                                             leaf node-cnt {
 *                                                 type uint16;
 *                                             }
 *                                             leaf mem-policy {
 *                                                 type enumeration;
 *                                             }
 *                                             list node {
 *                                                 key "id";
 *                                                 leaf id {
 *                                                     type uint64;
 *                                                 }
 *                                                 list vcpu {
 *                                                     key "id";
 *                                                     leaf id {
 *                                                         type uint64;
 *                                                     }
 *                                                 }
 *                                                 leaf memory-mb {
 *                                                     type uint64;
 *                                                 }
 *                                                 choice om-numa-type {
 *                                                     case cores {
 *                                                         leaf num-cores {
 *                                                             type uint8;
 *                                                         }
 *                                                     }
 *                                                     case paired-threads {
 *                                                         container paired-threads {
 *                                                             leaf num-paired-threads {
 *                                                                 type uint8;
 *                                                             }
 *                                                             list paired-thread-ids {
 *                                                                 key "thread-a";
 *                                                                 leaf thread-a {
 *                                                                     type uint8;
 *                                                                 }
 *                                                                 leaf thread-b {
 *                                                                     type uint8;
 *                                                                 }
 *                                                             }
 *                                                         }
 *                                                     }
 *                                                     case threads {
 *                                                         leaf num-threads {
 *                                                             type uint8;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                             }
 *                                         }
 *                                     }
 *                                     case numa-unaware {
 *                                         leaf numa-unaware {
 *                                             type empty;
 *                                         }
 *                                     }
 *                                 }
 *                             }
 *                             container hypervisor-epa {
 *                                 leaf type {
 *                                     type enumeration;
 *                                 }
 *                                 leaf version {
 *                                     type string;
 *                                 }
 *                             }
 *                             leaf image {
 *                                 type string;
 *                             }
 *                             leaf image-checksum {
 *                                 type string;
 *                             }
 *                             container vswitch-epa {
 *                                 leaf ovs-acceleration {
 *                                     type enumeration;
 *                                 }
 *                                 leaf ovs-offload {
 *                                     type enumeration;
 *                                 }
 *                             }
 *                             container host-epa {
 *                                 leaf cpu-model {
 *                                     type enumeration;
 *                                 }
 *                                 leaf cpu-arch {
 *                                     type enumeration;
 *                                 }
 *                                 leaf cpu-vendor {
 *                                     type enumeration;
 *                                 }
 *                                 leaf cpu-socket-count {
 *                                     type uint64;
 *                                 }
 *                                 leaf cpu-core-count {
 *                                     type uint64;
 *                                 }
 *                                 leaf cpu-core-thread-count {
 *                                     type uint64;
 *                                 }
 *                                 list cpu-feature {
 *                                     key "feature";
 *                                     leaf feature {
 *                                         type cpu-feature-type;
 *                                     }
 *                                 }
 *                                 leaf om-cpu-model-string {
 *                                     type string;
 *                                 }
 *                                 list om-cpu-feature {
 *                                     key "feature";
 *                                     leaf feature {
 *                                         type string;
 *                                     }
 *                                 }
 *                             }
 *                             container supplemental-boot-data {
 *                                 leaf boot-data-drive {
 *                                     type boot-data-drive;
 *                                 }
 *                                 list config-file {
 *                                     key "source";
 *                                     leaf source {
 *                                         type string;
 *                                     }
 *                                     leaf dest {
 *                                         type string;
 *                                     }
 *                                 }
 *                                 uses config-file;
 *                             }
 *                             uses guest-epa;
 *                             uses supplemental-boot-data;
 *                             uses host-epa;
 *                             uses vm-flavor;
 *                             uses image-properties;
 *                             uses vswitch-epa;
 *                             uses hypervisor-epa;
 *                         }
 *                         list vdu-dependency {
 *                             key "vdu-source-ref";
 *                             leaf vdu-source-ref {
 *                                 type string;
 *                             }
 *                             leaf vdu-depends-on-ref {
 *                                 type string;
 *                             }
 *                         }
 *                         leaf service-function-chain {
 *                             type service-function-chain;
 *                         }
 *                         leaf service-function-type {
 *                             type string;
 *                         }
 *                         list placement-groups {
 *                             key "name";
 *                             list member-vdus {
 *                                 key "member-vdu-ref";
 *                                 leaf member-vdu-ref {
 *                                     type string;
 *                                 }
 *                             }
 *                             leaf name {
 *                                 type string;
 *                             }
 *                             leaf requirement {
 *                                 type string;
 *                             }
 *                             leaf strategy {
 *                                 type strategy;
 *                             }
 *                             uses placement-group-info;
 *                         }
 *                         list http-endpoint {
 *                             key "path";
 *                             leaf path {
 *                                 type string;
 *                             }
 *                             leaf https {
 *                                 type https;
 *                             }
 *                             leaf port {
 *                                 type port-number;
 *                             }
 *                             leaf username {
 *                                 type string;
 *                             }
 *                             leaf password {
 *                                 type string;
 *                             }
 *                             leaf polling-interval-secs {
 *                                 type polling-interval-secs;
 *                             }
 *                             leaf method {
 *                                 type method;
 *                             }
 *                             list headers {
 *                                 key "akey";
 *                                 leaf akey {
 *                                     type string;
 *                                 }
 *                                 leaf value {
 *                                     type string;
 *                                 }
 *                             }
 *                         }
 *                         list monitoring-param {
 *                             key "id";
 *                             leaf id {
 *                                 type string;
 *                             }
 *                             leaf name {
 *                                 type string;
 *                             }
 *                             leaf http-endpoint-ref {
 *                                 type leafref;
 *                             }
 *                             leaf json-query-method {
 *                                 type json-query-method;
 *                             }
 *                             container json-query-params {
 *                                 leaf json-path {
 *                                     type string;
 *                                 }
 *                                 leaf object-path {
 *                                     type string;
 *                                 }
 *                             }
 *                             leaf value-type {
 *                                 type value-type;
 *                             }
 *                             container numeric-constraints {
 *                                 leaf min-value {
 *                                     type uint64;
 *                                 }
 *                                 leaf max-value {
 *                                     type uint64;
 *                                 }
 *                             }
 *                             container text-constraints {
 *                                 leaf min-length {
 *                                     type uint8;
 *                                 }
 *                                 leaf max-length {
 *                                     type uint8;
 *                                 }
 *                             }
 *                             leaf value-integer {
 *                                 type int64;
 *                             }
 *                             leaf value-decimal {
 *                                 type decimal64;
 *                             }
 *                             leaf value-string {
 *                                 type string;
 *                             }
 *                             leaf description {
 *                                 type string;
 *                             }
 *                             leaf group-tag {
 *                                 type string;
 *                             }
 *                             leaf widget-type {
 *                                 type widget-type;
 *                             }
 *                             leaf units {
 *                                 type string;
 *                             }
 *                             uses monitoring-param-ui-data;
 *                             uses monitoring-param-value;
 *                         }
 *                         list ip-profiles {
 *                             key "name";
 *                             leaf name {
 *                                 type string;
 *                             }
 *                             leaf description {
 *                                 type string;
 *                             }
 *                             container ip-profile-params {
 *                                 leaf ip-version {
 *                                     type ip-version;
 *                                 }
 *                                 leaf subnet-address {
 *                                     type ip-prefix;
 *                                 }
 *                                 leaf gateway-address {
 *                                     type ip-address;
 *                                 }
 *                                 leaf security-group {
 *                                     type string;
 *                                 }
 *                                 list dns-server {
 *                                     key "address";
 *                                     leaf address {
 *                                         type ip-address;
 *                                     }
 *                                 }
 *                                 container dhcp-params {
 *                                     leaf enabled {
 *                                         type enabled;
 *                                     }
 *                                     leaf start-address {
 *                                         type ip-address;
 *                                     }
 *                                     leaf count {
 *                                         type uint32;
 *                                     }
 *                                 }
 *                                 leaf subnet-prefix-pool {
 *                                     type string;
 *                                 }
 *                             }
 *                             uses ip-profile-info;
 *                         }
 *                         uses vnfd-descriptor;
 *                     }
 *                     leaf vnfd-ref {
 *                         type leafref;
 *                     }
 *                     container vnf-configuration {
 *                         choice config-method {
 *                             case juju {
 *                                 container juju {
 *                                     leaf charm {
 *                                         type string;
 *                                     }
 *                                     leaf proxy {
 *                                         type proxy;
 *                                     }
 *                                     container vca-relationships {
 *                                         list relation {
 *                                             key "requires" "provides";
 *                                             leaf requires {
 *                                                 type string;
 *                                             }
 *                                             leaf provides {
 *                                                 type string;
 *                                             }
 *                                         }
 *                                     }
 *                                     uses vca-relationships;
 *                                 }
 *                             }
 *                             case script {
 *                                 container script {
 *                                     leaf script-type {
 *                                         type enumeration;
 *                                     }
 *                                 }
 *                             }
 *                         }
 *                         list config-primitive {
 *                             key "name";
 *                             leaf name {
 *                                 type string;
 *                             }
 *                             list parameter {
 *                                 key "name";
 *                                 leaf name {
 *                                     type string;
 *                                 }
 *                                 leaf data-type {
 *                                     type parameter-data-type;
 *                                 }
 *                                 leaf mandatory {
 *                                     type mandatory;
 *                                 }
 *                                 leaf default-value {
 *                                     type string;
 *                                 }
 *                                 leaf parameter-pool {
 *                                     type string;
 *                                 }
 *                                 leaf read-only {
 *                                     type read-only;
 *                                 }
 *                                 leaf hidden {
 *                                     type hidden;
 *                                 }
 *                                 uses primitive-parameter;
 *                             }
 *                             leaf user-defined-script {
 *                                 type string;
 *                             }
 *                         }
 *                         list initial-config-primitive {
 *                             key "seq";
 *                             leaf seq {
 *                                 type uint64;
 *                             }
 *                             choice primitive-type {
 *                                 case primitive-definition {
 *                                     leaf name {
 *                                         type string;
 *                                     }
 *                                     leaf user-defined-script {
 *                                         type string;
 *                                     }
 *                                     list parameter {
 *                                         key "name";
 *                                         leaf name {
 *                                             type string;
 *                                         }
 *                                         leaf value {
 *                                             type string;
 *                                         }
 *                                     }
 *                                 }
 *                             }
 *                         }
 *                         uses vca-configuration;
 *                     }
 *                     container mgmt-interface {
 *                         leaf ip-address {
 *                             type ip-address;
 *                         }
 *                         leaf port {
 *                             type port-number;
 *                         }
 *                         container ssh-key {
 *                             leaf public-key {
 *                                 type string;
 *                             }
 *                             leaf private-key-file {
 *                                 type string;
 *                             }
 *                         }
 *                     }
 *                     list internal-vlr {
 *                         key "vlr-ref";
 *                         leaf vlr-ref {
 *                             type leafref;
 *                         }
 *                         leaf-list internal-connection-point-ref {
 *                             type string;
 *                         }
 *                     }
 *                     list connection-point {
 *                         key "name";
 *                         leaf name {
 *                             type string;
 *                         }
 *                         leaf id {
 *                             type string;
 *                         }
 *                         leaf short-name {
 *                             type string;
 *                         }
 *                         leaf type {
 *                             type connection-point-type;
 *                         }
 *                         leaf port-security-enabled {
 *                             type boolean;
 *                         }
 *                         leaf vlr-ref {
 *                             type leafref;
 *                         }
 *                         leaf ip-address {
 *                             type ip-address;
 *                         }
 *                         leaf mac-address {
 *                             type string;
 *                         }
 *                         leaf connection-point-id {
 *                             type string;
 *                         }
 *                         list virtual-cps {
 *                             key "name";
 *                             leaf ip-address {
 *                                 type ip-address;
 *                             }
 *                             leaf mac-address {
 *                                 type string;
 *                             }
 *                             leaf connection-point-id {
 *                                 type string;
 *                             }
 *                             leaf name {
 *                                 type string;
 *                             }
 *                             leaf id {
 *                                 type string;
 *                             }
 *                             leaf short-name {
 *                                 type string;
 *                             }
 *                             leaf type {
 *                                 type connection-point-type;
 *                             }
 *                             leaf port-security-enabled {
 *                                 type boolean;
 *                             }
 *                             uses common-connection-point;
 *                         }
 *                         uses common-connection-point;
 *                         uses associated-virtual-cps;
 *                     }
 *                     list vdur {
 *                         key "id";
 *                         leaf id {
 *                             type uuid;
 *                         }
 *                         leaf name {
 *                             type string;
 *                         }
 *                         leaf unique-short-name {
 *                             type string;
 *                         }
 *                         leaf vdu-id-ref {
 *                             type leafref;
 *                         }
 *                         leaf vim-id {
 *                             type string;
 *                         }
 *                         leaf flavor-id {
 *                             type string;
 *                         }
 *                         leaf image-id {
 *                             type string;
 *                         }
 *                         leaf management-ip {
 *                             type ip-address;
 *                         }
 *                         leaf vm-management-ip {
 *                             type ip-address;
 *                         }
 *                         leaf console-url {
 *                             type uri;
 *                         }
 *                         container vm-flavor {
 *                             leaf vcpu-count {
 *                                 type uint16;
 *                             }
 *                             leaf memory-mb {
 *                                 type uint64;
 *                             }
 *                             leaf storage-gb {
 *                                 type uint64;
 *                             }
 *                         }
 *                         container guest-epa {
 *                             leaf trusted-execution {
 *                                 type boolean;
 *                             }
 *                             leaf mempage-size {
 *                                 type enumeration;
 *                             }
 *                             leaf cpu-pinning-policy {
 *                                 type cpu-pinning-policy;
 *                             }
 *                             leaf cpu-thread-pinning-policy {
 *                                 type enumeration;
 *                             }
 *                             list pcie-device {
 *                                 key "device-id";
 *                                 leaf device-id {
 *                                     type string;
 *                                 }
 *                                 leaf count {
 *                                     type uint64;
 *                                 }
 *                             }
 *                             choice numa-policy {
 *                                 case numa-aware {
 *                                     container numa-node-policy {
 *                                         leaf node-cnt {
 *                                             type uint16;
 *                                         }
 *                                         leaf mem-policy {
 *                                             type enumeration;
 *                                         }
 *                                         list node {
 *                                             key "id";
 *                                             leaf id {
 *                                                 type uint64;
 *                                             }
 *                                             list vcpu {
 *                                                 key "id";
 *                                                 leaf id {
 *                                                     type uint64;
 *                                                 }
 *                                             }
 *                                             leaf memory-mb {
 *                                                 type uint64;
 *                                             }
 *                                             choice om-numa-type {
 *                                                 case cores {
 *                                                     leaf num-cores {
 *                                                         type uint8;
 *                                                     }
 *                                                 }
 *                                                 case paired-threads {
 *                                                     container paired-threads {
 *                                                         leaf num-paired-threads {
 *                                                             type uint8;
 *                                                         }
 *                                                         list paired-thread-ids {
 *                                                             key "thread-a";
 *                                                             leaf thread-a {
 *                                                                 type uint8;
 *                                                             }
 *                                                             leaf thread-b {
 *                                                                 type uint8;
 *                                                             }
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 case threads {
 *                                                     leaf num-threads {
 *                                                         type uint8;
 *                                                     }
 *                                                 }
 *                                             }
 *                                         }
 *                                     }
 *                                 }
 *                                 case numa-unaware {
 *                                     leaf numa-unaware {
 *                                         type empty;
 *                                     }
 *                                 }
 *                             }
 *                         }
 *                         container vswitch-epa {
 *                             leaf ovs-acceleration {
 *                                 type enumeration;
 *                             }
 *                             leaf ovs-offload {
 *                                 type enumeration;
 *                             }
 *                         }
 *                         container hypervisor-epa {
 *                             leaf type {
 *                                 type enumeration;
 *                             }
 *                             leaf version {
 *                                 type string;
 *                             }
 *                         }
 *                         container host-epa {
 *                             leaf cpu-model {
 *                                 type enumeration;
 *                             }
 *                             leaf cpu-arch {
 *                                 type enumeration;
 *                             }
 *                             leaf cpu-vendor {
 *                                 type enumeration;
 *                             }
 *                             leaf cpu-socket-count {
 *                                 type uint64;
 *                             }
 *                             leaf cpu-core-count {
 *                                 type uint64;
 *                             }
 *                             leaf cpu-core-thread-count {
 *                                 type uint64;
 *                             }
 *                             list cpu-feature {
 *                                 key "feature";
 *                                 leaf feature {
 *                                     type cpu-feature-type;
 *                                 }
 *                             }
 *                             leaf om-cpu-model-string {
 *                                 type string;
 *                             }
 *                             list om-cpu-feature {
 *                                 key "feature";
 *                                 leaf feature {
 *                                     type string;
 *                                 }
 *                             }
 *                         }
 *                         container supplemental-boot-data {
 *                             leaf boot-data-drive {
 *                                 type boot-data-drive;
 *                             }
 *                             list config-file {
 *                                 key "source";
 *                                 leaf source {
 *                                     type string;
 *                                 }
 *                                 leaf dest {
 *                                     type string;
 *                                 }
 *                             }
 *                             uses config-file;
 *                         }
 *                         container vdu-configuration {
 *                             choice config-method {
 *                                 case juju {
 *                                     container juju {
 *                                         leaf charm {
 *                                             type string;
 *                                         }
 *                                         leaf proxy {
 *                                             type proxy;
 *                                         }
 *                                         container vca-relationships {
 *                                             list relation {
 *                                                 key "requires" "provides";
 *                                                 leaf requires {
 *                                                     type string;
 *                                                 }
 *                                                 leaf provides {
 *                                                     type string;
 *                                                 }
 *                                             }
 *                                         }
 *                                         uses vca-relationships;
 *                                     }
 *                                 }
 *                                 case script {
 *                                     container script {
 *                                         leaf script-type {
 *                                             type enumeration;
 *                                         }
 *                                     }
 *                                 }
 *                             }
 *                             list config-primitive {
 *                                 key "name";
 *                                 leaf name {
 *                                     type string;
 *                                 }
 *                                 list parameter {
 *                                     key "name";
 *                                     leaf name {
 *                                         type string;
 *                                     }
 *                                     leaf data-type {
 *                                         type parameter-data-type;
 *                                     }
 *                                     leaf mandatory {
 *                                         type mandatory;
 *                                     }
 *                                     leaf default-value {
 *                                         type string;
 *                                     }
 *                                     leaf parameter-pool {
 *                                         type string;
 *                                     }
 *                                     leaf read-only {
 *                                         type read-only;
 *                                     }
 *                                     leaf hidden {
 *                                         type hidden;
 *                                     }
 *                                     uses primitive-parameter;
 *                                 }
 *                                 leaf user-defined-script {
 *                                     type string;
 *                                 }
 *                             }
 *                             list initial-config-primitive {
 *                                 key "seq";
 *                                 leaf seq {
 *                                     type uint64;
 *                                 }
 *                                 choice primitive-type {
 *                                     case primitive-definition {
 *                                         leaf name {
 *                                             type string;
 *                                         }
 *                                         leaf user-defined-script {
 *                                             type string;
 *                                         }
 *                                         list parameter {
 *                                             key "name";
 *                                             leaf name {
 *                                                 type string;
 *                                             }
 *                                             leaf value {
 *                                                 type string;
 *                                             }
 *                                         }
 *                                     }
 *                                 }
 *                             }
 *                             uses vca-configuration;
 *                         }
 *                         list volumes {
 *                             key "name";
 *                             leaf name {
 *                                 type string;
 *                             }
 *                             leaf volume-id {
 *                                 type string;
 *                             }
 *                             leaf description {
 *                                 type string;
 *                             }
 *                             leaf size {
 *                                 type uint64;
 *                             }
 *                             choice volume-source {
 *                                 case ephemeral {
 *                                     leaf ephemeral {
 *                                         type empty;
 *                                     }
 *                                 }
 *                                 case image {
 *                                     leaf image {
 *                                         type string;
 *                                     }
 *                                     leaf image-checksum {
 *                                         type string;
 *                                     }
 *                                 }
 *                             }
 *                             leaf device-bus {
 *                                 type enumeration;
 *                             }
 *                             leaf device-type {
 *                                 type enumeration;
 *                             }
 *                             uses volume-info;
 *                         }
 *                         list internal-connection-point {
 *                             key "id";
 *                             leaf name {
 *                                 type string;
 *                             }
 *                             leaf id {
 *                                 type string;
 *                             }
 *                             leaf short-name {
 *                                 type string;
 *                             }
 *                             leaf type {
 *                                 type connection-point-type;
 *                             }
 *                             leaf port-security-enabled {
 *                                 type boolean;
 *                             }
 *                             leaf ip-address {
 *                                 type ip-address;
 *                             }
 *                             leaf mac-address {
 *                                 type string;
 *                             }
 *                             leaf connection-point-id {
 *                                 type string;
 *                             }
 *                             list virtual-cps {
 *                                 key "name";
 *                                 leaf ip-address {
 *                                     type ip-address;
 *                                 }
 *                                 leaf mac-address {
 *                                     type string;
 *                                 }
 *                                 leaf connection-point-id {
 *                                     type string;
 *                                 }
 *                                 leaf name {
 *                                     type string;
 *                                 }
 *                                 leaf id {
 *                                     type string;
 *                                 }
 *                                 leaf short-name {
 *                                     type string;
 *                                 }
 *                                 leaf type {
 *                                     type connection-point-type;
 *                                 }
 *                                 leaf port-security-enabled {
 *                                     type boolean;
 *                                 }
 *                                 uses common-connection-point;
 *                             }
 *                             uses common-connection-point;
 *                             uses associated-virtual-cps;
 *                         }
 *                         list interface {
 *                             key "name";
 *                             leaf name {
 *                                 type string;
 *                             }
 *                             leaf position {
 *                                 type uint32;
 *                             }
 *                             leaf type {
 *                                 type type;
 *                             }
 *                             choice connection-point-type {
 *                                 case external {
 *                                     leaf external-connection-point-ref {
 *                                         type string;
 *                                     }
 *                                 }
 *                                 case internal {
 *                                     leaf internal-connection-point-ref {
 *                                         type string;
 *                                     }
 *                                 }
 *                             }
 *                             container virtual-interface {
 *                                 leaf type {
 *                                     type enumeration;
 *                                 }
 *                                 leaf bandwidth {
 *                                     type uint64;
 *                                 }
 *                                 leaf ovs-offload {
 *                                     type enumeration;
 *                                 }
 *                                 leaf vendor-id {
 *                                     type string;
 *                                 }
 *                                 leaf datapath-library {
 *                                     type string;
 *                                 }
 *                                 leaf provider-network-name {
 *                                     type string;
 *                                 }
 *                             }
 *                             uses virtual-interface;
 *                         }
 *                         leaf operational-status {
 *                             type vdu-operational-status;
 *                         }
 *                         list placement-groups-info {
 *                             key "name";
 *                             leaf name {
 *                                 type string;
 *                             }
 *                             leaf requirement {
 *                                 type string;
 *                             }
 *                             leaf strategy {
 *                                 type strategy;
 *                             }
 *                             leaf cloud-type {
 *                                 type cloud-account-type;
 *                             }
 *                             choice cloud-provider {
 *                                 case aws {
 *                                     leaf aws-construct {
 *                                         type empty;
 *                                     }
 *                                 }
 *                                 case cloudsim {
 *                                     leaf cloudsim-construct {
 *                                         type empty;
 *                                     }
 *                                 }
 *                                 case mock {
 *                                     leaf mock-construct {
 *                                         type empty;
 *                                     }
 *                                 }
 *                                 case openmano {
 *                                     leaf openmano-construct {
 *                                         type empty;
 *                                     }
 *                                 }
 *                                 case openstack {
 *                                     container availability-zone {
 *                                         leaf name {
 *                                             type string;
 *                                         }
 *                                     }
 *                                     container server-group {
 *                                         leaf name {
 *                                             type string;
 *                                         }
 *                                     }
 *                                     list host-aggregate {
 *                                         key "metadata-key";
 *                                         leaf metadata-key {
 *                                             type string;
 *                                         }
 *                                         leaf metadata-value {
 *                                             type string;
 *                                         }
 *                                     }
 *                                 }
 *                                 case vsphere {
 *                                     leaf vsphere-construct {
 *                                         type empty;
 *                                     }
 *                                 }
 *                             }
 *                             uses placement-group-info;
 *                             uses placement-group-input;
 *                         }
 *                         uses guest-epa;
 *                         uses supplemental-boot-data;
 *                         uses host-epa;
 *                         uses vm-flavor;
 *                         uses vswitch-epa;
 *                         uses placement-group-info;
 *                         uses hypervisor-epa;
 *                     }
 *                     list http-endpoint {
 *                         key "path";
 *                         leaf path {
 *                             type string;
 *                         }
 *                         leaf https {
 *                             type https;
 *                         }
 *                         leaf port {
 *                             type port-number;
 *                         }
 *                         leaf username {
 *                             type string;
 *                         }
 *                         leaf password {
 *                             type string;
 *                         }
 *                         leaf polling-interval-secs {
 *                             type polling-interval-secs;
 *                         }
 *                         leaf method {
 *                             type method;
 *                         }
 *                         list headers {
 *                             key "akey";
 *                             leaf akey {
 *                                 type string;
 *                             }
 *                             leaf value {
 *                                 type string;
 *                             }
 *                         }
 *                     }
 *                     list monitoring-param {
 *                         key "id";
 *                         leaf id {
 *                             type string;
 *                         }
 *                         leaf name {
 *                             type string;
 *                         }
 *                         leaf http-endpoint-ref {
 *                             type leafref;
 *                         }
 *                         leaf json-query-method {
 *                             type json-query-method;
 *                         }
 *                         container json-query-params {
 *                             leaf json-path {
 *                                 type string;
 *                             }
 *                             leaf object-path {
 *                                 type string;
 *                             }
 *                         }
 *                         leaf value-type {
 *                             type value-type;
 *                         }
 *                         container numeric-constraints {
 *                             leaf min-value {
 *                                 type uint64;
 *                             }
 *                             leaf max-value {
 *                                 type uint64;
 *                             }
 *                         }
 *                         container text-constraints {
 *                             leaf min-length {
 *                                 type uint8;
 *                             }
 *                             leaf max-length {
 *                                 type uint8;
 *                             }
 *                         }
 *                         leaf value-integer {
 *                             type int64;
 *                         }
 *                         leaf value-decimal {
 *                             type decimal64;
 *                         }
 *                         leaf value-string {
 *                             type string;
 *                         }
 *                         leaf description {
 *                             type string;
 *                         }
 *                         leaf group-tag {
 *                             type string;
 *                         }
 *                         leaf widget-type {
 *                             type widget-type;
 *                         }
 *                         leaf units {
 *                             type string;
 *                         }
 *                         uses monitoring-param-ui-data;
 *                         uses monitoring-param-value;
 *                     }
 *                     leaf operational-status {
 *                         type vnf-operational-status;
 *                     }
 *                     leaf config-status {
 *                         type enumeration;
 *                     }
 *                     list placement-groups-info {
 *                         key "name";
 *                         leaf name {
 *                             type string;
 *                         }
 *                         leaf requirement {
 *                             type string;
 *                         }
 *                         leaf strategy {
 *                             type strategy;
 *                         }
 *                         leaf cloud-type {
 *                             type cloud-account-type;
 *                         }
 *                         choice cloud-provider {
 *                             case aws {
 *                                 leaf aws-construct {
 *                                     type empty;
 *                                 }
 *                             }
 *                             case cloudsim {
 *                                 leaf cloudsim-construct {
 *                                     type empty;
 *                                 }
 *                             }
 *                             case mock {
 *                                 leaf mock-construct {
 *                                     type empty;
 *                                 }
 *                             }
 *                             case openmano {
 *                                 leaf openmano-construct {
 *                                     type empty;
 *                                 }
 *                             }
 *                             case openstack {
 *                                 container availability-zone {
 *                                     leaf name {
 *                                         type string;
 *                                     }
 *                                 }
 *                                 container server-group {
 *                                     leaf name {
 *                                         type string;
 *                                     }
 *                                 }
 *                                 list host-aggregate {
 *                                     key "metadata-key";
 *                                     leaf metadata-key {
 *                                         type string;
 *                                     }
 *                                     leaf metadata-value {
 *                                         type string;
 *                                     }
 *                                 }
 *                             }
 *                             case vsphere {
 *                                 leaf vsphere-construct {
 *                                     type empty;
 *                                 }
 *                             }
 *                         }
 *                         uses placement-group-info;
 *                         uses placement-group-input;
 *                     }
 *                     container cloud-config {
 *                         list key-pair {
 *                             key "name";
 *                             leaf name {
 *                                 type string;
 *                             }
 *                             leaf akey {
 *                                 type string;
 *                             }
 *                         }
 *                         list user {
 *                             key "name";
 *                             leaf name {
 *                                 type string;
 *                             }
 *                             leaf user-info {
 *                                 type string;
 *                             }
 *                             list key-pair {
 *                                 key "name";
 *                                 leaf name {
 *                                     type string;
 *                                 }
 *                                 leaf akey {
 *                                     type string;
 *                                 }
 *                             }
 *                         }
 *                         uses cloud-config;
 *                     }
 *                     uses monitoring-param;
 *                     uses placement-group-info;
 *                 }
 *             }
 *         }
 *         augment \(http://riftio.com/ns/riftware-1.0/rw-project)project {
 *             when "Optional.empty";
 *             status CURRENT;
 *             container ns-instance-config {
 *                 list nsr {
 *                     key "id";
 *                     leaf schema-version {
 *                         type schema-version;
 *                     }
 *                     leaf id {
 *                         type uuid;
 *                     }
 *                     leaf name {
 *                         type string;
 *                     }
 *                     leaf short-name {
 *                         type string;
 *                     }
 *                     leaf description {
 *                         type string;
 *                     }
 *                     leaf admin-status {
 *                         type enumeration;
 *                     }
 *                     container nsd {
 *                         leaf id {
 *                             type string;
 *                         }
 *                         leaf name {
 *                             type string;
 *                         }
 *                         leaf short-name {
 *                             type string;
 *                         }
 *                         leaf vendor {
 *                             type string;
 *                         }
 *                         leaf logo {
 *                             type string;
 *                         }
 *                         leaf description {
 *                             type string;
 *                         }
 *                         leaf version {
 *                             type string;
 *                         }
 *                         list connection-point {
 *                             key "name";
 *                             leaf name {
 *                                 type string;
 *                             }
 *                             leaf type {
 *                                 type connection-point-type;
 *                             }
 *                         }
 *                         list scaling-group-descriptor {
 *                             key "name";
 *                             leaf name {
 *                                 type string;
 *                             }
 *                             list scaling-policy {
 *                                 key "name";
 *                                 leaf name {
 *                                     type string;
 *                                 }
 *                                 leaf scaling-type {
 *                                     type scaling-policy-type;
 *                                 }
 *                                 leaf enabled {
 *                                     type enabled;
 *                                 }
 *                                 leaf scale-in-operation-type {
 *                                     type scale-in-operation-type;
 *                                 }
 *                                 leaf scale-out-operation-type {
 *                                     type scale-out-operation-type;
 *                                 }
 *                                 leaf threshold-time {
 *                                     type uint32;
 *                                 }
 *                                 leaf cooldown-time {
 *                                     type uint32;
 *                                 }
 *                                 list scaling-criteria {
 *                                     key "name";
 *                                     leaf name {
 *                                         type string;
 *                                     }
 *                                     leaf scale-in-threshold {
 *                                         type uint64;
 *                                     }
 *                                     leaf scale-out-threshold {
 *                                         type uint64;
 *                                     }
 *                                     leaf ns-monitoring-param-ref {
 *                                         type string;
 *                                     }
 *                                 }
 *                             }
 *                             list vnfd-member {
 *                                 key "member-vnf-index-ref";
 *                                 leaf member-vnf-index-ref {
 *                                     type string;
 *                                 }
 *                                 leaf count {
 *                                     type count;
 *                                 }
 *                             }
 *                             leaf min-instance-count {
 *                                 type min-instance-count;
 *                             }
 *                             leaf max-instance-count {
 *                                 type max-instance-count;
 *                             }
 *                             list scaling-config-action {
 *                                 key "trigger";
 *                                 leaf trigger {
 *                                     type scaling-trigger;
 *                                 }
 *                                 leaf ns-service-primitive-name-ref {
 *                                     type string;
 *                                 }
 *                             }
 *                         }
 *                         list vnffgd {
 *                             key "id";
 *                             leaf id {
 *                                 type string;
 *                             }
 *                             leaf name {
 *                                 type string;
 *                             }
 *                             leaf short-name {
 *                                 type string;
 *                             }
 *                             leaf vendor {
 *                                 type string;
 *                             }
 *                             leaf description {
 *                                 type string;
 *                             }
 *                             leaf version {
 *                                 type string;
 *                             }
 *                             list rsp {
 *                                 key "id";
 *                                 leaf id {
 *                                     type string;
 *                                 }
 *                                 leaf name {
 *                                     type string;
 *                                 }
 *                                 list vnfd-connection-point-ref {
 *                                     key "member-vnf-index-ref";
 *                                     leaf member-vnf-index-ref {
 *                                         type string;
 *                                     }
 *                                     leaf order {
 *                                         type uint8;
 *                                     }
 *                                     leaf vnfd-id-ref {
 *                                         type leafref;
 *                                     }
 *                                     leaf vnfd-connection-point-ref {
 *                                         type string;
 *                                     }
 *                                 }
 *                             }
 *                             list classifier {
 *                                 key "id";
 *                                 leaf id {
 *                                     type string;
 *                                 }
 *                                 leaf name {
 *                                     type string;
 *                                 }
 *                                 leaf rsp-id-ref {
 *                                     type leafref;
 *                                 }
 *                                 leaf member-vnf-index-ref {
 *                                     type string;
 *                                 }
 *                                 leaf vnfd-id-ref {
 *                                     type leafref;
 *                                 }
 *                                 leaf vnfd-connection-point-ref {
 *                                     type string;
 *                                 }
 *                                 list match-attributes {
 *                                     key "id";
 *                                     leaf id {
 *                                         type string;
 *                                     }
 *                                     leaf ip-proto {
 *                                         type uint8;
 *                                     }
 *                                     leaf source-ip-address {
 *                                         type ip-address;
 *                                     }
 *                                     leaf destination-ip-address {
 *                                         type ip-address;
 *                                     }
 *                                     leaf source-port {
 *                                         type port-number;
 *                                     }
 *                                     leaf destination-port {
 *                                         type port-number;
 *                                     }
 *                                 }
 *                             }
 *                         }
 *                         list initial-service-primitive {
 *                             key "seq";
 *                             leaf seq {
 *                                 type uint64;
 *                             }
 *                             leaf name {
 *                                 type string;
 *                             }
 *                             leaf user-defined-script {
 *                                 type string;
 *                             }
 *                             list parameter {
 *                                 key "name";
 *                                 leaf name {
 *                                     type string;
 *                                 }
 *                                 leaf value {
 *                                     type string;
 *                                 }
 *                             }
 *                             uses event-config;
 *                         }
 *                         list terminate-service-primitive {
 *                             key "seq";
 *                             leaf seq {
 *                                 type uint64;
 *                             }
 *                             leaf name {
 *                                 type string;
 *                             }
 *                             leaf user-defined-script {
 *                                 type string;
 *                             }
 *                             list parameter {
 *                                 key "name";
 *                                 leaf name {
 *                                     type string;
 *                                 }
 *                                 leaf value {
 *                                     type string;
 *                                 }
 *                             }
 *                             uses event-config;
 *                         }
 *                         list parameter-pool {
 *                             key "name";
 *                             leaf name {
 *                                 type string;
 *                             }
 *                             container range {
 *                                 leaf start-value {
 *                                     type uint32;
 *                                 }
 *                                 leaf end-value {
 *                                     type uint32;
 *                                 }
 *                             }
 *                         }
 *                         list key-pair {
 *                             key "name";
 *                             leaf name {
 *                                 type string;
 *                             }
 *                             leaf akey {
 *                                 type string;
 *                             }
 *                         }
 *                         list user {
 *                             key "name";
 *                             leaf name {
 *                                 type string;
 *                             }
 *                             leaf user-info {
 *                                 type string;
 *                             }
 *                             list key-pair {
 *                                 key "name";
 *                                 leaf name {
 *                                     type string;
 *                                 }
 *                                 leaf akey {
 *                                     type string;
 *                                 }
 *                             }
 *                         }
 *                         list input-parameter-xpath {
 *                             key "xpath";
 *                             leaf xpath {
 *                                 type string;
 *                             }
 *                             leaf label {
 *                                 type string;
 *                             }
 *                             leaf default-value {
 *                                 type string;
 *                             }
 *                         }
 *                         list ip-profiles {
 *                             key "name";
 *                             leaf name {
 *                                 type string;
 *                             }
 *                             leaf description {
 *                                 type string;
 *                             }
 *                             container ip-profile-params {
 *                                 leaf ip-version {
 *                                     type ip-version;
 *                                 }
 *                                 leaf subnet-address {
 *                                     type ip-prefix;
 *                                 }
 *                                 leaf gateway-address {
 *                                     type ip-address;
 *                                 }
 *                                 leaf security-group {
 *                                     type string;
 *                                 }
 *                                 list dns-server {
 *                                     key "address";
 *                                     leaf address {
 *                                         type ip-address;
 *                                     }
 *                                 }
 *                                 container dhcp-params {
 *                                     leaf enabled {
 *                                         type enabled;
 *                                     }
 *                                     leaf start-address {
 *                                         type ip-address;
 *                                     }
 *                                     leaf count {
 *                                         type uint32;
 *                                     }
 *                                 }
 *                                 leaf subnet-prefix-pool {
 *                                     type string;
 *                                 }
 *                             }
 *                             uses ip-profile-info;
 *                         }
 *                         list vld {
 *                             key "id";
 *                             list vnfd-connection-point-ref {
 *                                 key "member-vnf-index-ref" "vnfd-connection-point-ref";
 *                                 leaf member-vnf-index-ref {
 *                                     type string;
 *                                 }
 *                                 leaf vnfd-id-ref {
 *                                     type string;
 *                                 }
 *                                 leaf vnfd-connection-point-ref {
 *                                     type leafref;
 *                                 }
 *                             }
 *                             leaf id {
 *                                 type string;
 *                             }
 *                             leaf name {
 *                                 type string;
 *                             }
 *                             leaf short-name {
 *                                 type string;
 *                             }
 *                             leaf vendor {
 *                                 type string;
 *                             }
 *                             leaf description {
 *                                 type string;
 *                             }
 *                             leaf version {
 *                                 type string;
 *                             }
 *                             leaf type {
 *                                 type virtual-link-type;
 *                             }
 *                             leaf root-bandwidth {
 *                                 type uint64;
 *                             }
 *                             leaf leaf-bandwidth {
 *                                 type uint64;
 *                             }
 *                             leaf mgmt-network {
 *                                 type mgmt-network;
 *                             }
 *                             choice init-params {
 *                                 case vim-network-profile {
 *                                     leaf ip-profile-ref {
 *                                         type string;
 *                                     }
 *                                 }
 *                                 case vim-network-ref {
 *                                     leaf vim-network-name {
 *                                         type string;
 *                                     }
 *                                 }
 *                             }
 *                             container provider-network {
 *                                 leaf physical-network {
 *                                     type string;
 *                                 }
 *                                 leaf segmentation_id {
 *                                     type uint32;
 *                                 }
 *                             }
 *                             uses nsd-vld-common;
 *                         }
 *                         list constituent-vnfd {
 *                             key "member-vnf-index";
 *                             leaf member-vnf-index {
 *                                 type uint64;
 *                             }
 *                             leaf vnfd-id-ref {
 *                                 type leafref;
 *                             }
 *                             leaf start-by-default {
 *                                 type start-by-default;
 *                             }
 *                         }
 *                         list placement-groups {
 *                             key "name";
 *                             list member-vnfd {
 *                                 key "member-vnf-index-ref";
 *                                 leaf member-vnf-index-ref {
 *                                     type string;
 *                                 }
 *                                 leaf vnfd-id-ref {
 *                                     type string;
 *                                 }
 *                             }
 *                             leaf name {
 *                                 type string;
 *                             }
 *                             leaf requirement {
 *                                 type string;
 *                             }
 *                             leaf strategy {
 *                                 type strategy;
 *                             }
 *                             uses placement-group-info;
 *                         }
 *                         list vnf-dependency {
 *                             key "vnf-source-ref";
 *                             leaf vnf-source-ref {
 *                                 type string;
 *                             }
 *                             leaf vnf-depends-on-ref {
 *                                 type string;
 *                             }
 *                         }
 *                         list monitoring-param {
 *                             key "id";
 *                             list vnfd-monitoring-param {
 *                                 key "member-vnf-index-ref" "vnfd-monitoring-param-ref";
 *                                 leaf vnfd-id-ref {
 *                                     type string;
 *                                 }
 *                                 leaf vnfd-monitoring-param-ref {
 *                                     type leafref;
 *                                 }
 *                                 leaf member-vnf-index-ref {
 *                                     type string;
 *                                 }
 *                             }
 *                             leaf id {
 *                                 type string;
 *                             }
 *                             leaf name {
 *                                 type string;
 *                             }
 *                             leaf value-type {
 *                                 type value-type;
 *                             }
 *                             container numeric-constraints {
 *                                 leaf min-value {
 *                                     type uint64;
 *                                 }
 *                                 leaf max-value {
 *                                     type uint64;
 *                                 }
 *                             }
 *                             container text-constraints {
 *                                 leaf min-length {
 *                                     type uint8;
 *                                 }
 *                                 leaf max-length {
 *                                     type uint8;
 *                                 }
 *                             }
 *                             leaf value-integer {
 *                                 type int64;
 *                             }
 *                             leaf value-decimal {
 *                                 type decimal64;
 *                             }
 *                             leaf value-string {
 *                                 type string;
 *                             }
 *                             leaf aggregation-type {
 *                                 type aggregation-type;
 *                             }
 *                             leaf description {
 *                                 type string;
 *                             }
 *                             leaf group-tag {
 *                                 type string;
 *                             }
 *                             leaf widget-type {
 *                                 type widget-type;
 *                             }
 *                             leaf units {
 *                                 type string;
 *                             }
 *                             uses monitoring-param-common;
 *                         }
 *                         list service-primitive {
 *                             key "name";
 *                             leaf name {
 *                                 type string;
 *                             }
 *                             list parameter {
 *                                 key "name";
 *                                 leaf name {
 *                                     type string;
 *                                 }
 *                                 leaf data-type {
 *                                     type parameter-data-type;
 *                                 }
 *                                 leaf mandatory {
 *                                     type mandatory;
 *                                 }
 *                                 leaf default-value {
 *                                     type string;
 *                                 }
 *                                 leaf parameter-pool {
 *                                     type string;
 *                                 }
 *                                 leaf read-only {
 *                                     type read-only;
 *                                 }
 *                                 leaf hidden {
 *                                     type hidden;
 *                                 }
 *                                 uses primitive-parameter;
 *                             }
 *                             list vnf-primitive-group {
 *                                 key "member-vnf-index-ref";
 *                                 leaf member-vnf-index-ref {
 *                                     type string;
 *                                 }
 *                                 leaf vnfd-id-ref {
 *                                     type leafref;
 *                                 }
 *                                 leaf vnfd-name {
 *                                     type leafref;
 *                                 }
 *                                 list primitive {
 *                                     key "index";
 *                                     leaf index {
 *                                         type uint32;
 *                                     }
 *                                     leaf name {
 *                                         type string;
 *                                     }
 *                                 }
 *                             }
 *                             leaf user-defined-script {
 *                                 type string;
 *                             }
 *                             list parameter-group {
 *                                 key "name";
 *                                 leaf name {
 *                                     type string;
 *                                 }
 *                                 list parameter {
 *                                     key "name";
 *                                     leaf name {
 *                                         type string;
 *                                     }
 *                                     leaf data-type {
 *                                         type parameter-data-type;
 *                                     }
 *                                     leaf mandatory {
 *                                         type mandatory;
 *                                     }
 *                                     leaf default-value {
 *                                         type string;
 *                                     }
 *                                     leaf parameter-pool {
 *                                         type string;
 *                                     }
 *                                     leaf read-only {
 *                                         type read-only;
 *                                     }
 *                                     leaf hidden {
 *                                         type hidden;
 *                                     }
 *                                     uses primitive-parameter;
 *                                 }
 *                                 leaf mandatory {
 *                                     type mandatory;
 *                                 }
 *                             }
 *                             uses ui-primitive-group;
 *                         }
 *                         uses nsr-nsd-placement-groups;
 *                         uses nsr-nsd-vld;
 *                         uses nsr-nsd-vnf-dependency;
 *                         uses nsr-nsd-service-primitive;
 *                         uses nsr-nsd-constituent-vnfd;
 *                         uses nsd-descriptor-common;
 *                         uses nsr-nsd-monitoring-param;
 *                     }
 *                     list vnfd-placement-group-maps {
 *                         key "placement-group-ref" "vnfd-id-ref";
 *                         leaf vnfd-id-ref {
 *                             type uuid;
 *                         }
 *                         leaf placement-group-ref {
 *                             type leafref;
 *                         }
 *                         leaf cloud-type {
 *                             type cloud-account-type;
 *                         }
 *                         choice cloud-provider {
 *                             case aws {
 *                                 leaf aws-construct {
 *                                     type empty;
 *                                 }
 *                             }
 *                             case cloudsim {
 *                                 leaf cloudsim-construct {
 *                                     type empty;
 *                                 }
 *                             }
 *                             case mock {
 *                                 leaf mock-construct {
 *                                     type empty;
 *                                 }
 *                             }
 *                             case openmano {
 *                                 leaf openmano-construct {
 *                                     type empty;
 *                                 }
 *                             }
 *                             case openstack {
 *                                 container availability-zone {
 *                                     leaf name {
 *                                         type string;
 *                                     }
 *                                 }
 *                                 container server-group {
 *                                     leaf name {
 *                                         type string;
 *                                     }
 *                                 }
 *                                 list host-aggregate {
 *                                     key "metadata-key";
 *                                     leaf metadata-key {
 *                                         type string;
 *                                     }
 *                                     leaf metadata-value {
 *                                         type string;
 *                                     }
 *                                 }
 *                             }
 *                             case vsphere {
 *                                 leaf vsphere-construct {
 *                                     type empty;
 *                                 }
 *                             }
 *                         }
 *                         uses placement-group-input;
 *                     }
 *                     list ssh-authorized-key {
 *                         key "key-pair-ref";
 *                         leaf key-pair-ref {
 *                             type string;
 *                         }
 *                     }
 *                     list user {
 *                         key "name";
 *                         leaf name {
 *                             type string;
 *                         }
 *                         leaf user-info {
 *                             type string;
 *                         }
 *                         list ssh-authorized-key {
 *                             key "key-pair-ref";
 *                             leaf key-pair-ref {
 *                                 type string;
 *                             }
 *                         }
 *                     }
 *                     list scaling-group {
 *                         key "scaling-group-name-ref";
 *                         leaf scaling-group-name-ref {
 *                             type string;
 *                         }
 *                         list instance {
 *                             key "id";
 *                             leaf id {
 *                                 type uint16;
 *                             }
 *                         }
 *                     }
 *                     list nsd-placement-group-maps {
 *                         key "placement-group-ref";
 *                         leaf placement-group-ref {
 *                             type string;
 *                         }
 *                         leaf cloud-type {
 *                             type cloud-account-type;
 *                         }
 *                         choice cloud-provider {
 *                             case aws {
 *                                 leaf aws-construct {
 *                                     type empty;
 *                                 }
 *                             }
 *                             case cloudsim {
 *                                 leaf cloudsim-construct {
 *                                     type empty;
 *                                 }
 *                             }
 *                             case mock {
 *                                 leaf mock-construct {
 *                                     type empty;
 *                                 }
 *                             }
 *                             case openmano {
 *                                 leaf openmano-construct {
 *                                     type empty;
 *                                 }
 *                             }
 *                             case openstack {
 *                                 container availability-zone {
 *                                     leaf name {
 *                                         type string;
 *                                     }
 *                                 }
 *                                 container server-group {
 *                                     leaf name {
 *                                         type string;
 *                                     }
 *                                 }
 *                                 list host-aggregate {
 *                                     key "metadata-key";
 *                                     leaf metadata-key {
 *                                         type string;
 *                                     }
 *                                     leaf metadata-value {
 *                                         type string;
 *                                     }
 *                                 }
 *                             }
 *                             case vsphere {
 *                                 leaf vsphere-construct {
 *                                     type empty;
 *                                 }
 *                             }
 *                         }
 *                         uses placement-group-input;
 *                     }
 *                     list input-parameter {
 *                         key "xpath";
 *                         leaf xpath {
 *                             type string;
 *                         }
 *                         leaf value {
 *                             type string;
 *                         }
 *                     }
 *                     uses ns-instance-config-params;
 *                 }
 *             }
 *         }
 *         augment \(http://riftio.com/ns/riftware-1.0/rw-project)project {
 *             when "Optional.empty";
 *             status CURRENT;
 *             container nsd-catalog {
 *                 list nsd {
 *                     key "id";
 *                     list constituent-vnfd {
 *                         key "member-vnf-index";
 *                         leaf member-vnf-index {
 *                             type uint64;
 *                         }
 *                         leaf vnfd-id-ref {
 *                             type leafref;
 *                         }
 *                         leaf start-by-default {
 *                             type start-by-default;
 *                         }
 *                     }
 *                     list vnf-dependency {
 *                         key "vnf-source-ref";
 *                         leaf vnf-source-ref {
 *                             type string;
 *                         }
 *                         leaf vnf-depends-on-ref {
 *                             type string;
 *                         }
 *                     }
 *                     list placement-groups {
 *                         key "name";
 *                         list member-vnfd {
 *                             key "member-vnf-index-ref";
 *                             leaf member-vnf-index-ref {
 *                                 type string;
 *                             }
 *                             leaf vnfd-id-ref {
 *                                 type string;
 *                             }
 *                         }
 *                         leaf name {
 *                             type string;
 *                         }
 *                         leaf requirement {
 *                             type string;
 *                         }
 *                         leaf strategy {
 *                             type strategy;
 *                         }
 *                         uses placement-group-info;
 *                     }
 *                     list vld {
 *                         key "id";
 *                         list vnfd-connection-point-ref {
 *                             key "member-vnf-index-ref" "vnfd-connection-point-ref";
 *                             leaf member-vnf-index-ref {
 *                                 type string;
 *                             }
 *                             leaf vnfd-id-ref {
 *                                 type leafref;
 *                             }
 *                             leaf vnfd-connection-point-ref {
 *                                 type leafref;
 *                             }
 *                         }
 *                         leaf id {
 *                             type string;
 *                         }
 *                         leaf name {
 *                             type string;
 *                         }
 *                         leaf short-name {
 *                             type string;
 *                         }
 *                         leaf vendor {
 *                             type string;
 *                         }
 *                         leaf description {
 *                             type string;
 *                         }
 *                         leaf version {
 *                             type string;
 *                         }
 *                         leaf type {
 *                             type virtual-link-type;
 *                         }
 *                         leaf root-bandwidth {
 *                             type uint64;
 *                         }
 *                         leaf leaf-bandwidth {
 *                             type uint64;
 *                         }
 *                         leaf mgmt-network {
 *                             type mgmt-network;
 *                         }
 *                         choice init-params {
 *                             case vim-network-profile {
 *                                 leaf ip-profile-ref {
 *                                     type string;
 *                                 }
 *                             }
 *                             case vim-network-ref {
 *                                 leaf vim-network-name {
 *                                     type string;
 *                                 }
 *                             }
 *                         }
 *                         container provider-network {
 *                             leaf physical-network {
 *                                 type string;
 *                             }
 *                             leaf segmentation_id {
 *                                 type uint32;
 *                             }
 *                         }
 *                         uses nsd-vld-common;
 *                     }
 *                     list monitoring-param {
 *                         key "id";
 *                         list vnfd-monitoring-param {
 *                             key "member-vnf-index-ref" "vnfd-monitoring-param-ref";
 *                             leaf vnfd-id-ref {
 *                                 type leafref;
 *                             }
 *                             leaf vnfd-monitoring-param-ref {
 *                                 type leafref;
 *                             }
 *                             leaf member-vnf-index-ref {
 *                                 type string;
 *                             }
 *                         }
 *                         leaf id {
 *                             type string;
 *                         }
 *                         leaf name {
 *                             type string;
 *                         }
 *                         leaf value-type {
 *                             type value-type;
 *                         }
 *                         container numeric-constraints {
 *                             leaf min-value {
 *                                 type uint64;
 *                             }
 *                             leaf max-value {
 *                                 type uint64;
 *                             }
 *                         }
 *                         container text-constraints {
 *                             leaf min-length {
 *                                 type uint8;
 *                             }
 *                             leaf max-length {
 *                                 type uint8;
 *                             }
 *                         }
 *                         leaf value-integer {
 *                             type int64;
 *                         }
 *                         leaf value-decimal {
 *                             type decimal64;
 *                         }
 *                         leaf value-string {
 *                             type string;
 *                         }
 *                         leaf aggregation-type {
 *                             type aggregation-type;
 *                         }
 *                         leaf description {
 *                             type string;
 *                         }
 *                         leaf group-tag {
 *                             type string;
 *                         }
 *                         leaf widget-type {
 *                             type widget-type;
 *                         }
 *                         leaf units {
 *                             type string;
 *                         }
 *                         uses monitoring-param-common;
 *                     }
 *                     list service-primitive {
 *                         key "name";
 *                         leaf name {
 *                             type string;
 *                         }
 *                         list parameter {
 *                             key "name";
 *                             leaf name {
 *                                 type string;
 *                             }
 *                             leaf data-type {
 *                                 type parameter-data-type;
 *                             }
 *                             leaf mandatory {
 *                                 type mandatory;
 *                             }
 *                             leaf default-value {
 *                                 type string;
 *                             }
 *                             leaf parameter-pool {
 *                                 type string;
 *                             }
 *                             leaf read-only {
 *                                 type read-only;
 *                             }
 *                             leaf hidden {
 *                                 type hidden;
 *                             }
 *                             uses primitive-parameter;
 *                         }
 *                         list vnf-primitive-group {
 *                             key "member-vnf-index-ref";
 *                             leaf member-vnf-index-ref {
 *                                 type string;
 *                             }
 *                             leaf vnfd-id-ref {
 *                                 type leafref;
 *                             }
 *                             leaf vnfd-name {
 *                                 type leafref;
 *                             }
 *                             list primitive {
 *                                 key "index";
 *                                 leaf index {
 *                                     type uint32;
 *                                 }
 *                                 leaf name {
 *                                     type string;
 *                                 }
 *                             }
 *                         }
 *                         leaf user-defined-script {
 *                             type string;
 *                         }
 *                         list parameter-group {
 *                             key "name";
 *                             leaf name {
 *                                 type string;
 *                             }
 *                             list parameter {
 *                                 key "name";
 *                                 leaf name {
 *                                     type string;
 *                                 }
 *                                 leaf data-type {
 *                                     type parameter-data-type;
 *                                 }
 *                                 leaf mandatory {
 *                                     type mandatory;
 *                                 }
 *                                 leaf default-value {
 *                                     type string;
 *                                 }
 *                                 leaf parameter-pool {
 *                                     type string;
 *                                 }
 *                                 leaf read-only {
 *                                     type read-only;
 *                                 }
 *                                 leaf hidden {
 *                                     type hidden;
 *                                 }
 *                                 uses primitive-parameter;
 *                             }
 *                             leaf mandatory {
 *                                 type mandatory;
 *                             }
 *                         }
 *                         uses ui-primitive-group;
 *                     }
 *                     leaf id {
 *                         type string;
 *                     }
 *                     leaf name {
 *                         type string;
 *                     }
 *                     leaf short-name {
 *                         type string;
 *                     }
 *                     leaf vendor {
 *                         type string;
 *                     }
 *                     leaf logo {
 *                         type string;
 *                     }
 *                     leaf description {
 *                         type string;
 *                     }
 *                     leaf version {
 *                         type string;
 *                     }
 *                     list connection-point {
 *                         key "name";
 *                         leaf name {
 *                             type string;
 *                         }
 *                         leaf type {
 *                             type connection-point-type;
 *                         }
 *                     }
 *                     list scaling-group-descriptor {
 *                         key "name";
 *                         leaf name {
 *                             type string;
 *                         }
 *                         list scaling-policy {
 *                             key "name";
 *                             leaf name {
 *                                 type string;
 *                             }
 *                             leaf scaling-type {
 *                                 type scaling-policy-type;
 *                             }
 *                             leaf enabled {
 *                                 type enabled;
 *                             }
 *                             leaf scale-in-operation-type {
 *                                 type scale-in-operation-type;
 *                             }
 *                             leaf scale-out-operation-type {
 *                                 type scale-out-operation-type;
 *                             }
 *                             leaf threshold-time {
 *                                 type uint32;
 *                             }
 *                             leaf cooldown-time {
 *                                 type uint32;
 *                             }
 *                             list scaling-criteria {
 *                                 key "name";
 *                                 leaf name {
 *                                     type string;
 *                                 }
 *                                 leaf scale-in-threshold {
 *                                     type uint64;
 *                                 }
 *                                 leaf scale-out-threshold {
 *                                     type uint64;
 *                                 }
 *                                 leaf ns-monitoring-param-ref {
 *                                     type string;
 *                                 }
 *                             }
 *                         }
 *                         list vnfd-member {
 *                             key "member-vnf-index-ref";
 *                             leaf member-vnf-index-ref {
 *                                 type string;
 *                             }
 *                             leaf count {
 *                                 type count;
 *                             }
 *                         }
 *                         leaf min-instance-count {
 *                             type min-instance-count;
 *                         }
 *                         leaf max-instance-count {
 *                             type max-instance-count;
 *                         }
 *                         list scaling-config-action {
 *                             key "trigger";
 *                             leaf trigger {
 *                                 type scaling-trigger;
 *                             }
 *                             leaf ns-service-primitive-name-ref {
 *                                 type string;
 *                             }
 *                         }
 *                     }
 *                     list vnffgd {
 *                         key "id";
 *                         leaf id {
 *                             type string;
 *                         }
 *                         leaf name {
 *                             type string;
 *                         }
 *                         leaf short-name {
 *                             type string;
 *                         }
 *                         leaf vendor {
 *                             type string;
 *                         }
 *                         leaf description {
 *                             type string;
 *                         }
 *                         leaf version {
 *                             type string;
 *                         }
 *                         list rsp {
 *                             key "id";
 *                             leaf id {
 *                                 type string;
 *                             }
 *                             leaf name {
 *                                 type string;
 *                             }
 *                             list vnfd-connection-point-ref {
 *                                 key "member-vnf-index-ref";
 *                                 leaf member-vnf-index-ref {
 *                                     type string;
 *                                 }
 *                                 leaf order {
 *                                     type uint8;
 *                                 }
 *                                 leaf vnfd-id-ref {
 *                                     type leafref;
 *                                 }
 *                                 leaf vnfd-connection-point-ref {
 *                                     type string;
 *                                 }
 *                             }
 *                         }
 *                         list classifier {
 *                             key "id";
 *                             leaf id {
 *                                 type string;
 *                             }
 *                             leaf name {
 *                                 type string;
 *                             }
 *                             leaf rsp-id-ref {
 *                                 type leafref;
 *                             }
 *                             leaf member-vnf-index-ref {
 *                                 type string;
 *                             }
 *                             leaf vnfd-id-ref {
 *                                 type leafref;
 *                             }
 *                             leaf vnfd-connection-point-ref {
 *                                 type string;
 *                             }
 *                             list match-attributes {
 *                                 key "id";
 *                                 leaf id {
 *                                     type string;
 *                                 }
 *                                 leaf ip-proto {
 *                                     type uint8;
 *                                 }
 *                                 leaf source-ip-address {
 *                                     type ip-address;
 *                                 }
 *                                 leaf destination-ip-address {
 *                                     type ip-address;
 *                                 }
 *                                 leaf source-port {
 *                                     type port-number;
 *                                 }
 *                                 leaf destination-port {
 *                                     type port-number;
 *                                 }
 *                             }
 *                         }
 *                     }
 *                     list initial-service-primitive {
 *                         key "seq";
 *                         leaf seq {
 *                             type uint64;
 *                         }
 *                         leaf name {
 *                             type string;
 *                         }
 *                         leaf user-defined-script {
 *                             type string;
 *                         }
 *                         list parameter {
 *                             key "name";
 *                             leaf name {
 *                                 type string;
 *                             }
 *                             leaf value {
 *                                 type string;
 *                             }
 *                         }
 *                         uses event-config;
 *                     }
 *                     list terminate-service-primitive {
 *                         key "seq";
 *                         leaf seq {
 *                             type uint64;
 *                         }
 *                         leaf name {
 *                             type string;
 *                         }
 *                         leaf user-defined-script {
 *                             type string;
 *                         }
 *                         list parameter {
 *                             key "name";
 *                             leaf name {
 *                                 type string;
 *                             }
 *                             leaf value {
 *                                 type string;
 *                             }
 *                         }
 *                         uses event-config;
 *                     }
 *                     list parameter-pool {
 *                         key "name";
 *                         leaf name {
 *                             type string;
 *                         }
 *                         container range {
 *                             leaf start-value {
 *                                 type uint32;
 *                             }
 *                             leaf end-value {
 *                                 type uint32;
 *                             }
 *                         }
 *                     }
 *                     list key-pair {
 *                         key "name";
 *                         leaf name {
 *                             type string;
 *                         }
 *                         leaf akey {
 *                             type string;
 *                         }
 *                     }
 *                     list user {
 *                         key "name";
 *                         leaf name {
 *                             type string;
 *                         }
 *                         leaf user-info {
 *                             type string;
 *                         }
 *                         list key-pair {
 *                             key "name";
 *                             leaf name {
 *                                 type string;
 *                             }
 *                             leaf akey {
 *                                 type string;
 *                             }
 *                         }
 *                     }
 *                     list input-parameter-xpath {
 *                         key "xpath";
 *                         leaf xpath {
 *                             type string;
 *                         }
 *                         leaf label {
 *                             type string;
 *                         }
 *                         leaf default-value {
 *                             type string;
 *                         }
 *                     }
 *                     list ip-profiles {
 *                         key "name";
 *                         leaf name {
 *                             type string;
 *                         }
 *                         leaf description {
 *                             type string;
 *                         }
 *                         container ip-profile-params {
 *                             leaf ip-version {
 *                                 type ip-version;
 *                             }
 *                             leaf subnet-address {
 *                                 type ip-prefix;
 *                             }
 *                             leaf gateway-address {
 *                                 type ip-address;
 *                             }
 *                             leaf security-group {
 *                                 type string;
 *                             }
 *                             list dns-server {
 *                                 key "address";
 *                                 leaf address {
 *                                     type ip-address;
 *                                 }
 *                             }
 *                             container dhcp-params {
 *                                 leaf enabled {
 *                                     type enabled;
 *                                 }
 *                                 leaf start-address {
 *                                     type ip-address;
 *                                 }
 *                                 leaf count {
 *                                     type uint32;
 *                                 }
 *                             }
 *                             leaf subnet-prefix-pool {
 *                                 type string;
 *                             }
 *                         }
 *                         uses ip-profile-info;
 *                     }
 *                     uses nsd-descriptor;
 *                 }
 *             }
 *         }
 *     }
 * }
 * </pre>
 *
 */
public interface RwProjectData
    extends
    DataRoot
{




    /**
     * Configuration and state for individual projects. RIFT.wareapplications and 
     * projects are expected to augment this list inorder to add configuration for 
     * projects that is specific to theproduct or application. As such, this list 
     * contains minimaldata defined in this yang module.When augmenting this element, 
     * other yang modules should prefer todefine containers with the same name as the 
     * augmenting module.(Augmenting RIFT.ware modules should prefer to augment 
     * withoutthe rw prefix [for new features], or should prefer to augment 
     * theaugmented container of an existing augment, to ease futureadoption and/or 
     * standardization.)
     *
     *
     *
     * @return <code>java.util.List</code> <code>project</code>, or <code>null</code> if not present
     */
    List<Project> getProject();

}

