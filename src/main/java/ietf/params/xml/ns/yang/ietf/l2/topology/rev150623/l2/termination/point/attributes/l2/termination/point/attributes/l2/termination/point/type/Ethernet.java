package ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.l2.termination.point.attributes.l2.termination.point.type;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.Vlan;
import ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.l2.termination.point.attributes.L2TerminationPointType;
import ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.l2.termination.point.attributes.l2.termination.point.type.ethernet.VlanIdName;
import ietf.params.xml.ns.yang.ietf.yang.types.rev130715.MacAddress;

import java.util.List;

import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-l2-topology</b>
 * <pre>
 * case ethernet {
 *     leaf mac-address {
 *         type mac-address;
 *     }
 *     leaf eth-encapsulation {
 *         type identityref;
 *     }
 *     leaf port-vlan-id {
 *         type vlan;
 *     }
 *     list vlan-id-name {
 *         key "vlan-id";
 *         leaf vlan-id {
 *             type vlan;
 *         }
 *         leaf vlan-name {
 *             type string;
 *         }
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-l2-topology/l2-termination-point-attributes/l2-termination-point-attributes/l2-termination-point-type/ethernet</i>
 *
 */
public interface Ethernet
    extends
    DataObject,
    Augmentable<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.l2.termination.point.attributes.l2.termination.point.type.Ethernet>,
    L2TerminationPointType
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:ietf-l2-topology",
        "2015-06-23", "ethernet").intern();

    /**
     * Interface MAC address
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.MacAddress</code> <code>macAddress</code>, or <code>null</code> if not present
     */
    MacAddress getMacAddress();
    
    /**
     * Encapsulation type of thisternimation point.
     *
     *
     *
     * @return <code>java.lang.Class</code> <code>ethEncapsulation</code>, or <code>null</code> if not present
     */
    java.lang.Class<? extends ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.EthEncapsulationType> getEthEncapsulation();
    
    /**
     * Port VLAN ID
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.Vlan</code> <code>portVlanId</code>, or <code>null</code> if not present
     */
    Vlan getPortVlanId();
    
    /**
     * Interface configured VLANs
     *
     *
     *
     * @return <code>java.util.List</code> <code>vlanIdName</code>, or <code>null</code> if not present
     */
    List<VlanIdName> getVlanIdName();

}

