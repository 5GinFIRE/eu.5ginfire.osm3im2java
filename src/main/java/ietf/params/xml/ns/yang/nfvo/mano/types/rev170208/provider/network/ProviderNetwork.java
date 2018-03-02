package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.provider.network;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Container for the provider network.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * container provider-network {
 *     leaf physical-network {
 *         type string;
 *     }
 *     leaf segmentation_id {
 *         type uint32;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/provider-network/provider-network</i>
 * 
 * <p>To create instances of this class use {@link ProviderNetworkBuilder}.
 * @see ProviderNetworkBuilder
 *
 */
public interface ProviderNetwork
    extends
    ChildOf<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ProviderNetwork>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.provider.network.ProviderNetwork>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2017-02-08", "provider-network").intern();

    /**
     * Name of the physical network on which the providernetwork is built.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>physicalNetwork</code>, or <code>null</code> if not present
     */
    java.lang.String getPhysicalNetwork();
    
    /**
     * ID of segregated virtual networks
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>segmentationId</code>, or <code>null</code> if not present
     */
    java.lang.Long getSegmentationId();

}

