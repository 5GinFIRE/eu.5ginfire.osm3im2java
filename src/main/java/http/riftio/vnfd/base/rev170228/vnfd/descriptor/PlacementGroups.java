package http.riftio.vnfd.base.rev170228.vnfd.descriptor;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import http.riftio.vnfd.base.rev170228.VnfdDescriptor;
import http.riftio.vnfd.base.rev170228.vnfd.descriptor.PlacementGroupsBuilder.PlacementGroupsImpl;
import http.riftio.vnfd.base.rev170228.vnfd.descriptor.placement.groups.MemberVdus;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PlacementGroupInfo;
import ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.VnfdBuilder.VnfdImpl;

import java.util.List;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of placement groups at VNF level
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
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
 *     list member-vdus {
 *         key "member-vdu-ref";
 *         leaf member-vdu-ref {
 *             type string;
 *         }
 *     }
 *     uses placement-group-info;
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/placement-groups</i>
 * 
 * <p>To create instances of this class use {@link PlacementGroupsBuilder}.
 * @see PlacementGroupsBuilder
 * @see PlacementGroupsKey
 *
 */
@JsonDeserialize(as = PlacementGroupsImpl.class)
public interface PlacementGroups
    extends
    ChildOf<VnfdDescriptor>,
    Augmentable<http.riftio.vnfd.base.rev170228.vnfd.descriptor.PlacementGroups>,
    PlacementGroupInfo,
    Identifiable<PlacementGroupsKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("http://riftio.com/ns/riftware-1.0/vnfd-base",
        "2017-02-28", "placement-groups").intern();

    /**
     * List of VDUs that are part of this placement group
     *
     *
     *
     * @return <code>java.util.List</code> <code>memberVdus</code>, or <code>null</code> if not present
     */
    List<MemberVdus> getMemberVdus();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.vnfd.base.rev170228.vnfd.descriptor.PlacementGroupsKey</code> <code>key</code>, or <code>null</code> if not present
     */
    PlacementGroupsKey getKey();

}

