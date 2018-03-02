package ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.GetNsServicePrimitiveValuesOutput;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.vnf.primitive.group.Primitive;

import java.math.BigInteger;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of service primitives grouped by VNF.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list vnf-primitive-group {
 *     key "member-vnf-index-ref";
 *     leaf member-vnf-index-ref {
 *         type uint64;
 *     }
 *     leaf vnfd-id-ref {
 *         type string;
 *     }
 *     list primitive {
 *         key "index";
 *         leaf index {
 *             type uint32;
 *         }
 *         leaf name {
 *             type string;
 *         }
 *         list parameter {
 *             key "name";
 *             leaf name {
 *                 type string;
 *             }
 *             leaf value {
 *                 type string;
 *             }
 *         }
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/get-ns-service-primitive-values/output/vnf-primitive-group</i>
 * 
 * <p>To create instances of this class use {@link VnfPrimitiveGroupBuilder}.
 * @see VnfPrimitiveGroupBuilder
 * @see VnfPrimitiveGroupKey
 *
 */
public interface VnfPrimitiveGroup
    extends
    ChildOf<GetNsServicePrimitiveValuesOutput>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.VnfPrimitiveGroup>,
    Identifiable<VnfPrimitiveGroupKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsr",
        "2017-02-08", "vnf-primitive-group").intern();

    /**
     * Reference to member-vnf within constituent-vnfds
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>memberVnfIndexRef</code>, or <code>null</code> if not present
     */
    BigInteger getMemberVnfIndexRef();
    
    /**
     * A reference to a vnfd. This is aleafref to path: 
     * ../../../../project-nsd:constituent-vnfd + [project-nsd:id = 
     * current()/../project-nsd:id-ref] + /project-nsd:vnfd-id-refNOTE: An issue with 
     * confd is preventing theuse of xpath. Seems to be an issue with leafrefto 
     * leafref, whose target is in a different module.Once that is resolved this will 
     * switched to useleafref
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vnfdIdRef</code>, or <code>null</code> if not present
     */
    java.lang.String getVnfdIdRef();
    
    /**
     * @return <code>java.util.List</code> <code>primitive</code>, or <code>null</code> if not present
     */
    List<Primitive> getPrimitive();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.VnfPrimitiveGroupKey</code> <code>key</code>, or <code>null</code> if not present
     */
    VnfPrimitiveGroupKey getKey();

}

