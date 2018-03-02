package ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.node.termination.point;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.ietf.network.rev150608.NetworkId;
import ietf.params.xml.ns.yang.ietf.network.rev150608.NodeId;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;

import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.node.termination.point.SupportingTerminationPoint} instances.
 * 
 * @see ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.node.termination.point.SupportingTerminationPoint
 *
 */
public class SupportingTerminationPointBuilder implements Builder<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.node.termination.point.SupportingTerminationPoint> {

    private SupportingTerminationPointKey _key;
    private NetworkId _networkRef;
    private NodeId _nodeRef;
    private java.lang.Object _tpRef;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.node.termination.point.SupportingTerminationPoint>>, Augmentation<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.node.termination.point.SupportingTerminationPoint>> augmentation = Collections.emptyMap();

    public SupportingTerminationPointBuilder() {
    }

    public SupportingTerminationPointBuilder(SupportingTerminationPoint base) {
        if (base.getKey() == null) {
            this._key = new SupportingTerminationPointKey(
                base.getNetworkRef(), 
                base.getNodeRef(), 
                base.getTpRef()
            );
            this._networkRef = base.getNetworkRef();
            this._nodeRef = base.getNodeRef();
            this._tpRef = base.getTpRef();
        } else {
            this._key = base.getKey();
            this._networkRef = _key.getNetworkRef();
            this._nodeRef = _key.getNodeRef();
            this._tpRef = _key.getTpRef();
        }
        if (base instanceof SupportingTerminationPointImpl) {
            SupportingTerminationPointImpl impl = (SupportingTerminationPointImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.node.termination.point.SupportingTerminationPoint> casted =(AugmentationHolder<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.node.termination.point.SupportingTerminationPoint>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public SupportingTerminationPointKey getKey() {
        return _key;
    }
    
    public NetworkId getNetworkRef() {
        return _networkRef;
    }
    
    public NodeId getNodeRef() {
        return _nodeRef;
    }
    
    public java.lang.Object getTpRef() {
        return _tpRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.node.termination.point.SupportingTerminationPoint>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public SupportingTerminationPointBuilder setKey(final SupportingTerminationPointKey value) {
        this._key = value;
        return this;
    }
    
     
    public SupportingTerminationPointBuilder setNetworkRef(final NetworkId value) {
        this._networkRef = value;
        return this;
    }
    
     
    public SupportingTerminationPointBuilder setNodeRef(final NodeId value) {
        this._nodeRef = value;
        return this;
    }
    
     
    public SupportingTerminationPointBuilder setTpRef(final java.lang.Object value) {
        this._tpRef = value;
        return this;
    }
    
    public SupportingTerminationPointBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.node.termination.point.SupportingTerminationPoint>> augmentationType, Augmentation<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.node.termination.point.SupportingTerminationPoint> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public SupportingTerminationPointBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.node.termination.point.SupportingTerminationPoint>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public SupportingTerminationPoint build() {
        return new SupportingTerminationPointImpl(this);
    }

    private static final class SupportingTerminationPointImpl implements SupportingTerminationPoint {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.node.termination.point.SupportingTerminationPoint> getImplementedInterface() {
            return ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.node.termination.point.SupportingTerminationPoint.class;
        }

        private final SupportingTerminationPointKey _key;
        private final NetworkId _networkRef;
        private final NodeId _nodeRef;
        private final java.lang.Object _tpRef;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.node.termination.point.SupportingTerminationPoint>>, Augmentation<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.node.termination.point.SupportingTerminationPoint>> augmentation = Collections.emptyMap();

        private SupportingTerminationPointImpl(SupportingTerminationPointBuilder base) {
            if (base.getKey() == null) {
                this._key = new SupportingTerminationPointKey(
                    base.getNetworkRef(), 
                    base.getNodeRef(), 
                    base.getTpRef()
                );
                this._networkRef = base.getNetworkRef();
                this._nodeRef = base.getNodeRef();
                this._tpRef = base.getTpRef();
            } else {
                this._key = base.getKey();
                this._networkRef = _key.getNetworkRef();
                this._nodeRef = _key.getNodeRef();
                this._tpRef = _key.getTpRef();
            }
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.node.termination.point.SupportingTerminationPoint>>, Augmentation<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.node.termination.point.SupportingTerminationPoint>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.node.termination.point.SupportingTerminationPoint>>, Augmentation<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.node.termination.point.SupportingTerminationPoint>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public SupportingTerminationPointKey getKey() {
            return _key;
        }
        
        @Override
        public NetworkId getNetworkRef() {
            return _networkRef;
        }
        
        @Override
        public NodeId getNodeRef() {
            return _nodeRef;
        }
        
        @Override
        public java.lang.Object getTpRef() {
            return _tpRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.node.termination.point.SupportingTerminationPoint>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            if (!ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.node.termination.point.SupportingTerminationPoint.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.node.termination.point.SupportingTerminationPoint other = (ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.node.termination.point.SupportingTerminationPoint)obj;
            if (!Objects.equals(_key, other.getKey())) {
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
                SupportingTerminationPointImpl otherImpl = (SupportingTerminationPointImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.node.termination.point.SupportingTerminationPoint>>, Augmentation<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.node.termination.point.SupportingTerminationPoint>> e : augmentation.entrySet()) {
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
            java.lang.String name = "SupportingTerminationPoint [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
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
