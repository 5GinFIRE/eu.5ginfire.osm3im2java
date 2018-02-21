package ietf.params.xml.ns.yang.nfvo.vlr.rev170208.project.vlr.catalog;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.VirtualLinkType;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.info.IpProfileParams;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.provider.network.ProviderNetwork;
import ietf.params.xml.ns.yang.nfvo.vlr.rev170208.project.vlr.catalog.Vlr.OperationalStatus;
import ietf.params.xml.ns.yang.nfvo.vlr.rev170208.project.vlr.catalog.Vlr.Status;

import java.util.Objects;
import java.math.BigInteger;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.vlr.rev170208.project.vlr.catalog.Vlr} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.vlr.rev170208.project.vlr.catalog.Vlr
 *
 */
public class VlrBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.vlr.rev170208.project.vlr.catalog.Vlr> {

    private java.lang.Long _createTime;
    private java.lang.String _description;
    private Uuid _id;
    private IpProfileParams _ipProfileParams;
    private VlrKey _key;
    private BigInteger _leafBandwidth;
    private java.lang.String _name;
    private java.lang.String _networkId;
    private Uuid _nsrIdRef;
    private OperationalStatus _operationalStatus;
    private ProviderNetwork _providerNetwork;
    private Uuid _resId;
    private BigInteger _rootBandwidth;
    private java.lang.String _shortName;
    private Status _status;
    private VirtualLinkType _type;
    private java.lang.Long _uptime;
    private java.lang.String _vendor;
    private java.lang.String _version;
    private java.lang.String _vimNetworkName;
    private java.lang.String _vldRef;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vlr.rev170208.project.vlr.catalog.Vlr>>, Augmentation<ietf.params.xml.ns.yang.nfvo.vlr.rev170208.project.vlr.catalog.Vlr>> augmentation = Collections.emptyMap();

    public VlrBuilder() {
    }
    public VlrBuilder(ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.IpProfileInfo arg) {
        this._ipProfileParams = arg.getIpProfileParams();
    }
    public VlrBuilder(ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ProviderNetwork arg) {
        this._providerNetwork = arg.getProviderNetwork();
    }

    public VlrBuilder(Vlr base) {
        if (base.getKey() == null) {
            this._key = new VlrKey(
                base.getId()
            );
            this._id = base.getId();
        } else {
            this._key = base.getKey();
            this._id = _key.getId();
        }
        this._createTime = base.getCreateTime();
        this._description = base.getDescription();
        this._ipProfileParams = base.getIpProfileParams();
        this._leafBandwidth = base.getLeafBandwidth();
        this._name = base.getName();
        this._networkId = base.getNetworkId();
        this._nsrIdRef = base.getNsrIdRef();
        this._operationalStatus = base.getOperationalStatus();
        this._providerNetwork = base.getProviderNetwork();
        this._resId = base.getResId();
        this._rootBandwidth = base.getRootBandwidth();
        this._shortName = base.getShortName();
        this._status = base.getStatus();
        this._type = base.getType();
        this._uptime = base.getUptime();
        this._vendor = base.getVendor();
        this._version = base.getVersion();
        this._vimNetworkName = base.getVimNetworkName();
        this._vldRef = base.getVldRef();
        if (base instanceof VlrImpl) {
            VlrImpl impl = (VlrImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.vlr.rev170208.project.vlr.catalog.Vlr> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.vlr.rev170208.project.vlr.catalog.Vlr>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.IpProfileInfo</li>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ProviderNetwork</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.IpProfileInfo) {
            this._ipProfileParams = ((ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.IpProfileInfo)arg).getIpProfileParams();
            isValidArg = true;
        }
        if (arg instanceof ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ProviderNetwork) {
            this._providerNetwork = ((ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ProviderNetwork)arg).getProviderNetwork();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.IpProfileInfo, org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ProviderNetwork] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Long getCreateTime() {
        return _createTime;
    }
    
    public java.lang.String getDescription() {
        return _description;
    }
    
    public Uuid getId() {
        return _id;
    }
    
    public IpProfileParams getIpProfileParams() {
        return _ipProfileParams;
    }
    
    public VlrKey getKey() {
        return _key;
    }
    
    public BigInteger getLeafBandwidth() {
        return _leafBandwidth;
    }
    
    public java.lang.String getName() {
        return _name;
    }
    
    public java.lang.String getNetworkId() {
        return _networkId;
    }
    
    public Uuid getNsrIdRef() {
        return _nsrIdRef;
    }
    
    public OperationalStatus getOperationalStatus() {
        return _operationalStatus;
    }
    
    public ProviderNetwork getProviderNetwork() {
        return _providerNetwork;
    }
    
    public Uuid getResId() {
        return _resId;
    }
    
    public BigInteger getRootBandwidth() {
        return _rootBandwidth;
    }
    
    public java.lang.String getShortName() {
        return _shortName;
    }
    
    public Status getStatus() {
        return _status;
    }
    
    public VirtualLinkType getType() {
        return _type;
    }
    
    public java.lang.Long getUptime() {
        return _uptime;
    }
    
    public java.lang.String getVendor() {
        return _vendor;
    }
    
    public java.lang.String getVersion() {
        return _version;
    }
    
    public java.lang.String getVimNetworkName() {
        return _vimNetworkName;
    }
    
    public java.lang.String getVldRef() {
        return _vldRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.vlr.rev170208.project.vlr.catalog.Vlr>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static void checkCreateTimeRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..4294967295]].", value));
     }
    
    public VlrBuilder setCreateTime(final java.lang.Long value) {
    if (value != null) {
        checkCreateTimeRange(value);
    }
        this._createTime = value;
        return this;
    }
    
     
    public VlrBuilder setDescription(final java.lang.String value) {
        this._description = value;
        return this;
    }
    
     
    public VlrBuilder setId(final Uuid value) {
        this._id = value;
        return this;
    }
    
     
    public VlrBuilder setIpProfileParams(final IpProfileParams value) {
        this._ipProfileParams = value;
        return this;
    }
    
     
    public VlrBuilder setKey(final VlrKey value) {
        this._key = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKLEAFBANDWIDTHRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKLEAFBANDWIDTHRANGE_RANGES = a;
     }
     private static void checkLeafBandwidthRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKLEAFBANDWIDTHRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKLEAFBANDWIDTHRANGE_RANGES)));
     }
    
    public VlrBuilder setLeafBandwidth(final BigInteger value) {
    if (value != null) {
        checkLeafBandwidthRange(value);
    }
        this._leafBandwidth = value;
        return this;
    }
    
     
    public VlrBuilder setName(final java.lang.String value) {
        this._name = value;
        return this;
    }
    
     
    public VlrBuilder setNetworkId(final java.lang.String value) {
        this._networkId = value;
        return this;
    }
    
     
    public VlrBuilder setNsrIdRef(final Uuid value) {
        this._nsrIdRef = value;
        return this;
    }
    
     
    public VlrBuilder setOperationalStatus(final OperationalStatus value) {
        this._operationalStatus = value;
        return this;
    }
    
     
    public VlrBuilder setProviderNetwork(final ProviderNetwork value) {
        this._providerNetwork = value;
        return this;
    }
    
     
    public VlrBuilder setResId(final Uuid value) {
        this._resId = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKROOTBANDWIDTHRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKROOTBANDWIDTHRANGE_RANGES = a;
     }
     private static void checkRootBandwidthRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKROOTBANDWIDTHRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKROOTBANDWIDTHRANGE_RANGES)));
     }
    
    public VlrBuilder setRootBandwidth(final BigInteger value) {
    if (value != null) {
        checkRootBandwidthRange(value);
    }
        this._rootBandwidth = value;
        return this;
    }
    
     
    public VlrBuilder setShortName(final java.lang.String value) {
        this._shortName = value;
        return this;
    }
    
     
    public VlrBuilder setStatus(final Status value) {
        this._status = value;
        return this;
    }
    
     
    public VlrBuilder setType(final VirtualLinkType value) {
        this._type = value;
        return this;
    }
    
     
     private static void checkUptimeRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..4294967295]].", value));
     }
    
    public VlrBuilder setUptime(final java.lang.Long value) {
    if (value != null) {
        checkUptimeRange(value);
    }
        this._uptime = value;
        return this;
    }
    
     
    public VlrBuilder setVendor(final java.lang.String value) {
        this._vendor = value;
        return this;
    }
    
     
    public VlrBuilder setVersion(final java.lang.String value) {
        this._version = value;
        return this;
    }
    
     
    public VlrBuilder setVimNetworkName(final java.lang.String value) {
        this._vimNetworkName = value;
        return this;
    }
    
     
    public VlrBuilder setVldRef(final java.lang.String value) {
        this._vldRef = value;
        return this;
    }
    
    public VlrBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vlr.rev170208.project.vlr.catalog.Vlr>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.vlr.rev170208.project.vlr.catalog.Vlr> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VlrBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vlr.rev170208.project.vlr.catalog.Vlr>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Vlr build() {
        return new VlrImpl(this);
    }

    private static final class VlrImpl implements Vlr {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.vlr.rev170208.project.vlr.catalog.Vlr> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.vlr.rev170208.project.vlr.catalog.Vlr.class;
        }

        private final java.lang.Long _createTime;
        private final java.lang.String _description;
        private final Uuid _id;
        private final IpProfileParams _ipProfileParams;
        private final VlrKey _key;
        private final BigInteger _leafBandwidth;
        private final java.lang.String _name;
        private final java.lang.String _networkId;
        private final Uuid _nsrIdRef;
        private final OperationalStatus _operationalStatus;
        private final ProviderNetwork _providerNetwork;
        private final Uuid _resId;
        private final BigInteger _rootBandwidth;
        private final java.lang.String _shortName;
        private final Status _status;
        private final VirtualLinkType _type;
        private final java.lang.Long _uptime;
        private final java.lang.String _vendor;
        private final java.lang.String _version;
        private final java.lang.String _vimNetworkName;
        private final java.lang.String _vldRef;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vlr.rev170208.project.vlr.catalog.Vlr>>, Augmentation<ietf.params.xml.ns.yang.nfvo.vlr.rev170208.project.vlr.catalog.Vlr>> augmentation = Collections.emptyMap();

        private VlrImpl(VlrBuilder base) {
            if (base.getKey() == null) {
                this._key = new VlrKey(
                    base.getId()
                );
                this._id = base.getId();
            } else {
                this._key = base.getKey();
                this._id = _key.getId();
            }
            this._createTime = base.getCreateTime();
            this._description = base.getDescription();
            this._ipProfileParams = base.getIpProfileParams();
            this._leafBandwidth = base.getLeafBandwidth();
            this._name = base.getName();
            this._networkId = base.getNetworkId();
            this._nsrIdRef = base.getNsrIdRef();
            this._operationalStatus = base.getOperationalStatus();
            this._providerNetwork = base.getProviderNetwork();
            this._resId = base.getResId();
            this._rootBandwidth = base.getRootBandwidth();
            this._shortName = base.getShortName();
            this._status = base.getStatus();
            this._type = base.getType();
            this._uptime = base.getUptime();
            this._vendor = base.getVendor();
            this._version = base.getVersion();
            this._vimNetworkName = base.getVimNetworkName();
            this._vldRef = base.getVldRef();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vlr.rev170208.project.vlr.catalog.Vlr>>, Augmentation<ietf.params.xml.ns.yang.nfvo.vlr.rev170208.project.vlr.catalog.Vlr>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vlr.rev170208.project.vlr.catalog.Vlr>>, Augmentation<ietf.params.xml.ns.yang.nfvo.vlr.rev170208.project.vlr.catalog.Vlr>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Long getCreateTime() {
            return _createTime;
        }
        
        @Override
        public java.lang.String getDescription() {
            return _description;
        }
        
        @Override
        public Uuid getId() {
            return _id;
        }
        
        @Override
        public IpProfileParams getIpProfileParams() {
            return _ipProfileParams;
        }
        
        @Override
        public VlrKey getKey() {
            return _key;
        }
        
        @Override
        public BigInteger getLeafBandwidth() {
            return _leafBandwidth;
        }
        
        @Override
        public java.lang.String getName() {
            return _name;
        }
        
        @Override
        public java.lang.String getNetworkId() {
            return _networkId;
        }
        
        @Override
        public Uuid getNsrIdRef() {
            return _nsrIdRef;
        }
        
        @Override
        public OperationalStatus getOperationalStatus() {
            return _operationalStatus;
        }
        
        @Override
        public ProviderNetwork getProviderNetwork() {
            return _providerNetwork;
        }
        
        @Override
        public Uuid getResId() {
            return _resId;
        }
        
        @Override
        public BigInteger getRootBandwidth() {
            return _rootBandwidth;
        }
        
        @Override
        public java.lang.String getShortName() {
            return _shortName;
        }
        
        @Override
        public Status getStatus() {
            return _status;
        }
        
        @Override
        public VirtualLinkType getType() {
            return _type;
        }
        
        @Override
        public java.lang.Long getUptime() {
            return _uptime;
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
        public java.lang.String getVimNetworkName() {
            return _vimNetworkName;
        }
        
        @Override
        public java.lang.String getVldRef() {
            return _vldRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.vlr.rev170208.project.vlr.catalog.Vlr>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_createTime);
            result = prime * result + Objects.hashCode(_description);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_ipProfileParams);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_leafBandwidth);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_networkId);
            result = prime * result + Objects.hashCode(_nsrIdRef);
            result = prime * result + Objects.hashCode(_operationalStatus);
            result = prime * result + Objects.hashCode(_providerNetwork);
            result = prime * result + Objects.hashCode(_resId);
            result = prime * result + Objects.hashCode(_rootBandwidth);
            result = prime * result + Objects.hashCode(_shortName);
            result = prime * result + Objects.hashCode(_status);
            result = prime * result + Objects.hashCode(_type);
            result = prime * result + Objects.hashCode(_uptime);
            result = prime * result + Objects.hashCode(_vendor);
            result = prime * result + Objects.hashCode(_version);
            result = prime * result + Objects.hashCode(_vimNetworkName);
            result = prime * result + Objects.hashCode(_vldRef);
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
            if (!ietf.params.xml.ns.yang.nfvo.vlr.rev170208.project.vlr.catalog.Vlr.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.vlr.rev170208.project.vlr.catalog.Vlr other = (ietf.params.xml.ns.yang.nfvo.vlr.rev170208.project.vlr.catalog.Vlr)obj;
            if (!Objects.equals(_createTime, other.getCreateTime())) {
                return false;
            }
            if (!Objects.equals(_description, other.getDescription())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_ipProfileParams, other.getIpProfileParams())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_leafBandwidth, other.getLeafBandwidth())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_networkId, other.getNetworkId())) {
                return false;
            }
            if (!Objects.equals(_nsrIdRef, other.getNsrIdRef())) {
                return false;
            }
            if (!Objects.equals(_operationalStatus, other.getOperationalStatus())) {
                return false;
            }
            if (!Objects.equals(_providerNetwork, other.getProviderNetwork())) {
                return false;
            }
            if (!Objects.equals(_resId, other.getResId())) {
                return false;
            }
            if (!Objects.equals(_rootBandwidth, other.getRootBandwidth())) {
                return false;
            }
            if (!Objects.equals(_shortName, other.getShortName())) {
                return false;
            }
            if (!Objects.equals(_status, other.getStatus())) {
                return false;
            }
            if (!Objects.equals(_type, other.getType())) {
                return false;
            }
            if (!Objects.equals(_uptime, other.getUptime())) {
                return false;
            }
            if (!Objects.equals(_vendor, other.getVendor())) {
                return false;
            }
            if (!Objects.equals(_version, other.getVersion())) {
                return false;
            }
            if (!Objects.equals(_vimNetworkName, other.getVimNetworkName())) {
                return false;
            }
            if (!Objects.equals(_vldRef, other.getVldRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VlrImpl otherImpl = (VlrImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vlr.rev170208.project.vlr.catalog.Vlr>>, Augmentation<ietf.params.xml.ns.yang.nfvo.vlr.rev170208.project.vlr.catalog.Vlr>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Vlr [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_createTime != null) {
                builder.append("_createTime=");
                builder.append(_createTime);
                builder.append(", ");
            }
            if (_description != null) {
                builder.append("_description=");
                builder.append(_description);
                builder.append(", ");
            }
            if (_id != null) {
                builder.append("_id=");
                builder.append(_id);
                builder.append(", ");
            }
            if (_ipProfileParams != null) {
                builder.append("_ipProfileParams=");
                builder.append(_ipProfileParams);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_leafBandwidth != null) {
                builder.append("_leafBandwidth=");
                builder.append(_leafBandwidth);
                builder.append(", ");
            }
            if (_name != null) {
                builder.append("_name=");
                builder.append(_name);
                builder.append(", ");
            }
            if (_networkId != null) {
                builder.append("_networkId=");
                builder.append(_networkId);
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
            if (_providerNetwork != null) {
                builder.append("_providerNetwork=");
                builder.append(_providerNetwork);
                builder.append(", ");
            }
            if (_resId != null) {
                builder.append("_resId=");
                builder.append(_resId);
                builder.append(", ");
            }
            if (_rootBandwidth != null) {
                builder.append("_rootBandwidth=");
                builder.append(_rootBandwidth);
                builder.append(", ");
            }
            if (_shortName != null) {
                builder.append("_shortName=");
                builder.append(_shortName);
                builder.append(", ");
            }
            if (_status != null) {
                builder.append("_status=");
                builder.append(_status);
                builder.append(", ");
            }
            if (_type != null) {
                builder.append("_type=");
                builder.append(_type);
                builder.append(", ");
            }
            if (_uptime != null) {
                builder.append("_uptime=");
                builder.append(_uptime);
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
            if (_vimNetworkName != null) {
                builder.append("_vimNetworkName=");
                builder.append(_vimNetworkName);
                builder.append(", ");
            }
            if (_vldRef != null) {
                builder.append("_vldRef=");
                builder.append(_vldRef);
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
