package ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.link;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.ietf.network.rev150608.NetworkId;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.link.SupportingLink} instances.
 * 
 * @see ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.link.SupportingLink
 *
 */
public class SupportingLinkBuilder implements Builder<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.link.SupportingLink> {

    private SupportingLinkKey _key;
    private java.lang.Object _linkRef;
    private NetworkId _networkRef;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.link.SupportingLink>>, Augmentation<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.link.SupportingLink>> augmentation = Collections.emptyMap();

    public SupportingLinkBuilder() {
    }

    public SupportingLinkBuilder(SupportingLink base) {
        if (base.getKey() == null) {
            this._key = new SupportingLinkKey(
                base.getLinkRef(), 
                base.getNetworkRef()
            );
            this._linkRef = base.getLinkRef();
            this._networkRef = base.getNetworkRef();
        } else {
            this._key = base.getKey();
            this._linkRef = _key.getLinkRef();
            this._networkRef = _key.getNetworkRef();
        }
        if (base instanceof SupportingLinkImpl) {
            SupportingLinkImpl impl = (SupportingLinkImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.link.SupportingLink> casted =(AugmentationHolder<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.link.SupportingLink>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public SupportingLinkKey getKey() {
        return _key;
    }
    
    public java.lang.Object getLinkRef() {
        return _linkRef;
    }
    
    public NetworkId getNetworkRef() {
        return _networkRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.link.SupportingLink>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public SupportingLinkBuilder setKey(final SupportingLinkKey value) {
        this._key = value;
        return this;
    }
    
     
    public SupportingLinkBuilder setLinkRef(final java.lang.Object value) {
        this._linkRef = value;
        return this;
    }
    
     
    public SupportingLinkBuilder setNetworkRef(final NetworkId value) {
        this._networkRef = value;
        return this;
    }
    
    public SupportingLinkBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.link.SupportingLink>> augmentationType, Augmentation<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.link.SupportingLink> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public SupportingLinkBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.link.SupportingLink>> augmentationType) {
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
        public java.lang.Class<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.link.SupportingLink> getImplementedInterface() {
            return ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.link.SupportingLink.class;
        }

        private final SupportingLinkKey _key;
        private final java.lang.Object _linkRef;
        private final NetworkId _networkRef;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.link.SupportingLink>>, Augmentation<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.link.SupportingLink>> augmentation = Collections.emptyMap();

        private SupportingLinkImpl(SupportingLinkBuilder base) {
            if (base.getKey() == null) {
                this._key = new SupportingLinkKey(
                    base.getLinkRef(), 
                    base.getNetworkRef()
                );
                this._linkRef = base.getLinkRef();
                this._networkRef = base.getNetworkRef();
            } else {
                this._key = base.getKey();
                this._linkRef = _key.getLinkRef();
                this._networkRef = _key.getNetworkRef();
            }
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.link.SupportingLink>>, Augmentation<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.link.SupportingLink>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.link.SupportingLink>>, Augmentation<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.link.SupportingLink>>singletonMap(e.getKey(), e.getValue());
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
        public java.lang.Object getLinkRef() {
            return _linkRef;
        }
        
        @Override
        public NetworkId getNetworkRef() {
            return _networkRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.link.SupportingLink>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_networkRef);
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
            if (!ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.link.SupportingLink.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.link.SupportingLink other = (ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.link.SupportingLink)obj;
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_linkRef, other.getLinkRef())) {
                return false;
            }
            if (!Objects.equals(_networkRef, other.getNetworkRef())) {
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
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.link.SupportingLink>>, Augmentation<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.link.SupportingLink>> e : augmentation.entrySet()) {
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
                builder.append(", ");
            }
            if (_networkRef != null) {
                builder.append("_networkRef=");
                builder.append(_networkRef);
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
