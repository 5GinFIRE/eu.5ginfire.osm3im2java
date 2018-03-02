package ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.link.attributes;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;
import java.math.BigDecimal;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.link.attributes.L2LinkAttributes} instances.
 * 
 * @see ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.link.attributes.L2LinkAttributes
 *
 */
public class L2LinkAttributesBuilder implements Builder<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.link.attributes.L2LinkAttributes> {

    private java.lang.Long _delay;
    private List<java.lang.Class<? extends ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.FlagIdentity>> _flag;
    private java.lang.String _name;
    private BigDecimal _rate;
    private List<java.lang.Long> _srlg;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.link.attributes.L2LinkAttributes>>, Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.link.attributes.L2LinkAttributes>> augmentation = Collections.emptyMap();

    public L2LinkAttributesBuilder() {
    }

    public L2LinkAttributesBuilder(L2LinkAttributes base) {
        this._delay = base.getDelay();
        this._flag = base.getFlag();
        this._name = base.getName();
        this._rate = base.getRate();
        this._srlg = base.getSrlg();
        if (base instanceof L2LinkAttributesImpl) {
            L2LinkAttributesImpl impl = (L2LinkAttributesImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.link.attributes.L2LinkAttributes> casted =(AugmentationHolder<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.link.attributes.L2LinkAttributes>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public java.lang.Long getDelay() {
        return _delay;
    }
    
    public List<java.lang.Class<? extends ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.FlagIdentity>> getFlag() {
        return _flag;
    }
    
    public java.lang.String getName() {
        return _name;
    }
    
    public BigDecimal getRate() {
        return _rate;
    }
    
    public List<java.lang.Long> getSrlg() {
        return _srlg;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.link.attributes.L2LinkAttributes>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static void checkDelayRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..4294967295]].", value));
     }
    
    public L2LinkAttributesBuilder setDelay(final java.lang.Long value) {
    if (value != null) {
        checkDelayRange(value);
    }
        this._delay = value;
        return this;
    }
    
     
    public L2LinkAttributesBuilder setFlag(final List<java.lang.Class<? extends ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.FlagIdentity>> value) {
        this._flag = value;
        return this;
    }
    
     
    public L2LinkAttributesBuilder setName(final java.lang.String value) {
        this._name = value;
        return this;
    }
    
     
    public L2LinkAttributesBuilder setRate(final BigDecimal value) {
        this._rate = value;
        return this;
    }
    
     
    public L2LinkAttributesBuilder setSrlg(final List<java.lang.Long> value) {
        this._srlg = value;
        return this;
    }
    
    public L2LinkAttributesBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.link.attributes.L2LinkAttributes>> augmentationType, Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.link.attributes.L2LinkAttributes> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public L2LinkAttributesBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.link.attributes.L2LinkAttributes>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public L2LinkAttributes build() {
        return new L2LinkAttributesImpl(this);
    }

    private static final class L2LinkAttributesImpl implements L2LinkAttributes {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.link.attributes.L2LinkAttributes> getImplementedInterface() {
            return ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.link.attributes.L2LinkAttributes.class;
        }

        private final java.lang.Long _delay;
        private final List<java.lang.Class<? extends ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.FlagIdentity>> _flag;
        private final java.lang.String _name;
        private final BigDecimal _rate;
        private final List<java.lang.Long> _srlg;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.link.attributes.L2LinkAttributes>>, Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.link.attributes.L2LinkAttributes>> augmentation = Collections.emptyMap();

        private L2LinkAttributesImpl(L2LinkAttributesBuilder base) {
            this._delay = base.getDelay();
            this._flag = base.getFlag();
            this._name = base.getName();
            this._rate = base.getRate();
            this._srlg = base.getSrlg();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.link.attributes.L2LinkAttributes>>, Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.link.attributes.L2LinkAttributes>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.link.attributes.L2LinkAttributes>>, Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.link.attributes.L2LinkAttributes>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Long getDelay() {
            return _delay;
        }
        
        @Override
        public List<java.lang.Class<? extends ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.FlagIdentity>> getFlag() {
            return _flag;
        }
        
        @Override
        public java.lang.String getName() {
            return _name;
        }
        
        @Override
        public BigDecimal getRate() {
            return _rate;
        }
        
        @Override
        public List<java.lang.Long> getSrlg() {
            return _srlg;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.link.attributes.L2LinkAttributes>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_delay);
            result = prime * result + Objects.hashCode(_flag);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_rate);
            result = prime * result + Objects.hashCode(_srlg);
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
            if (!ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.link.attributes.L2LinkAttributes.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.link.attributes.L2LinkAttributes other = (ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.link.attributes.L2LinkAttributes)obj;
            if (!Objects.equals(_delay, other.getDelay())) {
                return false;
            }
            if (!Objects.equals(_flag, other.getFlag())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_rate, other.getRate())) {
                return false;
            }
            if (!Objects.equals(_srlg, other.getSrlg())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                L2LinkAttributesImpl otherImpl = (L2LinkAttributesImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.link.attributes.L2LinkAttributes>>, Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.link.attributes.L2LinkAttributes>> e : augmentation.entrySet()) {
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
            java.lang.String name = "L2LinkAttributes [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_delay != null) {
                builder.append("_delay=");
                builder.append(_delay);
                builder.append(", ");
            }
            if (_flag != null) {
                builder.append("_flag=");
                builder.append(_flag);
                builder.append(", ");
            }
            if (_name != null) {
                builder.append("_name=");
                builder.append(_name);
                builder.append(", ");
            }
            if (_rate != null) {
                builder.append("_rate=");
                builder.append(_rate);
                builder.append(", ");
            }
            if (_srlg != null) {
                builder.append("_srlg=");
                builder.append(_srlg);
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
