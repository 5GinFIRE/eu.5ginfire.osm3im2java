package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.om.numa.type.paired.threads.paired.threads;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.om.numa.type.paired.threads.PairedThreads;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of thread pairs to use in case of paired-thread NUMA
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * list paired-thread-ids {
 *     key "thread-a";
 *     leaf thread-a {
 *         type uint8;
 *     }
 *     leaf thread-b {
 *         type uint8;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/guest-epa/guest-epa/numa-policy/numa-aware/numa-node-policy/node/om-numa-type/paired-threads/paired-threads/paired-thread-ids</i>
 * 
 * <p>To create instances of this class use {@link PairedThreadIdsBuilder}.
 * @see PairedThreadIdsBuilder
 * @see PairedThreadIdsKey
 *
 */
public interface PairedThreadIds
    extends
    ChildOf<PairedThreads>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.om.numa.type.paired.threads.paired.threads.PairedThreadIds>,
    Identifiable<PairedThreadIdsKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2017-02-08", "paired-thread-ids").intern();

    /**
     * @return <code>java.lang.Short</code> <code>threadA</code>, or <code>null</code> if not present
     */
    java.lang.Short getThreadA();
    
    /**
     * @return <code>java.lang.Short</code> <code>threadB</code>, or <code>null</code> if not present
     */
    java.lang.Short getThreadB();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.om.numa.type.paired.threads.paired.threads.PairedThreadIdsKey</code> <code>key</code>, or <code>null</code> if not present
     */
    PairedThreadIdsKey getKey();

}

