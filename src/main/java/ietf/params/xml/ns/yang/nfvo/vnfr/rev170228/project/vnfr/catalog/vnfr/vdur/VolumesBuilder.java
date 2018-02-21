package ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.VolumeInfo.DeviceBus;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.VolumeInfo.DeviceType;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.volume.info.VolumeSource;

import java.util.Objects;
import java.math.BigInteger;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.Volumes} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.Volumes
 *
 */
public class VolumesBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.Volumes> {

    private java.lang.String _description;
    private DeviceBus _deviceBus;
    private DeviceType _deviceType;
    private VolumesKey _key;
    private java.lang.String _name;
    private BigInteger _size;
    private java.lang.String _volumeId;
    private VolumeSource _volumeSource;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.Volumes>>, Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.Volumes>> augmentation = Collections.emptyMap();

    public VolumesBuilder() {
    }
    public VolumesBuilder(ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.VolumeInfo arg) {
        this._description = arg.getDescription();
        this._size = arg.getSize();
        this._volumeSource = arg.getVolumeSource();
        this._deviceBus = arg.getDeviceBus();
        this._deviceType = arg.getDeviceType();
    }

    public VolumesBuilder(Volumes base) {
        if (base.getKey() == null) {
            this._key = new VolumesKey(
                base.getName()
            );
            this._name = base.getName();
        } else {
            this._key = base.getKey();
            this._name = _key.getName();
        }
        this._description = base.getDescription();
        this._deviceBus = base.getDeviceBus();
        this._deviceType = base.getDeviceType();
        this._size = base.getSize();
        this._volumeId = base.getVolumeId();
        this._volumeSource = base.getVolumeSource();
        if (base instanceof VolumesImpl) {
            VolumesImpl impl = (VolumesImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.Volumes> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.Volumes>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.VolumeInfo</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.VolumeInfo) {
            this._description = ((ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.VolumeInfo)arg).getDescription();
            this._size = ((ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.VolumeInfo)arg).getSize();
            this._volumeSource = ((ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.VolumeInfo)arg).getVolumeSource();
            this._deviceBus = ((ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.VolumeInfo)arg).getDeviceBus();
            this._deviceType = ((ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.VolumeInfo)arg).getDeviceType();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.VolumeInfo] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.String getDescription() {
        return _description;
    }
    
    public DeviceBus getDeviceBus() {
        return _deviceBus;
    }
    
    public DeviceType getDeviceType() {
        return _deviceType;
    }
    
    public VolumesKey getKey() {
        return _key;
    }
    
    public java.lang.String getName() {
        return _name;
    }
    
    public BigInteger getSize() {
        return _size;
    }
    
    public java.lang.String getVolumeId() {
        return _volumeId;
    }
    
    public VolumeSource getVolumeSource() {
        return _volumeSource;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.Volumes>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public VolumesBuilder setDescription(final java.lang.String value) {
        this._description = value;
        return this;
    }
    
     
    public VolumesBuilder setDeviceBus(final DeviceBus value) {
        this._deviceBus = value;
        return this;
    }
    
     
    public VolumesBuilder setDeviceType(final DeviceType value) {
        this._deviceType = value;
        return this;
    }
    
     
    public VolumesBuilder setKey(final VolumesKey value) {
        this._key = value;
        return this;
    }
    
     
    public VolumesBuilder setName(final java.lang.String value) {
        this._name = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKSIZERANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKSIZERANGE_RANGES = a;
     }
     private static void checkSizeRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKSIZERANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKSIZERANGE_RANGES)));
     }
    
    public VolumesBuilder setSize(final BigInteger value) {
    if (value != null) {
        checkSizeRange(value);
    }
        this._size = value;
        return this;
    }
    
     
    public VolumesBuilder setVolumeId(final java.lang.String value) {
        this._volumeId = value;
        return this;
    }
    
     
    public VolumesBuilder setVolumeSource(final VolumeSource value) {
        this._volumeSource = value;
        return this;
    }
    
    public VolumesBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.Volumes>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.Volumes> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VolumesBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.Volumes>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Volumes build() {
        return new VolumesImpl(this);
    }

    private static final class VolumesImpl implements Volumes {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.Volumes> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.Volumes.class;
        }

        private final java.lang.String _description;
        private final DeviceBus _deviceBus;
        private final DeviceType _deviceType;
        private final VolumesKey _key;
        private final java.lang.String _name;
        private final BigInteger _size;
        private final java.lang.String _volumeId;
        private final VolumeSource _volumeSource;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.Volumes>>, Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.Volumes>> augmentation = Collections.emptyMap();

        private VolumesImpl(VolumesBuilder base) {
            if (base.getKey() == null) {
                this._key = new VolumesKey(
                    base.getName()
                );
                this._name = base.getName();
            } else {
                this._key = base.getKey();
                this._name = _key.getName();
            }
            this._description = base.getDescription();
            this._deviceBus = base.getDeviceBus();
            this._deviceType = base.getDeviceType();
            this._size = base.getSize();
            this._volumeId = base.getVolumeId();
            this._volumeSource = base.getVolumeSource();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.Volumes>>, Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.Volumes>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.Volumes>>, Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.Volumes>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getDescription() {
            return _description;
        }
        
        @Override
        public DeviceBus getDeviceBus() {
            return _deviceBus;
        }
        
        @Override
        public DeviceType getDeviceType() {
            return _deviceType;
        }
        
        @Override
        public VolumesKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.String getName() {
            return _name;
        }
        
        @Override
        public BigInteger getSize() {
            return _size;
        }
        
        @Override
        public java.lang.String getVolumeId() {
            return _volumeId;
        }
        
        @Override
        public VolumeSource getVolumeSource() {
            return _volumeSource;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.Volumes>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_description);
            result = prime * result + Objects.hashCode(_deviceBus);
            result = prime * result + Objects.hashCode(_deviceType);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_size);
            result = prime * result + Objects.hashCode(_volumeId);
            result = prime * result + Objects.hashCode(_volumeSource);
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
            if (!ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.Volumes.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.Volumes other = (ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.Volumes)obj;
            if (!Objects.equals(_description, other.getDescription())) {
                return false;
            }
            if (!Objects.equals(_deviceBus, other.getDeviceBus())) {
                return false;
            }
            if (!Objects.equals(_deviceType, other.getDeviceType())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_size, other.getSize())) {
                return false;
            }
            if (!Objects.equals(_volumeId, other.getVolumeId())) {
                return false;
            }
            if (!Objects.equals(_volumeSource, other.getVolumeSource())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VolumesImpl otherImpl = (VolumesImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.Volumes>>, Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.Volumes>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Volumes [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_description != null) {
                builder.append("_description=");
                builder.append(_description);
                builder.append(", ");
            }
            if (_deviceBus != null) {
                builder.append("_deviceBus=");
                builder.append(_deviceBus);
                builder.append(", ");
            }
            if (_deviceType != null) {
                builder.append("_deviceType=");
                builder.append(_deviceType);
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
            if (_size != null) {
                builder.append("_size=");
                builder.append(_size);
                builder.append(", ");
            }
            if (_volumeId != null) {
                builder.append("_volumeId=");
                builder.append(_volumeId);
                builder.append(", ");
            }
            if (_volumeSource != null) {
                builder.append("_volumeSource=");
                builder.append(_volumeSource);
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
