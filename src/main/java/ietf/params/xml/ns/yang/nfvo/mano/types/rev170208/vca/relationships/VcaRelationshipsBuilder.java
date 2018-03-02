package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.relationships;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.relationships.vca.relationships.Relation;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.relationships.VcaRelationships} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.relationships.VcaRelationships
 *
 */
public class VcaRelationshipsBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.relationships.VcaRelationships> {

    private List<Relation> _relation;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.relationships.VcaRelationships>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.relationships.VcaRelationships>> augmentation = Collections.emptyMap();

    public VcaRelationshipsBuilder() {
    }

    public VcaRelationshipsBuilder(VcaRelationships base) {
        this._relation = base.getRelation();
        if (base instanceof VcaRelationshipsImpl) {
            VcaRelationshipsImpl impl = (VcaRelationshipsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.relationships.VcaRelationships> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.relationships.VcaRelationships>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public List<Relation> getRelation() {
        return _relation;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.relationships.VcaRelationships>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public VcaRelationshipsBuilder setRelation(final List<Relation> value) {
        this._relation = value;
        return this;
    }
    
    public VcaRelationshipsBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.relationships.VcaRelationships>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.relationships.VcaRelationships> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VcaRelationshipsBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.relationships.VcaRelationships>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public VcaRelationships build() {
        return new VcaRelationshipsImpl(this);
    }

    private static final class VcaRelationshipsImpl implements VcaRelationships {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.relationships.VcaRelationships> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.relationships.VcaRelationships.class;
        }

        private final List<Relation> _relation;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.relationships.VcaRelationships>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.relationships.VcaRelationships>> augmentation = Collections.emptyMap();

        private VcaRelationshipsImpl(VcaRelationshipsBuilder base) {
            this._relation = base.getRelation();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.relationships.VcaRelationships>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.relationships.VcaRelationships>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.relationships.VcaRelationships>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.relationships.VcaRelationships>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<Relation> getRelation() {
            return _relation;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.relationships.VcaRelationships>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_relation);
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
            if (!ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.relationships.VcaRelationships.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.relationships.VcaRelationships other = (ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.relationships.VcaRelationships)obj;
            if (!Objects.equals(_relation, other.getRelation())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VcaRelationshipsImpl otherImpl = (VcaRelationshipsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.relationships.VcaRelationships>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.relationships.VcaRelationships>> e : augmentation.entrySet()) {
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
            java.lang.String name = "VcaRelationships [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_relation != null) {
                builder.append("_relation=");
                builder.append(_relation);
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
