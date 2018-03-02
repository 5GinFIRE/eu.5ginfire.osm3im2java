package ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.EventServicePrimitive;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.Nsr;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * Initial set of service primitives for NSD.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list initial-service-primitive {
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
 *     uses event-service-primitive;
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/project/(urn:ietf:params:xml:ns:yang:nfvo:nsr?revision=2017-02-08)ns-instance-opdata/nsr/initial-service-primitive</i>
 * 
 * <p>To create instances of this class use {@link InitialServicePrimitiveBuilder}.
 * @see InitialServicePrimitiveBuilder
 * @see InitialServicePrimitiveKey
 *
 */
public interface InitialServicePrimitive
    extends
    ChildOf<Nsr>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.InitialServicePrimitive>,
    EventServicePrimitive,
    Identifiable<InitialServicePrimitiveKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsr",
        "2017-02-08", "initial-service-primitive").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.InitialServicePrimitiveKey</code> <code>key</code>, or <code>null</code> if not present
     */
    InitialServicePrimitiveKey getKey();

}

