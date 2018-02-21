package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.monitoring.param;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.MonitoringParam;

import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * container json-query-params {
 *     leaf json-path {
 *         type string;
 *     }
 *     leaf object-path {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/monitoring-param/monitoring-param/json-query-params</i>
 * 
 * <p>To create instances of this class use {@link JsonQueryParamsBuilder}.
 * @see JsonQueryParamsBuilder
 *
 */
public interface JsonQueryParams
    extends
    ChildOf<MonitoringParam>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.monitoring.param.JsonQueryParams>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2017-02-08", "json-query-params").intern();

    /**
     * The jsonpath to use to extract value from JSON structure
     *
     *
     *
     * @return <code>java.lang.String</code> <code>jsonPath</code>, or <code>null</code> if not present
     */
    java.lang.String getJsonPath();
    
    /**
     * The objectpath to use to extract value from JSON structure
     *
     *
     *
     * @return <code>java.lang.String</code> <code>objectPath</code>, or <code>null</code> if not present
     */
    java.lang.String getObjectPath();

}

