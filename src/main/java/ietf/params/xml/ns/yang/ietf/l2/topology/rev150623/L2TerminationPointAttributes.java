package ietf.params.xml.ns.yang.ietf.l2.topology.rev150623;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * L2 termination point attributes
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-l2-topology</b>
 * <pre>
 * grouping l2-termination-point-attributes {
 *     container l2-termination-point-attributes {
 *         leaf description {
 *             type string;
 *         }
 *         leaf maximum-frame-size {
 *             type uint32;
 *         }
 *         choice l2-termination-point-type {
 *             case ethernet {
 *                 leaf mac-address {
 *                     type mac-address;
 *                 }
 *                 leaf eth-encapsulation {
 *                     type identityref;
 *                 }
 *                 leaf port-vlan-id {
 *                     type vlan;
 *                 }
 *                 list vlan-id-name {
 *                     key "vlan-id";
 *                     leaf vlan-id {
 *                         type vlan;
 *                     }
 *                     leaf vlan-name {
 *                         type string;
 *                     }
 *                 }
 *             }
 *             case legacy {
 *                 leaf encapsulation {
 *                     type identityref;
 *                 }
 *             }
 *         }
 *         leaf tp-state {
 *             type enumeration;
 *         }
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-l2-topology/l2-termination-point-attributes</i>
 *
 */
public interface L2TerminationPointAttributes
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:ietf-l2-topology",
        "2015-06-23", "l2-termination-point-attributes").intern();

    /**
     * Containing L2 TP attributes
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.L2TerminationPointAttributes</code> <code>l2TerminationPointAttributes</code>, or <code>null</code> if not present
     */
    ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.L2TerminationPointAttributes getL2TerminationPointAttributes();

}

