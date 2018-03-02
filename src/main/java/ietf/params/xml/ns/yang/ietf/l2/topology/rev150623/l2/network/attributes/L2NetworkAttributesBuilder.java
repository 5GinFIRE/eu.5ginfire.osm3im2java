package ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.network.attributes;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.network.attributes.L2NetworkAttributes} instances.
 * 
 * @see ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.network.attributes.L2NetworkAttributes
 *
 */
public class L2NetworkAttributesBuilder implements Builder<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.network.attributes.L2NetworkAttributes> {

    private List<java.lang.Class<? extends ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.FlagIdentity>> _flag;
    private java.lang.String _name;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.network.attributes.L2NetworkAttributes>>, Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.network.attributes.L2NetworkAttributes>> augmentation = Collections.emptyMap();

    public L2NetworkAttributesBuilder() {
    }

    public L2NetworkAttributesBuilder(L2NetworkAttributes base) {
        this._flag = base.getFlag();
        this._name = base.getName();
        if (base instanceof L2NetworkAttributesImpl) {
            L2NetworkAttributesImpl impl = (L2NetworkAttributesImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.network.attributes.L2NetworkAttributes> casted =(AugmentationHolder<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.network.attributes.L2NetworkAttributes>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public List<java.lang.Class<? extends ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.FlagIdentity>> getFlag() {
        return _flag;
    }
    
    public java.lang.String getName() {
        return _name;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.network.attributes.L2NetworkAttributes>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public L2NetworkAttributesBuilder setFlag(final List<java.lang.Class<? extends ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.FlagIdentity>> value) {
        this._flag = value;
        return this;
    }
    
     
    public L2NetworkAttributesBuilder setName(final java.lang.String value) {
        this._name = value;
        return this;
    }
    
    public L2NetworkAttributesBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.network.attributes.L2NetworkAttributes>> augmentationType, Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.network.attributes.L2NetworkAttributes> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public L2NetworkAttributesBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.network.attributes.L2NetworkAttributes>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public L2NetworkAttributes build() {
        return new L2NetworkAttributesImpl(this);
    }

    private static final class L2NetworkAttributesImpl implements L2NetworkAttributes {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.network.attributes.L2NetworkAttributes> getImplementedInterface() {
            return ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.network.attributes.L2NetworkAttributes.class;
        }

        private final List<java.lang.Class<? extends ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.FlagIdentity>> _flag;
        private final java.lang.String _name;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.network.attributes.L2NetworkAttributes>>, Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.network.attributes.L2NetworkAttributes>> augmentation = Collections.emptyMap();

        private L2NetworkAttributesImpl(L2NetworkAttributesBuilder base) {
            this._flag = base.getFlag();
            this._name = base.getName();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.network.attributes.L2NetworkAttributes>>, Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.network.attributes.L2NetworkAttributes>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.network.attributes.L2NetworkAttributes>>, Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.network.attributes.L2NetworkAttributes>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<java.lang.Class<? extends ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.FlagIdentity>> getFlag() {
            return _flag;
        }
        
        @Override
        public java.lang.String getName() {
            return _name;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.network.attributes.L2NetworkAttributes>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_flag);
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
            if (!ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.network.attributes.L2NetworkAttributes.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.network.attributes.L2NetworkAttributes other = (ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.network.attributes.L2NetworkAttributes)obj;
            if (!Objects.equals(_flag, other.getFlag())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                L2NetworkAttributesImpl otherImpl = (L2NetworkAttributesImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.network.attributes.L2NetworkAttributes>>, Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.network.attributes.L2NetworkAttributes>> e : augmentation.entrySet()) {
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
            java.lang.String name = "L2NetworkAttributes [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_flag != null) {
                builder.append("_flag=");
                builder.append(_flag);
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
