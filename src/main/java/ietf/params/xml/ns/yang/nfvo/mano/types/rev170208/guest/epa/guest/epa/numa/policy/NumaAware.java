package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.NumaPolicy;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.NumaNodePolicy;

import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * case numa-aware {
 *     container numa-node-policy {
 *         leaf node-cnt {
 *             type uint16;
 *         }
 *         leaf mem-policy {
 *             type enumeration;
 *         }
 *         list node {
 *             key "id";
 *             leaf id {
 *                 type uint64;
 *             }
 *             list vcpu {
 *                 key "id";
 *                 leaf id {
 *                     type uint64;
 *                 }
 *             }
 *             leaf memory-mb {
 *                 type uint64;
 *             }
 *             choice om-numa-type {
 *                 case cores {
 *                     leaf num-cores {
 *                         type uint8;
 *                     }
 *                 }
 *                 case paired-threads {
 *                     container paired-threads {
 *                         leaf num-paired-threads {
 *                             type uint8;
 *                         }
 *                         list paired-thread-ids {
 *                             key "thread-a";
 *                             leaf thread-a {
 *                                 type uint8;
 *                             }
 *                             leaf thread-b {
 *                                 type uint8;
 *                             }
 *                         }
 *                     }
 *                 }
 *                 case threads {
 *                     leaf num-threads {
 *                         type uint8;
 *                     }
 *                 }
 *             }
 *         }
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/guest-epa/guest-epa/numa-policy/numa-aware</i>
 *
 */
public interface NumaAware
    extends
    DataObject,
    Augmentable<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.NumaAware>,
    NumaPolicy
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2017-02-08", "numa-aware").intern();

    /**
     * This policy defines NUMA topology of theguest. Specifically identifies if the 
     * guestshould be run on a host with one NUMAnode or multiple NUMA nodes. As an 
     * examplea guest might need 8 VCPUs and 4 GB ofmemory. However, it might need the 
     * VCPUsand memory distributed across multipleNUMA nodes. In this scenario, NUMA 
     * node1 could run with 6 VCPUs and 3GB, andNUMA node 2 could run with 2 VCPUs 
     * and1GB.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.NumaNodePolicy</code> <code>numaNodePolicy</code>, or <code>null</code> if not present
     */
    NumaNodePolicy getNumaNodePolicy();

}

