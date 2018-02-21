package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.initial.config.primitive.primitive.type;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.primitive.parameter.value.Parameter;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.initial.config.primitive.primitive.type.PrimitiveDefinition} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.initial.config.primitive.primitive.type.PrimitiveDefinition
 *
 */
public class PrimitiveDefinitionBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.initial.config.primitive.primitive.type.PrimitiveDefinition> {

    private java.lang.String _name;
    private List<Parameter> _parameter;
    private java.lang.String _userDefinedScript;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.initial.config.primitive.primitive.type.PrimitiveDefinition>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.initial.config.primitive.primitive.type.PrimitiveDefinition>> augmentation = Collections.emptyMap();

    public PrimitiveDefinitionBuilder() {
    }
    public PrimitiveDefinitionBuilder(ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PrimitiveParameterValue arg) {
        this._parameter = arg.getParameter();
    }

    public PrimitiveDefinitionBuilder(PrimitiveDefinition base) {
        this._name = base.getName();
        this._parameter = base.getParameter();
        this._userDefinedScript = base.getUserDefinedScript();
        if (base instanceof PrimitiveDefinitionImpl) {
            PrimitiveDefinitionImpl impl = (PrimitiveDefinitionImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.initial.config.primitive.primitive.type.PrimitiveDefinition> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.initial.config.primitive.primitive.type.PrimitiveDefinition>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PrimitiveParameterValue</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PrimitiveParameterValue) {
            this._parameter = ((ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PrimitiveParameterValue)arg).getParameter();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PrimitiveParameterValue] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.String getName() {
        return _name;
    }
    
    public List<Parameter> getParameter() {
        return _parameter;
    }
    
    public java.lang.String getUserDefinedScript() {
        return _userDefinedScript;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.initial.config.primitive.primitive.type.PrimitiveDefinition>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public PrimitiveDefinitionBuilder setName(final java.lang.String value) {
        this._name = value;
        return this;
    }
    
     
    public PrimitiveDefinitionBuilder setParameter(final List<Parameter> value) {
        this._parameter = value;
        return this;
    }
    
     
    public PrimitiveDefinitionBuilder setUserDefinedScript(final java.lang.String value) {
        this._userDefinedScript = value;
        return this;
    }
    
    public PrimitiveDefinitionBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.initial.config.primitive.primitive.type.PrimitiveDefinition>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.initial.config.primitive.primitive.type.PrimitiveDefinition> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public PrimitiveDefinitionBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.initial.config.primitive.primitive.type.PrimitiveDefinition>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public PrimitiveDefinition build() {
        return new PrimitiveDefinitionImpl(this);
    }

    private static final class PrimitiveDefinitionImpl implements PrimitiveDefinition {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.initial.config.primitive.primitive.type.PrimitiveDefinition> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.initial.config.primitive.primitive.type.PrimitiveDefinition.class;
        }

        private final java.lang.String _name;
        private final List<Parameter> _parameter;
        private final java.lang.String _userDefinedScript;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.initial.config.primitive.primitive.type.PrimitiveDefinition>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.initial.config.primitive.primitive.type.PrimitiveDefinition>> augmentation = Collections.emptyMap();

        private PrimitiveDefinitionImpl(PrimitiveDefinitionBuilder base) {
            this._name = base.getName();
            this._parameter = base.getParameter();
            this._userDefinedScript = base.getUserDefinedScript();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.initial.config.primitive.primitive.type.PrimitiveDefinition>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.initial.config.primitive.primitive.type.PrimitiveDefinition>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.initial.config.primitive.primitive.type.PrimitiveDefinition>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.initial.config.primitive.primitive.type.PrimitiveDefinition>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getName() {
            return _name;
        }
        
        @Override
        public List<Parameter> getParameter() {
            return _parameter;
        }
        
        @Override
        public java.lang.String getUserDefinedScript() {
            return _userDefinedScript;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.initial.config.primitive.primitive.type.PrimitiveDefinition>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_parameter);
            result = prime * result + Objects.hashCode(_userDefinedScript);
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
            if (!ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.initial.config.primitive.primitive.type.PrimitiveDefinition.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.initial.config.primitive.primitive.type.PrimitiveDefinition other = (ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.initial.config.primitive.primitive.type.PrimitiveDefinition)obj;
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_parameter, other.getParameter())) {
                return false;
            }
            if (!Objects.equals(_userDefinedScript, other.getUserDefinedScript())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                PrimitiveDefinitionImpl otherImpl = (PrimitiveDefinitionImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.initial.config.primitive.primitive.type.PrimitiveDefinition>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.initial.config.primitive.primitive.type.PrimitiveDefinition>> e : augmentation.entrySet()) {
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
            java.lang.String name = "PrimitiveDefinition [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_name != null) {
                builder.append("_name=");
                builder.append(_name);
                builder.append(", ");
            }
            if (_parameter != null) {
                builder.append("_parameter=");
                builder.append(_parameter);
                builder.append(", ");
            }
            if (_userDefinedScript != null) {
                builder.append("_userDefinedScript=");
                builder.append(_userDefinedScript);
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
