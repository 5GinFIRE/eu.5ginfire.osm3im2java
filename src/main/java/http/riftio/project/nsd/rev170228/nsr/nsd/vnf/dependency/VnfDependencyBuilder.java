package http.riftio.project.nsd.rev170228.nsr.nsd.vnf.dependency;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link http.riftio.project.nsd.rev170228.nsr.nsd.vnf.dependency.VnfDependency} instances.
 * 
 * @see http.riftio.project.nsd.rev170228.nsr.nsd.vnf.dependency.VnfDependency
 *
 */
public class VnfDependencyBuilder implements Builder<http.riftio.project.nsd.rev170228.nsr.nsd.vnf.dependency.VnfDependency> {

    private VnfDependencyKey _key;
    private java.lang.String _vnfDependsOnRef;
    private java.lang.String _vnfSourceRef;

    Map<java.lang.Class<? extends Augmentation<http.riftio.project.nsd.rev170228.nsr.nsd.vnf.dependency.VnfDependency>>, Augmentation<http.riftio.project.nsd.rev170228.nsr.nsd.vnf.dependency.VnfDependency>> augmentation = Collections.emptyMap();

    public VnfDependencyBuilder() {
    }

    public VnfDependencyBuilder(VnfDependency base) {
        if (base.getKey() == null) {
            this._key = new VnfDependencyKey(
                base.getVnfSourceRef()
            );
            this._vnfSourceRef = base.getVnfSourceRef();
        } else {
            this._key = base.getKey();
            this._vnfSourceRef = _key.getVnfSourceRef();
        }
        this._vnfDependsOnRef = base.getVnfDependsOnRef();
        if (base instanceof VnfDependencyImpl) {
            VnfDependencyImpl impl = (VnfDependencyImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<http.riftio.project.nsd.rev170228.nsr.nsd.vnf.dependency.VnfDependency> casted =(AugmentationHolder<http.riftio.project.nsd.rev170228.nsr.nsd.vnf.dependency.VnfDependency>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public VnfDependencyKey getKey() {
        return _key;
    }
    
    public java.lang.String getVnfDependsOnRef() {
        return _vnfDependsOnRef;
    }
    
    public java.lang.String getVnfSourceRef() {
        return _vnfSourceRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<http.riftio.project.nsd.rev170228.nsr.nsd.vnf.dependency.VnfDependency>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public VnfDependencyBuilder setKey(final VnfDependencyKey value) {
        this._key = value;
        return this;
    }
    
     
    public VnfDependencyBuilder setVnfDependsOnRef(final java.lang.String value) {
        this._vnfDependsOnRef = value;
        return this;
    }
    
     
    public VnfDependencyBuilder setVnfSourceRef(final java.lang.String value) {
        this._vnfSourceRef = value;
        return this;
    }
    
    public VnfDependencyBuilder addAugmentation(java.lang.Class<? extends Augmentation<http.riftio.project.nsd.rev170228.nsr.nsd.vnf.dependency.VnfDependency>> augmentationType, Augmentation<http.riftio.project.nsd.rev170228.nsr.nsd.vnf.dependency.VnfDependency> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VnfDependencyBuilder removeAugmentation(java.lang.Class<? extends Augmentation<http.riftio.project.nsd.rev170228.nsr.nsd.vnf.dependency.VnfDependency>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public VnfDependency build() {
        return new VnfDependencyImpl(this);
    }

    private static final class VnfDependencyImpl implements VnfDependency {

        @Override
        public java.lang.Class<http.riftio.project.nsd.rev170228.nsr.nsd.vnf.dependency.VnfDependency> getImplementedInterface() {
            return http.riftio.project.nsd.rev170228.nsr.nsd.vnf.dependency.VnfDependency.class;
        }

        private final VnfDependencyKey _key;
        private final java.lang.String _vnfDependsOnRef;
        private final java.lang.String _vnfSourceRef;

        private Map<java.lang.Class<? extends Augmentation<http.riftio.project.nsd.rev170228.nsr.nsd.vnf.dependency.VnfDependency>>, Augmentation<http.riftio.project.nsd.rev170228.nsr.nsd.vnf.dependency.VnfDependency>> augmentation = Collections.emptyMap();

        private VnfDependencyImpl(VnfDependencyBuilder base) {
            if (base.getKey() == null) {
                this._key = new VnfDependencyKey(
                    base.getVnfSourceRef()
                );
                this._vnfSourceRef = base.getVnfSourceRef();
            } else {
                this._key = base.getKey();
                this._vnfSourceRef = _key.getVnfSourceRef();
            }
            this._vnfDependsOnRef = base.getVnfDependsOnRef();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.project.nsd.rev170228.nsr.nsd.vnf.dependency.VnfDependency>>, Augmentation<http.riftio.project.nsd.rev170228.nsr.nsd.vnf.dependency.VnfDependency>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<http.riftio.project.nsd.rev170228.nsr.nsd.vnf.dependency.VnfDependency>>, Augmentation<http.riftio.project.nsd.rev170228.nsr.nsd.vnf.dependency.VnfDependency>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public VnfDependencyKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.String getVnfDependsOnRef() {
            return _vnfDependsOnRef;
        }
        
        @Override
        public java.lang.String getVnfSourceRef() {
            return _vnfSourceRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<http.riftio.project.nsd.rev170228.nsr.nsd.vnf.dependency.VnfDependency>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_vnfDependsOnRef);
            result = prime * result + Objects.hashCode(_vnfSourceRef);
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
            if (!http.riftio.project.nsd.rev170228.nsr.nsd.vnf.dependency.VnfDependency.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            http.riftio.project.nsd.rev170228.nsr.nsd.vnf.dependency.VnfDependency other = (http.riftio.project.nsd.rev170228.nsr.nsd.vnf.dependency.VnfDependency)obj;
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_vnfDependsOnRef, other.getVnfDependsOnRef())) {
                return false;
            }
            if (!Objects.equals(_vnfSourceRef, other.getVnfSourceRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VnfDependencyImpl otherImpl = (VnfDependencyImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.project.nsd.rev170228.nsr.nsd.vnf.dependency.VnfDependency>>, Augmentation<http.riftio.project.nsd.rev170228.nsr.nsd.vnf.dependency.VnfDependency>> e : augmentation.entrySet()) {
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
            java.lang.String name = "VnfDependency [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_vnfDependsOnRef != null) {
                builder.append("_vnfDependsOnRef=");
                builder.append(_vnfDependsOnRef);
                builder.append(", ");
            }
            if (_vnfSourceRef != null) {
                builder.append("_vnfSourceRef=");
                builder.append(_vnfSourceRef);
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
