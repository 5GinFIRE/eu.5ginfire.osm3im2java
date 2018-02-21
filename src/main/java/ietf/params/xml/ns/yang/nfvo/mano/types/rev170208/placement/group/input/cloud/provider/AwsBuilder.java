package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Aws} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Aws
 *
 */
public class AwsBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Aws> {

    private java.lang.Boolean _awsConstruct;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Aws>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Aws>> augmentation = Collections.emptyMap();

    public AwsBuilder() {
    }

    public AwsBuilder(Aws base) {
        this._awsConstruct = base.isAwsConstruct();
        if (base instanceof AwsImpl) {
            AwsImpl impl = (AwsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Aws> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Aws>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public java.lang.Boolean isAwsConstruct() {
        return _awsConstruct;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Aws>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public AwsBuilder setAwsConstruct(final java.lang.Boolean value) {
        this._awsConstruct = value;
        return this;
    }
    
    public AwsBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Aws>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Aws> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public AwsBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Aws>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Aws build() {
        return new AwsImpl(this);
    }

    private static final class AwsImpl implements Aws {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Aws> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Aws.class;
        }

        private final java.lang.Boolean _awsConstruct;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Aws>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Aws>> augmentation = Collections.emptyMap();

        private AwsImpl(AwsBuilder base) {
            this._awsConstruct = base.isAwsConstruct();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Aws>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Aws>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Aws>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Aws>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Boolean isAwsConstruct() {
            return _awsConstruct;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Aws>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_awsConstruct);
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
            if (!ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Aws.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Aws other = (ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Aws)obj;
            if (!Objects.equals(_awsConstruct, other.isAwsConstruct())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                AwsImpl otherImpl = (AwsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Aws>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Aws>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Aws [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_awsConstruct != null) {
                builder.append("_awsConstruct=");
                builder.append(_awsConstruct);
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
