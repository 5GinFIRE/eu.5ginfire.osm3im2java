package http.riftio.project.nsd.rev170228.nsr.nsd.service.primitive.service.primitive.vnf.primitive.group;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import http.riftio.project.nsd.rev170228.nsr.nsd.service.primitive.service.primitive.VnfPrimitiveGroup;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>project-nsd</b>
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
 * <i>project-nsd/nsr-nsd-service-primitive/service-primitive/vnf-primitive-group/primitive</i>
 * 
 * <p>To create instances of this class use {@link PrimitiveBuilder}.
 * @see PrimitiveBuilder
 * @see PrimitiveKey
 *
 */
public interface Primitive
    extends
    ChildOf<VnfPrimitiveGroup>,
    Augmentable<http.riftio.project.nsd.rev170228.nsr.nsd.service.primitive.service.primitive.vnf.primitive.group.Primitive>,
    Identifiable<PrimitiveKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("http://riftio.com/ns/riftware-1.0/project-nsd",
        "2017-02-28", "primitive").intern();

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
     * @return <code>org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.project.nsd.rev170228.nsr.nsd.service.primitive.service.primitive.vnf.primitive.group.PrimitiveKey</code> <code>key</code>, or <code>null</code> if not present
     */
    PrimitiveKey getKey();

}

