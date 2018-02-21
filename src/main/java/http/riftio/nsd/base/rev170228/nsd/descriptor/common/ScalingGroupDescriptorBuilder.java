package http.riftio.nsd.base.rev170228.nsd.descriptor.common;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;

import http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.ScalingConfigAction;
import http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.ScalingPolicy;
import http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.VnfdMember;

import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link http.riftio.nsd.base.rev170228.nsd.descriptor.common.ScalingGroupDescriptor} instances.
 * 
 * @see http.riftio.nsd.base.rev170228.nsd.descriptor.common.ScalingGroupDescriptor
 *
 */
public class ScalingGroupDescriptorBuilder implements Builder<http.riftio.nsd.base.rev170228.nsd.descriptor.common.ScalingGroupDescriptor> {

    private ScalingGroupDescriptorKey _key;
    private java.lang.Long _maxInstanceCount;
    private java.lang.Long _minInstanceCount;
    private java.lang.String _name;
    private List<ScalingConfigAction> _scalingConfigAction;
    private List<ScalingPolicy> _scalingPolicy;
    private List<VnfdMember> _vnfdMember;

    Map<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.ScalingGroupDescriptor>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.ScalingGroupDescriptor>> augmentation = Collections.emptyMap();

    public ScalingGroupDescriptorBuilder() {
    }

    public ScalingGroupDescriptorBuilder(ScalingGroupDescriptor base) {
        if (base.getKey() == null) {
            this._key = new ScalingGroupDescriptorKey(
                base.getName()
            );
            this._name = base.getName();
        } else {
            this._key = base.getKey();
            this._name = _key.getName();
        }
        this._maxInstanceCount = base.getMaxInstanceCount();
        this._minInstanceCount = base.getMinInstanceCount();
        this._scalingConfigAction = base.getScalingConfigAction();
        this._scalingPolicy = base.getScalingPolicy();
        this._vnfdMember = base.getVnfdMember();
        if (base instanceof ScalingGroupDescriptorImpl) {
            ScalingGroupDescriptorImpl impl = (ScalingGroupDescriptorImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<http.riftio.nsd.base.rev170228.nsd.descriptor.common.ScalingGroupDescriptor> casted =(AugmentationHolder<http.riftio.nsd.base.rev170228.nsd.descriptor.common.ScalingGroupDescriptor>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public ScalingGroupDescriptorKey getKey() {
        return _key;
    }
    
    public java.lang.Long getMaxInstanceCount() {
        return _maxInstanceCount;
    }
    
    public java.lang.Long getMinInstanceCount() {
        return _minInstanceCount;
    }
    
    public java.lang.String getName() {
        return _name;
    }
    
    public List<ScalingConfigAction> getScalingConfigAction() {
        return _scalingConfigAction;
    }
    
    public List<ScalingPolicy> getScalingPolicy() {
        return _scalingPolicy;
    }
    
    public List<VnfdMember> getVnfdMember() {
        return _vnfdMember;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.ScalingGroupDescriptor>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public ScalingGroupDescriptorBuilder setKey(final ScalingGroupDescriptorKey value) {
        this._key = value;
        return this;
    }
    
     
     private static void checkMaxInstanceCountRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..4294967295]].", value));
     }
    
    public ScalingGroupDescriptorBuilder setMaxInstanceCount(final java.lang.Long value) {
    if (value != null) {
        checkMaxInstanceCountRange(value);
    }
        this._maxInstanceCount = value;
        return this;
    }
    
     
     private static void checkMinInstanceCountRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..4294967295]].", value));
     }
    
    public ScalingGroupDescriptorBuilder setMinInstanceCount(final java.lang.Long value) {
    if (value != null) {
        checkMinInstanceCountRange(value);
    }
        this._minInstanceCount = value;
        return this;
    }
    
     
    public ScalingGroupDescriptorBuilder setName(final java.lang.String value) {
        this._name = value;
        return this;
    }
    
     
    public ScalingGroupDescriptorBuilder setScalingConfigAction(final List<ScalingConfigAction> value) {
        this._scalingConfigAction = value;
        return this;
    }
    
     
    public ScalingGroupDescriptorBuilder setScalingPolicy(final List<ScalingPolicy> value) {
        this._scalingPolicy = value;
        return this;
    }
    
     
    public ScalingGroupDescriptorBuilder setVnfdMember(final List<VnfdMember> value) {
        this._vnfdMember = value;
        return this;
    }
    
    public ScalingGroupDescriptorBuilder addAugmentation(java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.ScalingGroupDescriptor>> augmentationType, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.ScalingGroupDescriptor> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ScalingGroupDescriptorBuilder removeAugmentation(java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.ScalingGroupDescriptor>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ScalingGroupDescriptor build() {
        return new ScalingGroupDescriptorImpl(this);
    }

    private static final class ScalingGroupDescriptorImpl implements ScalingGroupDescriptor {

        @Override
        public java.lang.Class<http.riftio.nsd.base.rev170228.nsd.descriptor.common.ScalingGroupDescriptor> getImplementedInterface() {
            return http.riftio.nsd.base.rev170228.nsd.descriptor.common.ScalingGroupDescriptor.class;
        }

        private final ScalingGroupDescriptorKey _key;
        private final java.lang.Long _maxInstanceCount;
        private final java.lang.Long _minInstanceCount;
        private final java.lang.String _name;
        private final List<ScalingConfigAction> _scalingConfigAction;
        private final List<ScalingPolicy> _scalingPolicy;
        private final List<VnfdMember> _vnfdMember;

        private Map<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.ScalingGroupDescriptor>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.ScalingGroupDescriptor>> augmentation = Collections.emptyMap();

        private ScalingGroupDescriptorImpl(ScalingGroupDescriptorBuilder base) {
            if (base.getKey() == null) {
                this._key = new ScalingGroupDescriptorKey(
                    base.getName()
                );
                this._name = base.getName();
            } else {
                this._key = base.getKey();
                this._name = _key.getName();
            }
            this._maxInstanceCount = base.getMaxInstanceCount();
            this._minInstanceCount = base.getMinInstanceCount();
            this._scalingConfigAction = base.getScalingConfigAction();
            this._scalingPolicy = base.getScalingPolicy();
            this._vnfdMember = base.getVnfdMember();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.ScalingGroupDescriptor>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.ScalingGroupDescriptor>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.ScalingGroupDescriptor>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.ScalingGroupDescriptor>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public ScalingGroupDescriptorKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.Long getMaxInstanceCount() {
            return _maxInstanceCount;
        }
        
        @Override
        public java.lang.Long getMinInstanceCount() {
            return _minInstanceCount;
        }
        
        @Override
        public java.lang.String getName() {
            return _name;
        }
        
        @Override
        public List<ScalingConfigAction> getScalingConfigAction() {
            return _scalingConfigAction;
        }
        
        @Override
        public List<ScalingPolicy> getScalingPolicy() {
            return _scalingPolicy;
        }
        
        @Override
        public List<VnfdMember> getVnfdMember() {
            return _vnfdMember;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.ScalingGroupDescriptor>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_maxInstanceCount);
            result = prime * result + Objects.hashCode(_minInstanceCount);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_scalingConfigAction);
            result = prime * result + Objects.hashCode(_scalingPolicy);
            result = prime * result + Objects.hashCode(_vnfdMember);
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
            if (!http.riftio.nsd.base.rev170228.nsd.descriptor.common.ScalingGroupDescriptor.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            http.riftio.nsd.base.rev170228.nsd.descriptor.common.ScalingGroupDescriptor other = (http.riftio.nsd.base.rev170228.nsd.descriptor.common.ScalingGroupDescriptor)obj;
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_maxInstanceCount, other.getMaxInstanceCount())) {
                return false;
            }
            if (!Objects.equals(_minInstanceCount, other.getMinInstanceCount())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_scalingConfigAction, other.getScalingConfigAction())) {
                return false;
            }
            if (!Objects.equals(_scalingPolicy, other.getScalingPolicy())) {
                return false;
            }
            if (!Objects.equals(_vnfdMember, other.getVnfdMember())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ScalingGroupDescriptorImpl otherImpl = (ScalingGroupDescriptorImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.ScalingGroupDescriptor>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.ScalingGroupDescriptor>> e : augmentation.entrySet()) {
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
            java.lang.String name = "ScalingGroupDescriptor [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_maxInstanceCount != null) {
                builder.append("_maxInstanceCount=");
                builder.append(_maxInstanceCount);
                builder.append(", ");
            }
            if (_minInstanceCount != null) {
                builder.append("_minInstanceCount=");
                builder.append(_minInstanceCount);
                builder.append(", ");
            }
            if (_name != null) {
                builder.append("_name=");
                builder.append(_name);
                builder.append(", ");
            }
            if (_scalingConfigAction != null) {
                builder.append("_scalingConfigAction=");
                builder.append(_scalingConfigAction);
                builder.append(", ");
            }
            if (_scalingPolicy != null) {
                builder.append("_scalingPolicy=");
                builder.append(_scalingPolicy);
                builder.append(", ");
            }
            if (_vnfdMember != null) {
                builder.append("_vnfdMember=");
                builder.append(_vnfdMember);
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
