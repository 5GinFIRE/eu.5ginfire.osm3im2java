package http.riftio.project.vnfd.rev170228.project;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import http.riftio.project.vnfd.rev170228.Project1;
import http.riftio.project.vnfd.rev170228.project.vnfd.catalog.Vnfd;

import java.util.List;

import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Virtual Network Function Descriptor (VNFD).
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>project-vnfd</b>
 * <pre>
 * container vnfd-catalog {
 *     list vnfd {
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
 *         leaf logo {
 *             type string;
 *         }
 *         leaf description {
 *             type string;
 *         }
 *         leaf version {
 *             type string;
 *         }
 *         container vnf-configuration {
 *             choice config-method {
 *                 case juju {
 *                     container juju {
 *                         leaf charm {
 *                             type string;
 *                         }
 *                         leaf proxy {
 *                             type proxy;
 *                         }
 *                         container vca-relationships {
 *                             list relation {
 *                                 key "requires" "provides";
 *                                 leaf requires {
 *                                     type string;
 *                                 }
 *                                 leaf provides {
 *                                     type string;
 *                                 }
 *                             }
 *                         }
 *                         uses vca-relationships;
 *                     }
 *                 }
 *                 case script {
 *                     container script {
 *                         leaf script-type {
 *                             type enumeration;
 *                         }
 *                     }
 *                 }
 *             }
 *             list config-primitive {
 *                 key "name";
 *                 leaf name {
 *                     type string;
 *                 }
 *                 list parameter {
 *                     key "name";
 *                     leaf name {
 *                         type string;
 *                     }
 *                     leaf data-type {
 *                         type parameter-data-type;
 *                     }
 *                     leaf mandatory {
 *                         type mandatory;
 *                     }
 *                     leaf default-value {
 *                         type string;
 *                     }
 *                     leaf parameter-pool {
 *                         type string;
 *                     }
 *                     leaf read-only {
 *                         type read-only;
 *                     }
 *                     leaf hidden {
 *                         type hidden;
 *                     }
 *                     uses primitive-parameter;
 *                 }
 *                 leaf user-defined-script {
 *                     type string;
 *                 }
 *             }
 *             list initial-config-primitive {
 *                 key "seq";
 *                 leaf seq {
 *                     type uint64;
 *                 }
 *                 choice primitive-type {
 *                     case primitive-definition {
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
 *                     }
 *                 }
 *             }
 *             uses vca-configuration;
 *         }
 *         leaf operational-status {
 *             type vnf-operational-status;
 *         }
 *         container mgmt-interface {
 *             choice endpoint-type {
 *                 case cp {
 *                     leaf cp {
 *                         type string;
 *                     }
 *                 }
 *                 case ip {
 *                     leaf ip-address {
 *                         type ip-address;
 *                     }
 *                 }
 *                 case vdu-id {
 *                     leaf vdu-id {
 *                         type string;
 *                     }
 *                 }
 *             }
 *             leaf port {
 *                 type port-number;
 *             }
 *             container dashboard-params {
 *                 leaf path {
 *                     type string;
 *                 }
 *                 leaf https {
 *                     type boolean;
 *                 }
 *                 leaf port {
 *                     type port-number;
 *                 }
 *             }
 *         }
 *         list internal-vld {
 *             key "id";
 *             leaf id {
 *                 type string;
 *             }
 *             leaf name {
 *                 type string;
 *             }
 *             leaf short-name {
 *                 type string;
 *             }
 *             leaf description {
 *                 type string;
 *             }
 *             leaf type {
 *                 type virtual-link-type;
 *             }
 *             leaf root-bandwidth {
 *                 type uint64;
 *             }
 *             leaf leaf-bandwidth {
 *                 type uint64;
 *             }
 *             list internal-connection-point {
 *                 key "id-ref";
 *                 leaf id-ref {
 *                     type string;
 *                 }
 *                 leaf ip-address {
 *                     type ip-address;
 *                 }
 *             }
 *             choice init-params {
 *                 case vim-network-profile {
 *                     leaf ip-profile-ref {
 *                         type string;
 *                     }
 *                 }
 *                 case vim-network-ref {
 *                     leaf vim-network-name {
 *                         type string;
 *                     }
 *                 }
 *             }
 *             container provider-network {
 *                 leaf physical-network {
 *                     type string;
 *                 }
 *                 leaf segmentation_id {
 *                     type uint32;
 *                 }
 *             }
 *             uses provider-network;
 *         }
 *         list connection-point {
 *             key "name";
 *             leaf name {
 *                 type string;
 *             }
 *             leaf id {
 *                 type string;
 *             }
 *             leaf short-name {
 *                 type string;
 *             }
 *             leaf type {
 *                 type connection-point-type;
 *             }
 *             leaf port-security-enabled {
 *                 type boolean;
 *             }
 *             uses common-connection-point;
 *         }
 *         list vdu {
 *             key "id";
 *             leaf id {
 *                 type string;
 *             }
 *             leaf name {
 *                 type string;
 *             }
 *             leaf description {
 *                 type string;
 *             }
 *             leaf count {
 *                 type uint64;
 *             }
 *             leaf mgmt-vpci {
 *                 type string;
 *             }
 *             list alarm {
 *                 key "alarm-id";
 *                 leaf alarm-id {
 *                     type string;
 *                 }
 *                 leaf name {
 *                     type string;
 *                 }
 *                 leaf description {
 *                     type string;
 *                 }
 *                 leaf vdur-id {
 *                     type string;
 *                 }
 *                 container actions {
 *                     list ok {
 *                         key "url";
 *                         leaf url {
 *                             type string;
 *                         }
 *                     }
 *                     list insufficient-data {
 *                         key "url";
 *                         leaf url {
 *                             type string;
 *                         }
 *                     }
 *                     list alarm {
 *                         key "url";
 *                         leaf url {
 *                             type string;
 *                         }
 *                     }
 *                 }
 *                 leaf repeat {
 *                     type repeat;
 *                 }
 *                 leaf enabled {
 *                     type enabled;
 *                 }
 *                 leaf severity {
 *                     type alarm-severity-type;
 *                 }
 *                 leaf metric {
 *                     type alarm-metric-type;
 *                 }
 *                 leaf statistic {
 *                     type alarm-statistic-type;
 *                 }
 *                 leaf operation {
 *                     type alarm-operation-type;
 *                 }
 *                 leaf value {
 *                     type decimal64;
 *                 }
 *                 leaf period {
 *                     type uint32;
 *                 }
 *                 leaf evaluations {
 *                     type uint32;
 *                 }
 *                 uses alarm;
 *             }
 *             list alternative-images {
 *                 key "vim-type";
 *                 leaf vim-type {
 *                     type string;
 *                 }
 *                 leaf image {
 *                     type string;
 *                 }
 *                 leaf image-checksum {
 *                     type string;
 *                 }
 *                 uses image-properties;
 *             }
 *             container vdu-configuration {
 *                 choice config-method {
 *                     case juju {
 *                         container juju {
 *                             leaf charm {
 *                                 type string;
 *                             }
 *                             leaf proxy {
 *                                 type proxy;
 *                             }
 *                             container vca-relationships {
 *                                 list relation {
 *                                     key "requires" "provides";
 *                                     leaf requires {
 *                                         type string;
 *                                     }
 *                                     leaf provides {
 *                                         type string;
 *                                     }
 *                                 }
 *                             }
 *                             uses vca-relationships;
 *                         }
 *                     }
 *                     case script {
 *                         container script {
 *                             leaf script-type {
 *                                 type enumeration;
 *                             }
 *                         }
 *                     }
 *                 }
 *                 list config-primitive {
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
 *                     leaf user-defined-script {
 *                         type string;
 *                     }
 *                 }
 *                 list initial-config-primitive {
 *                     key "seq";
 *                     leaf seq {
 *                         type uint64;
 *                     }
 *                     choice primitive-type {
 *                         case primitive-definition {
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
 *                         }
 *                     }
 *                 }
 *                 uses vca-configuration;
 *             }
 *             choice cloud-init-input {
 *                 case filename {
 *                     leaf cloud-init-file {
 *                         type string;
 *                     }
 *                 }
 *                 case inline {
 *                     leaf cloud-init {
 *                         type string;
 *                     }
 *                 }
 *             }
 *             list internal-connection-point {
 *                 key "id";
 *                 leaf internal-vld-ref {
 *                     type leafref;
 *                 }
 *                 leaf name {
 *                     type string;
 *                 }
 *                 leaf id {
 *                     type string;
 *                 }
 *                 leaf short-name {
 *                     type string;
 *                 }
 *                 leaf type {
 *                     type connection-point-type;
 *                 }
 *                 leaf port-security-enabled {
 *                     type boolean;
 *                 }
 *                 uses common-connection-point;
 *             }
 *             list interface {
 *                 key "name";
 *                 leaf name {
 *                     type string;
 *                 }
 *                 leaf position {
 *                     type uint32;
 *                 }
 *                 leaf type {
 *                     type type;
 *                 }
 *                 leaf mac-address {
 *                     type string;
 *                 }
 *                 choice connection-point-type {
 *                     case external {
 *                         leaf external-connection-point-ref {
 *                             type string;
 *                         }
 *                     }
 *                     case internal {
 *                         leaf internal-connection-point-ref {
 *                             type string;
 *                         }
 *                     }
 *                 }
 *                 container virtual-interface {
 *                     leaf type {
 *                         type type;
 *                     }
 *                     leaf vpci {
 *                         type string;
 *                     }
 *                     leaf bandwidth {
 *                         type uint64;
 *                     }
 *                 }
 *                 uses virtual-interface;
 *             }
 *             list volumes {
 *                 key "name";
 *                 leaf name {
 *                     type string;
 *                 }
 *                 leaf description {
 *                     type string;
 *                 }
 *                 leaf size {
 *                     type uint64;
 *                 }
 *                 choice volume-source {
 *                     case ephemeral {
 *                         leaf ephemeral {
 *                             type empty;
 *                         }
 *                     }
 *                     case image {
 *                         leaf image {
 *                             type string;
 *                         }
 *                         leaf image-checksum {
 *                             type string;
 *                         }
 *                     }
 *                 }
 *                 leaf device-bus {
 *                     type enumeration;
 *                 }
 *                 leaf device-type {
 *                     type enumeration;
 *                 }
 *                 uses volume-info;
 *             }
 *             container vm-flavor {
 *                 leaf vcpu-count {
 *                     type uint16;
 *                 }
 *                 leaf memory-mb {
 *                     type uint64;
 *                 }
 *                 leaf storage-gb {
 *                     type uint64;
 *                 }
 *             }
 *             container guest-epa {
 *                 leaf trusted-execution {
 *                     type boolean;
 *                 }
 *                 leaf mempage-size {
 *                     type enumeration;
 *                 }
 *                 leaf cpu-pinning-policy {
 *                     type cpu-pinning-policy;
 *                 }
 *                 leaf cpu-thread-pinning-policy {
 *                     type enumeration;
 *                 }
 *                 list pcie-device {
 *                     key "device-id";
 *                     leaf device-id {
 *                         type string;
 *                     }
 *                     leaf count {
 *                         type uint64;
 *                     }
 *                 }
 *                 choice numa-policy {
 *                     case numa-aware {
 *                         container numa-node-policy {
 *                             leaf node-cnt {
 *                                 type uint16;
 *                             }
 *                             leaf mem-policy {
 *                                 type enumeration;
 *                             }
 *                             list node {
 *                                 key "id";
 *                                 leaf id {
 *                                     type uint64;
 *                                 }
 *                                 list vcpu {
 *                                     key "id";
 *                                     leaf id {
 *                                         type uint64;
 *                                     }
 *                                 }
 *                                 leaf memory-mb {
 *                                     type uint64;
 *                                 }
 *                                 choice om-numa-type {
 *                                     case cores {
 *                                         leaf num-cores {
 *                                             type uint8;
 *                                         }
 *                                     }
 *                                     case paired-threads {
 *                                         container paired-threads {
 *                                             leaf num-paired-threads {
 *                                                 type uint8;
 *                                             }
 *                                             list paired-thread-ids {
 *                                                 key "thread-a";
 *                                                 leaf thread-a {
 *                                                     type uint8;
 *                                                 }
 *                                                 leaf thread-b {
 *                                                     type uint8;
 *                                                 }
 *                                             }
 *                                         }
 *                                     }
 *                                     case threads {
 *                                         leaf num-threads {
 *                                             type uint8;
 *                                         }
 *                                     }
 *                                 }
 *                             }
 *                         }
 *                     }
 *                     case numa-unaware {
 *                         leaf numa-unaware {
 *                             type empty;
 *                         }
 *                     }
 *                 }
 *             }
 *             container hypervisor-epa {
 *                 leaf type {
 *                     type enumeration;
 *                 }
 *                 leaf version {
 *                     type string;
 *                 }
 *             }
 *             leaf image {
 *                 type string;
 *             }
 *             leaf image-checksum {
 *                 type string;
 *             }
 *             container vswitch-epa {
 *                 leaf ovs-acceleration {
 *                     type enumeration;
 *                 }
 *                 leaf ovs-offload {
 *                     type enumeration;
 *                 }
 *             }
 *             container host-epa {
 *                 leaf cpu-model {
 *                     type enumeration;
 *                 }
 *                 leaf cpu-arch {
 *                     type enumeration;
 *                 }
 *                 leaf cpu-vendor {
 *                     type enumeration;
 *                 }
 *                 leaf cpu-socket-count {
 *                     type uint64;
 *                 }
 *                 leaf cpu-core-count {
 *                     type uint64;
 *                 }
 *                 leaf cpu-core-thread-count {
 *                     type uint64;
 *                 }
 *                 list cpu-feature {
 *                     key "feature";
 *                     leaf feature {
 *                         type cpu-feature-type;
 *                     }
 *                 }
 *                 leaf om-cpu-model-string {
 *                     type string;
 *                 }
 *                 list om-cpu-feature {
 *                     key "feature";
 *                     leaf feature {
 *                         type string;
 *                     }
 *                 }
 *             }
 *             container supplemental-boot-data {
 *                 leaf boot-data-drive {
 *                     type boot-data-drive;
 *                 }
 *                 list config-file {
 *                     key "source";
 *                     leaf source {
 *                         type string;
 *                     }
 *                     leaf dest {
 *                         type string;
 *                     }
 *                 }
 *                 uses config-file;
 *             }
 *             uses guest-epa;
 *             uses supplemental-boot-data;
 *             uses host-epa;
 *             uses vm-flavor;
 *             uses image-properties;
 *             uses vswitch-epa;
 *             uses hypervisor-epa;
 *         }
 *         list vdu-dependency {
 *             key "vdu-source-ref";
 *             leaf vdu-source-ref {
 *                 type string;
 *             }
 *             leaf vdu-depends-on-ref {
 *                 type string;
 *             }
 *         }
 *         leaf service-function-chain {
 *             type service-function-chain;
 *         }
 *         leaf service-function-type {
 *             type string;
 *         }
 *         list placement-groups {
 *             key "name";
 *             list member-vdus {
 *                 key "member-vdu-ref";
 *                 leaf member-vdu-ref {
 *                     type string;
 *                 }
 *             }
 *             leaf name {
 *                 type string;
 *             }
 *             leaf requirement {
 *                 type string;
 *             }
 *             leaf strategy {
 *                 type strategy;
 *             }
 *             uses placement-group-info;
 *         }
 *         list http-endpoint {
 *             key "path";
 *             leaf path {
 *                 type string;
 *             }
 *             leaf https {
 *                 type https;
 *             }
 *             leaf port {
 *                 type port-number;
 *             }
 *             leaf username {
 *                 type string;
 *             }
 *             leaf password {
 *                 type string;
 *             }
 *             leaf polling-interval-secs {
 *                 type polling-interval-secs;
 *             }
 *             leaf method {
 *                 type method;
 *             }
 *             list headers {
 *                 key "akey";
 *                 leaf akey {
 *                     type string;
 *                 }
 *                 leaf value {
 *                     type string;
 *                 }
 *             }
 *         }
 *         list monitoring-param {
 *             key "id";
 *             leaf id {
 *                 type string;
 *             }
 *             leaf name {
 *                 type string;
 *             }
 *             leaf http-endpoint-ref {
 *                 type leafref;
 *             }
 *             leaf json-query-method {
 *                 type json-query-method;
 *             }
 *             container json-query-params {
 *                 leaf json-path {
 *                     type string;
 *                 }
 *                 leaf object-path {
 *                     type string;
 *                 }
 *             }
 *             leaf value-type {
 *                 type value-type;
 *             }
 *             container numeric-constraints {
 *                 leaf min-value {
 *                     type uint64;
 *                 }
 *                 leaf max-value {
 *                     type uint64;
 *                 }
 *             }
 *             container text-constraints {
 *                 leaf min-length {
 *                     type uint8;
 *                 }
 *                 leaf max-length {
 *                     type uint8;
 *                 }
 *             }
 *             leaf value-integer {
 *                 type int64;
 *             }
 *             leaf value-decimal {
 *                 type decimal64;
 *             }
 *             leaf value-string {
 *                 type string;
 *             }
 *             leaf description {
 *                 type string;
 *             }
 *             leaf group-tag {
 *                 type string;
 *             }
 *             leaf widget-type {
 *                 type widget-type;
 *             }
 *             leaf units {
 *                 type string;
 *             }
 *             uses monitoring-param-ui-data;
 *             uses monitoring-param-value;
 *         }
 *         list ip-profiles {
 *             key "name";
 *             leaf name {
 *                 type string;
 *             }
 *             leaf description {
 *                 type string;
 *             }
 *             container ip-profile-params {
 *                 leaf ip-version {
 *                     type ip-version;
 *                 }
 *                 leaf subnet-address {
 *                     type ip-prefix;
 *                 }
 *                 leaf gateway-address {
 *                     type ip-address;
 *                 }
 *                 leaf security-group {
 *                     type string;
 *                 }
 *                 list dns-server {
 *                     key "address";
 *                     leaf address {
 *                         type ip-address;
 *                     }
 *                 }
 *                 container dhcp-params {
 *                     leaf enabled {
 *                         type enabled;
 *                     }
 *                     leaf start-address {
 *                         type ip-address;
 *                     }
 *                     leaf count {
 *                         type uint32;
 *                     }
 *                 }
 *                 leaf subnet-prefix-pool {
 *                     type string;
 *                 }
 *             }
 *             uses ip-profile-info;
 *         }
 *         uses vnfd-descriptor;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>project-vnfd/project/(http://riftio.com/ns/riftware-1.0/project-vnfd?revision=2017-02-28)vnfd-catalog</i>
 * 
 * <p>To create instances of this class use {@link VnfdCatalogBuilder}.
 * @see VnfdCatalogBuilder
 *
 */
public interface VnfdCatalog
    extends
    ChildOf<Project1>,
    Augmentable<http.riftio.project.vnfd.rev170228.project.VnfdCatalog>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("http://riftio.com/ns/riftware-1.0/project-vnfd",
        "2017-02-28", "vnfd-catalog").intern();

    /**
     * @return <code>java.util.List</code> <code>vnfd</code>, or <code>null</code> if not present
     */
    List<Vnfd> getVnfd();

}

