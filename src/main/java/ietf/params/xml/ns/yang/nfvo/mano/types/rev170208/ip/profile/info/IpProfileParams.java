package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.info;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;
import ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpPrefix;
import ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpVersion;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.IpProfileInfo;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.info.ip.profile.params.DhcpParams;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.info.ip.profile.params.DnsServer;

import java.util.List;

import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * container ip-profile-params {
 *     leaf ip-version {
 *         type ip-version;
 *     }
 *     leaf subnet-address {
 *         type ip-prefix;
 *     }
 *     leaf gateway-address {
 *         type ip-address;
 *     }
 *     leaf security-group {
 *         type string;
 *     }
 *     list dns-server {
 *         key "address";
 *         leaf address {
 *             type ip-address;
 *         }
 *     }
 *     container dhcp-params {
 *         leaf enabled {
 *             type enabled;
 *         }
 *         leaf start-address {
 *             type ip-address;
 *         }
 *         leaf count {
 *             type uint32;
 *         }
 *     }
 *     leaf subnet-prefix-pool {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/ip-profile-info/ip-profile-params</i>
 * 
 * <p>To create instances of this class use {@link IpProfileParamsBuilder}.
 * @see IpProfileParamsBuilder
 *
 */
public interface IpProfileParams
    extends
    ChildOf<IpProfileInfo>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.info.IpProfileParams>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2017-02-08", "ip-profile-params").intern();

    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpVersion</code> <code>ipVersion</code>, or <code>null</code> if not present
     */
    IpVersion getIpVersion();
    
    /**
     * Subnet IP prefix associated with IP Profile
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpPrefix</code> <code>subnetAddress</code>, or <code>null</code> if not present
     */
    IpPrefix getSubnetAddress();
    
    /**
     * IP Address of the default gateway associated with IP Profile
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress</code> <code>gatewayAddress</code>, or <code>null</code> if not present
     */
    IpAddress getGatewayAddress();
    
    /**
     * Name of the security group
     *
     *
     *
     * @return <code>java.lang.String</code> <code>securityGroup</code>, or <code>null</code> if not present
     */
    java.lang.String getSecurityGroup();
    
    /**
     * @return <code>java.util.List</code> <code>dnsServer</code>, or <code>null</code> if not present
     */
    List<DnsServer> getDnsServer();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.info.ip.profile.params.DhcpParams</code> <code>dhcpParams</code>, or <code>null</code> if not present
     */
    DhcpParams getDhcpParams();
    
    /**
     * VIM Specific reference to pre-created subnet prefix
     *
     *
     *
     * @return <code>java.lang.String</code> <code>subnetPrefixPool</code>, or <code>null</code> if not present
     */
    java.lang.String getSubnetPrefixPool();

}

