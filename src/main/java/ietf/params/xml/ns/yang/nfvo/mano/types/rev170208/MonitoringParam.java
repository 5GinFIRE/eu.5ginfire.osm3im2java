package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.HttpEndpoint;

import java.util.List;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping monitoring-param {
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
 *         uses monitoring-param-ui-data;
 *         uses monitoring-param-value;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/monitoring-param</i>
 *
 */
public interface MonitoringParam
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2017-02-08", "monitoring-param").intern();

    /**
     * List of http endpoints to be used by monitoring params
     *
     *
     *
     * @return <code>java.util.List</code> <code>httpEndpoint</code>, or <code>null</code> if not present
     */
    List<HttpEndpoint> getHttpEndpoint();
    
    /**
     * List of monitoring parameters at the network service level
     *
     *
     *
     * @return <code>java.util.List</code> <code>monitoringParam</code>, or <code>null</code> if not present
     */
    List<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.MonitoringParam> getMonitoringParam();

}

