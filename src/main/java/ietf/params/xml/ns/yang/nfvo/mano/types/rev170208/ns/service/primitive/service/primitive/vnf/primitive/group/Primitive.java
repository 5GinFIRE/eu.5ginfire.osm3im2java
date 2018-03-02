package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ns.service.primitive.service.primitive.vnf.primitive.group;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ns.service.primitive.service.primitive.VnfPrimitiveGroup;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * list primitive {
 *     key "index";
 *     leaf index {
 *         type uint32;
 *     }
 *     leaf name {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/ns-service-primitive/service-primitive/vnf-primitive-group/primitive</i>
 * 
 * <p>To create instances of this class use {@link PrimitiveBuilder}.
 * @see PrimitiveBuilder
 * @see PrimitiveKey
 *
 */
public interface Primitive
    extends
    ChildOf<VnfPrimitiveGroup>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ns.service.primitive.service.primitive.vnf.primitive.group.Primitive>,
    Identifiable<PrimitiveKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2017-02-08", "primitive").intern();

    /**
     * Index of this primitive
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>index</code>, or <code>null</code> if not present
     */
    java.lang.Long getIndex();
    
    /**
     * Name of the primitive in the VNF primitive 
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    java.lang.String getName();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ns.service.primitive.service.primitive.vnf.primitive.group.PrimitiveKey</code> <code>key</code>, or <code>null</code> if not present
     */
    PrimitiveKey getKey();

}

