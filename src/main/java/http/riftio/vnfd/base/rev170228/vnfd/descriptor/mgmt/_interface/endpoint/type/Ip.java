package http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.EndpointType;
import ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;

import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Specifies the static IP address for managing the VNF.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * case ip {
 *     leaf ip-address {
 *         type ip-address;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/mgmt-interface/endpoint-type/ip</i>
 *
 */
public interface Ip
    extends
    DataObject,
    Augmentable<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.Ip>,
    EndpointType
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("http://riftio.com/ns/riftware-1.0/vnfd-base",
        "2017-02-28", "ip").intern();

    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress</code> <code>ipAddress</code>, or <code>null</code> if not present
     */
    IpAddress getIpAddress();

}

