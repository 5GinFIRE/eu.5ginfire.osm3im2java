package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping host-epa {
 *     container host-epa {
 *         leaf cpu-model {
 *             type enumeration;
 *         }
 *         leaf cpu-arch {
 *             type enumeration;
 *         }
 *         leaf cpu-vendor {
 *             type enumeration;
 *         }
 *         leaf cpu-socket-count {
 *             type uint64;
 *         }
 *         leaf cpu-core-count {
 *             type uint64;
 *         }
 *         leaf cpu-core-thread-count {
 *             type uint64;
 *         }
 *         list cpu-feature {
 *             key "feature";
 *             leaf feature {
 *                 type cpu-feature-type;
 *             }
 *         }
 *         leaf om-cpu-model-string {
 *             type string;
 *         }
 *         list om-cpu-feature {
 *             key "feature";
 *             leaf feature {
 *                 type string;
 *             }
 *         }
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/host-epa</i>
 *
 */
public interface HostEpa
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2017-02-08", "host-epa").intern();

    /**
     * Specifies the host level EPA attributes.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.HostEpa</code> <code>hostEpa</code>, or <code>null</code> if not present
     */
    ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.HostEpa getHostEpa();

}

