package http.riftio.vnfd.base.rev170228.vnfd.descriptor.internal.vld.init.params;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link http.riftio.vnfd.base.rev170228.vnfd.descriptor.internal.vld.init.params.VimNetworkRef} instances.
 * 
 * @see http.riftio.vnfd.base.rev170228.vnfd.descriptor.internal.vld.init.params.VimNetworkRef
 *
 */
public class VimNetworkRefBuilder implements Builder<http.riftio.vnfd.base.rev170228.vnfd.descriptor.internal.vld.init.params.VimNetworkRef> {

    private java.lang.String _vimNetworkName;

    Map<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.internal.vld.init.params.VimNetworkRef>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.internal.vld.init.params.VimNetworkRef>> augmentation = Collections.emptyMap();

    public VimNetworkRefBuilder() {
    }

    public VimNetworkRefBuilder(VimNetworkRef base) {
        this._vimNetworkName = base.getVimNetworkName();
        if (base instanceof VimNetworkRefImpl) {
            VimNetworkRefImpl impl = (VimNetworkRefImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<http.riftio.vnfd.base.rev170228.vnfd.descriptor.internal.vld.init.params.VimNetworkRef> casted =(AugmentationHolder<http.riftio.vnfd.base.rev170228.vnfd.descriptor.internal.vld.init.params.VimNetworkRef>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public java.lang.String getVimNetworkName() {
        return _vimNetworkName;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.internal.vld.init.params.VimNetworkRef>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public VimNetworkRefBuilder setVimNetworkName(final java.lang.String value) {
        this._vimNetworkName = value;
        return this;
    }
    
    public VimNetworkRefBuilder addAugmentation(java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.internal.vld.init.params.VimNetworkRef>> augmentationType, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.internal.vld.init.params.VimNetworkRef> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VimNetworkRefBuilder removeAugmentation(java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.internal.vld.init.params.VimNetworkRef>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public VimNetworkRef build() {
        return new VimNetworkRefImpl(this);
    }

    private static final class VimNetworkRefImpl implements VimNetworkRef {

        @Override
        public java.lang.Class<http.riftio.vnfd.base.rev170228.vnfd.descriptor.internal.vld.init.params.VimNetworkRef> getImplementedInterface() {
            return http.riftio.vnfd.base.rev170228.vnfd.descriptor.internal.vld.init.params.VimNetworkRef.class;
        }

        private final java.lang.String _vimNetworkName;

        private Map<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.internal.vld.init.params.VimNetworkRef>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.internal.vld.init.params.VimNetworkRef>> augmentation = Collections.emptyMap();

        private VimNetworkRefImpl(VimNetworkRefBuilder base) {
            this._vimNetworkName = base.getVimNetworkName();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.internal.vld.init.params.VimNetworkRef>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.internal.vld.init.params.VimNetworkRef>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.internal.vld.init.params.VimNetworkRef>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.internal.vld.init.params.VimNetworkRef>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getVimNetworkName() {
            return _vimNetworkName;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.internal.vld.init.params.VimNetworkRef>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_vimNetworkName);
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
            if (!http.riftio.vnfd.base.rev170228.vnfd.descriptor.internal.vld.init.params.VimNetworkRef.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            http.riftio.vnfd.base.rev170228.vnfd.descriptor.internal.vld.init.params.VimNetworkRef other = (http.riftio.vnfd.base.rev170228.vnfd.descriptor.internal.vld.init.params.VimNetworkRef)obj;
            if (!Objects.equals(_vimNetworkName, other.getVimNetworkName())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VimNetworkRefImpl otherImpl = (VimNetworkRefImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.internal.vld.init.params.VimNetworkRef>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.internal.vld.init.params.VimNetworkRef>> e : augmentation.entrySet()) {
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
            java.lang.String name = "VimNetworkRef [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_vimNetworkName != null) {
                builder.append("_vimNetworkName=");
                builder.append(_vimNetworkName);
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
