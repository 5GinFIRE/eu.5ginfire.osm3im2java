package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.relationships.vca.relationships;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.relationships.vca.relationships.Relation} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.relationships.vca.relationships.Relation
 *
 */
public class RelationBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.relationships.vca.relationships.Relation> {

    private RelationKey _key;
    private java.lang.String _provides;
    private java.lang.String _requires;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.relationships.vca.relationships.Relation>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.relationships.vca.relationships.Relation>> augmentation = Collections.emptyMap();

    public RelationBuilder() {
    }

    public RelationBuilder(Relation base) {
        if (base.getKey() == null) {
            this._key = new RelationKey(
                base.getProvides(), 
                base.getRequires()
            );
            this._provides = base.getProvides();
            this._requires = base.getRequires();
        } else {
            this._key = base.getKey();
            this._provides = _key.getProvides();
            this._requires = _key.getRequires();
        }
        if (base instanceof RelationImpl) {
            RelationImpl impl = (RelationImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.relationships.vca.relationships.Relation> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.relationships.vca.relationships.Relation>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public RelationKey getKey() {
        return _key;
    }
    
    public java.lang.String getProvides() {
        return _provides;
    }
    
    public java.lang.String getRequires() {
        return _requires;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.relationships.vca.relationships.Relation>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public RelationBuilder setKey(final RelationKey value) {
        this._key = value;
        return this;
    }
    
     
    public RelationBuilder setProvides(final java.lang.String value) {
        this._provides = value;
        return this;
    }
    
     
    public RelationBuilder setRequires(final java.lang.String value) {
        this._requires = value;
        return this;
    }
    
    public RelationBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.relationships.vca.relationships.Relation>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.relationships.vca.relationships.Relation> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public RelationBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.relationships.vca.relationships.Relation>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Relation build() {
        return new RelationImpl(this);
    }

    private static final class RelationImpl implements Relation {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.relationships.vca.relationships.Relation> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.relationships.vca.relationships.Relation.class;
        }

        private final RelationKey _key;
        private final java.lang.String _provides;
        private final java.lang.String _requires;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.relationships.vca.relationships.Relation>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.relationships.vca.relationships.Relation>> augmentation = Collections.emptyMap();

        private RelationImpl(RelationBuilder base) {
            if (base.getKey() == null) {
                this._key = new RelationKey(
                    base.getProvides(), 
                    base.getRequires()
                );
                this._provides = base.getProvides();
                this._requires = base.getRequires();
            } else {
                this._key = base.getKey();
                this._provides = _key.getProvides();
                this._requires = _key.getRequires();
            }
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.relationships.vca.relationships.Relation>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.relationships.vca.relationships.Relation>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.relationships.vca.relationships.Relation>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.relationships.vca.relationships.Relation>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public RelationKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.String getProvides() {
            return _provides;
        }
        
        @Override
        public java.lang.String getRequires() {
            return _requires;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.relationships.vca.relationships.Relation>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_provides);
            result = prime * result + Objects.hashCode(_requires);
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
            if (!ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.relationships.vca.relationships.Relation.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.relationships.vca.relationships.Relation other = (ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.relationships.vca.relationships.Relation)obj;
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_provides, other.getProvides())) {
                return false;
            }
            if (!Objects.equals(_requires, other.getRequires())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                RelationImpl otherImpl = (RelationImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.relationships.vca.relationships.Relation>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.relationships.vca.relationships.Relation>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Relation [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_provides != null) {
                builder.append("_provides=");
                builder.append(_provides);
                builder.append(", ");
            }
            if (_requires != null) {
                builder.append("_requires=");
                builder.append(_requires);
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
