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
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Mock} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Mock
 *
 */
public class MockBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Mock> {

    private java.lang.Boolean _mockConstruct;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Mock>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Mock>> augmentation = Collections.emptyMap();

    public MockBuilder() {
    }

    public MockBuilder(Mock base) {
        this._mockConstruct = base.isMockConstruct();
        if (base instanceof MockImpl) {
            MockImpl impl = (MockImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Mock> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Mock>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public java.lang.Boolean isMockConstruct() {
        return _mockConstruct;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Mock>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public MockBuilder setMockConstruct(final java.lang.Boolean value) {
        this._mockConstruct = value;
        return this;
    }
    
    public MockBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Mock>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Mock> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public MockBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Mock>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Mock build() {
        return new MockImpl(this);
    }

    private static final class MockImpl implements Mock {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Mock> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Mock.class;
        }

        private final java.lang.Boolean _mockConstruct;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Mock>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Mock>> augmentation = Collections.emptyMap();

        private MockImpl(MockBuilder base) {
            this._mockConstruct = base.isMockConstruct();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Mock>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Mock>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Mock>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Mock>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Boolean isMockConstruct() {
            return _mockConstruct;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Mock>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_mockConstruct);
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
            if (!ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Mock.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Mock other = (ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Mock)obj;
            if (!Objects.equals(_mockConstruct, other.isMockConstruct())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                MockImpl otherImpl = (MockImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Mock>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Mock>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Mock [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_mockConstruct != null) {
                builder.append("_mockConstruct=");
                builder.append(_mockConstruct);
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
