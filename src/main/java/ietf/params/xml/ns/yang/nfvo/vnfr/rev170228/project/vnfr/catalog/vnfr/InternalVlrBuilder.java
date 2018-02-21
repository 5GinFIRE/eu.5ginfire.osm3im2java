package ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.InternalVlr} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.InternalVlr
 *
 */
public class InternalVlrBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.InternalVlr> {

    private List<java.lang.String> _internalConnectionPointRef;
    private InternalVlrKey _key;
    private Uuid _vlrRef;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.InternalVlr>>, Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.InternalVlr>> augmentation = Collections.emptyMap();

    public InternalVlrBuilder() {
    }

    public InternalVlrBuilder(InternalVlr base) {
        if (base.getKey() == null) {
            this._key = new InternalVlrKey(
                base.getVlrRef()
            );
            this._vlrRef = base.getVlrRef();
        } else {
            this._key = base.getKey();
            this._vlrRef = _key.getVlrRef();
        }
        this._internalConnectionPointRef = base.getInternalConnectionPointRef();
        if (base instanceof InternalVlrImpl) {
            InternalVlrImpl impl = (InternalVlrImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.InternalVlr> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.InternalVlr>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public List<java.lang.String> getInternalConnectionPointRef() {
        return _internalConnectionPointRef;
    }
    
    public InternalVlrKey getKey() {
        return _key;
    }
    
    public Uuid getVlrRef() {
        return _vlrRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.InternalVlr>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public InternalVlrBuilder setInternalConnectionPointRef(final List<java.lang.String> value) {
        this._internalConnectionPointRef = value;
        return this;
    }
    
     
    public InternalVlrBuilder setKey(final InternalVlrKey value) {
        this._key = value;
        return this;
    }
    
     
    public InternalVlrBuilder setVlrRef(final Uuid value) {
        this._vlrRef = value;
        return this;
    }
    
    public InternalVlrBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.InternalVlr>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.InternalVlr> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public InternalVlrBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.InternalVlr>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public InternalVlr build() {
        return new InternalVlrImpl(this);
    }

    private static final class InternalVlrImpl implements InternalVlr {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.InternalVlr> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.InternalVlr.class;
        }

        private final List<java.lang.String> _internalConnectionPointRef;
        private final InternalVlrKey _key;
        private final Uuid _vlrRef;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.InternalVlr>>, Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.InternalVlr>> augmentation = Collections.emptyMap();

        private InternalVlrImpl(InternalVlrBuilder base) {
            if (base.getKey() == null) {
                this._key = new InternalVlrKey(
                    base.getVlrRef()
                );
                this._vlrRef = base.getVlrRef();
            } else {
                this._key = base.getKey();
                this._vlrRef = _key.getVlrRef();
            }
            this._internalConnectionPointRef = base.getInternalConnectionPointRef();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.InternalVlr>>, Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.InternalVlr>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.InternalVlr>>, Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.InternalVlr>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<java.lang.String> getInternalConnectionPointRef() {
            return _internalConnectionPointRef;
        }
        
        @Override
        public InternalVlrKey getKey() {
            return _key;
        }
        
        @Override
        public Uuid getVlrRef() {
            return _vlrRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.InternalVlr>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_internalConnectionPointRef);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_vlrRef);
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
            if (!ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.InternalVlr.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.InternalVlr other = (ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.InternalVlr)obj;
            if (!Objects.equals(_internalConnectionPointRef, other.getInternalConnectionPointRef())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_vlrRef, other.getVlrRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                InternalVlrImpl otherImpl = (InternalVlrImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.InternalVlr>>, Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.InternalVlr>> e : augmentation.entrySet()) {
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
            java.lang.String name = "InternalVlr [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_internalConnectionPointRef != null) {
                builder.append("_internalConnectionPointRef=");
                builder.append(_internalConnectionPointRef);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_vlrRef != null) {
                builder.append("_vlrRef=");
                builder.append(_vlrRef);
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
