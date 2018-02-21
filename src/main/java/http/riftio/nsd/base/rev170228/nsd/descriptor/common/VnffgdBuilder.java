package http.riftio.nsd.base.rev170228.nsd.descriptor.common;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.Classifier;
import http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.Rsp;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link http.riftio.nsd.base.rev170228.nsd.descriptor.common.Vnffgd} instances.
 * 
 * @see http.riftio.nsd.base.rev170228.nsd.descriptor.common.Vnffgd
 *
 */
public class VnffgdBuilder implements Builder<http.riftio.nsd.base.rev170228.nsd.descriptor.common.Vnffgd> {

    private List<Classifier> _classifier;
    private java.lang.String _description;
    private java.lang.String _id;
    private VnffgdKey _key;
    private java.lang.String _name;
    private List<Rsp> _rsp;
    private java.lang.String _shortName;
    private java.lang.String _vendor;
    private java.lang.String _version;

    Map<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.Vnffgd>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.Vnffgd>> augmentation = Collections.emptyMap();

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
        this._classifier = base.getClassifier();
        this._description = base.getDescription();
        this._name = base.getName();
        this._rsp = base.getRsp();
        this._shortName = base.getShortName();
        this._vendor = base.getVendor();
        this._version = base.getVersion();
        if (base instanceof VnffgdImpl) {
            VnffgdImpl impl = (VnffgdImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<http.riftio.nsd.base.rev170228.nsd.descriptor.common.Vnffgd> casted =(AugmentationHolder<http.riftio.nsd.base.rev170228.nsd.descriptor.common.Vnffgd>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public List<Classifier> getClassifier() {
        return _classifier;
    }
    
    public java.lang.String getDescription() {
        return _description;
    }
    
    public java.lang.String getId() {
        return _id;
    }
    
    public VnffgdKey getKey() {
        return _key;
    }
    
    public java.lang.String getName() {
        return _name;
    }
    
    public List<Rsp> getRsp() {
        return _rsp;
    }
    
    public java.lang.String getShortName() {
        return _shortName;
    }
    
    public java.lang.String getVendor() {
        return _vendor;
    }
    
    public java.lang.String getVersion() {
        return _version;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.Vnffgd>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public VnffgdBuilder setClassifier(final List<Classifier> value) {
        this._classifier = value;
        return this;
    }
    
     
    public VnffgdBuilder setDescription(final java.lang.String value) {
        this._description = value;
        return this;
    }
    
     
    public VnffgdBuilder setId(final java.lang.String value) {
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
    
     
    public VnffgdBuilder setRsp(final List<Rsp> value) {
        this._rsp = value;
        return this;
    }
    
     
    public VnffgdBuilder setShortName(final java.lang.String value) {
        this._shortName = value;
        return this;
    }
    
     
    public VnffgdBuilder setVendor(final java.lang.String value) {
        this._vendor = value;
        return this;
    }
    
     
    public VnffgdBuilder setVersion(final java.lang.String value) {
        this._version = value;
        return this;
    }
    
    public VnffgdBuilder addAugmentation(java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.Vnffgd>> augmentationType, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.Vnffgd> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VnffgdBuilder removeAugmentation(java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.Vnffgd>> augmentationType) {
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
        public java.lang.Class<http.riftio.nsd.base.rev170228.nsd.descriptor.common.Vnffgd> getImplementedInterface() {
            return http.riftio.nsd.base.rev170228.nsd.descriptor.common.Vnffgd.class;
        }

        private final List<Classifier> _classifier;
        private final java.lang.String _description;
        private final java.lang.String _id;
        private final VnffgdKey _key;
        private final java.lang.String _name;
        private final List<Rsp> _rsp;
        private final java.lang.String _shortName;
        private final java.lang.String _vendor;
        private final java.lang.String _version;

        private Map<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.Vnffgd>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.Vnffgd>> augmentation = Collections.emptyMap();

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
            this._classifier = base.getClassifier();
            this._description = base.getDescription();
            this._name = base.getName();
            this._rsp = base.getRsp();
            this._shortName = base.getShortName();
            this._vendor = base.getVendor();
            this._version = base.getVersion();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.Vnffgd>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.Vnffgd>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.Vnffgd>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.Vnffgd>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<Classifier> getClassifier() {
            return _classifier;
        }
        
        @Override
        public java.lang.String getDescription() {
            return _description;
        }
        
        @Override
        public java.lang.String getId() {
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
        public List<Rsp> getRsp() {
            return _rsp;
        }
        
        @Override
        public java.lang.String getShortName() {
            return _shortName;
        }
        
        @Override
        public java.lang.String getVendor() {
            return _vendor;
        }
        
        @Override
        public java.lang.String getVersion() {
            return _version;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.Vnffgd>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_classifier);
            result = prime * result + Objects.hashCode(_description);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_rsp);
            result = prime * result + Objects.hashCode(_shortName);
            result = prime * result + Objects.hashCode(_vendor);
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
            if (!http.riftio.nsd.base.rev170228.nsd.descriptor.common.Vnffgd.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            http.riftio.nsd.base.rev170228.nsd.descriptor.common.Vnffgd other = (http.riftio.nsd.base.rev170228.nsd.descriptor.common.Vnffgd)obj;
            if (!Objects.equals(_classifier, other.getClassifier())) {
                return false;
            }
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
            if (!Objects.equals(_rsp, other.getRsp())) {
                return false;
            }
            if (!Objects.equals(_shortName, other.getShortName())) {
                return false;
            }
            if (!Objects.equals(_vendor, other.getVendor())) {
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
                for (Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.Vnffgd>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.Vnffgd>> e : augmentation.entrySet()) {
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
            if (_classifier != null) {
                builder.append("_classifier=");
                builder.append(_classifier);
                builder.append(", ");
            }
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
            if (_rsp != null) {
                builder.append("_rsp=");
                builder.append(_rsp);
                builder.append(", ");
            }
            if (_shortName != null) {
                builder.append("_shortName=");
                builder.append(_shortName);
                builder.append(", ");
            }
            if (_vendor != null) {
                builder.append("_vendor=");
                builder.append(_vendor);
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
