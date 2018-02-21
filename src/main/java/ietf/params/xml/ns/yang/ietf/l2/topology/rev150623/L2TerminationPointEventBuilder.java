package ietf.params.xml.ns.yang.ietf.l2.topology.rev150623;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.network.type.L2Network;
import ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.L2TerminationPointAttributes;
import ietf.params.xml.ns.yang.ietf.network.rev150608.NetworkId;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2TerminationPointEvent} instances.
 * 
 * @see ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2TerminationPointEvent
 *
 */
public class L2TerminationPointEventBuilder implements Builder<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2TerminationPointEvent> {

    private L2NetworkEventType _eventType;
    private L2Network _l2Network;
    private L2TerminationPointAttributes _l2TerminationPointAttributes;
    private NetworkId _networkRef;
    private java.lang.Object _nodeRef;
    private java.lang.Object _tpRef;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2TerminationPointEvent>>, Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2TerminationPointEvent>> augmentation = Collections.emptyMap();

    public L2TerminationPointEventBuilder() {
    }
    public L2TerminationPointEventBuilder(ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.TpRef arg) {
        this._tpRef = arg.getTpRef();
        this._nodeRef = arg.getNodeRef();
        this._networkRef = arg.getNetworkRef();
    }
    public L2TerminationPointEventBuilder(ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.NodeRef arg) {
        this._nodeRef = arg.getNodeRef();
        this._networkRef = arg.getNetworkRef();
    }
    public L2TerminationPointEventBuilder(ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.NetworkRef arg) {
        this._networkRef = arg.getNetworkRef();
    }
    public L2TerminationPointEventBuilder(ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2NetworkType arg) {
        this._l2Network = arg.getL2Network();
    }
    public L2TerminationPointEventBuilder(ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2TerminationPointAttributes arg) {
        this._l2TerminationPointAttributes = arg.getL2TerminationPointAttributes();
    }

    public L2TerminationPointEventBuilder(L2TerminationPointEvent base) {
        this._eventType = base.getEventType();
        this._l2Network = base.getL2Network();
        this._l2TerminationPointAttributes = base.getL2TerminationPointAttributes();
        this._networkRef = base.getNetworkRef();
        this._nodeRef = base.getNodeRef();
        this._tpRef = base.getTpRef();
        if (base instanceof L2TerminationPointEventImpl) {
            L2TerminationPointEventImpl impl = (L2TerminationPointEventImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2TerminationPointEvent> casted =(AugmentationHolder<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2TerminationPointEvent>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.TpRef</li>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2TerminationPointAttributes</li>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.NodeRef</li>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2NetworkType</li>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.NetworkRef</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.TpRef) {
            this._tpRef = ((ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.TpRef)arg).getTpRef();
            isValidArg = true;
        }
        if (arg instanceof ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2TerminationPointAttributes) {
            this._l2TerminationPointAttributes = ((ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2TerminationPointAttributes)arg).getL2TerminationPointAttributes();
            isValidArg = true;
        }
        if (arg instanceof ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.NodeRef) {
            this._nodeRef = ((ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.NodeRef)arg).getNodeRef();
            isValidArg = true;
        }
        if (arg instanceof ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2NetworkType) {
            this._l2Network = ((ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2NetworkType)arg).getL2Network();
            isValidArg = true;
        }
        if (arg instanceof ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.NetworkRef) {
            this._networkRef = ((ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.NetworkRef)arg).getNetworkRef();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.TpRef, org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2TerminationPointAttributes, org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.NodeRef, org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2NetworkType, org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.NetworkRef] \n" +
              "but was: " + arg
            );
        }
    }

    public L2NetworkEventType getEventType() {
        return _eventType;
    }
    
    public L2Network getL2Network() {
        return _l2Network;
    }
    
    public L2TerminationPointAttributes getL2TerminationPointAttributes() {
        return _l2TerminationPointAttributes;
    }
    
    public NetworkId getNetworkRef() {
        return _networkRef;
    }
    
    public java.lang.Object getNodeRef() {
        return _nodeRef;
    }
    
    public java.lang.Object getTpRef() {
        return _tpRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2TerminationPointEvent>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public L2TerminationPointEventBuilder setEventType(final L2NetworkEventType value) {
        this._eventType = value;
        return this;
    }
    
     
    public L2TerminationPointEventBuilder setL2Network(final L2Network value) {
        this._l2Network = value;
        return this;
    }
    
     
    public L2TerminationPointEventBuilder setL2TerminationPointAttributes(final L2TerminationPointAttributes value) {
        this._l2TerminationPointAttributes = value;
        return this;
    }
    
     
    public L2TerminationPointEventBuilder setNetworkRef(final NetworkId value) {
        this._networkRef = value;
        return this;
    }
    
     
    public L2TerminationPointEventBuilder setNodeRef(final java.lang.Object value) {
        this._nodeRef = value;
        return this;
    }
    
     
    public L2TerminationPointEventBuilder setTpRef(final java.lang.Object value) {
        this._tpRef = value;
        return this;
    }
    
    public L2TerminationPointEventBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2TerminationPointEvent>> augmentationType, Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2TerminationPointEvent> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public L2TerminationPointEventBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2TerminationPointEvent>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public L2TerminationPointEvent build() {
        return new L2TerminationPointEventImpl(this);
    }

    private static final class L2TerminationPointEventImpl implements L2TerminationPointEvent {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2TerminationPointEvent> getImplementedInterface() {
            return ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2TerminationPointEvent.class;
        }

        private final L2NetworkEventType _eventType;
        private final L2Network _l2Network;
        private final L2TerminationPointAttributes _l2TerminationPointAttributes;
        private final NetworkId _networkRef;
        private final java.lang.Object _nodeRef;
        private final java.lang.Object _tpRef;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2TerminationPointEvent>>, Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2TerminationPointEvent>> augmentation = Collections.emptyMap();

        private L2TerminationPointEventImpl(L2TerminationPointEventBuilder base) {
            this._eventType = base.getEventType();
            this._l2Network = base.getL2Network();
            this._l2TerminationPointAttributes = base.getL2TerminationPointAttributes();
            this._networkRef = base.getNetworkRef();
            this._nodeRef = base.getNodeRef();
            this._tpRef = base.getTpRef();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2TerminationPointEvent>>, Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2TerminationPointEvent>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2TerminationPointEvent>>, Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2TerminationPointEvent>>singletonMap(e.getKey(), e.getValue());
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
        public L2Network getL2Network() {
            return _l2Network;
        }
        
        @Override
        public L2TerminationPointAttributes getL2TerminationPointAttributes() {
            return _l2TerminationPointAttributes;
        }
        
        @Override
        public NetworkId getNetworkRef() {
            return _networkRef;
        }
        
        @Override
        public java.lang.Object getNodeRef() {
            return _nodeRef;
        }
        
        @Override
        public java.lang.Object getTpRef() {
            return _tpRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2TerminationPointEvent>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_l2Network);
            result = prime * result + Objects.hashCode(_l2TerminationPointAttributes);
            result = prime * result + Objects.hashCode(_networkRef);
            result = prime * result + Objects.hashCode(_nodeRef);
            result = prime * result + Objects.hashCode(_tpRef);
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
            if (!ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2TerminationPointEvent.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2TerminationPointEvent other = (ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2TerminationPointEvent)obj;
            if (!Objects.equals(_eventType, other.getEventType())) {
                return false;
            }
            if (!Objects.equals(_l2Network, other.getL2Network())) {
                return false;
            }
            if (!Objects.equals(_l2TerminationPointAttributes, other.getL2TerminationPointAttributes())) {
                return false;
            }
            if (!Objects.equals(_networkRef, other.getNetworkRef())) {
                return false;
            }
            if (!Objects.equals(_nodeRef, other.getNodeRef())) {
                return false;
            }
            if (!Objects.equals(_tpRef, other.getTpRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                L2TerminationPointEventImpl otherImpl = (L2TerminationPointEventImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2TerminationPointEvent>>, Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2TerminationPointEvent>> e : augmentation.entrySet()) {
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
            java.lang.String name = "L2TerminationPointEvent [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_eventType != null) {
                builder.append("_eventType=");
                builder.append(_eventType);
                builder.append(", ");
            }
            if (_l2Network != null) {
                builder.append("_l2Network=");
                builder.append(_l2Network);
                builder.append(", ");
            }
            if (_l2TerminationPointAttributes != null) {
                builder.append("_l2TerminationPointAttributes=");
                builder.append(_l2TerminationPointAttributes);
                builder.append(", ");
            }
            if (_networkRef != null) {
                builder.append("_networkRef=");
                builder.append(_networkRef);
                builder.append(", ");
            }
            if (_nodeRef != null) {
                builder.append("_nodeRef=");
                builder.append(_nodeRef);
                builder.append(", ");
            }
            if (_tpRef != null) {
                builder.append("_tpRef=");
                builder.append(_tpRef);
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
