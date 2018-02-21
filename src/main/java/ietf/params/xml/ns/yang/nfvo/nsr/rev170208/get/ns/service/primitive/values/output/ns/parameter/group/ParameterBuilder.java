package ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.ns.parameter.group;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.ns.parameter.group.Parameter} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.ns.parameter.group.Parameter
 *
 */
public class ParameterBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.ns.parameter.group.Parameter> {

    private ParameterKey _key;
    private java.lang.String _name;
    private java.lang.String _value;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.ns.parameter.group.Parameter>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.ns.parameter.group.Parameter>> augmentation = Collections.emptyMap();

    public ParameterBuilder() {
    }

    public ParameterBuilder(Parameter base) {
        if (base.getKey() == null) {
            this._key = new ParameterKey(
                base.getName()
            );
            this._name = base.getName();
        } else {
            this._key = base.getKey();
            this._name = _key.getName();
        }
        this._value = base.getValue();
        if (base instanceof ParameterImpl) {
            ParameterImpl impl = (ParameterImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.ns.parameter.group.Parameter> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.ns.parameter.group.Parameter>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public ParameterKey getKey() {
        return _key;
    }
    
    public java.lang.String getName() {
        return _name;
    }
    
    public java.lang.String getValue() {
        return _value;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.ns.parameter.group.Parameter>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public ParameterBuilder setKey(final ParameterKey value) {
        this._key = value;
        return this;
    }
    
     
    public ParameterBuilder setName(final java.lang.String value) {
        this._name = value;
        return this;
    }
    
     
    public ParameterBuilder setValue(final java.lang.String value) {
        this._value = value;
        return this;
    }
    
    public ParameterBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.ns.parameter.group.Parameter>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.ns.parameter.group.Parameter> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ParameterBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.ns.parameter.group.Parameter>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Parameter build() {
        return new ParameterImpl(this);
    }

    private static final class ParameterImpl implements Parameter {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.ns.parameter.group.Parameter> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.ns.parameter.group.Parameter.class;
        }

        private final ParameterKey _key;
        private final java.lang.String _name;
        private final java.lang.String _value;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.ns.parameter.group.Parameter>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.ns.parameter.group.Parameter>> augmentation = Collections.emptyMap();

        private ParameterImpl(ParameterBuilder base) {
            if (base.getKey() == null) {
                this._key = new ParameterKey(
                    base.getName()
                );
                this._name = base.getName();
            } else {
                this._key = base.getKey();
                this._name = _key.getName();
            }
            this._value = base.getValue();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.ns.parameter.group.Parameter>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.ns.parameter.group.Parameter>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.ns.parameter.group.Parameter>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.ns.parameter.group.Parameter>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public ParameterKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.String getName() {
            return _name;
        }
        
        @Override
        public java.lang.String getValue() {
            return _value;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.ns.parameter.group.Parameter>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_value);
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
            if (!ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.ns.parameter.group.Parameter.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.ns.parameter.group.Parameter other = (ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.ns.parameter.group.Parameter)obj;
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_value, other.getValue())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ParameterImpl otherImpl = (ParameterImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.ns.parameter.group.Parameter>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.ns.parameter.group.Parameter>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Parameter [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_name != null) {
                builder.append("_name=");
                builder.append(_name);
                builder.append(", ");
            }
            if (_value != null) {
                builder.append("_value=");
                builder.append(_value);
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
