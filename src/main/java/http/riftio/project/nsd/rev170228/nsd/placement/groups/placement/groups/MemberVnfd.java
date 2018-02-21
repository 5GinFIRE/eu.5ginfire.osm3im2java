package http.riftio.project.nsd.rev170228.nsd.placement.groups.placement.groups;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import http.riftio.project.nsd.rev170228.nsd.placement.groups.PlacementGroups;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of VNFDs that are part of this placement group
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>project-nsd</b>
 * <pre>
 * list member-vnfd {
 *     key "member-vnf-index-ref";
 *     leaf member-vnf-index-ref {
 *         type string;
 *     }
 *     leaf vnfd-id-ref {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>project-nsd/nsd-placement-groups/placement-groups/member-vnfd</i>
 * 
 * <p>To create instances of this class use {@link MemberVnfdBuilder}.
 * @see MemberVnfdBuilder
 * @see MemberVnfdKey
 *
 */
public interface MemberVnfd
    extends
    ChildOf<PlacementGroups>,
    Augmentable<http.riftio.project.nsd.rev170228.nsd.placement.groups.placement.groups.MemberVnfd>,
    Identifiable<MemberVnfdKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("http://riftio.com/ns/riftware-1.0/project-nsd",
        "2017-02-28", "member-vnfd").intern();

    /**
     * member VNF index of this member VNF
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
     * @return <code>java.lang.String</code> <code>vnfdIdRef</code>, or <code>null</code> if not present
     */
    java.lang.String getVnfdIdRef();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.project.nsd.rev170228.nsd.placement.groups.placement.groups.MemberVnfdKey</code> <code>key</code>, or <code>null</code> if not present
     */
    MemberVnfdKey getKey();

}

