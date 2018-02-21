package http.riftio.vnfd.base.rev170228.vnfd.descriptor.placement.groups;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import http.riftio.vnfd.base.rev170228.vnfd.descriptor.PlacementGroups;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of VDUs that are part of this placement group
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * list member-vdus {
 *     key "member-vdu-ref";
 *     leaf member-vdu-ref {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/placement-groups/member-vdus</i>
 * 
 * <p>To create instances of this class use {@link MemberVdusBuilder}.
 * @see MemberVdusBuilder
 * @see MemberVdusKey
 *
 */
public interface MemberVdus
    extends
    ChildOf<PlacementGroups>,
    Augmentable<http.riftio.vnfd.base.rev170228.vnfd.descriptor.placement.groups.MemberVdus>,
    Identifiable<MemberVdusKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("http://riftio.com/ns/riftware-1.0/vnfd-base",
        "2017-02-28", "member-vdus").intern();

    /**
     * @return <code>java.lang.String</code> <code>memberVduRef</code>, or <code>null</code> if not present
     */
    java.lang.String getMemberVduRef();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.vnfd.base.rev170228.vnfd.descriptor.placement.groups.MemberVdusKey</code> <code>key</code>, or <code>null</code> if not present
     */
    MemberVdusKey getKey();

}

