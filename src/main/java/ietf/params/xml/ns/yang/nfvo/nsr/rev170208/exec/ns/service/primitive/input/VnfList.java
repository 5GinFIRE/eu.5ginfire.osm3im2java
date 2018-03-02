package ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.input;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecNsServicePrimitiveInput;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.input.vnf.list.VnfPrimitive;

import java.math.BigInteger;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of VNFs whose primitives are being set.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list vnf-list {
 *     key "member_vnf_index_ref";
 *     leaf member_vnf_index_ref {
 *         type uint64;
 *     }
 *     leaf vnfr-id-ref {
 *         type uuid;
 *     }
 *     list vnf-primitive {
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
 *         uses primitive-parameter-value;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/exec-ns-service-primitive/input/vnf-list</i>
 * 
 * <p>To create instances of this class use {@link VnfListBuilder}.
 * @see VnfListBuilder
 * @see VnfListKey
 *
 */
public interface VnfList
    extends
    ChildOf<ExecNsServicePrimitiveInput>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.input.VnfList>,
    Identifiable<VnfListKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsr",
        "2017-02-08", "vnf-list").intern();

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
     * @return <code>java.util.List</code> <code>vnfPrimitive</code>, or <code>null</code> if not present
     */
    List<VnfPrimitive> getVnfPrimitive();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.input.VnfListKey</code> <code>key</code>, or <code>null</code> if not present
     */
    VnfListKey getKey();

}

