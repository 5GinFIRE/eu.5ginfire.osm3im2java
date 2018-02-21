package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.list.IpProfiles;

import java.util.List;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping ip-profile-list {
 *     list ip-profiles {
 *         key "name";
 *         leaf name {
 *             type string;
 *         }
 *         leaf description {
 *             type string;
 *         }
 *         container ip-profile-params {
 *             leaf ip-version {
 *                 type ip-version;
 *             }
 *             leaf subnet-address {
 *                 type ip-prefix;
 *             }
 *             leaf gateway-address {
 *                 type ip-address;
 *             }
 *             leaf security-group {
 *                 type string;
 *             }
 *             list dns-server {
 *                 key "address";
 *                 leaf address {
 *                     type ip-address;
 *                 }
 *             }
 *             container dhcp-params {
 *                 leaf enabled {
 *                     type enabled;
 *                 }
 *                 leaf start-address {
 *                     type ip-address;
 *                 }
 *                 leaf count {
 *                     type uint32;
 *                 }
 *             }
 *             leaf subnet-prefix-pool {
 *                 type string;
 *             }
 *         }
 *         uses ip-profile-info;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/ip-profile-list</i>
 *
 */
public interface IpProfileList
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2017-02-08", "ip-profile-list").intern();

    /**
     * List of IP Profiles. IP Profile describes the IP characteristics for the 
     * Virtual-Link
     *
     *
     *
     * @return <code>java.util.List</code> <code>ipProfiles</code>, or <code>null</code> if not present
     */
    List<IpProfiles> getIpProfiles();

}

