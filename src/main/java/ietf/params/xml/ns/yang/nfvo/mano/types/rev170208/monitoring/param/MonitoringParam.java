package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.JsonQueryMethod;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.MonitoringParamUiData;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.MonitoringParamValue;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.MonitoringParamBuilder.MonitoringParamImpl;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.monitoring.param.JsonQueryParams;
import ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.VnfdBuilder.VnfdImpl;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of monitoring parameters at the network service level
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * list monitoring-param {
 *     key "id";
 *     leaf id {
 *         type string;
 *     }
 *     leaf name {
 *         type string;
 *     }
 *     leaf http-endpoint-ref {
 *         type leafref;
 *     }
 *     leaf json-query-method {
 *         type json-query-method;
 *     }
 *     container json-query-params {
 *         leaf json-path {
 *             type string;
 *         }
 *         leaf object-path {
 *             type string;
 *         }
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
 *     uses monitoring-param-ui-data;
 *     uses monitoring-param-value;
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/monitoring-param/monitoring-param</i>
 * 
 * <p>To create instances of this class use {@link MonitoringParamBuilder}.
 * @see MonitoringParamBuilder
 * @see MonitoringParamKey
 *
 */
@JsonDeserialize(as = MonitoringParamImpl.class)
public interface MonitoringParam
    extends
    ChildOf<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.MonitoringParam>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.MonitoringParam>,
    MonitoringParamUiData,
    MonitoringParamValue,
    Identifiable<MonitoringParamKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
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
     * @return <code>java.lang.String</code> <code>httpEndpointRef</code>, or <code>null</code> if not present
     */
    java.lang.String getHttpEndpointRef();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.JsonQueryMethod</code> <code>jsonQueryMethod</code>, or <code>null</code> if not present
     */
    JsonQueryMethod getJsonQueryMethod();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.monitoring.param.JsonQueryParams</code> <code>jsonQueryParams</code>, or <code>null</code> if not present
     */
    JsonQueryParams getJsonQueryParams();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.MonitoringParamKey</code> <code>key</code>, or <code>null</code> if not present
     */
    MonitoringParamKey getKey();

}

