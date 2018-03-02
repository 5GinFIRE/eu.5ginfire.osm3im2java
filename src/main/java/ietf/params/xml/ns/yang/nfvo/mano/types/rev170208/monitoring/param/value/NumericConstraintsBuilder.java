package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.value;
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
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.value.NumericConstraints} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.value.NumericConstraints
 *
 */
public class NumericConstraintsBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.value.NumericConstraints> {

    private BigInteger _maxValue;
    private BigInteger _minValue;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.value.NumericConstraints>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.value.NumericConstraints>> augmentation = Collections.emptyMap();

    public NumericConstraintsBuilder() {
    }

    public NumericConstraintsBuilder(NumericConstraints base) {
        this._maxValue = base.getMaxValue();
        this._minValue = base.getMinValue();
        if (base instanceof NumericConstraintsImpl) {
            NumericConstraintsImpl impl = (NumericConstraintsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.value.NumericConstraints> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.value.NumericConstraints>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public BigInteger getMaxValue() {
        return _maxValue;
    }
    
    public BigInteger getMinValue() {
        return _minValue;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.value.NumericConstraints>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKMAXVALUERANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKMAXVALUERANGE_RANGES = a;
     }
     private static void checkMaxValueRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKMAXVALUERANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKMAXVALUERANGE_RANGES)));
     }
    
    public NumericConstraintsBuilder setMaxValue(final BigInteger value) {
    if (value != null) {
        checkMaxValueRange(value);
    }
        this._maxValue = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKMINVALUERANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKMINVALUERANGE_RANGES = a;
     }
     private static void checkMinValueRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKMINVALUERANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKMINVALUERANGE_RANGES)));
     }
    
    public NumericConstraintsBuilder setMinValue(final BigInteger value) {
    if (value != null) {
        checkMinValueRange(value);
    }
        this._minValue = value;
        return this;
    }
    
    public NumericConstraintsBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.value.NumericConstraints>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.value.NumericConstraints> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public NumericConstraintsBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.value.NumericConstraints>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public NumericConstraints build() {
        return new NumericConstraintsImpl(this);
    }

    private static final class NumericConstraintsImpl implements NumericConstraints {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.value.NumericConstraints> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.value.NumericConstraints.class;
        }

        private final BigInteger _maxValue;
        private final BigInteger _minValue;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.value.NumericConstraints>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.value.NumericConstraints>> augmentation = Collections.emptyMap();

        private NumericConstraintsImpl(NumericConstraintsBuilder base) {
            this._maxValue = base.getMaxValue();
            this._minValue = base.getMinValue();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.value.NumericConstraints>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.value.NumericConstraints>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.value.NumericConstraints>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.value.NumericConstraints>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public BigInteger getMaxValue() {
            return _maxValue;
        }
        
        @Override
        public BigInteger getMinValue() {
            return _minValue;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.value.NumericConstraints>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_maxValue);
            result = prime * result + Objects.hashCode(_minValue);
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
            if (!ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.value.NumericConstraints.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.value.NumericConstraints other = (ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.value.NumericConstraints)obj;
            if (!Objects.equals(_maxValue, other.getMaxValue())) {
                return false;
            }
            if (!Objects.equals(_minValue, other.getMinValue())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NumericConstraintsImpl otherImpl = (NumericConstraintsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.value.NumericConstraints>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.value.NumericConstraints>> e : augmentation.entrySet()) {
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
            java.lang.String name = "NumericConstraints [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_maxValue != null) {
                builder.append("_maxValue=");
                builder.append(_maxValue);
                builder.append(", ");
            }
            if (_minValue != null) {
                builder.append("_minValue=");
                builder.append(_minValue);
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
