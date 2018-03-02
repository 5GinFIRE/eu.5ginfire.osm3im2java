package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;

import java.util.HashMap;

import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;

import com.fasterxml.jackson.annotation.JsonProperty;

import http.riftio.vnfd.base.rev170228.vnfd.descriptor.VduBuilder;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.GuestEpa.CpuPinningPolicy;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.GuestEpa.CpuThreadPinningPolicy;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.GuestEpa.MempageSize;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.NumaPolicy;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.PcieDevice;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.NumaAware;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.NumaAwareBuilder;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.NumaNodePolicy;

import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.GuestEpa} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.GuestEpa
 *
 */
public class GuestEpaBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.GuestEpa> {

    private CpuPinningPolicy _cpuPinningPolicy;
    private CpuThreadPinningPolicy _cpuThreadPinningPolicy;
    private MempageSize _mempageSize;
    private NumaPolicy _numaPolicy;
    private List<PcieDevice> _pcieDevice;
    private java.lang.Boolean _trustedExecution;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.GuestEpa>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.GuestEpa>> augmentation = Collections.emptyMap();

    public GuestEpaBuilder() {
    }

    public GuestEpaBuilder(GuestEpa base) {
        this._cpuPinningPolicy = base.getCpuPinningPolicy();
        this._cpuThreadPinningPolicy = base.getCpuThreadPinningPolicy();
        this._mempageSize = base.getMempageSize();
        this._numaPolicy = base.getNumaPolicy();
        this._pcieDevice = base.getPcieDevice();
        this._trustedExecution = base.isTrustedExecution();
        if (base instanceof GuestEpaImpl) {
            GuestEpaImpl impl = (GuestEpaImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.GuestEpa> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.GuestEpa>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public CpuPinningPolicy getCpuPinningPolicy() {
        return _cpuPinningPolicy;
    }
    
    public CpuThreadPinningPolicy getCpuThreadPinningPolicy() {
        return _cpuThreadPinningPolicy;
    }
    
    public MempageSize getMempageSize() {
        return _mempageSize;
    }
    
    public NumaPolicy getNumaPolicy() {
        return _numaPolicy;
    }
    
    public List<PcieDevice> getPcieDevice() {
        return _pcieDevice;
    }
    
    public java.lang.Boolean isTrustedExecution() {
        return _trustedExecution;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.GuestEpa>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public GuestEpaBuilder setCpuPinningPolicy(final CpuPinningPolicy value) {
        this._cpuPinningPolicy = value;
        return this;
    }
    
     
    public GuestEpaBuilder setCpuThreadPinningPolicy(final CpuThreadPinningPolicy value) {
        this._cpuThreadPinningPolicy = value;
        return this;
    }
    
     
    public GuestEpaBuilder setMempageSize(final MempageSize value) {
        this._mempageSize = value;
        return this;
    }
    
     
    public GuestEpaBuilder setNumaPolicy(final NumaPolicy value) {
        this._numaPolicy = value;
        return this;
    }
    
     
    public GuestEpaBuilder setPcieDevice(final List<PcieDevice> value) {
        this._pcieDevice = value;
        return this;
    }
    
     
    public GuestEpaBuilder setTrustedExecution(final java.lang.Boolean value) {
        this._trustedExecution = value;
        return this;
    }
    
    public GuestEpaBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.GuestEpa>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.GuestEpa> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public GuestEpaBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.GuestEpa>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public GuestEpa build() {
        return new GuestEpaImpl(this);
    }

    public static final class GuestEpaImpl implements GuestEpa {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.GuestEpa> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.GuestEpa.class;
        }

        @JsonProperty("cpu-pinning-policy")
        private final CpuPinningPolicy _cpuPinningPolicy;
        @JsonProperty("cpu-thread-pinning-policy")
        private final CpuThreadPinningPolicy _cpuThreadPinningPolicy;
        @JsonProperty("mempage-size")
        private final MempageSize _mempageSize;
        @JsonProperty("numa-node-policy")
        private  NumaPolicy _numaPolicy;
        private final List<PcieDevice> _pcieDevice;
        private final java.lang.Boolean _trustedExecution;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.GuestEpa>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.GuestEpa>> augmentation = Collections.emptyMap();

        private GuestEpaImpl(GuestEpaBuilder base) {
            this._cpuPinningPolicy = base.getCpuPinningPolicy();
            this._cpuThreadPinningPolicy = base.getCpuThreadPinningPolicy();
            this._mempageSize = base.getMempageSize();
            this._numaPolicy = base.getNumaPolicy();
            this._pcieDevice = base.getPcieDevice();
            this._trustedExecution = base.isTrustedExecution();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.GuestEpa>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.GuestEpa>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.GuestEpa>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.GuestEpa>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }
        
        public GuestEpaImpl(){
        	this( new GuestEpaBuilder() );
        }
        
        @JsonProperty("numa-node-policy")
        public void setNumaNodePolicy(NumaNodePolicy s) {
        	_numaPolicy = new NumaAwareBuilder().setNumaNodePolicy(s).build();
        }

        @Override
        public CpuPinningPolicy getCpuPinningPolicy() {
            return _cpuPinningPolicy;
        }
        
        @Override
        public CpuThreadPinningPolicy getCpuThreadPinningPolicy() {
            return _cpuThreadPinningPolicy;
        }
        
        @Override
        public MempageSize getMempageSize() {
            return _mempageSize;
        }
        
        @Override
        public NumaPolicy getNumaPolicy() {
            return _numaPolicy;
        }
        
        @Override
        public List<PcieDevice> getPcieDevice() {
            return _pcieDevice;
        }
        
        @Override
        public java.lang.Boolean isTrustedExecution() {
            return _trustedExecution;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.GuestEpa>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_cpuPinningPolicy);
            result = prime * result + Objects.hashCode(_cpuThreadPinningPolicy);
            result = prime * result + Objects.hashCode(_mempageSize);
            result = prime * result + Objects.hashCode(_numaPolicy);
            result = prime * result + Objects.hashCode(_pcieDevice);
            result = prime * result + Objects.hashCode(_trustedExecution);
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
            if (!ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.GuestEpa.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.GuestEpa other = (ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.GuestEpa)obj;
            if (!Objects.equals(_cpuPinningPolicy, other.getCpuPinningPolicy())) {
                return false;
            }
            if (!Objects.equals(_cpuThreadPinningPolicy, other.getCpuThreadPinningPolicy())) {
                return false;
            }
            if (!Objects.equals(_mempageSize, other.getMempageSize())) {
                return false;
            }
            if (!Objects.equals(_numaPolicy, other.getNumaPolicy())) {
                return false;
            }
            if (!Objects.equals(_pcieDevice, other.getPcieDevice())) {
                return false;
            }
            if (!Objects.equals(_trustedExecution, other.isTrustedExecution())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                GuestEpaImpl otherImpl = (GuestEpaImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.GuestEpa>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.GuestEpa>> e : augmentation.entrySet()) {
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
            java.lang.String name = "GuestEpa [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_cpuPinningPolicy != null) {
                builder.append("_cpuPinningPolicy=");
                builder.append(_cpuPinningPolicy);
                builder.append(", ");
            }
            if (_cpuThreadPinningPolicy != null) {
                builder.append("_cpuThreadPinningPolicy=");
                builder.append(_cpuThreadPinningPolicy);
                builder.append(", ");
            }
            if (_mempageSize != null) {
                builder.append("_mempageSize=");
                builder.append(_mempageSize);
                builder.append(", ");
            }
            if (_numaPolicy != null) {
                builder.append("_numaPolicy=");
                builder.append(_numaPolicy);
                builder.append(", ");
            }
            if (_pcieDevice != null) {
                builder.append("_pcieDevice=");
                builder.append(_pcieDevice);
                builder.append(", ");
            }
            if (_trustedExecution != null) {
                builder.append("_trustedExecution=");
                builder.append(_trustedExecution);
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
