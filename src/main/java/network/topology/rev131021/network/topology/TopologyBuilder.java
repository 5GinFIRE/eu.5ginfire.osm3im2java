package network.topology.rev131021.network.topology;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;

import network.topology.rev131021.TopologyId;
import network.topology.rev131021.network.topology.topology.Link;
import network.topology.rev131021.network.topology.topology.Node;
import network.topology.rev131021.network.topology.topology.TopologyTypes;
import network.topology.rev131021.network.topology.topology.UnderlayTopology;

import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link network.topology.rev131021.network.topology.Topology} instances.
 * 
 * @see network.topology.rev131021.network.topology.Topology
 *
 */
public class TopologyBuilder implements Builder<network.topology.rev131021.network.topology.Topology> {

    private TopologyKey _key;
    private List<Link> _link;
    private List<Node> _node;
    private TopologyId _topologyId;
    private TopologyTypes _topologyTypes;
    private List<UnderlayTopology> _underlayTopology;
    private java.lang.Boolean _serverProvided;

    Map<java.lang.Class<? extends Augmentation<network.topology.rev131021.network.topology.Topology>>, Augmentation<network.topology.rev131021.network.topology.Topology>> augmentation = Collections.emptyMap();

    public TopologyBuilder() {
    }

    public TopologyBuilder(Topology base) {
        if (base.getKey() == null) {
            this._key = new TopologyKey(
                base.getTopologyId()
            );
            this._topologyId = base.getTopologyId();
        } else {
            this._key = base.getKey();
            this._topologyId = _key.getTopologyId();
        }
        this._link = base.getLink();
        this._node = base.getNode();
        this._topologyTypes = base.getTopologyTypes();
        this._underlayTopology = base.getUnderlayTopology();
        this._serverProvided = base.isServerProvided();
        if (base instanceof TopologyImpl) {
            TopologyImpl impl = (TopologyImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<network.topology.rev131021.network.topology.Topology> casted =(AugmentationHolder<network.topology.rev131021.network.topology.Topology>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public TopologyKey getKey() {
        return _key;
    }
    
    public List<Link> getLink() {
        return _link;
    }
    
    public List<Node> getNode() {
        return _node;
    }
    
    public TopologyId getTopologyId() {
        return _topologyId;
    }
    
    public TopologyTypes getTopologyTypes() {
        return _topologyTypes;
    }
    
    public List<UnderlayTopology> getUnderlayTopology() {
        return _underlayTopology;
    }
    
    public java.lang.Boolean isServerProvided() {
        return _serverProvided;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<network.topology.rev131021.network.topology.Topology>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public TopologyBuilder setKey(final TopologyKey value) {
        this._key = value;
        return this;
    }
    
     
    public TopologyBuilder setLink(final List<Link> value) {
        this._link = value;
        return this;
    }
    
     
    public TopologyBuilder setNode(final List<Node> value) {
        this._node = value;
        return this;
    }
    
     
    public TopologyBuilder setTopologyId(final TopologyId value) {
        this._topologyId = value;
        return this;
    }
    
     
    public TopologyBuilder setTopologyTypes(final TopologyTypes value) {
        this._topologyTypes = value;
        return this;
    }
    
     
    public TopologyBuilder setUnderlayTopology(final List<UnderlayTopology> value) {
        this._underlayTopology = value;
        return this;
    }
    
     
    public TopologyBuilder setServerProvided(final java.lang.Boolean value) {
        this._serverProvided = value;
        return this;
    }
    
    public TopologyBuilder addAugmentation(java.lang.Class<? extends Augmentation<network.topology.rev131021.network.topology.Topology>> augmentationType, Augmentation<network.topology.rev131021.network.topology.Topology> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public TopologyBuilder removeAugmentation(java.lang.Class<? extends Augmentation<network.topology.rev131021.network.topology.Topology>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Topology build() {
        return new TopologyImpl(this);
    }

    private static final class TopologyImpl implements Topology {

        @Override
        public java.lang.Class<network.topology.rev131021.network.topology.Topology> getImplementedInterface() {
            return network.topology.rev131021.network.topology.Topology.class;
        }

        private final TopologyKey _key;
        private final List<Link> _link;
        private final List<Node> _node;
        private final TopologyId _topologyId;
        private final TopologyTypes _topologyTypes;
        private final List<UnderlayTopology> _underlayTopology;
        private final java.lang.Boolean _serverProvided;

        private Map<java.lang.Class<? extends Augmentation<network.topology.rev131021.network.topology.Topology>>, Augmentation<network.topology.rev131021.network.topology.Topology>> augmentation = Collections.emptyMap();

        private TopologyImpl(TopologyBuilder base) {
            if (base.getKey() == null) {
                this._key = new TopologyKey(
                    base.getTopologyId()
                );
                this._topologyId = base.getTopologyId();
            } else {
                this._key = base.getKey();
                this._topologyId = _key.getTopologyId();
            }
            this._link = base.getLink();
            this._node = base.getNode();
            this._topologyTypes = base.getTopologyTypes();
            this._underlayTopology = base.getUnderlayTopology();
            this._serverProvided = base.isServerProvided();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<network.topology.rev131021.network.topology.Topology>>, Augmentation<network.topology.rev131021.network.topology.Topology>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<network.topology.rev131021.network.topology.Topology>>, Augmentation<network.topology.rev131021.network.topology.Topology>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public TopologyKey getKey() {
            return _key;
        }
        
        @Override
        public List<Link> getLink() {
            return _link;
        }
        
        @Override
        public List<Node> getNode() {
            return _node;
        }
        
        @Override
        public TopologyId getTopologyId() {
            return _topologyId;
        }
        
        @Override
        public TopologyTypes getTopologyTypes() {
            return _topologyTypes;
        }
        
        @Override
        public List<UnderlayTopology> getUnderlayTopology() {
            return _underlayTopology;
        }
        
        @Override
        public java.lang.Boolean isServerProvided() {
            return _serverProvided;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<network.topology.rev131021.network.topology.Topology>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_link);
            result = prime * result + Objects.hashCode(_node);
            result = prime * result + Objects.hashCode(_topologyId);
            result = prime * result + Objects.hashCode(_topologyTypes);
            result = prime * result + Objects.hashCode(_underlayTopology);
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
            if (!network.topology.rev131021.network.topology.Topology.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            network.topology.rev131021.network.topology.Topology other = (network.topology.rev131021.network.topology.Topology)obj;
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_link, other.getLink())) {
                return false;
            }
            if (!Objects.equals(_node, other.getNode())) {
                return false;
            }
            if (!Objects.equals(_topologyId, other.getTopologyId())) {
                return false;
            }
            if (!Objects.equals(_topologyTypes, other.getTopologyTypes())) {
                return false;
            }
            if (!Objects.equals(_underlayTopology, other.getUnderlayTopology())) {
                return false;
            }
            if (!Objects.equals(_serverProvided, other.isServerProvided())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                TopologyImpl otherImpl = (TopologyImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<network.topology.rev131021.network.topology.Topology>>, Augmentation<network.topology.rev131021.network.topology.Topology>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Topology [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_link != null) {
                builder.append("_link=");
                builder.append(_link);
                builder.append(", ");
            }
            if (_node != null) {
                builder.append("_node=");
                builder.append(_node);
                builder.append(", ");
            }
            if (_topologyId != null) {
                builder.append("_topologyId=");
                builder.append(_topologyId);
                builder.append(", ");
            }
            if (_topologyTypes != null) {
                builder.append("_topologyTypes=");
                builder.append(_topologyTypes);
                builder.append(", ");
            }
            if (_underlayTopology != null) {
                builder.append("_underlayTopology=");
                builder.append(_underlayTopology);
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
