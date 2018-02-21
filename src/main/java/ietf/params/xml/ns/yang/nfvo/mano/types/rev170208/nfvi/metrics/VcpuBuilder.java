package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.math.BigInteger;
import java.util.Collections;
import java.util.Map;
import java.math.BigDecimal;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.Vcpu} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.Vcpu
 *
 */
public class VcpuBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.Vcpu> {

    private java.lang.String _label;
    private BigInteger _total;
    private BigDecimal _utilization;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.Vcpu>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.Vcpu>> augmentation = Collections.emptyMap();

    public VcpuBuilder() {
    }

    public VcpuBuilder(Vcpu base) {
        this._label = base.getLabel();
        this._total = base.getTotal();
        this._utilization = base.getUtilization();
        if (base instanceof VcpuImpl) {
            VcpuImpl impl = (VcpuImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.Vcpu> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.Vcpu>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public java.lang.String getLabel() {
        return _label;
    }
    
    public BigInteger getTotal() {
        return _total;
    }
    
    public BigDecimal getUtilization() {
        return _utilization;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.Vcpu>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public VcpuBuilder setLabel(final java.lang.String value) {
        this._label = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKTOTALRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKTOTALRANGE_RANGES = a;
     }
     private static void checkTotalRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKTOTALRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKTOTALRANGE_RANGES)));
     }
    
    public VcpuBuilder setTotal(final BigInteger value) {
    if (value != null) {
        checkTotalRange(value);
    }
        this._total = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigDecimal>[] CHECKUTILIZATIONRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigDecimal>[] a = (com.google.common.collect.Range<java.math.BigDecimal>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigDecimal.ZERO, new java.math.BigDecimal("100"));
         CHECKUTILIZATIONRANGE_RANGES = a;
     }
     private static void checkUtilizationRange(final java.math.BigDecimal value) {
         for (com.google.common.collect.Range<java.math.BigDecimal> r : CHECKUTILIZATIONRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKUTILIZATIONRANGE_RANGES)));
     }
    
    public VcpuBuilder setUtilization(final BigDecimal value) {
    if (value != null) {
        checkUtilizationRange(value);
    }
        this._utilization = value;
        return this;
    }
    
    public VcpuBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.Vcpu>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.Vcpu> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VcpuBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.Vcpu>> augmentationType) {
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
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.Vcpu> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.Vcpu.class;
        }

        private final java.lang.String _label;
        private final BigInteger _total;
        private final BigDecimal _utilization;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.Vcpu>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.Vcpu>> augmentation = Collections.emptyMap();

        private VcpuImpl(VcpuBuilder base) {
            this._label = base.getLabel();
            this._total = base.getTotal();
            this._utilization = base.getUtilization();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.Vcpu>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.Vcpu>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.Vcpu>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.Vcpu>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getLabel() {
            return _label;
        }
        
        @Override
        public BigInteger getTotal() {
            return _total;
        }
        
        @Override
        public BigDecimal getUtilization() {
            return _utilization;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.Vcpu>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_label);
            result = prime * result + Objects.hashCode(_total);
            result = prime * result + Objects.hashCode(_utilization);
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
            if (!ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.Vcpu.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.Vcpu other = (ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.Vcpu)obj;
            if (!Objects.equals(_label, other.getLabel())) {
                return false;
            }
            if (!Objects.equals(_total, other.getTotal())) {
                return false;
            }
            if (!Objects.equals(_utilization, other.getUtilization())) {
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
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.Vcpu>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.Vcpu>> e : augmentation.entrySet()) {
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
            if (_label != null) {
                builder.append("_label=");
                builder.append(_label);
                builder.append(", ");
            }
            if (_total != null) {
                builder.append("_total=");
                builder.append(_total);
                builder.append(", ");
            }
            if (_utilization != null) {
                builder.append("_utilization=");
                builder.append(_utilization);
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
