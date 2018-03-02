package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.info.ip.profile.params;
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
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.info.ip.profile.params.DhcpParams} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.info.ip.profile.params.DhcpParams
 *
 */
public class DhcpParamsBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.info.ip.profile.params.DhcpParams> {

    private java.lang.Long _count;
    private IpAddress _startAddress;
    private java.lang.Boolean _enabled;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.info.ip.profile.params.DhcpParams>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.info.ip.profile.params.DhcpParams>> augmentation = Collections.emptyMap();

    public DhcpParamsBuilder() {
    }

    public DhcpParamsBuilder(DhcpParams base) {
        this._count = base.getCount();
        this._startAddress = base.getStartAddress();
        this._enabled = base.isEnabled();
        if (base instanceof DhcpParamsImpl) {
            DhcpParamsImpl impl = (DhcpParamsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.info.ip.profile.params.DhcpParams> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.info.ip.profile.params.DhcpParams>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public java.lang.Long getCount() {
        return _count;
    }
    
    public IpAddress getStartAddress() {
        return _startAddress;
    }
    
    public java.lang.Boolean isEnabled() {
        return _enabled;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.info.ip.profile.params.DhcpParams>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static void checkCountRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..4294967295]].", value));
     }
    
    public DhcpParamsBuilder setCount(final java.lang.Long value) {
    if (value != null) {
        checkCountRange(value);
    }
        this._count = value;
        return this;
    }
    
     
    public DhcpParamsBuilder setStartAddress(final IpAddress value) {
        this._startAddress = value;
        return this;
    }
    
     
    public DhcpParamsBuilder setEnabled(final java.lang.Boolean value) {
        this._enabled = value;
        return this;
    }
    
    public DhcpParamsBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.info.ip.profile.params.DhcpParams>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.info.ip.profile.params.DhcpParams> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public DhcpParamsBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.info.ip.profile.params.DhcpParams>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public DhcpParams build() {
        return new DhcpParamsImpl(this);
    }

    private static final class DhcpParamsImpl implements DhcpParams {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.info.ip.profile.params.DhcpParams> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.info.ip.profile.params.DhcpParams.class;
        }

        private final java.lang.Long _count;
        private final IpAddress _startAddress;
        private final java.lang.Boolean _enabled;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.info.ip.profile.params.DhcpParams>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.info.ip.profile.params.DhcpParams>> augmentation = Collections.emptyMap();

        private DhcpParamsImpl(DhcpParamsBuilder base) {
            this._count = base.getCount();
            this._startAddress = base.getStartAddress();
            this._enabled = base.isEnabled();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.info.ip.profile.params.DhcpParams>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.info.ip.profile.params.DhcpParams>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.info.ip.profile.params.DhcpParams>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.info.ip.profile.params.DhcpParams>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Long getCount() {
            return _count;
        }
        
        @Override
        public IpAddress getStartAddress() {
            return _startAddress;
        }
        
        @Override
        public java.lang.Boolean isEnabled() {
            return _enabled;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.info.ip.profile.params.DhcpParams>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_count);
            result = prime * result + Objects.hashCode(_startAddress);
            result = prime * result + Objects.hashCode(_enabled);
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
            if (!ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.info.ip.profile.params.DhcpParams.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.info.ip.profile.params.DhcpParams other = (ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.info.ip.profile.params.DhcpParams)obj;
            if (!Objects.equals(_count, other.getCount())) {
                return false;
            }
            if (!Objects.equals(_startAddress, other.getStartAddress())) {
                return false;
            }
            if (!Objects.equals(_enabled, other.isEnabled())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                DhcpParamsImpl otherImpl = (DhcpParamsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.info.ip.profile.params.DhcpParams>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.info.ip.profile.params.DhcpParams>> e : augmentation.entrySet()) {
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
            java.lang.String name = "DhcpParams [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_count != null) {
                builder.append("_count=");
                builder.append(_count);
                builder.append(", ");
            }
            if (_startAddress != null) {
                builder.append("_startAddress=");
                builder.append(_startAddress);
                builder.append(", ");
            }
            if (_enabled != null) {
                builder.append("_enabled=");
                builder.append(_enabled);
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
