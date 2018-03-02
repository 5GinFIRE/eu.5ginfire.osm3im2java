package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.script;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import http.riftio.vnfd.base.rev170228.vnfd.descriptor.VnfConfigurationBuilder.VnfConfigurationImpl;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.VcaConfiguration;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.script.ScriptBuilder.ScriptImpl;

import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * container script {
 *     leaf script-type {
 *         type enumeration;
 *     }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/vca-configuration/config-method/script/script</i>
 * 
 * <p>To create instances of this class use {@link ScriptBuilder}.
 * @see ScriptBuilder
 *
 */
@JsonDeserialize(as = ScriptImpl.class)
public interface Script
    extends
    ChildOf<VcaConfiguration>,
    Augmentable<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.script.Script>
{


    public enum ScriptType {
        Rift(0, "rift")
        ;
    
        private static final java.util.Map<java.lang.Integer, ScriptType> VALUE_MAP;
    
        static {
            final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, ScriptType> b = com.google.common.collect.ImmutableMap.builder();
            for (ScriptType enumItem : ScriptType.values()) {
                b.put(enumItem.value, enumItem);
            }
    
            VALUE_MAP = b.build();
        }
    
        private final java.lang.String name;
        private final int value;
    
        private ScriptType(int value, java.lang.String name) {
            this.value = value;
            this.name = name;
        }
    
        /**
         * Returns the name of the enumeration item as it is specified in the input yang.
         *
         * @return the name of the enumeration item as it is specified in the input yang
         */
        public java.lang.String getName() {
            return name;
        }
    
        /**
         * @return integer value
         */
        public int getIntValue() {
            return value;
        }
    
        /**
         * @param valueArg integer value
         * @return corresponding ScriptType item
         */
        public static ScriptType forValue(int valueArg) {
            return VALUE_MAP.get(valueArg);
        }
    }

    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:ietf:params:xml:ns:yang:nfvo:mano-types",
        "2017-02-08", "script").intern();

    /**
     * Script type - currently supported - Scripts confirming to Rift CA plugin
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.script.Script.ScriptType</code> <code>scriptType</code>, or <code>null</code> if not present
     */
    ScriptType getScriptType();

}

