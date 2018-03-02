package ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.Nsr;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.vlr.VnfrConnectionPointRef;

import java.util.List;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list vlr {
 *     key "vlr-ref";
 *     leaf vlr-ref {
 *         type leafref;
 *     }
 *     list vnfr-connection-point-ref {
 *         key "vnfr-id";
 *         leaf vnfr-id {
 *             type string;
 *         }
 *         leaf connection-point {
 *             type leafref;
 *         }
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/project/(urn:ietf:params:xml:ns:yang:nfvo:nsr?revision=2017-02-08)ns-instance-opdata/nsr/vlr</i>
 * 
 * <p>To create instances of this class use {@link VlrBuilder}.
 * @see VlrBuilder
 * @see VlrKey
 *
 */
public interface Vlr
    extends
    ChildOf<Nsr>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.Vlr>,
    Identifiable<VlrKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsr",
        "2017-02-08", "vlr").intern();

    /**
     * Reference to a VLR record in the VLR catalog
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid</code> <code>vlrRef</code>, or <code>null</code> if not present
     */
    Uuid getVlrRef();
    
    /**
     * A list of references to connection points.
     *
     *
     *
     * @return <code>java.util.List</code> <code>vnfrConnectionPointRef</code>, or <code>null</code> if not present
     */
    List<VnfrConnectionPointRef> getVnfrConnectionPointRef();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.VlrKey</code> <code>key</code>, or <code>null</code> if not present
     */
    VlrKey getKey();

}

