package http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import http.riftio.vnfd.base.rev170228.CommonConnectionPoint;
import http.riftio.vnfd.base.rev170228.vnfd.descriptor.Vdu;
import http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.InternalConnectionPointBuilder.InternalConnectionPointImpl;
import ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.VnfdBuilder.VnfdImpl;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List for internal connection points. Each VNFChas zero or more internal 
 * connection points.Internal connection points are used for connectingthe VNF 
 * components internal to the VNF. If a VNFhas only one VNFC, it may not have any 
 * internalconnection points.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * list internal-connection-point {
 *     key "id";
 *     leaf name {
 *         type string;
 *     }
 *     leaf id {
 *         type string;
 *     }
 *     leaf short-name {
 *         type string;
 *     }
 *     leaf type {
 *         type connection-point-type;
 *     }
 *     leaf port-security-enabled {
 *         type boolean;
 *     }
 *     leaf internal-vld-ref {
 *         type leafref;
 *     }
 *     uses common-connection-point;
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/vdu/internal-connection-point</i>
 * 
 * <p>To create instances of this class use {@link InternalConnectionPointBuilder}.
 * @see InternalConnectionPointBuilder
 * @see InternalConnectionPointKey
 *
 */
@JsonDeserialize(as = InternalConnectionPointImpl.class)
public interface InternalConnectionPoint
    extends
    ChildOf<Vdu>,
    Augmentable<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.InternalConnectionPoint>,
    CommonConnectionPoint,
    Identifiable<InternalConnectionPointKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("http://riftio.com/ns/riftware-1.0/vnfd-base",
        "2017-02-28", "internal-connection-point").intern();

    /**
     * @return <code>java.lang.String</code> <code>internalVldRef</code>, or <code>null</code> if not present
     */
    java.lang.String getInternalVldRef();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.vnfd.base.rev170228.vnfd.descriptor.vdu.InternalConnectionPointKey</code> <code>key</code>, or <code>null</code> if not present
     */
    InternalConnectionPointKey getKey();

}

