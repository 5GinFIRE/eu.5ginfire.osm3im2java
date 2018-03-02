package ietf.params.xml.ns.yang.ietf.network.rev150608;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.ietf.network.rev150608.network.NetworkTypes;
import ietf.params.xml.ns.yang.ietf.network.rev150608.network.Node;
import ietf.params.xml.ns.yang.ietf.network.rev150608.network.SupportingNetwork;

import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.ietf.network.rev150608.Network} instances.
 * 
 * @see ietf.params.xml.ns.yang.ietf.network.rev150608.Network
 *
 */
public class NetworkBuilder implements Builder<ietf.params.xml.ns.yang.ietf.network.rev150608.Network> {

    private NetworkKey _key;
    private NetworkId _networkId;
    private NetworkTypes _networkTypes;
    private List<Node> _node;
    private List<SupportingNetwork> _supportingNetwork;
    private java.lang.Boolean _serverProvided;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.network.rev150608.Network>>, Augmentation<ietf.params.xml.ns.yang.ietf.network.rev150608.Network>> augmentation = Collections.emptyMap();

    public NetworkBuilder() {
    }

    public NetworkBuilder(Network base) {
        if (base.getKey() == null) {
            this._key = new NetworkKey(
                base.getNetworkId()
            );
            this._networkId = base.getNetworkId();
        } else {
            this._key = base.getKey();
            this._networkId = _key.getNetworkId();
        }
        this._networkTypes = base.getNetworkTypes();
        this._node = base.getNode();
        this._supportingNetwork = base.getSupportingNetwork();
        this._serverProvided = base.isServerProvided();
        if (base instanceof NetworkImpl) {
            NetworkImpl impl = (NetworkImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.ietf.network.rev150608.Network> casted =(AugmentationHolder<ietf.params.xml.ns.yang.ietf.network.rev150608.Network>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public NetworkKey getKey() {
        return _key;
    }
    
    public NetworkId getNetworkId() {
        return _networkId;
    }
    
    public NetworkTypes getNetworkTypes() {
        return _networkTypes;
    }
    
    public List<Node> getNode() {
        return _node;
    }
    
    public List<SupportingNetwork> getSupportingNetwork() {
        return _supportingNetwork;
    }
    
    public java.lang.Boolean isServerProvided() {
        return _serverProvided;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.ietf.network.rev150608.Network>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public NetworkBuilder setKey(final NetworkKey value) {
        this._key = value;
        return this;
    }
    
     
    public NetworkBuilder setNetworkId(final NetworkId value) {
        this._networkId = value;
        return this;
    }
    
     
    public NetworkBuilder setNetworkTypes(final NetworkTypes value) {
        this._networkTypes = value;
        return this;
    }
    
     
    public NetworkBuilder setNode(final List<Node> value) {
        this._node = value;
        return this;
    }
    
     
    public NetworkBuilder setSupportingNetwork(final List<SupportingNetwork> value) {
        this._supportingNetwork = value;
        return this;
    }
    
     
    public NetworkBuilder setServerProvided(final java.lang.Boolean value) {
        this._serverProvided = value;
        return this;
    }
    
    public NetworkBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.network.rev150608.Network>> augmentationType, Augmentation<ietf.params.xml.ns.yang.ietf.network.rev150608.Network> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public NetworkBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.network.rev150608.Network>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Network build() {
        return new NetworkImpl(this);
    }

    private static final class NetworkImpl implements Network {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.ietf.network.rev150608.Network> getImplementedInterface() {
            return ietf.params.xml.ns.yang.ietf.network.rev150608.Network.class;
        }

        private final NetworkKey _key;
        private final NetworkId _networkId;
        private final NetworkTypes _networkTypes;
        private final List<Node> _node;
        private final List<SupportingNetwork> _supportingNetwork;
        private final java.lang.Boolean _serverProvided;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.network.rev150608.Network>>, Augmentation<ietf.params.xml.ns.yang.ietf.network.rev150608.Network>> augmentation = Collections.emptyMap();

        private NetworkImpl(NetworkBuilder base) {
            if (base.getKey() == null) {
                this._key = new NetworkKey(
                    base.getNetworkId()
                );
                this._networkId = base.getNetworkId();
            } else {
                this._key = base.getKey();
                this._networkId = _key.getNetworkId();
            }
            this._networkTypes = base.getNetworkTypes();
            this._node = base.getNode();
            this._supportingNetwork = base.getSupportingNetwork();
            this._serverProvided = base.isServerProvided();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.network.rev150608.Network>>, Augmentation<ietf.params.xml.ns.yang.ietf.network.rev150608.Network>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.network.rev150608.Network>>, Augmentation<ietf.params.xml.ns.yang.ietf.network.rev150608.Network>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public NetworkKey getKey() {
            return _key;
        }
        
        @Override
        public NetworkId getNetworkId() {
            return _networkId;
        }
        
        @Override
        public NetworkTypes getNetworkTypes() {
            return _networkTypes;
        }
        
        @Override
        public List<Node> getNode() {
            return _node;
        }
        
        @Override
        public List<SupportingNetwork> getSupportingNetwork() {
            return _supportingNetwork;
        }
        
        @Override
        public java.lang.Boolean isServerProvided() {
            return _serverProvided;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.ietf.network.rev150608.Network>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_networkId);
            result = prime * result + Objects.hashCode(_networkTypes);
            result = prime * result + Objects.hashCode(_node);
            result = prime * result + Objects.hashCode(_supportingNetwork);
            result = prime * result + Objects.hashCode(_serverProvided);
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
            if (!ietf.params.xml.ns.yang.ietf.network.rev150608.Network.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.ietf.network.rev150608.Network other = (ietf.params.xml.ns.yang.ietf.network.rev150608.Network)obj;
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_networkId, other.getNetworkId())) {
                return false;
            }
            if (!Objects.equals(_networkTypes, other.getNetworkTypes())) {
                return false;
            }
            if (!Objects.equals(_node, other.getNode())) {
                return false;
            }
            if (!Objects.equals(_supportingNetwork, other.getSupportingNetwork())) {
                return false;
            }
            if (!Objects.equals(_serverProvided, other.isServerProvided())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NetworkImpl otherImpl = (NetworkImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.network.rev150608.Network>>, Augmentation<ietf.params.xml.ns.yang.ietf.network.rev150608.Network>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Network [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_networkId != null) {
                builder.append("_networkId=");
                builder.append(_networkId);
                builder.append(", ");
            }
            if (_networkTypes != null) {
                builder.append("_networkTypes=");
                builder.append(_networkTypes);
                builder.append(", ");
            }
            if (_node != null) {
                builder.append("_node=");
                builder.append(_node);
                builder.append(", ");
            }
            if (_supportingNetwork != null) {
                builder.append("_supportingNetwork=");
                builder.append(_supportingNetwork);
                builder.append(", ");
            }
            if (_serverProvided != null) {
                builder.append("_serverProvided=");
                builder.append(_serverProvided);
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
