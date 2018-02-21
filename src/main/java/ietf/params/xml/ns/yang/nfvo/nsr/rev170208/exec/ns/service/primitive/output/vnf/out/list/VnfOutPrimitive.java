package ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output.vnf.out.list;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PrimitiveParameterValue;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output.VnfOutList;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of service primitives supported by theconfiguration agent for this VNF.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list vnf-out-primitive {
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
 *     leaf execution-id {
 *         type string;
 *     }
 *     leaf execution-status {
 *         type string;
 *     }
 *     leaf execution-error-details {
 *         type string;
 *     }
 *     uses primitive-parameter-value;
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/exec-ns-service-primitive/output/vnf-out-list/vnf-out-primitive</i>
 * 
 * <p>To create instances of this class use {@link VnfOutPrimitiveBuilder}.
 * @see VnfOutPrimitiveBuilder
 * @see VnfOutPrimitiveKey
 *
 */
public interface VnfOutPrimitive
    extends
    ChildOf<VnfOutList>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output.vnf.out.list.VnfOutPrimitive>,
    PrimitiveParameterValue,
    Identifiable<VnfOutPrimitiveKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsr",
        "2017-02-08", "vnf-out-primitive").intern();

    /**
     * index of the service primitive.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>index</code>, or <code>null</code> if not present
     */
    java.lang.Long getIndex();
    
    /**
     * Name of the service primitive.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    java.lang.String getName();
    
    /**
     * Execution id of this primitive
     *
     *
     *
     * @return <code>java.lang.String</code> <code>executionId</code>, or <code>null</code> if not present
     */
    java.lang.String getExecutionId();
    
    /**
     * Status of the execution of this primitive
     *
     *
     *
     * @return <code>java.lang.String</code> <code>executionStatus</code>, or <code>null</code> if not present
     */
    java.lang.String getExecutionStatus();
    
    /**
     * Error details if execution-status is failed
     *
     *
     *
     * @return <code>java.lang.String</code> <code>executionErrorDetails</code>, or <code>null</code> if not present
     */
    java.lang.String getExecutionErrorDetails();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output.vnf.out.list.VnfOutPrimitiveKey</code> <code>key</code>, or <code>null</code> if not present
     */
    VnfOutPrimitiveKey getKey();

}

