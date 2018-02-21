package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.VcaConfiguration;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.primitive.Parameter;

import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * List of config primitives supported by theconfiguration agent for this VNF or 
 * VDU.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * list config-primitive {
 *     key "name";
 *     leaf name {
 *         type string;
 *     }
 *     list parameter {
 *         key "name";
 *         leaf name {
 *             type string;
 *         }
 *         leaf data-type {
 *             type parameter-data-type;
 *         }
 *         leaf mandatory {
 *             type mandatory;
 *         }
 *         leaf default-value {
 *             type string;
 *         }
 *         leaf parameter-pool {
 *             type string;
 *         }
 *         leaf read-only {
 *             type read-only;
 *         }
 *         leaf hidden {
 *             type hidden;
 *         }
 *         uses primitive-parameter;
 *     }
 *     leaf user-defined-script {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/vca-configuration/config-primitive</i>
 * 
 * <p>To create instances of this class use {@link ConfigPrimitiveBuilder}.
 * @see ConfigPrimitiveBuilder
 * @see ConfigPrimitiveKey
 *
 */
public interface ConfigPrimitive
    extends
    ChildOf<VcaConfiguration>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.ConfigPrimitive>,
    Identifiable<ConfigPrimitiveKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2017-02-08", "config-primitive").intern();

    /**
     * Name of the config primitive.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    java.lang.String getName();
    
    /**
     * List of parameters to the config primitive.
     *
     *
     *
     * @return <code>java.util.List</code> <code>parameter</code>, or <code>null</code> if not present
     */
    List<Parameter> getParameter();
    
    /**
     * A user defined script. If user defined script is defined,the script will be 
     * executed using bash
     *
     *
     *
     * @return <code>java.lang.String</code> <code>userDefinedScript</code>, or <code>null</code> if not present
     */
    java.lang.String getUserDefinedScript();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.ConfigPrimitiveKey</code> <code>key</code>, or <code>null</code> if not present
     */
    ConfigPrimitiveKey getKey();

}

