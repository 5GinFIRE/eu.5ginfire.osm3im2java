package http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import http.riftio.nsd.base.rev170228.ScalingTrigger;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.ScalingConfigAction} instances.
 * 
 * @see http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.ScalingConfigAction
 *
 */
public class ScalingConfigActionBuilder implements Builder<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.ScalingConfigAction> {

    private ScalingConfigActionKey _key;
    private java.lang.String _nsServicePrimitiveNameRef;
    private ScalingTrigger _trigger;

    Map<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.ScalingConfigAction>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.ScalingConfigAction>> augmentation = Collections.emptyMap();

    public ScalingConfigActionBuilder() {
    }

    public ScalingConfigActionBuilder(ScalingConfigAction base) {
        if (base.getKey() == null) {
            this._key = new ScalingConfigActionKey(
                base.getTrigger()
            );
            this._trigger = base.getTrigger();
        } else {
            this._key = base.getKey();
            this._trigger = _key.getTrigger();
        }
        this._nsServicePrimitiveNameRef = base.getNsServicePrimitiveNameRef();
        if (base instanceof ScalingConfigActionImpl) {
            ScalingConfigActionImpl impl = (ScalingConfigActionImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.ScalingConfigAction> casted =(AugmentationHolder<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.ScalingConfigAction>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public ScalingConfigActionKey getKey() {
        return _key;
    }
    
    public java.lang.String getNsServicePrimitiveNameRef() {
        return _nsServicePrimitiveNameRef;
    }
    
    public ScalingTrigger getTrigger() {
        return _trigger;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.ScalingConfigAction>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public ScalingConfigActionBuilder setKey(final ScalingConfigActionKey value) {
        this._key = value;
        return this;
    }
    
     
    public ScalingConfigActionBuilder setNsServicePrimitiveNameRef(final java.lang.String value) {
        this._nsServicePrimitiveNameRef = value;
        return this;
    }
    
     
    public ScalingConfigActionBuilder setTrigger(final ScalingTrigger value) {
        this._trigger = value;
        return this;
    }
    
    public ScalingConfigActionBuilder addAugmentation(java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.ScalingConfigAction>> augmentationType, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.ScalingConfigAction> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ScalingConfigActionBuilder removeAugmentation(java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.ScalingConfigAction>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ScalingConfigAction build() {
        return new ScalingConfigActionImpl(this);
    }

    private static final class ScalingConfigActionImpl implements ScalingConfigAction {

        @Override
        public java.lang.Class<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.ScalingConfigAction> getImplementedInterface() {
            return http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.ScalingConfigAction.class;
        }

        private final ScalingConfigActionKey _key;
        private final java.lang.String _nsServicePrimitiveNameRef;
        private final ScalingTrigger _trigger;

        private Map<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.ScalingConfigAction>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.ScalingConfigAction>> augmentation = Collections.emptyMap();

        private ScalingConfigActionImpl(ScalingConfigActionBuilder base) {
            if (base.getKey() == null) {
                this._key = new ScalingConfigActionKey(
                    base.getTrigger()
                );
                this._trigger = base.getTrigger();
            } else {
                this._key = base.getKey();
                this._trigger = _key.getTrigger();
            }
            this._nsServicePrimitiveNameRef = base.getNsServicePrimitiveNameRef();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.ScalingConfigAction>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.ScalingConfigAction>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.ScalingConfigAction>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.ScalingConfigAction>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public ScalingConfigActionKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.String getNsServicePrimitiveNameRef() {
            return _nsServicePrimitiveNameRef;
        }
        
        @Override
        public ScalingTrigger getTrigger() {
            return _trigger;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.ScalingConfigAction>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_nsServicePrimitiveNameRef);
            result = prime * result + Objects.hashCode(_trigger);
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
            if (!http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.ScalingConfigAction.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.ScalingConfigAction other = (http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.ScalingConfigAction)obj;
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_nsServicePrimitiveNameRef, other.getNsServicePrimitiveNameRef())) {
                return false;
            }
            if (!Objects.equals(_trigger, other.getTrigger())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ScalingConfigActionImpl otherImpl = (ScalingConfigActionImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.ScalingConfigAction>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.ScalingConfigAction>> e : augmentation.entrySet()) {
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
            java.lang.String name = "ScalingConfigAction [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_nsServicePrimitiveNameRef != null) {
                builder.append("_nsServicePrimitiveNameRef=");
                builder.append(_nsServicePrimitiveNameRef);
                builder.append(", ");
            }
            if (_trigger != null) {
                builder.append("_trigger=");
                builder.append(_trigger);
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
