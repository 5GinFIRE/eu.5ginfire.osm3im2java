package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import com.fasterxml.jackson.annotation.JsonProperty;

import http.riftio.vnfd.base.rev170228.vnfd.descriptor.VnfConfigurationBuilder;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.script.Script.ScriptType;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.Script} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.Script
 *
 */
public class ScriptBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.Script> {

    private ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.script.Script _script;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.Script>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.Script>> augmentation = Collections.emptyMap();

    public ScriptBuilder() {
    }

    public ScriptBuilder(Script base) {
        this._script = base.getScript();
        if (base instanceof ScriptImpl) {
            ScriptImpl impl = (ScriptImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.Script> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.Script>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.script.Script getScript() {
        return _script;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.Script>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public ScriptBuilder setScript(final ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.script.Script value) {
        this._script = value;
        return this;
    }
    
    public ScriptBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.Script>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.Script> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ScriptBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.Script>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Script build() {
        return new ScriptImpl(this);
    }

    public static final class ScriptImpl implements Script {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.Script> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.Script.class;
        }

        private ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.script.Script _script;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.Script>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.Script>> augmentation = Collections.emptyMap();

        private ScriptImpl(ScriptBuilder base) {
            this._script = base.getScript();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.Script>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.Script>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.Script>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.Script>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }
        
        public ScriptImpl() {
          	this( new ScriptBuilder() );
        }
        
        @JsonProperty("script-type")
        public void setScript(String s){
        	if( s.equals("riftio")){
        		ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.script.ScriptBuilder sb = new ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.script.ScriptBuilder().setScriptType(ScriptType.Rift);
        		_script = sb.build();
        	}
         }

        @Override
        public ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.script.Script getScript() {
            return _script;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.Script>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        private int hash = 0;
        private volatile boolean hashValid = false;
        
        @Override
        public int hashCode() {
            if (hashValid) {
                return hash;
            }
        
            final int prime = 31;
            int result = 1;
            result = prime * result + Objects.hashCode(_script);
            result = prime * result + Objects.hashCode(augmentation);
        
            hash = result;
            hashValid = true;
            return result;
        }

        @Override
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DataObject)) {
                return false;
            }
            if (!ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.Script.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.Script other = (ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.Script)obj;
            if (!Objects.equals(_script, other.getScript())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ScriptImpl otherImpl = (ScriptImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.Script>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.Script>> e : augmentation.entrySet()) {
                    if (!e.getValue().equals(other.getAugmentation(e.getKey()))) {
                        return false;
                    }
                }
                // .. and give the other one the chance to do the same
                if (!obj.equals(this)) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public java.lang.String toString() {
            java.lang.String name = "Script [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_script != null) {
                builder.append("_script=");
                builder.append(_script);
            }
            final int builderLength = builder.length();
            final int builderAdditionalLength = builder.substring(name.length(), builderLength).length();
            if (builderAdditionalLength > 2 && !builder.substring(builderLength - 2, builderLength).equals(", ")) {
                builder.append(", ");
            }
            builder.append("augmentation=");
            builder.append(augmentation.values());
            return builder.append(']').toString();
        }
    }

}
