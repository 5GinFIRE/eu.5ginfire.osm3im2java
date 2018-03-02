package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.host.epa;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.CpuFeatureType;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;

import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.host.epa.CpuFeature} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.host.epa.CpuFeature
 *
 */
public class CpuFeatureBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.host.epa.CpuFeature> {

    private CpuFeatureType _feature;
    private CpuFeatureKey _key;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.host.epa.CpuFeature>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.host.epa.CpuFeature>> augmentation = Collections.emptyMap();

    public CpuFeatureBuilder() {
    }

    public CpuFeatureBuilder(CpuFeature base) {
        if (base.getKey() == null) {
            this._key = new CpuFeatureKey(
                base.getFeature()
            );
            this._feature = base.getFeature();
        } else {
            this._key = base.getKey();
            this._feature = _key.getFeature();
        }
        if (base instanceof CpuFeatureImpl) {
            CpuFeatureImpl impl = (CpuFeatureImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.host.epa.CpuFeature> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.host.epa.CpuFeature>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public CpuFeatureType getFeature() {
        return _feature;
    }
    
    public CpuFeatureKey getKey() {
        return _key;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.host.epa.CpuFeature>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public CpuFeatureBuilder setFeature(final CpuFeatureType value) {
        this._feature = value;
        return this;
    }
    
     
    public CpuFeatureBuilder setKey(final CpuFeatureKey value) {
        this._key = value;
        return this;
    }
    
    public CpuFeatureBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.host.epa.CpuFeature>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.host.epa.CpuFeature> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public CpuFeatureBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.host.epa.CpuFeature>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public CpuFeature build() {
        return new CpuFeatureImpl(this);
    }

    private static final class CpuFeatureImpl implements CpuFeature {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.host.epa.CpuFeature> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.host.epa.CpuFeature.class;
        }

        private final CpuFeatureType _feature;
        private final CpuFeatureKey _key;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.host.epa.CpuFeature>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.host.epa.CpuFeature>> augmentation = Collections.emptyMap();

        private CpuFeatureImpl(CpuFeatureBuilder base) {
            if (base.getKey() == null) {
                this._key = new CpuFeatureKey(
                    base.getFeature()
                );
                this._feature = base.getFeature();
            } else {
                this._key = base.getKey();
                this._feature = _key.getFeature();
            }
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.host.epa.CpuFeature>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.host.epa.CpuFeature>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.host.epa.CpuFeature>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.host.epa.CpuFeature>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public CpuFeatureType getFeature() {
            return _feature;
        }
        
        @Override
        public CpuFeatureKey getKey() {
            return _key;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.host.epa.CpuFeature>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_feature);
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
            if (!ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.host.epa.CpuFeature.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.host.epa.CpuFeature other = (ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.host.epa.CpuFeature)obj;
            if (!Objects.equals(_feature, other.getFeature())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                CpuFeatureImpl otherImpl = (CpuFeatureImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.host.epa.CpuFeature>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.host.epa.CpuFeature>> e : augmentation.entrySet()) {
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
            java.lang.String name = "CpuFeature [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_feature != null) {
                builder.append("_feature=");
                builder.append(_feature);
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
