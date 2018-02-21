package ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.network.type;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2NetworkType;

import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * The presence of the container node indicatesL2 Topology
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-l2-topology</b>
 * <pre>
 * container l2-network {
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-l2-topology/l2-network-type/l2-network</i>
 * 
 * <p>To create instances of this class use {@link L2NetworkBuilder}.
 * @see L2NetworkBuilder
 *
 */
public interface L2Network
    extends
    ChildOf<L2NetworkType>,
    Augmentable<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.network.type.L2Network>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:ietf-l2-topology",
        "2015-06-23", "l2-network").intern();


}

