package ietf.params.xml.ns.yang.nfvo.vnfr.rev170228;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfr</b>
 * <pre>
 * grouping virtual-interface {
 *     container virtual-interface {
 *         leaf type {
 *             type enumeration;
 *         }
 *         leaf bandwidth {
 *             type uint64;
 *         }
 *         leaf ovs-offload {
 *             type enumeration;
 *         }
 *         leaf vendor-id {
 *             type string;
 *         }
 *         leaf datapath-library {
 *             type string;
 *         }
 *         leaf provider-network-name {
 *             type string;
 *         }
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfr/virtual-interface</i>
 *
 */
public interface VirtualInterface
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:vnfr",
        "2017-02-28", "virtual-interface").intern();

    /**
     * Container for the virtual interface properties
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.virtual._interface.VirtualInterface</code> <code>virtualInterface</code>, or <code>null</code> if not present
     */
    ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.virtual._interface.VirtualInterface getVirtualInterface();

}

