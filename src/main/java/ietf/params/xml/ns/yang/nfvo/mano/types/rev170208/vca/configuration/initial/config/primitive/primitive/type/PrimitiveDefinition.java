package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.initial.config.primitive.primitive.type;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PrimitiveParameterValue;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.initial.config.primitive.PrimitiveType;

import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * case primitive-definition {
 *     leaf name {
 *         type string;
 *     }
 *     list parameter {
 *         key "name";
 *         leaf name {
 *             type string;
 *         }
 *         leaf value {
 *             type string;
 *         }
 *     }
 *     leaf user-defined-script {
 *         type string;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/vca-configuration/initial-config-primitive/primitive-type/primitive-definition</i>
 *
 */
public interface PrimitiveDefinition
    extends
    DataObject,
    Augmentable<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.initial.config.primitive.primitive.type.PrimitiveDefinition>,
    PrimitiveParameterValue,
    PrimitiveType
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2017-02-08", "primitive-definition").intern();

    /**
     * Name of the configuration primitive.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    java.lang.String getName();
    
    /**
     * A user defined script.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>userDefinedScript</code>, or <code>null</code> if not present
     */
    java.lang.String getUserDefinedScript();

}

