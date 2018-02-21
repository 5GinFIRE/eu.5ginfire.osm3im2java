package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.network.Incoming;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.network.Outgoing;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.Network} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.Network
 *
 */
public class NetworkBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.Network> {

    private Incoming _incoming;
    private java.lang.String _label;
    private Outgoing _outgoing;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.Network>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.Network>> augmentation = Collections.emptyMap();

    public NetworkBuilder() {
    }

    public NetworkBuilder(Network base) {
        this._incoming = base.getIncoming();
        this._label = base.getLabel();
        this._outgoing = base.getOutgoing();
        if (base instanceof NetworkImpl) {
            NetworkImpl impl = (NetworkImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.Network> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.Network>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public Incoming getIncoming() {
        return _incoming;
    }
    
    public java.lang.String getLabel() {
        return _label;
    }
    
    public Outgoing getOutgoing() {
        return _outgoing;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.Network>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public NetworkBuilder setIncoming(final Incoming value) {
        this._incoming = value;
        return this;
    }
    
     
    public NetworkBuilder setLabel(final java.lang.String value) {
        this._label = value;
        return this;
    }
    
     
    public NetworkBuilder setOutgoing(final Outgoing value) {
        this._outgoing = value;
        return this;
    }
    
    public NetworkBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.Network>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.Network> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public NetworkBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.Network>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Network build() {
        return new NetworkImpl(this);
    }

    private static final class NetworkImpl implements Network {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.Network> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.Network.class;
        }

        private final Incoming _incoming;
        private final java.lang.String _label;
        private final Outgoing _outgoing;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.Network>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.Network>> augmentation = Collections.emptyMap();

        private NetworkImpl(NetworkBuilder base) {
            this._incoming = base.getIncoming();
            this._label = base.getLabel();
            this._outgoing = base.getOutgoing();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.Network>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.Network>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.Network>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.Network>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public Incoming getIncoming() {
            return _incoming;
        }
        
        @Override
        public java.lang.String getLabel() {
            return _label;
        }
        
        @Override
        public Outgoing getOutgoing() {
            return _outgoing;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.Network>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_incoming);
            result = prime * result + Objects.hashCode(_label);
            result = prime * result + Objects.hashCode(_outgoing);
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
            if (!ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.Network.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.Network other = (ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.Network)obj;
            if (!Objects.equals(_incoming, other.getIncoming())) {
                return false;
            }
            if (!Objects.equals(_label, other.getLabel())) {
                return false;
            }
            if (!Objects.equals(_outgoing, other.getOutgoing())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NetworkImpl otherImpl = (NetworkImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.Network>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.Network>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Network [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_incoming != null) {
                builder.append("_incoming=");
                builder.append(_incoming);
                builder.append(", ");
            }
            if (_label != null) {
                builder.append("_label=");
                builder.append(_label);
                builder.append(", ");
            }
            if (_outgoing != null) {
                builder.append("_outgoing=");
                builder.append(_outgoing);
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
