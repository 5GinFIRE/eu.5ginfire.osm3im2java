package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.hypervisor.epa;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.hypervisor.epa.HypervisorEpa.Type;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.hypervisor.epa.HypervisorEpa} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.hypervisor.epa.HypervisorEpa
 *
 */
public class HypervisorEpaBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.hypervisor.epa.HypervisorEpa> {

    private Type _type;
    private java.lang.String _version;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.hypervisor.epa.HypervisorEpa>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.hypervisor.epa.HypervisorEpa>> augmentation = Collections.emptyMap();

    public HypervisorEpaBuilder() {
    }

    public HypervisorEpaBuilder(HypervisorEpa base) {
        this._type = base.getType();
        this._version = base.getVersion();
        if (base instanceof HypervisorEpaImpl) {
            HypervisorEpaImpl impl = (HypervisorEpaImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.hypervisor.epa.HypervisorEpa> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.hypervisor.epa.HypervisorEpa>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public Type getType() {
        return _type;
    }
    
    public java.lang.String getVersion() {
        return _version;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.hypervisor.epa.HypervisorEpa>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public HypervisorEpaBuilder setType(final Type value) {
        this._type = value;
        return this;
    }
    
     
    public HypervisorEpaBuilder setVersion(final java.lang.String value) {
        this._version = value;
        return this;
    }
    
    public HypervisorEpaBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.hypervisor.epa.HypervisorEpa>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.hypervisor.epa.HypervisorEpa> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public HypervisorEpaBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.hypervisor.epa.HypervisorEpa>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public HypervisorEpa build() {
        return new HypervisorEpaImpl(this);
    }

    private static final class HypervisorEpaImpl implements HypervisorEpa {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.hypervisor.epa.HypervisorEpa> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.hypervisor.epa.HypervisorEpa.class;
        }

        private final Type _type;
        private final java.lang.String _version;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.hypervisor.epa.HypervisorEpa>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.hypervisor.epa.HypervisorEpa>> augmentation = Collections.emptyMap();

        private HypervisorEpaImpl(HypervisorEpaBuilder base) {
            this._type = base.getType();
            this._version = base.getVersion();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.hypervisor.epa.HypervisorEpa>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.hypervisor.epa.HypervisorEpa>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.hypervisor.epa.HypervisorEpa>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.hypervisor.epa.HypervisorEpa>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public Type getType() {
            return _type;
        }
        
        @Override
        public java.lang.String getVersion() {
            return _version;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.hypervisor.epa.HypervisorEpa>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_type);
            result = prime * result + Objects.hashCode(_version);
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
            if (!ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.hypervisor.epa.HypervisorEpa.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.hypervisor.epa.HypervisorEpa other = (ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.hypervisor.epa.HypervisorEpa)obj;
            if (!Objects.equals(_type, other.getType())) {
                return false;
            }
            if (!Objects.equals(_version, other.getVersion())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                HypervisorEpaImpl otherImpl = (HypervisorEpaImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.hypervisor.epa.HypervisorEpa>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.hypervisor.epa.HypervisorEpa>> e : augmentation.entrySet()) {
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
            java.lang.String name = "HypervisorEpa [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_type != null) {
                builder.append("_type=");
                builder.append(_type);
                builder.append(", ");
            }
            if (_version != null) {
                builder.append("_version=");
                builder.append(_version);
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
