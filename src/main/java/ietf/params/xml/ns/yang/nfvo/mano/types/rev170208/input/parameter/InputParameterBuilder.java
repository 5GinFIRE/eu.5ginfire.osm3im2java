package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.input.parameter;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.input.parameter.InputParameter} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.input.parameter.InputParameter
 *
 */
public class InputParameterBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.input.parameter.InputParameter> {

    private InputParameterKey _key;
    private java.lang.String _value;
    private java.lang.String _xpath;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.input.parameter.InputParameter>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.input.parameter.InputParameter>> augmentation = Collections.emptyMap();

    public InputParameterBuilder() {
    }

    public InputParameterBuilder(InputParameter base) {
        if (base.getKey() == null) {
            this._key = new InputParameterKey(
                base.getXpath()
            );
            this._xpath = base.getXpath();
        } else {
            this._key = base.getKey();
            this._xpath = _key.getXpath();
        }
        this._value = base.getValue();
        if (base instanceof InputParameterImpl) {
            InputParameterImpl impl = (InputParameterImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.input.parameter.InputParameter> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.input.parameter.InputParameter>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public InputParameterKey getKey() {
        return _key;
    }
    
    public java.lang.String getValue() {
        return _value;
    }
    
    public java.lang.String getXpath() {
        return _xpath;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.input.parameter.InputParameter>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public InputParameterBuilder setKey(final InputParameterKey value) {
        this._key = value;
        return this;
    }
    
     
    public InputParameterBuilder setValue(final java.lang.String value) {
        this._value = value;
        return this;
    }
    
     
    public InputParameterBuilder setXpath(final java.lang.String value) {
        this._xpath = value;
        return this;
    }
    
    public InputParameterBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.input.parameter.InputParameter>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.input.parameter.InputParameter> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public InputParameterBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.input.parameter.InputParameter>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public InputParameter build() {
        return new InputParameterImpl(this);
    }

    private static final class InputParameterImpl implements InputParameter {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.input.parameter.InputParameter> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.input.parameter.InputParameter.class;
        }

        private final InputParameterKey _key;
        private final java.lang.String _value;
        private final java.lang.String _xpath;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.input.parameter.InputParameter>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.input.parameter.InputParameter>> augmentation = Collections.emptyMap();

        private InputParameterImpl(InputParameterBuilder base) {
            if (base.getKey() == null) {
                this._key = new InputParameterKey(
                    base.getXpath()
                );
                this._xpath = base.getXpath();
            } else {
                this._key = base.getKey();
                this._xpath = _key.getXpath();
            }
            this._value = base.getValue();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.input.parameter.InputParameter>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.input.parameter.InputParameter>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.input.parameter.InputParameter>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.input.parameter.InputParameter>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public InputParameterKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.String getValue() {
            return _value;
        }
        
        @Override
        public java.lang.String getXpath() {
            return _xpath;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.input.parameter.InputParameter>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_value);
            result = prime * result + Objects.hashCode(_xpath);
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
            if (!ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.input.parameter.InputParameter.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.input.parameter.InputParameter other = (ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.input.parameter.InputParameter)obj;
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_value, other.getValue())) {
                return false;
            }
            if (!Objects.equals(_xpath, other.getXpath())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                InputParameterImpl otherImpl = (InputParameterImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.input.parameter.InputParameter>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.input.parameter.InputParameter>> e : augmentation.entrySet()) {
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
            java.lang.String name = "InputParameter [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_value != null) {
                builder.append("_value=");
                builder.append(_value);
                builder.append(", ");
            }
            if (_xpath != null) {
                builder.append("_xpath=");
                builder.append(_xpath);
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
