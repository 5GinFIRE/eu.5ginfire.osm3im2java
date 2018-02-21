package http.riftio.project.nsd.rev170228.nsr.nsd.monitoring.param.monitoring.param;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import http.riftio.project.nsd.rev170228.nsr.nsd.monitoring.param.MonitoringParam;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * A list of VNFD monitoring params
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>project-nsd</b>
 * <pre>
 * list vnfd-monitoring-param {
 *     key "member-vnf-index-ref" "vnfd-monitoring-param-ref";
 *     leaf vnfd-id-ref {
 *         type string;
 *     }
 *     leaf vnfd-monitoring-param-ref {
 *         type leafref;
 *     }
 *     leaf member-vnf-index-ref {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>project-nsd/nsr-nsd-monitoring-param/monitoring-param/vnfd-monitoring-param</i>
 * 
 * <p>To create instances of this class use {@link VnfdMonitoringParamBuilder}.
 * @see VnfdMonitoringParamBuilder
 * @see VnfdMonitoringParamKey
 *
 */
public interface VnfdMonitoringParam
    extends
    ChildOf<MonitoringParam>,
    Augmentable<http.riftio.project.nsd.rev170228.nsr.nsd.monitoring.param.monitoring.param.VnfdMonitoringParam>,
    Identifiable<VnfdMonitoringParamKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("http://riftio.com/ns/riftware-1.0/project-nsd",
        "2017-02-28", "vnfd-monitoring-param").intern();

    /**
     * A reference to a vnfd. This is a leafref to path: 
     * ../../../../nsd:constituent-vnfd + [nsd:id = current()/../nsd:id-ref] + 
     * /nsd:vnfd-id-ref NOTE: An issue with confd is preventing the use of xpath. Seems
     * to be an issue with leafref to leafref, whose target is in a different module. 
     * Once that is resolved this will switched to use leafref
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vnfdIdRef</code>, or <code>null</code> if not present
     */
    java.lang.String getVnfdIdRef();
    
    /**
     * A reference to the VNFD monitoring param
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>vnfdMonitoringParamRef</code>, or <code>null</code> if not present
     */
    java.lang.Object getVnfdMonitoringParamRef();
    
    /**
     * Optional reference to member-vnf within constituent-vnfds
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
     * @return <code>org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.project.nsd.rev170228.nsr.nsd.monitoring.param.monitoring.param.VnfdMonitoringParamKey</code> <code>key</code>, or <code>null</code> if not present
     */
    VnfdMonitoringParamKey getKey();

}

