package http.riftio.nsd.base.rev170228;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.MonitoringParamAggregation;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.MonitoringParamUiData;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.MonitoringParamValue;

/**
 * List of monitoring parameters from VNF's that should be propogated up into NSR
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd-base</b>
 * <pre>
 * grouping monitoring-param-common {
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
 *     leaf aggregation-type {
 *         type aggregation-type;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd-base/monitoring-param-common</i>
 *
 */
public interface MonitoringParamCommon
    extends
    DataObject,
    MonitoringParamUiData,
    MonitoringParamAggregation,
    MonitoringParamValue
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("http://riftio.com/ns/riftware-1.0/nsd-base",
        "2017-02-28", "monitoring-param-common").intern();

    /**
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    java.lang.String getId();
    
    /**
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    java.lang.String getName();

}

