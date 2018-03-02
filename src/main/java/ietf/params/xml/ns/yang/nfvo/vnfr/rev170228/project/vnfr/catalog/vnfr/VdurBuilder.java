package ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr;
import java.util.HashMap;

import org.opendaylight.yangtools.concepts.Builder;

import java.util.List;
import java.util.Collections;

import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;
import ietf.params.xml.ns.yang.ietf.inet.types.rev130715.Uri;
import ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.GuestEpa;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.HostEpa;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.hypervisor.epa.HypervisorEpa;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.supplemental.boot.data.SupplementalBootData;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vm.flavor.VmFlavor;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vswitch.epa.VswitchEpa;
import ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.VduOperationalStatus;
import ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.placement.group.info.PlacementGroupsInfo;
import ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.Interface;
import ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.InternalConnectionPoint;
import ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.VduConfiguration;
import ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.Volumes;

import java.util.Objects;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.Vdur} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.Vdur
 *
 */
public class VdurBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.Vdur> {

    private Uri _consoleUrl;
    private java.lang.String _flavorId;
    private GuestEpa _guestEpa;
    private HostEpa _hostEpa;
    private HypervisorEpa _hypervisorEpa;
    private Uuid _id;
    private java.lang.String _imageId;
    private List<Interface> _interface;
    private List<InternalConnectionPoint> _internalConnectionPoint;
    private VdurKey _key;
    private IpAddress _managementIp;
    private java.lang.String _name;
    private VduOperationalStatus _operationalStatus;
    private List<PlacementGroupsInfo> _placementGroupsInfo;
    private SupplementalBootData _supplementalBootData;
    private java.lang.String _uniqueShortName;
    private VduConfiguration _vduConfiguration;
    private java.lang.String _vduIdRef;
    private java.lang.String _vimId;
    private VmFlavor _vmFlavor;
    private IpAddress _vmManagementIp;
    private List<Volumes> _volumes;
    private VswitchEpa _vswitchEpa;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.Vdur>>, Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.Vdur>> augmentation = Collections.emptyMap();

    public VdurBuilder() {
    }
    public VdurBuilder(ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.GuestEpa arg) {
        this._guestEpa = arg.getGuestEpa();
    }
    public VdurBuilder(ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.SupplementalBootData arg) {
        this._supplementalBootData = arg.getSupplementalBootData();
    }
    public VdurBuilder(ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.HostEpa arg) {
        this._hostEpa = arg.getHostEpa();
    }
    public VdurBuilder(ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.VmFlavor arg) {
        this._vmFlavor = arg.getVmFlavor();
    }
    public VdurBuilder(ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.VswitchEpa arg) {
        this._vswitchEpa = arg.getVswitchEpa();
    }
    public VdurBuilder(ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.PlacementGroupInfo arg) {
        this._placementGroupsInfo = arg.getPlacementGroupsInfo();
    }
    public VdurBuilder(ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.HypervisorEpa arg) {
        this._hypervisorEpa = arg.getHypervisorEpa();
    }

    public VdurBuilder(Vdur base) {
        if (base.getKey() == null) {
            this._key = new VdurKey(
                base.getId()
            );
            this._id = base.getId();
        } else {
            this._key = base.getKey();
            this._id = _key.getId();
        }
        this._consoleUrl = base.getConsoleUrl();
        this._flavorId = base.getFlavorId();
        this._guestEpa = base.getGuestEpa();
        this._hostEpa = base.getHostEpa();
        this._hypervisorEpa = base.getHypervisorEpa();
        this._imageId = base.getImageId();
        this._interface = base.getInterface();
        this._internalConnectionPoint = base.getInternalConnectionPoint();
        this._managementIp = base.getManagementIp();
        this._name = base.getName();
        this._operationalStatus = base.getOperationalStatus();
        this._placementGroupsInfo = base.getPlacementGroupsInfo();
        this._supplementalBootData = base.getSupplementalBootData();
        this._uniqueShortName = base.getUniqueShortName();
        this._vduConfiguration = base.getVduConfiguration();
        this._vduIdRef = base.getVduIdRef();
        this._vimId = base.getVimId();
        this._vmFlavor = base.getVmFlavor();
        this._vmManagementIp = base.getVmManagementIp();
        this._volumes = base.getVolumes();
        this._vswitchEpa = base.getVswitchEpa();
        if (base instanceof VdurImpl) {
            VdurImpl impl = (VdurImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.Vdur> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.Vdur>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.PlacementGroupInfo</li>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.HostEpa</li>
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
        if (arg instanceof ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.PlacementGroupInfo) {
            this._placementGroupsInfo = ((ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.PlacementGroupInfo)arg).getPlacementGroupsInfo();
            isValidArg = true;
        }
        if (arg instanceof ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.HostEpa) {
            this._hostEpa = ((ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.HostEpa)arg).getHostEpa();
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
              "expected one of: [org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.PlacementGroupInfo, org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.HostEpa, org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.VswitchEpa, org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.HypervisorEpa, org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.GuestEpa, org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.SupplementalBootData, org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.VmFlavor] \n" +
              "but was: " + arg
            );
        }
    }

    public Uri getConsoleUrl() {
        return _consoleUrl;
    }
    
    public java.lang.String getFlavorId() {
        return _flavorId;
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
    
    public Uuid getId() {
        return _id;
    }
    
    public java.lang.String getImageId() {
        return _imageId;
    }
    
    public List<Interface> getInterface() {
        return _interface;
    }
    
    public List<InternalConnectionPoint> getInternalConnectionPoint() {
        return _internalConnectionPoint;
    }
    
    public VdurKey getKey() {
        return _key;
    }
    
    public IpAddress getManagementIp() {
        return _managementIp;
    }
    
    public java.lang.String getName() {
        return _name;
    }
    
    public VduOperationalStatus getOperationalStatus() {
        return _operationalStatus;
    }
    
    public List<PlacementGroupsInfo> getPlacementGroupsInfo() {
        return _placementGroupsInfo;
    }
    
    public SupplementalBootData getSupplementalBootData() {
        return _supplementalBootData;
    }
    
    public java.lang.String getUniqueShortName() {
        return _uniqueShortName;
    }
    
    public VduConfiguration getVduConfiguration() {
        return _vduConfiguration;
    }
    
    public java.lang.String getVduIdRef() {
        return _vduIdRef;
    }
    
    public java.lang.String getVimId() {
        return _vimId;
    }
    
    public VmFlavor getVmFlavor() {
        return _vmFlavor;
    }
    
    public IpAddress getVmManagementIp() {
        return _vmManagementIp;
    }
    
    public List<Volumes> getVolumes() {
        return _volumes;
    }
    
    public VswitchEpa getVswitchEpa() {
        return _vswitchEpa;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.Vdur>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public VdurBuilder setConsoleUrl(final Uri value) {
        this._consoleUrl = value;
        return this;
    }
    
     
    public VdurBuilder setFlavorId(final java.lang.String value) {
        this._flavorId = value;
        return this;
    }
    
     
    public VdurBuilder setGuestEpa(final GuestEpa value) {
        this._guestEpa = value;
        return this;
    }
    
     
    public VdurBuilder setHostEpa(final HostEpa value) {
        this._hostEpa = value;
        return this;
    }
    
     
    public VdurBuilder setHypervisorEpa(final HypervisorEpa value) {
        this._hypervisorEpa = value;
        return this;
    }
    
     
    public VdurBuilder setId(final Uuid value) {
        this._id = value;
        return this;
    }
    
     
    public VdurBuilder setImageId(final java.lang.String value) {
        this._imageId = value;
        return this;
    }
    
     
    public VdurBuilder setInterface(final List<Interface> value) {
        this._interface = value;
        return this;
    }
    
     
    public VdurBuilder setInternalConnectionPoint(final List<InternalConnectionPoint> value) {
        this._internalConnectionPoint = value;
        return this;
    }
    
     
    public VdurBuilder setKey(final VdurKey value) {
        this._key = value;
        return this;
    }
    
     
    public VdurBuilder setManagementIp(final IpAddress value) {
        this._managementIp = value;
        return this;
    }
    
     
    public VdurBuilder setName(final java.lang.String value) {
        this._name = value;
        return this;
    }
    
     
    public VdurBuilder setOperationalStatus(final VduOperationalStatus value) {
        this._operationalStatus = value;
        return this;
    }
    
     
    public VdurBuilder setPlacementGroupsInfo(final List<PlacementGroupsInfo> value) {
        this._placementGroupsInfo = value;
        return this;
    }
    
     
    public VdurBuilder setSupplementalBootData(final SupplementalBootData value) {
        this._supplementalBootData = value;
        return this;
    }
    
     
    public VdurBuilder setUniqueShortName(final java.lang.String value) {
        this._uniqueShortName = value;
        return this;
    }
    
     
    public VdurBuilder setVduConfiguration(final VduConfiguration value) {
        this._vduConfiguration = value;
        return this;
    }
    
     
    public VdurBuilder setVduIdRef(final java.lang.String value) {
        this._vduIdRef = value;
        return this;
    }
    
     
    public VdurBuilder setVimId(final java.lang.String value) {
        this._vimId = value;
        return this;
    }
    
     
    public VdurBuilder setVmFlavor(final VmFlavor value) {
        this._vmFlavor = value;
        return this;
    }
    
     
    public VdurBuilder setVmManagementIp(final IpAddress value) {
        this._vmManagementIp = value;
        return this;
    }
    
     
    public VdurBuilder setVolumes(final List<Volumes> value) {
        this._volumes = value;
        return this;
    }
    
     
    public VdurBuilder setVswitchEpa(final VswitchEpa value) {
        this._vswitchEpa = value;
        return this;
    }
    
    public VdurBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.Vdur>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.Vdur> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VdurBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.Vdur>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Vdur build() {
        return new VdurImpl(this);
    }

    private static final class VdurImpl implements Vdur {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.Vdur> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.Vdur.class;
        }

        private final Uri _consoleUrl;
        private final java.lang.String _flavorId;
        private final GuestEpa _guestEpa;
        private final HostEpa _hostEpa;
        private final HypervisorEpa _hypervisorEpa;
        private final Uuid _id;
        private final java.lang.String _imageId;
        private final List<Interface> _interface;
        private final List<InternalConnectionPoint> _internalConnectionPoint;
        private final VdurKey _key;
        private final IpAddress _managementIp;
        private final java.lang.String _name;
        private final VduOperationalStatus _operationalStatus;
        private final List<PlacementGroupsInfo> _placementGroupsInfo;
        private final SupplementalBootData _supplementalBootData;
        private final java.lang.String _uniqueShortName;
        private final VduConfiguration _vduConfiguration;
        private final java.lang.String _vduIdRef;
        private final java.lang.String _vimId;
        private final VmFlavor _vmFlavor;
        private final IpAddress _vmManagementIp;
        private final List<Volumes> _volumes;
        private final VswitchEpa _vswitchEpa;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.Vdur>>, Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.Vdur>> augmentation = Collections.emptyMap();

        private VdurImpl(VdurBuilder base) {
            if (base.getKey() == null) {
                this._key = new VdurKey(
                    base.getId()
                );
                this._id = base.getId();
            } else {
                this._key = base.getKey();
                this._id = _key.getId();
            }
            this._consoleUrl = base.getConsoleUrl();
            this._flavorId = base.getFlavorId();
            this._guestEpa = base.getGuestEpa();
            this._hostEpa = base.getHostEpa();
            this._hypervisorEpa = base.getHypervisorEpa();
            this._imageId = base.getImageId();
            this._interface = base.getInterface();
            this._internalConnectionPoint = base.getInternalConnectionPoint();
            this._managementIp = base.getManagementIp();
            this._name = base.getName();
            this._operationalStatus = base.getOperationalStatus();
            this._placementGroupsInfo = base.getPlacementGroupsInfo();
            this._supplementalBootData = base.getSupplementalBootData();
            this._uniqueShortName = base.getUniqueShortName();
            this._vduConfiguration = base.getVduConfiguration();
            this._vduIdRef = base.getVduIdRef();
            this._vimId = base.getVimId();
            this._vmFlavor = base.getVmFlavor();
            this._vmManagementIp = base.getVmManagementIp();
            this._volumes = base.getVolumes();
            this._vswitchEpa = base.getVswitchEpa();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.Vdur>>, Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.Vdur>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.Vdur>>, Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.Vdur>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public Uri getConsoleUrl() {
            return _consoleUrl;
        }
        
        @Override
        public java.lang.String getFlavorId() {
            return _flavorId;
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
        public Uuid getId() {
            return _id;
        }
        
        @Override
        public java.lang.String getImageId() {
            return _imageId;
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
        public VdurKey getKey() {
            return _key;
        }
        
        @Override
        public IpAddress getManagementIp() {
            return _managementIp;
        }
        
        @Override
        public java.lang.String getName() {
            return _name;
        }
        
        @Override
        public VduOperationalStatus getOperationalStatus() {
            return _operationalStatus;
        }
        
        @Override
        public List<PlacementGroupsInfo> getPlacementGroupsInfo() {
            return _placementGroupsInfo;
        }
        
        @Override
        public SupplementalBootData getSupplementalBootData() {
            return _supplementalBootData;
        }
        
        @Override
        public java.lang.String getUniqueShortName() {
            return _uniqueShortName;
        }
        
        @Override
        public VduConfiguration getVduConfiguration() {
            return _vduConfiguration;
        }
        
        @Override
        public java.lang.String getVduIdRef() {
            return _vduIdRef;
        }
        
        @Override
        public java.lang.String getVimId() {
            return _vimId;
        }
        
        @Override
        public VmFlavor getVmFlavor() {
            return _vmFlavor;
        }
        
        @Override
        public IpAddress getVmManagementIp() {
            return _vmManagementIp;
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
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.Vdur>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_consoleUrl);
            result = prime * result + Objects.hashCode(_flavorId);
            result = prime * result + Objects.hashCode(_guestEpa);
            result = prime * result + Objects.hashCode(_hostEpa);
            result = prime * result + Objects.hashCode(_hypervisorEpa);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_imageId);
            result = prime * result + Objects.hashCode(_interface);
            result = prime * result + Objects.hashCode(_internalConnectionPoint);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_managementIp);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_operationalStatus);
            result = prime * result + Objects.hashCode(_placementGroupsInfo);
            result = prime * result + Objects.hashCode(_supplementalBootData);
            result = prime * result + Objects.hashCode(_uniqueShortName);
            result = prime * result + Objects.hashCode(_vduConfiguration);
            result = prime * result + Objects.hashCode(_vduIdRef);
            result = prime * result + Objects.hashCode(_vimId);
            result = prime * result + Objects.hashCode(_vmFlavor);
            result = prime * result + Objects.hashCode(_vmManagementIp);
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
            if (!ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.Vdur.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.Vdur other = (ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.Vdur)obj;
            if (!Objects.equals(_consoleUrl, other.getConsoleUrl())) {
                return false;
            }
            if (!Objects.equals(_flavorId, other.getFlavorId())) {
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
            if (!Objects.equals(_imageId, other.getImageId())) {
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
            if (!Objects.equals(_managementIp, other.getManagementIp())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_operationalStatus, other.getOperationalStatus())) {
                return false;
            }
            if (!Objects.equals(_placementGroupsInfo, other.getPlacementGroupsInfo())) {
                return false;
            }
            if (!Objects.equals(_supplementalBootData, other.getSupplementalBootData())) {
                return false;
            }
            if (!Objects.equals(_uniqueShortName, other.getUniqueShortName())) {
                return false;
            }
            if (!Objects.equals(_vduConfiguration, other.getVduConfiguration())) {
                return false;
            }
            if (!Objects.equals(_vduIdRef, other.getVduIdRef())) {
                return false;
            }
            if (!Objects.equals(_vimId, other.getVimId())) {
                return false;
            }
            if (!Objects.equals(_vmFlavor, other.getVmFlavor())) {
                return false;
            }
            if (!Objects.equals(_vmManagementIp, other.getVmManagementIp())) {
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
                VdurImpl otherImpl = (VdurImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.Vdur>>, Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.Vdur>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Vdur [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_consoleUrl != null) {
                builder.append("_consoleUrl=");
                builder.append(_consoleUrl);
                builder.append(", ");
            }
            if (_flavorId != null) {
                builder.append("_flavorId=");
                builder.append(_flavorId);
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
            if (_imageId != null) {
                builder.append("_imageId=");
                builder.append(_imageId);
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
            if (_managementIp != null) {
                builder.append("_managementIp=");
                builder.append(_managementIp);
                builder.append(", ");
            }
            if (_name != null) {
                builder.append("_name=");
                builder.append(_name);
                builder.append(", ");
            }
            if (_operationalStatus != null) {
                builder.append("_operationalStatus=");
                builder.append(_operationalStatus);
                builder.append(", ");
            }
            if (_placementGroupsInfo != null) {
                builder.append("_placementGroupsInfo=");
                builder.append(_placementGroupsInfo);
                builder.append(", ");
            }
            if (_supplementalBootData != null) {
                builder.append("_supplementalBootData=");
                builder.append(_supplementalBootData);
                builder.append(", ");
            }
            if (_uniqueShortName != null) {
                builder.append("_uniqueShortName=");
                builder.append(_uniqueShortName);
                builder.append(", ");
            }
            if (_vduConfiguration != null) {
                builder.append("_vduConfiguration=");
                builder.append(_vduConfiguration);
                builder.append(", ");
            }
            if (_vduIdRef != null) {
                builder.append("_vduIdRef=");
                builder.append(_vduIdRef);
                builder.append(", ");
            }
            if (_vimId != null) {
                builder.append("_vimId=");
                builder.append(_vimId);
                builder.append(", ");
            }
            if (_vmFlavor != null) {
                builder.append("_vmFlavor=");
                builder.append(_vmFlavor);
                builder.append(", ");
            }
            if (_vmManagementIp != null) {
                builder.append("_vmManagementIp=");
                builder.append(_vmManagementIp);
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
