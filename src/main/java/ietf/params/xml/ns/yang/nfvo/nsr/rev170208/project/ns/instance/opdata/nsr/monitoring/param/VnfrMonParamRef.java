package ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.monitoring.param;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.MonitoringParam;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * A list of VNFR monitoring params associated with this monp
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list vnfr-mon-param-ref {
 *     key "vnfr-id-ref" "vnfr-mon-param-ref";
 *     leaf vnfr-id-ref {
 *         type uuid;
 *     }
 *     leaf vnfr-mon-param-ref {
 *         type leafref;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/project/(urn:ietf:params:xml:ns:yang:nfvo:nsr?revision=2017-02-08)ns-instance-opdata/nsr/monitoring-param/vnfr-mon-param-ref</i>
 * 
 * <p>To create instances of this class use {@link VnfrMonParamRefBuilder}.
 * @see VnfrMonParamRefBuilder
 * @see VnfrMonParamRefKey
 *
 */
public interface VnfrMonParamRef
    extends
    ChildOf<MonitoringParam>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.monitoring.param.VnfrMonParamRef>,
    Identifiable<VnfrMonParamRefKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsr",
        "2017-02-08", "vnfr-mon-param-ref").intern();

    /**
     * A reference to a vnfr. This is aleafref to path: 
     * /vnfr:vnfr-catalog/vnfr:vnfr/vnfr:id
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid</code> <code>vnfrIdRef</code>, or <code>null</code> if not present
     */
    Uuid getVnfrIdRef();
    
    /**
     * A reference to the VNFR monitoring param
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>vnfrMonParamRef</code>, or <code>null</code> if not present
     */
    java.lang.Object getVnfrMonParamRef();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.monitoring.param.VnfrMonParamRefKey</code> <code>key</code>, or <code>null</code> if not present
     */
    VnfrMonParamRefKey getKey();

}

