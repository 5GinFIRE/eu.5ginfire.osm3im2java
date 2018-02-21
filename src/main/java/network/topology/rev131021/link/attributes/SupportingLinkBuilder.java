package network.topology.rev131021.link.attributes;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import network.topology.rev131021.LinkId;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link network.topology.rev131021.link.attributes.SupportingLink} instances.
 * 
 * @see network.topology.rev131021.link.attributes.SupportingLink
 *
 */
public class SupportingLinkBuilder implements Builder<network.topology.rev131021.link.attributes.SupportingLink> {

    private SupportingLinkKey _key;
    private LinkId _linkRef;

    Map<java.lang.Class<? extends Augmentation<network.topology.rev131021.link.attributes.SupportingLink>>, Augmentation<network.topology.rev131021.link.attributes.SupportingLink>> augmentation = Collections.emptyMap();

    public SupportingLinkBuilder() {
    }

    public SupportingLinkBuilder(SupportingLink base) {
        if (base.getKey() == null) {
            this._key = new SupportingLinkKey(
                base.getLinkRef()
            );
            this._linkRef = base.getLinkRef();
        } else {
            this._key = base.getKey();
            this._linkRef = _key.getLinkRef();
        }
        if (base instanceof SupportingLinkImpl) {
            SupportingLinkImpl impl = (SupportingLinkImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<network.topology.rev131021.link.attributes.SupportingLink> casted =(AugmentationHolder<network.topology.rev131021.link.attributes.SupportingLink>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public SupportingLinkKey getKey() {
        return _key;
    }
    
    public LinkId getLinkRef() {
        return _linkRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<network.topology.rev131021.link.attributes.SupportingLink>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public SupportingLinkBuilder setKey(final SupportingLinkKey value) {
        this._key = value;
        return this;
    }
    
     
    public SupportingLinkBuilder setLinkRef(final LinkId value) {
        this._linkRef = value;
        return this;
    }
    
    public SupportingLinkBuilder addAugmentation(java.lang.Class<? extends Augmentation<network.topology.rev131021.link.attributes.SupportingLink>> augmentationType, Augmentation<network.topology.rev131021.link.attributes.SupportingLink> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public SupportingLinkBuilder removeAugmentation(java.lang.Class<? extends Augmentation<network.topology.rev131021.link.attributes.SupportingLink>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public SupportingLink build() {
        return new SupportingLinkImpl(this);
    }

    private static final class SupportingLinkImpl implements SupportingLink {

        @Override
        public java.lang.Class<network.topology.rev131021.link.attributes.SupportingLink> getImplementedInterface() {
            return network.topology.rev131021.link.attributes.SupportingLink.class;
        }

        private final SupportingLinkKey _key;
        private final LinkId _linkRef;

        private Map<java.lang.Class<? extends Augmentation<network.topology.rev131021.link.attributes.SupportingLink>>, Augmentation<network.topology.rev131021.link.attributes.SupportingLink>> augmentation = Collections.emptyMap();

        private SupportingLinkImpl(SupportingLinkBuilder base) {
            if (base.getKey() == null) {
                this._key = new SupportingLinkKey(
                    base.getLinkRef()
                );
                this._linkRef = base.getLinkRef();
            } else {
                this._key = base.getKey();
                this._linkRef = _key.getLinkRef();
            }
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<network.topology.rev131021.link.attributes.SupportingLink>>, Augmentation<network.topology.rev131021.link.attributes.SupportingLink>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<network.topology.rev131021.link.attributes.SupportingLink>>, Augmentation<network.topology.rev131021.link.attributes.SupportingLink>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public SupportingLinkKey getKey() {
            return _key;
        }
        
        @Override
        public LinkId getLinkRef() {
            return _linkRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<network.topology.rev131021.link.attributes.SupportingLink>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_linkRef);
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
            if (!network.topology.rev131021.link.attributes.SupportingLink.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            network.topology.rev131021.link.attributes.SupportingLink other = (network.topology.rev131021.link.attributes.SupportingLink)obj;
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_linkRef, other.getLinkRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                SupportingLinkImpl otherImpl = (SupportingLinkImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<network.topology.rev131021.link.attributes.SupportingLink>>, Augmentation<network.topology.rev131021.link.attributes.SupportingLink>> e : augmentation.entrySet()) {
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
            java.lang.String name = "SupportingLink [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_linkRef != null) {
                builder.append("_linkRef=");
                builder.append(_linkRef);
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
