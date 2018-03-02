package ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecNsServicePrimitiveOutput;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output.vnf.out.list.VnfOutPrimitive;

import java.math.BigInteger;
import java.util.List;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of VNFs whose primitives were set.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list vnf-out-list {
 *     key "member_vnf_index_ref";
 *     leaf member_vnf_index_ref {
 *         type uint64;
 *     }
 *     leaf vnfr-id-ref {
 *         type uuid;
 *     }
 *     list vnf-out-primitive {
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
 *         leaf execution-id {
 *             type string;
 *         }
 *         leaf execution-status {
 *             type string;
 *         }
 *         leaf execution-error-details {
 *             type string;
 *         }
 *         uses primitive-parameter-value;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/exec-ns-service-primitive/output/vnf-out-list</i>
 * 
 * <p>To create instances of this class use {@link VnfOutListBuilder}.
 * @see VnfOutListBuilder
 * @see VnfOutListKey
 *
 */
public interface VnfOutList
    extends
    ChildOf<ExecNsServicePrimitiveOutput>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output.VnfOutList>,
    Identifiable<VnfOutListKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsr",
        "2017-02-08", "vnf-out-list").intern();

    /**
     * Member VNF index
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>memberVnfIndexRef</code>, or <code>null</code> if not present
     */
    BigInteger getMemberVnfIndexRef();
    
    /**
     * A reference to a vnfr. This is aleafref to path
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid</code> <code>vnfrIdRef</code>, or <code>null</code> if not present
     */
    Uuid getVnfrIdRef();
    
    /**
     * List of service primitives supported by theconfiguration agent for this VNF.
     *
     *
     *
     * @return <code>java.util.List</code> <code>vnfOutPrimitive</code>, or <code>null</code> if not present
     */
    List<VnfOutPrimitive> getVnfOutPrimitive();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output.VnfOutListKey</code> <code>key</code>, or <code>null</code> if not present
     */
    VnfOutListKey getKey();

}

