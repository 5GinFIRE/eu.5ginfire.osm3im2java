package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.NumaNodePolicy;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.NumaAware} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.NumaAware
 *
 */
public class NumaAwareBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.NumaAware> {

    private NumaNodePolicy _numaNodePolicy;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.NumaAware>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.NumaAware>> augmentation = Collections.emptyMap();

    public NumaAwareBuilder() {
    }

    public NumaAwareBuilder(NumaAware base) {
        this._numaNodePolicy = base.getNumaNodePolicy();
        if (base instanceof NumaAwareImpl) {
            NumaAwareImpl impl = (NumaAwareImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.NumaAware> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.NumaAware>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public NumaNodePolicy getNumaNodePolicy() {
        return _numaNodePolicy;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.NumaAware>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public NumaAwareBuilder setNumaNodePolicy(final NumaNodePolicy value) {
        this._numaNodePolicy = value;
        return this;
    }
    
    public NumaAwareBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.NumaAware>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.NumaAware> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public NumaAwareBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.NumaAware>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public NumaAware build() {
        return new NumaAwareImpl(this);
    }

    private static final class NumaAwareImpl implements NumaAware {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.NumaAware> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.NumaAware.class;
        }

        private final NumaNodePolicy _numaNodePolicy;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.NumaAware>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.NumaAware>> augmentation = Collections.emptyMap();

        private NumaAwareImpl(NumaAwareBuilder base) {
            this._numaNodePolicy = base.getNumaNodePolicy();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.NumaAware>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.NumaAware>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.NumaAware>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.NumaAware>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public NumaNodePolicy getNumaNodePolicy() {
            return _numaNodePolicy;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.NumaAware>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_numaNodePolicy);
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
            if (!ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.NumaAware.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.NumaAware other = (ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.NumaAware)obj;
            if (!Objects.equals(_numaNodePolicy, other.getNumaNodePolicy())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NumaAwareImpl otherImpl = (NumaAwareImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.NumaAware>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.NumaAware>> e : augmentation.entrySet()) {
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
            java.lang.String name = "NumaAware [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_numaNodePolicy != null) {
                builder.append("_numaNodePolicy=");
                builder.append(_numaNodePolicy);
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
