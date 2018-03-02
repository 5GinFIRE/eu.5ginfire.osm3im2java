package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration;
import org.opendaylight.yangtools.yang.binding.DataContainer;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Defines the configuration method for the VNF or VDU.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * choice config-method {
 *     case juju {
 *         container juju {
 *             leaf charm {
 *                 type string;
 *             }
 *             leaf proxy {
 *                 type proxy;
 *             }
 *             container vca-relationships {
 *                 list relation {
 *                     key "requires" "provides";
 *                     leaf requires {
 *                         type string;
 *                     }
 *                     leaf provides {
 *                         type string;
 *                     }
 *                 }
 *             }
 *             uses vca-relationships;
 *         }
 *     }
 *     case script {
 *         container script {
 *             leaf script-type {
 *                 type enumeration;
 *             }
 *         }
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/vca-configuration/config-method</i>
 *
 */
public interface ConfigMethod
    extends
    DataContainer
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2017-02-08", "config-method").intern();


}

