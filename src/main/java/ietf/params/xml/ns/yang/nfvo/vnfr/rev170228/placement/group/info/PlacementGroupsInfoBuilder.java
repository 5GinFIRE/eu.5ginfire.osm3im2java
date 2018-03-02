package ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.placement.group.info;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.CloudAccountType;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PlacementGroupInfo.Strategy;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.CloudProvider;

import java.util.HashMap;

import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.placement.group.info.PlacementGroupsInfo} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.placement.group.info.PlacementGroupsInfo
 *
 */
public class PlacementGroupsInfoBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.placement.group.info.PlacementGroupsInfo> {

    private CloudProvider _cloudProvider;
    private CloudAccountType _cloudType;
    private PlacementGroupsInfoKey _key;
    private java.lang.String _name;
    private java.lang.String _requirement;
    private Strategy _strategy;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.placement.group.info.PlacementGroupsInfo>>, Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.placement.group.info.PlacementGroupsInfo>> augmentation = Collections.emptyMap();

    public PlacementGroupsInfoBuilder() {
    }
    public PlacementGroupsInfoBuilder(ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PlacementGroupInfo arg) {
        this._name = arg.getName();
        this._requirement = arg.getRequirement();
        this._strategy = arg.getStrategy();
    }
    public PlacementGroupsInfoBuilder(ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PlacementGroupInput arg) {
        this._cloudType = arg.getCloudType();
        this._cloudProvider = arg.getCloudProvider();
    }

    public PlacementGroupsInfoBuilder(PlacementGroupsInfo base) {
        if (base.getKey() == null) {
            this._key = new PlacementGroupsInfoKey(
                base.getName()
            );
            this._name = base.getName();
        } else {
            this._key = base.getKey();
            this._name = _key.getName();
        }
        this._cloudProvider = base.getCloudProvider();
        this._cloudType = base.getCloudType();
        this._requirement = base.getRequirement();
        this._strategy = base.getStrategy();
        if (base instanceof PlacementGroupsInfoImpl) {
            PlacementGroupsInfoImpl impl = (PlacementGroupsInfoImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.placement.group.info.PlacementGroupsInfo> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.placement.group.info.PlacementGroupsInfo>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PlacementGroupInfo</li>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PlacementGroupInput</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PlacementGroupInfo) {
            this._name = ((ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PlacementGroupInfo)arg).getName();
            this._requirement = ((ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PlacementGroupInfo)arg).getRequirement();
            this._strategy = ((ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PlacementGroupInfo)arg).getStrategy();
            isValidArg = true;
        }
        if (arg instanceof ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PlacementGroupInput) {
            this._cloudType = ((ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PlacementGroupInput)arg).getCloudType();
            this._cloudProvider = ((ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PlacementGroupInput)arg).getCloudProvider();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PlacementGroupInfo, org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PlacementGroupInput] \n" +
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
    
    public PlacementGroupsInfoKey getKey() {
        return _key;
    }
    
    public java.lang.String getName() {
        return _name;
    }
    
    public java.lang.String getRequirement() {
        return _requirement;
    }
    
    public Strategy getStrategy() {
        return _strategy;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.placement.group.info.PlacementGroupsInfo>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public PlacementGroupsInfoBuilder setCloudProvider(final CloudProvider value) {
        this._cloudProvider = value;
        return this;
    }
    
     
    public PlacementGroupsInfoBuilder setCloudType(final CloudAccountType value) {
        this._cloudType = value;
        return this;
    }
    
     
    public PlacementGroupsInfoBuilder setKey(final PlacementGroupsInfoKey value) {
        this._key = value;
        return this;
    }
    
     
    public PlacementGroupsInfoBuilder setName(final java.lang.String value) {
        this._name = value;
        return this;
    }
    
     
    public PlacementGroupsInfoBuilder setRequirement(final java.lang.String value) {
        this._requirement = value;
        return this;
    }
    
     
    public PlacementGroupsInfoBuilder setStrategy(final Strategy value) {
        this._strategy = value;
        return this;
    }
    
    public PlacementGroupsInfoBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.placement.group.info.PlacementGroupsInfo>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.placement.group.info.PlacementGroupsInfo> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public PlacementGroupsInfoBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.placement.group.info.PlacementGroupsInfo>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public PlacementGroupsInfo build() {
        return new PlacementGroupsInfoImpl(this);
    }

    private static final class PlacementGroupsInfoImpl implements PlacementGroupsInfo {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.placement.group.info.PlacementGroupsInfo> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.placement.group.info.PlacementGroupsInfo.class;
        }

        private final CloudProvider _cloudProvider;
        private final CloudAccountType _cloudType;
        private final PlacementGroupsInfoKey _key;
        private final java.lang.String _name;
        private final java.lang.String _requirement;
        private final Strategy _strategy;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.placement.group.info.PlacementGroupsInfo>>, Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.placement.group.info.PlacementGroupsInfo>> augmentation = Collections.emptyMap();

        private PlacementGroupsInfoImpl(PlacementGroupsInfoBuilder base) {
            if (base.getKey() == null) {
                this._key = new PlacementGroupsInfoKey(
                    base.getName()
                );
                this._name = base.getName();
            } else {
                this._key = base.getKey();
                this._name = _key.getName();
            }
            this._cloudProvider = base.getCloudProvider();
            this._cloudType = base.getCloudType();
            this._requirement = base.getRequirement();
            this._strategy = base.getStrategy();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.placement.group.info.PlacementGroupsInfo>>, Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.placement.group.info.PlacementGroupsInfo>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.placement.group.info.PlacementGroupsInfo>>, Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.placement.group.info.PlacementGroupsInfo>>singletonMap(e.getKey(), e.getValue());
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
        public PlacementGroupsInfoKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.String getName() {
            return _name;
        }
        
        @Override
        public java.lang.String getRequirement() {
            return _requirement;
        }
        
        @Override
        public Strategy getStrategy() {
            return _strategy;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.placement.group.info.PlacementGroupsInfo>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_requirement);
            result = prime * result + Objects.hashCode(_strategy);
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
            if (!ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.placement.group.info.PlacementGroupsInfo.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.placement.group.info.PlacementGroupsInfo other = (ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.placement.group.info.PlacementGroupsInfo)obj;
            if (!Objects.equals(_cloudProvider, other.getCloudProvider())) {
                return false;
            }
            if (!Objects.equals(_cloudType, other.getCloudType())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_requirement, other.getRequirement())) {
                return false;
            }
            if (!Objects.equals(_strategy, other.getStrategy())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                PlacementGroupsInfoImpl otherImpl = (PlacementGroupsInfoImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.placement.group.info.PlacementGroupsInfo>>, Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.placement.group.info.PlacementGroupsInfo>> e : augmentation.entrySet()) {
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
            java.lang.String name = "PlacementGroupsInfo [";
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
            if (_name != null) {
                builder.append("_name=");
                builder.append(_name);
                builder.append(", ");
            }
            if (_requirement != null) {
                builder.append("_requirement=");
                builder.append(_requirement);
                builder.append(", ");
            }
            if (_strategy != null) {
                builder.append("_strategy=");
                builder.append(_strategy);
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
