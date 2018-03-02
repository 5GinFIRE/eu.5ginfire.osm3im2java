package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.ConfigMethod;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.ConfigPrimitive;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.InitialConfigPrimitive;

import java.util.List;

/**
 * Information about the VNF or VDU configuration. Note:If the NS contains 
 * instances of thesame VNF or VDU, each instance could have a 
 * differentconfiguration.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping vca-configuration {
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
 *                 list parameter {
 *                     key "name";
 *                     leaf name {
 *                         type string;
 *                     }
 *                     leaf value {
 *                         type string;
 *                     }
 *                 }
 *                 leaf user-defined-script {
 *                     type string;
 *                 }
 *             }
 *         }
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/vca-configuration</i>
 *
 */
public interface VcaConfiguration
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2017-02-08", "vca-configuration").intern();

    /**
     * Defines the configuration method for the VNF or VDU.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.ConfigMethod</code> <code>configMethod</code>, or <code>null</code> if not present
     */
    ConfigMethod getConfigMethod();
    
    /**
     * List of config primitives supported by theconfiguration agent for this VNF or 
     * VDU.
     *
     *
     *
     * @return <code>java.util.List</code> <code>configPrimitive</code>, or <code>null</code> if not present
     */
    List<ConfigPrimitive> getConfigPrimitive();
    
    /**
     * Initial set of configuration primitives.
     *
     *
     *
     * @return <code>java.util.List</code> <code>initialConfigPrimitive</code>, or <code>null</code> if not present
     */
    List<InitialConfigPrimitive> getInitialConfigPrimitive();

}

