package ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.placement.groups;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PlacementGroupInfo;
import ietf.params.xml.ns.yang.nfvo.nsd.rev170228.NsdPlacementGroups;
import ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.placement.groups.placement.groups.MemberVnfd;

import java.util.List;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of placement groups at NS level
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd</b>
 * <pre>
 * list placement-groups {
 *     key "name";
 *     leaf name {
 *         type string;
 *     }
 *     leaf requirement {
 *         type string;
 *     }
 *     leaf strategy {
 *         type strategy;
 *     }
 *     list member-vnfd {
 *         key "member-vnf-index-ref";
 *         leaf member-vnf-index-ref {
 *             type string;
 *         }
 *         leaf vnfd-id-ref {
 *             type leafref;
 *         }
 *     }
 *     uses placement-group-info;
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd/nsd-placement-groups/placement-groups</i>
 * 
 * <p>To create instances of this class use {@link PlacementGroupsBuilder}.
 * @see PlacementGroupsBuilder
 * @see PlacementGroupsKey
 *
 */
public interface PlacementGroups
    extends
    ChildOf<NsdPlacementGroups>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.placement.groups.PlacementGroups>,
    PlacementGroupInfo,
    Identifiable<PlacementGroupsKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsd",
        "2017-02-28", "placement-groups").intern();

    /**
     * List of VNFDs that are part of this placement group
     *
     *
     *
     * @return <code>java.util.List</code> <code>memberVnfd</code>, or <code>null</code> if not present
     */
    List<MemberVnfd> getMemberVnfd();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.placement.groups.PlacementGroupsKey</code> <code>key</code>, or <code>null</code> if not present
     */
    PlacementGroupsKey getKey();

}

