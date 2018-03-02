package http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.cloud.init.input;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.cloud.init.input.Inline} instances.
 * 
 * @see http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.cloud.init.input.Inline
 *
 */
public class InlineBuilder implements Builder<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.cloud.init.input.Inline> {

    private java.lang.String _cloudInit;

    Map<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.cloud.init.input.Inline>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.cloud.init.input.Inline>> augmentation = Collections.emptyMap();

    public InlineBuilder() {
    }

    public InlineBuilder(Inline base) {
        this._cloudInit = base.getCloudInit();
        if (base instanceof InlineImpl) {
            InlineImpl impl = (InlineImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.cloud.init.input.Inline> casted =(AugmentationHolder<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.cloud.init.input.Inline>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public java.lang.String getCloudInit() {
        return _cloudInit;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.cloud.init.input.Inline>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public InlineBuilder setCloudInit(final java.lang.String value) {
        this._cloudInit = value;
        return this;
    }
    
    public InlineBuilder addAugmentation(java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.cloud.init.input.Inline>> augmentationType, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.cloud.init.input.Inline> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public InlineBuilder removeAugmentation(java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.cloud.init.input.Inline>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Inline build() {
        return new InlineImpl(this);
    }

    private static final class InlineImpl implements Inline {

        @Override
        public java.lang.Class<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.cloud.init.input.Inline> getImplementedInterface() {
            return http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.cloud.init.input.Inline.class;
        }

        private final java.lang.String _cloudInit;

        private Map<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.cloud.init.input.Inline>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.cloud.init.input.Inline>> augmentation = Collections.emptyMap();

        private InlineImpl(InlineBuilder base) {
            this._cloudInit = base.getCloudInit();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.cloud.init.input.Inline>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.cloud.init.input.Inline>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.cloud.init.input.Inline>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.cloud.init.input.Inline>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getCloudInit() {
            return _cloudInit;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.cloud.init.input.Inline>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_cloudInit);
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
            if (!http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.cloud.init.input.Inline.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.cloud.init.input.Inline other = (http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.cloud.init.input.Inline)obj;
            if (!Objects.equals(_cloudInit, other.getCloudInit())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                InlineImpl otherImpl = (InlineImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.cloud.init.input.Inline>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.cloud.init.input.Inline>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Inline [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_cloudInit != null) {
                builder.append("_cloudInit=");
                builder.append(_cloudInit);
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
