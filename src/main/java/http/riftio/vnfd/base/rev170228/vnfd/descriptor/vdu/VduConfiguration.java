package http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import http.riftio.vnfd.base.rev170228.vnfd.descriptor.Vdu;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.VcaConfiguration;

import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * container vdu-configuration {
 *     choice config-method {
 *         case juju {
 *             container juju {
 *                 leaf charm {
 *                     type string;
 *                 }
 *                 leaf proxy {
 *                     type proxy;
 *                 }
 *                 container vca-relationships {
 *                     list relation {
 *                         key "requires" "provides";
 *                         leaf requires {
 *                             type string;
 *                         }
 *                         leaf provides {
 *                             type string;
 *                         }
 *                     }
 *                 }
 *                 uses vca-relationships;
 *             }
 *         }
 *         case script {
 *             container script {
 *                 leaf script-type {
 *                     type enumeration;
 *                 }
 *             }
 *         }
 *     }
 *     list config-primitive {
 *         key "name";
 *         leaf name {
 *             type string;
 *         }
 *         list parameter {
 *             key "name";
 *             leaf name {
 *                 type string;
 *             }
 *             leaf data-type {
 *                 type parameter-data-type;
 *             }
 *             leaf mandatory {
 *                 type mandatory;
 *             }
 *             leaf default-value {
 *                 type string;
 *             }
 *             leaf parameter-pool {
 *                 type string;
 *             }
 *             leaf read-only {
 *                 type read-only;
 *             }
 *             leaf hidden {
 *                 type hidden;
 *             }
 *             uses primitive-parameter;
 *         }
 *         leaf user-defined-script {
 *             type string;
 *         }
 *     }
 *     list initial-config-primitive {
 *         key "seq";
 *         leaf seq {
 *             type uint64;
 *         }
 *         choice primitive-type {
 *             case primitive-definition {
 *                 leaf name {
 *                     type string;
 *                 }
 *                 leaf user-defined-script {
 *                     type string;
 *                 }
 *                 list parameter {
 *                     key "name";
 *                     leaf name {
 *                         type string;
 *                     }
 *                     leaf value {
 *                         type string;
 *                     }
 *                 }
 *             }
 *         }
 *     }
 *     uses vca-configuration;
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/vdu/vdu-configuration</i>
 * 
 * <p>To create instances of this class use {@link VduConfigurationBuilder}.
 * @see VduConfigurationBuilder
 *
 */
public interface VduConfiguration
    extends
    ChildOf<Vdu>,
    Augmentable<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.VduConfiguration>,
    VcaConfiguration
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("http://riftio.com/ns/riftware-1.0/vnfd-base",
        "2017-02-28", "vdu-configuration").intern();


}

