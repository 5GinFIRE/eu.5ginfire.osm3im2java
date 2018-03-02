package ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.vld.vld;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;
import ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.vld.Vld;
import ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.vld.VldBuilder.VldImpl;
import ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.vld.vld.VnfdConnectionPointRefBuilder.VnfdConnectionPointRefImpl;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * A list of references to connection points.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd</b>
 * <pre>
 * list vnfd-connection-point-ref {
 *     key "member-vnf-index-ref" "vnfd-connection-point-ref";
 *     leaf member-vnf-index-ref {
 *         type string;
 *     }
 *     leaf vnfd-connection-point-ref {
 *         type leafref;
 *     }
 *     leaf vnfd-id-ref {
 *         type leafref;
 *     }
 *     leaf ip-address {
 *         type ip-address;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd/nsd-vld/vld/vnfd-connection-point-ref</i>
 * 
 * <p>To create instances of this class use {@link VnfdConnectionPointRefBuilder}.
 * @see VnfdConnectionPointRefBuilder
 * @see VnfdConnectionPointRefKey
 *
 */
@JsonDeserialize(as = VnfdConnectionPointRefImpl.class)
public interface VnfdConnectionPointRef
    extends
    ChildOf<Vld>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.vld.vld.VnfdConnectionPointRef>,
    Identifiable<VnfdConnectionPointRefKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsd",
        "2017-02-28", "vnfd-connection-point-ref").intern();

    /**
     * Reference to member-vnf within constituent-vnfds
     *
     *
     *
     * @return <code>java.lang.String</code> <code>memberVnfIndexRef</code>, or <code>null</code> if not present
     */
    java.lang.String getMemberVnfIndexRef();
    
    /**
     * A reference to a connection point name
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>vnfdConnectionPointRef</code>, or <code>null</code> if not present
     */
    java.lang.Object getVnfdConnectionPointRef();
    
    /**
     * A reference to a VNFD
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>vnfdIdRef</code>, or <code>null</code> if not present
     */
    java.lang.Object getVnfdIdRef();
    
    /**
     * IP address of the connection point
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress</code> <code>ipAddress</code>, or <code>null</code> if not present
     */
    IpAddress getIpAddress();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.vld.vld.VnfdConnectionPointRefKey</code> <code>key</code>, or <code>null</code> if not present
     */
    VnfdConnectionPointRefKey getKey();

}

