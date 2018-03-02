package http.riftio.vnfd.base.rev170228.vnfd.descriptor;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import java.util.HashMap;

import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;

import com.fasterxml.jackson.annotation.JsonProperty;

import http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.VduIdBuilder;
import http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.Alarm;
import http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.AlternativeImages;
import http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.CloudInitInput;
import http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.Interface;
import http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.InternalConnectionPoint;
import http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.VduConfiguration;
import http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.Volumes;
import ietf.params.xml.ns.yang.ietf.inet.types.rev130715.PortNumber;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.GuestEpa;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.HostEpa;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.hypervisor.epa.HypervisorEpa;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.supplemental.boot.data.SupplementalBootData;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vm.flavor.VmFlavor;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vswitch.epa.VswitchEpa;

import java.util.Objects;
import java.math.BigInteger;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link http.riftio.vnfd.base.rev170228.vnfd.descriptor.Vdu} instances.
 * 
 * @see http.riftio.vnfd.base.rev170228.vnfd.descriptor.Vdu
 *
 */
public class VduBuilder implements Builder<http.riftio.vnfd.base.rev170228.vnfd.descriptor.Vdu> {

    private List<Alarm> _alarm;
    private List<AlternativeImages> _alternativeImages;
    private CloudInitInput _cloudInitInput;
    private BigInteger _count;
    private java.lang.String _description;
    private GuestEpa _guestEpa;
    private HostEpa _hostEpa;
    private HypervisorEpa _hypervisorEpa;
    private java.lang.String _id;
    private java.lang.String _image;
    private java.lang.String _imageChecksum;
    private List<Interface> _interface;
    private List<InternalConnectionPoint> _internalConnectionPoint;
    private VduKey _key;
    private java.lang.String _mgmtVpci;
    private java.lang.String _name;
    private SupplementalBootData _supplementalBootData;
    private VduConfiguration _vduConfiguration;
    private VmFlavor _vmFlavor;
    private List<Volumes> _volumes;
    private VswitchEpa _vswitchEpa;

    Map<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.Vdu>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.Vdu>> augmentation = Collections.emptyMap();

    public VduBuilder() {
    }
    public VduBuilder(ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.GuestEpa arg) {
        this._guestEpa = arg.getGuestEpa();
    }
    public VduBuilder(ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.SupplementalBootData arg) {
        this._supplementalBootData = arg.getSupplementalBootData();
    }
    public VduBuilder(ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.HostEpa arg) {
        this._hostEpa = arg.getHostEpa();
    }
    public VduBuilder(ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.VmFlavor arg) {
        this._vmFlavor = arg.getVmFlavor();
    }
    public VduBuilder(ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ImageProperties arg) {
        this._image = arg.getImage();
        this._imageChecksum = arg.getImageChecksum();
    }
    public VduBuilder(ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.VswitchEpa arg) {
        this._vswitchEpa = arg.getVswitchEpa();
    }
    public VduBuilder(ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.HypervisorEpa arg) {
        this._hypervisorEpa = arg.getHypervisorEpa();
    }

    public VduBuilder(Vdu base) {
        if (base.getKey() == null) {
            this._key = new VduKey(
                base.getId()
            );
            this._id = base.getId();
        } else {
            this._key = base.getKey();
            this._id = _key.getId();
        }
        this._alarm = base.getAlarm();
        this._alternativeImages = base.getAlternativeImages();
        this._cloudInitInput = base.getCloudInitInput();
        this._count = base.getCount();
        this._description = base.getDescription();
        this._guestEpa = base.getGuestEpa();
        this._hostEpa = base.getHostEpa();
        this._hypervisorEpa = base.getHypervisorEpa();
        this._image = base.getImage();
        this._imageChecksum = base.getImageChecksum();
        this._interface = base.getInterface();
        this._internalConnectionPoint = base.getInternalConnectionPoint();
        this._mgmtVpci = base.getMgmtVpci();
        this._name = base.getName();
        this._supplementalBootData = base.getSupplementalBootData();
        this._vduConfiguration = base.getVduConfiguration();
        this._vmFlavor = base.getVmFlavor();
        this._volumes = base.getVolumes();
        this._vswitchEpa = base.getVswitchEpa();
        if (base instanceof VduImpl) {
            VduImpl impl = (VduImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<http.riftio.vnfd.base.rev170228.vnfd.descriptor.Vdu> casted =(AugmentationHolder<http.riftio.vnfd.base.rev170228.vnfd.descriptor.Vdu>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.HostEpa</li>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ImageProperties</li>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.VswitchEpa</li>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.HypervisorEpa</li>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.GuestEpa</li>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.SupplementalBootData</li>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.VmFlavor</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.HostEpa) {
            this._hostEpa = ((ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.HostEpa)arg).getHostEpa();
            isValidArg = true;
        }
        if (arg instanceof ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ImageProperties) {
            this._image = ((ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ImageProperties)arg).getImage();
            this._imageChecksum = ((ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ImageProperties)arg).getImageChecksum();
            isValidArg = true;
        }
        if (arg instanceof ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.VswitchEpa) {
            this._vswitchEpa = ((ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.VswitchEpa)arg).getVswitchEpa();
            isValidArg = true;
        }
        if (arg instanceof ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.HypervisorEpa) {
            this._hypervisorEpa = ((ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.HypervisorEpa)arg).getHypervisorEpa();
            isValidArg = true;
        }
        if (arg instanceof ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.GuestEpa) {
            this._guestEpa = ((ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.GuestEpa)arg).getGuestEpa();
            isValidArg = true;
        }
        if (arg instanceof ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.SupplementalBootData) {
            this._supplementalBootData = ((ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.SupplementalBootData)arg).getSupplementalBootData();
            isValidArg = true;
        }
        if (arg instanceof ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.VmFlavor) {
            this._vmFlavor = ((ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.VmFlavor)arg).getVmFlavor();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.HostEpa, org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ImageProperties, org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.VswitchEpa, org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.HypervisorEpa, org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.GuestEpa, org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.SupplementalBootData, org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.VmFlavor] \n" +
              "but was: " + arg
            );
        }
    }

    public List<Alarm> getAlarm() {
        return _alarm;
    }
    
    public List<AlternativeImages> getAlternativeImages() {
        return _alternativeImages;
    }
    
    public CloudInitInput getCloudInitInput() {
        return _cloudInitInput;
    }
    
    public BigInteger getCount() {
        return _count;
    }
    
    public java.lang.String getDescription() {
        return _description;
    }
    
    public GuestEpa getGuestEpa() {
        return _guestEpa;
    }
    
    public HostEpa getHostEpa() {
        return _hostEpa;
    }
    
    public HypervisorEpa getHypervisorEpa() {
        return _hypervisorEpa;
    }
    
    public java.lang.String getId() {
        return _id;
    }
    
    public java.lang.String getImage() {
        return _image;
    }
    
    public java.lang.String getImageChecksum() {
        return _imageChecksum;
    }
    
    public List<Interface> getInterface() {
        return _interface;
    }
    
    public List<InternalConnectionPoint> getInternalConnectionPoint() {
        return _internalConnectionPoint;
    }
    
    public VduKey getKey() {
        return _key;
    }
    
    public java.lang.String getMgmtVpci() {
        return _mgmtVpci;
    }
    
    public java.lang.String getName() {
        return _name;
    }
    
    public SupplementalBootData getSupplementalBootData() {
        return _supplementalBootData;
    }
    
    public VduConfiguration getVduConfiguration() {
        return _vduConfiguration;
    }
    
    public VmFlavor getVmFlavor() {
        return _vmFlavor;
    }
    
    public List<Volumes> getVolumes() {
        return _volumes;
    }
    
    public VswitchEpa getVswitchEpa() {
        return _vswitchEpa;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.Vdu>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public VduBuilder setAlarm(final List<Alarm> value) {
        this._alarm = value;
        return this;
    }
    
     
    public VduBuilder setAlternativeImages(final List<AlternativeImages> value) {
        this._alternativeImages = value;
        return this;
    }
    
     
    public VduBuilder setCloudInitInput(final CloudInitInput value) {
        this._cloudInitInput = value;
        return this;
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
    
    public VduBuilder setCount(final BigInteger value) {
    if (value != null) {
        checkCountRange(value);
    }
        this._count = value;
        return this;
    }
    
     
    public VduBuilder setDescription(final java.lang.String value) {
        this._description = value;
        return this;
    }
    
     
    public VduBuilder setGuestEpa(final GuestEpa value) {
        this._guestEpa = value;
        return this;
    }
    
     
    public VduBuilder setHostEpa(final HostEpa value) {
        this._hostEpa = value;
        return this;
    }
    
     
    public VduBuilder setHypervisorEpa(final HypervisorEpa value) {
        this._hypervisorEpa = value;
        return this;
    }
    
     
    public VduBuilder setId(final java.lang.String value) {
        this._id = value;
        return this;
    }
    
     
    public VduBuilder setImage(final java.lang.String value) {
        this._image = value;
        return this;
    }
    
     
    public VduBuilder setImageChecksum(final java.lang.String value) {
        this._imageChecksum = value;
        return this;
    }
    
     
    public VduBuilder setInterface(final List<Interface> value) {
        this._interface = value;
        return this;
    }
    
     
    public VduBuilder setInternalConnectionPoint(final List<InternalConnectionPoint> value) {
        this._internalConnectionPoint = value;
        return this;
    }
    
     
    public VduBuilder setKey(final VduKey value) {
        this._key = value;
        return this;
    }
    
     
    public VduBuilder setMgmtVpci(final java.lang.String value) {
        this._mgmtVpci = value;
        return this;
    }
    
     
    public VduBuilder setName(final java.lang.String value) {
        this._name = value;
        return this;
    }
    
     
    public VduBuilder setSupplementalBootData(final SupplementalBootData value) {
        this._supplementalBootData = value;
        return this;
    }
    
     
    public VduBuilder setVduConfiguration(final VduConfiguration value) {
        this._vduConfiguration = value;
        return this;
    }
    
     
    public VduBuilder setVmFlavor(final VmFlavor value) {
        this._vmFlavor = value;
        return this;
    }
    
     
    public VduBuilder setVolumes(final List<Volumes> value) {
        this._volumes = value;
        return this;
    }
    
     
    public VduBuilder setVswitchEpa(final VswitchEpa value) {
        this._vswitchEpa = value;
        return this;
    }
    
    public VduBuilder addAugmentation(java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.Vdu>> augmentationType, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.Vdu> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VduBuilder removeAugmentation(java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.Vdu>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Vdu build() {
        return new VduImpl(this);
    }

    public static final class VduImpl implements Vdu {

        @Override
        public java.lang.Class<http.riftio.vnfd.base.rev170228.vnfd.descriptor.Vdu> getImplementedInterface() {
            return http.riftio.vnfd.base.rev170228.vnfd.descriptor.Vdu.class;
        }

        private final List<Alarm> _alarm;
        private final List<AlternativeImages> _alternativeImages;
        @JsonProperty("cloud-init-input")
        private final CloudInitInput _cloudInitInput;
        @JsonProperty("count")
        private final BigInteger _count;
        @JsonProperty("description")
        private final java.lang.String _description;
        @JsonProperty("guest-epa")
        private final GuestEpa _guestEpa;
        private final HostEpa _hostEpa;
        private final HypervisorEpa _hypervisorEpa;
        @JsonProperty("id")
        private final java.lang.String _id;
        @JsonProperty("image")
        private final java.lang.String _image;
        @JsonProperty("image-checksum")
        private final java.lang.String _imageChecksum;
        @JsonProperty("interface")
        private final List<Interface> _interface;
        @JsonProperty("internal-connection-point")
        private final List<InternalConnectionPoint> _internalConnectionPoint;
        private final VduKey _key;
        private final java.lang.String _mgmtVpci;
        @JsonProperty("name")
        private final java.lang.String _name;
        @JsonProperty("supplemental-boot-data")
        private final SupplementalBootData _supplementalBootData;
        private final VduConfiguration _vduConfiguration;
        @JsonProperty("vm-flavor")
        private final VmFlavor _vmFlavor;
        private final List<Volumes> _volumes;
        private final VswitchEpa _vswitchEpa;

        private Map<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.Vdu>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.Vdu>> augmentation = Collections.emptyMap();

        public VduImpl(VduBuilder base) {
            if (base.getKey() == null) {
                this._key = new VduKey(
                    base.getId()
                );
                this._id = base.getId();
            } else {
                this._key = base.getKey();
                this._id = _key.getId();
            }
            this._alarm = base.getAlarm();
            this._alternativeImages = base.getAlternativeImages();
            this._cloudInitInput = base.getCloudInitInput();
            this._count = base.getCount();
            this._description = base.getDescription();
            this._guestEpa = base.getGuestEpa();
            this._hostEpa = base.getHostEpa();
            this._hypervisorEpa = base.getHypervisorEpa();
            this._image = base.getImage();
            this._imageChecksum = base.getImageChecksum();
            this._interface = base.getInterface();
            this._internalConnectionPoint = base.getInternalConnectionPoint();
            this._mgmtVpci = base.getMgmtVpci();
            this._name = base.getName();
            this._supplementalBootData = base.getSupplementalBootData();
            this._vduConfiguration = base.getVduConfiguration();
            this._vmFlavor = base.getVmFlavor();
            this._volumes = base.getVolumes();
            this._vswitchEpa = base.getVswitchEpa();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.Vdu>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.Vdu>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.Vdu>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.Vdu>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }
        
        public VduImpl(){
        	this( new VduBuilder() );
        }

        @Override
        public List<Alarm> getAlarm() {
            return _alarm;
        }
        
        @Override
        public List<AlternativeImages> getAlternativeImages() {
            return _alternativeImages;
        }
        
        @Override
        public CloudInitInput getCloudInitInput() {
            return _cloudInitInput;
        }
        
        @Override
        public BigInteger getCount() {
            return _count;
        }
        
        @Override
        public java.lang.String getDescription() {
            return _description;
        }
        
        @Override
        public GuestEpa getGuestEpa() {
            return _guestEpa;
        }
        
        @Override
        public HostEpa getHostEpa() {
            return _hostEpa;
        }
        
        @Override
        public HypervisorEpa getHypervisorEpa() {
            return _hypervisorEpa;
        }
        
        @Override
        public java.lang.String getId() {
            return _id;
        }
        
        @Override
        public java.lang.String getImage() {
            return _image;
        }
        
        @Override
        public java.lang.String getImageChecksum() {
            return _imageChecksum;
        }
        
        @Override
        public List<Interface> getInterface() {
            return _interface;
        }
        
        @Override
        public List<InternalConnectionPoint> getInternalConnectionPoint() {
            return _internalConnectionPoint;
        }
        
        @Override
        public VduKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.String getMgmtVpci() {
            return _mgmtVpci;
        }
        
        @Override
        public java.lang.String getName() {
            return _name;
        }
        
        @Override
        public SupplementalBootData getSupplementalBootData() {
            return _supplementalBootData;
        }
        
        @Override
        public VduConfiguration getVduConfiguration() {
            return _vduConfiguration;
        }
        
        @Override
        public VmFlavor getVmFlavor() {
            return _vmFlavor;
        }
        
        @Override
        public List<Volumes> getVolumes() {
            return _volumes;
        }
        
        @Override
        public VswitchEpa getVswitchEpa() {
            return _vswitchEpa;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.Vdu>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_alarm);
            result = prime * result + Objects.hashCode(_alternativeImages);
            result = prime * result + Objects.hashCode(_cloudInitInput);
            result = prime * result + Objects.hashCode(_count);
            result = prime * result + Objects.hashCode(_description);
            result = prime * result + Objects.hashCode(_guestEpa);
            result = prime * result + Objects.hashCode(_hostEpa);
            result = prime * result + Objects.hashCode(_hypervisorEpa);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_image);
            result = prime * result + Objects.hashCode(_imageChecksum);
            result = prime * result + Objects.hashCode(_interface);
            result = prime * result + Objects.hashCode(_internalConnectionPoint);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_mgmtVpci);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_supplementalBootData);
            result = prime * result + Objects.hashCode(_vduConfiguration);
            result = prime * result + Objects.hashCode(_vmFlavor);
            result = prime * result + Objects.hashCode(_volumes);
            result = prime * result + Objects.hashCode(_vswitchEpa);
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
            if (!http.riftio.vnfd.base.rev170228.vnfd.descriptor.Vdu.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            http.riftio.vnfd.base.rev170228.vnfd.descriptor.Vdu other = (http.riftio.vnfd.base.rev170228.vnfd.descriptor.Vdu)obj;
            if (!Objects.equals(_alarm, other.getAlarm())) {
                return false;
            }
            if (!Objects.equals(_alternativeImages, other.getAlternativeImages())) {
                return false;
            }
            if (!Objects.equals(_cloudInitInput, other.getCloudInitInput())) {
                return false;
            }
            if (!Objects.equals(_count, other.getCount())) {
                return false;
            }
            if (!Objects.equals(_description, other.getDescription())) {
                return false;
            }
            if (!Objects.equals(_guestEpa, other.getGuestEpa())) {
                return false;
            }
            if (!Objects.equals(_hostEpa, other.getHostEpa())) {
                return false;
            }
            if (!Objects.equals(_hypervisorEpa, other.getHypervisorEpa())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_image, other.getImage())) {
                return false;
            }
            if (!Objects.equals(_imageChecksum, other.getImageChecksum())) {
                return false;
            }
            if (!Objects.equals(_interface, other.getInterface())) {
                return false;
            }
            if (!Objects.equals(_internalConnectionPoint, other.getInternalConnectionPoint())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_mgmtVpci, other.getMgmtVpci())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_supplementalBootData, other.getSupplementalBootData())) {
                return false;
            }
            if (!Objects.equals(_vduConfiguration, other.getVduConfiguration())) {
                return false;
            }
            if (!Objects.equals(_vmFlavor, other.getVmFlavor())) {
                return false;
            }
            if (!Objects.equals(_volumes, other.getVolumes())) {
                return false;
            }
            if (!Objects.equals(_vswitchEpa, other.getVswitchEpa())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VduImpl otherImpl = (VduImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.Vdu>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.Vdu>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Vdu [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_alarm != null) {
                builder.append("_alarm=");
                builder.append(_alarm);
                builder.append(", ");
            }
            if (_alternativeImages != null) {
                builder.append("_alternativeImages=");
                builder.append(_alternativeImages);
                builder.append(", ");
            }
            if (_cloudInitInput != null) {
                builder.append("_cloudInitInput=");
                builder.append(_cloudInitInput);
                builder.append(", ");
            }
            if (_count != null) {
                builder.append("_count=");
                builder.append(_count);
                builder.append(", ");
            }
            if (_description != null) {
                builder.append("_description=");
                builder.append(_description);
                builder.append(", ");
            }
            if (_guestEpa != null) {
                builder.append("_guestEpa=");
                builder.append(_guestEpa);
                builder.append(", ");
            }
            if (_hostEpa != null) {
                builder.append("_hostEpa=");
                builder.append(_hostEpa);
                builder.append(", ");
            }
            if (_hypervisorEpa != null) {
                builder.append("_hypervisorEpa=");
                builder.append(_hypervisorEpa);
                builder.append(", ");
            }
            if (_id != null) {
                builder.append("_id=");
                builder.append(_id);
                builder.append(", ");
            }
            if (_image != null) {
                builder.append("_image=");
                builder.append(_image);
                builder.append(", ");
            }
            if (_imageChecksum != null) {
                builder.append("_imageChecksum=");
                builder.append(_imageChecksum);
                builder.append(", ");
            }
            if (_interface != null) {
                builder.append("_interface=");
                builder.append(_interface);
                builder.append(", ");
            }
            if (_internalConnectionPoint != null) {
                builder.append("_internalConnectionPoint=");
                builder.append(_internalConnectionPoint);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_mgmtVpci != null) {
                builder.append("_mgmtVpci=");
                builder.append(_mgmtVpci);
                builder.append(", ");
            }
            if (_name != null) {
                builder.append("_name=");
                builder.append(_name);
                builder.append(", ");
            }
            if (_supplementalBootData != null) {
                builder.append("_supplementalBootData=");
                builder.append(_supplementalBootData);
                builder.append(", ");
            }
            if (_vduConfiguration != null) {
                builder.append("_vduConfiguration=");
                builder.append(_vduConfiguration);
                builder.append(", ");
            }
            if (_vmFlavor != null) {
                builder.append("_vmFlavor=");
                builder.append(_vmFlavor);
                builder.append(", ");
            }
            if (_volumes != null) {
                builder.append("_volumes=");
                builder.append(_volumes);
                builder.append(", ");
            }
            if (_vswitchEpa != null) {
                builder.append("_vswitchEpa=");
                builder.append(_vswitchEpa);
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
