package ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.config.Nsr;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.NsInstanceConfig} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.NsInstanceConfig
 *
 */
public class NsInstanceConfigBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.NsInstanceConfig> {

    private List<Nsr> _nsr;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.NsInstanceConfig>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.NsInstanceConfig>> augmentation = Collections.emptyMap();

    public NsInstanceConfigBuilder() {
    }

    public NsInstanceConfigBuilder(NsInstanceConfig base) {
        this._nsr = base.getNsr();
        if (base instanceof NsInstanceConfigImpl) {
            NsInstanceConfigImpl impl = (NsInstanceConfigImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.NsInstanceConfig> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.NsInstanceConfig>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public List<Nsr> getNsr() {
        return _nsr;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.NsInstanceConfig>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public NsInstanceConfigBuilder setNsr(final List<Nsr> value) {
        this._nsr = value;
        return this;
    }
    
    public NsInstanceConfigBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.NsInstanceConfig>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.NsInstanceConfig> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public NsInstanceConfigBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.NsInstanceConfig>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public NsInstanceConfig build() {
        return new NsInstanceConfigImpl(this);
    }

    private static final class NsInstanceConfigImpl implements NsInstanceConfig {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.NsInstanceConfig> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.NsInstanceConfig.class;
        }

        private final List<Nsr> _nsr;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.NsInstanceConfig>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.NsInstanceConfig>> augmentation = Collections.emptyMap();

        private NsInstanceConfigImpl(NsInstanceConfigBuilder base) {
            this._nsr = base.getNsr();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.NsInstanceConfig>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.NsInstanceConfig>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.NsInstanceConfig>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.NsInstanceConfig>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<Nsr> getNsr() {
            return _nsr;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.NsInstanceConfig>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_nsr);
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
            if (!ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.NsInstanceConfig.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.NsInstanceConfig other = (ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.NsInstanceConfig)obj;
            if (!Objects.equals(_nsr, other.getNsr())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NsInstanceConfigImpl otherImpl = (NsInstanceConfigImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.NsInstanceConfig>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.NsInstanceConfig>> e : augmentation.entrySet()) {
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
            java.lang.String name = "NsInstanceConfig [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_nsr != null) {
                builder.append("_nsr=");
                builder.append(_nsr);
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
