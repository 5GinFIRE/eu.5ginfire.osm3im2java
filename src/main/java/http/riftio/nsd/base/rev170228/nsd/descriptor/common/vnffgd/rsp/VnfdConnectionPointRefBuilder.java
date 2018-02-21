package http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.rsp;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.rsp.VnfdConnectionPointRef} instances.
 * 
 * @see http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.rsp.VnfdConnectionPointRef
 *
 */
public class VnfdConnectionPointRefBuilder implements Builder<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.rsp.VnfdConnectionPointRef> {

    private VnfdConnectionPointRefKey _key;
    private java.lang.String _memberVnfIndexRef;
    private java.lang.Short _order;
    private java.lang.String _vnfdConnectionPointRef;
    private java.lang.Object _vnfdIdRef;

    Map<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.rsp.VnfdConnectionPointRef>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.rsp.VnfdConnectionPointRef>> augmentation = Collections.emptyMap();

    public VnfdConnectionPointRefBuilder() {
    }

    public VnfdConnectionPointRefBuilder(VnfdConnectionPointRef base) {
        if (base.getKey() == null) {
            this._key = new VnfdConnectionPointRefKey(
                base.getMemberVnfIndexRef()
            );
            this._memberVnfIndexRef = base.getMemberVnfIndexRef();
        } else {
            this._key = base.getKey();
            this._memberVnfIndexRef = _key.getMemberVnfIndexRef();
        }
        this._order = base.getOrder();
        this._vnfdConnectionPointRef = base.getVnfdConnectionPointRef();
        this._vnfdIdRef = base.getVnfdIdRef();
        if (base instanceof VnfdConnectionPointRefImpl) {
            VnfdConnectionPointRefImpl impl = (VnfdConnectionPointRefImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.rsp.VnfdConnectionPointRef> casted =(AugmentationHolder<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.rsp.VnfdConnectionPointRef>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public VnfdConnectionPointRefKey getKey() {
        return _key;
    }
    
    public java.lang.String getMemberVnfIndexRef() {
        return _memberVnfIndexRef;
    }
    
    public java.lang.Short getOrder() {
        return _order;
    }
    
    public java.lang.String getVnfdConnectionPointRef() {
        return _vnfdConnectionPointRef;
    }
    
    public java.lang.Object getVnfdIdRef() {
        return _vnfdIdRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.rsp.VnfdConnectionPointRef>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public VnfdConnectionPointRefBuilder setKey(final VnfdConnectionPointRefKey value) {
        this._key = value;
        return this;
    }
    
     
    public VnfdConnectionPointRefBuilder setMemberVnfIndexRef(final java.lang.String value) {
        this._memberVnfIndexRef = value;
        return this;
    }
    
     
     private static void checkOrderRange(final short value) {
         if (value >= (short)0 && value <= (short)255) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..255]].", value));
     }
    
    public VnfdConnectionPointRefBuilder setOrder(final java.lang.Short value) {
    if (value != null) {
        checkOrderRange(value);
    }
        this._order = value;
        return this;
    }
    
     
    public VnfdConnectionPointRefBuilder setVnfdConnectionPointRef(final java.lang.String value) {
        this._vnfdConnectionPointRef = value;
        return this;
    }
    
     
    public VnfdConnectionPointRefBuilder setVnfdIdRef(final java.lang.Object value) {
        this._vnfdIdRef = value;
        return this;
    }
    
    public VnfdConnectionPointRefBuilder addAugmentation(java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.rsp.VnfdConnectionPointRef>> augmentationType, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.rsp.VnfdConnectionPointRef> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VnfdConnectionPointRefBuilder removeAugmentation(java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.rsp.VnfdConnectionPointRef>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public VnfdConnectionPointRef build() {
        return new VnfdConnectionPointRefImpl(this);
    }

    private static final class VnfdConnectionPointRefImpl implements VnfdConnectionPointRef {

        @Override
        public java.lang.Class<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.rsp.VnfdConnectionPointRef> getImplementedInterface() {
            return http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.rsp.VnfdConnectionPointRef.class;
        }

        private final VnfdConnectionPointRefKey _key;
        private final java.lang.String _memberVnfIndexRef;
        private final java.lang.Short _order;
        private final java.lang.String _vnfdConnectionPointRef;
        private final java.lang.Object _vnfdIdRef;

        private Map<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.rsp.VnfdConnectionPointRef>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.rsp.VnfdConnectionPointRef>> augmentation = Collections.emptyMap();

        private VnfdConnectionPointRefImpl(VnfdConnectionPointRefBuilder base) {
            if (base.getKey() == null) {
                this._key = new VnfdConnectionPointRefKey(
                    base.getMemberVnfIndexRef()
                );
                this._memberVnfIndexRef = base.getMemberVnfIndexRef();
            } else {
                this._key = base.getKey();
                this._memberVnfIndexRef = _key.getMemberVnfIndexRef();
            }
            this._order = base.getOrder();
            this._vnfdConnectionPointRef = base.getVnfdConnectionPointRef();
            this._vnfdIdRef = base.getVnfdIdRef();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.rsp.VnfdConnectionPointRef>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.rsp.VnfdConnectionPointRef>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.rsp.VnfdConnectionPointRef>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.rsp.VnfdConnectionPointRef>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public VnfdConnectionPointRefKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.String getMemberVnfIndexRef() {
            return _memberVnfIndexRef;
        }
        
        @Override
        public java.lang.Short getOrder() {
            return _order;
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
        public <E extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.rsp.VnfdConnectionPointRef>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_order);
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
            if (!http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.rsp.VnfdConnectionPointRef.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.rsp.VnfdConnectionPointRef other = (http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.rsp.VnfdConnectionPointRef)obj;
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_memberVnfIndexRef, other.getMemberVnfIndexRef())) {
                return false;
            }
            if (!Objects.equals(_order, other.getOrder())) {
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
                VnfdConnectionPointRefImpl otherImpl = (VnfdConnectionPointRefImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.rsp.VnfdConnectionPointRef>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.rsp.VnfdConnectionPointRef>> e : augmentation.entrySet()) {
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
            java.lang.String name = "VnfdConnectionPointRef [";
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
            if (_order != null) {
                builder.append("_order=");
                builder.append(_order);
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
