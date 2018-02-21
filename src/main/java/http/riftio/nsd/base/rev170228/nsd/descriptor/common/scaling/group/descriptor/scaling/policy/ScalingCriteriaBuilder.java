package http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.scaling.policy;
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
 * Class that builds {@link http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.scaling.policy.ScalingCriteria} instances.
 * 
 * @see http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.scaling.policy.ScalingCriteria
 *
 */
public class ScalingCriteriaBuilder implements Builder<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.scaling.policy.ScalingCriteria> {

    private ScalingCriteriaKey _key;
    private java.lang.String _name;
    private java.lang.String _nsMonitoringParamRef;
    private BigInteger _scaleInThreshold;
    private BigInteger _scaleOutThreshold;

    Map<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.scaling.policy.ScalingCriteria>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.scaling.policy.ScalingCriteria>> augmentation = Collections.emptyMap();

    public ScalingCriteriaBuilder() {
    }

    public ScalingCriteriaBuilder(ScalingCriteria base) {
        if (base.getKey() == null) {
            this._key = new ScalingCriteriaKey(
                base.getName()
            );
            this._name = base.getName();
        } else {
            this._key = base.getKey();
            this._name = _key.getName();
        }
        this._nsMonitoringParamRef = base.getNsMonitoringParamRef();
        this._scaleInThreshold = base.getScaleInThreshold();
        this._scaleOutThreshold = base.getScaleOutThreshold();
        if (base instanceof ScalingCriteriaImpl) {
            ScalingCriteriaImpl impl = (ScalingCriteriaImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.scaling.policy.ScalingCriteria> casted =(AugmentationHolder<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.scaling.policy.ScalingCriteria>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public ScalingCriteriaKey getKey() {
        return _key;
    }
    
    public java.lang.String getName() {
        return _name;
    }
    
    public java.lang.String getNsMonitoringParamRef() {
        return _nsMonitoringParamRef;
    }
    
    public BigInteger getScaleInThreshold() {
        return _scaleInThreshold;
    }
    
    public BigInteger getScaleOutThreshold() {
        return _scaleOutThreshold;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.scaling.policy.ScalingCriteria>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public ScalingCriteriaBuilder setKey(final ScalingCriteriaKey value) {
        this._key = value;
        return this;
    }
    
     
    public ScalingCriteriaBuilder setName(final java.lang.String value) {
        this._name = value;
        return this;
    }
    
     
    public ScalingCriteriaBuilder setNsMonitoringParamRef(final java.lang.String value) {
        this._nsMonitoringParamRef = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKSCALEINTHRESHOLDRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKSCALEINTHRESHOLDRANGE_RANGES = a;
     }
     private static void checkScaleInThresholdRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKSCALEINTHRESHOLDRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKSCALEINTHRESHOLDRANGE_RANGES)));
     }
    
    public ScalingCriteriaBuilder setScaleInThreshold(final BigInteger value) {
    if (value != null) {
        checkScaleInThresholdRange(value);
    }
        this._scaleInThreshold = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKSCALEOUTTHRESHOLDRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKSCALEOUTTHRESHOLDRANGE_RANGES = a;
     }
     private static void checkScaleOutThresholdRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKSCALEOUTTHRESHOLDRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKSCALEOUTTHRESHOLDRANGE_RANGES)));
     }
    
    public ScalingCriteriaBuilder setScaleOutThreshold(final BigInteger value) {
    if (value != null) {
        checkScaleOutThresholdRange(value);
    }
        this._scaleOutThreshold = value;
        return this;
    }
    
    public ScalingCriteriaBuilder addAugmentation(java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.scaling.policy.ScalingCriteria>> augmentationType, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.scaling.policy.ScalingCriteria> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ScalingCriteriaBuilder removeAugmentation(java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.scaling.policy.ScalingCriteria>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ScalingCriteria build() {
        return new ScalingCriteriaImpl(this);
    }

    private static final class ScalingCriteriaImpl implements ScalingCriteria {

        @Override
        public java.lang.Class<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.scaling.policy.ScalingCriteria> getImplementedInterface() {
            return http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.scaling.policy.ScalingCriteria.class;
        }

        private final ScalingCriteriaKey _key;
        private final java.lang.String _name;
        private final java.lang.String _nsMonitoringParamRef;
        private final BigInteger _scaleInThreshold;
        private final BigInteger _scaleOutThreshold;

        private Map<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.scaling.policy.ScalingCriteria>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.scaling.policy.ScalingCriteria>> augmentation = Collections.emptyMap();

        private ScalingCriteriaImpl(ScalingCriteriaBuilder base) {
            if (base.getKey() == null) {
                this._key = new ScalingCriteriaKey(
                    base.getName()
                );
                this._name = base.getName();
            } else {
                this._key = base.getKey();
                this._name = _key.getName();
            }
            this._nsMonitoringParamRef = base.getNsMonitoringParamRef();
            this._scaleInThreshold = base.getScaleInThreshold();
            this._scaleOutThreshold = base.getScaleOutThreshold();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.scaling.policy.ScalingCriteria>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.scaling.policy.ScalingCriteria>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.scaling.policy.ScalingCriteria>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.scaling.policy.ScalingCriteria>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public ScalingCriteriaKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.String getName() {
            return _name;
        }
        
        @Override
        public java.lang.String getNsMonitoringParamRef() {
            return _nsMonitoringParamRef;
        }
        
        @Override
        public BigInteger getScaleInThreshold() {
            return _scaleInThreshold;
        }
        
        @Override
        public BigInteger getScaleOutThreshold() {
            return _scaleOutThreshold;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.scaling.policy.ScalingCriteria>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_nsMonitoringParamRef);
            result = prime * result + Objects.hashCode(_scaleInThreshold);
            result = prime * result + Objects.hashCode(_scaleOutThreshold);
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
            if (!http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.scaling.policy.ScalingCriteria.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.scaling.policy.ScalingCriteria other = (http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.scaling.policy.ScalingCriteria)obj;
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_nsMonitoringParamRef, other.getNsMonitoringParamRef())) {
                return false;
            }
            if (!Objects.equals(_scaleInThreshold, other.getScaleInThreshold())) {
                return false;
            }
            if (!Objects.equals(_scaleOutThreshold, other.getScaleOutThreshold())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ScalingCriteriaImpl otherImpl = (ScalingCriteriaImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.scaling.policy.ScalingCriteria>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.scaling.policy.ScalingCriteria>> e : augmentation.entrySet()) {
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
            java.lang.String name = "ScalingCriteria [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_name != null) {
                builder.append("_name=");
                builder.append(_name);
                builder.append(", ");
            }
            if (_nsMonitoringParamRef != null) {
                builder.append("_nsMonitoringParamRef=");
                builder.append(_nsMonitoringParamRef);
                builder.append(", ");
            }
            if (_scaleInThreshold != null) {
                builder.append("_scaleInThreshold=");
                builder.append(_scaleInThreshold);
                builder.append(", ");
            }
            if (_scaleOutThreshold != null) {
                builder.append("_scaleOutThreshold=");
                builder.append(_scaleOutThreshold);
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
