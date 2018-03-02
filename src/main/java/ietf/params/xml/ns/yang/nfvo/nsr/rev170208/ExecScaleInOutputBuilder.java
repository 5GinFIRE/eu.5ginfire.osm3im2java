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
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleInOutput} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleInOutput
 *
 */
public class ExecScaleInOutputBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleInOutput> {

    private BigInteger _instanceId;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleInOutput>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleInOutput>> augmentation = Collections.emptyMap();

    public ExecScaleInOutputBuilder() {
    }

    public ExecScaleInOutputBuilder(ExecScaleInOutput base) {
        this._instanceId = base.getInstanceId();
        if (base instanceof ExecScaleInOutputImpl) {
            ExecScaleInOutputImpl impl = (ExecScaleInOutputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleInOutput> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleInOutput>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public BigInteger getInstanceId() {
        return _instanceId;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleInOutput>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
    
    public ExecScaleInOutputBuilder setInstanceId(final BigInteger value) {
    if (value != null) {
        checkInstanceIdRange(value);
    }
        this._instanceId = value;
        return this;
    }
    
    public ExecScaleInOutputBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleInOutput>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleInOutput> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ExecScaleInOutputBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleInOutput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ExecScaleInOutput build() {
        return new ExecScaleInOutputImpl(this);
    }

    private static final class ExecScaleInOutputImpl implements ExecScaleInOutput {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleInOutput> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleInOutput.class;
        }

        private final BigInteger _instanceId;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleInOutput>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleInOutput>> augmentation = Collections.emptyMap();

        private ExecScaleInOutputImpl(ExecScaleInOutputBuilder base) {
            this._instanceId = base.getInstanceId();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleInOutput>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleInOutput>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleInOutput>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleInOutput>>singletonMap(e.getKey(), e.getValue());
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
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleInOutput>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            if (!ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleInOutput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleInOutput other = (ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleInOutput)obj;
            if (!Objects.equals(_instanceId, other.getInstanceId())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ExecScaleInOutputImpl otherImpl = (ExecScaleInOutputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleInOutput>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleInOutput>> e : augmentation.entrySet()) {
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
            java.lang.String name = "ExecScaleInOutput [";
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
