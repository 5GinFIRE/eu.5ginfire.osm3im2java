package http.riftio.project.vnfd.rev170228.project;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import http.riftio.project.vnfd.rev170228.project.vnfd.catalog.Vnfd;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link http.riftio.project.vnfd.rev170228.project.VnfdCatalog} instances.
 * 
 * @see http.riftio.project.vnfd.rev170228.project.VnfdCatalog
 *
 */
public class VnfdCatalogBuilder implements Builder<http.riftio.project.vnfd.rev170228.project.VnfdCatalog> {

    private List<Vnfd> _vnfd;

    Map<java.lang.Class<? extends Augmentation<http.riftio.project.vnfd.rev170228.project.VnfdCatalog>>, Augmentation<http.riftio.project.vnfd.rev170228.project.VnfdCatalog>> augmentation = Collections.emptyMap();

    public VnfdCatalogBuilder() {
    }

    public VnfdCatalogBuilder(VnfdCatalog base) {
        this._vnfd = base.getVnfd();
        if (base instanceof VnfdCatalogImpl) {
            VnfdCatalogImpl impl = (VnfdCatalogImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<http.riftio.project.vnfd.rev170228.project.VnfdCatalog> casted =(AugmentationHolder<http.riftio.project.vnfd.rev170228.project.VnfdCatalog>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public List<Vnfd> getVnfd() {
        return _vnfd;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<http.riftio.project.vnfd.rev170228.project.VnfdCatalog>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public VnfdCatalogBuilder setVnfd(final List<Vnfd> value) {
        this._vnfd = value;
        return this;
    }
    
    public VnfdCatalogBuilder addAugmentation(java.lang.Class<? extends Augmentation<http.riftio.project.vnfd.rev170228.project.VnfdCatalog>> augmentationType, Augmentation<http.riftio.project.vnfd.rev170228.project.VnfdCatalog> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VnfdCatalogBuilder removeAugmentation(java.lang.Class<? extends Augmentation<http.riftio.project.vnfd.rev170228.project.VnfdCatalog>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public VnfdCatalog build() {
        return new VnfdCatalogImpl(this);
    }

    private static final class VnfdCatalogImpl implements VnfdCatalog {

        @Override
        public java.lang.Class<http.riftio.project.vnfd.rev170228.project.VnfdCatalog> getImplementedInterface() {
            return http.riftio.project.vnfd.rev170228.project.VnfdCatalog.class;
        }

        private final List<Vnfd> _vnfd;

        private Map<java.lang.Class<? extends Augmentation<http.riftio.project.vnfd.rev170228.project.VnfdCatalog>>, Augmentation<http.riftio.project.vnfd.rev170228.project.VnfdCatalog>> augmentation = Collections.emptyMap();

        private VnfdCatalogImpl(VnfdCatalogBuilder base) {
            this._vnfd = base.getVnfd();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.project.vnfd.rev170228.project.VnfdCatalog>>, Augmentation<http.riftio.project.vnfd.rev170228.project.VnfdCatalog>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<http.riftio.project.vnfd.rev170228.project.VnfdCatalog>>, Augmentation<http.riftio.project.vnfd.rev170228.project.VnfdCatalog>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<Vnfd> getVnfd() {
            return _vnfd;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<http.riftio.project.vnfd.rev170228.project.VnfdCatalog>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_vnfd);
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
            if (!http.riftio.project.vnfd.rev170228.project.VnfdCatalog.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            http.riftio.project.vnfd.rev170228.project.VnfdCatalog other = (http.riftio.project.vnfd.rev170228.project.VnfdCatalog)obj;
            if (!Objects.equals(_vnfd, other.getVnfd())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VnfdCatalogImpl otherImpl = (VnfdCatalogImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.project.vnfd.rev170228.project.VnfdCatalog>>, Augmentation<http.riftio.project.vnfd.rev170228.project.VnfdCatalog>> e : augmentation.entrySet()) {
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
            java.lang.String name = "VnfdCatalog [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_vnfd != null) {
                builder.append("_vnfd=");
                builder.append(_vnfd);
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
