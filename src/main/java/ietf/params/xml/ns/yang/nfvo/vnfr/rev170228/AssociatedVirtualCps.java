package ietf.params.xml.ns.yang.nfvo.vnfr.rev170228;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.associated.virtual.cps.VirtualCps;

import java.util.List;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfr</b>
 * <pre>
 * grouping associated-virtual-cps {
 *     list virtual-cps {
 *         key "name";
 *         leaf name {
 *             type string;
 *         }
 *         leaf id {
 *             type string;
 *         }
 *         leaf short-name {
 *             type string;
 *         }
 *         leaf type {
 *             type connection-point-type;
 *         }
 *         leaf port-security-enabled {
 *             type boolean;
 *         }
 *         leaf ip-address {
 *             type ip-address;
 *         }
 *         leaf mac-address {
 *             type string;
 *         }
 *         leaf connection-point-id {
 *             type string;
 *         }
 *         uses common-connection-point;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfr/associated-virtual-cps</i>
 *
 */
public interface AssociatedVirtualCps
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:vnfr",
        "2017-02-28", "associated-virtual-cps").intern();

    /**
     * @return <code>java.util.List</code> <code>virtualCps</code>, or <code>null</code> if not present
     */
    List<VirtualCps> getVirtualCps();

}

