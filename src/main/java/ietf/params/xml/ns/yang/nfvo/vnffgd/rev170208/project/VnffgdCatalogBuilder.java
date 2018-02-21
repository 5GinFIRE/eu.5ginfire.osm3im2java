package ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.project;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.project.vnffgd.catalog.Vnffgd;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.project.VnffgdCatalog} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.project.VnffgdCatalog
 *
 */
public class VnffgdCatalogBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.project.VnffgdCatalog> {

    private List<Vnffgd> _vnffgd;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.project.VnffgdCatalog>>, Augmentation<ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.project.VnffgdCatalog>> augmentation = Collections.emptyMap();

    public VnffgdCatalogBuilder() {
    }

    public VnffgdCatalogBuilder(VnffgdCatalog base) {
        this._vnffgd = base.getVnffgd();
        if (base instanceof VnffgdCatalogImpl) {
            VnffgdCatalogImpl impl = (VnffgdCatalogImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.project.VnffgdCatalog> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.project.VnffgdCatalog>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public List<Vnffgd> getVnffgd() {
        return _vnffgd;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.project.VnffgdCatalog>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public VnffgdCatalogBuilder setVnffgd(final List<Vnffgd> value) {
        this._vnffgd = value;
        return this;
    }
    
    public VnffgdCatalogBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.project.VnffgdCatalog>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.project.VnffgdCatalog> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VnffgdCatalogBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.project.VnffgdCatalog>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public VnffgdCatalog build() {
        return new VnffgdCatalogImpl(this);
    }

    private static final class VnffgdCatalogImpl implements VnffgdCatalog {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.project.VnffgdCatalog> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.project.VnffgdCatalog.class;
        }

        private final List<Vnffgd> _vnffgd;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.project.VnffgdCatalog>>, Augmentation<ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.project.VnffgdCatalog>> augmentation = Collections.emptyMap();

        private VnffgdCatalogImpl(VnffgdCatalogBuilder base) {
            this._vnffgd = base.getVnffgd();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.project.VnffgdCatalog>>, Augmentation<ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.project.VnffgdCatalog>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.project.VnffgdCatalog>>, Augmentation<ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.project.VnffgdCatalog>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<Vnffgd> getVnffgd() {
            return _vnffgd;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.project.VnffgdCatalog>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_vnffgd);
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
            if (!ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.project.VnffgdCatalog.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.project.VnffgdCatalog other = (ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.project.VnffgdCatalog)obj;
            if (!Objects.equals(_vnffgd, other.getVnffgd())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VnffgdCatalogImpl otherImpl = (VnffgdCatalogImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.project.VnffgdCatalog>>, Augmentation<ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.project.VnffgdCatalog>> e : augmentation.entrySet()) {
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
            java.lang.String name = "VnffgdCatalog [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_vnffgd != null) {
                builder.append("_vnffgd=");
                builder.append(_vnffgd);
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
