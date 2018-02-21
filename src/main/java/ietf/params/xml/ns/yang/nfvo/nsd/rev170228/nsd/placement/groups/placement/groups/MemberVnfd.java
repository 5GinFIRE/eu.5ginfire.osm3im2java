package ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.placement.groups.placement.groups;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.placement.groups.PlacementGroups;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of VNFDs that are part of this placement group
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd</b>
 * <pre>
 * list member-vnfd {
 *     key "member-vnf-index-ref";
 *     leaf member-vnf-index-ref {
 *         type string;
 *     }
 *     leaf vnfd-id-ref {
 *         type leafref;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd/nsd-placement-groups/placement-groups/member-vnfd</i>
 * 
 * <p>To create instances of this class use {@link MemberVnfdBuilder}.
 * @see MemberVnfdBuilder
 * @see MemberVnfdKey
 *
 */
public interface MemberVnfd
    extends
    ChildOf<PlacementGroups>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.placement.groups.placement.groups.MemberVnfd>,
    Identifiable<MemberVnfdKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsd",
        "2017-02-28", "member-vnfd").intern();

    /**
     * Member VNF index of this member VNF
     *
     *
     *
     * @return <code>java.lang.String</code> <code>memberVnfIndexRef</code>, or <code>null</code> if not present
     */
    java.lang.String getMemberVnfIndexRef();
    
    /**
     * Identifier for the VNFD.
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>vnfdIdRef</code>, or <code>null</code> if not present
     */
    java.lang.Object getVnfdIdRef();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.placement.groups.placement.groups.MemberVnfdKey</code> <code>key</code>, or <code>null</code> if not present
     */
    MemberVnfdKey getKey();

}

