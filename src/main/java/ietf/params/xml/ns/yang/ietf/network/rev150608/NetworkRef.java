package ietf.params.xml.ns.yang.ietf.network.rev150608;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Contains the information necessary to reference a network,for example an 
 * underlay network.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-network</b>
 * <pre>
 * grouping network-ref {
 *     leaf network-ref {
 *         type leafref;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-network/network-ref</i>
 *
 */
public interface NetworkRef
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:ietf-network",
        "2015-06-08", "network-ref").intern();

    /**
     * Used to reference a network, for example an underlaynetwork.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.network.rev150608.NetworkId</code> <code>networkRef</code>, or <code>null</code> if not present
     */
    NetworkId getNetworkRef();

}

