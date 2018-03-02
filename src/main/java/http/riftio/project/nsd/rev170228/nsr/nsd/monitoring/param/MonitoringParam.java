package http.riftio.project.nsd.rev170228.nsr.nsd.monitoring.param;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import http.riftio.nsd.base.rev170228.MonitoringParamCommon;
import http.riftio.project.nsd.rev170228.NsrNsdMonitoringParam;
import http.riftio.project.nsd.rev170228.nsr.nsd.monitoring.param.monitoring.param.VnfdMonitoringParam;

import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>project-nsd</b>
 * <pre>
 * list monitoring-param {
 *     key "id";
 *     leaf id {
 *         type string;
 *     }
 *     leaf name {
 *         type string;
 *     }
 *     leaf value-type {
 *         type value-type;
 *     }
 *     container numeric-constraints {
 *         leaf min-value {
 *             type uint64;
 *         }
 *         leaf max-value {
 *             type uint64;
 *         }
 *     }
 *     container text-constraints {
 *         leaf min-length {
 *             type uint8;
 *         }
 *         leaf max-length {
 *             type uint8;
 *         }
 *     }
 *     leaf value-integer {
 *         type int64;
 *     }
 *     leaf value-decimal {
 *         type decimal64;
 *     }
 *     leaf value-string {
 *         type string;
 *     }
 *     leaf aggregation-type {
 *         type aggregation-type;
 *     }
 *     leaf description {
 *         type string;
 *     }
 *     leaf group-tag {
 *         type string;
 *     }
 *     leaf widget-type {
 *         type widget-type;
 *     }
 *     leaf units {
 *         type string;
 *     }
 *     list vnfd-monitoring-param {
 *         key "member-vnf-index-ref" "vnfd-monitoring-param-ref";
 *         leaf vnfd-id-ref {
 *             type string;
 *         }
 *         leaf vnfd-monitoring-param-ref {
 *             type leafref;
 *         }
 *         leaf member-vnf-index-ref {
 *             type string;
 *         }
 *     }
 *     uses monitoring-param-common;
 * }
 * </pre>The schema path to identify an instance is
 * <i>project-nsd/nsr-nsd-monitoring-param/monitoring-param</i>
 * 
 * <p>To create instances of this class use {@link MonitoringParamBuilder}.
 * @see MonitoringParamBuilder
 * @see MonitoringParamKey
 *
 */
public interface MonitoringParam
    extends
    ChildOf<NsrNsdMonitoringParam>,
    Augmentable<http.riftio.project.nsd.rev170228.nsr.nsd.monitoring.param.MonitoringParam>,
    MonitoringParamCommon,
    Identifiable<MonitoringParamKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("http://riftio.com/ns/riftware-1.0/project-nsd",
        "2017-02-28", "monitoring-param").intern();

    /**
     * A list of VNFD monitoring params
     *
     *
     *
     * @return <code>java.util.List</code> <code>vnfdMonitoringParam</code>, or <code>null</code> if not present
     */
    List<VnfdMonitoringParam> getVnfdMonitoringParam();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.project.nsd.rev170228.nsr.nsd.monitoring.param.MonitoringParamKey</code> <code>key</code>, or <code>null</code> if not present
     */
    MonitoringParamKey getKey();

}

