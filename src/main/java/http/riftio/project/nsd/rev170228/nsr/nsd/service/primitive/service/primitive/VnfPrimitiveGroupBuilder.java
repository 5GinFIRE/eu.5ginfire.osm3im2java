package http.riftio.project.nsd.rev170228.nsr.nsd.service.primitive.service.primitive;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import http.riftio.project.nsd.rev170228.nsr.nsd.service.primitive.service.primitive.vnf.primitive.group.Primitive;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link http.riftio.project.nsd.rev170228.nsr.nsd.service.primitive.service.primitive.VnfPrimitiveGroup} instances.
 * 
 * @see http.riftio.project.nsd.rev170228.nsr.nsd.service.primitive.service.primitive.VnfPrimitiveGroup
 *
 */
public class VnfPrimitiveGroupBuilder implements Builder<http.riftio.project.nsd.rev170228.nsr.nsd.service.primitive.service.primitive.VnfPrimitiveGroup> {

    private VnfPrimitiveGroupKey _key;
    private java.lang.String _memberVnfIndexRef;
    private List<Primitive> _primitive;
    private java.lang.Object _vnfdIdRef;
    private java.lang.Object _vnfdName;

    Map<java.lang.Class<? extends Augmentation<http.riftio.project.nsd.rev170228.nsr.nsd.service.primitive.service.primitive.VnfPrimitiveGroup>>, Augmentation<http.riftio.project.nsd.rev170228.nsr.nsd.service.primitive.service.primitive.VnfPrimitiveGroup>> augmentation = Collections.emptyMap();

    public VnfPrimitiveGroupBuilder() {
    }

    public VnfPrimitiveGroupBuilder(VnfPrimitiveGroup base) {
        if (base.getKey() == null) {
            this._key = new VnfPrimitiveGroupKey(
                base.getMemberVnfIndexRef()
            );
            this._memberVnfIndexRef = base.getMemberVnfIndexRef();
        } else {
            this._key = base.getKey();
            this._memberVnfIndexRef = _key.getMemberVnfIndexRef();
        }
        this._primitive = base.getPrimitive();
        this._vnfdIdRef = base.getVnfdIdRef();
        this._vnfdName = base.getVnfdName();
        if (base instanceof VnfPrimitiveGroupImpl) {
            VnfPrimitiveGroupImpl impl = (VnfPrimitiveGroupImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<http.riftio.project.nsd.rev170228.nsr.nsd.service.primitive.service.primitive.VnfPrimitiveGroup> casted =(AugmentationHolder<http.riftio.project.nsd.rev170228.nsr.nsd.service.primitive.service.primitive.VnfPrimitiveGroup>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public VnfPrimitiveGroupKey getKey() {
        return _key;
    }
    
    public java.lang.String getMemberVnfIndexRef() {
        return _memberVnfIndexRef;
    }
    
    public List<Primitive> getPrimitive() {
        return _primitive;
    }
    
    public java.lang.Object getVnfdIdRef() {
        return _vnfdIdRef;
    }
    
    public java.lang.Object getVnfdName() {
        return _vnfdName;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<http.riftio.project.nsd.rev170228.nsr.nsd.service.primitive.service.primitive.VnfPrimitiveGroup>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public VnfPrimitiveGroupBuilder setKey(final VnfPrimitiveGroupKey value) {
        this._key = value;
        return this;
    }
    
     
    public VnfPrimitiveGroupBuilder setMemberVnfIndexRef(final java.lang.String value) {
        this._memberVnfIndexRef = value;
        return this;
    }
    
     
    public VnfPrimitiveGroupBuilder setPrimitive(final List<Primitive> value) {
        this._primitive = value;
        return this;
    }
    
     
    public VnfPrimitiveGroupBuilder setVnfdIdRef(final java.lang.Object value) {
        this._vnfdIdRef = value;
        return this;
    }
    
     
    public VnfPrimitiveGroupBuilder setVnfdName(final java.lang.Object value) {
        this._vnfdName = value;
        return this;
    }
    
    public VnfPrimitiveGroupBuilder addAugmentation(java.lang.Class<? extends Augmentation<http.riftio.project.nsd.rev170228.nsr.nsd.service.primitive.service.primitive.VnfPrimitiveGroup>> augmentationType, Augmentation<http.riftio.project.nsd.rev170228.nsr.nsd.service.primitive.service.primitive.VnfPrimitiveGroup> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VnfPrimitiveGroupBuilder removeAugmentation(java.lang.Class<? extends Augmentation<http.riftio.project.nsd.rev170228.nsr.nsd.service.primitive.service.primitive.VnfPrimitiveGroup>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public VnfPrimitiveGroup build() {
        return new VnfPrimitiveGroupImpl(this);
    }

    private static final class VnfPrimitiveGroupImpl implements VnfPrimitiveGroup {

        @Override
        public java.lang.Class<http.riftio.project.nsd.rev170228.nsr.nsd.service.primitive.service.primitive.VnfPrimitiveGroup> getImplementedInterface() {
            return http.riftio.project.nsd.rev170228.nsr.nsd.service.primitive.service.primitive.VnfPrimitiveGroup.class;
        }

        private final VnfPrimitiveGroupKey _key;
        private final java.lang.String _memberVnfIndexRef;
        private final List<Primitive> _primitive;
        private final java.lang.Object _vnfdIdRef;
        private final java.lang.Object _vnfdName;

        private Map<java.lang.Class<? extends Augmentation<http.riftio.project.nsd.rev170228.nsr.nsd.service.primitive.service.primitive.VnfPrimitiveGroup>>, Augmentation<http.riftio.project.nsd.rev170228.nsr.nsd.service.primitive.service.primitive.VnfPrimitiveGroup>> augmentation = Collections.emptyMap();

        private VnfPrimitiveGroupImpl(VnfPrimitiveGroupBuilder base) {
            if (base.getKey() == null) {
                this._key = new VnfPrimitiveGroupKey(
                    base.getMemberVnfIndexRef()
                );
                this._memberVnfIndexRef = base.getMemberVnfIndexRef();
            } else {
                this._key = base.getKey();
                this._memberVnfIndexRef = _key.getMemberVnfIndexRef();
            }
            this._primitive = base.getPrimitive();
            this._vnfdIdRef = base.getVnfdIdRef();
            this._vnfdName = base.getVnfdName();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.project.nsd.rev170228.nsr.nsd.service.primitive.service.primitive.VnfPrimitiveGroup>>, Augmentation<http.riftio.project.nsd.rev170228.nsr.nsd.service.primitive.service.primitive.VnfPrimitiveGroup>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<http.riftio.project.nsd.rev170228.nsr.nsd.service.primitive.service.primitive.VnfPrimitiveGroup>>, Augmentation<http.riftio.project.nsd.rev170228.nsr.nsd.service.primitive.service.primitive.VnfPrimitiveGroup>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public VnfPrimitiveGroupKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.String getMemberVnfIndexRef() {
            return _memberVnfIndexRef;
        }
        
        @Override
        public List<Primitive> getPrimitive() {
            return _primitive;
        }
        
        @Override
        public java.lang.Object getVnfdIdRef() {
            return _vnfdIdRef;
        }
        
        @Override
        public java.lang.Object getVnfdName() {
            return _vnfdName;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<http.riftio.project.nsd.rev170228.nsr.nsd.service.primitive.service.primitive.VnfPrimitiveGroup>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_memberVnfIndexRef);
            result = prime * result + Objects.hashCode(_primitive);
            result = prime * result + Objects.hashCode(_vnfdIdRef);
            result = prime * result + Objects.hashCode(_vnfdName);
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
            if (!http.riftio.project.nsd.rev170228.nsr.nsd.service.primitive.service.primitive.VnfPrimitiveGroup.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            http.riftio.project.nsd.rev170228.nsr.nsd.service.primitive.service.primitive.VnfPrimitiveGroup other = (http.riftio.project.nsd.rev170228.nsr.nsd.service.primitive.service.primitive.VnfPrimitiveGroup)obj;
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_memberVnfIndexRef, other.getMemberVnfIndexRef())) {
                return false;
            }
            if (!Objects.equals(_primitive, other.getPrimitive())) {
                return false;
            }
            if (!Objects.equals(_vnfdIdRef, other.getVnfdIdRef())) {
                return false;
            }
            if (!Objects.equals(_vnfdName, other.getVnfdName())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VnfPrimitiveGroupImpl otherImpl = (VnfPrimitiveGroupImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.project.nsd.rev170228.nsr.nsd.service.primitive.service.primitive.VnfPrimitiveGroup>>, Augmentation<http.riftio.project.nsd.rev170228.nsr.nsd.service.primitive.service.primitive.VnfPrimitiveGroup>> e : augmentation.entrySet()) {
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
            java.lang.String name = "VnfPrimitiveGroup [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_memberVnfIndexRef != null) {
                builder.append("_memberVnfIndexRef=");
                builder.append(_memberVnfIndexRef);
                builder.append(", ");
            }
            if (_primitive != null) {
                builder.append("_primitive=");
                builder.append(_primitive);
                builder.append(", ");
            }
            if (_vnfdIdRef != null) {
                builder.append("_vnfdIdRef=");
                builder.append(_vnfdIdRef);
                builder.append(", ");
            }
            if (_vnfdName != null) {
                builder.append("_vnfdName=");
                builder.append(_vnfdName);
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
