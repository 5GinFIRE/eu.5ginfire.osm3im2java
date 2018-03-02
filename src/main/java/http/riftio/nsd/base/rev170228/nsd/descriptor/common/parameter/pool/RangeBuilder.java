package http.riftio.nsd.base.rev170228.nsd.descriptor.common.parameter.pool;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link http.riftio.nsd.base.rev170228.nsd.descriptor.common.parameter.pool.Range} instances.
 * 
 * @see http.riftio.nsd.base.rev170228.nsd.descriptor.common.parameter.pool.Range
 *
 */
public class RangeBuilder implements Builder<http.riftio.nsd.base.rev170228.nsd.descriptor.common.parameter.pool.Range> {

    private java.lang.Long _endValue;
    private java.lang.Long _startValue;

    Map<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.parameter.pool.Range>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.parameter.pool.Range>> augmentation = Collections.emptyMap();

    public RangeBuilder() {
    }

    public RangeBuilder(Range base) {
        this._endValue = base.getEndValue();
        this._startValue = base.getStartValue();
        if (base instanceof RangeImpl) {
            RangeImpl impl = (RangeImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<http.riftio.nsd.base.rev170228.nsd.descriptor.common.parameter.pool.Range> casted =(AugmentationHolder<http.riftio.nsd.base.rev170228.nsd.descriptor.common.parameter.pool.Range>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public java.lang.Long getEndValue() {
        return _endValue;
    }
    
    public java.lang.Long getStartValue() {
        return _startValue;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.parameter.pool.Range>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static void checkEndValueRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..4294967295]].", value));
     }
    
    public RangeBuilder setEndValue(final java.lang.Long value) {
    if (value != null) {
        checkEndValueRange(value);
    }
        this._endValue = value;
        return this;
    }
    
     
     private static void checkStartValueRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..4294967295]].", value));
     }
    
    public RangeBuilder setStartValue(final java.lang.Long value) {
    if (value != null) {
        checkStartValueRange(value);
    }
        this._startValue = value;
        return this;
    }
    
    public RangeBuilder addAugmentation(java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.parameter.pool.Range>> augmentationType, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.parameter.pool.Range> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public RangeBuilder removeAugmentation(java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.parameter.pool.Range>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Range build() {
        return new RangeImpl(this);
    }

    private static final class RangeImpl implements Range {

        @Override
        public java.lang.Class<http.riftio.nsd.base.rev170228.nsd.descriptor.common.parameter.pool.Range> getImplementedInterface() {
            return http.riftio.nsd.base.rev170228.nsd.descriptor.common.parameter.pool.Range.class;
        }

        private final java.lang.Long _endValue;
        private final java.lang.Long _startValue;

        private Map<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.parameter.pool.Range>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.parameter.pool.Range>> augmentation = Collections.emptyMap();

        private RangeImpl(RangeBuilder base) {
            this._endValue = base.getEndValue();
            this._startValue = base.getStartValue();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.parameter.pool.Range>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.parameter.pool.Range>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.parameter.pool.Range>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.parameter.pool.Range>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Long getEndValue() {
            return _endValue;
        }
        
        @Override
        public java.lang.Long getStartValue() {
            return _startValue;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.parameter.pool.Range>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_endValue);
            result = prime * result + Objects.hashCode(_startValue);
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
            if (!http.riftio.nsd.base.rev170228.nsd.descriptor.common.parameter.pool.Range.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            http.riftio.nsd.base.rev170228.nsd.descriptor.common.parameter.pool.Range other = (http.riftio.nsd.base.rev170228.nsd.descriptor.common.parameter.pool.Range)obj;
            if (!Objects.equals(_endValue, other.getEndValue())) {
                return false;
            }
            if (!Objects.equals(_startValue, other.getStartValue())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                RangeImpl otherImpl = (RangeImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.parameter.pool.Range>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.parameter.pool.Range>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Range [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_endValue != null) {
                builder.append("_endValue=");
                builder.append(_endValue);
                builder.append(", ");
            }
            if (_startValue != null) {
                builder.append("_startValue=");
                builder.append(_startValue);
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
