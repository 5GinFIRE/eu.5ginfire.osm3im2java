package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.om.numa.type.paired.threads;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.Node;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.om.numa.type.paired.threads.paired.threads.PairedThreadIds;

import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * container paired-threads {
 *     leaf num-paired-threads {
 *         type uint8;
 *     }
 *     list paired-thread-ids {
 *         key "thread-a";
 *         leaf thread-a {
 *             type uint8;
 *         }
 *         leaf thread-b {
 *             type uint8;
 *         }
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/guest-epa/guest-epa/numa-policy/numa-aware/numa-node-policy/node/om-numa-type/paired-threads/paired-threads</i>
 * 
 * <p>To create instances of this class use {@link PairedThreadsBuilder}.
 * @see PairedThreadsBuilder
 *
 */
public interface PairedThreads
    extends
    ChildOf<Node>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.om.numa.type.paired.threads.PairedThreads>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2017-02-08", "paired-threads").intern();

    /**
     * @return <code>java.lang.Short</code> <code>numPairedThreads</code>, or <code>null</code> if not present
     */
    java.lang.Short getNumPairedThreads();
    
    /**
     * List of thread pairs to use in case of paired-thread NUMA
     *
     *
     *
     * @return <code>java.util.List</code> <code>pairedThreadIds</code>, or <code>null</code> if not present
     */
    List<PairedThreadIds> getPairedThreadIds();

}

