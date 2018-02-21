package ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.ns.parameter.group;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.NsParameterGroup;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * Automatically generated group parameter
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list parameter {
 *     key "name";
 *     leaf name {
 *         type string;
 *     }
 *     leaf value {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/get-ns-service-primitive-values/output/ns-parameter-group/parameter</i>
 * 
 * <p>To create instances of this class use {@link ParameterBuilder}.
 * @see ParameterBuilder
 * @see ParameterKey
 *
 */
public interface Parameter
    extends
    ChildOf<NsParameterGroup>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.ns.parameter.group.Parameter>,
    Identifiable<ParameterKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsr",
        "2017-02-08", "parameter").intern();

    /**
     * Parameter name which should be pulled from a parameter pool
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    java.lang.String getName();
    
    /**
     * Automatically generated value
     *
     *
     *
     * @return <code>java.lang.String</code> <code>value</code>, or <code>null</code> if not present
     */
    java.lang.String getValue();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.ns.parameter.group.ParameterKey</code> <code>key</code>, or <code>null</code> if not present
     */
    ParameterKey getKey();

}

