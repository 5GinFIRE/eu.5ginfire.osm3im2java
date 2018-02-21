package ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.GetNsServicePrimitiveValuesOutput;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.ns.parameter.group.Parameter;

import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * Automatically generated parameters in parameter group
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list ns-parameter-group {
 *     key "name";
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
 * <i>nsr/get-ns-service-primitive-values/output/ns-parameter-group</i>
 * 
 * <p>To create instances of this class use {@link NsParameterGroupBuilder}.
 * @see NsParameterGroupBuilder
 * @see NsParameterGroupKey
 *
 */
public interface NsParameterGroup
    extends
    ChildOf<GetNsServicePrimitiveValuesOutput>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.NsParameterGroup>,
    Identifiable<NsParameterGroupKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsr",
        "2017-02-08", "ns-parameter-group").intern();

    /**
     * Parameter group name
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    java.lang.String getName();
    
    /**
     * Automatically generated group parameter
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
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.NsParameterGroupKey</code> <code>key</code>, or <code>null</code> if not present
     */
    NsParameterGroupKey getKey();

}

