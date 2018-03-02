package http.riftio.nsd.base.rev170228.nsd.vld.common.init.params;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link http.riftio.nsd.base.rev170228.nsd.vld.common.init.params.VimNetworkProfile} instances.
 * 
 * @see http.riftio.nsd.base.rev170228.nsd.vld.common.init.params.VimNetworkProfile
 *
 */
public class VimNetworkProfileBuilder implements Builder<http.riftio.nsd.base.rev170228.nsd.vld.common.init.params.VimNetworkProfile> {

    private java.lang.String _ipProfileRef;

    Map<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.vld.common.init.params.VimNetworkProfile>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.vld.common.init.params.VimNetworkProfile>> augmentation = Collections.emptyMap();

    public VimNetworkProfileBuilder() {
    }

    public VimNetworkProfileBuilder(VimNetworkProfile base) {
        this._ipProfileRef = base.getIpProfileRef();
        if (base instanceof VimNetworkProfileImpl) {
            VimNetworkProfileImpl impl = (VimNetworkProfileImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<http.riftio.nsd.base.rev170228.nsd.vld.common.init.params.VimNetworkProfile> casted =(AugmentationHolder<http.riftio.nsd.base.rev170228.nsd.vld.common.init.params.VimNetworkProfile>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public java.lang.String getIpProfileRef() {
        return _ipProfileRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<http.riftio.nsd.base.rev170228.nsd.vld.common.init.params.VimNetworkProfile>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public VimNetworkProfileBuilder setIpProfileRef(final java.lang.String value) {
        this._ipProfileRef = value;
        return this;
    }
    
    public VimNetworkProfileBuilder addAugmentation(java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.vld.common.init.params.VimNetworkProfile>> augmentationType, Augmentation<http.riftio.nsd.base.rev170228.nsd.vld.common.init.params.VimNetworkProfile> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VimNetworkProfileBuilder removeAugmentation(java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.vld.common.init.params.VimNetworkProfile>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public VimNetworkProfile build() {
        return new VimNetworkProfileImpl(this);
    }

    private static final class VimNetworkProfileImpl implements VimNetworkProfile {

        @Override
        public java.lang.Class<http.riftio.nsd.base.rev170228.nsd.vld.common.init.params.VimNetworkProfile> getImplementedInterface() {
            return http.riftio.nsd.base.rev170228.nsd.vld.common.init.params.VimNetworkProfile.class;
        }

        private final java.lang.String _ipProfileRef;

        private Map<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.vld.common.init.params.VimNetworkProfile>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.vld.common.init.params.VimNetworkProfile>> augmentation = Collections.emptyMap();

        private VimNetworkProfileImpl(VimNetworkProfileBuilder base) {
            this._ipProfileRef = base.getIpProfileRef();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.vld.common.init.params.VimNetworkProfile>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.vld.common.init.params.VimNetworkProfile>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.vld.common.init.params.VimNetworkProfile>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.vld.common.init.params.VimNetworkProfile>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getIpProfileRef() {
            return _ipProfileRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<http.riftio.nsd.base.rev170228.nsd.vld.common.init.params.VimNetworkProfile>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_ipProfileRef);
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
            if (!http.riftio.nsd.base.rev170228.nsd.vld.common.init.params.VimNetworkProfile.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            http.riftio.nsd.base.rev170228.nsd.vld.common.init.params.VimNetworkProfile other = (http.riftio.nsd.base.rev170228.nsd.vld.common.init.params.VimNetworkProfile)obj;
            if (!Objects.equals(_ipProfileRef, other.getIpProfileRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VimNetworkProfileImpl otherImpl = (VimNetworkProfileImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.vld.common.init.params.VimNetworkProfile>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.vld.common.init.params.VimNetworkProfile>> e : augmentation.entrySet()) {
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
            java.lang.String name = "VimNetworkProfile [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_ipProfileRef != null) {
                builder.append("_ipProfileRef=");
                builder.append(_ipProfileRef);
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
