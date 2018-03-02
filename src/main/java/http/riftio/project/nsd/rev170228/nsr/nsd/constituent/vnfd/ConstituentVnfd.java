package http.riftio.project.nsd.rev170228.nsr.nsd.constituent.vnfd;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import http.riftio.project.nsd.rev170228.NsrNsdConstituentVnfd;

import java.math.BigInteger;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of VNFDs that are part of thisnetwork service.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>project-nsd</b>
 * <pre>
 * list constituent-vnfd {
 *     key "member-vnf-index";
 *     leaf member-vnf-index {
 *         type uint64;
 *     }
 *     leaf vnfd-id-ref {
 *         type leafref;
 *     }
 *     leaf start-by-default {
 *         type start-by-default;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>project-nsd/nsr-nsd-constituent-vnfd/constituent-vnfd</i>
 * 
 * <p>To create instances of this class use {@link ConstituentVnfdBuilder}.
 * @see ConstituentVnfdBuilder
 * @see ConstituentVnfdKey
 *
 */
public interface ConstituentVnfd
    extends
    ChildOf<NsrNsdConstituentVnfd>,
    Augmentable<http.riftio.project.nsd.rev170228.nsr.nsd.constituent.vnfd.ConstituentVnfd>,
    Identifiable<ConstituentVnfdKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("http://riftio.com/ns/riftware-1.0/project-nsd",
        "2017-02-28", "constituent-vnfd").intern();

    /**
     * Identifier/index for the VNFD. This separate idis required to ensure that 
     * multiple VNFs can bepart of single NS
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>memberVnfIndex</code>, or <code>null</code> if not present
     */
    BigInteger getMemberVnfIndex();
    
    /**
     * Identifier for the VNFD.
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>vnfdIdRef</code>, or <code>null</code> if not present
     */
    java.lang.Object getVnfdIdRef();
    
    /**
     * VNFD is started as part of the NS instantiation
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>startByDefault</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isStartByDefault();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.project.nsd.rev170228.nsr.nsd.constituent.vnfd.ConstituentVnfdKey</code> <code>key</code>, or <code>null</code> if not present
     */
    ConstituentVnfdKey getKey();

}

