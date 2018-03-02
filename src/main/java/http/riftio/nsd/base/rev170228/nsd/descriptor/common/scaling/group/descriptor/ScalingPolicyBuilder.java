package http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;

import http.riftio.nsd.base.rev170228.ScalingCriteriaOperation;
import http.riftio.nsd.base.rev170228.ScalingPolicyType;
import http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.scaling.policy.ScalingCriteria;

import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.ScalingPolicy} instances.
 * 
 * @see http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.ScalingPolicy
 *
 */
public class ScalingPolicyBuilder implements Builder<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.ScalingPolicy> {

    private java.lang.Long _cooldownTime;
    private ScalingPolicyKey _key;
    private java.lang.String _name;
    private ScalingCriteriaOperation _scaleInOperationType;
    private ScalingCriteriaOperation _scaleOutOperationType;
    private List<ScalingCriteria> _scalingCriteria;
    private ScalingPolicyType _scalingType;
    private java.lang.Long _thresholdTime;
    private java.lang.Boolean _enabled;

    Map<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.ScalingPolicy>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.ScalingPolicy>> augmentation = Collections.emptyMap();

    public ScalingPolicyBuilder() {
    }

    public ScalingPolicyBuilder(ScalingPolicy base) {
        if (base.getKey() == null) {
            this._key = new ScalingPolicyKey(
                base.getName()
            );
            this._name = base.getName();
        } else {
            this._key = base.getKey();
            this._name = _key.getName();
        }
        this._cooldownTime = base.getCooldownTime();
        this._scaleInOperationType = base.getScaleInOperationType();
        this._scaleOutOperationType = base.getScaleOutOperationType();
        this._scalingCriteria = base.getScalingCriteria();
        this._scalingType = base.getScalingType();
        this._thresholdTime = base.getThresholdTime();
        this._enabled = base.isEnabled();
        if (base instanceof ScalingPolicyImpl) {
            ScalingPolicyImpl impl = (ScalingPolicyImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.ScalingPolicy> casted =(AugmentationHolder<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.ScalingPolicy>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public java.lang.Long getCooldownTime() {
        return _cooldownTime;
    }
    
    public ScalingPolicyKey getKey() {
        return _key;
    }
    
    public java.lang.String getName() {
        return _name;
    }
    
    public ScalingCriteriaOperation getScaleInOperationType() {
        return _scaleInOperationType;
    }
    
    public ScalingCriteriaOperation getScaleOutOperationType() {
        return _scaleOutOperationType;
    }
    
    public List<ScalingCriteria> getScalingCriteria() {
        return _scalingCriteria;
    }
    
    public ScalingPolicyType getScalingType() {
        return _scalingType;
    }
    
    public java.lang.Long getThresholdTime() {
        return _thresholdTime;
    }
    
    public java.lang.Boolean isEnabled() {
        return _enabled;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.ScalingPolicy>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static void checkCooldownTimeRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..4294967295]].", value));
     }
    
    public ScalingPolicyBuilder setCooldownTime(final java.lang.Long value) {
    if (value != null) {
        checkCooldownTimeRange(value);
    }
        this._cooldownTime = value;
        return this;
    }
    
     
    public ScalingPolicyBuilder setKey(final ScalingPolicyKey value) {
        this._key = value;
        return this;
    }
    
     
    public ScalingPolicyBuilder setName(final java.lang.String value) {
        this._name = value;
        return this;
    }
    
     
    public ScalingPolicyBuilder setScaleInOperationType(final ScalingCriteriaOperation value) {
        this._scaleInOperationType = value;
        return this;
    }
    
     
    public ScalingPolicyBuilder setScaleOutOperationType(final ScalingCriteriaOperation value) {
        this._scaleOutOperationType = value;
        return this;
    }
    
     
    public ScalingPolicyBuilder setScalingCriteria(final List<ScalingCriteria> value) {
        this._scalingCriteria = value;
        return this;
    }
    
     
    public ScalingPolicyBuilder setScalingType(final ScalingPolicyType value) {
        this._scalingType = value;
        return this;
    }
    
     
     private static void checkThresholdTimeRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..4294967295]].", value));
     }
    
    public ScalingPolicyBuilder setThresholdTime(final java.lang.Long value) {
    if (value != null) {
        checkThresholdTimeRange(value);
    }
        this._thresholdTime = value;
        return this;
    }
    
     
    public ScalingPolicyBuilder setEnabled(final java.lang.Boolean value) {
        this._enabled = value;
        return this;
    }
    
    public ScalingPolicyBuilder addAugmentation(java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.ScalingPolicy>> augmentationType, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.ScalingPolicy> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ScalingPolicyBuilder removeAugmentation(java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.ScalingPolicy>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ScalingPolicy build() {
        return new ScalingPolicyImpl(this);
    }

    private static final class ScalingPolicyImpl implements ScalingPolicy {

        @Override
        public java.lang.Class<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.ScalingPolicy> getImplementedInterface() {
            return http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.ScalingPolicy.class;
        }

        private final java.lang.Long _cooldownTime;
        private final ScalingPolicyKey _key;
        private final java.lang.String _name;
        private final ScalingCriteriaOperation _scaleInOperationType;
        private final ScalingCriteriaOperation _scaleOutOperationType;
        private final List<ScalingCriteria> _scalingCriteria;
        private final ScalingPolicyType _scalingType;
        private final java.lang.Long _thresholdTime;
        private final java.lang.Boolean _enabled;

        private Map<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.ScalingPolicy>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.ScalingPolicy>> augmentation = Collections.emptyMap();

        private ScalingPolicyImpl(ScalingPolicyBuilder base) {
            if (base.getKey() == null) {
                this._key = new ScalingPolicyKey(
                    base.getName()
                );
                this._name = base.getName();
            } else {
                this._key = base.getKey();
                this._name = _key.getName();
            }
            this._cooldownTime = base.getCooldownTime();
            this._scaleInOperationType = base.getScaleInOperationType();
            this._scaleOutOperationType = base.getScaleOutOperationType();
            this._scalingCriteria = base.getScalingCriteria();
            this._scalingType = base.getScalingType();
            this._thresholdTime = base.getThresholdTime();
            this._enabled = base.isEnabled();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.ScalingPolicy>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.ScalingPolicy>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.ScalingPolicy>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.ScalingPolicy>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Long getCooldownTime() {
            return _cooldownTime;
        }
        
        @Override
        public ScalingPolicyKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.String getName() {
            return _name;
        }
        
        @Override
        public ScalingCriteriaOperation getScaleInOperationType() {
            return _scaleInOperationType;
        }
        
        @Override
        public ScalingCriteriaOperation getScaleOutOperationType() {
            return _scaleOutOperationType;
        }
        
        @Override
        public List<ScalingCriteria> getScalingCriteria() {
            return _scalingCriteria;
        }
        
        @Override
        public ScalingPolicyType getScalingType() {
            return _scalingType;
        }
        
        @Override
        public java.lang.Long getThresholdTime() {
            return _thresholdTime;
        }
        
        @Override
        public java.lang.Boolean isEnabled() {
            return _enabled;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.ScalingPolicy>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_cooldownTime);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_scaleInOperationType);
            result = prime * result + Objects.hashCode(_scaleOutOperationType);
            result = prime * result + Objects.hashCode(_scalingCriteria);
            result = prime * result + Objects.hashCode(_scalingType);
            result = prime * result + Objects.hashCode(_thresholdTime);
            result = prime * result + Objects.hashCode(_enabled);
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
            if (!http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.ScalingPolicy.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.ScalingPolicy other = (http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.ScalingPolicy)obj;
            if (!Objects.equals(_cooldownTime, other.getCooldownTime())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_scaleInOperationType, other.getScaleInOperationType())) {
                return false;
            }
            if (!Objects.equals(_scaleOutOperationType, other.getScaleOutOperationType())) {
                return false;
            }
            if (!Objects.equals(_scalingCriteria, other.getScalingCriteria())) {
                return false;
            }
            if (!Objects.equals(_scalingType, other.getScalingType())) {
                return false;
            }
            if (!Objects.equals(_thresholdTime, other.getThresholdTime())) {
                return false;
            }
            if (!Objects.equals(_enabled, other.isEnabled())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ScalingPolicyImpl otherImpl = (ScalingPolicyImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.ScalingPolicy>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.ScalingPolicy>> e : augmentation.entrySet()) {
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
            java.lang.String name = "ScalingPolicy [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_cooldownTime != null) {
                builder.append("_cooldownTime=");
                builder.append(_cooldownTime);
                builder.append(", ");
            }
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
            if (_scaleInOperationType != null) {
                builder.append("_scaleInOperationType=");
                builder.append(_scaleInOperationType);
                builder.append(", ");
            }
            if (_scaleOutOperationType != null) {
                builder.append("_scaleOutOperationType=");
                builder.append(_scaleOutOperationType);
                builder.append(", ");
            }
            if (_scalingCriteria != null) {
                builder.append("_scalingCriteria=");
                builder.append(_scalingCriteria);
                builder.append(", ");
            }
            if (_scalingType != null) {
                builder.append("_scalingType=");
                builder.append(_scalingType);
                builder.append(", ");
            }
            if (_thresholdTime != null) {
                builder.append("_thresholdTime=");
                builder.append(_thresholdTime);
                builder.append(", ");
            }
            if (_enabled != null) {
                builder.append("_enabled=");
                builder.append(_enabled);
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
