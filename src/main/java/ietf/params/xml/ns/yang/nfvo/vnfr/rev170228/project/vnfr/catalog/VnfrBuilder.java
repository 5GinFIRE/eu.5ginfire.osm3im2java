package ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;

import java.util.List;
import java.util.Collections;

import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.ietf.inet.types.rev130715.Uri;
import ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.HttpEndpoint;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.MonitoringParam;
import ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.VnfOperationalStatus;
import ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.placement.group.info.PlacementGroupsInfo;
import ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.Vnfr.ConfigStatus;
import ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.CloudConfig;
import ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.ConnectionPoint;
import ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.InternalVlr;
import ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.MgmtInterface;
import ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.Vdur;
import ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.VnfConfiguration;
import ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.Vnfd;

import java.util.Objects;
import java.math.BigInteger;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.Vnfr} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.Vnfr
 *
 */
public class VnfrBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.Vnfr> {

    private CloudConfig _cloudConfig;
    private ConfigStatus _configStatus;
    private List<ConnectionPoint> _connectionPoint;
    private java.lang.Long _createTime;
    private Uri _dashboardUrl;
    private java.lang.String _description;
    private List<HttpEndpoint> _httpEndpoint;
    private Uuid _id;
    private List<InternalVlr> _internalVlr;
    private VnfrKey _key;
    private BigInteger _memberVnfIndexRef;
    private MgmtInterface _mgmtInterface;
    private List<MonitoringParam> _monitoringParam;
    private java.lang.String _name;
    private Uuid _nsrIdRef;
    private VnfOperationalStatus _operationalStatus;
    private List<PlacementGroupsInfo> _placementGroupsInfo;
    private java.lang.String _shortName;
    private java.lang.Long _uptime;
    private List<Vdur> _vdur;
    private java.lang.String _vendor;
    private java.lang.String _version;
    private VnfConfiguration _vnfConfiguration;
    private Vnfd _vnfd;
    private java.lang.String _vnfdRef;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.Vnfr>>, Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.Vnfr>> augmentation = Collections.emptyMap();

    public VnfrBuilder() {
    }
    public VnfrBuilder(ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.MonitoringParam arg) {
        this._httpEndpoint = arg.getHttpEndpoint();
        this._monitoringParam = arg.getMonitoringParam();
    }
    public VnfrBuilder(ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.PlacementGroupInfo arg) {
        this._placementGroupsInfo = arg.getPlacementGroupsInfo();
    }

    public VnfrBuilder(Vnfr base) {
        if (base.getKey() == null) {
            this._key = new VnfrKey(
                base.getId()
            );
            this._id = base.getId();
        } else {
            this._key = base.getKey();
            this._id = _key.getId();
        }
        this._cloudConfig = base.getCloudConfig();
        this._configStatus = base.getConfigStatus();
        this._connectionPoint = base.getConnectionPoint();
        this._createTime = base.getCreateTime();
        this._dashboardUrl = base.getDashboardUrl();
        this._description = base.getDescription();
        this._httpEndpoint = base.getHttpEndpoint();
        this._internalVlr = base.getInternalVlr();
        this._memberVnfIndexRef = base.getMemberVnfIndexRef();
        this._mgmtInterface = base.getMgmtInterface();
        this._monitoringParam = base.getMonitoringParam();
        this._name = base.getName();
        this._nsrIdRef = base.getNsrIdRef();
        this._operationalStatus = base.getOperationalStatus();
        this._placementGroupsInfo = base.getPlacementGroupsInfo();
        this._shortName = base.getShortName();
        this._uptime = base.getUptime();
        this._vdur = base.getVdur();
        this._vendor = base.getVendor();
        this._version = base.getVersion();
        this._vnfConfiguration = base.getVnfConfiguration();
        this._vnfd = base.getVnfd();
        this._vnfdRef = base.getVnfdRef();
        if (base instanceof VnfrImpl) {
            VnfrImpl impl = (VnfrImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.Vnfr> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.Vnfr>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.PlacementGroupInfo</li>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.MonitoringParam</li>
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
        if (arg instanceof ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.MonitoringParam) {
            this._httpEndpoint = ((ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.MonitoringParam)arg).getHttpEndpoint();
            this._monitoringParam = ((ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.MonitoringParam)arg).getMonitoringParam();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.PlacementGroupInfo, org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.MonitoringParam] \n" +
              "but was: " + arg
            );
        }
    }

    public CloudConfig getCloudConfig() {
        return _cloudConfig;
    }
    
    public ConfigStatus getConfigStatus() {
        return _configStatus;
    }
    
    public List<ConnectionPoint> getConnectionPoint() {
        return _connectionPoint;
    }
    
    public java.lang.Long getCreateTime() {
        return _createTime;
    }
    
    public Uri getDashboardUrl() {
        return _dashboardUrl;
    }
    
    public java.lang.String getDescription() {
        return _description;
    }
    
    public List<HttpEndpoint> getHttpEndpoint() {
        return _httpEndpoint;
    }
    
    public Uuid getId() {
        return _id;
    }
    
    public List<InternalVlr> getInternalVlr() {
        return _internalVlr;
    }
    
    public VnfrKey getKey() {
        return _key;
    }
    
    public BigInteger getMemberVnfIndexRef() {
        return _memberVnfIndexRef;
    }
    
    public MgmtInterface getMgmtInterface() {
        return _mgmtInterface;
    }
    
    public List<MonitoringParam> getMonitoringParam() {
        return _monitoringParam;
    }
    
    public java.lang.String getName() {
        return _name;
    }
    
    public Uuid getNsrIdRef() {
        return _nsrIdRef;
    }
    
    public VnfOperationalStatus getOperationalStatus() {
        return _operationalStatus;
    }
    
    public List<PlacementGroupsInfo> getPlacementGroupsInfo() {
        return _placementGroupsInfo;
    }
    
    public java.lang.String getShortName() {
        return _shortName;
    }
    
    public java.lang.Long getUptime() {
        return _uptime;
    }
    
    public List<Vdur> getVdur() {
        return _vdur;
    }
    
    public java.lang.String getVendor() {
        return _vendor;
    }
    
    public java.lang.String getVersion() {
        return _version;
    }
    
    public VnfConfiguration getVnfConfiguration() {
        return _vnfConfiguration;
    }
    
    public Vnfd getVnfd() {
        return _vnfd;
    }
    
    public java.lang.String getVnfdRef() {
        return _vnfdRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.Vnfr>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public VnfrBuilder setCloudConfig(final CloudConfig value) {
        this._cloudConfig = value;
        return this;
    }
    
     
    public VnfrBuilder setConfigStatus(final ConfigStatus value) {
        this._configStatus = value;
        return this;
    }
    
     
    public VnfrBuilder setConnectionPoint(final List<ConnectionPoint> value) {
        this._connectionPoint = value;
        return this;
    }
    
     
     private static void checkCreateTimeRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..4294967295]].", value));
     }
    
    public VnfrBuilder setCreateTime(final java.lang.Long value) {
    if (value != null) {
        checkCreateTimeRange(value);
    }
        this._createTime = value;
        return this;
    }
    
     
    public VnfrBuilder setDashboardUrl(final Uri value) {
        this._dashboardUrl = value;
        return this;
    }
    
     
    public VnfrBuilder setDescription(final java.lang.String value) {
        this._description = value;
        return this;
    }
    
     
    public VnfrBuilder setHttpEndpoint(final List<HttpEndpoint> value) {
        this._httpEndpoint = value;
        return this;
    }
    
     
    public VnfrBuilder setId(final Uuid value) {
        this._id = value;
        return this;
    }
    
     
    public VnfrBuilder setInternalVlr(final List<InternalVlr> value) {
        this._internalVlr = value;
        return this;
    }
    
     
    public VnfrBuilder setKey(final VnfrKey value) {
        this._key = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKMEMBERVNFINDEXREFRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKMEMBERVNFINDEXREFRANGE_RANGES = a;
     }
     private static void checkMemberVnfIndexRefRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKMEMBERVNFINDEXREFRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKMEMBERVNFINDEXREFRANGE_RANGES)));
     }
    
    public VnfrBuilder setMemberVnfIndexRef(final BigInteger value) {
    if (value != null) {
        checkMemberVnfIndexRefRange(value);
    }
        this._memberVnfIndexRef = value;
        return this;
    }
    
     
    public VnfrBuilder setMgmtInterface(final MgmtInterface value) {
        this._mgmtInterface = value;
        return this;
    }
    
     
    public VnfrBuilder setMonitoringParam(final List<MonitoringParam> value) {
        this._monitoringParam = value;
        return this;
    }
    
     
    public VnfrBuilder setName(final java.lang.String value) {
        this._name = value;
        return this;
    }
    
     
    public VnfrBuilder setNsrIdRef(final Uuid value) {
        this._nsrIdRef = value;
        return this;
    }
    
     
    public VnfrBuilder setOperationalStatus(final VnfOperationalStatus value) {
        this._operationalStatus = value;
        return this;
    }
    
     
    public VnfrBuilder setPlacementGroupsInfo(final List<PlacementGroupsInfo> value) {
        this._placementGroupsInfo = value;
        return this;
    }
    
     
    public VnfrBuilder setShortName(final java.lang.String value) {
        this._shortName = value;
        return this;
    }
    
     
     private static void checkUptimeRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..4294967295]].", value));
     }
    
    public VnfrBuilder setUptime(final java.lang.Long value) {
    if (value != null) {
        checkUptimeRange(value);
    }
        this._uptime = value;
        return this;
    }
    
     
    public VnfrBuilder setVdur(final List<Vdur> value) {
        this._vdur = value;
        return this;
    }
    
     
    public VnfrBuilder setVendor(final java.lang.String value) {
        this._vendor = value;
        return this;
    }
    
     
    public VnfrBuilder setVersion(final java.lang.String value) {
        this._version = value;
        return this;
    }
    
     
    public VnfrBuilder setVnfConfiguration(final VnfConfiguration value) {
        this._vnfConfiguration = value;
        return this;
    }
    
     
    public VnfrBuilder setVnfd(final Vnfd value) {
        this._vnfd = value;
        return this;
    }
    
     
     private static void check_vnfdRefLength(final String value) {
         final int length = value.length();
         if (length >= 1 && length <= 63) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[1..63]].", value));
     }
    
    public VnfrBuilder setVnfdRef(final java.lang.String value) {
    if (value != null) {
        check_vnfdRefLength(value);
    }
        this._vnfdRef = value;
        return this;
    }
    
    public VnfrBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.Vnfr>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.Vnfr> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VnfrBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.Vnfr>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Vnfr build() {
        return new VnfrImpl(this);
    }

    private static final class VnfrImpl implements Vnfr {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.Vnfr> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.Vnfr.class;
        }

        private final CloudConfig _cloudConfig;
        private final ConfigStatus _configStatus;
        private final List<ConnectionPoint> _connectionPoint;
        private final java.lang.Long _createTime;
        private final Uri _dashboardUrl;
        private final java.lang.String _description;
        private final List<HttpEndpoint> _httpEndpoint;
        private final Uuid _id;
        private final List<InternalVlr> _internalVlr;
        private final VnfrKey _key;
        private final BigInteger _memberVnfIndexRef;
        private final MgmtInterface _mgmtInterface;
        private final List<MonitoringParam> _monitoringParam;
        private final java.lang.String _name;
        private final Uuid _nsrIdRef;
        private final VnfOperationalStatus _operationalStatus;
        private final List<PlacementGroupsInfo> _placementGroupsInfo;
        private final java.lang.String _shortName;
        private final java.lang.Long _uptime;
        private final List<Vdur> _vdur;
        private final java.lang.String _vendor;
        private final java.lang.String _version;
        private final VnfConfiguration _vnfConfiguration;
        private final Vnfd _vnfd;
        private final java.lang.String _vnfdRef;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.Vnfr>>, Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.Vnfr>> augmentation = Collections.emptyMap();

        private VnfrImpl(VnfrBuilder base) {
            if (base.getKey() == null) {
                this._key = new VnfrKey(
                    base.getId()
                );
                this._id = base.getId();
            } else {
                this._key = base.getKey();
                this._id = _key.getId();
            }
            this._cloudConfig = base.getCloudConfig();
            this._configStatus = base.getConfigStatus();
            this._connectionPoint = base.getConnectionPoint();
            this._createTime = base.getCreateTime();
            this._dashboardUrl = base.getDashboardUrl();
            this._description = base.getDescription();
            this._httpEndpoint = base.getHttpEndpoint();
            this._internalVlr = base.getInternalVlr();
            this._memberVnfIndexRef = base.getMemberVnfIndexRef();
            this._mgmtInterface = base.getMgmtInterface();
            this._monitoringParam = base.getMonitoringParam();
            this._name = base.getName();
            this._nsrIdRef = base.getNsrIdRef();
            this._operationalStatus = base.getOperationalStatus();
            this._placementGroupsInfo = base.getPlacementGroupsInfo();
            this._shortName = base.getShortName();
            this._uptime = base.getUptime();
            this._vdur = base.getVdur();
            this._vendor = base.getVendor();
            this._version = base.getVersion();
            this._vnfConfiguration = base.getVnfConfiguration();
            this._vnfd = base.getVnfd();
            this._vnfdRef = base.getVnfdRef();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.Vnfr>>, Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.Vnfr>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.Vnfr>>, Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.Vnfr>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public CloudConfig getCloudConfig() {
            return _cloudConfig;
        }
        
        @Override
        public ConfigStatus getConfigStatus() {
            return _configStatus;
        }
        
        @Override
        public List<ConnectionPoint> getConnectionPoint() {
            return _connectionPoint;
        }
        
        @Override
        public java.lang.Long getCreateTime() {
            return _createTime;
        }
        
        @Override
        public Uri getDashboardUrl() {
            return _dashboardUrl;
        }
        
        @Override
        public java.lang.String getDescription() {
            return _description;
        }
        
        @Override
        public List<HttpEndpoint> getHttpEndpoint() {
            return _httpEndpoint;
        }
        
        @Override
        public Uuid getId() {
            return _id;
        }
        
        @Override
        public List<InternalVlr> getInternalVlr() {
            return _internalVlr;
        }
        
        @Override
        public VnfrKey getKey() {
            return _key;
        }
        
        @Override
        public BigInteger getMemberVnfIndexRef() {
            return _memberVnfIndexRef;
        }
        
        @Override
        public MgmtInterface getMgmtInterface() {
            return _mgmtInterface;
        }
        
        @Override
        public List<MonitoringParam> getMonitoringParam() {
            return _monitoringParam;
        }
        
        @Override
        public java.lang.String getName() {
            return _name;
        }
        
        @Override
        public Uuid getNsrIdRef() {
            return _nsrIdRef;
        }
        
        @Override
        public VnfOperationalStatus getOperationalStatus() {
            return _operationalStatus;
        }
        
        @Override
        public List<PlacementGroupsInfo> getPlacementGroupsInfo() {
            return _placementGroupsInfo;
        }
        
        @Override
        public java.lang.String getShortName() {
            return _shortName;
        }
        
        @Override
        public java.lang.Long getUptime() {
            return _uptime;
        }
        
        @Override
        public List<Vdur> getVdur() {
            return _vdur;
        }
        
        @Override
        public java.lang.String getVendor() {
            return _vendor;
        }
        
        @Override
        public java.lang.String getVersion() {
            return _version;
        }
        
        @Override
        public VnfConfiguration getVnfConfiguration() {
            return _vnfConfiguration;
        }
        
        @Override
        public Vnfd getVnfd() {
            return _vnfd;
        }
        
        @Override
        public java.lang.String getVnfdRef() {
            return _vnfdRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.Vnfr>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_cloudConfig);
            result = prime * result + Objects.hashCode(_configStatus);
            result = prime * result + Objects.hashCode(_connectionPoint);
            result = prime * result + Objects.hashCode(_createTime);
            result = prime * result + Objects.hashCode(_dashboardUrl);
            result = prime * result + Objects.hashCode(_description);
            result = prime * result + Objects.hashCode(_httpEndpoint);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_internalVlr);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_memberVnfIndexRef);
            result = prime * result + Objects.hashCode(_mgmtInterface);
            result = prime * result + Objects.hashCode(_monitoringParam);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_nsrIdRef);
            result = prime * result + Objects.hashCode(_operationalStatus);
            result = prime * result + Objects.hashCode(_placementGroupsInfo);
            result = prime * result + Objects.hashCode(_shortName);
            result = prime * result + Objects.hashCode(_uptime);
            result = prime * result + Objects.hashCode(_vdur);
            result = prime * result + Objects.hashCode(_vendor);
            result = prime * result + Objects.hashCode(_version);
            result = prime * result + Objects.hashCode(_vnfConfiguration);
            result = prime * result + Objects.hashCode(_vnfd);
            result = prime * result + Objects.hashCode(_vnfdRef);
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
            if (!ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.Vnfr.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.Vnfr other = (ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.Vnfr)obj;
            if (!Objects.equals(_cloudConfig, other.getCloudConfig())) {
                return false;
            }
            if (!Objects.equals(_configStatus, other.getConfigStatus())) {
                return false;
            }
            if (!Objects.equals(_connectionPoint, other.getConnectionPoint())) {
                return false;
            }
            if (!Objects.equals(_createTime, other.getCreateTime())) {
                return false;
            }
            if (!Objects.equals(_dashboardUrl, other.getDashboardUrl())) {
                return false;
            }
            if (!Objects.equals(_description, other.getDescription())) {
                return false;
            }
            if (!Objects.equals(_httpEndpoint, other.getHttpEndpoint())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_internalVlr, other.getInternalVlr())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_memberVnfIndexRef, other.getMemberVnfIndexRef())) {
                return false;
            }
            if (!Objects.equals(_mgmtInterface, other.getMgmtInterface())) {
                return false;
            }
            if (!Objects.equals(_monitoringParam, other.getMonitoringParam())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_nsrIdRef, other.getNsrIdRef())) {
                return false;
            }
            if (!Objects.equals(_operationalStatus, other.getOperationalStatus())) {
                return false;
            }
            if (!Objects.equals(_placementGroupsInfo, other.getPlacementGroupsInfo())) {
                return false;
            }
            if (!Objects.equals(_shortName, other.getShortName())) {
                return false;
            }
            if (!Objects.equals(_uptime, other.getUptime())) {
                return false;
            }
            if (!Objects.equals(_vdur, other.getVdur())) {
                return false;
            }
            if (!Objects.equals(_vendor, other.getVendor())) {
                return false;
            }
            if (!Objects.equals(_version, other.getVersion())) {
                return false;
            }
            if (!Objects.equals(_vnfConfiguration, other.getVnfConfiguration())) {
                return false;
            }
            if (!Objects.equals(_vnfd, other.getVnfd())) {
                return false;
            }
            if (!Objects.equals(_vnfdRef, other.getVnfdRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VnfrImpl otherImpl = (VnfrImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.Vnfr>>, Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.Vnfr>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Vnfr [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_cloudConfig != null) {
                builder.append("_cloudConfig=");
                builder.append(_cloudConfig);
                builder.append(", ");
            }
            if (_configStatus != null) {
                builder.append("_configStatus=");
                builder.append(_configStatus);
                builder.append(", ");
            }
            if (_connectionPoint != null) {
                builder.append("_connectionPoint=");
                builder.append(_connectionPoint);
                builder.append(", ");
            }
            if (_createTime != null) {
                builder.append("_createTime=");
                builder.append(_createTime);
                builder.append(", ");
            }
            if (_dashboardUrl != null) {
                builder.append("_dashboardUrl=");
                builder.append(_dashboardUrl);
                builder.append(", ");
            }
            if (_description != null) {
                builder.append("_description=");
                builder.append(_description);
                builder.append(", ");
            }
            if (_httpEndpoint != null) {
                builder.append("_httpEndpoint=");
                builder.append(_httpEndpoint);
                builder.append(", ");
            }
            if (_id != null) {
                builder.append("_id=");
                builder.append(_id);
                builder.append(", ");
            }
            if (_internalVlr != null) {
                builder.append("_internalVlr=");
                builder.append(_internalVlr);
                builder.append(", ");
            }
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
            if (_mgmtInterface != null) {
                builder.append("_mgmtInterface=");
                builder.append(_mgmtInterface);
                builder.append(", ");
            }
            if (_monitoringParam != null) {
                builder.append("_monitoringParam=");
                builder.append(_monitoringParam);
                builder.append(", ");
            }
            if (_name != null) {
                builder.append("_name=");
                builder.append(_name);
                builder.append(", ");
            }
            if (_nsrIdRef != null) {
                builder.append("_nsrIdRef=");
                builder.append(_nsrIdRef);
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
            if (_shortName != null) {
                builder.append("_shortName=");
                builder.append(_shortName);
                builder.append(", ");
            }
            if (_uptime != null) {
                builder.append("_uptime=");
                builder.append(_uptime);
                builder.append(", ");
            }
            if (_vdur != null) {
                builder.append("_vdur=");
                builder.append(_vdur);
                builder.append(", ");
            }
            if (_vendor != null) {
                builder.append("_vendor=");
                builder.append(_vendor);
                builder.append(", ");
            }
            if (_version != null) {
                builder.append("_version=");
                builder.append(_version);
                builder.append(", ");
            }
            if (_vnfConfiguration != null) {
                builder.append("_vnfConfiguration=");
                builder.append(_vnfConfiguration);
                builder.append(", ");
            }
            if (_vnfd != null) {
                builder.append("_vnfd=");
                builder.append(_vnfd);
                builder.append(", ");
            }
            if (_vnfdRef != null) {
                builder.append("_vnfdRef=");
                builder.append(_vnfdRef);
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
