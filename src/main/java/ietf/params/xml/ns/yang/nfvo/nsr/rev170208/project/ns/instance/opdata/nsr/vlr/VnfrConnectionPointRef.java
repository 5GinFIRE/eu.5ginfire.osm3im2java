package ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.vlr;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.Vlr;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * A list of references to connection points.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list vnfr-connection-point-ref {
 *     key "vnfr-id";
 *     leaf vnfr-id {
 *         type string;
 *     }
 *     leaf connection-point {
 *         type leafref;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/project/(urn:ietf:params:xml:ns:yang:nfvo:nsr?revision=2017-02-08)ns-instance-opdata/nsr/vlr/vnfr-connection-point-ref</i>
 * 
 * <p>To create instances of this class use {@link VnfrConnectionPointRefBuilder}.
 * @see VnfrConnectionPointRefBuilder
 * @see VnfrConnectionPointRefKey
 *
 */
public interface VnfrConnectionPointRef
    extends
    ChildOf<Vlr>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.vlr.VnfrConnectionPointRef>,
    Identifiable<VnfrConnectionPointRefKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsr",
        "2017-02-08", "vnfr-connection-point-ref").intern();

    /**
     * A reference to a vnfr
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vnfrId</code>, or <code>null</code> if not present
     */
    java.lang.String getVnfrId();
    
    /**
     * A reference to a connection point name in a vnfr
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>connectionPoint</code>, or <code>null</code> if not present
     */
    java.lang.Object getConnectionPoint();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.vlr.VnfrConnectionPointRefKey</code> <code>key</code>, or <code>null</code> if not present
     */
    VnfrConnectionPointRefKey getKey();

}

