package http.riftio.nsd.base.rev170228.nsd.descriptor.common;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import http.riftio.nsd.base.rev170228.NsdDescriptorCommon;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.EventConfig;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * Set of service primitives duringtermination for NSD.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd-base</b>
 * <pre>
 * list terminate-service-primitive {
 *     key "seq";
 *     leaf seq {
 *         type uint64;
 *     }
 *     leaf name {
 *         type string;
 *     }
 *     leaf user-defined-script {
 *         type string;
 *     }
 *     list parameter {
 *         key "name";
 *         leaf name {
 *             type string;
 *         }
 *         leaf value {
 *             type string;
 *         }
 *     }
 *     uses event-config;
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd-base/nsd-descriptor-common/terminate-service-primitive</i>
 * 
 * <p>To create instances of this class use {@link TerminateServicePrimitiveBuilder}.
 * @see TerminateServicePrimitiveBuilder
 * @see TerminateServicePrimitiveKey
 *
 */
public interface TerminateServicePrimitive
    extends
    ChildOf<NsdDescriptorCommon>,
    Augmentable<http.riftio.nsd.base.rev170228.nsd.descriptor.common.TerminateServicePrimitive>,
    EventConfig,
    Identifiable<TerminateServicePrimitiveKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("http://riftio.com/ns/riftware-1.0/nsd-base",
        "2017-02-28", "terminate-service-primitive").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.nsd.base.rev170228.nsd.descriptor.common.TerminateServicePrimitiveKey</code> <code>key</code>, or <code>null</code> if not present
     */
    TerminateServicePrimitiveKey getKey();

}

