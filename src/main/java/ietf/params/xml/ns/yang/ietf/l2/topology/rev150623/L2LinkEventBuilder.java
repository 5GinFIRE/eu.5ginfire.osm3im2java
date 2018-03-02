package ietf.params.xml.ns.yang.ietf.l2.topology.rev150623;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.link.attributes.L2LinkAttributes;
import ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.network.type.L2Network;
import ietf.params.xml.ns.yang.ietf.network.rev150608.NetworkId;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2LinkEvent} instances.
 * 
 * @see ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2LinkEvent
 *
 */
public class L2LinkEventBuilder implements Builder<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2LinkEvent> {

    private L2NetworkEventType _eventType;
    private L2LinkAttributes _l2LinkAttributes;
    private L2Network _l2Network;
    private java.lang.Object _linkRef;
    private NetworkId _networkRef;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2LinkEvent>>, Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2LinkEvent>> augmentation = Collections.emptyMap();

    public L2LinkEventBuilder() {
    }
    public L2LinkEventBuilder(ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2LinkAttributes arg) {
        this._l2LinkAttributes = arg.getL2LinkAttributes();
    }
    public L2LinkEventBuilder(ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2NetworkType arg) {
        this._l2Network = arg.getL2Network();
    }
    public L2LinkEventBuilder(ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.LinkRef arg) {
        this._linkRef = arg.getLinkRef();
        this._networkRef = arg.getNetworkRef();
    }
    public L2LinkEventBuilder(ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.NetworkRef arg) {
        this._networkRef = arg.getNetworkRef();
    }

    public L2LinkEventBuilder(L2LinkEvent base) {
        this._eventType = base.getEventType();
        this._l2LinkAttributes = base.getL2LinkAttributes();
        this._l2Network = base.getL2Network();
        this._linkRef = base.getLinkRef();
        this._networkRef = base.getNetworkRef();
        if (base instanceof L2LinkEventImpl) {
            L2LinkEventImpl impl = (L2LinkEventImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2LinkEvent> casted =(AugmentationHolder<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2LinkEvent>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2NetworkType</li>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.NetworkRef</li>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.LinkRef</li>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2LinkAttributes</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2NetworkType) {
            this._l2Network = ((ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2NetworkType)arg).getL2Network();
            isValidArg = true;
        }
        if (arg instanceof ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.NetworkRef) {
            this._networkRef = ((ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.NetworkRef)arg).getNetworkRef();
            isValidArg = true;
        }
        if (arg instanceof ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.LinkRef) {
            this._linkRef = ((ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.LinkRef)arg).getLinkRef();
            isValidArg = true;
        }
        if (arg instanceof ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2LinkAttributes) {
            this._l2LinkAttributes = ((ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2LinkAttributes)arg).getL2LinkAttributes();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2NetworkType, org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.NetworkRef, org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.LinkRef, org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2LinkAttributes] \n" +
              "but was: " + arg
            );
        }
    }

    public L2NetworkEventType getEventType() {
        return _eventType;
    }
    
    public L2LinkAttributes getL2LinkAttributes() {
        return _l2LinkAttributes;
    }
    
    public L2Network getL2Network() {
        return _l2Network;
    }
    
    public java.lang.Object getLinkRef() {
        return _linkRef;
    }
    
    public NetworkId getNetworkRef() {
        return _networkRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2LinkEvent>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public L2LinkEventBuilder setEventType(final L2NetworkEventType value) {
        this._eventType = value;
        return this;
    }
    
     
    public L2LinkEventBuilder setL2LinkAttributes(final L2LinkAttributes value) {
        this._l2LinkAttributes = value;
        return this;
    }
    
     
    public L2LinkEventBuilder setL2Network(final L2Network value) {
        this._l2Network = value;
        return this;
    }
    
     
    public L2LinkEventBuilder setLinkRef(final java.lang.Object value) {
        this._linkRef = value;
        return this;
    }
    
     
    public L2LinkEventBuilder setNetworkRef(final NetworkId value) {
        this._networkRef = value;
        return this;
    }
    
    public L2LinkEventBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2LinkEvent>> augmentationType, Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2LinkEvent> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public L2LinkEventBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2LinkEvent>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public L2LinkEvent build() {
        return new L2LinkEventImpl(this);
    }

    private static final class L2LinkEventImpl implements L2LinkEvent {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2LinkEvent> getImplementedInterface() {
            return ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2LinkEvent.class;
        }

        private final L2NetworkEventType _eventType;
        private final L2LinkAttributes _l2LinkAttributes;
        private final L2Network _l2Network;
        private final java.lang.Object _linkRef;
        private final NetworkId _networkRef;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2LinkEvent>>, Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2LinkEvent>> augmentation = Collections.emptyMap();

        private L2LinkEventImpl(L2LinkEventBuilder base) {
            this._eventType = base.getEventType();
            this._l2LinkAttributes = base.getL2LinkAttributes();
            this._l2Network = base.getL2Network();
            this._linkRef = base.getLinkRef();
            this._networkRef = base.getNetworkRef();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2LinkEvent>>, Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2LinkEvent>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2LinkEvent>>, Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2LinkEvent>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public L2NetworkEventType getEventType() {
            return _eventType;
        }
        
        @Override
        public L2LinkAttributes getL2LinkAttributes() {
            return _l2LinkAttributes;
        }
        
        @Override
        public L2Network getL2Network() {
            return _l2Network;
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
        public <E extends Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2LinkEvent>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_eventType);
            result = prime * result + Objects.hashCode(_l2LinkAttributes);
            result = prime * result + Objects.hashCode(_l2Network);
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
            if (!ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2LinkEvent.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2LinkEvent other = (ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2LinkEvent)obj;
            if (!Objects.equals(_eventType, other.getEventType())) {
                return false;
            }
            if (!Objects.equals(_l2LinkAttributes, other.getL2LinkAttributes())) {
                return false;
            }
            if (!Objects.equals(_l2Network, other.getL2Network())) {
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
                L2LinkEventImpl otherImpl = (L2LinkEventImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2LinkEvent>>, Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2LinkEvent>> e : augmentation.entrySet()) {
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
            java.lang.String name = "L2LinkEvent [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_eventType != null) {
                builder.append("_eventType=");
                builder.append(_eventType);
                builder.append(", ");
            }
            if (_l2LinkAttributes != null) {
                builder.append("_l2LinkAttributes=");
                builder.append(_l2LinkAttributes);
                builder.append(", ");
            }
            if (_l2Network != null) {
                builder.append("_l2Network=");
                builder.append(_l2Network);
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
