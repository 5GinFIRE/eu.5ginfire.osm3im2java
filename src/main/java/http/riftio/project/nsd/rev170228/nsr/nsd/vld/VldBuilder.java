package http.riftio.project.nsd.rev170228.nsr.nsd.vld;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;

import http.riftio.nsd.base.rev170228.nsd.vld.common.InitParams;
import http.riftio.project.nsd.rev170228.nsr.nsd.vld.vld.VnfdConnectionPointRef;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.VirtualLinkType;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.provider.network.ProviderNetwork;

import java.util.Objects;
import java.math.BigInteger;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link http.riftio.project.nsd.rev170228.nsr.nsd.vld.Vld} instances.
 * 
 * @see http.riftio.project.nsd.rev170228.nsr.nsd.vld.Vld
 *
 */
public class VldBuilder implements Builder<http.riftio.project.nsd.rev170228.nsr.nsd.vld.Vld> {

    private java.lang.String _description;
    private java.lang.String _id;
    private InitParams _initParams;
    private VldKey _key;
    private BigInteger _leafBandwidth;
    private java.lang.String _name;
    private ProviderNetwork _providerNetwork;
    private BigInteger _rootBandwidth;
    private java.lang.String _shortName;
    private VirtualLinkType _type;
    private java.lang.String _vendor;
    private java.lang.String _version;
    private List<VnfdConnectionPointRef> _vnfdConnectionPointRef;
    private java.lang.Boolean _mgmtNetwork;

    Map<java.lang.Class<? extends Augmentation<http.riftio.project.nsd.rev170228.nsr.nsd.vld.Vld>>, Augmentation<http.riftio.project.nsd.rev170228.nsr.nsd.vld.Vld>> augmentation = Collections.emptyMap();

    public VldBuilder() {
    }
    public VldBuilder(http.riftio.nsd.base.rev170228.NsdVldCommon arg) {
        this._id = arg.getId();
        this._name = arg.getName();
        this._shortName = arg.getShortName();
        this._vendor = arg.getVendor();
        this._description = arg.getDescription();
        this._version = arg.getVersion();
        this._type = arg.getType();
        this._rootBandwidth = arg.getRootBandwidth();
        this._leafBandwidth = arg.getLeafBandwidth();
        this._mgmtNetwork = arg.isMgmtNetwork();
        this._initParams = arg.getInitParams();
        this._providerNetwork = arg.getProviderNetwork();
    }
    public VldBuilder(ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ProviderNetwork arg) {
        this._providerNetwork = arg.getProviderNetwork();
    }

    public VldBuilder(Vld base) {
        if (base.getKey() == null) {
            this._key = new VldKey(
                base.getId()
            );
            this._id = base.getId();
        } else {
            this._key = base.getKey();
            this._id = _key.getId();
        }
        this._description = base.getDescription();
        this._initParams = base.getInitParams();
        this._leafBandwidth = base.getLeafBandwidth();
        this._name = base.getName();
        this._providerNetwork = base.getProviderNetwork();
        this._rootBandwidth = base.getRootBandwidth();
        this._shortName = base.getShortName();
        this._type = base.getType();
        this._vendor = base.getVendor();
        this._version = base.getVersion();
        this._vnfdConnectionPointRef = base.getVnfdConnectionPointRef();
        this._mgmtNetwork = base.isMgmtNetwork();
        if (base instanceof VldImpl) {
            VldImpl impl = (VldImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<http.riftio.project.nsd.rev170228.nsr.nsd.vld.Vld> casted =(AugmentationHolder<http.riftio.project.nsd.rev170228.nsr.nsd.vld.Vld>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.nsd.base.rev170228.NsdVldCommon</li>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ProviderNetwork</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof http.riftio.nsd.base.rev170228.NsdVldCommon) {
            this._id = ((http.riftio.nsd.base.rev170228.NsdVldCommon)arg).getId();
            this._name = ((http.riftio.nsd.base.rev170228.NsdVldCommon)arg).getName();
            this._shortName = ((http.riftio.nsd.base.rev170228.NsdVldCommon)arg).getShortName();
            this._vendor = ((http.riftio.nsd.base.rev170228.NsdVldCommon)arg).getVendor();
            this._description = ((http.riftio.nsd.base.rev170228.NsdVldCommon)arg).getDescription();
            this._version = ((http.riftio.nsd.base.rev170228.NsdVldCommon)arg).getVersion();
            this._type = ((http.riftio.nsd.base.rev170228.NsdVldCommon)arg).getType();
            this._rootBandwidth = ((http.riftio.nsd.base.rev170228.NsdVldCommon)arg).getRootBandwidth();
            this._leafBandwidth = ((http.riftio.nsd.base.rev170228.NsdVldCommon)arg).getLeafBandwidth();
            this._mgmtNetwork = ((http.riftio.nsd.base.rev170228.NsdVldCommon)arg).isMgmtNetwork();
            this._initParams = ((http.riftio.nsd.base.rev170228.NsdVldCommon)arg).getInitParams();
            isValidArg = true;
        }
        if (arg instanceof ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ProviderNetwork) {
            this._providerNetwork = ((ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ProviderNetwork)arg).getProviderNetwork();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.nsd.base.rev170228.NsdVldCommon, org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ProviderNetwork] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.String getDescription() {
        return _description;
    }
    
    public java.lang.String getId() {
        return _id;
    }
    
    public InitParams getInitParams() {
        return _initParams;
    }
    
    public VldKey getKey() {
        return _key;
    }
    
    public BigInteger getLeafBandwidth() {
        return _leafBandwidth;
    }
    
    public java.lang.String getName() {
        return _name;
    }
    
    public ProviderNetwork getProviderNetwork() {
        return _providerNetwork;
    }
    
    public BigInteger getRootBandwidth() {
        return _rootBandwidth;
    }
    
    public java.lang.String getShortName() {
        return _shortName;
    }
    
    public VirtualLinkType getType() {
        return _type;
    }
    
    public java.lang.String getVendor() {
        return _vendor;
    }
    
    public java.lang.String getVersion() {
        return _version;
    }
    
    public List<VnfdConnectionPointRef> getVnfdConnectionPointRef() {
        return _vnfdConnectionPointRef;
    }
    
    public java.lang.Boolean isMgmtNetwork() {
        return _mgmtNetwork;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<http.riftio.project.nsd.rev170228.nsr.nsd.vld.Vld>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public VldBuilder setDescription(final java.lang.String value) {
        this._description = value;
        return this;
    }
    
     
    public VldBuilder setId(final java.lang.String value) {
        this._id = value;
        return this;
    }
    
     
    public VldBuilder setInitParams(final InitParams value) {
        this._initParams = value;
        return this;
    }
    
     
    public VldBuilder setKey(final VldKey value) {
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
    
    public VldBuilder setLeafBandwidth(final BigInteger value) {
    if (value != null) {
        checkLeafBandwidthRange(value);
    }
        this._leafBandwidth = value;
        return this;
    }
    
     
    public VldBuilder setName(final java.lang.String value) {
        this._name = value;
        return this;
    }
    
     
    public VldBuilder setProviderNetwork(final ProviderNetwork value) {
        this._providerNetwork = value;
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
    
    public VldBuilder setRootBandwidth(final BigInteger value) {
    if (value != null) {
        checkRootBandwidthRange(value);
    }
        this._rootBandwidth = value;
        return this;
    }
    
     
    public VldBuilder setShortName(final java.lang.String value) {
        this._shortName = value;
        return this;
    }
    
     
    public VldBuilder setType(final VirtualLinkType value) {
        this._type = value;
        return this;
    }
    
     
    public VldBuilder setVendor(final java.lang.String value) {
        this._vendor = value;
        return this;
    }
    
     
    public VldBuilder setVersion(final java.lang.String value) {
        this._version = value;
        return this;
    }
    
     
    public VldBuilder setVnfdConnectionPointRef(final List<VnfdConnectionPointRef> value) {
        this._vnfdConnectionPointRef = value;
        return this;
    }
    
     
    public VldBuilder setMgmtNetwork(final java.lang.Boolean value) {
        this._mgmtNetwork = value;
        return this;
    }
    
    public VldBuilder addAugmentation(java.lang.Class<? extends Augmentation<http.riftio.project.nsd.rev170228.nsr.nsd.vld.Vld>> augmentationType, Augmentation<http.riftio.project.nsd.rev170228.nsr.nsd.vld.Vld> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VldBuilder removeAugmentation(java.lang.Class<? extends Augmentation<http.riftio.project.nsd.rev170228.nsr.nsd.vld.Vld>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Vld build() {
        return new VldImpl(this);
    }

    private static final class VldImpl implements Vld {

        @Override
        public java.lang.Class<http.riftio.project.nsd.rev170228.nsr.nsd.vld.Vld> getImplementedInterface() {
            return http.riftio.project.nsd.rev170228.nsr.nsd.vld.Vld.class;
        }

        private final java.lang.String _description;
        private final java.lang.String _id;
        private final InitParams _initParams;
        private final VldKey _key;
        private final BigInteger _leafBandwidth;
        private final java.lang.String _name;
        private final ProviderNetwork _providerNetwork;
        private final BigInteger _rootBandwidth;
        private final java.lang.String _shortName;
        private final VirtualLinkType _type;
        private final java.lang.String _vendor;
        private final java.lang.String _version;
        private final List<VnfdConnectionPointRef> _vnfdConnectionPointRef;
        private final java.lang.Boolean _mgmtNetwork;

        private Map<java.lang.Class<? extends Augmentation<http.riftio.project.nsd.rev170228.nsr.nsd.vld.Vld>>, Augmentation<http.riftio.project.nsd.rev170228.nsr.nsd.vld.Vld>> augmentation = Collections.emptyMap();

        private VldImpl(VldBuilder base) {
            if (base.getKey() == null) {
                this._key = new VldKey(
                    base.getId()
                );
                this._id = base.getId();
            } else {
                this._key = base.getKey();
                this._id = _key.getId();
            }
            this._description = base.getDescription();
            this._initParams = base.getInitParams();
            this._leafBandwidth = base.getLeafBandwidth();
            this._name = base.getName();
            this._providerNetwork = base.getProviderNetwork();
            this._rootBandwidth = base.getRootBandwidth();
            this._shortName = base.getShortName();
            this._type = base.getType();
            this._vendor = base.getVendor();
            this._version = base.getVersion();
            this._vnfdConnectionPointRef = base.getVnfdConnectionPointRef();
            this._mgmtNetwork = base.isMgmtNetwork();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.project.nsd.rev170228.nsr.nsd.vld.Vld>>, Augmentation<http.riftio.project.nsd.rev170228.nsr.nsd.vld.Vld>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<http.riftio.project.nsd.rev170228.nsr.nsd.vld.Vld>>, Augmentation<http.riftio.project.nsd.rev170228.nsr.nsd.vld.Vld>>singletonMap(e.getKey(), e.getValue());
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
        public java.lang.String getId() {
            return _id;
        }
        
        @Override
        public InitParams getInitParams() {
            return _initParams;
        }
        
        @Override
        public VldKey getKey() {
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
        public ProviderNetwork getProviderNetwork() {
            return _providerNetwork;
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
        public VirtualLinkType getType() {
            return _type;
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
        public List<VnfdConnectionPointRef> getVnfdConnectionPointRef() {
            return _vnfdConnectionPointRef;
        }
        
        @Override
        public java.lang.Boolean isMgmtNetwork() {
            return _mgmtNetwork;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<http.riftio.project.nsd.rev170228.nsr.nsd.vld.Vld>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_initParams);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_leafBandwidth);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_providerNetwork);
            result = prime * result + Objects.hashCode(_rootBandwidth);
            result = prime * result + Objects.hashCode(_shortName);
            result = prime * result + Objects.hashCode(_type);
            result = prime * result + Objects.hashCode(_vendor);
            result = prime * result + Objects.hashCode(_version);
            result = prime * result + Objects.hashCode(_vnfdConnectionPointRef);
            result = prime * result + Objects.hashCode(_mgmtNetwork);
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
            if (!http.riftio.project.nsd.rev170228.nsr.nsd.vld.Vld.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            http.riftio.project.nsd.rev170228.nsr.nsd.vld.Vld other = (http.riftio.project.nsd.rev170228.nsr.nsd.vld.Vld)obj;
            if (!Objects.equals(_description, other.getDescription())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_initParams, other.getInitParams())) {
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
            if (!Objects.equals(_providerNetwork, other.getProviderNetwork())) {
                return false;
            }
            if (!Objects.equals(_rootBandwidth, other.getRootBandwidth())) {
                return false;
            }
            if (!Objects.equals(_shortName, other.getShortName())) {
                return false;
            }
            if (!Objects.equals(_type, other.getType())) {
                return false;
            }
            if (!Objects.equals(_vendor, other.getVendor())) {
                return false;
            }
            if (!Objects.equals(_version, other.getVersion())) {
                return false;
            }
            if (!Objects.equals(_vnfdConnectionPointRef, other.getVnfdConnectionPointRef())) {
                return false;
            }
            if (!Objects.equals(_mgmtNetwork, other.isMgmtNetwork())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VldImpl otherImpl = (VldImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.project.nsd.rev170228.nsr.nsd.vld.Vld>>, Augmentation<http.riftio.project.nsd.rev170228.nsr.nsd.vld.Vld>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Vld [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
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
            if (_initParams != null) {
                builder.append("_initParams=");
                builder.append(_initParams);
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
            if (_providerNetwork != null) {
                builder.append("_providerNetwork=");
                builder.append(_providerNetwork);
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
            if (_type != null) {
                builder.append("_type=");
                builder.append(_type);
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
            if (_vnfdConnectionPointRef != null) {
                builder.append("_vnfdConnectionPointRef=");
                builder.append(_vnfdConnectionPointRef);
                builder.append(", ");
            }
            if (_mgmtNetwork != null) {
                builder.append("_mgmtNetwork=");
                builder.append(_mgmtNetwork);
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
