package ietf.params.xml.ns.yang.nfvo.nsr.rev170208;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.NsParameter;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.NsParameterGroup;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.VnfPrimitiveGroup;

import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * container output {
 *     list ns-parameter {
 *         key "name";
 *         leaf name {
 *             type string;
 *         }
 *         leaf value {
 *             type string;
 *         }
 *     }
 *     list ns-parameter-group {
 *         key "name";
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
 *     list vnf-primitive-group {
 *         key "member-vnf-index-ref";
 *         leaf member-vnf-index-ref {
 *             type uint64;
 *         }
 *         leaf vnfd-id-ref {
 *             type string;
 *         }
 *         list primitive {
 *             key "index";
 *             leaf index {
 *                 type uint32;
 *             }
 *             leaf name {
 *                 type string;
 *             }
 *             list parameter {
 *                 key "name";
 *                 leaf name {
 *                     type string;
 *                 }
 *                 leaf value {
 *                     type string;
 *                 }
 *             }
 *         }
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/get-ns-service-primitive-values/output</i>
 * 
 * <p>To create instances of this class use {@link GetNsServicePrimitiveValuesOutputBuilder}.
 * @see GetNsServicePrimitiveValuesOutputBuilder
 *
 */
public interface GetNsServicePrimitiveValuesOutput
    extends
    DataObject,
    Augmentable<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.GetNsServicePrimitiveValuesOutput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsr",
        "2017-02-08", "output").intern();

    /**
     * Automatically generated parameter
     *
     *
     *
     * @return <code>java.util.List</code> <code>nsParameter</code>, or <code>null</code> if not present
     */
    List<NsParameter> getNsParameter();
    
    /**
     * Automatically generated parameters in parameter group
     *
     *
     *
     * @return <code>java.util.List</code> <code>nsParameterGroup</code>, or <code>null</code> if not present
     */
    List<NsParameterGroup> getNsParameterGroup();
    
    /**
     * List of service primitives grouped by VNF.
     *
     *
     *
     * @return <code>java.util.List</code> <code>vnfPrimitiveGroup</code>, or <code>null</code> if not present
     */
    List<VnfPrimitiveGroup> getVnfPrimitiveGroup();

}

