package ietf.params.xml.ns.yang.ietf.l2.topology.rev150623;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.network.type.L2Network;

/**
 * Identify the topology type to be L2.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-l2-topology</b>
 * <pre>
 * grouping l2-network-type {
 *     container l2-network {
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-l2-topology/l2-network-type</i>
 *
 */
public interface L2NetworkType
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:ietf-l2-topology",
        "2015-06-23", "l2-network-type").intern();

    /**
     * The presence of the container node indicatesL2 Topology
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.network.type.L2Network</code> <code>l2Network</code>, or <code>null</code> if not present
     */
    L2Network getL2Network();

}

