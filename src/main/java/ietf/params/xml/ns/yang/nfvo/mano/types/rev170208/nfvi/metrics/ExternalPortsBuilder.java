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

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.ExternalPorts} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.ExternalPorts
 *
 */
public class ExternalPortsBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.ExternalPorts> {

    private java.lang.String _label;
    private BigInteger _total;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.ExternalPorts>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.ExternalPorts>> augmentation = Collections.emptyMap();

    public ExternalPortsBuilder() {
    }

    public ExternalPortsBuilder(ExternalPorts base) {
        this._label = base.getLabel();
        this._total = base.getTotal();
        if (base instanceof ExternalPortsImpl) {
            ExternalPortsImpl impl = (ExternalPortsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.ExternalPorts> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.ExternalPorts>) base;
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
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.ExternalPorts>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public ExternalPortsBuilder setLabel(final java.lang.String value) {
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
    
    public ExternalPortsBuilder setTotal(final BigInteger value) {
    if (value != null) {
        checkTotalRange(value);
    }
        this._total = value;
        return this;
    }
    
    public ExternalPortsBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.ExternalPorts>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.ExternalPorts> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ExternalPortsBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.ExternalPorts>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ExternalPorts build() {
        return new ExternalPortsImpl(this);
    }

    private static final class ExternalPortsImpl implements ExternalPorts {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.ExternalPorts> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.ExternalPorts.class;
        }

        private final java.lang.String _label;
        private final BigInteger _total;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.ExternalPorts>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.ExternalPorts>> augmentation = Collections.emptyMap();

        private ExternalPortsImpl(ExternalPortsBuilder base) {
            this._label = base.getLabel();
            this._total = base.getTotal();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.ExternalPorts>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.ExternalPorts>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.ExternalPorts>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.ExternalPorts>>singletonMap(e.getKey(), e.getValue());
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
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.ExternalPorts>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            if (!ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.ExternalPorts.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.ExternalPorts other = (ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.ExternalPorts)obj;
            if (!Objects.equals(_label, other.getLabel())) {
                return false;
            }
            if (!Objects.equals(_total, other.getTotal())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ExternalPortsImpl otherImpl = (ExternalPortsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.ExternalPorts>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.ExternalPorts>> e : augmentation.entrySet()) {
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
            java.lang.String name = "ExternalPorts [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_label != null) {
                builder.append("_label=");
                builder.append(_label);
                builder.append(", ");
            }
            if (_total != null) {
                builder.append("_total=");
                builder.append(_total);
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
