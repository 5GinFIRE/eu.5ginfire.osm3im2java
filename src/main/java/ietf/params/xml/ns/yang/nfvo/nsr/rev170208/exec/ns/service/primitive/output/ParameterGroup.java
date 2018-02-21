package ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PrimitiveParameterValue;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecNsServicePrimitiveOutput;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of NS Primitive parameter groups
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list parameter-group {
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
 *     uses primitive-parameter-value;
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/exec-ns-service-primitive/output/parameter-group</i>
 * 
 * <p>To create instances of this class use {@link ParameterGroupBuilder}.
 * @see ParameterGroupBuilder
 * @see ParameterGroupKey
 *
 */
public interface ParameterGroup
    extends
    ChildOf<ExecNsServicePrimitiveOutput>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output.ParameterGroup>,
    PrimitiveParameterValue,
    Identifiable<ParameterGroupKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsr",
        "2017-02-08", "parameter-group").intern();

    /**
     * Name of the parameter.
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
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output.ParameterGroupKey</code> <code>key</code>, or <code>null</code> if not present
     */
    ParameterGroupKey getKey();

}

