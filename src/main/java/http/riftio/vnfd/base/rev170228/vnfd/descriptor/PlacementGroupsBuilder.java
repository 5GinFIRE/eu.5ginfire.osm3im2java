package http.riftio.vnfd.base.rev170228.vnfd.descriptor;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import http.riftio.vnfd.base.rev170228.vnfd.descriptor.placement.groups.MemberVdus;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PlacementGroupInfo.Strategy;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link http.riftio.vnfd.base.rev170228.vnfd.descriptor.PlacementGroups} instances.
 * 
 * @see http.riftio.vnfd.base.rev170228.vnfd.descriptor.PlacementGroups
 *
 */
public class PlacementGroupsBuilder implements Builder<http.riftio.vnfd.base.rev170228.vnfd.descriptor.PlacementGroups> {

    private PlacementGroupsKey _key;
    private List<MemberVdus> _memberVdus;
    private java.lang.String _name;
    private java.lang.String _requirement;
    private Strategy _strategy;

    Map<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.PlacementGroups>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.PlacementGroups>> augmentation = Collections.emptyMap();

    public PlacementGroupsBuilder() {
    }
    public PlacementGroupsBuilder(ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PlacementGroupInfo arg) {
        this._name = arg.getName();
        this._requirement = arg.getRequirement();
        this._strategy = arg.getStrategy();
    }

    public PlacementGroupsBuilder(PlacementGroups base) {
        if (base.getKey() == null) {
            this._key = new PlacementGroupsKey(
                base.getName()
            );
            this._name = base.getName();
        } else {
            this._key = base.getKey();
            this._name = _key.getName();
        }
        this._memberVdus = base.getMemberVdus();
        this._requirement = base.getRequirement();
        this._strategy = base.getStrategy();
        if (base instanceof PlacementGroupsImpl) {
            PlacementGroupsImpl impl = (PlacementGroupsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<http.riftio.vnfd.base.rev170228.vnfd.descriptor.PlacementGroups> casted =(AugmentationHolder<http.riftio.vnfd.base.rev170228.vnfd.descriptor.PlacementGroups>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PlacementGroupInfo</li>
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
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PlacementGroupInfo] \n" +
              "but was: " + arg
            );
        }
    }

    public PlacementGroupsKey getKey() {
        return _key;
    }
    
    public List<MemberVdus> getMemberVdus() {
        return _memberVdus;
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
    public <E extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.PlacementGroups>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public PlacementGroupsBuilder setKey(final PlacementGroupsKey value) {
        this._key = value;
        return this;
    }
    
     
    public PlacementGroupsBuilder setMemberVdus(final List<MemberVdus> value) {
        this._memberVdus = value;
        return this;
    }
    
     
    public PlacementGroupsBuilder setName(final java.lang.String value) {
        this._name = value;
        return this;
    }
    
     
    public PlacementGroupsBuilder setRequirement(final java.lang.String value) {
        this._requirement = value;
        return this;
    }
    
     
    public PlacementGroupsBuilder setStrategy(final Strategy value) {
        this._strategy = value;
        return this;
    }
    
    public PlacementGroupsBuilder addAugmentation(java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.PlacementGroups>> augmentationType, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.PlacementGroups> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public PlacementGroupsBuilder removeAugmentation(java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.PlacementGroups>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public PlacementGroups build() {
        return new PlacementGroupsImpl(this);
    }

    private static final class PlacementGroupsImpl implements PlacementGroups {

        @Override
        public java.lang.Class<http.riftio.vnfd.base.rev170228.vnfd.descriptor.PlacementGroups> getImplementedInterface() {
            return http.riftio.vnfd.base.rev170228.vnfd.descriptor.PlacementGroups.class;
        }

        private final PlacementGroupsKey _key;
        private final List<MemberVdus> _memberVdus;
        private final java.lang.String _name;
        private final java.lang.String _requirement;
        private final Strategy _strategy;

        private Map<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.PlacementGroups>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.PlacementGroups>> augmentation = Collections.emptyMap();

        private PlacementGroupsImpl(PlacementGroupsBuilder base) {
            if (base.getKey() == null) {
                this._key = new PlacementGroupsKey(
                    base.getName()
                );
                this._name = base.getName();
            } else {
                this._key = base.getKey();
                this._name = _key.getName();
            }
            this._memberVdus = base.getMemberVdus();
            this._requirement = base.getRequirement();
            this._strategy = base.getStrategy();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.PlacementGroups>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.PlacementGroups>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.PlacementGroups>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.PlacementGroups>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public PlacementGroupsKey getKey() {
            return _key;
        }
        
        @Override
        public List<MemberVdus> getMemberVdus() {
            return _memberVdus;
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
        public <E extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.PlacementGroups>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_memberVdus);
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
            if (!http.riftio.vnfd.base.rev170228.vnfd.descriptor.PlacementGroups.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            http.riftio.vnfd.base.rev170228.vnfd.descriptor.PlacementGroups other = (http.riftio.vnfd.base.rev170228.vnfd.descriptor.PlacementGroups)obj;
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_memberVdus, other.getMemberVdus())) {
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
                PlacementGroupsImpl otherImpl = (PlacementGroupsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.PlacementGroups>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.PlacementGroups>> e : augmentation.entrySet()) {
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
            java.lang.String name = "PlacementGroups [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_memberVdus != null) {
                builder.append("_memberVdus=");
                builder.append(_memberVdus);
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
