package ietf.params.xml.ns.yang.nfvo.nsr.rev170208;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.math.BigInteger;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleOutOutput} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleOutOutput
 *
 */
public class ExecScaleOutOutputBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleOutOutput> {

    private BigInteger _instanceId;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleOutOutput>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleOutOutput>> augmentation = Collections.emptyMap();

    public ExecScaleOutOutputBuilder() {
    }

    public ExecScaleOutOutputBuilder(ExecScaleOutOutput base) {
        this._instanceId = base.getInstanceId();
        if (base instanceof ExecScaleOutOutputImpl) {
            ExecScaleOutOutputImpl impl = (ExecScaleOutOutputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleOutOutput> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleOutOutput>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public BigInteger getInstanceId() {
        return _instanceId;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleOutOutput>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKINSTANCEIDRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKINSTANCEIDRANGE_RANGES = a;
     }
     private static void checkInstanceIdRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKINSTANCEIDRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKINSTANCEIDRANGE_RANGES)));
     }
    
    public ExecScaleOutOutputBuilder setInstanceId(final BigInteger value) {
    if (value != null) {
        checkInstanceIdRange(value);
    }
        this._instanceId = value;
        return this;
    }
    
    public ExecScaleOutOutputBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleOutOutput>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleOutOutput> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ExecScaleOutOutputBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleOutOutput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ExecScaleOutOutput build() {
        return new ExecScaleOutOutputImpl(this);
    }

    private static final class ExecScaleOutOutputImpl implements ExecScaleOutOutput {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleOutOutput> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleOutOutput.class;
        }

        private final BigInteger _instanceId;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleOutOutput>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleOutOutput>> augmentation = Collections.emptyMap();

        private ExecScaleOutOutputImpl(ExecScaleOutOutputBuilder base) {
            this._instanceId = base.getInstanceId();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleOutOutput>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleOutOutput>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleOutOutput>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleOutOutput>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public BigInteger getInstanceId() {
            return _instanceId;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleOutOutput>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_instanceId);
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
            if (!ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleOutOutput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleOutOutput other = (ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleOutOutput)obj;
            if (!Objects.equals(_instanceId, other.getInstanceId())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ExecScaleOutOutputImpl otherImpl = (ExecScaleOutOutputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleOutOutput>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleOutOutput>> e : augmentation.entrySet()) {
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
            java.lang.String name = "ExecScaleOutOutput [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_instanceId != null) {
                builder.append("_instanceId=");
                builder.append(_instanceId);
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
