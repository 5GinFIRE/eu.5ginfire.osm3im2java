package ietf.params.xml.ns.yang.ietf.network.rev150608.network;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.ietf.network.rev150608.NetworkId;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.ietf.network.rev150608.network.SupportingNetwork} instances.
 * 
 * @see ietf.params.xml.ns.yang.ietf.network.rev150608.network.SupportingNetwork
 *
 */
public class SupportingNetworkBuilder implements Builder<ietf.params.xml.ns.yang.ietf.network.rev150608.network.SupportingNetwork> {

    private SupportingNetworkKey _key;
    private NetworkId _networkRef;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.network.rev150608.network.SupportingNetwork>>, Augmentation<ietf.params.xml.ns.yang.ietf.network.rev150608.network.SupportingNetwork>> augmentation = Collections.emptyMap();

    public SupportingNetworkBuilder() {
    }

    public SupportingNetworkBuilder(SupportingNetwork base) {
        if (base.getKey() == null) {
            this._key = new SupportingNetworkKey(
                base.getNetworkRef()
            );
            this._networkRef = base.getNetworkRef();
        } else {
            this._key = base.getKey();
            this._networkRef = _key.getNetworkRef();
        }
        if (base instanceof SupportingNetworkImpl) {
            SupportingNetworkImpl impl = (SupportingNetworkImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.ietf.network.rev150608.network.SupportingNetwork> casted =(AugmentationHolder<ietf.params.xml.ns.yang.ietf.network.rev150608.network.SupportingNetwork>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public SupportingNetworkKey getKey() {
        return _key;
    }
    
    public NetworkId getNetworkRef() {
        return _networkRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.ietf.network.rev150608.network.SupportingNetwork>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public SupportingNetworkBuilder setKey(final SupportingNetworkKey value) {
        this._key = value;
        return this;
    }
    
     
    public SupportingNetworkBuilder setNetworkRef(final NetworkId value) {
        this._networkRef = value;
        return this;
    }
    
    public SupportingNetworkBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.network.rev150608.network.SupportingNetwork>> augmentationType, Augmentation<ietf.params.xml.ns.yang.ietf.network.rev150608.network.SupportingNetwork> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public SupportingNetworkBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.network.rev150608.network.SupportingNetwork>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public SupportingNetwork build() {
        return new SupportingNetworkImpl(this);
    }

    private static final class SupportingNetworkImpl implements SupportingNetwork {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.ietf.network.rev150608.network.SupportingNetwork> getImplementedInterface() {
            return ietf.params.xml.ns.yang.ietf.network.rev150608.network.SupportingNetwork.class;
        }

        private final SupportingNetworkKey _key;
        private final NetworkId _networkRef;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.network.rev150608.network.SupportingNetwork>>, Augmentation<ietf.params.xml.ns.yang.ietf.network.rev150608.network.SupportingNetwork>> augmentation = Collections.emptyMap();

        private SupportingNetworkImpl(SupportingNetworkBuilder base) {
            if (base.getKey() == null) {
                this._key = new SupportingNetworkKey(
                    base.getNetworkRef()
                );
                this._networkRef = base.getNetworkRef();
            } else {
                this._key = base.getKey();
                this._networkRef = _key.getNetworkRef();
            }
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.network.rev150608.network.SupportingNetwork>>, Augmentation<ietf.params.xml.ns.yang.ietf.network.rev150608.network.SupportingNetwork>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.network.rev150608.network.SupportingNetwork>>, Augmentation<ietf.params.xml.ns.yang.ietf.network.rev150608.network.SupportingNetwork>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public SupportingNetworkKey getKey() {
            return _key;
        }
        
        @Override
        public NetworkId getNetworkRef() {
            return _networkRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.ietf.network.rev150608.network.SupportingNetwork>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_networkRef);
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
            if (!ietf.params.xml.ns.yang.ietf.network.rev150608.network.SupportingNetwork.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.ietf.network.rev150608.network.SupportingNetwork other = (ietf.params.xml.ns.yang.ietf.network.rev150608.network.SupportingNetwork)obj;
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_networkRef, other.getNetworkRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                SupportingNetworkImpl otherImpl = (SupportingNetworkImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.network.rev150608.network.SupportingNetwork>>, Augmentation<ietf.params.xml.ns.yang.ietf.network.rev150608.network.SupportingNetwork>> e : augmentation.entrySet()) {
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
            java.lang.String name = "SupportingNetwork [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_networkRef != null) {
                builder.append("_networkRef=");
                builder.append(_networkRef);
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
