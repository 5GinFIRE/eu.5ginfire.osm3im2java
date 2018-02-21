package http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.classifier.MatchAttributes;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.Classifier} instances.
 * 
 * @see http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.Classifier
 *
 */
public class ClassifierBuilder implements Builder<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.Classifier> {

    private java.lang.String _id;
    private ClassifierKey _key;
    private List<MatchAttributes> _matchAttributes;
    private java.lang.String _memberVnfIndexRef;
    private java.lang.String _name;
    private java.lang.String _rspIdRef;
    private java.lang.String _vnfdConnectionPointRef;
    private java.lang.Object _vnfdIdRef;

    Map<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.Classifier>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.Classifier>> augmentation = Collections.emptyMap();

    public ClassifierBuilder() {
    }

    public ClassifierBuilder(Classifier base) {
        if (base.getKey() == null) {
            this._key = new ClassifierKey(
                base.getId()
            );
            this._id = base.getId();
        } else {
            this._key = base.getKey();
            this._id = _key.getId();
        }
        this._matchAttributes = base.getMatchAttributes();
        this._memberVnfIndexRef = base.getMemberVnfIndexRef();
        this._name = base.getName();
        this._rspIdRef = base.getRspIdRef();
        this._vnfdConnectionPointRef = base.getVnfdConnectionPointRef();
        this._vnfdIdRef = base.getVnfdIdRef();
        if (base instanceof ClassifierImpl) {
            ClassifierImpl impl = (ClassifierImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.Classifier> casted =(AugmentationHolder<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.Classifier>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public java.lang.String getId() {
        return _id;
    }
    
    public ClassifierKey getKey() {
        return _key;
    }
    
    public List<MatchAttributes> getMatchAttributes() {
        return _matchAttributes;
    }
    
    public java.lang.String getMemberVnfIndexRef() {
        return _memberVnfIndexRef;
    }
    
    public java.lang.String getName() {
        return _name;
    }
    
    public java.lang.String getRspIdRef() {
        return _rspIdRef;
    }
    
    public java.lang.String getVnfdConnectionPointRef() {
        return _vnfdConnectionPointRef;
    }
    
    public java.lang.Object getVnfdIdRef() {
        return _vnfdIdRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.Classifier>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public ClassifierBuilder setId(final java.lang.String value) {
        this._id = value;
        return this;
    }
    
     
    public ClassifierBuilder setKey(final ClassifierKey value) {
        this._key = value;
        return this;
    }
    
     
    public ClassifierBuilder setMatchAttributes(final List<MatchAttributes> value) {
        this._matchAttributes = value;
        return this;
    }
    
     
    public ClassifierBuilder setMemberVnfIndexRef(final java.lang.String value) {
        this._memberVnfIndexRef = value;
        return this;
    }
    
     
    public ClassifierBuilder setName(final java.lang.String value) {
        this._name = value;
        return this;
    }
    
     
    public ClassifierBuilder setRspIdRef(final java.lang.String value) {
        this._rspIdRef = value;
        return this;
    }
    
     
    public ClassifierBuilder setVnfdConnectionPointRef(final java.lang.String value) {
        this._vnfdConnectionPointRef = value;
        return this;
    }
    
     
    public ClassifierBuilder setVnfdIdRef(final java.lang.Object value) {
        this._vnfdIdRef = value;
        return this;
    }
    
    public ClassifierBuilder addAugmentation(java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.Classifier>> augmentationType, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.Classifier> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ClassifierBuilder removeAugmentation(java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.Classifier>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Classifier build() {
        return new ClassifierImpl(this);
    }

    private static final class ClassifierImpl implements Classifier {

        @Override
        public java.lang.Class<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.Classifier> getImplementedInterface() {
            return http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.Classifier.class;
        }

        private final java.lang.String _id;
        private final ClassifierKey _key;
        private final List<MatchAttributes> _matchAttributes;
        private final java.lang.String _memberVnfIndexRef;
        private final java.lang.String _name;
        private final java.lang.String _rspIdRef;
        private final java.lang.String _vnfdConnectionPointRef;
        private final java.lang.Object _vnfdIdRef;

        private Map<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.Classifier>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.Classifier>> augmentation = Collections.emptyMap();

        private ClassifierImpl(ClassifierBuilder base) {
            if (base.getKey() == null) {
                this._key = new ClassifierKey(
                    base.getId()
                );
                this._id = base.getId();
            } else {
                this._key = base.getKey();
                this._id = _key.getId();
            }
            this._matchAttributes = base.getMatchAttributes();
            this._memberVnfIndexRef = base.getMemberVnfIndexRef();
            this._name = base.getName();
            this._rspIdRef = base.getRspIdRef();
            this._vnfdConnectionPointRef = base.getVnfdConnectionPointRef();
            this._vnfdIdRef = base.getVnfdIdRef();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.Classifier>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.Classifier>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.Classifier>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.Classifier>>singletonMap(e.getKey(), e.getValue());
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
        public ClassifierKey getKey() {
            return _key;
        }
        
        @Override
        public List<MatchAttributes> getMatchAttributes() {
            return _matchAttributes;
        }
        
        @Override
        public java.lang.String getMemberVnfIndexRef() {
            return _memberVnfIndexRef;
        }
        
        @Override
        public java.lang.String getName() {
            return _name;
        }
        
        @Override
        public java.lang.String getRspIdRef() {
            return _rspIdRef;
        }
        
        @Override
        public java.lang.String getVnfdConnectionPointRef() {
            return _vnfdConnectionPointRef;
        }
        
        @Override
        public java.lang.Object getVnfdIdRef() {
            return _vnfdIdRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.Classifier>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_matchAttributes);
            result = prime * result + Objects.hashCode(_memberVnfIndexRef);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_rspIdRef);
            result = prime * result + Objects.hashCode(_vnfdConnectionPointRef);
            result = prime * result + Objects.hashCode(_vnfdIdRef);
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
            if (!http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.Classifier.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.Classifier other = (http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.Classifier)obj;
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_matchAttributes, other.getMatchAttributes())) {
                return false;
            }
            if (!Objects.equals(_memberVnfIndexRef, other.getMemberVnfIndexRef())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_rspIdRef, other.getRspIdRef())) {
                return false;
            }
            if (!Objects.equals(_vnfdConnectionPointRef, other.getVnfdConnectionPointRef())) {
                return false;
            }
            if (!Objects.equals(_vnfdIdRef, other.getVnfdIdRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ClassifierImpl otherImpl = (ClassifierImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.Classifier>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.Classifier>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Classifier [";
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
            if (_matchAttributes != null) {
                builder.append("_matchAttributes=");
                builder.append(_matchAttributes);
                builder.append(", ");
            }
            if (_memberVnfIndexRef != null) {
                builder.append("_memberVnfIndexRef=");
                builder.append(_memberVnfIndexRef);
                builder.append(", ");
            }
            if (_name != null) {
                builder.append("_name=");
                builder.append(_name);
                builder.append(", ");
            }
            if (_rspIdRef != null) {
                builder.append("_rspIdRef=");
                builder.append(_rspIdRef);
                builder.append(", ");
            }
            if (_vnfdConnectionPointRef != null) {
                builder.append("_vnfdConnectionPointRef=");
                builder.append(_vnfdConnectionPointRef);
                builder.append(", ");
            }
            if (_vnfdIdRef != null) {
                builder.append("_vnfdIdRef=");
                builder.append(_vnfdIdRef);
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
