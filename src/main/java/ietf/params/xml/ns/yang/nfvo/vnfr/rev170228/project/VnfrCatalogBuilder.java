package ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.Vnfr;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.VnfrCatalog} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.VnfrCatalog
 *
 */
public class VnfrCatalogBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.VnfrCatalog> {

    private java.lang.String _schemaVersion;
    private List<Vnfr> _vnfr;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.VnfrCatalog>>, Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.VnfrCatalog>> augmentation = Collections.emptyMap();

    public VnfrCatalogBuilder() {
    }

    public VnfrCatalogBuilder(VnfrCatalog base) {
        this._schemaVersion = base.getSchemaVersion();
        this._vnfr = base.getVnfr();
        if (base instanceof VnfrCatalogImpl) {
            VnfrCatalogImpl impl = (VnfrCatalogImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.VnfrCatalog> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.VnfrCatalog>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public java.lang.String getSchemaVersion() {
        return _schemaVersion;
    }
    
    public List<Vnfr> getVnfr() {
        return _vnfr;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.VnfrCatalog>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public VnfrCatalogBuilder setSchemaVersion(final java.lang.String value) {
        this._schemaVersion = value;
        return this;
    }
    
     
    public VnfrCatalogBuilder setVnfr(final List<Vnfr> value) {
        this._vnfr = value;
        return this;
    }
    
    public VnfrCatalogBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.VnfrCatalog>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.VnfrCatalog> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VnfrCatalogBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.VnfrCatalog>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public VnfrCatalog build() {
        return new VnfrCatalogImpl(this);
    }

    private static final class VnfrCatalogImpl implements VnfrCatalog {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.VnfrCatalog> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.VnfrCatalog.class;
        }

        private final java.lang.String _schemaVersion;
        private final List<Vnfr> _vnfr;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.VnfrCatalog>>, Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.VnfrCatalog>> augmentation = Collections.emptyMap();

        private VnfrCatalogImpl(VnfrCatalogBuilder base) {
            this._schemaVersion = base.getSchemaVersion();
            this._vnfr = base.getVnfr();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.VnfrCatalog>>, Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.VnfrCatalog>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.VnfrCatalog>>, Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.VnfrCatalog>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getSchemaVersion() {
            return _schemaVersion;
        }
        
        @Override
        public List<Vnfr> getVnfr() {
            return _vnfr;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.VnfrCatalog>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_schemaVersion);
            result = prime * result + Objects.hashCode(_vnfr);
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
            if (!ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.VnfrCatalog.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.VnfrCatalog other = (ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.VnfrCatalog)obj;
            if (!Objects.equals(_schemaVersion, other.getSchemaVersion())) {
                return false;
            }
            if (!Objects.equals(_vnfr, other.getVnfr())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VnfrCatalogImpl otherImpl = (VnfrCatalogImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.VnfrCatalog>>, Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.VnfrCatalog>> e : augmentation.entrySet()) {
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
            java.lang.String name = "VnfrCatalog [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_schemaVersion != null) {
                builder.append("_schemaVersion=");
                builder.append(_schemaVersion);
                builder.append(", ");
            }
            if (_vnfr != null) {
                builder.append("_vnfr=");
                builder.append(_vnfr);
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
