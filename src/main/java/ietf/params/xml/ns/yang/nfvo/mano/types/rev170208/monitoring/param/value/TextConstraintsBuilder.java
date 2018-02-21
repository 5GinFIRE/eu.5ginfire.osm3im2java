package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.value;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.value.TextConstraints} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.value.TextConstraints
 *
 */
public class TextConstraintsBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.value.TextConstraints> {

    private java.lang.Short _maxLength;
    private java.lang.Short _minLength;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.value.TextConstraints>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.value.TextConstraints>> augmentation = Collections.emptyMap();

    public TextConstraintsBuilder() {
    }

    public TextConstraintsBuilder(TextConstraints base) {
        this._maxLength = base.getMaxLength();
        this._minLength = base.getMinLength();
        if (base instanceof TextConstraintsImpl) {
            TextConstraintsImpl impl = (TextConstraintsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.value.TextConstraints> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.value.TextConstraints>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public java.lang.Short getMaxLength() {
        return _maxLength;
    }
    
    public java.lang.Short getMinLength() {
        return _minLength;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.value.TextConstraints>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static void checkMaxLengthRange(final short value) {
         if (value >= (short)0 && value <= (short)255) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..255]].", value));
     }
    
    public TextConstraintsBuilder setMaxLength(final java.lang.Short value) {
    if (value != null) {
        checkMaxLengthRange(value);
    }
        this._maxLength = value;
        return this;
    }
    
     
     private static void checkMinLengthRange(final short value) {
         if (value >= (short)0 && value <= (short)255) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..255]].", value));
     }
    
    public TextConstraintsBuilder setMinLength(final java.lang.Short value) {
    if (value != null) {
        checkMinLengthRange(value);
    }
        this._minLength = value;
        return this;
    }
    
    public TextConstraintsBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.value.TextConstraints>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.value.TextConstraints> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public TextConstraintsBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.value.TextConstraints>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public TextConstraints build() {
        return new TextConstraintsImpl(this);
    }

    private static final class TextConstraintsImpl implements TextConstraints {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.value.TextConstraints> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.value.TextConstraints.class;
        }

        private final java.lang.Short _maxLength;
        private final java.lang.Short _minLength;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.value.TextConstraints>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.value.TextConstraints>> augmentation = Collections.emptyMap();

        private TextConstraintsImpl(TextConstraintsBuilder base) {
            this._maxLength = base.getMaxLength();
            this._minLength = base.getMinLength();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.value.TextConstraints>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.value.TextConstraints>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.value.TextConstraints>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.value.TextConstraints>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Short getMaxLength() {
            return _maxLength;
        }
        
        @Override
        public java.lang.Short getMinLength() {
            return _minLength;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.value.TextConstraints>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_maxLength);
            result = prime * result + Objects.hashCode(_minLength);
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
            if (!ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.value.TextConstraints.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.value.TextConstraints other = (ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.value.TextConstraints)obj;
            if (!Objects.equals(_maxLength, other.getMaxLength())) {
                return false;
            }
            if (!Objects.equals(_minLength, other.getMinLength())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                TextConstraintsImpl otherImpl = (TextConstraintsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.value.TextConstraints>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.value.TextConstraints>> e : augmentation.entrySet()) {
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
            java.lang.String name = "TextConstraints [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_maxLength != null) {
                builder.append("_maxLength=");
                builder.append(_maxLength);
                builder.append(", ");
            }
            if (_minLength != null) {
                builder.append("_minLength=");
                builder.append(_minLength);
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
