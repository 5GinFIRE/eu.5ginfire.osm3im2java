package ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.VnffgrOperationalStatus;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.Classifier;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.Rsp;

import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.Vnffgr} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.Vnffgr
 *
 */
public class VnffgrBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.Vnffgr> {

    private List<Classifier> _classifier;
    private java.lang.String _cloudAccount;
    private Uuid _id;
    private VnffgrKey _key;
    private VnffgrOperationalStatus _operationalStatus;
    private List<Rsp> _rsp;
    private java.lang.String _sdnAccount;
    private java.lang.Object _vnffgdIdRef;
    private java.lang.Object _vnffgdNameRef;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.Vnffgr>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.Vnffgr>> augmentation = Collections.emptyMap();

    public VnffgrBuilder() {
    }

    public VnffgrBuilder(Vnffgr base) {
        if (base.getKey() == null) {
            this._key = new VnffgrKey(
                base.getId()
            );
            this._id = base.getId();
        } else {
            this._key = base.getKey();
            this._id = _key.getId();
        }
        this._classifier = base.getClassifier();
        this._cloudAccount = base.getCloudAccount();
        this._operationalStatus = base.getOperationalStatus();
        this._rsp = base.getRsp();
        this._sdnAccount = base.getSdnAccount();
        this._vnffgdIdRef = base.getVnffgdIdRef();
        this._vnffgdNameRef = base.getVnffgdNameRef();
        if (base instanceof VnffgrImpl) {
            VnffgrImpl impl = (VnffgrImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.Vnffgr> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.Vnffgr>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public List<Classifier> getClassifier() {
        return _classifier;
    }
    
    public java.lang.String getCloudAccount() {
        return _cloudAccount;
    }
    
    public Uuid getId() {
        return _id;
    }
    
    public VnffgrKey getKey() {
        return _key;
    }
    
    public VnffgrOperationalStatus getOperationalStatus() {
        return _operationalStatus;
    }
    
    public List<Rsp> getRsp() {
        return _rsp;
    }
    
    public java.lang.String getSdnAccount() {
        return _sdnAccount;
    }
    
    public java.lang.Object getVnffgdIdRef() {
        return _vnffgdIdRef;
    }
    
    public java.lang.Object getVnffgdNameRef() {
        return _vnffgdNameRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.Vnffgr>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public VnffgrBuilder setClassifier(final List<Classifier> value) {
        this._classifier = value;
        return this;
    }
    
     
    public VnffgrBuilder setCloudAccount(final java.lang.String value) {
        this._cloudAccount = value;
        return this;
    }
    
     
    public VnffgrBuilder setId(final Uuid value) {
        this._id = value;
        return this;
    }
    
     
    public VnffgrBuilder setKey(final VnffgrKey value) {
        this._key = value;
        return this;
    }
    
     
    public VnffgrBuilder setOperationalStatus(final VnffgrOperationalStatus value) {
        this._operationalStatus = value;
        return this;
    }
    
     
    public VnffgrBuilder setRsp(final List<Rsp> value) {
        this._rsp = value;
        return this;
    }
    
     
    public VnffgrBuilder setSdnAccount(final java.lang.String value) {
        this._sdnAccount = value;
        return this;
    }
    
     
    public VnffgrBuilder setVnffgdIdRef(final java.lang.Object value) {
        this._vnffgdIdRef = value;
        return this;
    }
    
     
    public VnffgrBuilder setVnffgdNameRef(final java.lang.Object value) {
        this._vnffgdNameRef = value;
        return this;
    }
    
    public VnffgrBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.Vnffgr>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.Vnffgr> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VnffgrBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.Vnffgr>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Vnffgr build() {
        return new VnffgrImpl(this);
    }

    private static final class VnffgrImpl implements Vnffgr {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.Vnffgr> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.Vnffgr.class;
        }

        private final List<Classifier> _classifier;
        private final java.lang.String _cloudAccount;
        private final Uuid _id;
        private final VnffgrKey _key;
        private final VnffgrOperationalStatus _operationalStatus;
        private final List<Rsp> _rsp;
        private final java.lang.String _sdnAccount;
        private final java.lang.Object _vnffgdIdRef;
        private final java.lang.Object _vnffgdNameRef;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.Vnffgr>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.Vnffgr>> augmentation = Collections.emptyMap();

        private VnffgrImpl(VnffgrBuilder base) {
            if (base.getKey() == null) {
                this._key = new VnffgrKey(
                    base.getId()
                );
                this._id = base.getId();
            } else {
                this._key = base.getKey();
                this._id = _key.getId();
            }
            this._classifier = base.getClassifier();
            this._cloudAccount = base.getCloudAccount();
            this._operationalStatus = base.getOperationalStatus();
            this._rsp = base.getRsp();
            this._sdnAccount = base.getSdnAccount();
            this._vnffgdIdRef = base.getVnffgdIdRef();
            this._vnffgdNameRef = base.getVnffgdNameRef();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.Vnffgr>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.Vnffgr>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.Vnffgr>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.Vnffgr>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<Classifier> getClassifier() {
            return _classifier;
        }
        
        @Override
        public java.lang.String getCloudAccount() {
            return _cloudAccount;
        }
        
        @Override
        public Uuid getId() {
            return _id;
        }
        
        @Override
        public VnffgrKey getKey() {
            return _key;
        }
        
        @Override
        public VnffgrOperationalStatus getOperationalStatus() {
            return _operationalStatus;
        }
        
        @Override
        public List<Rsp> getRsp() {
            return _rsp;
        }
        
        @Override
        public java.lang.String getSdnAccount() {
            return _sdnAccount;
        }
        
        @Override
        public java.lang.Object getVnffgdIdRef() {
            return _vnffgdIdRef;
        }
        
        @Override
        public java.lang.Object getVnffgdNameRef() {
            return _vnffgdNameRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.Vnffgr>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_classifier);
            result = prime * result + Objects.hashCode(_cloudAccount);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_operationalStatus);
            result = prime * result + Objects.hashCode(_rsp);
            result = prime * result + Objects.hashCode(_sdnAccount);
            result = prime * result + Objects.hashCode(_vnffgdIdRef);
            result = prime * result + Objects.hashCode(_vnffgdNameRef);
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
            if (!ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.Vnffgr.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.Vnffgr other = (ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.Vnffgr)obj;
            if (!Objects.equals(_classifier, other.getClassifier())) {
                return false;
            }
            if (!Objects.equals(_cloudAccount, other.getCloudAccount())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_operationalStatus, other.getOperationalStatus())) {
                return false;
            }
            if (!Objects.equals(_rsp, other.getRsp())) {
                return false;
            }
            if (!Objects.equals(_sdnAccount, other.getSdnAccount())) {
                return false;
            }
            if (!Objects.equals(_vnffgdIdRef, other.getVnffgdIdRef())) {
                return false;
            }
            if (!Objects.equals(_vnffgdNameRef, other.getVnffgdNameRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VnffgrImpl otherImpl = (VnffgrImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.Vnffgr>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.Vnffgr>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Vnffgr [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_classifier != null) {
                builder.append("_classifier=");
                builder.append(_classifier);
                builder.append(", ");
            }
            if (_cloudAccount != null) {
                builder.append("_cloudAccount=");
                builder.append(_cloudAccount);
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
            if (_operationalStatus != null) {
                builder.append("_operationalStatus=");
                builder.append(_operationalStatus);
                builder.append(", ");
            }
            if (_rsp != null) {
                builder.append("_rsp=");
                builder.append(_rsp);
                builder.append(", ");
            }
            if (_sdnAccount != null) {
                builder.append("_sdnAccount=");
                builder.append(_sdnAccount);
                builder.append(", ");
            }
            if (_vnffgdIdRef != null) {
                builder.append("_vnffgdIdRef=");
                builder.append(_vnffgdIdRef);
                builder.append(", ");
            }
            if (_vnffgdNameRef != null) {
                builder.append("_vnffgdNameRef=");
                builder.append(_vnffgdNameRef);
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
