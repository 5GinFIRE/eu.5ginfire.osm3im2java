package ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.ietf.inet.types.rev130715.Uri;
import ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.MonitoringParam;
import ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.PlacementGroupInfo;
import ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.VnfOperationalStatus;
import ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.VnfrCatalog;
import ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.CloudConfig;
import ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.ConnectionPoint;
import ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.InternalVlr;
import ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.MgmtInterface;
import ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.Vdur;
import ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.VnfConfiguration;
import ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.Vnfd;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

import java.math.BigInteger;
import java.util.List;

/**
 * Virtual Network Function Record (VNFR).
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfr</b>
 * <pre>
 * list vnfr {
 *     key "id";
 *     leaf id {
 *         type uuid;
 *     }
 *     leaf nsr-id-ref {
 *         type uuid;
 *     }
 *     leaf member-vnf-index-ref {
 *         type leafref;
 *     }
 *     leaf dashboard-url {
 *         type uri;
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
 *     leaf description {
 *         type string;
 *     }
 *     leaf version {
 *         type string;
 *     }
 *     leaf create-time {
 *         type uint32;
 *     }
 *     leaf uptime {
 *         type uint32;
 *     }
 *     container vnfd {
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
 *     leaf vnfd-ref {
 *         type leafref;
 *     }
 *     container vnf-configuration {
 *         choice config-method {
 *             case juju {
 *                 container juju {
 *                     leaf charm {
 *                         type string;
 *                     }
 *                     leaf proxy {
 *                         type proxy;
 *                     }
 *                     container vca-relationships {
 *                         list relation {
 *                             key "requires" "provides";
 *                             leaf requires {
 *                                 type string;
 *                             }
 *                             leaf provides {
 *                                 type string;
 *                             }
 *                         }
 *                     }
 *                     uses vca-relationships;
 *                 }
 *             }
 *             case script {
 *                 container script {
 *                     leaf script-type {
 *                         type enumeration;
 *                     }
 *                 }
 *             }
 *         }
 *         list config-primitive {
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
 *             leaf user-defined-script {
 *                 type string;
 *             }
 *         }
 *         list initial-config-primitive {
 *             key "seq";
 *             leaf seq {
 *                 type uint64;
 *             }
 *             choice primitive-type {
 *                 case primitive-definition {
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
 *                 }
 *             }
 *         }
 *         uses vca-configuration;
 *     }
 *     container mgmt-interface {
 *         leaf ip-address {
 *             type ip-address;
 *         }
 *         leaf port {
 *             type port-number;
 *         }
 *         container ssh-key {
 *             leaf public-key {
 *                 type string;
 *             }
 *             leaf private-key-file {
 *                 type string;
 *             }
 *         }
 *     }
 *     list internal-vlr {
 *         key "vlr-ref";
 *         leaf vlr-ref {
 *             type leafref;
 *         }
 *         leaf-list internal-connection-point-ref {
 *             type string;
 *         }
 *     }
 *     list connection-point {
 *         key "name";
 *         leaf name {
 *             type string;
 *         }
 *         leaf id {
 *             type string;
 *         }
 *         leaf short-name {
 *             type string;
 *         }
 *         leaf type {
 *             type connection-point-type;
 *         }
 *         leaf port-security-enabled {
 *             type boolean;
 *         }
 *         leaf vlr-ref {
 *             type leafref;
 *         }
 *         leaf ip-address {
 *             type ip-address;
 *         }
 *         leaf mac-address {
 *             type string;
 *         }
 *         leaf connection-point-id {
 *             type string;
 *         }
 *         list virtual-cps {
 *             key "name";
 *             leaf ip-address {
 *                 type ip-address;
 *             }
 *             leaf mac-address {
 *                 type string;
 *             }
 *             leaf connection-point-id {
 *                 type string;
 *             }
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
 *         uses common-connection-point;
 *         uses associated-virtual-cps;
 *     }
 *     list vdur {
 *         key "id";
 *         leaf id {
 *             type uuid;
 *         }
 *         leaf name {
 *             type string;
 *         }
 *         leaf unique-short-name {
 *             type string;
 *         }
 *         leaf vdu-id-ref {
 *             type leafref;
 *         }
 *         leaf vim-id {
 *             type string;
 *         }
 *         leaf flavor-id {
 *             type string;
 *         }
 *         leaf image-id {
 *             type string;
 *         }
 *         leaf management-ip {
 *             type ip-address;
 *         }
 *         leaf vm-management-ip {
 *             type ip-address;
 *         }
 *         leaf console-url {
 *             type uri;
 *         }
 *         container vm-flavor {
 *             leaf vcpu-count {
 *                 type uint16;
 *             }
 *             leaf memory-mb {
 *                 type uint64;
 *             }
 *             leaf storage-gb {
 *                 type uint64;
 *             }
 *         }
 *         container guest-epa {
 *             leaf trusted-execution {
 *                 type boolean;
 *             }
 *             leaf mempage-size {
 *                 type enumeration;
 *             }
 *             leaf cpu-pinning-policy {
 *                 type cpu-pinning-policy;
 *             }
 *             leaf cpu-thread-pinning-policy {
 *                 type enumeration;
 *             }
 *             list pcie-device {
 *                 key "device-id";
 *                 leaf device-id {
 *                     type string;
 *                 }
 *                 leaf count {
 *                     type uint64;
 *                 }
 *             }
 *             choice numa-policy {
 *                 case numa-aware {
 *                     container numa-node-policy {
 *                         leaf node-cnt {
 *                             type uint16;
 *                         }
 *                         leaf mem-policy {
 *                             type enumeration;
 *                         }
 *                         list node {
 *                             key "id";
 *                             leaf id {
 *                                 type uint64;
 *                             }
 *                             list vcpu {
 *                                 key "id";
 *                                 leaf id {
 *                                     type uint64;
 *                                 }
 *                             }
 *                             leaf memory-mb {
 *                                 type uint64;
 *                             }
 *                             choice om-numa-type {
 *                                 case cores {
 *                                     leaf num-cores {
 *                                         type uint8;
 *                                     }
 *                                 }
 *                                 case paired-threads {
 *                                     container paired-threads {
 *                                         leaf num-paired-threads {
 *                                             type uint8;
 *                                         }
 *                                         list paired-thread-ids {
 *                                             key "thread-a";
 *                                             leaf thread-a {
 *                                                 type uint8;
 *                                             }
 *                                             leaf thread-b {
 *                                                 type uint8;
 *                                             }
 *                                         }
 *                                     }
 *                                 }
 *                                 case threads {
 *                                     leaf num-threads {
 *                                         type uint8;
 *                                     }
 *                                 }
 *                             }
 *                         }
 *                     }
 *                 }
 *                 case numa-unaware {
 *                     leaf numa-unaware {
 *                         type empty;
 *                     }
 *                 }
 *             }
 *         }
 *         container vswitch-epa {
 *             leaf ovs-acceleration {
 *                 type enumeration;
 *             }
 *             leaf ovs-offload {
 *                 type enumeration;
 *             }
 *         }
 *         container hypervisor-epa {
 *             leaf type {
 *                 type enumeration;
 *             }
 *             leaf version {
 *                 type string;
 *             }
 *         }
 *         container host-epa {
 *             leaf cpu-model {
 *                 type enumeration;
 *             }
 *             leaf cpu-arch {
 *                 type enumeration;
 *             }
 *             leaf cpu-vendor {
 *                 type enumeration;
 *             }
 *             leaf cpu-socket-count {
 *                 type uint64;
 *             }
 *             leaf cpu-core-count {
 *                 type uint64;
 *             }
 *             leaf cpu-core-thread-count {
 *                 type uint64;
 *             }
 *             list cpu-feature {
 *                 key "feature";
 *                 leaf feature {
 *                     type cpu-feature-type;
 *                 }
 *             }
 *             leaf om-cpu-model-string {
 *                 type string;
 *             }
 *             list om-cpu-feature {
 *                 key "feature";
 *                 leaf feature {
 *                     type string;
 *                 }
 *             }
 *         }
 *         container supplemental-boot-data {
 *             leaf boot-data-drive {
 *                 type boot-data-drive;
 *             }
 *             list config-file {
 *                 key "source";
 *                 leaf source {
 *                     type string;
 *                 }
 *                 leaf dest {
 *                     type string;
 *                 }
 *             }
 *             uses config-file;
 *         }
 *         container vdu-configuration {
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
 *         list volumes {
 *             key "name";
 *             leaf name {
 *                 type string;
 *             }
 *             leaf volume-id {
 *                 type string;
 *             }
 *             leaf description {
 *                 type string;
 *             }
 *             leaf size {
 *                 type uint64;
 *             }
 *             choice volume-source {
 *                 case ephemeral {
 *                     leaf ephemeral {
 *                         type empty;
 *                     }
 *                 }
 *                 case image {
 *                     leaf image {
 *                         type string;
 *                     }
 *                     leaf image-checksum {
 *                         type string;
 *                     }
 *                 }
 *             }
 *             leaf device-bus {
 *                 type enumeration;
 *             }
 *             leaf device-type {
 *                 type enumeration;
 *             }
 *             uses volume-info;
 *         }
 *         list internal-connection-point {
 *             key "id";
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
 *             leaf ip-address {
 *                 type ip-address;
 *             }
 *             leaf mac-address {
 *                 type string;
 *             }
 *             leaf connection-point-id {
 *                 type string;
 *             }
 *             list virtual-cps {
 *                 key "name";
 *                 leaf ip-address {
 *                     type ip-address;
 *                 }
 *                 leaf mac-address {
 *                     type string;
 *                 }
 *                 leaf connection-point-id {
 *                     type string;
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
 *             uses common-connection-point;
 *             uses associated-virtual-cps;
 *         }
 *         list interface {
 *             key "name";
 *             leaf name {
 *                 type string;
 *             }
 *             leaf position {
 *                 type uint32;
 *             }
 *             leaf type {
 *                 type type;
 *             }
 *             choice connection-point-type {
 *                 case external {
 *                     leaf external-connection-point-ref {
 *                         type string;
 *                     }
 *                 }
 *                 case internal {
 *                     leaf internal-connection-point-ref {
 *                         type string;
 *                     }
 *                 }
 *             }
 *             container virtual-interface {
 *                 leaf type {
 *                     type enumeration;
 *                 }
 *                 leaf bandwidth {
 *                     type uint64;
 *                 }
 *                 leaf ovs-offload {
 *                     type enumeration;
 *                 }
 *                 leaf vendor-id {
 *                     type string;
 *                 }
 *                 leaf datapath-library {
 *                     type string;
 *                 }
 *                 leaf provider-network-name {
 *                     type string;
 *                 }
 *             }
 *             uses virtual-interface;
 *         }
 *         leaf operational-status {
 *             type vdu-operational-status;
 *         }
 *         list placement-groups-info {
 *             key "name";
 *             leaf name {
 *                 type string;
 *             }
 *             leaf requirement {
 *                 type string;
 *             }
 *             leaf strategy {
 *                 type strategy;
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
 *             uses placement-group-info;
 *             uses placement-group-input;
 *         }
 *         uses guest-epa;
 *         uses supplemental-boot-data;
 *         uses host-epa;
 *         uses vm-flavor;
 *         uses vswitch-epa;
 *         uses placement-group-info;
 *         uses hypervisor-epa;
 *     }
 *     list http-endpoint {
 *         key "path";
 *         leaf path {
 *             type string;
 *         }
 *         leaf https {
 *             type https;
 *         }
 *         leaf port {
 *             type port-number;
 *         }
 *         leaf username {
 *             type string;
 *         }
 *         leaf password {
 *             type string;
 *         }
 *         leaf polling-interval-secs {
 *             type polling-interval-secs;
 *         }
 *         leaf method {
 *             type method;
 *         }
 *         list headers {
 *             key "akey";
 *             leaf akey {
 *                 type string;
 *             }
 *             leaf value {
 *                 type string;
 *             }
 *         }
 *     }
 *     list monitoring-param {
 *         key "id";
 *         leaf id {
 *             type string;
 *         }
 *         leaf name {
 *             type string;
 *         }
 *         leaf http-endpoint-ref {
 *             type leafref;
 *         }
 *         leaf json-query-method {
 *             type json-query-method;
 *         }
 *         container json-query-params {
 *             leaf json-path {
 *                 type string;
 *             }
 *             leaf object-path {
 *                 type string;
 *             }
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
 *         uses monitoring-param-ui-data;
 *         uses monitoring-param-value;
 *     }
 *     leaf operational-status {
 *         type vnf-operational-status;
 *     }
 *     leaf config-status {
 *         type enumeration;
 *     }
 *     list placement-groups-info {
 *         key "name";
 *         leaf name {
 *             type string;
 *         }
 *         leaf requirement {
 *             type string;
 *         }
 *         leaf strategy {
 *             type strategy;
 *         }
 *         leaf cloud-type {
 *             type cloud-account-type;
 *         }
 *         choice cloud-provider {
 *             case aws {
 *                 leaf aws-construct {
 *                     type empty;
 *                 }
 *             }
 *             case cloudsim {
 *                 leaf cloudsim-construct {
 *                     type empty;
 *                 }
 *             }
 *             case mock {
 *                 leaf mock-construct {
 *                     type empty;
 *                 }
 *             }
 *             case openmano {
 *                 leaf openmano-construct {
 *                     type empty;
 *                 }
 *             }
 *             case openstack {
 *                 container availability-zone {
 *                     leaf name {
 *                         type string;
 *                     }
 *                 }
 *                 container server-group {
 *                     leaf name {
 *                         type string;
 *                     }
 *                 }
 *                 list host-aggregate {
 *                     key "metadata-key";
 *                     leaf metadata-key {
 *                         type string;
 *                     }
 *                     leaf metadata-value {
 *                         type string;
 *                     }
 *                 }
 *             }
 *             case vsphere {
 *                 leaf vsphere-construct {
 *                     type empty;
 *                 }
 *             }
 *         }
 *         uses placement-group-info;
 *         uses placement-group-input;
 *     }
 *     container cloud-config {
 *         list key-pair {
 *             key "name";
 *             leaf name {
 *                 type string;
 *             }
 *             leaf akey {
 *                 type string;
 *             }
 *         }
 *         list user {
 *             key "name";
 *             leaf name {
 *                 type string;
 *             }
 *             leaf user-info {
 *                 type string;
 *             }
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
 *         uses cloud-config;
 *     }
 *     uses monitoring-param;
 *     uses placement-group-info;
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfr/project/(urn:ietf:params:xml:ns:yang:nfvo:vnfr?revision=2017-02-28)vnfr-catalog/vnfr</i>
 * 
 * <p>To create instances of this class use {@link VnfrBuilder}.
 * @see VnfrBuilder
 * @see VnfrKey
 *
 */
public interface Vnfr
    extends
    ChildOf<VnfrCatalog>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.Vnfr>,
    MonitoringParam,
    PlacementGroupInfo,
    Identifiable<VnfrKey>
{


    public enum ConfigStatus {
        Configuring(1, "configuring"),
        
        Configured(2, "configured"),
        
        Failed(3, "failed"),
        
        ConfigNotNeeded(4, "config-not-needed")
        ;
    
        private static final java.util.Map<java.lang.Integer, ConfigStatus> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, ConfigStatus> b = com.google.common.collect.ImmutableMap.builder();
            for (ConfigStatus enumItem : ConfigStatus.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private ConfigStatus(int value, java.lang.String name) {
            this.value = value;
            this.name = name;
        }
    
        /**
         * Returns the name of the enumeration item as it is specified in the input yang.
         *
         * @return the name of the enumeration item as it is specified in the input yang
         */
        public java.lang.String getName() {
            return name;
        }
    
        /**
         * @return integer value
         */
        public int getIntValue() {
            return value;
        }
    
        /**
         * @param valueArg integer value
         * @return corresponding ConfigStatus item
         */
        public static ConfigStatus forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }

    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:vnfr",
        "2017-02-28", "vnfr").intern();

    /**
     * Identifier for the VNFR.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid</code> <code>id</code>, or <code>null</code> if not present
     */
    Uuid getId();
    
    /**
     * NS instance identifier.This is a leafref /nsr:ns-instance-config/nsr:nsr/nsr:id
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid</code> <code>nsrIdRef</code>, or <code>null</code> if not present
     */
    Uuid getNsrIdRef();
    
    /**
     * Reference to member VNF index in Network service.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>memberVnfIndexRef</code>, or <code>null</code> if not present
     */
    BigInteger getMemberVnfIndexRef();
    
    /**
     * Dashboard URL
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.Uri</code> <code>dashboardUrl</code>, or <code>null</code> if not present
     */
    Uri getDashboardUrl();
    
    /**
     * VNFR name.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    java.lang.String getName();
    
    /**
     * VNFR short name.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>shortName</code>, or <code>null</code> if not present
     */
    java.lang.String getShortName();
    
    /**
     * Vendor of the VNFR.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vendor</code>, or <code>null</code> if not present
     */
    java.lang.String getVendor();
    
    /**
     * Description of the VNFR.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>description</code>, or <code>null</code> if not present
     */
    java.lang.String getDescription();
    
    /**
     * Version of the VNFR
     *
     *
     *
     * @return <code>java.lang.String</code> <code>version</code>, or <code>null</code> if not present
     */
    java.lang.String getVersion();
    
    /**
     * Creation timestamp of this Virtual NetworkFunction. The timestamp is expressed 
     * asseconds since unix epoch - 1970-01-01T00:00:00Z
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>createTime</code>, or <code>null</code> if not present
     */
    java.lang.Long getCreateTime();
    
    /**
     * Active period of this Virtual Network Function.Uptime is expressed in seconds
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>uptime</code>, or <code>null</code> if not present
     */
    java.lang.Long getUptime();
    
    /**
     * VNF descriptor used to instantiate this VNF
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.Vnfd</code> <code>vnfd</code>, or <code>null</code> if not present
     */
    Vnfd getVnfd();
    
    /**
     * Reference to VNFD
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vnfdRef</code>, or <code>null</code> if not present
     */
    java.lang.String getVnfdRef();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.VnfConfiguration</code> <code>vnfConfiguration</code>, or <code>null</code> if not present
     */
    VnfConfiguration getVnfConfiguration();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.MgmtInterface</code> <code>mgmtInterface</code>, or <code>null</code> if not present
     */
    MgmtInterface getMgmtInterface();
    
    /**
     * @return <code>java.util.List</code> <code>internalVlr</code>, or <code>null</code> if not present
     */
    List<InternalVlr> getInternalVlr();
    
    /**
     * List for external connection points. Each VNF has oneor more external connection
     * points. As the nameimplies that external connection points are used 
     * forconnecting the VNF to other VNFs or to external networks.Each VNF exposes 
     * these connection points to theorchestrator. The orchestrator can construct 
     * networkservices by connecting the connection points betweendifferent VNFs. The 
     * NFVO will use VLDs and VNFFGs atthe network service level to construct network 
     * services.
     *
     *
     *
     * @return <code>java.util.List</code> <code>connectionPoint</code>, or <code>null</code> if not present
     */
    List<ConnectionPoint> getConnectionPoint();
    
    /**
     * List of Virtual Deployment Units
     *
     *
     *
     * @return <code>java.util.List</code> <code>vdur</code>, or <code>null</code> if not present
     */
    List<Vdur> getVdur();
    
    /**
     * The operational status of the VNFR instance pre-init : The VNF before Input 
     * Param Substitution. init : The VNF has just started. vl-init-phase : The 
     * internal VLs in the VNF are being instantiated. vm-init-phase : The VMs for VDUs
     * in the VNF are being instantiated. running : The VNF is in running state. 
     * terminate : The VNF is being terminated. vm-terminate-phase : The VMs in the VNF
     * are being terminated. vl-terminate-phase : The internal VLs in the VNF are being
     * terminated. terminated : The VNF is in the terminated state. failed : The VNF 
     * instantiation failed
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.VnfOperationalStatus</code> <code>operationalStatus</code>, or <code>null</code> if not present
     */
    VnfOperationalStatus getOperationalStatus();
    
    /**
     * The configuration status of the NS instanceconfiguring: At least one of the VNFs
     * in this instance is in configuring stateconfigured: All the VNFs in this NS 
     * instance are configured or config-not-needed state
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.Vnfr.ConfigStatus</code> <code>configStatus</code>, or <code>null</code> if not present
     */
    ConfigStatus getConfigStatus();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.CloudConfig</code> <code>cloudConfig</code>, or <code>null</code> if not present
     */
    CloudConfig getCloudConfig();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.VnfrKey</code> <code>key</code>, or <code>null</code> if not present
     */
    VnfrKey getKey();

}

