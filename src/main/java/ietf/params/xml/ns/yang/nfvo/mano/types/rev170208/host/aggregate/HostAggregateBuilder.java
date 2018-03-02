package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.aggregate;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.aggregate.HostAggregate} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.aggregate.HostAggregate
 *
 */
public class HostAggregateBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.aggregate.HostAggregate> {

    private HostAggregateKey _key;
    private java.lang.String _metadataKey;
    private java.lang.String _metadataValue;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.aggregate.HostAggregate>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.aggregate.HostAggregate>> augmentation = Collections.emptyMap();

    public HostAggregateBuilder() {
    }

    public HostAggregateBuilder(HostAggregate base) {
        if (base.getKey() == null) {
            this._key = new HostAggregateKey(
                base.getMetadataKey()
            );
            this._metadataKey = base.getMetadataKey();
        } else {
            this._key = base.getKey();
            this._metadataKey = _key.getMetadataKey();
        }
        this._metadataValue = base.getMetadataValue();
        if (base instanceof HostAggregateImpl) {
            HostAggregateImpl impl = (HostAggregateImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.aggregate.HostAggregate> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.aggregate.HostAggregate>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public HostAggregateKey getKey() {
        return _key;
    }
    
    public java.lang.String getMetadataKey() {
        return _metadataKey;
    }
    
    public java.lang.String getMetadataValue() {
        return _metadataValue;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.aggregate.HostAggregate>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public HostAggregateBuilder setKey(final HostAggregateKey value) {
        this._key = value;
        return this;
    }
    
     
    public HostAggregateBuilder setMetadataKey(final java.lang.String value) {
        this._metadataKey = value;
        return this;
    }
    
     
    public HostAggregateBuilder setMetadataValue(final java.lang.String value) {
        this._metadataValue = value;
        return this;
    }
    
    public HostAggregateBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.aggregate.HostAggregate>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.aggregate.HostAggregate> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public HostAggregateBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.aggregate.HostAggregate>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public HostAggregate build() {
        return new HostAggregateImpl(this);
    }

    private static final class HostAggregateImpl implements HostAggregate {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.aggregate.HostAggregate> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.aggregate.HostAggregate.class;
        }

        private final HostAggregateKey _key;
        private final java.lang.String _metadataKey;
        private final java.lang.String _metadataValue;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.aggregate.HostAggregate>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.aggregate.HostAggregate>> augmentation = Collections.emptyMap();

        private HostAggregateImpl(HostAggregateBuilder base) {
            if (base.getKey() == null) {
                this._key = new HostAggregateKey(
                    base.getMetadataKey()
                );
                this._metadataKey = base.getMetadataKey();
            } else {
                this._key = base.getKey();
                this._metadataKey = _key.getMetadataKey();
            }
            this._metadataValue = base.getMetadataValue();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.aggregate.HostAggregate>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.aggregate.HostAggregate>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.aggregate.HostAggregate>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.aggregate.HostAggregate>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public HostAggregateKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.String getMetadataKey() {
            return _metadataKey;
        }
        
        @Override
        public java.lang.String getMetadataValue() {
            return _metadataValue;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.aggregate.HostAggregate>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_metadataKey);
            result = prime * result + Objects.hashCode(_metadataValue);
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
            if (!ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.aggregate.HostAggregate.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.aggregate.HostAggregate other = (ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.aggregate.HostAggregate)obj;
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_metadataKey, other.getMetadataKey())) {
                return false;
            }
            if (!Objects.equals(_metadataValue, other.getMetadataValue())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                HostAggregateImpl otherImpl = (HostAggregateImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.aggregate.HostAggregate>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.aggregate.HostAggregate>> e : augmentation.entrySet()) {
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
            java.lang.String name = "HostAggregate [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_metadataKey != null) {
                builder.append("_metadataKey=");
                builder.append(_metadataKey);
                builder.append(", ");
            }
            if (_metadataValue != null) {
                builder.append("_metadataValue=");
                builder.append(_metadataValue);
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
