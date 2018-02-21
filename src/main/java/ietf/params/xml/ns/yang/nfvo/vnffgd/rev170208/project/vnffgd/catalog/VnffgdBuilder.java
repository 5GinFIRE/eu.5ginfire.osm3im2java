package ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.project.vnffgd.catalog;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.project.vnffgd.catalog.Vnffgd} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.project.vnffgd.catalog.Vnffgd
 *
 */
public class VnffgdBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.project.vnffgd.catalog.Vnffgd> {

    private java.lang.String _description;
    private Uuid _id;
    private VnffgdKey _key;
    private java.lang.String _name;
    private java.lang.String _provider;
    private java.lang.String _version;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.project.vnffgd.catalog.Vnffgd>>, Augmentation<ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.project.vnffgd.catalog.Vnffgd>> augmentation = Collections.emptyMap();

    public VnffgdBuilder() {
    }

    public VnffgdBuilder(Vnffgd base) {
        if (base.getKey() == null) {
            this._key = new VnffgdKey(
                base.getId()
            );
            this._id = base.getId();
        } else {
            this._key = base.getKey();
            this._id = _key.getId();
        }
        this._description = base.getDescription();
        this._name = base.getName();
        this._provider = base.getProvider();
        this._version = base.getVersion();
        if (base instanceof VnffgdImpl) {
            VnffgdImpl impl = (VnffgdImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.project.vnffgd.catalog.Vnffgd> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.project.vnffgd.catalog.Vnffgd>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public java.lang.String getDescription() {
        return _description;
    }
    
    public Uuid getId() {
        return _id;
    }
    
    public VnffgdKey getKey() {
        return _key;
    }
    
    public java.lang.String getName() {
        return _name;
    }
    
    public java.lang.String getProvider() {
        return _provider;
    }
    
    public java.lang.String getVersion() {
        return _version;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.project.vnffgd.catalog.Vnffgd>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public VnffgdBuilder setDescription(final java.lang.String value) {
        this._description = value;
        return this;
    }
    
     
    public VnffgdBuilder setId(final Uuid value) {
        this._id = value;
        return this;
    }
    
     
    public VnffgdBuilder setKey(final VnffgdKey value) {
        this._key = value;
        return this;
    }
    
     
    public VnffgdBuilder setName(final java.lang.String value) {
        this._name = value;
        return this;
    }
    
     
    public VnffgdBuilder setProvider(final java.lang.String value) {
        this._provider = value;
        return this;
    }
    
     
    public VnffgdBuilder setVersion(final java.lang.String value) {
        this._version = value;
        return this;
    }
    
    public VnffgdBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.project.vnffgd.catalog.Vnffgd>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.project.vnffgd.catalog.Vnffgd> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VnffgdBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.project.vnffgd.catalog.Vnffgd>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Vnffgd build() {
        return new VnffgdImpl(this);
    }

    private static final class VnffgdImpl implements Vnffgd {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.project.vnffgd.catalog.Vnffgd> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.project.vnffgd.catalog.Vnffgd.class;
        }

        private final java.lang.String _description;
        private final Uuid _id;
        private final VnffgdKey _key;
        private final java.lang.String _name;
        private final java.lang.String _provider;
        private final java.lang.String _version;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.project.vnffgd.catalog.Vnffgd>>, Augmentation<ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.project.vnffgd.catalog.Vnffgd>> augmentation = Collections.emptyMap();

        private VnffgdImpl(VnffgdBuilder base) {
            if (base.getKey() == null) {
                this._key = new VnffgdKey(
                    base.getId()
                );
                this._id = base.getId();
            } else {
                this._key = base.getKey();
                this._id = _key.getId();
            }
            this._description = base.getDescription();
            this._name = base.getName();
            this._provider = base.getProvider();
            this._version = base.getVersion();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.project.vnffgd.catalog.Vnffgd>>, Augmentation<ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.project.vnffgd.catalog.Vnffgd>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.project.vnffgd.catalog.Vnffgd>>, Augmentation<ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.project.vnffgd.catalog.Vnffgd>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getDescription() {
            return _description;
        }
        
        @Override
        public Uuid getId() {
            return _id;
        }
        
        @Override
        public VnffgdKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.String getName() {
            return _name;
        }
        
        @Override
        public java.lang.String getProvider() {
            return _provider;
        }
        
        @Override
        public java.lang.String getVersion() {
            return _version;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.project.vnffgd.catalog.Vnffgd>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_description);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_provider);
            result = prime * result + Objects.hashCode(_version);
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
            if (!ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.project.vnffgd.catalog.Vnffgd.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.project.vnffgd.catalog.Vnffgd other = (ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.project.vnffgd.catalog.Vnffgd)obj;
            if (!Objects.equals(_description, other.getDescription())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_provider, other.getProvider())) {
                return false;
            }
            if (!Objects.equals(_version, other.getVersion())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VnffgdImpl otherImpl = (VnffgdImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.project.vnffgd.catalog.Vnffgd>>, Augmentation<ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.project.vnffgd.catalog.Vnffgd>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Vnffgd [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_description != null) {
                builder.append("_description=");
                builder.append(_description);
                builder.append(", ");
            }
            if (_id != null) {
                builder.append("_id=");
                builder.append(_id);
                builder.append(", ");
            }
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
            if (_provider != null) {
                builder.append("_provider=");
                builder.append(_provider);
                builder.append(", ");
            }
            if (_version != null) {
                builder.append("_version=");
                builder.append(_version);
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
