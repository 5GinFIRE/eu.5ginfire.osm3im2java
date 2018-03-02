package ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr;
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
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.Classifier} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.Classifier
 *
 */
public class ClassifierBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.Classifier> {

    private List<Uuid> _classifierId;
    private Uuid _id;
    private java.lang.String _ipAddress;
    private ClassifierKey _key;
    private java.lang.String _name;
    private java.lang.String _portId;
    private Uuid _rspIdRef;
    private java.lang.String _rspName;
    private java.lang.String _sffName;
    private java.lang.String _vmId;
    private java.lang.Object _vnfrConnectionPointRef;
    private java.lang.String _vnfrIdRef;
    private java.lang.String _vnfrNameRef;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.Classifier>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.Classifier>> augmentation = Collections.emptyMap();

    public ClassifierBuilder() {
    }

    public ClassifierBuilder(Classifier base) {
        if (base.getKey() == null) {
            this._key = new ClassifierKey(
                base.getId()
            );
            this._id = base.getId();
        } else {
            this._key = base.getKey();
            this._id = _key.getId();
        }
        this._classifierId = base.getClassifierId();
        this._ipAddress = base.getIpAddress();
        this._name = base.getName();
        this._portId = base.getPortId();
        this._rspIdRef = base.getRspIdRef();
        this._rspName = base.getRspName();
        this._sffName = base.getSffName();
        this._vmId = base.getVmId();
        this._vnfrConnectionPointRef = base.getVnfrConnectionPointRef();
        this._vnfrIdRef = base.getVnfrIdRef();
        this._vnfrNameRef = base.getVnfrNameRef();
        if (base instanceof ClassifierImpl) {
            ClassifierImpl impl = (ClassifierImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.Classifier> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.Classifier>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public List<Uuid> getClassifierId() {
        return _classifierId;
    }
    
    public Uuid getId() {
        return _id;
    }
    
    public java.lang.String getIpAddress() {
        return _ipAddress;
    }
    
    public ClassifierKey getKey() {
        return _key;
    }
    
    public java.lang.String getName() {
        return _name;
    }
    
    public java.lang.String getPortId() {
        return _portId;
    }
    
    public Uuid getRspIdRef() {
        return _rspIdRef;
    }
    
    public java.lang.String getRspName() {
        return _rspName;
    }
    
    public java.lang.String getSffName() {
        return _sffName;
    }
    
    public java.lang.String getVmId() {
        return _vmId;
    }
    
    public java.lang.Object getVnfrConnectionPointRef() {
        return _vnfrConnectionPointRef;
    }
    
    public java.lang.String getVnfrIdRef() {
        return _vnfrIdRef;
    }
    
    public java.lang.String getVnfrNameRef() {
        return _vnfrNameRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.Classifier>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public ClassifierBuilder setClassifierId(final List<Uuid> value) {
        this._classifierId = value;
        return this;
    }
    
     
    public ClassifierBuilder setId(final Uuid value) {
        this._id = value;
        return this;
    }
    
     
    public ClassifierBuilder setIpAddress(final java.lang.String value) {
        this._ipAddress = value;
        return this;
    }
    
     
    public ClassifierBuilder setKey(final ClassifierKey value) {
        this._key = value;
        return this;
    }
    
     
    public ClassifierBuilder setName(final java.lang.String value) {
        this._name = value;
        return this;
    }
    
     
    public ClassifierBuilder setPortId(final java.lang.String value) {
        this._portId = value;
        return this;
    }
    
     
    public ClassifierBuilder setRspIdRef(final Uuid value) {
        this._rspIdRef = value;
        return this;
    }
    
     
    public ClassifierBuilder setRspName(final java.lang.String value) {
        this._rspName = value;
        return this;
    }
    
     
    public ClassifierBuilder setSffName(final java.lang.String value) {
        this._sffName = value;
        return this;
    }
    
     
    public ClassifierBuilder setVmId(final java.lang.String value) {
        this._vmId = value;
        return this;
    }
    
     
    public ClassifierBuilder setVnfrConnectionPointRef(final java.lang.Object value) {
        this._vnfrConnectionPointRef = value;
        return this;
    }
    
     
    public ClassifierBuilder setVnfrIdRef(final java.lang.String value) {
        this._vnfrIdRef = value;
        return this;
    }
    
     
    public ClassifierBuilder setVnfrNameRef(final java.lang.String value) {
        this._vnfrNameRef = value;
        return this;
    }
    
    public ClassifierBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.Classifier>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.Classifier> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ClassifierBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.Classifier>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Classifier build() {
        return new ClassifierImpl(this);
    }

    private static final class ClassifierImpl implements Classifier {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.Classifier> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.Classifier.class;
        }

        private final List<Uuid> _classifierId;
        private final Uuid _id;
        private final java.lang.String _ipAddress;
        private final ClassifierKey _key;
        private final java.lang.String _name;
        private final java.lang.String _portId;
        private final Uuid _rspIdRef;
        private final java.lang.String _rspName;
        private final java.lang.String _sffName;
        private final java.lang.String _vmId;
        private final java.lang.Object _vnfrConnectionPointRef;
        private final java.lang.String _vnfrIdRef;
        private final java.lang.String _vnfrNameRef;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.Classifier>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.Classifier>> augmentation = Collections.emptyMap();

        private ClassifierImpl(ClassifierBuilder base) {
            if (base.getKey() == null) {
                this._key = new ClassifierKey(
                    base.getId()
                );
                this._id = base.getId();
            } else {
                this._key = base.getKey();
                this._id = _key.getId();
            }
            this._classifierId = base.getClassifierId();
            this._ipAddress = base.getIpAddress();
            this._name = base.getName();
            this._portId = base.getPortId();
            this._rspIdRef = base.getRspIdRef();
            this._rspName = base.getRspName();
            this._sffName = base.getSffName();
            this._vmId = base.getVmId();
            this._vnfrConnectionPointRef = base.getVnfrConnectionPointRef();
            this._vnfrIdRef = base.getVnfrIdRef();
            this._vnfrNameRef = base.getVnfrNameRef();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.Classifier>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.Classifier>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.Classifier>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.Classifier>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<Uuid> getClassifierId() {
            return _classifierId;
        }
        
        @Override
        public Uuid getId() {
            return _id;
        }
        
        @Override
        public java.lang.String getIpAddress() {
            return _ipAddress;
        }
        
        @Override
        public ClassifierKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.String getName() {
            return _name;
        }
        
        @Override
        public java.lang.String getPortId() {
            return _portId;
        }
        
        @Override
        public Uuid getRspIdRef() {
            return _rspIdRef;
        }
        
        @Override
        public java.lang.String getRspName() {
            return _rspName;
        }
        
        @Override
        public java.lang.String getSffName() {
            return _sffName;
        }
        
        @Override
        public java.lang.String getVmId() {
            return _vmId;
        }
        
        @Override
        public java.lang.Object getVnfrConnectionPointRef() {
            return _vnfrConnectionPointRef;
        }
        
        @Override
        public java.lang.String getVnfrIdRef() {
            return _vnfrIdRef;
        }
        
        @Override
        public java.lang.String getVnfrNameRef() {
            return _vnfrNameRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.Classifier>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_classifierId);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_ipAddress);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_portId);
            result = prime * result + Objects.hashCode(_rspIdRef);
            result = prime * result + Objects.hashCode(_rspName);
            result = prime * result + Objects.hashCode(_sffName);
            result = prime * result + Objects.hashCode(_vmId);
            result = prime * result + Objects.hashCode(_vnfrConnectionPointRef);
            result = prime * result + Objects.hashCode(_vnfrIdRef);
            result = prime * result + Objects.hashCode(_vnfrNameRef);
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
            if (!ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.Classifier.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.Classifier other = (ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.Classifier)obj;
            if (!Objects.equals(_classifierId, other.getClassifierId())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_ipAddress, other.getIpAddress())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_portId, other.getPortId())) {
                return false;
            }
            if (!Objects.equals(_rspIdRef, other.getRspIdRef())) {
                return false;
            }
            if (!Objects.equals(_rspName, other.getRspName())) {
                return false;
            }
            if (!Objects.equals(_sffName, other.getSffName())) {
                return false;
            }
            if (!Objects.equals(_vmId, other.getVmId())) {
                return false;
            }
            if (!Objects.equals(_vnfrConnectionPointRef, other.getVnfrConnectionPointRef())) {
                return false;
            }
            if (!Objects.equals(_vnfrIdRef, other.getVnfrIdRef())) {
                return false;
            }
            if (!Objects.equals(_vnfrNameRef, other.getVnfrNameRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ClassifierImpl otherImpl = (ClassifierImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.Classifier>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.Classifier>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Classifier [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_classifierId != null) {
                builder.append("_classifierId=");
                builder.append(_classifierId);
                builder.append(", ");
            }
            if (_id != null) {
                builder.append("_id=");
                builder.append(_id);
                builder.append(", ");
            }
            if (_ipAddress != null) {
                builder.append("_ipAddress=");
                builder.append(_ipAddress);
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
            if (_portId != null) {
                builder.append("_portId=");
                builder.append(_portId);
                builder.append(", ");
            }
            if (_rspIdRef != null) {
                builder.append("_rspIdRef=");
                builder.append(_rspIdRef);
                builder.append(", ");
            }
            if (_rspName != null) {
                builder.append("_rspName=");
                builder.append(_rspName);
                builder.append(", ");
            }
            if (_sffName != null) {
                builder.append("_sffName=");
                builder.append(_sffName);
                builder.append(", ");
            }
            if (_vmId != null) {
                builder.append("_vmId=");
                builder.append(_vmId);
                builder.append(", ");
            }
            if (_vnfrConnectionPointRef != null) {
                builder.append("_vnfrConnectionPointRef=");
                builder.append(_vnfrConnectionPointRef);
                builder.append(", ");
            }
            if (_vnfrIdRef != null) {
                builder.append("_vnfrIdRef=");
                builder.append(_vnfrIdRef);
                builder.append(", ");
            }
            if (_vnfrNameRef != null) {
                builder.append("_vnfrNameRef=");
                builder.append(_vnfrNameRef);
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
