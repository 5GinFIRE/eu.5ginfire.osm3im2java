package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.list;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.info.IpProfileParams;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.list.IpProfiles} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.list.IpProfiles
 *
 */
public class IpProfilesBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.list.IpProfiles> {

    private java.lang.String _description;
    private IpProfileParams _ipProfileParams;
    private IpProfilesKey _key;
    private java.lang.String _name;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.list.IpProfiles>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.list.IpProfiles>> augmentation = Collections.emptyMap();

    public IpProfilesBuilder() {
    }
    public IpProfilesBuilder(ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.IpProfileInfo arg) {
        this._ipProfileParams = arg.getIpProfileParams();
    }

    public IpProfilesBuilder(IpProfiles base) {
        if (base.getKey() == null) {
            this._key = new IpProfilesKey(
                base.getName()
            );
            this._name = base.getName();
        } else {
            this._key = base.getKey();
            this._name = _key.getName();
        }
        this._description = base.getDescription();
        this._ipProfileParams = base.getIpProfileParams();
        if (base instanceof IpProfilesImpl) {
            IpProfilesImpl impl = (IpProfilesImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.list.IpProfiles> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.list.IpProfiles>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.IpProfileInfo</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.IpProfileInfo) {
            this._ipProfileParams = ((ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.IpProfileInfo)arg).getIpProfileParams();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.IpProfileInfo] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.String getDescription() {
        return _description;
    }
    
    public IpProfileParams getIpProfileParams() {
        return _ipProfileParams;
    }
    
    public IpProfilesKey getKey() {
        return _key;
    }
    
    public java.lang.String getName() {
        return _name;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.list.IpProfiles>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public IpProfilesBuilder setDescription(final java.lang.String value) {
        this._description = value;
        return this;
    }
    
     
    public IpProfilesBuilder setIpProfileParams(final IpProfileParams value) {
        this._ipProfileParams = value;
        return this;
    }
    
     
    public IpProfilesBuilder setKey(final IpProfilesKey value) {
        this._key = value;
        return this;
    }
    
     
    public IpProfilesBuilder setName(final java.lang.String value) {
        this._name = value;
        return this;
    }
    
    public IpProfilesBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.list.IpProfiles>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.list.IpProfiles> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public IpProfilesBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.list.IpProfiles>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public IpProfiles build() {
        return new IpProfilesImpl(this);
    }

    private static final class IpProfilesImpl implements IpProfiles {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.list.IpProfiles> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.list.IpProfiles.class;
        }

        private final java.lang.String _description;
        private final IpProfileParams _ipProfileParams;
        private final IpProfilesKey _key;
        private final java.lang.String _name;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.list.IpProfiles>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.list.IpProfiles>> augmentation = Collections.emptyMap();

        private IpProfilesImpl(IpProfilesBuilder base) {
            if (base.getKey() == null) {
                this._key = new IpProfilesKey(
                    base.getName()
                );
                this._name = base.getName();
            } else {
                this._key = base.getKey();
                this._name = _key.getName();
            }
            this._description = base.getDescription();
            this._ipProfileParams = base.getIpProfileParams();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.list.IpProfiles>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.list.IpProfiles>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.list.IpProfiles>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.list.IpProfiles>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getDescription() {
            return _description;
        }
        
        @Override
        public IpProfileParams getIpProfileParams() {
            return _ipProfileParams;
        }
        
        @Override
        public IpProfilesKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.String getName() {
            return _name;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.list.IpProfiles>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_description);
            result = prime * result + Objects.hashCode(_ipProfileParams);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_name);
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
            if (!ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.list.IpProfiles.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.list.IpProfiles other = (ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.list.IpProfiles)obj;
            if (!Objects.equals(_description, other.getDescription())) {
                return false;
            }
            if (!Objects.equals(_ipProfileParams, other.getIpProfileParams())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                IpProfilesImpl otherImpl = (IpProfilesImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.list.IpProfiles>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.list.IpProfiles>> e : augmentation.entrySet()) {
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
            java.lang.String name = "IpProfiles [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_description != null) {
                builder.append("_description=");
                builder.append(_description);
                builder.append(", ");
            }
            if (_ipProfileParams != null) {
                builder.append("_ipProfileParams=");
                builder.append(_ipProfileParams);
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
