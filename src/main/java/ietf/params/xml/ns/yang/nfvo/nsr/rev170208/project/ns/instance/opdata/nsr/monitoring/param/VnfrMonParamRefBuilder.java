package ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.monitoring.param;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.monitoring.param.VnfrMonParamRef} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.monitoring.param.VnfrMonParamRef
 *
 */
public class VnfrMonParamRefBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.monitoring.param.VnfrMonParamRef> {

    private VnfrMonParamRefKey _key;
    private Uuid _vnfrIdRef;
    private java.lang.Object _vnfrMonParamRef;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.monitoring.param.VnfrMonParamRef>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.monitoring.param.VnfrMonParamRef>> augmentation = Collections.emptyMap();

    public VnfrMonParamRefBuilder() {
    }

    public VnfrMonParamRefBuilder(VnfrMonParamRef base) {
        if (base.getKey() == null) {
            this._key = new VnfrMonParamRefKey(
                base.getVnfrIdRef(), 
                base.getVnfrMonParamRef()
            );
            this._vnfrIdRef = base.getVnfrIdRef();
            this._vnfrMonParamRef = base.getVnfrMonParamRef();
        } else {
            this._key = base.getKey();
            this._vnfrIdRef = _key.getVnfrIdRef();
            this._vnfrMonParamRef = _key.getVnfrMonParamRef();
        }
        if (base instanceof VnfrMonParamRefImpl) {
            VnfrMonParamRefImpl impl = (VnfrMonParamRefImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.monitoring.param.VnfrMonParamRef> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.monitoring.param.VnfrMonParamRef>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public VnfrMonParamRefKey getKey() {
        return _key;
    }
    
    public Uuid getVnfrIdRef() {
        return _vnfrIdRef;
    }
    
    public java.lang.Object getVnfrMonParamRef() {
        return _vnfrMonParamRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.monitoring.param.VnfrMonParamRef>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public VnfrMonParamRefBuilder setKey(final VnfrMonParamRefKey value) {
        this._key = value;
        return this;
    }
    
     
    public VnfrMonParamRefBuilder setVnfrIdRef(final Uuid value) {
        this._vnfrIdRef = value;
        return this;
    }
    
     
    public VnfrMonParamRefBuilder setVnfrMonParamRef(final java.lang.Object value) {
        this._vnfrMonParamRef = value;
        return this;
    }
    
    public VnfrMonParamRefBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.monitoring.param.VnfrMonParamRef>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.monitoring.param.VnfrMonParamRef> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VnfrMonParamRefBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.monitoring.param.VnfrMonParamRef>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public VnfrMonParamRef build() {
        return new VnfrMonParamRefImpl(this);
    }

    private static final class VnfrMonParamRefImpl implements VnfrMonParamRef {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.monitoring.param.VnfrMonParamRef> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.monitoring.param.VnfrMonParamRef.class;
        }

        private final VnfrMonParamRefKey _key;
        private final Uuid _vnfrIdRef;
        private final java.lang.Object _vnfrMonParamRef;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.monitoring.param.VnfrMonParamRef>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.monitoring.param.VnfrMonParamRef>> augmentation = Collections.emptyMap();

        private VnfrMonParamRefImpl(VnfrMonParamRefBuilder base) {
            if (base.getKey() == null) {
                this._key = new VnfrMonParamRefKey(
                    base.getVnfrIdRef(), 
                    base.getVnfrMonParamRef()
                );
                this._vnfrIdRef = base.getVnfrIdRef();
                this._vnfrMonParamRef = base.getVnfrMonParamRef();
            } else {
                this._key = base.getKey();
                this._vnfrIdRef = _key.getVnfrIdRef();
                this._vnfrMonParamRef = _key.getVnfrMonParamRef();
            }
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.monitoring.param.VnfrMonParamRef>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.monitoring.param.VnfrMonParamRef>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.monitoring.param.VnfrMonParamRef>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.monitoring.param.VnfrMonParamRef>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public VnfrMonParamRefKey getKey() {
            return _key;
        }
        
        @Override
        public Uuid getVnfrIdRef() {
            return _vnfrIdRef;
        }
        
        @Override
        public java.lang.Object getVnfrMonParamRef() {
            return _vnfrMonParamRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.monitoring.param.VnfrMonParamRef>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_vnfrIdRef);
            result = prime * result + Objects.hashCode(_vnfrMonParamRef);
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
            if (!ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.monitoring.param.VnfrMonParamRef.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.monitoring.param.VnfrMonParamRef other = (ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.monitoring.param.VnfrMonParamRef)obj;
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_vnfrIdRef, other.getVnfrIdRef())) {
                return false;
            }
            if (!Objects.equals(_vnfrMonParamRef, other.getVnfrMonParamRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VnfrMonParamRefImpl otherImpl = (VnfrMonParamRefImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.monitoring.param.VnfrMonParamRef>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.monitoring.param.VnfrMonParamRef>> e : augmentation.entrySet()) {
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
            java.lang.String name = "VnfrMonParamRef [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_vnfrIdRef != null) {
                builder.append("_vnfrIdRef=");
                builder.append(_vnfrIdRef);
                builder.append(", ");
            }
            if (_vnfrMonParamRef != null) {
                builder.append("_vnfrMonParamRef=");
                builder.append(_vnfrMonParamRef);
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
