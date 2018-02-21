package ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.CloudAccountType;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.CloudProvider;

import java.util.HashMap;

import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.NsdPlacementGroupMaps} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.NsdPlacementGroupMaps
 *
 */
public class NsdPlacementGroupMapsBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.NsdPlacementGroupMaps> {

    private CloudProvider _cloudProvider;
    private CloudAccountType _cloudType;
    private NsdPlacementGroupMapsKey _key;
    private java.lang.String _placementGroupRef;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.NsdPlacementGroupMaps>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.NsdPlacementGroupMaps>> augmentation = Collections.emptyMap();

    public NsdPlacementGroupMapsBuilder() {
    }
    public NsdPlacementGroupMapsBuilder(ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PlacementGroupInput arg) {
        this._cloudType = arg.getCloudType();
        this._cloudProvider = arg.getCloudProvider();
    }

    public NsdPlacementGroupMapsBuilder(NsdPlacementGroupMaps base) {
        if (base.getKey() == null) {
            this._key = new NsdPlacementGroupMapsKey(
                base.getPlacementGroupRef()
            );
            this._placementGroupRef = base.getPlacementGroupRef();
        } else {
            this._key = base.getKey();
            this._placementGroupRef = _key.getPlacementGroupRef();
        }
        this._cloudProvider = base.getCloudProvider();
        this._cloudType = base.getCloudType();
        if (base instanceof NsdPlacementGroupMapsImpl) {
            NsdPlacementGroupMapsImpl impl = (NsdPlacementGroupMapsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.NsdPlacementGroupMaps> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.NsdPlacementGroupMaps>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PlacementGroupInput</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PlacementGroupInput) {
            this._cloudType = ((ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PlacementGroupInput)arg).getCloudType();
            this._cloudProvider = ((ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PlacementGroupInput)arg).getCloudProvider();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PlacementGroupInput] \n" +
              "but was: " + arg
            );
        }
    }

    public CloudProvider getCloudProvider() {
        return _cloudProvider;
    }
    
    public CloudAccountType getCloudType() {
        return _cloudType;
    }
    
    public NsdPlacementGroupMapsKey getKey() {
        return _key;
    }
    
    public java.lang.String getPlacementGroupRef() {
        return _placementGroupRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.NsdPlacementGroupMaps>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public NsdPlacementGroupMapsBuilder setCloudProvider(final CloudProvider value) {
        this._cloudProvider = value;
        return this;
    }
    
     
    public NsdPlacementGroupMapsBuilder setCloudType(final CloudAccountType value) {
        this._cloudType = value;
        return this;
    }
    
     
    public NsdPlacementGroupMapsBuilder setKey(final NsdPlacementGroupMapsKey value) {
        this._key = value;
        return this;
    }
    
     
    public NsdPlacementGroupMapsBuilder setPlacementGroupRef(final java.lang.String value) {
        this._placementGroupRef = value;
        return this;
    }
    
    public NsdPlacementGroupMapsBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.NsdPlacementGroupMaps>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.NsdPlacementGroupMaps> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public NsdPlacementGroupMapsBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.NsdPlacementGroupMaps>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public NsdPlacementGroupMaps build() {
        return new NsdPlacementGroupMapsImpl(this);
    }

    private static final class NsdPlacementGroupMapsImpl implements NsdPlacementGroupMaps {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.NsdPlacementGroupMaps> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.NsdPlacementGroupMaps.class;
        }

        private final CloudProvider _cloudProvider;
        private final CloudAccountType _cloudType;
        private final NsdPlacementGroupMapsKey _key;
        private final java.lang.String _placementGroupRef;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.NsdPlacementGroupMaps>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.NsdPlacementGroupMaps>> augmentation = Collections.emptyMap();

        private NsdPlacementGroupMapsImpl(NsdPlacementGroupMapsBuilder base) {
            if (base.getKey() == null) {
                this._key = new NsdPlacementGroupMapsKey(
                    base.getPlacementGroupRef()
                );
                this._placementGroupRef = base.getPlacementGroupRef();
            } else {
                this._key = base.getKey();
                this._placementGroupRef = _key.getPlacementGroupRef();
            }
            this._cloudProvider = base.getCloudProvider();
            this._cloudType = base.getCloudType();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.NsdPlacementGroupMaps>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.NsdPlacementGroupMaps>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.NsdPlacementGroupMaps>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.NsdPlacementGroupMaps>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public CloudProvider getCloudProvider() {
            return _cloudProvider;
        }
        
        @Override
        public CloudAccountType getCloudType() {
            return _cloudType;
        }
        
        @Override
        public NsdPlacementGroupMapsKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.String getPlacementGroupRef() {
            return _placementGroupRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.NsdPlacementGroupMaps>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_cloudProvider);
            result = prime * result + Objects.hashCode(_cloudType);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_placementGroupRef);
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
            if (!ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.NsdPlacementGroupMaps.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.NsdPlacementGroupMaps other = (ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.NsdPlacementGroupMaps)obj;
            if (!Objects.equals(_cloudProvider, other.getCloudProvider())) {
                return false;
            }
            if (!Objects.equals(_cloudType, other.getCloudType())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_placementGroupRef, other.getPlacementGroupRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NsdPlacementGroupMapsImpl otherImpl = (NsdPlacementGroupMapsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.NsdPlacementGroupMaps>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.NsdPlacementGroupMaps>> e : augmentation.entrySet()) {
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
            java.lang.String name = "NsdPlacementGroupMaps [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_cloudProvider != null) {
                builder.append("_cloudProvider=");
                builder.append(_cloudProvider);
                builder.append(", ");
            }
            if (_cloudType != null) {
                builder.append("_cloudType=");
                builder.append(_cloudType);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_placementGroupRef != null) {
                builder.append("_placementGroupRef=");
                builder.append(_placementGroupRef);
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
