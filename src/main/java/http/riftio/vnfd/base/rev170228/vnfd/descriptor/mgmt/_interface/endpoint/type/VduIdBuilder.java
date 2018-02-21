package http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.VduId} instances.
 * 
 * @see http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.VduId
 *
 */
public class VduIdBuilder implements Builder<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.VduId> {

    private java.lang.String _vduId;

    Map<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.VduId>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.VduId>> augmentation = Collections.emptyMap();

    public VduIdBuilder() {
    }

    public VduIdBuilder(VduId base) {
        this._vduId = base.getVduId();
        if (base instanceof VduIdImpl) {
            VduIdImpl impl = (VduIdImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.VduId> casted =(AugmentationHolder<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.VduId>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public java.lang.String getVduId() {
        return _vduId;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.VduId>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public VduIdBuilder setVduId(final java.lang.String value) {
        this._vduId = value;
        return this;
    }
    
    public VduIdBuilder addAugmentation(java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.VduId>> augmentationType, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.VduId> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VduIdBuilder removeAugmentation(java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.VduId>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public VduId build() {
        return new VduIdImpl(this);
    }

    private static final class VduIdImpl implements VduId {

        @Override
        public java.lang.Class<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.VduId> getImplementedInterface() {
            return http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.VduId.class;
        }

        private final java.lang.String _vduId;

        private Map<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.VduId>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.VduId>> augmentation = Collections.emptyMap();

        private VduIdImpl(VduIdBuilder base) {
            this._vduId = base.getVduId();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.VduId>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.VduId>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.VduId>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.VduId>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getVduId() {
            return _vduId;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.VduId>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_vduId);
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
            if (!http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.VduId.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.VduId other = (http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.VduId)obj;
            if (!Objects.equals(_vduId, other.getVduId())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VduIdImpl otherImpl = (VduIdImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.VduId>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.VduId>> e : augmentation.entrySet()) {
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
            java.lang.String name = "VduId [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_vduId != null) {
                builder.append("_vduId=");
                builder.append(_vduId);
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
