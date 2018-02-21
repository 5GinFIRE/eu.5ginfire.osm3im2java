package http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu._interface.connection.point.type;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu._interface.ConnectionPointType;

import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * case internal {
 *     leaf internal-connection-point-ref {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/vdu/interface/connection-point-type/internal</i>
 *
 */
public interface Internal
    extends
    DataObject,
    Augmentable<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu._interface.connection.point.type.Internal>,
    ConnectionPointType
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("http://riftio.com/ns/riftware-1.0/vnfd-base",
        "2017-02-28", "internal").intern();

    /**
     * Leaf Ref to the particular internal connection point
     *
     *
     *
     * @return <code>java.lang.String</code> <code>internalConnectionPointRef</code>, or <code>null</code> if not present
     */
    java.lang.String getInternalConnectionPointRef();

}

