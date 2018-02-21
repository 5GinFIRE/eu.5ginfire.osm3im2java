package ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur._interface.connection.point.type;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur._interface.ConnectionPointType;

import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfr</b>
 * <pre>
 * case internal {
 *     leaf internal-connection-point-ref {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfr/project/(urn:ietf:params:xml:ns:yang:nfvo:vnfr?revision=2017-02-28)vnfr-catalog/vnfr/vdur/interface/connection-point-type/internal</i>
 *
 */
public interface Internal
    extends
    DataObject,
    Augmentable<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur._interface.connection.point.type.Internal>,
    ConnectionPointType
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:vnfr",
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

