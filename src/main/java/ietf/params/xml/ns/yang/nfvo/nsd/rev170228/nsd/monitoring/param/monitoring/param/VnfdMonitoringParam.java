package ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.monitoring.param.monitoring.param;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.monitoring.param.MonitoringParam;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * A list of VNFD monitoring params
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd</b>
 * <pre>
 * list vnfd-monitoring-param {
 *     key "member-vnf-index-ref" "vnfd-monitoring-param-ref";
 *     leaf vnfd-id-ref {
 *         type leafref;
 *     }
 *     leaf vnfd-monitoring-param-ref {
 *         type leafref;
 *     }
 *     leaf member-vnf-index-ref {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd/nsd-monitoring-param/monitoring-param/vnfd-monitoring-param</i>
 * 
 * <p>To create instances of this class use {@link VnfdMonitoringParamBuilder}.
 * @see VnfdMonitoringParamBuilder
 * @see VnfdMonitoringParamKey
 *
 */
public interface VnfdMonitoringParam
    extends
    ChildOf<MonitoringParam>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.monitoring.param.monitoring.param.VnfdMonitoringParam>,
    Identifiable<VnfdMonitoringParamKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsd",
        "2017-02-28", "vnfd-monitoring-param").intern();

    /**
     * A reference to a VNFD. This is a leafref
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>vnfdIdRef</code>, or <code>null</code> if not present
     */
    java.lang.Object getVnfdIdRef();
    
    /**
     * A reference to the VNFD monitoring param
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>vnfdMonitoringParamRef</code>, or <code>null</code> if not present
     */
    java.lang.Object getVnfdMonitoringParamRef();
    
    /**
     * Mandatory reference to member-vnf within constituent-vnfds
     *
     *
     *
     * @return <code>java.lang.String</code> <code>memberVnfIndexRef</code>, or <code>null</code> if not present
     */
    java.lang.String getMemberVnfIndexRef();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.monitoring.param.monitoring.param.VnfdMonitoringParamKey</code> <code>key</code>, or <code>null</code> if not present
     */
    VnfdMonitoringParamKey getKey();

}

