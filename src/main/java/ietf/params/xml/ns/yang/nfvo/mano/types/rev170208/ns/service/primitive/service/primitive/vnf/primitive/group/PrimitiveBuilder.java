package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ns.service.primitive.service.primitive.vnf.primitive.group;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ns.service.primitive.service.primitive.vnf.primitive.group.Primitive} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ns.service.primitive.service.primitive.vnf.primitive.group.Primitive
 *
 */
public class PrimitiveBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ns.service.primitive.service.primitive.vnf.primitive.group.Primitive> {

    private java.lang.Long _index;
    private PrimitiveKey _key;
    private java.lang.String _name;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ns.service.primitive.service.primitive.vnf.primitive.group.Primitive>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ns.service.primitive.service.primitive.vnf.primitive.group.Primitive>> augmentation = Collections.emptyMap();

    public PrimitiveBuilder() {
    }

    public PrimitiveBuilder(Primitive base) {
        if (base.getKey() == null) {
            this._key = new PrimitiveKey(
                base.getIndex()
            );
            this._index = base.getIndex();
        } else {
            this._key = base.getKey();
            this._index = _key.getIndex();
        }
        this._name = base.getName();
        if (base instanceof PrimitiveImpl) {
            PrimitiveImpl impl = (PrimitiveImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ns.service.primitive.service.primitive.vnf.primitive.group.Primitive> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ns.service.primitive.service.primitive.vnf.primitive.group.Primitive>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public java.lang.Long getIndex() {
        return _index;
    }
    
    public PrimitiveKey getKey() {
        return _key;
    }
    
    public java.lang.String getName() {
        return _name;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ns.service.primitive.service.primitive.vnf.primitive.group.Primitive>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static void checkIndexRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..4294967295]].", value));
     }
    
    public PrimitiveBuilder setIndex(final java.lang.Long value) {
    if (value != null) {
        checkIndexRange(value);
    }
        this._index = value;
        return this;
    }
    
     
    public PrimitiveBuilder setKey(final PrimitiveKey value) {
        this._key = value;
        return this;
    }
    
     
    public PrimitiveBuilder setName(final java.lang.String value) {
        this._name = value;
        return this;
    }
    
    public PrimitiveBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ns.service.primitive.service.primitive.vnf.primitive.group.Primitive>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ns.service.primitive.service.primitive.vnf.primitive.group.Primitive> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public PrimitiveBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ns.service.primitive.service.primitive.vnf.primitive.group.Primitive>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Primitive build() {
        return new PrimitiveImpl(this);
    }

    private static final class PrimitiveImpl implements Primitive {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ns.service.primitive.service.primitive.vnf.primitive.group.Primitive> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ns.service.primitive.service.primitive.vnf.primitive.group.Primitive.class;
        }

        private final java.lang.Long _index;
        private final PrimitiveKey _key;
        private final java.lang.String _name;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ns.service.primitive.service.primitive.vnf.primitive.group.Primitive>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ns.service.primitive.service.primitive.vnf.primitive.group.Primitive>> augmentation = Collections.emptyMap();

        private PrimitiveImpl(PrimitiveBuilder base) {
            if (base.getKey() == null) {
                this._key = new PrimitiveKey(
                    base.getIndex()
                );
                this._index = base.getIndex();
            } else {
                this._key = base.getKey();
                this._index = _key.getIndex();
            }
            this._name = base.getName();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ns.service.primitive.service.primitive.vnf.primitive.group.Primitive>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ns.service.primitive.service.primitive.vnf.primitive.group.Primitive>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ns.service.primitive.service.primitive.vnf.primitive.group.Primitive>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ns.service.primitive.service.primitive.vnf.primitive.group.Primitive>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Long getIndex() {
            return _index;
        }
        
        @Override
        public PrimitiveKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.String getName() {
            return _name;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ns.service.primitive.service.primitive.vnf.primitive.group.Primitive>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_index);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_name);
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
            if (!ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ns.service.primitive.service.primitive.vnf.primitive.group.Primitive.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ns.service.primitive.service.primitive.vnf.primitive.group.Primitive other = (ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ns.service.primitive.service.primitive.vnf.primitive.group.Primitive)obj;
            if (!Objects.equals(_index, other.getIndex())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                PrimitiveImpl otherImpl = (PrimitiveImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ns.service.primitive.service.primitive.vnf.primitive.group.Primitive>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ns.service.primitive.service.primitive.vnf.primitive.group.Primitive>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Primitive [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_index != null) {
                builder.append("_index=");
                builder.append(_index);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_name != null) {
                builder.append("_name=");
                builder.append(_name);
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
