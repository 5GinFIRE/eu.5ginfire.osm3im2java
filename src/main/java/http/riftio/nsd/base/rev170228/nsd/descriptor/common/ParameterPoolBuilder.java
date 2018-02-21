package http.riftio.nsd.base.rev170228.nsd.descriptor.common;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import http.riftio.nsd.base.rev170228.nsd.descriptor.common.parameter.pool.Range;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link http.riftio.nsd.base.rev170228.nsd.descriptor.common.ParameterPool} instances.
 * 
 * @see http.riftio.nsd.base.rev170228.nsd.descriptor.common.ParameterPool
 *
 */
public class ParameterPoolBuilder implements Builder<http.riftio.nsd.base.rev170228.nsd.descriptor.common.ParameterPool> {

    private ParameterPoolKey _key;
    private java.lang.String _name;
    private Range _range;

    Map<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.ParameterPool>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.ParameterPool>> augmentation = Collections.emptyMap();

    public ParameterPoolBuilder() {
    }

    public ParameterPoolBuilder(ParameterPool base) {
        if (base.getKey() == null) {
            this._key = new ParameterPoolKey(
                base.getName()
            );
            this._name = base.getName();
        } else {
            this._key = base.getKey();
            this._name = _key.getName();
        }
        this._range = base.getRange();
        if (base instanceof ParameterPoolImpl) {
            ParameterPoolImpl impl = (ParameterPoolImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<http.riftio.nsd.base.rev170228.nsd.descriptor.common.ParameterPool> casted =(AugmentationHolder<http.riftio.nsd.base.rev170228.nsd.descriptor.common.ParameterPool>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public ParameterPoolKey getKey() {
        return _key;
    }
    
    public java.lang.String getName() {
        return _name;
    }
    
    public Range getRange() {
        return _range;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.ParameterPool>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public ParameterPoolBuilder setKey(final ParameterPoolKey value) {
        this._key = value;
        return this;
    }
    
     
    public ParameterPoolBuilder setName(final java.lang.String value) {
        this._name = value;
        return this;
    }
    
     
    public ParameterPoolBuilder setRange(final Range value) {
        this._range = value;
        return this;
    }
    
    public ParameterPoolBuilder addAugmentation(java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.ParameterPool>> augmentationType, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.ParameterPool> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ParameterPoolBuilder removeAugmentation(java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.ParameterPool>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ParameterPool build() {
        return new ParameterPoolImpl(this);
    }

    private static final class ParameterPoolImpl implements ParameterPool {

        @Override
        public java.lang.Class<http.riftio.nsd.base.rev170228.nsd.descriptor.common.ParameterPool> getImplementedInterface() {
            return http.riftio.nsd.base.rev170228.nsd.descriptor.common.ParameterPool.class;
        }

        private final ParameterPoolKey _key;
        private final java.lang.String _name;
        private final Range _range;

        private Map<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.ParameterPool>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.ParameterPool>> augmentation = Collections.emptyMap();

        private ParameterPoolImpl(ParameterPoolBuilder base) {
            if (base.getKey() == null) {
                this._key = new ParameterPoolKey(
                    base.getName()
                );
                this._name = base.getName();
            } else {
                this._key = base.getKey();
                this._name = _key.getName();
            }
            this._range = base.getRange();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.ParameterPool>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.ParameterPool>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.ParameterPool>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.ParameterPool>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public ParameterPoolKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.String getName() {
            return _name;
        }
        
        @Override
        public Range getRange() {
            return _range;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.ParameterPool>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_range);
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
            if (!http.riftio.nsd.base.rev170228.nsd.descriptor.common.ParameterPool.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            http.riftio.nsd.base.rev170228.nsd.descriptor.common.ParameterPool other = (http.riftio.nsd.base.rev170228.nsd.descriptor.common.ParameterPool)obj;
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_range, other.getRange())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ParameterPoolImpl otherImpl = (ParameterPoolImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.ParameterPool>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.ParameterPool>> e : augmentation.entrySet()) {
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
            java.lang.String name = "ParameterPool [";
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
            if (_range != null) {
                builder.append("_range=");
                builder.append(_range);
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
