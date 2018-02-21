package network.topology.rev131021.network.topology.topology;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link network.topology.rev131021.network.topology.topology.TopologyTypes} instances.
 * 
 * @see network.topology.rev131021.network.topology.topology.TopologyTypes
 *
 */
public class TopologyTypesBuilder implements Builder<network.topology.rev131021.network.topology.topology.TopologyTypes> {


    Map<java.lang.Class<? extends Augmentation<network.topology.rev131021.network.topology.topology.TopologyTypes>>, Augmentation<network.topology.rev131021.network.topology.topology.TopologyTypes>> augmentation = Collections.emptyMap();

    public TopologyTypesBuilder() {
    }

    public TopologyTypesBuilder(TopologyTypes base) {
        if (base instanceof TopologyTypesImpl) {
            TopologyTypesImpl impl = (TopologyTypesImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<network.topology.rev131021.network.topology.topology.TopologyTypes> casted =(AugmentationHolder<network.topology.rev131021.network.topology.topology.TopologyTypes>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<network.topology.rev131021.network.topology.topology.TopologyTypes>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    
    public TopologyTypesBuilder addAugmentation(java.lang.Class<? extends Augmentation<network.topology.rev131021.network.topology.topology.TopologyTypes>> augmentationType, Augmentation<network.topology.rev131021.network.topology.topology.TopologyTypes> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public TopologyTypesBuilder removeAugmentation(java.lang.Class<? extends Augmentation<network.topology.rev131021.network.topology.topology.TopologyTypes>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public TopologyTypes build() {
        return new TopologyTypesImpl(this);
    }

    private static final class TopologyTypesImpl implements TopologyTypes {

        @Override
        public java.lang.Class<network.topology.rev131021.network.topology.topology.TopologyTypes> getImplementedInterface() {
            return network.topology.rev131021.network.topology.topology.TopologyTypes.class;
        }


        private Map<java.lang.Class<? extends Augmentation<network.topology.rev131021.network.topology.topology.TopologyTypes>>, Augmentation<network.topology.rev131021.network.topology.topology.TopologyTypes>> augmentation = Collections.emptyMap();

        private TopologyTypesImpl(TopologyTypesBuilder base) {
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<network.topology.rev131021.network.topology.topology.TopologyTypes>>, Augmentation<network.topology.rev131021.network.topology.topology.TopologyTypes>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<network.topology.rev131021.network.topology.topology.TopologyTypes>>, Augmentation<network.topology.rev131021.network.topology.topology.TopologyTypes>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<network.topology.rev131021.network.topology.topology.TopologyTypes>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            if (!network.topology.rev131021.network.topology.topology.TopologyTypes.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            network.topology.rev131021.network.topology.topology.TopologyTypes other = (network.topology.rev131021.network.topology.topology.TopologyTypes)obj;
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                TopologyTypesImpl otherImpl = (TopologyTypesImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<network.topology.rev131021.network.topology.topology.TopologyTypes>>, Augmentation<network.topology.rev131021.network.topology.topology.TopologyTypes>> e : augmentation.entrySet()) {
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
            java.lang.String name = "TopologyTypes [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            builder.append("augmentation=");
            builder.append(augmentation.values());
            return builder.append(']').toString();
        }
    }

}
