package ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.service.primitive.service.primitive;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.service.primitive.ServicePrimitive;
import ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.service.primitive.service.primitive.vnf.primitive.group.Primitive;

import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of service primitives grouped by VNF.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd</b>
 * <pre>
 * list vnf-primitive-group {
 *     key "member-vnf-index-ref";
 *     leaf member-vnf-index-ref {
 *         type string;
 *     }
 *     leaf vnfd-id-ref {
 *         type leafref;
 *     }
 *     leaf vnfd-name {
 *         type leafref;
 *     }
 *     list primitive {
 *         key "index";
 *         leaf index {
 *             type uint32;
 *         }
 *         leaf name {
 *             type string;
 *         }
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd/nsd-service-primitive/service-primitive/vnf-primitive-group</i>
 * 
 * <p>To create instances of this class use {@link VnfPrimitiveGroupBuilder}.
 * @see VnfPrimitiveGroupBuilder
 * @see VnfPrimitiveGroupKey
 *
 */
public interface VnfPrimitiveGroup
    extends
    ChildOf<ServicePrimitive>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.service.primitive.service.primitive.VnfPrimitiveGroup>,
    Identifiable<VnfPrimitiveGroupKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsd",
        "2017-02-28", "vnf-primitive-group").intern();

    /**
     * Reference to member-vnf within constituent-vnfds
     *
     *
     *
     * @return <code>java.lang.String</code> <code>memberVnfIndexRef</code>, or <code>null</code> if not present
     */
    java.lang.String getMemberVnfIndexRef();
    
    /**
     * A reference to a VNFD. This is a leafref
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>vnfdIdRef</code>, or <code>null</code> if not present
     */
    java.lang.Object getVnfdIdRef();
    
    /**
     * Name of the VNFD
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>vnfdName</code>, or <code>null</code> if not present
     */
    java.lang.Object getVnfdName();
    
    /**
     * @return <code>java.util.List</code> <code>primitive</code>, or <code>null</code> if not present
     */
    List<Primitive> getPrimitive();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.service.primitive.service.primitive.VnfPrimitiveGroupKey</code> <code>key</code>, or <code>null</code> if not present
     */
    VnfPrimitiveGroupKey getKey();

}

