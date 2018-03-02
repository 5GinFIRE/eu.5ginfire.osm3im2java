package http.riftio.vnfd.base.rev170228.vnfd.descriptor.placement.groups;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import com.fasterxml.jackson.annotation.JsonProperty;

import http.riftio.vnfd.base.rev170228.vnfd.descriptor.PlacementGroupsBuilder;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link http.riftio.vnfd.base.rev170228.vnfd.descriptor.placement.groups.MemberVdus} instances.
 * 
 * @see http.riftio.vnfd.base.rev170228.vnfd.descriptor.placement.groups.MemberVdus
 *
 */
public class MemberVdusBuilder implements Builder<http.riftio.vnfd.base.rev170228.vnfd.descriptor.placement.groups.MemberVdus> {

    private MemberVdusKey _key;
    private java.lang.String _memberVduRef;

    Map<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.placement.groups.MemberVdus>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.placement.groups.MemberVdus>> augmentation = Collections.emptyMap();

    public MemberVdusBuilder() {
    }

    public MemberVdusBuilder(MemberVdus base) {
        if (base.getKey() == null) {
            this._key = new MemberVdusKey(
                base.getMemberVduRef()
            );
            this._memberVduRef = base.getMemberVduRef();
        } else {
            this._key = base.getKey();
            this._memberVduRef = _key.getMemberVduRef();
        }
        if (base instanceof MemberVdusImpl) {
            MemberVdusImpl impl = (MemberVdusImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<http.riftio.vnfd.base.rev170228.vnfd.descriptor.placement.groups.MemberVdus> casted =(AugmentationHolder<http.riftio.vnfd.base.rev170228.vnfd.descriptor.placement.groups.MemberVdus>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public MemberVdusKey getKey() {
        return _key;
    }
    
    public java.lang.String getMemberVduRef() {
        return _memberVduRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.placement.groups.MemberVdus>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public MemberVdusBuilder setKey(final MemberVdusKey value) {
        this._key = value;
        return this;
    }
    
     
    public MemberVdusBuilder setMemberVduRef(final java.lang.String value) {
        this._memberVduRef = value;
        return this;
    }
    
    public MemberVdusBuilder addAugmentation(java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.placement.groups.MemberVdus>> augmentationType, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.placement.groups.MemberVdus> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public MemberVdusBuilder removeAugmentation(java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.placement.groups.MemberVdus>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public MemberVdus build() {
        return new MemberVdusImpl(this);
    }

    public static final class MemberVdusImpl implements MemberVdus {

        @Override
        public java.lang.Class<http.riftio.vnfd.base.rev170228.vnfd.descriptor.placement.groups.MemberVdus> getImplementedInterface() {
            return http.riftio.vnfd.base.rev170228.vnfd.descriptor.placement.groups.MemberVdus.class;
        }

        private final MemberVdusKey _key;
        @JsonProperty("member-vdu-ref")
        private final java.lang.String _memberVduRef;

        private Map<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.placement.groups.MemberVdus>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.placement.groups.MemberVdus>> augmentation = Collections.emptyMap();

        private MemberVdusImpl(MemberVdusBuilder base) {
            if (base.getKey() == null) {
                this._key = new MemberVdusKey(
                    base.getMemberVduRef()
                );
                this._memberVduRef = base.getMemberVduRef();
            } else {
                this._key = base.getKey();
                this._memberVduRef = _key.getMemberVduRef();
            }
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.placement.groups.MemberVdus>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.placement.groups.MemberVdus>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.placement.groups.MemberVdus>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.placement.groups.MemberVdus>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }
        
        public MemberVdusImpl(){
          	this( new MemberVdusBuilder() );
        }

        @Override
        public MemberVdusKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.String getMemberVduRef() {
            return _memberVduRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.placement.groups.MemberVdus>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_memberVduRef);
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
            if (!http.riftio.vnfd.base.rev170228.vnfd.descriptor.placement.groups.MemberVdus.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            http.riftio.vnfd.base.rev170228.vnfd.descriptor.placement.groups.MemberVdus other = (http.riftio.vnfd.base.rev170228.vnfd.descriptor.placement.groups.MemberVdus)obj;
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_memberVduRef, other.getMemberVduRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                MemberVdusImpl otherImpl = (MemberVdusImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.placement.groups.MemberVdus>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.placement.groups.MemberVdus>> e : augmentation.entrySet()) {
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
            java.lang.String name = "MemberVdus [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_memberVduRef != null) {
                builder.append("_memberVduRef=");
                builder.append(_memberVduRef);
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
