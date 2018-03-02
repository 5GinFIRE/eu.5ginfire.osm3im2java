package ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.monitoring.param.monitoring.param;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.monitoring.param.monitoring.param.VnfdMonitoringParam} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.monitoring.param.monitoring.param.VnfdMonitoringParam
 *
 */
public class VnfdMonitoringParamBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.monitoring.param.monitoring.param.VnfdMonitoringParam> {

    private VnfdMonitoringParamKey _key;
    private java.lang.String _memberVnfIndexRef;
    private java.lang.Object _vnfdIdRef;
    private java.lang.Object _vnfdMonitoringParamRef;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.monitoring.param.monitoring.param.VnfdMonitoringParam>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.monitoring.param.monitoring.param.VnfdMonitoringParam>> augmentation = Collections.emptyMap();

    public VnfdMonitoringParamBuilder() {
    }

    public VnfdMonitoringParamBuilder(VnfdMonitoringParam base) {
        if (base.getKey() == null) {
            this._key = new VnfdMonitoringParamKey(
                base.getMemberVnfIndexRef(), 
                base.getVnfdMonitoringParamRef()
            );
            this._memberVnfIndexRef = base.getMemberVnfIndexRef();
            this._vnfdMonitoringParamRef = base.getVnfdMonitoringParamRef();
        } else {
            this._key = base.getKey();
            this._memberVnfIndexRef = _key.getMemberVnfIndexRef();
            this._vnfdMonitoringParamRef = _key.getVnfdMonitoringParamRef();
        }
        this._vnfdIdRef = base.getVnfdIdRef();
        if (base instanceof VnfdMonitoringParamImpl) {
            VnfdMonitoringParamImpl impl = (VnfdMonitoringParamImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.monitoring.param.monitoring.param.VnfdMonitoringParam> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.monitoring.param.monitoring.param.VnfdMonitoringParam>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public VnfdMonitoringParamKey getKey() {
        return _key;
    }
    
    public java.lang.String getMemberVnfIndexRef() {
        return _memberVnfIndexRef;
    }
    
    public java.lang.Object getVnfdIdRef() {
        return _vnfdIdRef;
    }
    
    public java.lang.Object getVnfdMonitoringParamRef() {
        return _vnfdMonitoringParamRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.monitoring.param.monitoring.param.VnfdMonitoringParam>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public VnfdMonitoringParamBuilder setKey(final VnfdMonitoringParamKey value) {
        this._key = value;
        return this;
    }
    
     
    public VnfdMonitoringParamBuilder setMemberVnfIndexRef(final java.lang.String value) {
        this._memberVnfIndexRef = value;
        return this;
    }
    
     
    public VnfdMonitoringParamBuilder setVnfdIdRef(final java.lang.Object value) {
        this._vnfdIdRef = value;
        return this;
    }
    
     
    public VnfdMonitoringParamBuilder setVnfdMonitoringParamRef(final java.lang.Object value) {
        this._vnfdMonitoringParamRef = value;
        return this;
    }
    
    public VnfdMonitoringParamBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.monitoring.param.monitoring.param.VnfdMonitoringParam>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.monitoring.param.monitoring.param.VnfdMonitoringParam> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VnfdMonitoringParamBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.monitoring.param.monitoring.param.VnfdMonitoringParam>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public VnfdMonitoringParam build() {
        return new VnfdMonitoringParamImpl(this);
    }

    private static final class VnfdMonitoringParamImpl implements VnfdMonitoringParam {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.monitoring.param.monitoring.param.VnfdMonitoringParam> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.monitoring.param.monitoring.param.VnfdMonitoringParam.class;
        }

        private final VnfdMonitoringParamKey _key;
        private final java.lang.String _memberVnfIndexRef;
        private final java.lang.Object _vnfdIdRef;
        private final java.lang.Object _vnfdMonitoringParamRef;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.monitoring.param.monitoring.param.VnfdMonitoringParam>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.monitoring.param.monitoring.param.VnfdMonitoringParam>> augmentation = Collections.emptyMap();

        private VnfdMonitoringParamImpl(VnfdMonitoringParamBuilder base) {
            if (base.getKey() == null) {
                this._key = new VnfdMonitoringParamKey(
                    base.getMemberVnfIndexRef(), 
                    base.getVnfdMonitoringParamRef()
                );
                this._memberVnfIndexRef = base.getMemberVnfIndexRef();
                this._vnfdMonitoringParamRef = base.getVnfdMonitoringParamRef();
            } else {
                this._key = base.getKey();
                this._memberVnfIndexRef = _key.getMemberVnfIndexRef();
                this._vnfdMonitoringParamRef = _key.getVnfdMonitoringParamRef();
            }
            this._vnfdIdRef = base.getVnfdIdRef();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.monitoring.param.monitoring.param.VnfdMonitoringParam>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.monitoring.param.monitoring.param.VnfdMonitoringParam>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.monitoring.param.monitoring.param.VnfdMonitoringParam>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.monitoring.param.monitoring.param.VnfdMonitoringParam>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public VnfdMonitoringParamKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.String getMemberVnfIndexRef() {
            return _memberVnfIndexRef;
        }
        
        @Override
        public java.lang.Object getVnfdIdRef() {
            return _vnfdIdRef;
        }
        
        @Override
        public java.lang.Object getVnfdMonitoringParamRef() {
            return _vnfdMonitoringParamRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.monitoring.param.monitoring.param.VnfdMonitoringParam>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_memberVnfIndexRef);
            result = prime * result + Objects.hashCode(_vnfdIdRef);
            result = prime * result + Objects.hashCode(_vnfdMonitoringParamRef);
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
            if (!ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.monitoring.param.monitoring.param.VnfdMonitoringParam.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.monitoring.param.monitoring.param.VnfdMonitoringParam other = (ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.monitoring.param.monitoring.param.VnfdMonitoringParam)obj;
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_memberVnfIndexRef, other.getMemberVnfIndexRef())) {
                return false;
            }
            if (!Objects.equals(_vnfdIdRef, other.getVnfdIdRef())) {
                return false;
            }
            if (!Objects.equals(_vnfdMonitoringParamRef, other.getVnfdMonitoringParamRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VnfdMonitoringParamImpl otherImpl = (VnfdMonitoringParamImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.monitoring.param.monitoring.param.VnfdMonitoringParam>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.monitoring.param.monitoring.param.VnfdMonitoringParam>> e : augmentation.entrySet()) {
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
            java.lang.String name = "VnfdMonitoringParam [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_memberVnfIndexRef != null) {
                builder.append("_memberVnfIndexRef=");
                builder.append(_memberVnfIndexRef);
                builder.append(", ");
            }
            if (_vnfdIdRef != null) {
                builder.append("_vnfdIdRef=");
                builder.append(_vnfdIdRef);
                builder.append(", ");
            }
            if (_vnfdMonitoringParamRef != null) {
                builder.append("_vnfdMonitoringParamRef=");
                builder.append(_vnfdMonitoringParamRef);
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
