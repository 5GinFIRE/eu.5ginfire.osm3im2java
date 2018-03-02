package http.riftio.vnfd.base.rev170228.vnfd.descriptor;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;

import com.fasterxml.jackson.annotation.JsonProperty;

import http.riftio.vnfd.base.rev170228.vnfd.descriptor.internal.vld.InitParams;
import http.riftio.vnfd.base.rev170228.vnfd.descriptor.internal.vld.InternalConnectionPoint;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.VirtualLinkType;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.provider.network.ProviderNetwork;
import ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.VnfdBuilder;

import java.util.Objects;
import java.math.BigInteger;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link http.riftio.vnfd.base.rev170228.vnfd.descriptor.InternalVld} instances.
 * 
 * @see http.riftio.vnfd.base.rev170228.vnfd.descriptor.InternalVld
 *
 */
public class InternalVldBuilder implements Builder<http.riftio.vnfd.base.rev170228.vnfd.descriptor.InternalVld> {

    private java.lang.String _description;
    private java.lang.String _id;
    private InitParams _initParams;
    private List<InternalConnectionPoint> _internalConnectionPoint;
    private InternalVldKey _key;
    private BigInteger _leafBandwidth;
    private java.lang.String _name;
    private ProviderNetwork _providerNetwork;
    private BigInteger _rootBandwidth;
    private java.lang.String _shortName;
    private VirtualLinkType _type;

    Map<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.InternalVld>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.InternalVld>> augmentation = Collections.emptyMap();

    public InternalVldBuilder() {
    }
    public InternalVldBuilder(ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ProviderNetwork arg) {
        this._providerNetwork = arg.getProviderNetwork();
    }

    public InternalVldBuilder(InternalVld base) {
        if (base.getKey() == null) {
            this._key = new InternalVldKey(
                base.getId()
            );
            this._id = base.getId();
        } else {
            this._key = base.getKey();
            this._id = _key.getId();
        }
        this._description = base.getDescription();
        this._initParams = base.getInitParams();
        this._internalConnectionPoint = base.getInternalConnectionPoint();
        this._leafBandwidth = base.getLeafBandwidth();
        this._name = base.getName();
        this._providerNetwork = base.getProviderNetwork();
        this._rootBandwidth = base.getRootBandwidth();
        this._shortName = base.getShortName();
        this._type = base.getType();
        if (base instanceof InternalVldImpl) {
            InternalVldImpl impl = (InternalVldImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<http.riftio.vnfd.base.rev170228.vnfd.descriptor.InternalVld> casted =(AugmentationHolder<http.riftio.vnfd.base.rev170228.vnfd.descriptor.InternalVld>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ProviderNetwork</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ProviderNetwork) {
            this._providerNetwork = ((ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ProviderNetwork)arg).getProviderNetwork();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ProviderNetwork] \n" +
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
    
    public List<InternalConnectionPoint> getInternalConnectionPoint() {
        return _internalConnectionPoint;
    }
    
    public InternalVldKey getKey() {
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
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.InternalVld>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public InternalVldBuilder setDescription(final java.lang.String value) {
        this._description = value;
        return this;
    }
    
     
    public InternalVldBuilder setId(final java.lang.String value) {
        this._id = value;
        return this;
    }
    
     
    public InternalVldBuilder setInitParams(final InitParams value) {
        this._initParams = value;
        return this;
    }
    
     
    public InternalVldBuilder setInternalConnectionPoint(final List<InternalConnectionPoint> value) {
        this._internalConnectionPoint = value;
        return this;
    }
    
     
    public InternalVldBuilder setKey(final InternalVldKey value) {
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
    
    public InternalVldBuilder setLeafBandwidth(final BigInteger value) {
    if (value != null) {
        checkLeafBandwidthRange(value);
    }
        this._leafBandwidth = value;
        return this;
    }
    
     
    public InternalVldBuilder setName(final java.lang.String value) {
        this._name = value;
        return this;
    }
    
     
    public InternalVldBuilder setProviderNetwork(final ProviderNetwork value) {
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
    
    public InternalVldBuilder setRootBandwidth(final BigInteger value) {
    if (value != null) {
        checkRootBandwidthRange(value);
    }
        this._rootBandwidth = value;
        return this;
    }
    
     
    public InternalVldBuilder setShortName(final java.lang.String value) {
        this._shortName = value;
        return this;
    }
    
     
    public InternalVldBuilder setType(final VirtualLinkType value) {
        this._type = value;
        return this;
    }
    
    public InternalVldBuilder addAugmentation(java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.InternalVld>> augmentationType, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.InternalVld> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public InternalVldBuilder removeAugmentation(java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.InternalVld>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public InternalVld build() {
        return new InternalVldImpl(this);
    }

    public static final class InternalVldImpl implements InternalVld {

        @Override
        public java.lang.Class<http.riftio.vnfd.base.rev170228.vnfd.descriptor.InternalVld> getImplementedInterface() {
            return http.riftio.vnfd.base.rev170228.vnfd.descriptor.InternalVld.class;
        }

        private final java.lang.String _description;
        @JsonProperty("id")
        private final java.lang.String _id;
        private final InitParams _initParams;
        @JsonProperty("internal-connection-point")
        private final List<InternalConnectionPoint> _internalConnectionPoint;
        private final InternalVldKey _key;
        private final BigInteger _leafBandwidth;
        @JsonProperty("name")
        private final java.lang.String _name;
        private final ProviderNetwork _providerNetwork;
        private final BigInteger _rootBandwidth;
        @JsonProperty("short-name")
        private final java.lang.String _shortName;
        @JsonProperty("type")
        private final VirtualLinkType _type;

        private Map<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.InternalVld>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.InternalVld>> augmentation = Collections.emptyMap();

        private InternalVldImpl(InternalVldBuilder base) {
            if (base.getKey() == null) {
                this._key = new InternalVldKey(
                    base.getId()
                );
                this._id = base.getId();
            } else {
                this._key = base.getKey();
                this._id = _key.getId();
            }
            this._description = base.getDescription();
            this._initParams = base.getInitParams();
            this._internalConnectionPoint = base.getInternalConnectionPoint();
            this._leafBandwidth = base.getLeafBandwidth();
            this._name = base.getName();
            this._providerNetwork = base.getProviderNetwork();
            this._rootBandwidth = base.getRootBandwidth();
            this._shortName = base.getShortName();
            this._type = base.getType();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.InternalVld>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.InternalVld>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.InternalVld>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.InternalVld>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }
        
        public InternalVldImpl(){
          	this( new InternalVldBuilder() );
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
        public List<InternalConnectionPoint> getInternalConnectionPoint() {
            return _internalConnectionPoint;
        }
        
        @Override
        public InternalVldKey getKey() {
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
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.InternalVld>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_internalConnectionPoint);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_leafBandwidth);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_providerNetwork);
            result = prime * result + Objects.hashCode(_rootBandwidth);
            result = prime * result + Objects.hashCode(_shortName);
            result = prime * result + Objects.hashCode(_type);
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
            if (!http.riftio.vnfd.base.rev170228.vnfd.descriptor.InternalVld.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            http.riftio.vnfd.base.rev170228.vnfd.descriptor.InternalVld other = (http.riftio.vnfd.base.rev170228.vnfd.descriptor.InternalVld)obj;
            if (!Objects.equals(_description, other.getDescription())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_initParams, other.getInitParams())) {
                return false;
            }
            if (!Objects.equals(_internalConnectionPoint, other.getInternalConnectionPoint())) {
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
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                InternalVldImpl otherImpl = (InternalVldImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.InternalVld>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.InternalVld>> e : augmentation.entrySet()) {
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
            java.lang.String name = "InternalVld [";
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
