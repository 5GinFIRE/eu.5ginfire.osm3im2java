package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vm.flavor;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.math.BigInteger;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vm.flavor.VmFlavor} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vm.flavor.VmFlavor
 *
 */
public class VmFlavorBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vm.flavor.VmFlavor> {

    private BigInteger _memoryMb;
    private BigInteger _storageGb;
    private java.lang.Integer _vcpuCount;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vm.flavor.VmFlavor>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vm.flavor.VmFlavor>> augmentation = Collections.emptyMap();

    public VmFlavorBuilder() {
    }

    public VmFlavorBuilder(VmFlavor base) {
        this._memoryMb = base.getMemoryMb();
        this._storageGb = base.getStorageGb();
        this._vcpuCount = base.getVcpuCount();
        if (base instanceof VmFlavorImpl) {
            VmFlavorImpl impl = (VmFlavorImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vm.flavor.VmFlavor> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vm.flavor.VmFlavor>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public BigInteger getMemoryMb() {
        return _memoryMb;
    }
    
    public BigInteger getStorageGb() {
        return _storageGb;
    }
    
    public java.lang.Integer getVcpuCount() {
        return _vcpuCount;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vm.flavor.VmFlavor>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKMEMORYMBRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKMEMORYMBRANGE_RANGES = a;
     }
     private static void checkMemoryMbRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKMEMORYMBRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKMEMORYMBRANGE_RANGES)));
     }
    
    public VmFlavorBuilder setMemoryMb(final BigInteger value) {
    if (value != null) {
        checkMemoryMbRange(value);
    }
        this._memoryMb = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKSTORAGEGBRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKSTORAGEGBRANGE_RANGES = a;
     }
     private static void checkStorageGbRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKSTORAGEGBRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKSTORAGEGBRANGE_RANGES)));
     }
    
    public VmFlavorBuilder setStorageGb(final BigInteger value) {
    if (value != null) {
        checkStorageGbRange(value);
    }
        this._storageGb = value;
        return this;
    }
    
     
     private static void checkVcpuCountRange(final int value) {
         if (value >= 0 && value <= 65535) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..65535]].", value));
     }
    
    public VmFlavorBuilder setVcpuCount(final java.lang.Integer value) {
    if (value != null) {
        checkVcpuCountRange(value);
    }
        this._vcpuCount = value;
        return this;
    }
    
    public VmFlavorBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vm.flavor.VmFlavor>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vm.flavor.VmFlavor> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VmFlavorBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vm.flavor.VmFlavor>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public VmFlavor build() {
        return new VmFlavorImpl(this);
    }

    private static final class VmFlavorImpl implements VmFlavor {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vm.flavor.VmFlavor> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vm.flavor.VmFlavor.class;
        }

        private final BigInteger _memoryMb;
        private final BigInteger _storageGb;
        private final java.lang.Integer _vcpuCount;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vm.flavor.VmFlavor>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vm.flavor.VmFlavor>> augmentation = Collections.emptyMap();

        private VmFlavorImpl(VmFlavorBuilder base) {
            this._memoryMb = base.getMemoryMb();
            this._storageGb = base.getStorageGb();
            this._vcpuCount = base.getVcpuCount();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vm.flavor.VmFlavor>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vm.flavor.VmFlavor>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vm.flavor.VmFlavor>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vm.flavor.VmFlavor>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public BigInteger getMemoryMb() {
            return _memoryMb;
        }
        
        @Override
        public BigInteger getStorageGb() {
            return _storageGb;
        }
        
        @Override
        public java.lang.Integer getVcpuCount() {
            return _vcpuCount;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vm.flavor.VmFlavor>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_memoryMb);
            result = prime * result + Objects.hashCode(_storageGb);
            result = prime * result + Objects.hashCode(_vcpuCount);
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
            if (!ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vm.flavor.VmFlavor.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vm.flavor.VmFlavor other = (ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vm.flavor.VmFlavor)obj;
            if (!Objects.equals(_memoryMb, other.getMemoryMb())) {
                return false;
            }
            if (!Objects.equals(_storageGb, other.getStorageGb())) {
                return false;
            }
            if (!Objects.equals(_vcpuCount, other.getVcpuCount())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VmFlavorImpl otherImpl = (VmFlavorImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vm.flavor.VmFlavor>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vm.flavor.VmFlavor>> e : augmentation.entrySet()) {
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
            java.lang.String name = "VmFlavor [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_memoryMb != null) {
                builder.append("_memoryMb=");
                builder.append(_memoryMb);
                builder.append(", ");
            }
            if (_storageGb != null) {
                builder.append("_storageGb=");
                builder.append(_storageGb);
                builder.append(", ");
            }
            if (_vcpuCount != null) {
                builder.append("_vcpuCount=");
                builder.append(_vcpuCount);
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
