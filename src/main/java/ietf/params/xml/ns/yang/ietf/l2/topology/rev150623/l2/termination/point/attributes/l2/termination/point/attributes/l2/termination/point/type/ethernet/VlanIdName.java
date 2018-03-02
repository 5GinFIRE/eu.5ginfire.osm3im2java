package ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.l2.termination.point.attributes.l2.termination.point.type.ethernet;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.Vlan;
import ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.L2TerminationPointAttributes;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * Interface configured VLANs
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-l2-topology</b>
 * <pre>
 * list vlan-id-name {
 *     key "vlan-id";
 *     leaf vlan-id {
 *         type vlan;
 *     }
 *     leaf vlan-name {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-l2-topology/l2-termination-point-attributes/l2-termination-point-attributes/l2-termination-point-type/ethernet/vlan-id-name</i>
 * 
 * <p>To create instances of this class use {@link VlanIdNameBuilder}.
 * @see VlanIdNameBuilder
 * @see VlanIdNameKey
 *
 */
public interface VlanIdName
    extends
    ChildOf<L2TerminationPointAttributes>,
    Augmentable<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.l2.termination.point.attributes.l2.termination.point.type.ethernet.VlanIdName>,
    Identifiable<VlanIdNameKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:ietf-l2-topology",
        "2015-06-23", "vlan-id-name").intern();

    /**
     * VLAN ID
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.Vlan</code> <code>vlanId</code>, or <code>null</code> if not present
     */
    Vlan getVlanId();
    
    /**
     * VLAN Name
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vlanName</code>, or <code>null</code> if not present
     */
    java.lang.String getVlanName();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.l2.termination.point.attributes.l2.termination.point.type.ethernet.VlanIdNameKey</code> <code>key</code>, or <code>null</code> if not present
     */
    VlanIdNameKey getKey();

}

