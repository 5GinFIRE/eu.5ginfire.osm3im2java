package ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.scaling.group;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.scaling.group.Instance} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.scaling.group.Instance
 *
 */
public class InstanceBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.scaling.group.Instance> {

    private java.lang.Integer _id;
    private InstanceKey _key;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.scaling.group.Instance>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.scaling.group.Instance>> augmentation = Collections.emptyMap();

    public InstanceBuilder() {
    }

    public InstanceBuilder(Instance base) {
        if (base.getKey() == null) {
            this._key = new InstanceKey(
                base.getId()
            );
            this._id = base.getId();
        } else {
            this._key = base.getKey();
            this._id = _key.getId();
        }
        if (base instanceof InstanceImpl) {
            InstanceImpl impl = (InstanceImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.scaling.group.Instance> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.scaling.group.Instance>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public java.lang.Integer getId() {
        return _id;
    }
    
    public InstanceKey getKey() {
        return _key;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.scaling.group.Instance>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static void checkIdRange(final int value) {
         if (value >= 0 && value <= 65535) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..65535]].", value));
     }
    
    public InstanceBuilder setId(final java.lang.Integer value) {
    if (value != null) {
        checkIdRange(value);
    }
        this._id = value;
        return this;
    }
    
     
    public InstanceBuilder setKey(final InstanceKey value) {
        this._key = value;
        return this;
    }
    
    public InstanceBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.scaling.group.Instance>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.scaling.group.Instance> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public InstanceBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.scaling.group.Instance>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Instance build() {
        return new InstanceImpl(this);
    }

    private static final class InstanceImpl implements Instance {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.scaling.group.Instance> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.scaling.group.Instance.class;
        }

        private final java.lang.Integer _id;
        private final InstanceKey _key;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.scaling.group.Instance>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.scaling.group.Instance>> augmentation = Collections.emptyMap();

        private InstanceImpl(InstanceBuilder base) {
            if (base.getKey() == null) {
                this._key = new InstanceKey(
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
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.scaling.group.Instance>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.scaling.group.Instance>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.scaling.group.Instance>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.scaling.group.Instance>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Integer getId() {
            return _id;
        }
        
        @Override
        public InstanceKey getKey() {
            return _key;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.scaling.group.Instance>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            if (!ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.scaling.group.Instance.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.scaling.group.Instance other = (ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.scaling.group.Instance)obj;
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                InstanceImpl otherImpl = (InstanceImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.scaling.group.Instance>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.scaling.group.Instance>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Instance [";
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
