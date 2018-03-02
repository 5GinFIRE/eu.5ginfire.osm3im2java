package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.HostEpa.CpuArch;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.HostEpa.CpuModel;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.HostEpa.CpuVendor;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.host.epa.CpuFeature;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.host.epa.OmCpuFeature;

import java.util.Objects;
import java.math.BigInteger;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.HostEpa} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.HostEpa
 *
 */
public class HostEpaBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.HostEpa> {

    private CpuArch _cpuArch;
    private BigInteger _cpuCoreCount;
    private BigInteger _cpuCoreThreadCount;
    private List<CpuFeature> _cpuFeature;
    private CpuModel _cpuModel;
    private BigInteger _cpuSocketCount;
    private CpuVendor _cpuVendor;
    private List<OmCpuFeature> _omCpuFeature;
    private java.lang.String _omCpuModelString;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.HostEpa>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.HostEpa>> augmentation = Collections.emptyMap();

    public HostEpaBuilder() {
    }

    public HostEpaBuilder(HostEpa base) {
        this._cpuArch = base.getCpuArch();
        this._cpuCoreCount = base.getCpuCoreCount();
        this._cpuCoreThreadCount = base.getCpuCoreThreadCount();
        this._cpuFeature = base.getCpuFeature();
        this._cpuModel = base.getCpuModel();
        this._cpuSocketCount = base.getCpuSocketCount();
        this._cpuVendor = base.getCpuVendor();
        this._omCpuFeature = base.getOmCpuFeature();
        this._omCpuModelString = base.getOmCpuModelString();
        if (base instanceof HostEpaImpl) {
            HostEpaImpl impl = (HostEpaImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.HostEpa> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.HostEpa>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public CpuArch getCpuArch() {
        return _cpuArch;
    }
    
    public BigInteger getCpuCoreCount() {
        return _cpuCoreCount;
    }
    
    public BigInteger getCpuCoreThreadCount() {
        return _cpuCoreThreadCount;
    }
    
    public List<CpuFeature> getCpuFeature() {
        return _cpuFeature;
    }
    
    public CpuModel getCpuModel() {
        return _cpuModel;
    }
    
    public BigInteger getCpuSocketCount() {
        return _cpuSocketCount;
    }
    
    public CpuVendor getCpuVendor() {
        return _cpuVendor;
    }
    
    public List<OmCpuFeature> getOmCpuFeature() {
        return _omCpuFeature;
    }
    
    public java.lang.String getOmCpuModelString() {
        return _omCpuModelString;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.HostEpa>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public HostEpaBuilder setCpuArch(final CpuArch value) {
        this._cpuArch = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKCPUCORECOUNTRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKCPUCORECOUNTRANGE_RANGES = a;
     }
     private static void checkCpuCoreCountRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKCPUCORECOUNTRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKCPUCORECOUNTRANGE_RANGES)));
     }
    
    public HostEpaBuilder setCpuCoreCount(final BigInteger value) {
    if (value != null) {
        checkCpuCoreCountRange(value);
    }
        this._cpuCoreCount = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKCPUCORETHREADCOUNTRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKCPUCORETHREADCOUNTRANGE_RANGES = a;
     }
     private static void checkCpuCoreThreadCountRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKCPUCORETHREADCOUNTRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKCPUCORETHREADCOUNTRANGE_RANGES)));
     }
    
    public HostEpaBuilder setCpuCoreThreadCount(final BigInteger value) {
    if (value != null) {
        checkCpuCoreThreadCountRange(value);
    }
        this._cpuCoreThreadCount = value;
        return this;
    }
    
     
    public HostEpaBuilder setCpuFeature(final List<CpuFeature> value) {
        this._cpuFeature = value;
        return this;
    }
    
     
    public HostEpaBuilder setCpuModel(final CpuModel value) {
        this._cpuModel = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKCPUSOCKETCOUNTRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKCPUSOCKETCOUNTRANGE_RANGES = a;
     }
     private static void checkCpuSocketCountRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKCPUSOCKETCOUNTRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKCPUSOCKETCOUNTRANGE_RANGES)));
     }
    
    public HostEpaBuilder setCpuSocketCount(final BigInteger value) {
    if (value != null) {
        checkCpuSocketCountRange(value);
    }
        this._cpuSocketCount = value;
        return this;
    }
    
     
    public HostEpaBuilder setCpuVendor(final CpuVendor value) {
        this._cpuVendor = value;
        return this;
    }
    
     
    public HostEpaBuilder setOmCpuFeature(final List<OmCpuFeature> value) {
        this._omCpuFeature = value;
        return this;
    }
    
     
    public HostEpaBuilder setOmCpuModelString(final java.lang.String value) {
        this._omCpuModelString = value;
        return this;
    }
    
    public HostEpaBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.HostEpa>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.HostEpa> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public HostEpaBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.HostEpa>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public HostEpa build() {
        return new HostEpaImpl(this);
    }

    private static final class HostEpaImpl implements HostEpa {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.HostEpa> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.HostEpa.class;
        }

        private final CpuArch _cpuArch;
        private final BigInteger _cpuCoreCount;
        private final BigInteger _cpuCoreThreadCount;
        private final List<CpuFeature> _cpuFeature;
        private final CpuModel _cpuModel;
        private final BigInteger _cpuSocketCount;
        private final CpuVendor _cpuVendor;
        private final List<OmCpuFeature> _omCpuFeature;
        private final java.lang.String _omCpuModelString;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.HostEpa>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.HostEpa>> augmentation = Collections.emptyMap();

        private HostEpaImpl(HostEpaBuilder base) {
            this._cpuArch = base.getCpuArch();
            this._cpuCoreCount = base.getCpuCoreCount();
            this._cpuCoreThreadCount = base.getCpuCoreThreadCount();
            this._cpuFeature = base.getCpuFeature();
            this._cpuModel = base.getCpuModel();
            this._cpuSocketCount = base.getCpuSocketCount();
            this._cpuVendor = base.getCpuVendor();
            this._omCpuFeature = base.getOmCpuFeature();
            this._omCpuModelString = base.getOmCpuModelString();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.HostEpa>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.HostEpa>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.HostEpa>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.HostEpa>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public CpuArch getCpuArch() {
            return _cpuArch;
        }
        
        @Override
        public BigInteger getCpuCoreCount() {
            return _cpuCoreCount;
        }
        
        @Override
        public BigInteger getCpuCoreThreadCount() {
            return _cpuCoreThreadCount;
        }
        
        @Override
        public List<CpuFeature> getCpuFeature() {
            return _cpuFeature;
        }
        
        @Override
        public CpuModel getCpuModel() {
            return _cpuModel;
        }
        
        @Override
        public BigInteger getCpuSocketCount() {
            return _cpuSocketCount;
        }
        
        @Override
        public CpuVendor getCpuVendor() {
            return _cpuVendor;
        }
        
        @Override
        public List<OmCpuFeature> getOmCpuFeature() {
            return _omCpuFeature;
        }
        
        @Override
        public java.lang.String getOmCpuModelString() {
            return _omCpuModelString;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.HostEpa>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_cpuArch);
            result = prime * result + Objects.hashCode(_cpuCoreCount);
            result = prime * result + Objects.hashCode(_cpuCoreThreadCount);
            result = prime * result + Objects.hashCode(_cpuFeature);
            result = prime * result + Objects.hashCode(_cpuModel);
            result = prime * result + Objects.hashCode(_cpuSocketCount);
            result = prime * result + Objects.hashCode(_cpuVendor);
            result = prime * result + Objects.hashCode(_omCpuFeature);
            result = prime * result + Objects.hashCode(_omCpuModelString);
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
            if (!ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.HostEpa.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.HostEpa other = (ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.HostEpa)obj;
            if (!Objects.equals(_cpuArch, other.getCpuArch())) {
                return false;
            }
            if (!Objects.equals(_cpuCoreCount, other.getCpuCoreCount())) {
                return false;
            }
            if (!Objects.equals(_cpuCoreThreadCount, other.getCpuCoreThreadCount())) {
                return false;
            }
            if (!Objects.equals(_cpuFeature, other.getCpuFeature())) {
                return false;
            }
            if (!Objects.equals(_cpuModel, other.getCpuModel())) {
                return false;
            }
            if (!Objects.equals(_cpuSocketCount, other.getCpuSocketCount())) {
                return false;
            }
            if (!Objects.equals(_cpuVendor, other.getCpuVendor())) {
                return false;
            }
            if (!Objects.equals(_omCpuFeature, other.getOmCpuFeature())) {
                return false;
            }
            if (!Objects.equals(_omCpuModelString, other.getOmCpuModelString())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                HostEpaImpl otherImpl = (HostEpaImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.HostEpa>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.HostEpa>> e : augmentation.entrySet()) {
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
            java.lang.String name = "HostEpa [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_cpuArch != null) {
                builder.append("_cpuArch=");
                builder.append(_cpuArch);
                builder.append(", ");
            }
            if (_cpuCoreCount != null) {
                builder.append("_cpuCoreCount=");
                builder.append(_cpuCoreCount);
                builder.append(", ");
            }
            if (_cpuCoreThreadCount != null) {
                builder.append("_cpuCoreThreadCount=");
                builder.append(_cpuCoreThreadCount);
                builder.append(", ");
            }
            if (_cpuFeature != null) {
                builder.append("_cpuFeature=");
                builder.append(_cpuFeature);
                builder.append(", ");
            }
            if (_cpuModel != null) {
                builder.append("_cpuModel=");
                builder.append(_cpuModel);
                builder.append(", ");
            }
            if (_cpuSocketCount != null) {
                builder.append("_cpuSocketCount=");
                builder.append(_cpuSocketCount);
                builder.append(", ");
            }
            if (_cpuVendor != null) {
                builder.append("_cpuVendor=");
                builder.append(_cpuVendor);
                builder.append(", ");
            }
            if (_omCpuFeature != null) {
                builder.append("_omCpuFeature=");
                builder.append(_omCpuFeature);
                builder.append(", ");
            }
            if (_omCpuModelString != null) {
                builder.append("_omCpuModelString=");
                builder.append(_omCpuModelString);
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
