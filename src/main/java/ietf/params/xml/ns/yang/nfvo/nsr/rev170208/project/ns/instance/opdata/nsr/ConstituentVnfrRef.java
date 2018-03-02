package ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.Nsr;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of VNFRs that are part of thisnetwork service.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list constituent-vnfr-ref {
 *     key "vnfr-id";
 *     leaf vnfr-id {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/project/(urn:ietf:params:xml:ns:yang:nfvo:nsr?revision=2017-02-08)ns-instance-opdata/nsr/constituent-vnfr-ref</i>
 * 
 * <p>To create instances of this class use {@link ConstituentVnfrRefBuilder}.
 * @see ConstituentVnfrRefBuilder
 * @see ConstituentVnfrRefKey
 *
 */
public interface ConstituentVnfrRef
    extends
    ChildOf<Nsr>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.ConstituentVnfrRef>,
    Identifiable<ConstituentVnfrRefKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsr",
        "2017-02-08", "constituent-vnfr-ref").intern();

    /**
     * Reference to the VNFR idThis should be a leafref to 
     * /vnfr:vnfr-catalog/vnfr:vnfr/vnfr:idBut due to confd bug (RIFT-9451), changing 
     * to string.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vnfrId</code>, or <code>null</code> if not present
     */
    java.lang.String getVnfrId();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.ConstituentVnfrRefKey</code> <code>key</code>, or <code>null</code> if not present
     */
    ConstituentVnfrRefKey getKey();

}

