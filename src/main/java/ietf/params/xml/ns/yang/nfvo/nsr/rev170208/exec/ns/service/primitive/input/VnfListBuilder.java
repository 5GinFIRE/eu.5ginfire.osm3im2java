package ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.input;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.input.vnf.list.VnfPrimitive;

import java.util.Objects;
import java.math.BigInteger;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.input.VnfList} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.input.VnfList
 *
 */
public class VnfListBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.input.VnfList> {

    private VnfListKey _key;
    private BigInteger _memberVnfIndexRef;
    private List<VnfPrimitive> _vnfPrimitive;
    private Uuid _vnfrIdRef;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.input.VnfList>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.input.VnfList>> augmentation = Collections.emptyMap();

    public VnfListBuilder() {
    }

    public VnfListBuilder(VnfList base) {
        if (base.getKey() == null) {
            this._key = new VnfListKey(
                base.getMemberVnfIndexRef()
            );
            this._memberVnfIndexRef = base.getMemberVnfIndexRef();
        } else {
            this._key = base.getKey();
            this._memberVnfIndexRef = _key.getMemberVnfIndexRef();
        }
        this._vnfPrimitive = base.getVnfPrimitive();
        this._vnfrIdRef = base.getVnfrIdRef();
        if (base instanceof VnfListImpl) {
            VnfListImpl impl = (VnfListImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.input.VnfList> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.input.VnfList>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public VnfListKey getKey() {
        return _key;
    }
    
    public BigInteger getMemberVnfIndexRef() {
        return _memberVnfIndexRef;
    }
    
    public List<VnfPrimitive> getVnfPrimitive() {
        return _vnfPrimitive;
    }
    
    public Uuid getVnfrIdRef() {
        return _vnfrIdRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.input.VnfList>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public VnfListBuilder setKey(final VnfListKey value) {
        this._key = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKMEMBERVNFINDEXREFRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKMEMBERVNFINDEXREFRANGE_RANGES = a;
     }
     private static void checkMemberVnfIndexRefRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKMEMBERVNFINDEXREFRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKMEMBERVNFINDEXREFRANGE_RANGES)));
     }
    
    public VnfListBuilder setMemberVnfIndexRef(final BigInteger value) {
    if (value != null) {
        checkMemberVnfIndexRefRange(value);
    }
        this._memberVnfIndexRef = value;
        return this;
    }
    
     
    public VnfListBuilder setVnfPrimitive(final List<VnfPrimitive> value) {
        this._vnfPrimitive = value;
        return this;
    }
    
     
    public VnfListBuilder setVnfrIdRef(final Uuid value) {
        this._vnfrIdRef = value;
        return this;
    }
    
    public VnfListBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.input.VnfList>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.input.VnfList> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VnfListBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.input.VnfList>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public VnfList build() {
        return new VnfListImpl(this);
    }

    private static final class VnfListImpl implements VnfList {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.input.VnfList> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.input.VnfList.class;
        }

        private final VnfListKey _key;
        private final BigInteger _memberVnfIndexRef;
        private final List<VnfPrimitive> _vnfPrimitive;
        private final Uuid _vnfrIdRef;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.input.VnfList>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.input.VnfList>> augmentation = Collections.emptyMap();

        private VnfListImpl(VnfListBuilder base) {
            if (base.getKey() == null) {
                this._key = new VnfListKey(
                    base.getMemberVnfIndexRef()
                );
                this._memberVnfIndexRef = base.getMemberVnfIndexRef();
            } else {
                this._key = base.getKey();
                this._memberVnfIndexRef = _key.getMemberVnfIndexRef();
            }
            this._vnfPrimitive = base.getVnfPrimitive();
            this._vnfrIdRef = base.getVnfrIdRef();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.input.VnfList>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.input.VnfList>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.input.VnfList>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.input.VnfList>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public VnfListKey getKey() {
            return _key;
        }
        
        @Override
        public BigInteger getMemberVnfIndexRef() {
            return _memberVnfIndexRef;
        }
        
        @Override
        public List<VnfPrimitive> getVnfPrimitive() {
            return _vnfPrimitive;
        }
        
        @Override
        public Uuid getVnfrIdRef() {
            return _vnfrIdRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.input.VnfList>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_vnfPrimitive);
            result = prime * result + Objects.hashCode(_vnfrIdRef);
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
            if (!ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.input.VnfList.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.input.VnfList other = (ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.input.VnfList)obj;
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_memberVnfIndexRef, other.getMemberVnfIndexRef())) {
                return false;
            }
            if (!Objects.equals(_vnfPrimitive, other.getVnfPrimitive())) {
                return false;
            }
            if (!Objects.equals(_vnfrIdRef, other.getVnfrIdRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VnfListImpl otherImpl = (VnfListImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.input.VnfList>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.input.VnfList>> e : augmentation.entrySet()) {
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
            java.lang.String name = "VnfList [";
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
            if (_vnfPrimitive != null) {
                builder.append("_vnfPrimitive=");
                builder.append(_vnfPrimitive);
                builder.append(", ");
            }
            if (_vnfrIdRef != null) {
                builder.append("_vnfrIdRef=");
                builder.append(_vnfrIdRef);
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
