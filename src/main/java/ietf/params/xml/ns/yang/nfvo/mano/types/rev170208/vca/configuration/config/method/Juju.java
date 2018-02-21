package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.ConfigMethod;

import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * Configure the VNF or VDU through Juju.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * case juju {
 *     container juju {
 *         leaf charm {
 *             type string;
 *         }
 *         leaf proxy {
 *             type proxy;
 *         }
 *         container vca-relationships {
 *             list relation {
 *                 key "requires" "provides";
 *                 leaf requires {
 *                     type string;
 *                 }
 *                 leaf provides {
 *                     type string;
 *                 }
 *             }
 *         }
 *         uses vca-relationships;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/vca-configuration/config-method/juju</i>
 *
 */
public interface Juju
    extends
    DataObject,
    Augmentable<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.Juju>,
    ConfigMethod
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2017-02-08", "juju").intern();

    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.juju.Juju</code> <code>juju</code>, or <code>null</code> if not present
     */
    ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.juju.Juju getJuju();

}

