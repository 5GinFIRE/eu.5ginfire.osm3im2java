package http.riftio.nsd.base.rev170228.nsd.descriptor.common;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link http.riftio.nsd.base.rev170228.nsd.descriptor.common.KeyPair} instances.
 * 
 * @see http.riftio.nsd.base.rev170228.nsd.descriptor.common.KeyPair
 *
 */
public class KeyPairBuilder implements Builder<http.riftio.nsd.base.rev170228.nsd.descriptor.common.KeyPair> {

    private java.lang.String _akey;
    private KeyPairKey _key;
    private java.lang.String _name;

    Map<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.KeyPair>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.KeyPair>> augmentation = Collections.emptyMap();

    public KeyPairBuilder() {
    }

    public KeyPairBuilder(KeyPair base) {
        if (base.getKey() == null) {
            this._key = new KeyPairKey(
                base.getName()
            );
            this._name = base.getName();
        } else {
            this._key = base.getKey();
            this._name = _key.getName();
        }
        this._akey = base.getAkey();
        if (base instanceof KeyPairImpl) {
            KeyPairImpl impl = (KeyPairImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<http.riftio.nsd.base.rev170228.nsd.descriptor.common.KeyPair> casted =(AugmentationHolder<http.riftio.nsd.base.rev170228.nsd.descriptor.common.KeyPair>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public java.lang.String getAkey() {
        return _akey;
    }
    
    public KeyPairKey getKey() {
        return _key;
    }
    
    public java.lang.String getName() {
        return _name;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.KeyPair>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public KeyPairBuilder setAkey(final java.lang.String value) {
        this._akey = value;
        return this;
    }
    
     
    public KeyPairBuilder setKey(final KeyPairKey value) {
        this._key = value;
        return this;
    }
    
     
    public KeyPairBuilder setName(final java.lang.String value) {
        this._name = value;
        return this;
    }
    
    public KeyPairBuilder addAugmentation(java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.KeyPair>> augmentationType, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.KeyPair> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public KeyPairBuilder removeAugmentation(java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.KeyPair>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public KeyPair build() {
        return new KeyPairImpl(this);
    }

    private static final class KeyPairImpl implements KeyPair {

        @Override
        public java.lang.Class<http.riftio.nsd.base.rev170228.nsd.descriptor.common.KeyPair> getImplementedInterface() {
            return http.riftio.nsd.base.rev170228.nsd.descriptor.common.KeyPair.class;
        }

        private final java.lang.String _akey;
        private final KeyPairKey _key;
        private final java.lang.String _name;

        private Map<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.KeyPair>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.KeyPair>> augmentation = Collections.emptyMap();

        private KeyPairImpl(KeyPairBuilder base) {
            if (base.getKey() == null) {
                this._key = new KeyPairKey(
                    base.getName()
                );
                this._name = base.getName();
            } else {
                this._key = base.getKey();
                this._name = _key.getName();
            }
            this._akey = base.getAkey();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.KeyPair>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.KeyPair>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.KeyPair>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.KeyPair>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getAkey() {
            return _akey;
        }
        
        @Override
        public KeyPairKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.String getName() {
            return _name;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.KeyPair>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_akey);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_name);
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
            if (!http.riftio.nsd.base.rev170228.nsd.descriptor.common.KeyPair.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            http.riftio.nsd.base.rev170228.nsd.descriptor.common.KeyPair other = (http.riftio.nsd.base.rev170228.nsd.descriptor.common.KeyPair)obj;
            if (!Objects.equals(_akey, other.getAkey())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                KeyPairImpl otherImpl = (KeyPairImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.KeyPair>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.KeyPair>> e : augmentation.entrySet()) {
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
            java.lang.String name = "KeyPair [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_akey != null) {
                builder.append("_akey=");
                builder.append(_akey);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_name != null) {
                builder.append("_name=");
                builder.append(_name);
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
