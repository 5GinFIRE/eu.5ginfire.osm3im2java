package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.NumaAwareBuilder.NumaAwareImpl;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.NumaNodePolicy;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.NodeBuilder.NodeImpl;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.OmNumaType;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.Vcpu;

import java.math.BigInteger;
import java.util.List;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * list node {
 *     key "id";
 *     leaf id {
 *         type uint64;
 *     }
 *     list vcpu {
 *         key "id";
 *         leaf id {
 *             type uint64;
 *         }
 *     }
 *     leaf memory-mb {
 *         type uint64;
 *     }
 *     choice om-numa-type {
 *         case cores {
 *             leaf num-cores {
 *                 type uint8;
 *             }
 *         }
 *         case paired-threads {
 *             container paired-threads {
 *                 leaf num-paired-threads {
 *                     type uint8;
 *                 }
 *                 list paired-thread-ids {
 *                     key "thread-a";
 *                     leaf thread-a {
 *                         type uint8;
 *                     }
 *                     leaf thread-b {
 *                         type uint8;
 *                     }
 *                 }
 *             }
 *         }
 *         case threads {
 *             leaf num-threads {
 *                 type uint8;
 *             }
 *         }
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/guest-epa/guest-epa/numa-policy/numa-aware/numa-node-policy/node</i>
 * 
 * <p>To create instances of this class use {@link NodeBuilder}.
 * @see NodeBuilder
 * @see NodeKey
 *
 */
@JsonDeserialize(as = NodeImpl.class)
public interface Node
    extends
    ChildOf<NumaNodePolicy>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.Node>,
    Identifiable<NodeKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2017-02-08", "node").intern();

    /**
     * NUMA node identification. Typicallyit's 0 or 1
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>id</code>, or <code>null</code> if not present
     */
    BigInteger getId();
    
    /**
     * List of VCPUs to allocate onthis NUMA node.
     *
     *
     *
     * @return <code>java.util.List</code> <code>vcpu</code>, or <code>null</code> if not present
     */
    List<Vcpu> getVcpu();
    
    /**
     * Memory size expressed in MBfor this NUMA node.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>memoryMb</code>, or <code>null</code> if not present
     */
    BigInteger getMemoryMb();
    
    /**
     * OpenMANO Numa type selection
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.OmNumaType</code> <code>omNumaType</code>, or <code>null</code> if not present
     */
    OmNumaType getOmNumaType();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.NodeKey</code> <code>key</code>, or <code>null</code> if not present
     */
    NodeKey getKey();

}

