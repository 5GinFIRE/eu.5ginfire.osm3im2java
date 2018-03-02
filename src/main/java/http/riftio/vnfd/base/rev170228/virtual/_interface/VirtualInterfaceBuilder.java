package http.riftio.vnfd.base.rev170228.virtual._interface;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import com.fasterxml.jackson.annotation.JsonProperty;

import http.riftio.vnfd.base.rev170228.virtual._interface.VirtualInterface.Type;
import ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.VnfdBuilder;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.math.BigInteger;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link http.riftio.vnfd.base.rev170228.virtual._interface.VirtualInterface} instances.
 * 
 * @see http.riftio.vnfd.base.rev170228.virtual._interface.VirtualInterface
 *
 */
public class VirtualInterfaceBuilder implements Builder<http.riftio.vnfd.base.rev170228.virtual._interface.VirtualInterface> {

    private BigInteger _bandwidth;
    private Type _type;
    private java.lang.String _vpci;

    Map<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.virtual._interface.VirtualInterface>>, Augmentation<http.riftio.vnfd.base.rev170228.virtual._interface.VirtualInterface>> augmentation = Collections.emptyMap();

    public VirtualInterfaceBuilder() {
    }

    public VirtualInterfaceBuilder(VirtualInterface base) {
        this._bandwidth = base.getBandwidth();
        this._type = base.getType();
        this._vpci = base.getVpci();
        if (base instanceof VirtualInterfaceImpl) {
            VirtualInterfaceImpl impl = (VirtualInterfaceImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<http.riftio.vnfd.base.rev170228.virtual._interface.VirtualInterface> casted =(AugmentationHolder<http.riftio.vnfd.base.rev170228.virtual._interface.VirtualInterface>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public BigInteger getBandwidth() {
        return _bandwidth;
    }
    
    public Type getType() {
        return _type;
    }
    
    public java.lang.String getVpci() {
        return _vpci;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<http.riftio.vnfd.base.rev170228.virtual._interface.VirtualInterface>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKBANDWIDTHRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKBANDWIDTHRANGE_RANGES = a;
     }
     private static void checkBandwidthRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKBANDWIDTHRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKBANDWIDTHRANGE_RANGES)));
     }
    
    public VirtualInterfaceBuilder setBandwidth(final BigInteger value) {
    if (value != null) {
        checkBandwidthRange(value);
    }
        this._bandwidth = value;
        return this;
    }
    
     
    public VirtualInterfaceBuilder setType(final Type value) {
        this._type = value;
        return this;
    }
    
     
    public VirtualInterfaceBuilder setVpci(final java.lang.String value) {
        this._vpci = value;
        return this;
    }
    
    public VirtualInterfaceBuilder addAugmentation(java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.virtual._interface.VirtualInterface>> augmentationType, Augmentation<http.riftio.vnfd.base.rev170228.virtual._interface.VirtualInterface> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VirtualInterfaceBuilder removeAugmentation(java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.virtual._interface.VirtualInterface>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public VirtualInterface build() {
        return new VirtualInterfaceImpl(this);
    }

    public static final class VirtualInterfaceImpl implements VirtualInterface {

        @Override
        public java.lang.Class<http.riftio.vnfd.base.rev170228.virtual._interface.VirtualInterface> getImplementedInterface() {
            return http.riftio.vnfd.base.rev170228.virtual._interface.VirtualInterface.class;
        }

        @JsonProperty("bandwidth")
        private final BigInteger _bandwidth;
        private Type _type;
        @JsonProperty("vpci")
        private final java.lang.String _vpci;

        private Map<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.virtual._interface.VirtualInterface>>, Augmentation<http.riftio.vnfd.base.rev170228.virtual._interface.VirtualInterface>> augmentation = Collections.emptyMap();

        private VirtualInterfaceImpl(VirtualInterfaceBuilder base) {
            this._bandwidth = base.getBandwidth();
            this._type = base.getType();
            this._vpci = base.getVpci();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.virtual._interface.VirtualInterface>>, Augmentation<http.riftio.vnfd.base.rev170228.virtual._interface.VirtualInterface>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.virtual._interface.VirtualInterface>>, Augmentation<http.riftio.vnfd.base.rev170228.virtual._interface.VirtualInterface>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }
        
        @JsonProperty("type")
        public void setType(String s) {
        	if(s.equals("VIRTIO")) {
        	  _type = Type.VIRTIO;
        	}else if(s.equals("OM-MGMT")) {
        		_type = Type.OMMGMT;
        	}else if(s.equals("SR-IOV")) {
        		_type = Type.SRIOV;
        	}else if(s.equals("E1000")) {
        		_type = Type.E1000;
        	}else if(s.equals("RTL8139")) {
        		_type = Type.RTL8139;
        	}else if(s.equals("PCNET")) {
        		_type = Type.PCNET;
        	}
        }
        
        public VirtualInterfaceImpl(){
          	this( new VirtualInterfaceBuilder() );
        }

        @Override
        public BigInteger getBandwidth() {
            return _bandwidth;
        }
        
        @Override
        public Type getType() {
            return _type;
        }
        
        @Override
        public java.lang.String getVpci() {
            return _vpci;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<http.riftio.vnfd.base.rev170228.virtual._interface.VirtualInterface>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_bandwidth);
            result = prime * result + Objects.hashCode(_type);
            result = prime * result + Objects.hashCode(_vpci);
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
            if (!http.riftio.vnfd.base.rev170228.virtual._interface.VirtualInterface.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            http.riftio.vnfd.base.rev170228.virtual._interface.VirtualInterface other = (http.riftio.vnfd.base.rev170228.virtual._interface.VirtualInterface)obj;
            if (!Objects.equals(_bandwidth, other.getBandwidth())) {
                return false;
            }
            if (!Objects.equals(_type, other.getType())) {
                return false;
            }
            if (!Objects.equals(_vpci, other.getVpci())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VirtualInterfaceImpl otherImpl = (VirtualInterfaceImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.virtual._interface.VirtualInterface>>, Augmentation<http.riftio.vnfd.base.rev170228.virtual._interface.VirtualInterface>> e : augmentation.entrySet()) {
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
            java.lang.String name = "VirtualInterface [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_bandwidth != null) {
                builder.append("_bandwidth=");
                builder.append(_bandwidth);
                builder.append(", ");
            }
            if (_type != null) {
                builder.append("_type=");
                builder.append(_type);
                builder.append(", ");
            }
            if (_vpci != null) {
                builder.append("_vpci=");
                builder.append(_vpci);
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
