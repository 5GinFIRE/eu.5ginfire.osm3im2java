package ietf.params.xml.ns.yang.nfvo.nsr.rev170208.start.network.service.input;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.CloudAccountType;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.CloudProvider;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.start.network.service.input.vnfd.placement.group.maps.SshAuthorizedKey;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.start.network.service.input.vnfd.placement.group.maps.User;

import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.nsr.rev170208.start.network.service.input.VnfdPlacementGroupMaps} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.nsr.rev170208.start.network.service.input.VnfdPlacementGroupMaps
 *
 */
public class VnfdPlacementGroupMapsBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.start.network.service.input.VnfdPlacementGroupMaps> {

    private CloudProvider _cloudProvider;
    private CloudAccountType _cloudType;
    private VnfdPlacementGroupMapsKey _key;
    private java.lang.Object _placementGroupRef;
    private List<SshAuthorizedKey> _sshAuthorizedKey;
    private List<User> _user;
    private Uuid _vnfdIdRef;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.start.network.service.input.VnfdPlacementGroupMaps>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.start.network.service.input.VnfdPlacementGroupMaps>> augmentation = Collections.emptyMap();

    public VnfdPlacementGroupMapsBuilder() {
    }
    public VnfdPlacementGroupMapsBuilder(ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PlacementGroupInput arg) {
        this._cloudType = arg.getCloudType();
        this._cloudProvider = arg.getCloudProvider();
    }

    public VnfdPlacementGroupMapsBuilder(VnfdPlacementGroupMaps base) {
        if (base.getKey() == null) {
            this._key = new VnfdPlacementGroupMapsKey(
                base.getPlacementGroupRef(), 
                base.getVnfdIdRef()
            );
            this._placementGroupRef = base.getPlacementGroupRef();
            this._vnfdIdRef = base.getVnfdIdRef();
        } else {
            this._key = base.getKey();
            this._placementGroupRef = _key.getPlacementGroupRef();
            this._vnfdIdRef = _key.getVnfdIdRef();
        }
        this._cloudProvider = base.getCloudProvider();
        this._cloudType = base.getCloudType();
        this._sshAuthorizedKey = base.getSshAuthorizedKey();
        this._user = base.getUser();
        if (base instanceof VnfdPlacementGroupMapsImpl) {
            VnfdPlacementGroupMapsImpl impl = (VnfdPlacementGroupMapsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.start.network.service.input.VnfdPlacementGroupMaps> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.start.network.service.input.VnfdPlacementGroupMaps>) base;
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
    
    public VnfdPlacementGroupMapsKey getKey() {
        return _key;
    }
    
    public java.lang.Object getPlacementGroupRef() {
        return _placementGroupRef;
    }
    
    public List<SshAuthorizedKey> getSshAuthorizedKey() {
        return _sshAuthorizedKey;
    }
    
    public List<User> getUser() {
        return _user;
    }
    
    public Uuid getVnfdIdRef() {
        return _vnfdIdRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.start.network.service.input.VnfdPlacementGroupMaps>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public VnfdPlacementGroupMapsBuilder setCloudProvider(final CloudProvider value) {
        this._cloudProvider = value;
        return this;
    }
    
     
    public VnfdPlacementGroupMapsBuilder setCloudType(final CloudAccountType value) {
        this._cloudType = value;
        return this;
    }
    
     
    public VnfdPlacementGroupMapsBuilder setKey(final VnfdPlacementGroupMapsKey value) {
        this._key = value;
        return this;
    }
    
     
    public VnfdPlacementGroupMapsBuilder setPlacementGroupRef(final java.lang.Object value) {
        this._placementGroupRef = value;
        return this;
    }
    
     
    public VnfdPlacementGroupMapsBuilder setSshAuthorizedKey(final List<SshAuthorizedKey> value) {
        this._sshAuthorizedKey = value;
        return this;
    }
    
     
    public VnfdPlacementGroupMapsBuilder setUser(final List<User> value) {
        this._user = value;
        return this;
    }
    
     
    public VnfdPlacementGroupMapsBuilder setVnfdIdRef(final Uuid value) {
        this._vnfdIdRef = value;
        return this;
    }
    
    public VnfdPlacementGroupMapsBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.start.network.service.input.VnfdPlacementGroupMaps>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.start.network.service.input.VnfdPlacementGroupMaps> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VnfdPlacementGroupMapsBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.start.network.service.input.VnfdPlacementGroupMaps>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public VnfdPlacementGroupMaps build() {
        return new VnfdPlacementGroupMapsImpl(this);
    }

    private static final class VnfdPlacementGroupMapsImpl implements VnfdPlacementGroupMaps {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.start.network.service.input.VnfdPlacementGroupMaps> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.nsr.rev170208.start.network.service.input.VnfdPlacementGroupMaps.class;
        }

        private final CloudProvider _cloudProvider;
        private final CloudAccountType _cloudType;
        private final VnfdPlacementGroupMapsKey _key;
        private final java.lang.Object _placementGroupRef;
        private final List<SshAuthorizedKey> _sshAuthorizedKey;
        private final List<User> _user;
        private final Uuid _vnfdIdRef;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.start.network.service.input.VnfdPlacementGroupMaps>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.start.network.service.input.VnfdPlacementGroupMaps>> augmentation = Collections.emptyMap();

        private VnfdPlacementGroupMapsImpl(VnfdPlacementGroupMapsBuilder base) {
            if (base.getKey() == null) {
                this._key = new VnfdPlacementGroupMapsKey(
                    base.getPlacementGroupRef(), 
                    base.getVnfdIdRef()
                );
                this._placementGroupRef = base.getPlacementGroupRef();
                this._vnfdIdRef = base.getVnfdIdRef();
            } else {
                this._key = base.getKey();
                this._placementGroupRef = _key.getPlacementGroupRef();
                this._vnfdIdRef = _key.getVnfdIdRef();
            }
            this._cloudProvider = base.getCloudProvider();
            this._cloudType = base.getCloudType();
            this._sshAuthorizedKey = base.getSshAuthorizedKey();
            this._user = base.getUser();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.start.network.service.input.VnfdPlacementGroupMaps>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.start.network.service.input.VnfdPlacementGroupMaps>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.start.network.service.input.VnfdPlacementGroupMaps>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.start.network.service.input.VnfdPlacementGroupMaps>>singletonMap(e.getKey(), e.getValue());
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
        public VnfdPlacementGroupMapsKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.Object getPlacementGroupRef() {
            return _placementGroupRef;
        }
        
        @Override
        public List<SshAuthorizedKey> getSshAuthorizedKey() {
            return _sshAuthorizedKey;
        }
        
        @Override
        public List<User> getUser() {
            return _user;
        }
        
        @Override
        public Uuid getVnfdIdRef() {
            return _vnfdIdRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.start.network.service.input.VnfdPlacementGroupMaps>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_sshAuthorizedKey);
            result = prime * result + Objects.hashCode(_user);
            result = prime * result + Objects.hashCode(_vnfdIdRef);
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
            if (!ietf.params.xml.ns.yang.nfvo.nsr.rev170208.start.network.service.input.VnfdPlacementGroupMaps.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.nsr.rev170208.start.network.service.input.VnfdPlacementGroupMaps other = (ietf.params.xml.ns.yang.nfvo.nsr.rev170208.start.network.service.input.VnfdPlacementGroupMaps)obj;
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
            if (!Objects.equals(_sshAuthorizedKey, other.getSshAuthorizedKey())) {
                return false;
            }
            if (!Objects.equals(_user, other.getUser())) {
                return false;
            }
            if (!Objects.equals(_vnfdIdRef, other.getVnfdIdRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VnfdPlacementGroupMapsImpl otherImpl = (VnfdPlacementGroupMapsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.start.network.service.input.VnfdPlacementGroupMaps>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.start.network.service.input.VnfdPlacementGroupMaps>> e : augmentation.entrySet()) {
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
            java.lang.String name = "VnfdPlacementGroupMaps [";
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
                builder.append(", ");
            }
            if (_sshAuthorizedKey != null) {
                builder.append("_sshAuthorizedKey=");
                builder.append(_sshAuthorizedKey);
                builder.append(", ");
            }
            if (_user != null) {
                builder.append("_user=");
                builder.append(_user);
                builder.append(", ");
            }
            if (_vnfdIdRef != null) {
                builder.append("_vnfdIdRef=");
                builder.append(_vnfdIdRef);
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
