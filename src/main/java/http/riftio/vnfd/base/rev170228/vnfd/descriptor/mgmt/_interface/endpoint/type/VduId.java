package http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.EndpointType;

import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Use the default management interface on this VDU.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * case vdu-id {
 *     leaf vdu-id {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/mgmt-interface/endpoint-type/vdu-id</i>
 *
 */
public interface VduId
    extends
    DataObject,
    Augmentable<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.VduId>,
    EndpointType
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("http://riftio.com/ns/riftware-1.0/vnfd-base",
        "2017-02-28", "vdu-id").intern();

    /**
     * @return <code>java.lang.String</code> <code>vduId</code>, or <code>null</code> if not present
     */
    java.lang.String getVduId();

}

