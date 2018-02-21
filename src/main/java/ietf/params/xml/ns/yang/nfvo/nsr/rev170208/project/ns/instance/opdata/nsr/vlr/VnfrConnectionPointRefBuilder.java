package ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.vlr;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.vlr.VnfrConnectionPointRef} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.vlr.VnfrConnectionPointRef
 *
 */
public class VnfrConnectionPointRefBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.vlr.VnfrConnectionPointRef> {

    private java.lang.Object _connectionPoint;
    private VnfrConnectionPointRefKey _key;
    private java.lang.String _vnfrId;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.vlr.VnfrConnectionPointRef>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.vlr.VnfrConnectionPointRef>> augmentation = Collections.emptyMap();

    public VnfrConnectionPointRefBuilder() {
    }

    public VnfrConnectionPointRefBuilder(VnfrConnectionPointRef base) {
        if (base.getKey() == null) {
            this._key = new VnfrConnectionPointRefKey(
                base.getVnfrId()
            );
            this._vnfrId = base.getVnfrId();
        } else {
            this._key = base.getKey();
            this._vnfrId = _key.getVnfrId();
        }
        this._connectionPoint = base.getConnectionPoint();
        if (base instanceof VnfrConnectionPointRefImpl) {
            VnfrConnectionPointRefImpl impl = (VnfrConnectionPointRefImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.vlr.VnfrConnectionPointRef> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.vlr.VnfrConnectionPointRef>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public java.lang.Object getConnectionPoint() {
        return _connectionPoint;
    }
    
    public VnfrConnectionPointRefKey getKey() {
        return _key;
    }
    
    public java.lang.String getVnfrId() {
        return _vnfrId;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.vlr.VnfrConnectionPointRef>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public VnfrConnectionPointRefBuilder setConnectionPoint(final java.lang.Object value) {
        this._connectionPoint = value;
        return this;
    }
    
     
    public VnfrConnectionPointRefBuilder setKey(final VnfrConnectionPointRefKey value) {
        this._key = value;
        return this;
    }
    
     
    public VnfrConnectionPointRefBuilder setVnfrId(final java.lang.String value) {
        this._vnfrId = value;
        return this;
    }
    
    public VnfrConnectionPointRefBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.vlr.VnfrConnectionPointRef>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.vlr.VnfrConnectionPointRef> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VnfrConnectionPointRefBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.vlr.VnfrConnectionPointRef>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public VnfrConnectionPointRef build() {
        return new VnfrConnectionPointRefImpl(this);
    }

    private static final class VnfrConnectionPointRefImpl implements VnfrConnectionPointRef {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.vlr.VnfrConnectionPointRef> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.vlr.VnfrConnectionPointRef.class;
        }

        private final java.lang.Object _connectionPoint;
        private final VnfrConnectionPointRefKey _key;
        private final java.lang.String _vnfrId;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.vlr.VnfrConnectionPointRef>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.vlr.VnfrConnectionPointRef>> augmentation = Collections.emptyMap();

        private VnfrConnectionPointRefImpl(VnfrConnectionPointRefBuilder base) {
            if (base.getKey() == null) {
                this._key = new VnfrConnectionPointRefKey(
                    base.getVnfrId()
                );
                this._vnfrId = base.getVnfrId();
            } else {
                this._key = base.getKey();
                this._vnfrId = _key.getVnfrId();
            }
            this._connectionPoint = base.getConnectionPoint();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.vlr.VnfrConnectionPointRef>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.vlr.VnfrConnectionPointRef>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.vlr.VnfrConnectionPointRef>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.vlr.VnfrConnectionPointRef>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Object getConnectionPoint() {
            return _connectionPoint;
        }
        
        @Override
        public VnfrConnectionPointRefKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.String getVnfrId() {
            return _vnfrId;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.vlr.VnfrConnectionPointRef>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_connectionPoint);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_vnfrId);
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
            if (!ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.vlr.VnfrConnectionPointRef.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.vlr.VnfrConnectionPointRef other = (ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.vlr.VnfrConnectionPointRef)obj;
            if (!Objects.equals(_connectionPoint, other.getConnectionPoint())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_vnfrId, other.getVnfrId())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VnfrConnectionPointRefImpl otherImpl = (VnfrConnectionPointRefImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.vlr.VnfrConnectionPointRef>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.vlr.VnfrConnectionPointRef>> e : augmentation.entrySet()) {
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
            java.lang.String name = "VnfrConnectionPointRef [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_connectionPoint != null) {
                builder.append("_connectionPoint=");
                builder.append(_connectionPoint);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_vnfrId != null) {
                builder.append("_vnfrId=");
                builder.append(_vnfrId);
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
