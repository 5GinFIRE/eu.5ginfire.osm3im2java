package network.topology.rev131021.network.topology.topology.node;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import network.topology.rev131021.TpId;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link network.topology.rev131021.network.topology.topology.node.TerminationPoint} instances.
 * 
 * @see network.topology.rev131021.network.topology.topology.node.TerminationPoint
 *
 */
public class TerminationPointBuilder implements Builder<network.topology.rev131021.network.topology.topology.node.TerminationPoint> {

    private TerminationPointKey _key;
    private TpId _tpId;
    private List<TpId> _tpRef;

    Map<java.lang.Class<? extends Augmentation<network.topology.rev131021.network.topology.topology.node.TerminationPoint>>, Augmentation<network.topology.rev131021.network.topology.topology.node.TerminationPoint>> augmentation = Collections.emptyMap();

    public TerminationPointBuilder() {
    }
    public TerminationPointBuilder(network.topology.rev131021.TpAttributes arg) {
        this._tpId = arg.getTpId();
        this._tpRef = arg.getTpRef();
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
        this._tpRef = base.getTpRef();
        if (base instanceof TerminationPointImpl) {
            TerminationPointImpl impl = (TerminationPointImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<network.topology.rev131021.network.topology.topology.node.TerminationPoint> casted =(AugmentationHolder<network.topology.rev131021.network.topology.topology.node.TerminationPoint>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.TpAttributes</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof network.topology.rev131021.TpAttributes) {
            this._tpId = ((network.topology.rev131021.TpAttributes)arg).getTpId();
            this._tpRef = ((network.topology.rev131021.TpAttributes)arg).getTpRef();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.TpAttributes] \n" +
              "but was: " + arg
            );
        }
    }

    public TerminationPointKey getKey() {
        return _key;
    }
    
    public TpId getTpId() {
        return _tpId;
    }
    
    public List<TpId> getTpRef() {
        return _tpRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<network.topology.rev131021.network.topology.topology.node.TerminationPoint>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public TerminationPointBuilder setKey(final TerminationPointKey value) {
        this._key = value;
        return this;
    }
    
     
    public TerminationPointBuilder setTpId(final TpId value) {
        this._tpId = value;
        return this;
    }
    
     
    public TerminationPointBuilder setTpRef(final List<TpId> value) {
        this._tpRef = value;
        return this;
    }
    
    public TerminationPointBuilder addAugmentation(java.lang.Class<? extends Augmentation<network.topology.rev131021.network.topology.topology.node.TerminationPoint>> augmentationType, Augmentation<network.topology.rev131021.network.topology.topology.node.TerminationPoint> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public TerminationPointBuilder removeAugmentation(java.lang.Class<? extends Augmentation<network.topology.rev131021.network.topology.topology.node.TerminationPoint>> augmentationType) {
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
        public java.lang.Class<network.topology.rev131021.network.topology.topology.node.TerminationPoint> getImplementedInterface() {
            return network.topology.rev131021.network.topology.topology.node.TerminationPoint.class;
        }

        private final TerminationPointKey _key;
        private final TpId _tpId;
        private final List<TpId> _tpRef;

        private Map<java.lang.Class<? extends Augmentation<network.topology.rev131021.network.topology.topology.node.TerminationPoint>>, Augmentation<network.topology.rev131021.network.topology.topology.node.TerminationPoint>> augmentation = Collections.emptyMap();

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
            this._tpRef = base.getTpRef();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<network.topology.rev131021.network.topology.topology.node.TerminationPoint>>, Augmentation<network.topology.rev131021.network.topology.topology.node.TerminationPoint>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<network.topology.rev131021.network.topology.topology.node.TerminationPoint>>, Augmentation<network.topology.rev131021.network.topology.topology.node.TerminationPoint>>singletonMap(e.getKey(), e.getValue());
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
        public TpId getTpId() {
            return _tpId;
        }
        
        @Override
        public List<TpId> getTpRef() {
            return _tpRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<network.topology.rev131021.network.topology.topology.node.TerminationPoint>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_tpId);
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
            if (!network.topology.rev131021.network.topology.topology.node.TerminationPoint.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            network.topology.rev131021.network.topology.topology.node.TerminationPoint other = (network.topology.rev131021.network.topology.topology.node.TerminationPoint)obj;
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_tpId, other.getTpId())) {
                return false;
            }
            if (!Objects.equals(_tpRef, other.getTpRef())) {
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
                for (Map.Entry<java.lang.Class<? extends Augmentation<network.topology.rev131021.network.topology.topology.node.TerminationPoint>>, Augmentation<network.topology.rev131021.network.topology.topology.node.TerminationPoint>> e : augmentation.entrySet()) {
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
            if (_tpId != null) {
                builder.append("_tpId=");
                builder.append(_tpId);
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
