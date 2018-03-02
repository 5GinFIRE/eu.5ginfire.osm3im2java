package ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp.VnfrConnectionPointRef;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.Rsp} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.Rsp
 *
 */
public class RspBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.Rsp> {

    private java.lang.String _classifierName;
    private Uuid _id;
    private RspKey _key;
    private java.lang.String _name;
    private java.lang.Long _pathId;
    private Uuid _rspId;
    private java.lang.Object _vnffgdRspIdRef;
    private java.lang.Object _vnffgdRspNameRef;
    private List<VnfrConnectionPointRef> _vnfrConnectionPointRef;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.Rsp>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.Rsp>> augmentation = Collections.emptyMap();

    public RspBuilder() {
    }

    public RspBuilder(Rsp base) {
        if (base.getKey() == null) {
            this._key = new RspKey(
                base.getId()
            );
            this._id = base.getId();
        } else {
            this._key = base.getKey();
            this._id = _key.getId();
        }
        this._classifierName = base.getClassifierName();
        this._name = base.getName();
        this._pathId = base.getPathId();
        this._rspId = base.getRspId();
        this._vnffgdRspIdRef = base.getVnffgdRspIdRef();
        this._vnffgdRspNameRef = base.getVnffgdRspNameRef();
        this._vnfrConnectionPointRef = base.getVnfrConnectionPointRef();
        if (base instanceof RspImpl) {
            RspImpl impl = (RspImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.Rsp> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.Rsp>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public java.lang.String getClassifierName() {
        return _classifierName;
    }
    
    public Uuid getId() {
        return _id;
    }
    
    public RspKey getKey() {
        return _key;
    }
    
    public java.lang.String getName() {
        return _name;
    }
    
    public java.lang.Long getPathId() {
        return _pathId;
    }
    
    public Uuid getRspId() {
        return _rspId;
    }
    
    public java.lang.Object getVnffgdRspIdRef() {
        return _vnffgdRspIdRef;
    }
    
    public java.lang.Object getVnffgdRspNameRef() {
        return _vnffgdRspNameRef;
    }
    
    public List<VnfrConnectionPointRef> getVnfrConnectionPointRef() {
        return _vnfrConnectionPointRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.Rsp>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public RspBuilder setClassifierName(final java.lang.String value) {
        this._classifierName = value;
        return this;
    }
    
     
    public RspBuilder setId(final Uuid value) {
        this._id = value;
        return this;
    }
    
     
    public RspBuilder setKey(final RspKey value) {
        this._key = value;
        return this;
    }
    
     
    public RspBuilder setName(final java.lang.String value) {
        this._name = value;
        return this;
    }
    
     
     private static void checkPathIdRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..4294967295]].", value));
     }
    
    public RspBuilder setPathId(final java.lang.Long value) {
    if (value != null) {
        checkPathIdRange(value);
    }
        this._pathId = value;
        return this;
    }
    
     
    public RspBuilder setRspId(final Uuid value) {
        this._rspId = value;
        return this;
    }
    
     
    public RspBuilder setVnffgdRspIdRef(final java.lang.Object value) {
        this._vnffgdRspIdRef = value;
        return this;
    }
    
     
    public RspBuilder setVnffgdRspNameRef(final java.lang.Object value) {
        this._vnffgdRspNameRef = value;
        return this;
    }
    
     
    public RspBuilder setVnfrConnectionPointRef(final List<VnfrConnectionPointRef> value) {
        this._vnfrConnectionPointRef = value;
        return this;
    }
    
    public RspBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.Rsp>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.Rsp> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public RspBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.Rsp>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Rsp build() {
        return new RspImpl(this);
    }

    private static final class RspImpl implements Rsp {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.Rsp> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.Rsp.class;
        }

        private final java.lang.String _classifierName;
        private final Uuid _id;
        private final RspKey _key;
        private final java.lang.String _name;
        private final java.lang.Long _pathId;
        private final Uuid _rspId;
        private final java.lang.Object _vnffgdRspIdRef;
        private final java.lang.Object _vnffgdRspNameRef;
        private final List<VnfrConnectionPointRef> _vnfrConnectionPointRef;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.Rsp>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.Rsp>> augmentation = Collections.emptyMap();

        private RspImpl(RspBuilder base) {
            if (base.getKey() == null) {
                this._key = new RspKey(
                    base.getId()
                );
                this._id = base.getId();
            } else {
                this._key = base.getKey();
                this._id = _key.getId();
            }
            this._classifierName = base.getClassifierName();
            this._name = base.getName();
            this._pathId = base.getPathId();
            this._rspId = base.getRspId();
            this._vnffgdRspIdRef = base.getVnffgdRspIdRef();
            this._vnffgdRspNameRef = base.getVnffgdRspNameRef();
            this._vnfrConnectionPointRef = base.getVnfrConnectionPointRef();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.Rsp>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.Rsp>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.Rsp>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.Rsp>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getClassifierName() {
            return _classifierName;
        }
        
        @Override
        public Uuid getId() {
            return _id;
        }
        
        @Override
        public RspKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.String getName() {
            return _name;
        }
        
        @Override
        public java.lang.Long getPathId() {
            return _pathId;
        }
        
        @Override
        public Uuid getRspId() {
            return _rspId;
        }
        
        @Override
        public java.lang.Object getVnffgdRspIdRef() {
            return _vnffgdRspIdRef;
        }
        
        @Override
        public java.lang.Object getVnffgdRspNameRef() {
            return _vnffgdRspNameRef;
        }
        
        @Override
        public List<VnfrConnectionPointRef> getVnfrConnectionPointRef() {
            return _vnfrConnectionPointRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.Rsp>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_classifierName);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_pathId);
            result = prime * result + Objects.hashCode(_rspId);
            result = prime * result + Objects.hashCode(_vnffgdRspIdRef);
            result = prime * result + Objects.hashCode(_vnffgdRspNameRef);
            result = prime * result + Objects.hashCode(_vnfrConnectionPointRef);
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
            if (!ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.Rsp.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.Rsp other = (ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.Rsp)obj;
            if (!Objects.equals(_classifierName, other.getClassifierName())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_pathId, other.getPathId())) {
                return false;
            }
            if (!Objects.equals(_rspId, other.getRspId())) {
                return false;
            }
            if (!Objects.equals(_vnffgdRspIdRef, other.getVnffgdRspIdRef())) {
                return false;
            }
            if (!Objects.equals(_vnffgdRspNameRef, other.getVnffgdRspNameRef())) {
                return false;
            }
            if (!Objects.equals(_vnfrConnectionPointRef, other.getVnfrConnectionPointRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                RspImpl otherImpl = (RspImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.Rsp>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.Rsp>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Rsp [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_classifierName != null) {
                builder.append("_classifierName=");
                builder.append(_classifierName);
                builder.append(", ");
            }
            if (_id != null) {
                builder.append("_id=");
                builder.append(_id);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_name != null) {
                builder.append("_name=");
                builder.append(_name);
                builder.append(", ");
            }
            if (_pathId != null) {
                builder.append("_pathId=");
                builder.append(_pathId);
                builder.append(", ");
            }
            if (_rspId != null) {
                builder.append("_rspId=");
                builder.append(_rspId);
                builder.append(", ");
            }
            if (_vnffgdRspIdRef != null) {
                builder.append("_vnffgdRspIdRef=");
                builder.append(_vnffgdRspIdRef);
                builder.append(", ");
            }
            if (_vnffgdRspNameRef != null) {
                builder.append("_vnffgdRspNameRef=");
                builder.append(_vnffgdRspNameRef);
                builder.append(", ");
            }
            if (_vnfrConnectionPointRef != null) {
                builder.append("_vnfrConnectionPointRef=");
                builder.append(_vnfrConnectionPointRef);
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
