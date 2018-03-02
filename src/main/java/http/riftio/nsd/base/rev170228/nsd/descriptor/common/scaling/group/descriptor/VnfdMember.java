package http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import http.riftio.nsd.base.rev170228.nsd.descriptor.common.ScalingGroupDescriptor;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of VNFs in this scaling group
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd-base</b>
 * <pre>
 * list vnfd-member {
 *     key "member-vnf-index-ref";
 *     leaf member-vnf-index-ref {
 *         type string;
 *     }
 *     leaf count {
 *         type count;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd-base/nsd-descriptor-common/scaling-group-descriptor/vnfd-member</i>
 * 
 * <p>To create instances of this class use {@link VnfdMemberBuilder}.
 * @see VnfdMemberBuilder
 * @see VnfdMemberKey
 *
 */
public interface VnfdMember
    extends
    ChildOf<ScalingGroupDescriptor>,
    Augmentable<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.VnfdMember>,
    Identifiable<VnfdMemberKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("http://riftio.com/ns/riftware-1.0/nsd-base",
        "2017-02-28", "vnfd-member").intern();

    /**
     * member VNF index of this member VNF
     *
     *
     *
     * @return <code>java.lang.String</code> <code>memberVnfIndexRef</code>, or <code>null</code> if not present
     */
    java.lang.String getMemberVnfIndexRef();
    
    /**
     * count of this member VNF within this scaling group.The count allows to define 
     * the number of instanceswhen a scaling action targets this scaling group
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>count</code>, or <code>null</code> if not present
     */
    java.lang.Long getCount();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.VnfdMemberKey</code> <code>key</code>, or <code>null</code> if not present
     */
    VnfdMemberKey getKey();

}

