package ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output.vnf.out.list.VnfOutPrimitive;

import java.util.Objects;
import java.math.BigInteger;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output.VnfOutList} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output.VnfOutList
 *
 */
public class VnfOutListBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output.VnfOutList> {

    private VnfOutListKey _key;
    private BigInteger _memberVnfIndexRef;
    private List<VnfOutPrimitive> _vnfOutPrimitive;
    private Uuid _vnfrIdRef;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output.VnfOutList>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output.VnfOutList>> augmentation = Collections.emptyMap();

    public VnfOutListBuilder() {
    }

    public VnfOutListBuilder(VnfOutList base) {
        if (base.getKey() == null) {
            this._key = new VnfOutListKey(
                base.getMemberVnfIndexRef()
            );
            this._memberVnfIndexRef = base.getMemberVnfIndexRef();
        } else {
            this._key = base.getKey();
            this._memberVnfIndexRef = _key.getMemberVnfIndexRef();
        }
        this._vnfOutPrimitive = base.getVnfOutPrimitive();
        this._vnfrIdRef = base.getVnfrIdRef();
        if (base instanceof VnfOutListImpl) {
            VnfOutListImpl impl = (VnfOutListImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output.VnfOutList> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output.VnfOutList>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public VnfOutListKey getKey() {
        return _key;
    }
    
    public BigInteger getMemberVnfIndexRef() {
        return _memberVnfIndexRef;
    }
    
    public List<VnfOutPrimitive> getVnfOutPrimitive() {
        return _vnfOutPrimitive;
    }
    
    public Uuid getVnfrIdRef() {
        return _vnfrIdRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output.VnfOutList>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public VnfOutListBuilder setKey(final VnfOutListKey value) {
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
    
    public VnfOutListBuilder setMemberVnfIndexRef(final BigInteger value) {
    if (value != null) {
        checkMemberVnfIndexRefRange(value);
    }
        this._memberVnfIndexRef = value;
        return this;
    }
    
     
    public VnfOutListBuilder setVnfOutPrimitive(final List<VnfOutPrimitive> value) {
        this._vnfOutPrimitive = value;
        return this;
    }
    
     
    public VnfOutListBuilder setVnfrIdRef(final Uuid value) {
        this._vnfrIdRef = value;
        return this;
    }
    
    public VnfOutListBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output.VnfOutList>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output.VnfOutList> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VnfOutListBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output.VnfOutList>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public VnfOutList build() {
        return new VnfOutListImpl(this);
    }

    private static final class VnfOutListImpl implements VnfOutList {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output.VnfOutList> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output.VnfOutList.class;
        }

        private final VnfOutListKey _key;
        private final BigInteger _memberVnfIndexRef;
        private final List<VnfOutPrimitive> _vnfOutPrimitive;
        private final Uuid _vnfrIdRef;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output.VnfOutList>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output.VnfOutList>> augmentation = Collections.emptyMap();

        private VnfOutListImpl(VnfOutListBuilder base) {
            if (base.getKey() == null) {
                this._key = new VnfOutListKey(
                    base.getMemberVnfIndexRef()
                );
                this._memberVnfIndexRef = base.getMemberVnfIndexRef();
            } else {
                this._key = base.getKey();
                this._memberVnfIndexRef = _key.getMemberVnfIndexRef();
            }
            this._vnfOutPrimitive = base.getVnfOutPrimitive();
            this._vnfrIdRef = base.getVnfrIdRef();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output.VnfOutList>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output.VnfOutList>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output.VnfOutList>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output.VnfOutList>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public VnfOutListKey getKey() {
            return _key;
        }
        
        @Override
        public BigInteger getMemberVnfIndexRef() {
            return _memberVnfIndexRef;
        }
        
        @Override
        public List<VnfOutPrimitive> getVnfOutPrimitive() {
            return _vnfOutPrimitive;
        }
        
        @Override
        public Uuid getVnfrIdRef() {
            return _vnfrIdRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output.VnfOutList>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_vnfOutPrimitive);
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
            if (!ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output.VnfOutList.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output.VnfOutList other = (ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output.VnfOutList)obj;
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_memberVnfIndexRef, other.getMemberVnfIndexRef())) {
                return false;
            }
            if (!Objects.equals(_vnfOutPrimitive, other.getVnfOutPrimitive())) {
                return false;
            }
            if (!Objects.equals(_vnfrIdRef, other.getVnfrIdRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VnfOutListImpl otherImpl = (VnfOutListImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output.VnfOutList>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output.VnfOutList>> e : augmentation.entrySet()) {
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
            java.lang.String name = "VnfOutList [";
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
            if (_vnfOutPrimitive != null) {
                builder.append("_vnfOutPrimitive=");
                builder.append(_vnfOutPrimitive);
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
