package http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu._interface.connection.point.type;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu._interface.connection.point.type.Internal} instances.
 * 
 * @see http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu._interface.connection.point.type.Internal
 *
 */
public class InternalBuilder implements Builder<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu._interface.connection.point.type.Internal> {

    private java.lang.String _internalConnectionPointRef;

    Map<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu._interface.connection.point.type.Internal>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu._interface.connection.point.type.Internal>> augmentation = Collections.emptyMap();

    public InternalBuilder() {
    }

    public InternalBuilder(Internal base) {
        this._internalConnectionPointRef = base.getInternalConnectionPointRef();
        if (base instanceof InternalImpl) {
            InternalImpl impl = (InternalImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu._interface.connection.point.type.Internal> casted =(AugmentationHolder<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu._interface.connection.point.type.Internal>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public java.lang.String getInternalConnectionPointRef() {
        return _internalConnectionPointRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu._interface.connection.point.type.Internal>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public InternalBuilder setInternalConnectionPointRef(final java.lang.String value) {
        this._internalConnectionPointRef = value;
        return this;
    }
    
    public InternalBuilder addAugmentation(java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu._interface.connection.point.type.Internal>> augmentationType, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu._interface.connection.point.type.Internal> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public InternalBuilder removeAugmentation(java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu._interface.connection.point.type.Internal>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Internal build() {
        return new InternalImpl(this);
    }

    public static final class InternalImpl implements Internal {

        @Override
        public java.lang.Class<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu._interface.connection.point.type.Internal> getImplementedInterface() {
            return http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu._interface.connection.point.type.Internal.class;
        }

        private final java.lang.String _internalConnectionPointRef;

        private Map<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu._interface.connection.point.type.Internal>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu._interface.connection.point.type.Internal>> augmentation = Collections.emptyMap();

        private InternalImpl(InternalBuilder base) {
            this._internalConnectionPointRef = base.getInternalConnectionPointRef();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu._interface.connection.point.type.Internal>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu._interface.connection.point.type.Internal>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu._interface.connection.point.type.Internal>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu._interface.connection.point.type.Internal>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }
        
        public InternalImpl(){
        	this( new InternalBuilder() );
        }

        @Override
        public java.lang.String getInternalConnectionPointRef() {
            return _internalConnectionPointRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu._interface.connection.point.type.Internal>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_internalConnectionPointRef);
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
            if (!http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu._interface.connection.point.type.Internal.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu._interface.connection.point.type.Internal other = (http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu._interface.connection.point.type.Internal)obj;
            if (!Objects.equals(_internalConnectionPointRef, other.getInternalConnectionPointRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                InternalImpl otherImpl = (InternalImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu._interface.connection.point.type.Internal>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu._interface.connection.point.type.Internal>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Internal [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_internalConnectionPointRef != null) {
                builder.append("_internalConnectionPointRef=");
                builder.append(_internalConnectionPointRef);
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
