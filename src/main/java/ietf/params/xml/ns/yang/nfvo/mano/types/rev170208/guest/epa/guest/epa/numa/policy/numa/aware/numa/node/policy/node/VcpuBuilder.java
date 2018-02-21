package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node;
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
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.Vcpu} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.Vcpu
 *
 */
public class VcpuBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.Vcpu> {

    private BigInteger _id;
    private VcpuKey _key;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.Vcpu>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.Vcpu>> augmentation = Collections.emptyMap();

    public VcpuBuilder() {
    }

    public VcpuBuilder(Vcpu base) {
        if (base.getKey() == null) {
            this._key = new VcpuKey(
                base.getId()
            );
            this._id = base.getId();
        } else {
            this._key = base.getKey();
            this._id = _key.getId();
        }
        if (base instanceof VcpuImpl) {
            VcpuImpl impl = (VcpuImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.Vcpu> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.Vcpu>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public BigInteger getId() {
        return _id;
    }
    
    public VcpuKey getKey() {
        return _key;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.Vcpu>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKIDRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKIDRANGE_RANGES = a;
     }
     private static void checkIdRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKIDRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKIDRANGE_RANGES)));
     }
    
    public VcpuBuilder setId(final BigInteger value) {
    if (value != null) {
        checkIdRange(value);
    }
        this._id = value;
        return this;
    }
    
     
    public VcpuBuilder setKey(final VcpuKey value) {
        this._key = value;
        return this;
    }
    
    public VcpuBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.Vcpu>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.Vcpu> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VcpuBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.Vcpu>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Vcpu build() {
        return new VcpuImpl(this);
    }

    private static final class VcpuImpl implements Vcpu {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.Vcpu> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.Vcpu.class;
        }

        private final BigInteger _id;
        private final VcpuKey _key;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.Vcpu>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.Vcpu>> augmentation = Collections.emptyMap();

        private VcpuImpl(VcpuBuilder base) {
            if (base.getKey() == null) {
                this._key = new VcpuKey(
                    base.getId()
                );
                this._id = base.getId();
            } else {
                this._key = base.getKey();
                this._id = _key.getId();
            }
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.Vcpu>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.Vcpu>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.Vcpu>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.Vcpu>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public BigInteger getId() {
            return _id;
        }
        
        @Override
        public VcpuKey getKey() {
            return _key;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.Vcpu>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            if (!ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.Vcpu.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.Vcpu other = (ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.Vcpu)obj;
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VcpuImpl otherImpl = (VcpuImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.Vcpu>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.Vcpu>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Vcpu [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_id != null) {
                builder.append("_id=");
                builder.append(_id);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
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
