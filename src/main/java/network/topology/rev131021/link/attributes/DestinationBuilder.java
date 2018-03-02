package network.topology.rev131021.link.attributes;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import network.topology.rev131021.NodeId;
import network.topology.rev131021.TpId;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;

import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link network.topology.rev131021.link.attributes.Destination} instances.
 * 
 * @see network.topology.rev131021.link.attributes.Destination
 *
 */
public class DestinationBuilder implements Builder<network.topology.rev131021.link.attributes.Destination> {

    private NodeId _destNode;
    private TpId _destTp;

    Map<java.lang.Class<? extends Augmentation<network.topology.rev131021.link.attributes.Destination>>, Augmentation<network.topology.rev131021.link.attributes.Destination>> augmentation = Collections.emptyMap();

    public DestinationBuilder() {
    }

    public DestinationBuilder(Destination base) {
        this._destNode = base.getDestNode();
        this._destTp = base.getDestTp();
        if (base instanceof DestinationImpl) {
            DestinationImpl impl = (DestinationImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<network.topology.rev131021.link.attributes.Destination> casted =(AugmentationHolder<network.topology.rev131021.link.attributes.Destination>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public NodeId getDestNode() {
        return _destNode;
    }
    
    public TpId getDestTp() {
        return _destTp;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<network.topology.rev131021.link.attributes.Destination>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public DestinationBuilder setDestNode(final NodeId value) {
        this._destNode = value;
        return this;
    }
    
     
    public DestinationBuilder setDestTp(final TpId value) {
        this._destTp = value;
        return this;
    }
    
    public DestinationBuilder addAugmentation(java.lang.Class<? extends Augmentation<network.topology.rev131021.link.attributes.Destination>> augmentationType, Augmentation<network.topology.rev131021.link.attributes.Destination> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public DestinationBuilder removeAugmentation(java.lang.Class<? extends Augmentation<network.topology.rev131021.link.attributes.Destination>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Destination build() {
        return new DestinationImpl(this);
    }

    private static final class DestinationImpl implements Destination {

        @Override
        public java.lang.Class<network.topology.rev131021.link.attributes.Destination> getImplementedInterface() {
            return network.topology.rev131021.link.attributes.Destination.class;
        }

        private final NodeId _destNode;
        private final TpId _destTp;

        private Map<java.lang.Class<? extends Augmentation<network.topology.rev131021.link.attributes.Destination>>, Augmentation<network.topology.rev131021.link.attributes.Destination>> augmentation = Collections.emptyMap();

        private DestinationImpl(DestinationBuilder base) {
            this._destNode = base.getDestNode();
            this._destTp = base.getDestTp();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<network.topology.rev131021.link.attributes.Destination>>, Augmentation<network.topology.rev131021.link.attributes.Destination>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<network.topology.rev131021.link.attributes.Destination>>, Augmentation<network.topology.rev131021.link.attributes.Destination>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public NodeId getDestNode() {
            return _destNode;
        }
        
        @Override
        public TpId getDestTp() {
            return _destTp;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<network.topology.rev131021.link.attributes.Destination>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_destNode);
            result = prime * result + Objects.hashCode(_destTp);
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
            if (!network.topology.rev131021.link.attributes.Destination.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            network.topology.rev131021.link.attributes.Destination other = (network.topology.rev131021.link.attributes.Destination)obj;
            if (!Objects.equals(_destNode, other.getDestNode())) {
                return false;
            }
            if (!Objects.equals(_destTp, other.getDestTp())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                DestinationImpl otherImpl = (DestinationImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<network.topology.rev131021.link.attributes.Destination>>, Augmentation<network.topology.rev131021.link.attributes.Destination>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Destination [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_destNode != null) {
                builder.append("_destNode=");
                builder.append(_destNode);
                builder.append(", ");
            }
            if (_destTp != null) {
                builder.append("_destTp=");
                builder.append(_destTp);
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
