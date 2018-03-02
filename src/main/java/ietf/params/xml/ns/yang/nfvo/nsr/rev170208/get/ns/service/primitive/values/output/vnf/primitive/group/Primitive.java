package ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.vnf.primitive.group;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.VnfPrimitiveGroup;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.vnf.primitive.group.primitive.Parameter;

import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list primitive {
 *     key "index";
 *     leaf index {
 *         type uint32;
 *     }
 *     leaf name {
 *         type string;
 *     }
 *     list parameter {
 *         key "name";
 *         leaf name {
 *             type string;
 *         }
 *         leaf value {
 *             type string;
 *         }
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/get-ns-service-primitive-values/output/vnf-primitive-group/primitive</i>
 * 
 * <p>To create instances of this class use {@link PrimitiveBuilder}.
 * @see PrimitiveBuilder
 * @see PrimitiveKey
 *
 */
public interface Primitive
    extends
    ChildOf<VnfPrimitiveGroup>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.vnf.primitive.group.Primitive>,
    Identifiable<PrimitiveKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsr",
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
     * Name of the primitive associated with a value pool
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    java.lang.String getName();
    
    /**
     * Automatically generated parameter
     *
     *
     *
     * @return <code>java.util.List</code> <code>parameter</code>, or <code>null</code> if not present
     */
    List<Parameter> getParameter();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.vnf.primitive.group.PrimitiveKey</code> <code>key</code>, or <code>null</code> if not present
     */
    PrimitiveKey getKey();

}

