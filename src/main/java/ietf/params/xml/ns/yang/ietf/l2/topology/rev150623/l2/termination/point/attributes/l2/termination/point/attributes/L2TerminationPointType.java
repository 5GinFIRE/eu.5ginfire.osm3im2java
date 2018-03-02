package ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.l2.termination.point.attributes;
import org.opendaylight.yangtools.yang.binding.DataContainer;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Indicates termination-point typespecific attributes
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-l2-topology</b>
 * <pre>
 * choice l2-termination-point-type {
 *     case ethernet {
 *         leaf mac-address {
 *             type mac-address;
 *         }
 *         leaf eth-encapsulation {
 *             type identityref;
 *         }
 *         leaf port-vlan-id {
 *             type vlan;
 *         }
 *         list vlan-id-name {
 *             key "vlan-id";
 *             leaf vlan-id {
 *                 type vlan;
 *             }
 *             leaf vlan-name {
 *                 type string;
 *             }
 *         }
 *     }
 *     case legacy {
 *         leaf encapsulation {
 *             type identityref;
 *         }
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-l2-topology/l2-termination-point-attributes/l2-termination-point-attributes/l2-termination-point-type</i>
 *
 */
public interface L2TerminationPointType
    extends
    DataContainer
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:ietf-l2-topology",
        "2015-06-23", "l2-termination-point-type").intern();


}

