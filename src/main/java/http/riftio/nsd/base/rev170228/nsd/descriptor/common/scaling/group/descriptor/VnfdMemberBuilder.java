package http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.VnfdMember} instances.
 * 
 * @see http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.VnfdMember
 *
 */
public class VnfdMemberBuilder implements Builder<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.VnfdMember> {

    private java.lang.Long _count;
    private VnfdMemberKey _key;
    private java.lang.String _memberVnfIndexRef;

    Map<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.VnfdMember>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.VnfdMember>> augmentation = Collections.emptyMap();

    public VnfdMemberBuilder() {
    }

    public VnfdMemberBuilder(VnfdMember base) {
        if (base.getKey() == null) {
            this._key = new VnfdMemberKey(
                base.getMemberVnfIndexRef()
            );
            this._memberVnfIndexRef = base.getMemberVnfIndexRef();
        } else {
            this._key = base.getKey();
            this._memberVnfIndexRef = _key.getMemberVnfIndexRef();
        }
        this._count = base.getCount();
        if (base instanceof VnfdMemberImpl) {
            VnfdMemberImpl impl = (VnfdMemberImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.VnfdMember> casted =(AugmentationHolder<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.VnfdMember>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public java.lang.Long getCount() {
        return _count;
    }
    
    public VnfdMemberKey getKey() {
        return _key;
    }
    
    public java.lang.String getMemberVnfIndexRef() {
        return _memberVnfIndexRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.VnfdMember>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static void checkCountRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..4294967295]].", value));
     }
    
    public VnfdMemberBuilder setCount(final java.lang.Long value) {
    if (value != null) {
        checkCountRange(value);
    }
        this._count = value;
        return this;
    }
    
     
    public VnfdMemberBuilder setKey(final VnfdMemberKey value) {
        this._key = value;
        return this;
    }
    
     
    public VnfdMemberBuilder setMemberVnfIndexRef(final java.lang.String value) {
        this._memberVnfIndexRef = value;
        return this;
    }
    
    public VnfdMemberBuilder addAugmentation(java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.VnfdMember>> augmentationType, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.VnfdMember> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VnfdMemberBuilder removeAugmentation(java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.VnfdMember>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public VnfdMember build() {
        return new VnfdMemberImpl(this);
    }

    private static final class VnfdMemberImpl implements VnfdMember {

        @Override
        public java.lang.Class<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.VnfdMember> getImplementedInterface() {
            return http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.VnfdMember.class;
        }

        private final java.lang.Long _count;
        private final VnfdMemberKey _key;
        private final java.lang.String _memberVnfIndexRef;

        private Map<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.VnfdMember>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.VnfdMember>> augmentation = Collections.emptyMap();

        private VnfdMemberImpl(VnfdMemberBuilder base) {
            if (base.getKey() == null) {
                this._key = new VnfdMemberKey(
                    base.getMemberVnfIndexRef()
                );
                this._memberVnfIndexRef = base.getMemberVnfIndexRef();
            } else {
                this._key = base.getKey();
                this._memberVnfIndexRef = _key.getMemberVnfIndexRef();
            }
            this._count = base.getCount();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.VnfdMember>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.VnfdMember>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.VnfdMember>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.VnfdMember>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Long getCount() {
            return _count;
        }
        
        @Override
        public VnfdMemberKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.String getMemberVnfIndexRef() {
            return _memberVnfIndexRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.VnfdMember>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_count);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_memberVnfIndexRef);
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
            if (!http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.VnfdMember.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.VnfdMember other = (http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.VnfdMember)obj;
            if (!Objects.equals(_count, other.getCount())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_memberVnfIndexRef, other.getMemberVnfIndexRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VnfdMemberImpl otherImpl = (VnfdMemberImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.VnfdMember>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.VnfdMember>> e : augmentation.entrySet()) {
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
            java.lang.String name = "VnfdMember [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_count != null) {
                builder.append("_count=");
                builder.append(_count);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_memberVnfIndexRef != null) {
                builder.append("_memberVnfIndexRef=");
                builder.append(_memberVnfIndexRef);
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
