package ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.node;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.ietf.network.topology.rev150608.TpId;
import ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.node.termination.point.SupportingTerminationPoint;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.node.TerminationPoint} instances.
 * 
 * @see ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.node.TerminationPoint
 *
 */
public class TerminationPointBuilder implements Builder<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.node.TerminationPoint> {

    private TerminationPointKey _key;
    private List<SupportingTerminationPoint> _supportingTerminationPoint;
    private TpId _tpId;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.node.TerminationPoint>>, Augmentation<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.node.TerminationPoint>> augmentation = Collections.emptyMap();

    public TerminationPointBuilder() {
    }

    public TerminationPointBuilder(TerminationPoint base) {
        if (base.getKey() == null) {
            this._key = new TerminationPointKey(
                base.getTpId()
            );
            this._tpId = base.getTpId();
        } else {
            this._key = base.getKey();
            this._tpId = _key.getTpId();
        }
        this._supportingTerminationPoint = base.getSupportingTerminationPoint();
        if (base instanceof TerminationPointImpl) {
            TerminationPointImpl impl = (TerminationPointImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.node.TerminationPoint> casted =(AugmentationHolder<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.node.TerminationPoint>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public TerminationPointKey getKey() {
        return _key;
    }
    
    public List<SupportingTerminationPoint> getSupportingTerminationPoint() {
        return _supportingTerminationPoint;
    }
    
    public TpId getTpId() {
        return _tpId;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.node.TerminationPoint>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public TerminationPointBuilder setKey(final TerminationPointKey value) {
        this._key = value;
        return this;
    }
    
     
    public TerminationPointBuilder setSupportingTerminationPoint(final List<SupportingTerminationPoint> value) {
        this._supportingTerminationPoint = value;
        return this;
    }
    
     
    public TerminationPointBuilder setTpId(final TpId value) {
        this._tpId = value;
        return this;
    }
    
    public TerminationPointBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.node.TerminationPoint>> augmentationType, Augmentation<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.node.TerminationPoint> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public TerminationPointBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.node.TerminationPoint>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public TerminationPoint build() {
        return new TerminationPointImpl(this);
    }

    private static final class TerminationPointImpl implements TerminationPoint {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.node.TerminationPoint> getImplementedInterface() {
            return ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.node.TerminationPoint.class;
        }

        private final TerminationPointKey _key;
        private final List<SupportingTerminationPoint> _supportingTerminationPoint;
        private final TpId _tpId;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.node.TerminationPoint>>, Augmentation<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.node.TerminationPoint>> augmentation = Collections.emptyMap();

        private TerminationPointImpl(TerminationPointBuilder base) {
            if (base.getKey() == null) {
                this._key = new TerminationPointKey(
                    base.getTpId()
                );
                this._tpId = base.getTpId();
            } else {
                this._key = base.getKey();
                this._tpId = _key.getTpId();
            }
            this._supportingTerminationPoint = base.getSupportingTerminationPoint();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.node.TerminationPoint>>, Augmentation<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.node.TerminationPoint>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.node.TerminationPoint>>, Augmentation<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.node.TerminationPoint>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public TerminationPointKey getKey() {
            return _key;
        }
        
        @Override
        public List<SupportingTerminationPoint> getSupportingTerminationPoint() {
            return _supportingTerminationPoint;
        }
        
        @Override
        public TpId getTpId() {
            return _tpId;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.node.TerminationPoint>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_supportingTerminationPoint);
            result = prime * result + Objects.hashCode(_tpId);
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
            if (!ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.node.TerminationPoint.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.node.TerminationPoint other = (ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.node.TerminationPoint)obj;
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_supportingTerminationPoint, other.getSupportingTerminationPoint())) {
                return false;
            }
            if (!Objects.equals(_tpId, other.getTpId())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                TerminationPointImpl otherImpl = (TerminationPointImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.node.TerminationPoint>>, Augmentation<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.node.TerminationPoint>> e : augmentation.entrySet()) {
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
            java.lang.String name = "TerminationPoint [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_supportingTerminationPoint != null) {
                builder.append("_supportingTerminationPoint=");
                builder.append(_supportingTerminationPoint);
                builder.append(", ");
            }
            if (_tpId != null) {
                builder.append("_tpId=");
                builder.append(_tpId);
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
