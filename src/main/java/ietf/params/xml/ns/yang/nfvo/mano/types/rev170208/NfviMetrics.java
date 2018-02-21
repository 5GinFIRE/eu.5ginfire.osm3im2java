package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.ExternalPorts;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.InternalPorts;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.Memory;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.Network;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.Storage;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.Vcpu;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping nfvi-metrics {
 *     container vcpu {
 *         leaf label {
 *             type label;
 *         }
 *         leaf total {
 *             type uint64;
 *         }
 *         leaf utilization {
 *             type decimal64;
 *         }
 *     }
 *     container memory {
 *         leaf label {
 *             type label;
 *         }
 *         leaf used {
 *             type uint64;
 *         }
 *         leaf total {
 *             type uint64;
 *         }
 *         leaf utilization {
 *             type decimal64;
 *         }
 *     }
 *     container storage {
 *         leaf label {
 *             type label;
 *         }
 *         leaf used {
 *             type uint64;
 *         }
 *         leaf total {
 *             type uint64;
 *         }
 *         leaf utilization {
 *             type decimal64;
 *         }
 *     }
 *     container external-ports {
 *         leaf label {
 *             type label;
 *         }
 *         leaf total {
 *             type uint64;
 *         }
 *     }
 *     container internal-ports {
 *         leaf label {
 *             type label;
 *         }
 *         leaf total {
 *             type uint64;
 *         }
 *     }
 *     container network {
 *         leaf label {
 *             type label;
 *         }
 *         container incoming {
 *             leaf label {
 *                 type label;
 *             }
 *             leaf bytes {
 *                 type uint64;
 *             }
 *             leaf packets {
 *                 type uint64;
 *             }
 *             leaf byte-rate {
 *                 type decimal64;
 *             }
 *             leaf packet-rate {
 *                 type decimal64;
 *             }
 *         }
 *         container outgoing {
 *             leaf label {
 *                 type label;
 *             }
 *             leaf bytes {
 *                 type uint64;
 *             }
 *             leaf packets {
 *                 type uint64;
 *             }
 *             leaf byte-rate {
 *                 type decimal64;
 *             }
 *             leaf packet-rate {
 *                 type decimal64;
 *             }
 *         }
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/nfvi-metrics</i>
 *
 */
public interface NfviMetrics
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2017-02-08", "nfvi-metrics").intern();

    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.Vcpu</code> <code>vcpu</code>, or <code>null</code> if not present
     */
    Vcpu getVcpu();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.Memory</code> <code>memory</code>, or <code>null</code> if not present
     */
    Memory getMemory();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.Storage</code> <code>storage</code>, or <code>null</code> if not present
     */
    Storage getStorage();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.ExternalPorts</code> <code>externalPorts</code>, or <code>null</code> if not present
     */
    ExternalPorts getExternalPorts();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.InternalPorts</code> <code>internalPorts</code>, or <code>null</code> if not present
     */
    InternalPorts getInternalPorts();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.Network</code> <code>network</code>, or <code>null</code> if not present
     */
    Network getNetwork();

}

