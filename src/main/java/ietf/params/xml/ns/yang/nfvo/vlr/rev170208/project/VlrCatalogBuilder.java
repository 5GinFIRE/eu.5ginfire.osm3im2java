package ietf.params.xml.ns.yang.nfvo.vlr.rev170208.project;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.nfvo.vlr.rev170208.project.vlr.catalog.Vlr;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.vlr.rev170208.project.VlrCatalog} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.vlr.rev170208.project.VlrCatalog
 *
 */
public class VlrCatalogBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.vlr.rev170208.project.VlrCatalog> {

    private java.lang.String _schemaVersion;
    private List<Vlr> _vlr;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vlr.rev170208.project.VlrCatalog>>, Augmentation<ietf.params.xml.ns.yang.nfvo.vlr.rev170208.project.VlrCatalog>> augmentation = Collections.emptyMap();

    public VlrCatalogBuilder() {
    }

    public VlrCatalogBuilder(VlrCatalog base) {
        this._schemaVersion = base.getSchemaVersion();
        this._vlr = base.getVlr();
        if (base instanceof VlrCatalogImpl) {
            VlrCatalogImpl impl = (VlrCatalogImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.vlr.rev170208.project.VlrCatalog> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.vlr.rev170208.project.VlrCatalog>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public java.lang.String getSchemaVersion() {
        return _schemaVersion;
    }
    
    public List<Vlr> getVlr() {
        return _vlr;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.vlr.rev170208.project.VlrCatalog>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public VlrCatalogBuilder setSchemaVersion(final java.lang.String value) {
        this._schemaVersion = value;
        return this;
    }
    
     
    public VlrCatalogBuilder setVlr(final List<Vlr> value) {
        this._vlr = value;
        return this;
    }
    
    public VlrCatalogBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vlr.rev170208.project.VlrCatalog>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.vlr.rev170208.project.VlrCatalog> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VlrCatalogBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vlr.rev170208.project.VlrCatalog>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public VlrCatalog build() {
        return new VlrCatalogImpl(this);
    }

    private static final class VlrCatalogImpl implements VlrCatalog {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.vlr.rev170208.project.VlrCatalog> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.vlr.rev170208.project.VlrCatalog.class;
        }

        private final java.lang.String _schemaVersion;
        private final List<Vlr> _vlr;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vlr.rev170208.project.VlrCatalog>>, Augmentation<ietf.params.xml.ns.yang.nfvo.vlr.rev170208.project.VlrCatalog>> augmentation = Collections.emptyMap();

        private VlrCatalogImpl(VlrCatalogBuilder base) {
            this._schemaVersion = base.getSchemaVersion();
            this._vlr = base.getVlr();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vlr.rev170208.project.VlrCatalog>>, Augmentation<ietf.params.xml.ns.yang.nfvo.vlr.rev170208.project.VlrCatalog>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vlr.rev170208.project.VlrCatalog>>, Augmentation<ietf.params.xml.ns.yang.nfvo.vlr.rev170208.project.VlrCatalog>>singletonMap(e.getKey(), e.getValue());
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
        public List<Vlr> getVlr() {
            return _vlr;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.vlr.rev170208.project.VlrCatalog>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_vlr);
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
            if (!ietf.params.xml.ns.yang.nfvo.vlr.rev170208.project.VlrCatalog.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.vlr.rev170208.project.VlrCatalog other = (ietf.params.xml.ns.yang.nfvo.vlr.rev170208.project.VlrCatalog)obj;
            if (!Objects.equals(_schemaVersion, other.getSchemaVersion())) {
                return false;
            }
            if (!Objects.equals(_vlr, other.getVlr())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VlrCatalogImpl otherImpl = (VlrCatalogImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vlr.rev170208.project.VlrCatalog>>, Augmentation<ietf.params.xml.ns.yang.nfvo.vlr.rev170208.project.VlrCatalog>> e : augmentation.entrySet()) {
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
            java.lang.String name = "VlrCatalog [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_schemaVersion != null) {
                builder.append("_schemaVersion=");
                builder.append(_schemaVersion);
                builder.append(", ");
            }
            if (_vlr != null) {
                builder.append("_vlr=");
                builder.append(_vlr);
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
