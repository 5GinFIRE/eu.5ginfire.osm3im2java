package http.riftio.vnfd.base.rev170228.vnfd.descriptor;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import http.riftio.vnfd.base.rev170228.VnfdDescriptor;
import http.riftio.vnfd.base.rev170228.vnfd.descriptor.VnfConfigurationBuilder.VnfConfigurationImpl;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.VcaConfiguration;
import ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.VnfdBuilder.VnfdImpl;

import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * container vnf-configuration {
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
 * <i>vnfd-base/vnfd-descriptor/vnf-configuration</i>
 * 
 * <p>To create instances of this class use {@link VnfConfigurationBuilder}.
 * @see VnfConfigurationBuilder
 *
 */
@JsonDeserialize(as = VnfConfigurationImpl.class)
public interface VnfConfiguration
    extends
    ChildOf<VnfdDescriptor>,
    Augmentable<http.riftio.vnfd.base.rev170228.vnfd.descriptor.VnfConfiguration>,
    VcaConfiguration
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("http://riftio.com/ns/riftware-1.0/vnfd-base",
        "2017-02-28", "vnf-configuration").intern();


}

