package network.topology.rev131021.network.topology.topology;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import network.topology.rev131021.TopologyId;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link network.topology.rev131021.network.topology.topology.UnderlayTopology} instances.
 * 
 * @see network.topology.rev131021.network.topology.topology.UnderlayTopology
 *
 */
public class UnderlayTopologyBuilder implements Builder<network.topology.rev131021.network.topology.topology.UnderlayTopology> {

    private UnderlayTopologyKey _key;
    private TopologyId _topologyRef;

    Map<java.lang.Class<? extends Augmentation<network.topology.rev131021.network.topology.topology.UnderlayTopology>>, Augmentation<network.topology.rev131021.network.topology.topology.UnderlayTopology>> augmentation = Collections.emptyMap();

    public UnderlayTopologyBuilder() {
    }

    public UnderlayTopologyBuilder(UnderlayTopology base) {
        if (base.getKey() == null) {
            this._key = new UnderlayTopologyKey(
                base.getTopologyRef()
            );
            this._topologyRef = base.getTopologyRef();
        } else {
            this._key = base.getKey();
            this._topologyRef = _key.getTopologyRef();
        }
        if (base instanceof UnderlayTopologyImpl) {
            UnderlayTopologyImpl impl = (UnderlayTopologyImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<network.topology.rev131021.network.topology.topology.UnderlayTopology> casted =(AugmentationHolder<network.topology.rev131021.network.topology.topology.UnderlayTopology>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public UnderlayTopologyKey getKey() {
        return _key;
    }
    
    public TopologyId getTopologyRef() {
        return _topologyRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<network.topology.rev131021.network.topology.topology.UnderlayTopology>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public UnderlayTopologyBuilder setKey(final UnderlayTopologyKey value) {
        this._key = value;
        return this;
    }
    
     
    public UnderlayTopologyBuilder setTopologyRef(final TopologyId value) {
        this._topologyRef = value;
        return this;
    }
    
    public UnderlayTopologyBuilder addAugmentation(java.lang.Class<? extends Augmentation<network.topology.rev131021.network.topology.topology.UnderlayTopology>> augmentationType, Augmentation<network.topology.rev131021.network.topology.topology.UnderlayTopology> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public UnderlayTopologyBuilder removeAugmentation(java.lang.Class<? extends Augmentation<network.topology.rev131021.network.topology.topology.UnderlayTopology>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public UnderlayTopology build() {
        return new UnderlayTopologyImpl(this);
    }

    private static final class UnderlayTopologyImpl implements UnderlayTopology {

        @Override
        public java.lang.Class<network.topology.rev131021.network.topology.topology.UnderlayTopology> getImplementedInterface() {
            return network.topology.rev131021.network.topology.topology.UnderlayTopology.class;
        }

        private final UnderlayTopologyKey _key;
        private final TopologyId _topologyRef;

        private Map<java.lang.Class<? extends Augmentation<network.topology.rev131021.network.topology.topology.UnderlayTopology>>, Augmentation<network.topology.rev131021.network.topology.topology.UnderlayTopology>> augmentation = Collections.emptyMap();

        private UnderlayTopologyImpl(UnderlayTopologyBuilder base) {
            if (base.getKey() == null) {
                this._key = new UnderlayTopologyKey(
                    base.getTopologyRef()
                );
                this._topologyRef = base.getTopologyRef();
            } else {
                this._key = base.getKey();
                this._topologyRef = _key.getTopologyRef();
            }
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<network.topology.rev131021.network.topology.topology.UnderlayTopology>>, Augmentation<network.topology.rev131021.network.topology.topology.UnderlayTopology>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<network.topology.rev131021.network.topology.topology.UnderlayTopology>>, Augmentation<network.topology.rev131021.network.topology.topology.UnderlayTopology>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public UnderlayTopologyKey getKey() {
            return _key;
        }
        
        @Override
        public TopologyId getTopologyRef() {
            return _topologyRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<network.topology.rev131021.network.topology.topology.UnderlayTopology>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_topologyRef);
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
            if (!network.topology.rev131021.network.topology.topology.UnderlayTopology.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            network.topology.rev131021.network.topology.topology.UnderlayTopology other = (network.topology.rev131021.network.topology.topology.UnderlayTopology)obj;
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_topologyRef, other.getTopologyRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                UnderlayTopologyImpl otherImpl = (UnderlayTopologyImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<network.topology.rev131021.network.topology.topology.UnderlayTopology>>, Augmentation<network.topology.rev131021.network.topology.topology.UnderlayTopology>> e : augmentation.entrySet()) {
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
            java.lang.String name = "UnderlayTopology [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_topologyRef != null) {
                builder.append("_topologyRef=");
                builder.append(_topologyRef);
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
