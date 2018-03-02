package http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.rsp.VnfdConnectionPointRef;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.Rsp} instances.
 * 
 * @see http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.Rsp
 *
 */
public class RspBuilder implements Builder<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.Rsp> {

    private java.lang.String _id;
    private RspKey _key;
    private java.lang.String _name;
    private List<VnfdConnectionPointRef> _vnfdConnectionPointRef;

    Map<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.Rsp>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.Rsp>> augmentation = Collections.emptyMap();

    public RspBuilder() {
    }

    public RspBuilder(Rsp base) {
        if (base.getKey() == null) {
            this._key = new RspKey(
                base.getId()
            );
            this._id = base.getId();
        } else {
            this._key = base.getKey();
            this._id = _key.getId();
        }
        this._name = base.getName();
        this._vnfdConnectionPointRef = base.getVnfdConnectionPointRef();
        if (base instanceof RspImpl) {
            RspImpl impl = (RspImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.Rsp> casted =(AugmentationHolder<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.Rsp>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public java.lang.String getId() {
        return _id;
    }
    
    public RspKey getKey() {
        return _key;
    }
    
    public java.lang.String getName() {
        return _name;
    }
    
    public List<VnfdConnectionPointRef> getVnfdConnectionPointRef() {
        return _vnfdConnectionPointRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.Rsp>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public RspBuilder setId(final java.lang.String value) {
        this._id = value;
        return this;
    }
    
     
    public RspBuilder setKey(final RspKey value) {
        this._key = value;
        return this;
    }
    
     
    public RspBuilder setName(final java.lang.String value) {
        this._name = value;
        return this;
    }
    
     
    public RspBuilder setVnfdConnectionPointRef(final List<VnfdConnectionPointRef> value) {
        this._vnfdConnectionPointRef = value;
        return this;
    }
    
    public RspBuilder addAugmentation(java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.Rsp>> augmentationType, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.Rsp> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public RspBuilder removeAugmentation(java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.Rsp>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Rsp build() {
        return new RspImpl(this);
    }

    private static final class RspImpl implements Rsp {

        @Override
        public java.lang.Class<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.Rsp> getImplementedInterface() {
            return http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.Rsp.class;
        }

        private final java.lang.String _id;
        private final RspKey _key;
        private final java.lang.String _name;
        private final List<VnfdConnectionPointRef> _vnfdConnectionPointRef;

        private Map<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.Rsp>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.Rsp>> augmentation = Collections.emptyMap();

        private RspImpl(RspBuilder base) {
            if (base.getKey() == null) {
                this._key = new RspKey(
                    base.getId()
                );
                this._id = base.getId();
            } else {
                this._key = base.getKey();
                this._id = _key.getId();
            }
            this._name = base.getName();
            this._vnfdConnectionPointRef = base.getVnfdConnectionPointRef();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.Rsp>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.Rsp>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.Rsp>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.Rsp>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getId() {
            return _id;
        }
        
        @Override
        public RspKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.String getName() {
            return _name;
        }
        
        @Override
        public List<VnfdConnectionPointRef> getVnfdConnectionPointRef() {
            return _vnfdConnectionPointRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.Rsp>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_vnfdConnectionPointRef);
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
            if (!http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.Rsp.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.Rsp other = (http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.Rsp)obj;
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_vnfdConnectionPointRef, other.getVnfdConnectionPointRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                RspImpl otherImpl = (RspImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.Rsp>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.Rsp>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Rsp [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
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
            if (_vnfdConnectionPointRef != null) {
                builder.append("_vnfdConnectionPointRef=");
                builder.append(_vnfdConnectionPointRef);
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
