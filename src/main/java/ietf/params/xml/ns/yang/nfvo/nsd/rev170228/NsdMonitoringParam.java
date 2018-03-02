package ietf.params.xml.ns.yang.nfvo.nsd.rev170228;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.monitoring.param.MonitoringParam;

import java.util.List;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd</b>
 * <pre>
 * grouping nsd-monitoring-param {
 *     list monitoring-param {
 *         key "id";
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
 *         uses monitoring-param-common;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd/nsd-monitoring-param</i>
 *
 */
public interface NsdMonitoringParam
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsd",
        "2017-02-28", "nsd-monitoring-param").intern();

    /**
     * @return <code>java.util.List</code> <code>monitoringParam</code>, or <code>null</code> if not present
     */
    List<MonitoringParam> getMonitoringParam();

}

