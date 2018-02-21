package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.Node;

import java.math.BigInteger;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of VCPUs to allocate onthis NUMA node.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * list vcpu {
 *     key "id";
 *     leaf id {
 *         type uint64;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/guest-epa/guest-epa/numa-policy/numa-aware/numa-node-policy/node/vcpu</i>
 * 
 * <p>To create instances of this class use {@link VcpuBuilder}.
 * @see VcpuBuilder
 * @see VcpuKey
 *
 */
public interface Vcpu
    extends
    ChildOf<Node>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.Vcpu>,
    Identifiable<VcpuKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2017-02-08", "vcpu").intern();

    /**
     * List of VCPUs ids to allocate onthis NUMA node
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>id</code>, or <code>null</code> if not present
     */
    BigInteger getId();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.VcpuKey</code> <code>key</code>, or <code>null</code> if not present
     */
    VcpuKey getKey();

}

