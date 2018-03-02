package ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.L2TerminationPointAttributes.TpState;
import ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.l2.termination.point.attributes.L2TerminationPointType;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;

import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.L2TerminationPointAttributes} instances.
 * 
 * @see ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.L2TerminationPointAttributes
 *
 */
public class L2TerminationPointAttributesBuilder implements Builder<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.L2TerminationPointAttributes> {

    private java.lang.String _description;
    private L2TerminationPointType _l2TerminationPointType;
    private java.lang.Long _maximumFrameSize;
    private TpState _tpState;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.L2TerminationPointAttributes>>, Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.L2TerminationPointAttributes>> augmentation = Collections.emptyMap();

    public L2TerminationPointAttributesBuilder() {
    }

    public L2TerminationPointAttributesBuilder(L2TerminationPointAttributes base) {
        this._description = base.getDescription();
        this._l2TerminationPointType = base.getL2TerminationPointType();
        this._maximumFrameSize = base.getMaximumFrameSize();
        this._tpState = base.getTpState();
        if (base instanceof L2TerminationPointAttributesImpl) {
            L2TerminationPointAttributesImpl impl = (L2TerminationPointAttributesImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.L2TerminationPointAttributes> casted =(AugmentationHolder<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.L2TerminationPointAttributes>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public java.lang.String getDescription() {
        return _description;
    }
    
    public L2TerminationPointType getL2TerminationPointType() {
        return _l2TerminationPointType;
    }
    
    public java.lang.Long getMaximumFrameSize() {
        return _maximumFrameSize;
    }
    
    public TpState getTpState() {
        return _tpState;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.L2TerminationPointAttributes>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public L2TerminationPointAttributesBuilder setDescription(final java.lang.String value) {
        this._description = value;
        return this;
    }
    
     
    public L2TerminationPointAttributesBuilder setL2TerminationPointType(final L2TerminationPointType value) {
        this._l2TerminationPointType = value;
        return this;
    }
    
     
     private static void checkMaximumFrameSizeRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..4294967295]].", value));
     }
    
    public L2TerminationPointAttributesBuilder setMaximumFrameSize(final java.lang.Long value) {
    if (value != null) {
        checkMaximumFrameSizeRange(value);
    }
        this._maximumFrameSize = value;
        return this;
    }
    
     
    public L2TerminationPointAttributesBuilder setTpState(final TpState value) {
        this._tpState = value;
        return this;
    }
    
    public L2TerminationPointAttributesBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.L2TerminationPointAttributes>> augmentationType, Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.L2TerminationPointAttributes> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public L2TerminationPointAttributesBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.L2TerminationPointAttributes>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public L2TerminationPointAttributes build() {
        return new L2TerminationPointAttributesImpl(this);
    }

    private static final class L2TerminationPointAttributesImpl implements L2TerminationPointAttributes {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.L2TerminationPointAttributes> getImplementedInterface() {
            return ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.L2TerminationPointAttributes.class;
        }

        private final java.lang.String _description;
        private final L2TerminationPointType _l2TerminationPointType;
        private final java.lang.Long _maximumFrameSize;
        private final TpState _tpState;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.L2TerminationPointAttributes>>, Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.L2TerminationPointAttributes>> augmentation = Collections.emptyMap();

        private L2TerminationPointAttributesImpl(L2TerminationPointAttributesBuilder base) {
            this._description = base.getDescription();
            this._l2TerminationPointType = base.getL2TerminationPointType();
            this._maximumFrameSize = base.getMaximumFrameSize();
            this._tpState = base.getTpState();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.L2TerminationPointAttributes>>, Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.L2TerminationPointAttributes>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.L2TerminationPointAttributes>>, Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.L2TerminationPointAttributes>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getDescription() {
            return _description;
        }
        
        @Override
        public L2TerminationPointType getL2TerminationPointType() {
            return _l2TerminationPointType;
        }
        
        @Override
        public java.lang.Long getMaximumFrameSize() {
            return _maximumFrameSize;
        }
        
        @Override
        public TpState getTpState() {
            return _tpState;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.L2TerminationPointAttributes>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_description);
            result = prime * result + Objects.hashCode(_l2TerminationPointType);
            result = prime * result + Objects.hashCode(_maximumFrameSize);
            result = prime * result + Objects.hashCode(_tpState);
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
            if (!ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.L2TerminationPointAttributes.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.L2TerminationPointAttributes other = (ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.L2TerminationPointAttributes)obj;
            if (!Objects.equals(_description, other.getDescription())) {
                return false;
            }
            if (!Objects.equals(_l2TerminationPointType, other.getL2TerminationPointType())) {
                return false;
            }
            if (!Objects.equals(_maximumFrameSize, other.getMaximumFrameSize())) {
                return false;
            }
            if (!Objects.equals(_tpState, other.getTpState())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                L2TerminationPointAttributesImpl otherImpl = (L2TerminationPointAttributesImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.L2TerminationPointAttributes>>, Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.L2TerminationPointAttributes>> e : augmentation.entrySet()) {
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
            java.lang.String name = "L2TerminationPointAttributes [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_description != null) {
                builder.append("_description=");
                builder.append(_description);
                builder.append(", ");
            }
            if (_l2TerminationPointType != null) {
                builder.append("_l2TerminationPointType=");
                builder.append(_l2TerminationPointType);
                builder.append(", ");
            }
            if (_maximumFrameSize != null) {
                builder.append("_maximumFrameSize=");
                builder.append(_maximumFrameSize);
                builder.append(", ");
            }
            if (_tpState != null) {
                builder.append("_tpState=");
                builder.append(_tpState);
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
