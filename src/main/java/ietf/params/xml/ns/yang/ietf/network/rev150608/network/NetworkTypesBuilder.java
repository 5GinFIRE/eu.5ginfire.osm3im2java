package ietf.params.xml.ns.yang.ietf.network.rev150608.network;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.ietf.network.rev150608.network.NetworkTypes} instances.
 * 
 * @see ietf.params.xml.ns.yang.ietf.network.rev150608.network.NetworkTypes
 *
 */
public class NetworkTypesBuilder implements Builder<ietf.params.xml.ns.yang.ietf.network.rev150608.network.NetworkTypes> {


    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.network.rev150608.network.NetworkTypes>>, Augmentation<ietf.params.xml.ns.yang.ietf.network.rev150608.network.NetworkTypes>> augmentation = Collections.emptyMap();

    public NetworkTypesBuilder() {
    }

    public NetworkTypesBuilder(NetworkTypes base) {
        if (base instanceof NetworkTypesImpl) {
            NetworkTypesImpl impl = (NetworkTypesImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.ietf.network.rev150608.network.NetworkTypes> casted =(AugmentationHolder<ietf.params.xml.ns.yang.ietf.network.rev150608.network.NetworkTypes>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.ietf.network.rev150608.network.NetworkTypes>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    
    public NetworkTypesBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.network.rev150608.network.NetworkTypes>> augmentationType, Augmentation<ietf.params.xml.ns.yang.ietf.network.rev150608.network.NetworkTypes> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public NetworkTypesBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.network.rev150608.network.NetworkTypes>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public NetworkTypes build() {
        return new NetworkTypesImpl(this);
    }

    private static final class NetworkTypesImpl implements NetworkTypes {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.ietf.network.rev150608.network.NetworkTypes> getImplementedInterface() {
            return ietf.params.xml.ns.yang.ietf.network.rev150608.network.NetworkTypes.class;
        }


        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.network.rev150608.network.NetworkTypes>>, Augmentation<ietf.params.xml.ns.yang.ietf.network.rev150608.network.NetworkTypes>> augmentation = Collections.emptyMap();

        private NetworkTypesImpl(NetworkTypesBuilder base) {
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.network.rev150608.network.NetworkTypes>>, Augmentation<ietf.params.xml.ns.yang.ietf.network.rev150608.network.NetworkTypes>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.network.rev150608.network.NetworkTypes>>, Augmentation<ietf.params.xml.ns.yang.ietf.network.rev150608.network.NetworkTypes>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.ietf.network.rev150608.network.NetworkTypes>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            if (!ietf.params.xml.ns.yang.ietf.network.rev150608.network.NetworkTypes.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.ietf.network.rev150608.network.NetworkTypes other = (ietf.params.xml.ns.yang.ietf.network.rev150608.network.NetworkTypes)obj;
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NetworkTypesImpl otherImpl = (NetworkTypesImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.network.rev150608.network.NetworkTypes>>, Augmentation<ietf.params.xml.ns.yang.ietf.network.rev150608.network.NetworkTypes>> e : augmentation.entrySet()) {
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
            java.lang.String name = "NetworkTypes [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            builder.append("augmentation=");
            builder.append(augmentation.values());
            return builder.append(']').toString();
        }
    }

}
