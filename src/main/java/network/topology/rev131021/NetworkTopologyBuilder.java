package network.topology.rev131021;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import network.topology.rev131021.network.topology.Topology;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link network.topology.rev131021.NetworkTopology} instances.
 * 
 * @see network.topology.rev131021.NetworkTopology
 *
 */
public class NetworkTopologyBuilder implements Builder<network.topology.rev131021.NetworkTopology> {

    private List<Topology> _topology;

    Map<java.lang.Class<? extends Augmentation<network.topology.rev131021.NetworkTopology>>, Augmentation<network.topology.rev131021.NetworkTopology>> augmentation = Collections.emptyMap();

    public NetworkTopologyBuilder() {
    }

    public NetworkTopologyBuilder(NetworkTopology base) {
        this._topology = base.getTopology();
        if (base instanceof NetworkTopologyImpl) {
            NetworkTopologyImpl impl = (NetworkTopologyImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<network.topology.rev131021.NetworkTopology> casted =(AugmentationHolder<network.topology.rev131021.NetworkTopology>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public List<Topology> getTopology() {
        return _topology;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<network.topology.rev131021.NetworkTopology>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public NetworkTopologyBuilder setTopology(final List<Topology> value) {
        this._topology = value;
        return this;
    }
    
    public NetworkTopologyBuilder addAugmentation(java.lang.Class<? extends Augmentation<network.topology.rev131021.NetworkTopology>> augmentationType, Augmentation<network.topology.rev131021.NetworkTopology> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public NetworkTopologyBuilder removeAugmentation(java.lang.Class<? extends Augmentation<network.topology.rev131021.NetworkTopology>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public NetworkTopology build() {
        return new NetworkTopologyImpl(this);
    }

    private static final class NetworkTopologyImpl implements NetworkTopology {

        @Override
        public java.lang.Class<network.topology.rev131021.NetworkTopology> getImplementedInterface() {
            return network.topology.rev131021.NetworkTopology.class;
        }

        private final List<Topology> _topology;

        private Map<java.lang.Class<? extends Augmentation<network.topology.rev131021.NetworkTopology>>, Augmentation<network.topology.rev131021.NetworkTopology>> augmentation = Collections.emptyMap();

        private NetworkTopologyImpl(NetworkTopologyBuilder base) {
            this._topology = base.getTopology();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<network.topology.rev131021.NetworkTopology>>, Augmentation<network.topology.rev131021.NetworkTopology>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<network.topology.rev131021.NetworkTopology>>, Augmentation<network.topology.rev131021.NetworkTopology>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<Topology> getTopology() {
            return _topology;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<network.topology.rev131021.NetworkTopology>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_topology);
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
            if (!network.topology.rev131021.NetworkTopology.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            network.topology.rev131021.NetworkTopology other = (network.topology.rev131021.NetworkTopology)obj;
            if (!Objects.equals(_topology, other.getTopology())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NetworkTopologyImpl otherImpl = (NetworkTopologyImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<network.topology.rev131021.NetworkTopology>>, Augmentation<network.topology.rev131021.NetworkTopology>> e : augmentation.entrySet()) {
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
            java.lang.String name = "NetworkTopology [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_topology != null) {
                builder.append("_topology=");
                builder.append(_topology);
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
