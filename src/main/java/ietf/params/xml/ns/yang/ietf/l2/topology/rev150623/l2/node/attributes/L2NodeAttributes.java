package ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.node.attributes;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;
import ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.TrillNickname;
import ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.Vlan;

import java.util.List;

import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Containing L2 node attributes
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-l2-topology</b>
 * <pre>
 * container l2-node-attributes {
 *     leaf name {
 *         type string;
 *     }
 *     leaf description {
 *         type string;
 *     }
 *     leaf-list management-address {
 *         type ip-address;
 *     }
 *     leaf management-vid {
 *         type vlan;
 *     }
 *     leaf-list nick-name {
 *         type trill-nickname;
 *     }
 *     leaf-list flag {
 *         type flag-type;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-l2-topology/l2-node-attributes/l2-node-attributes</i>
 * 
 * <p>To create instances of this class use {@link L2NodeAttributesBuilder}.
 * @see L2NodeAttributesBuilder
 *
 */
public interface L2NodeAttributes
    extends
    ChildOf<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2NodeAttributes>,
    Augmentable<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.node.attributes.L2NodeAttributes>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:ietf-l2-topology",
        "2015-06-23", "l2-node-attributes").intern();

    /**
     * Node name
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    java.lang.String getName();
    
    /**
     * Node description
     *
     *
     *
     * @return <code>java.lang.String</code> <code>description</code>, or <code>null</code> if not present
     */
    java.lang.String getDescription();
    
    /**
     * System management address
     *
     *
     *
     * @return <code>java.util.List</code> <code>managementAddress</code>, or <code>null</code> if not present
     */
    List<IpAddress> getManagementAddress();
    
    /**
     * System management VID
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.Vlan</code> <code>managementVid</code>, or <code>null</code> if not present
     */
    Vlan getManagementVid();
    
    /**
     * Nickname of the RBridge
     *
     *
     *
     * @return <code>java.util.List</code> <code>nickName</code>, or <code>null</code> if not present
     */
    List<TrillNickname> getNickName();
    
    /**
     * Node operational flags
     *
     *
     *
     * @return <code>java.util.List</code> <code>flag</code>, or <code>null</code> if not present
     */
    List<java.lang.Class<? extends ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.FlagIdentity>> getFlag();

}

