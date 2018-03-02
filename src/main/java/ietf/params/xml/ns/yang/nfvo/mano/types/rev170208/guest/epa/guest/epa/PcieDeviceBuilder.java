package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.math.BigInteger;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.PcieDevice} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.PcieDevice
 *
 */
public class PcieDeviceBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.PcieDevice> {

    private BigInteger _count;
    private java.lang.String _deviceId;
    private PcieDeviceKey _key;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.PcieDevice>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.PcieDevice>> augmentation = Collections.emptyMap();

    public PcieDeviceBuilder() {
    }

    public PcieDeviceBuilder(PcieDevice base) {
        if (base.getKey() == null) {
            this._key = new PcieDeviceKey(
                base.getDeviceId()
            );
            this._deviceId = base.getDeviceId();
        } else {
            this._key = base.getKey();
            this._deviceId = _key.getDeviceId();
        }
        this._count = base.getCount();
        if (base instanceof PcieDeviceImpl) {
            PcieDeviceImpl impl = (PcieDeviceImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.PcieDevice> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.PcieDevice>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public BigInteger getCount() {
        return _count;
    }
    
    public java.lang.String getDeviceId() {
        return _deviceId;
    }
    
    public PcieDeviceKey getKey() {
        return _key;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.PcieDevice>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKCOUNTRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKCOUNTRANGE_RANGES = a;
     }
     private static void checkCountRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKCOUNTRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKCOUNTRANGE_RANGES)));
     }
    
    public PcieDeviceBuilder setCount(final BigInteger value) {
    if (value != null) {
        checkCountRange(value);
    }
        this._count = value;
        return this;
    }
    
     
    public PcieDeviceBuilder setDeviceId(final java.lang.String value) {
        this._deviceId = value;
        return this;
    }
    
     
    public PcieDeviceBuilder setKey(final PcieDeviceKey value) {
        this._key = value;
        return this;
    }
    
    public PcieDeviceBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.PcieDevice>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.PcieDevice> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public PcieDeviceBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.PcieDevice>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public PcieDevice build() {
        return new PcieDeviceImpl(this);
    }

    private static final class PcieDeviceImpl implements PcieDevice {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.PcieDevice> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.PcieDevice.class;
        }

        private final BigInteger _count;
        private final java.lang.String _deviceId;
        private final PcieDeviceKey _key;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.PcieDevice>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.PcieDevice>> augmentation = Collections.emptyMap();

        private PcieDeviceImpl(PcieDeviceBuilder base) {
            if (base.getKey() == null) {
                this._key = new PcieDeviceKey(
                    base.getDeviceId()
                );
                this._deviceId = base.getDeviceId();
            } else {
                this._key = base.getKey();
                this._deviceId = _key.getDeviceId();
            }
            this._count = base.getCount();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.PcieDevice>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.PcieDevice>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.PcieDevice>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.PcieDevice>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public BigInteger getCount() {
            return _count;
        }
        
        @Override
        public java.lang.String getDeviceId() {
            return _deviceId;
        }
        
        @Override
        public PcieDeviceKey getKey() {
            return _key;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.PcieDevice>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_deviceId);
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
            if (!ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.PcieDevice.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.PcieDevice other = (ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.PcieDevice)obj;
            if (!Objects.equals(_count, other.getCount())) {
                return false;
            }
            if (!Objects.equals(_deviceId, other.getDeviceId())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                PcieDeviceImpl otherImpl = (PcieDeviceImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.PcieDevice>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.PcieDevice>> e : augmentation.entrySet()) {
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
            java.lang.String name = "PcieDevice [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_count != null) {
                builder.append("_count=");
                builder.append(_count);
                builder.append(", ");
            }
            if (_deviceId != null) {
                builder.append("_deviceId=");
                builder.append(_deviceId);
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
