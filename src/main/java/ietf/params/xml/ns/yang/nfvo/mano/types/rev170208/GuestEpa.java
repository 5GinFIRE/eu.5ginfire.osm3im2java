package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * EPA attributes for the guest
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping guest-epa {
 *     container guest-epa {
 *         leaf trusted-execution {
 *             type boolean;
 *         }
 *         leaf mempage-size {
 *             type enumeration;
 *         }
 *         leaf cpu-pinning-policy {
 *             type cpu-pinning-policy;
 *         }
 *         leaf cpu-thread-pinning-policy {
 *             type enumeration;
 *         }
 *         list pcie-device {
 *             key "device-id";
 *             leaf device-id {
 *                 type string;
 *             }
 *             leaf count {
 *                 type uint64;
 *             }
 *         }
 *         choice numa-policy {
 *             case numa-aware {
 *                 container numa-node-policy {
 *                     leaf node-cnt {
 *                         type uint16;
 *                     }
 *                     leaf mem-policy {
 *                         type enumeration;
 *                     }
 *                     list node {
 *                         key "id";
 *                         leaf id {
 *                             type uint64;
 *                         }
 *                         list vcpu {
 *                             key "id";
 *                             leaf id {
 *                                 type uint64;
 *                             }
 *                         }
 *                         leaf memory-mb {
 *                             type uint64;
 *                         }
 *                         choice om-numa-type {
 *                             case cores {
 *                                 leaf num-cores {
 *                                     type uint8;
 *                                 }
 *                             }
 *                             case paired-threads {
 *                                 container paired-threads {
 *                                     leaf num-paired-threads {
 *                                         type uint8;
 *                                     }
 *                                     list paired-thread-ids {
 *                                         key "thread-a";
 *                                         leaf thread-a {
 *                                             type uint8;
 *                                         }
 *                                         leaf thread-b {
 *                                             type uint8;
 *                                         }
 *                                     }
 *                                 }
 *                             }
 *                             case threads {
 *                                 leaf num-threads {
 *                                     type uint8;
 *                                 }
 *                             }
 *                         }
 *                     }
 *                 }
 *             }
 *             case numa-unaware {
 *                 leaf numa-unaware {
 *                     type empty;
 *                 }
 *             }
 *         }
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/guest-epa</i>
 *
 */
public interface GuestEpa
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2017-02-08", "guest-epa").intern();

    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.GuestEpa</code> <code>guestEpa</code>, or <code>null</code> if not present
     */
    ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.GuestEpa getGuestEpa();

}

