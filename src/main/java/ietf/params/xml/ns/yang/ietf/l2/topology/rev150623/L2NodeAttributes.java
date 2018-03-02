package ietf.params.xml.ns.yang.ietf.l2.topology.rev150623;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * L2 node attributes
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-l2-topology</b>
 * <pre>
 * grouping l2-node-attributes {
 *     container l2-node-attributes {
 *         leaf name {
 *             type string;
 *         }
 *         leaf description {
 *             type string;
 *         }
 *         leaf-list management-address {
 *             type ip-address;
 *         }
 *         leaf management-vid {
 *             type vlan;
 *         }
 *         leaf-list nick-name {
 *             type trill-nickname;
 *         }
 *         leaf-list flag {
 *             type flag-type;
 *         }
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-l2-topology/l2-node-attributes</i>
 *
 */
public interface L2NodeAttributes
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:ietf-l2-topology",
        "2015-06-23", "l2-node-attributes").intern();

    /**
     * Containing L2 node attributes
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.node.attributes.L2NodeAttributes</code> <code>l2NodeAttributes</code>, or <code>null</code> if not present
     */
    ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.node.attributes.L2NodeAttributes getL2NodeAttributes();

}

