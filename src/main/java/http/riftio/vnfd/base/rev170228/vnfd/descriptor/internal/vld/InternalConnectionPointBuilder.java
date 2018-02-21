package http.riftio.vnfd.base.rev170228.vnfd.descriptor.internal.vld;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link http.riftio.vnfd.base.rev170228.vnfd.descriptor.internal.vld.InternalConnectionPoint} instances.
 * 
 * @see http.riftio.vnfd.base.rev170228.vnfd.descriptor.internal.vld.InternalConnectionPoint
 *
 */
public class InternalConnectionPointBuilder implements Builder<http.riftio.vnfd.base.rev170228.vnfd.descriptor.internal.vld.InternalConnectionPoint> {

    private java.lang.String _idRef;
    private IpAddress _ipAddress;
    private InternalConnectionPointKey _key;

    Map<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.internal.vld.InternalConnectionPoint>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.internal.vld.InternalConnectionPoint>> augmentation = Collections.emptyMap();

    public InternalConnectionPointBuilder() {
    }

    public InternalConnectionPointBuilder(InternalConnectionPoint base) {
        if (base.getKey() == null) {
            this._key = new InternalConnectionPointKey(
                base.getIdRef()
            );
            this._idRef = base.getIdRef();
        } else {
            this._key = base.getKey();
            this._idRef = _key.getIdRef();
        }
        this._ipAddress = base.getIpAddress();
        if (base instanceof InternalConnectionPointImpl) {
            InternalConnectionPointImpl impl = (InternalConnectionPointImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<http.riftio.vnfd.base.rev170228.vnfd.descriptor.internal.vld.InternalConnectionPoint> casted =(AugmentationHolder<http.riftio.vnfd.base.rev170228.vnfd.descriptor.internal.vld.InternalConnectionPoint>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public java.lang.String getIdRef() {
        return _idRef;
    }
    
    public IpAddress getIpAddress() {
        return _ipAddress;
    }
    
    public InternalConnectionPointKey getKey() {
        return _key;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.internal.vld.InternalConnectionPoint>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public InternalConnectionPointBuilder setIdRef(final java.lang.String value) {
        this._idRef = value;
        return this;
    }
    
     
    public InternalConnectionPointBuilder setIpAddress(final IpAddress value) {
        this._ipAddress = value;
        return this;
    }
    
     
    public InternalConnectionPointBuilder setKey(final InternalConnectionPointKey value) {
        this._key = value;
        return this;
    }
    
    public InternalConnectionPointBuilder addAugmentation(java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.internal.vld.InternalConnectionPoint>> augmentationType, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.internal.vld.InternalConnectionPoint> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public InternalConnectionPointBuilder removeAugmentation(java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.internal.vld.InternalConnectionPoint>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public InternalConnectionPoint build() {
        return new InternalConnectionPointImpl(this);
    }

    private static final class InternalConnectionPointImpl implements InternalConnectionPoint {

        @Override
        public java.lang.Class<http.riftio.vnfd.base.rev170228.vnfd.descriptor.internal.vld.InternalConnectionPoint> getImplementedInterface() {
            return http.riftio.vnfd.base.rev170228.vnfd.descriptor.internal.vld.InternalConnectionPoint.class;
        }

        private final java.lang.String _idRef;
        private final IpAddress _ipAddress;
        private final InternalConnectionPointKey _key;

        private Map<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.internal.vld.InternalConnectionPoint>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.internal.vld.InternalConnectionPoint>> augmentation = Collections.emptyMap();

        private InternalConnectionPointImpl(InternalConnectionPointBuilder base) {
            if (base.getKey() == null) {
                this._key = new InternalConnectionPointKey(
                    base.getIdRef()
                );
                this._idRef = base.getIdRef();
            } else {
                this._key = base.getKey();
                this._idRef = _key.getIdRef();
            }
            this._ipAddress = base.getIpAddress();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.internal.vld.InternalConnectionPoint>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.internal.vld.InternalConnectionPoint>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.internal.vld.InternalConnectionPoint>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.internal.vld.InternalConnectionPoint>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getIdRef() {
            return _idRef;
        }
        
        @Override
        public IpAddress getIpAddress() {
            return _ipAddress;
        }
        
        @Override
        public InternalConnectionPointKey getKey() {
            return _key;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.internal.vld.InternalConnectionPoint>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_idRef);
            result = prime * result + Objects.hashCode(_ipAddress);
            result = prime * result + Objects.hashCode(_key);
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
            if (!http.riftio.vnfd.base.rev170228.vnfd.descriptor.internal.vld.InternalConnectionPoint.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            http.riftio.vnfd.base.rev170228.vnfd.descriptor.internal.vld.InternalConnectionPoint other = (http.riftio.vnfd.base.rev170228.vnfd.descriptor.internal.vld.InternalConnectionPoint)obj;
            if (!Objects.equals(_idRef, other.getIdRef())) {
                return false;
            }
            if (!Objects.equals(_ipAddress, other.getIpAddress())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                InternalConnectionPointImpl otherImpl = (InternalConnectionPointImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.internal.vld.InternalConnectionPoint>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.internal.vld.InternalConnectionPoint>> e : augmentation.entrySet()) {
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
            java.lang.String name = "InternalConnectionPoint [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_idRef != null) {
                builder.append("_idRef=");
                builder.append(_idRef);
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
