package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.juju;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.VcaConfiguration;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.VcaRelationships;

import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * container juju {
 *     leaf charm {
 *         type string;
 *     }
 *     leaf proxy {
 *         type proxy;
 *     }
 *     container vca-relationships {
 *         list relation {
 *             key "requires" "provides";
 *             leaf requires {
 *                 type string;
 *             }
 *             leaf provides {
 *                 type string;
 *             }
 *         }
 *     }
 *     uses vca-relationships;
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/vca-configuration/config-method/juju/juju</i>
 * 
 * <p>To create instances of this class use {@link JujuBuilder}.
 * @see JujuBuilder
 *
 */
public interface Juju
    extends
    ChildOf<VcaConfiguration>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.juju.Juju>,
    VcaRelationships
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2017-02-08", "juju").intern();

    /**
     * Juju charm to use with the VNF or VDU.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>charm</code>, or <code>null</code> if not present
     */
    java.lang.String getCharm();
    
    /**
     * Is this a proxy charm?
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>proxy</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isProxy();

}

