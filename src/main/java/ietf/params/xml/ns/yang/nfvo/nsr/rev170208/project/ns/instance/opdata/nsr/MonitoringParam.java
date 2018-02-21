package ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.MonitoringParamAggregation;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.MonitoringParamUiData;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.MonitoringParamValue;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.Nsr;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.monitoring.param.VnfrMonParamRef;

import java.util.List;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of NS level params.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list monitoring-param {
 *     key "id";
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
 *     leaf id {
 *         type string;
 *     }
 *     leaf name {
 *         type string;
 *     }
 *     leaf nsd-mon-param-ref {
 *         type leafref;
 *     }
 *     list vnfr-mon-param-ref {
 *         key "vnfr-id-ref" "vnfr-mon-param-ref";
 *         leaf vnfr-id-ref {
 *             type uuid;
 *         }
 *         leaf vnfr-mon-param-ref {
 *             type leafref;
 *         }
 *     }
 *     uses monitoring-param-ui-data;
 *     uses monitoring-param-aggregation;
 *     uses monitoring-param-value;
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/project/(urn:ietf:params:xml:ns:yang:nfvo:nsr?revision=2017-02-08)ns-instance-opdata/nsr/monitoring-param</i>
 * 
 * <p>To create instances of this class use {@link MonitoringParamBuilder}.
 * @see MonitoringParamBuilder
 * @see MonitoringParamKey
 *
 */
public interface MonitoringParam
    extends
    ChildOf<Nsr>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.MonitoringParam>,
    MonitoringParamUiData,
    MonitoringParamAggregation,
    MonitoringParamValue,
    Identifiable<MonitoringParamKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsr",
        "2017-02-08", "monitoring-param").intern();

    /**
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    java.lang.String getId();
    
    /**
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    java.lang.String getName();
    
    /**
     * Reference to the NSD monitoring param descriptorthat produced this result
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>nsdMonParamRef</code>, or <code>null</code> if not present
     */
    java.lang.Object getNsdMonParamRef();
    
    /**
     * A list of VNFR monitoring params associated with this monp
     *
     *
     *
     * @return <code>java.util.List</code> <code>vnfrMonParamRef</code>, or <code>null</code> if not present
     */
    List<VnfrMonParamRef> getVnfrMonParamRef();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.MonitoringParamKey</code> <code>key</code>, or <code>null</code> if not present
     */
    MonitoringParamKey getKey();

}

