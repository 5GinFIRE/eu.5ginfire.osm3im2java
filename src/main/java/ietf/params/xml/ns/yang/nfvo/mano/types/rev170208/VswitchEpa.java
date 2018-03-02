package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping vswitch-epa {
 *     container vswitch-epa {
 *         leaf ovs-acceleration {
 *             type enumeration;
 *         }
 *         leaf ovs-offload {
 *             type enumeration;
 *         }
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/vswitch-epa</i>
 *
 */
public interface VswitchEpa
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2017-02-08", "vswitch-epa").intern();

    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vswitch.epa.VswitchEpa</code> <code>vswitchEpa</code>, or <code>null</code> if not present
     */
    ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vswitch.epa.VswitchEpa getVswitchEpa();

}

