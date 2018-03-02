package http.riftio.vnfd.base.rev170228.vnfd.descriptor;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link http.riftio.vnfd.base.rev170228.vnfd.descriptor.VduDependency} instances.
 * 
 * @see http.riftio.vnfd.base.rev170228.vnfd.descriptor.VduDependency
 *
 */
public class VduDependencyBuilder implements Builder<http.riftio.vnfd.base.rev170228.vnfd.descriptor.VduDependency> {

    private VduDependencyKey _key;
    private java.lang.String _vduDependsOnRef;
    private java.lang.String _vduSourceRef;

    Map<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.VduDependency>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.VduDependency>> augmentation = Collections.emptyMap();

    public VduDependencyBuilder() {
    }

    public VduDependencyBuilder(VduDependency base) {
        if (base.getKey() == null) {
            this._key = new VduDependencyKey(
                base.getVduSourceRef()
            );
            this._vduSourceRef = base.getVduSourceRef();
        } else {
            this._key = base.getKey();
            this._vduSourceRef = _key.getVduSourceRef();
        }
        this._vduDependsOnRef = base.getVduDependsOnRef();
        if (base instanceof VduDependencyImpl) {
            VduDependencyImpl impl = (VduDependencyImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<http.riftio.vnfd.base.rev170228.vnfd.descriptor.VduDependency> casted =(AugmentationHolder<http.riftio.vnfd.base.rev170228.vnfd.descriptor.VduDependency>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public VduDependencyKey getKey() {
        return _key;
    }
    
    public java.lang.String getVduDependsOnRef() {
        return _vduDependsOnRef;
    }
    
    public java.lang.String getVduSourceRef() {
        return _vduSourceRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.VduDependency>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public VduDependencyBuilder setKey(final VduDependencyKey value) {
        this._key = value;
        return this;
    }
    
     
    public VduDependencyBuilder setVduDependsOnRef(final java.lang.String value) {
        this._vduDependsOnRef = value;
        return this;
    }
    
     
    public VduDependencyBuilder setVduSourceRef(final java.lang.String value) {
        this._vduSourceRef = value;
        return this;
    }
    
    public VduDependencyBuilder addAugmentation(java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.VduDependency>> augmentationType, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.VduDependency> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VduDependencyBuilder removeAugmentation(java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.VduDependency>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public VduDependency build() {
        return new VduDependencyImpl(this);
    }

    private static final class VduDependencyImpl implements VduDependency {

        @Override
        public java.lang.Class<http.riftio.vnfd.base.rev170228.vnfd.descriptor.VduDependency> getImplementedInterface() {
            return http.riftio.vnfd.base.rev170228.vnfd.descriptor.VduDependency.class;
        }

        private final VduDependencyKey _key;
        private final java.lang.String _vduDependsOnRef;
        private final java.lang.String _vduSourceRef;

        private Map<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.VduDependency>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.VduDependency>> augmentation = Collections.emptyMap();

        private VduDependencyImpl(VduDependencyBuilder base) {
            if (base.getKey() == null) {
                this._key = new VduDependencyKey(
                    base.getVduSourceRef()
                );
                this._vduSourceRef = base.getVduSourceRef();
            } else {
                this._key = base.getKey();
                this._vduSourceRef = _key.getVduSourceRef();
            }
            this._vduDependsOnRef = base.getVduDependsOnRef();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.VduDependency>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.VduDependency>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.VduDependency>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.VduDependency>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public VduDependencyKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.String getVduDependsOnRef() {
            return _vduDependsOnRef;
        }
        
        @Override
        public java.lang.String getVduSourceRef() {
            return _vduSourceRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.VduDependency>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_vduDependsOnRef);
            result = prime * result + Objects.hashCode(_vduSourceRef);
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
            if (!http.riftio.vnfd.base.rev170228.vnfd.descriptor.VduDependency.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            http.riftio.vnfd.base.rev170228.vnfd.descriptor.VduDependency other = (http.riftio.vnfd.base.rev170228.vnfd.descriptor.VduDependency)obj;
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_vduDependsOnRef, other.getVduDependsOnRef())) {
                return false;
            }
            if (!Objects.equals(_vduSourceRef, other.getVduSourceRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VduDependencyImpl otherImpl = (VduDependencyImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.VduDependency>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.VduDependency>> e : augmentation.entrySet()) {
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
            java.lang.String name = "VduDependency [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_vduDependsOnRef != null) {
                builder.append("_vduDependsOnRef=");
                builder.append(_vduDependsOnRef);
                builder.append(", ");
            }
            if (_vduSourceRef != null) {
                builder.append("_vduSourceRef=");
                builder.append(_vduSourceRef);
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
