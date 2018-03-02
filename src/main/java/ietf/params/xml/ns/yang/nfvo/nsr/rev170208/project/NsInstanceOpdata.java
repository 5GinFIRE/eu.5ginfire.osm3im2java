package ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.Project3;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.Nsr;

import java.util.List;

import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * container ns-instance-opdata {
 *     list nsr {
 *         key "ns-instance-config-ref";
 *         leaf ns-instance-config-ref {
 *             type leafref;
 *         }
 *         leaf name-ref {
 *             type leafref;
 *         }
 *         leaf nsd-ref {
 *             type leafref;
 *         }
 *         leaf nsd-name-ref {
 *             type leafref;
 *         }
 *         leaf create-time {
 *             type uint32;
 *         }
 *         leaf uptime {
 *             type uint32;
 *         }
 *         list connection-point {
 *             key "name";
 *             leaf name {
 *                 type string;
 *             }
 *             leaf type {
 *                 type connection-point-type;
 *             }
 *         }
 *         list vlr {
 *             key "vlr-ref";
 *             leaf vlr-ref {
 *                 type leafref;
 *             }
 *             list vnfr-connection-point-ref {
 *                 key "vnfr-id";
 *                 leaf vnfr-id {
 *                     type string;
 *                 }
 *                 leaf connection-point {
 *                     type leafref;
 *                 }
 *             }
 *         }
 *         list constituent-vnfr-ref {
 *             key "vnfr-id";
 *             leaf vnfr-id {
 *                 type string;
 *             }
 *         }
 *         list scaling-group-record {
 *             key "scaling-group-name-ref";
 *             leaf scaling-group-name-ref {
 *                 type leafref;
 *             }
 *             list instance {
 *                 key "instance-id";
 *                 leaf instance-id {
 *                     type uint16;
 *                 }
 *                 leaf is-default {
 *                     type boolean;
 *                 }
 *                 leaf op-status {
 *                     type enumeration;
 *                 }
 *                 leaf config-status {
 *                     type config-states;
 *                 }
 *                 leaf error-msg {
 *                     type string;
 *                 }
 *                 leaf create-time {
 *                     type uint32;
 *                 }
 *                 leaf-list vnfrs {
 *                     type leafref;
 *                 }
 *             }
 *         }
 *         list vnffgr {
 *             key "id";
 *             leaf id {
 *                 type uuid;
 *             }
 *             leaf vnffgd-id-ref {
 *                 type leafref;
 *             }
 *             leaf vnffgd-name-ref {
 *                 type leafref;
 *             }
 *             leaf sdn-account {
 *                 type string;
 *             }
 *             leaf cloud-account {
 *                 type string;
 *             }
 *             leaf operational-status {
 *                 type vnffgr-operational-status;
 *             }
 *             list rsp {
 *                 key "id";
 *                 leaf id {
 *                     type uuid;
 *                 }
 *                 leaf name {
 *                     type string;
 *                 }
 *                 leaf rsp-id {
 *                     type uuid;
 *                 }
 *                 leaf vnffgd-rsp-id-ref {
 *                     type leafref;
 *                 }
 *                 leaf vnffgd-rsp-name-ref {
 *                     type leafref;
 *                 }
 *                 leaf classifier-name {
 *                     type string;
 *                 }
 *                 leaf path-id {
 *                     type uint32;
 *                 }
 *                 list vnfr-connection-point-ref {
 *                     key "hop-number";
 *                     leaf hop-number {
 *                         type uint8;
 *                     }
 *                     leaf service-function-type {
 *                         type string;
 *                     }
 *                     leaf member-vnf-index-ref {
 *                         type uint64;
 *                     }
 *                     leaf vnfd-id-ref {
 *                         type string;
 *                     }
 *                     leaf vnfr-id-ref {
 *                         type string;
 *                     }
 *                     leaf vnfr-name-ref {
 *                         type string;
 *                     }
 *                     leaf vnfr-connection-point-ref {
 *                         type leafref;
 *                     }
 *                     leaf service-index {
 *                         type uint8;
 *                     }
 *                     container connection-point-params {
 *                         leaf mgmt-address {
 *                             type ip-address;
 *                         }
 *                         leaf name {
 *                             type string;
 *                         }
 *                         leaf port-id {
 *                             type string;
 *                         }
 *                         leaf vm-id {
 *                             type string;
 *                         }
 *                         leaf address {
 *                             type ip-address;
 *                         }
 *                         leaf port {
 *                             type port-number;
 *                         }
 *                     }
 *                     container service-function-forwarder {
 *                         leaf name {
 *                             type string;
 *                         }
 *                         leaf ip-address {
 *                             type ip-address;
 *                         }
 *                         leaf port {
 *                             type port-number;
 *                         }
 *                     }
 *                 }
 *             }
 *             list classifier {
 *                 key "id";
 *                 leaf id {
 *                     type uuid;
 *                 }
 *                 leaf name {
 *                     type string;
 *                 }
 *                 leaf-list classifier-id {
 *                     type uuid;
 *                 }
 *                 leaf rsp-id-ref {
 *                     type leafref;
 *                 }
 *                 leaf rsp-name {
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
 *                 leaf port-id {
 *                     type string;
 *                 }
 *                 leaf vm-id {
 *                     type string;
 *                 }
 *                 leaf ip-address {
 *                     type string;
 *                 }
 *                 leaf sff-name {
 *                     type string;
 *                 }
 *             }
 *         }
 *         leaf operational-status {
 *             type ns-operational-status;
 *         }
 *         leaf config-status {
 *             type config-states;
 *         }
 *         list service-primitive {
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
 *             list parameter-group {
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
 *                 leaf mandatory {
 *                     type mandatory;
 *                 }
 *             }
 *             list vnf-primitive-group {
 *                 key "member-vnf-index-ref";
 *                 leaf member-vnf-index-ref {
 *                     type uint64;
 *                 }
 *                 leaf vnfd-id-ref {
 *                     type string;
 *                 }
 *                 leaf vnfd-name {
 *                     type string;
 *                 }
 *                 list primitive {
 *                     key "index";
 *                     leaf index {
 *                         type uint32;
 *                     }
 *                     leaf name {
 *                         type string;
 *                     }
 *                 }
 *             }
 *             leaf user-defined-script {
 *                 type string;
 *             }
 *             uses ui-primitive-group;
 *         }
 *         list initial-service-primitive {
 *             key "seq";
 *             leaf seq {
 *                 type uint64;
 *             }
 *             leaf name {
 *                 type string;
 *             }
 *             leaf user-defined-script {
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
 *             uses event-service-primitive;
 *         }
 *         list terminate-service-primitive {
 *             key "seq";
 *             leaf seq {
 *                 type uint64;
 *             }
 *             leaf name {
 *                 type string;
 *             }
 *             leaf user-defined-script {
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
 *             uses event-service-primitive;
 *         }
 *         list monitoring-param {
 *             key "id";
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
 *             leaf aggregation-type {
 *                 type aggregation-type;
 *             }
 *             leaf id {
 *                 type string;
 *             }
 *             leaf name {
 *                 type string;
 *             }
 *             leaf nsd-mon-param-ref {
 *                 type leafref;
 *             }
 *             list vnfr-mon-param-ref {
 *                 key "vnfr-id-ref" "vnfr-mon-param-ref";
 *                 leaf vnfr-id-ref {
 *                     type uuid;
 *                 }
 *                 leaf vnfr-mon-param-ref {
 *                     type leafref;
 *                 }
 *             }
 *             uses monitoring-param-ui-data;
 *             uses monitoring-param-aggregation;
 *             uses monitoring-param-value;
 *         }
 *         list config-agent-job {
 *             key "job-id";
 *             leaf job-id {
 *                 type uint64;
 *             }
 *             leaf job-name {
 *                 type string;
 *             }
 *             leaf job-status {
 *                 type enumeration;
 *             }
 *             leaf triggered-by {
 *                 type trigger-type;
 *             }
 *             leaf create-time {
 *                 type uint32;
 *             }
 *             leaf job-status-details {
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
 *             list parameter-group {
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
 *                 uses primitive-parameter-value;
 *             }
 *             list vnfr {
 *                 key "id";
 *                 leaf id {
 *                     type uuid;
 *                 }
 *                 leaf vnf-job-status {
 *                     type enumeration;
 *                 }
 *                 list primitive {
 *                     key "name";
 *                     leaf name {
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
 *                     leaf execution-id {
 *                         type string;
 *                     }
 *                     leaf execution-status {
 *                         type enumeration;
 *                     }
 *                     leaf execution-error-details {
 *                         type string;
 *                     }
 *                     uses primitive-parameter-value;
 *                 }
 *             }
 *             uses primitive-parameter-value;
 *         }
 *         uses vnffgr;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/project/(urn:ietf:params:xml:ns:yang:nfvo:nsr?revision=2017-02-08)ns-instance-opdata</i>
 * 
 * <p>To create instances of this class use {@link NsInstanceOpdataBuilder}.
 * @see NsInstanceOpdataBuilder
 *
 */
public interface NsInstanceOpdata
    extends
    ChildOf<Project3>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.NsInstanceOpdata>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsr",
        "2017-02-08", "ns-instance-opdata").intern();

    /**
     * @return <code>java.util.List</code> <code>nsr</code>, or <code>null</code> if not present
     */
    List<Nsr> getNsr();

}

