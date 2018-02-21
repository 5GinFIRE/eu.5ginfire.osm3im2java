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
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleOutInput} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleOutInput
 *
 */
public class ExecScaleOutInputBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleOutInput> {

    private BigInteger _instanceId;
    private java.lang.Object _nsrIdRef;
    private java.lang.String _projectName;
    private java.lang.Object _scalingGroupNameRef;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleOutInput>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleOutInput>> augmentation = Collections.emptyMap();

    public ExecScaleOutInputBuilder() {
    }
    public ExecScaleOutInputBuilder(ietf.params.xml.ns.yang.nfvo.nsr.rev170208.RpcCommon arg) {
        this._nsrIdRef = arg.getNsrIdRef();
        this._projectName = arg.getProjectName();
    }
    public ExecScaleOutInputBuilder(ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.RpcProjectName arg) {
        this._projectName = arg.getProjectName();
    }

    public ExecScaleOutInputBuilder(ExecScaleOutInput base) {
        this._instanceId = base.getInstanceId();
        this._nsrIdRef = base.getNsrIdRef();
        this._projectName = base.getProjectName();
        this._scalingGroupNameRef = base.getScalingGroupNameRef();
        if (base instanceof ExecScaleOutInputImpl) {
            ExecScaleOutInputImpl impl = (ExecScaleOutInputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleOutInput> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleOutInput>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.RpcCommon</li>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.RpcProjectName</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof ietf.params.xml.ns.yang.nfvo.nsr.rev170208.RpcCommon) {
            this._nsrIdRef = ((ietf.params.xml.ns.yang.nfvo.nsr.rev170208.RpcCommon)arg).getNsrIdRef();
            isValidArg = true;
        }
        if (arg instanceof ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.RpcProjectName) {
            this._projectName = ((ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.RpcProjectName)arg).getProjectName();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.RpcCommon, org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.RpcProjectName] \n" +
              "but was: " + arg
            );
        }
    }

    public BigInteger getInstanceId() {
        return _instanceId;
    }
    
    public java.lang.Object getNsrIdRef() {
        return _nsrIdRef;
    }
    
    public java.lang.String getProjectName() {
        return _projectName;
    }
    
    public java.lang.Object getScalingGroupNameRef() {
        return _scalingGroupNameRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleOutInput>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
    
    public ExecScaleOutInputBuilder setInstanceId(final BigInteger value) {
    if (value != null) {
        checkInstanceIdRange(value);
    }
        this._instanceId = value;
        return this;
    }
    
     
    public ExecScaleOutInputBuilder setNsrIdRef(final java.lang.Object value) {
        this._nsrIdRef = value;
        return this;
    }
    
     
     private static void check_projectNameLength(final String value) {
         final int length = value.length();
         if (length >= 1 && length <= 255) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[1..255]].", value));
     }
    
    public ExecScaleOutInputBuilder setProjectName(final java.lang.String value) {
    if (value != null) {
        check_projectNameLength(value);
    }
        this._projectName = value;
        return this;
    }
    
     
    public ExecScaleOutInputBuilder setScalingGroupNameRef(final java.lang.Object value) {
        this._scalingGroupNameRef = value;
        return this;
    }
    
    public ExecScaleOutInputBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleOutInput>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleOutInput> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ExecScaleOutInputBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleOutInput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ExecScaleOutInput build() {
        return new ExecScaleOutInputImpl(this);
    }

    private static final class ExecScaleOutInputImpl implements ExecScaleOutInput {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleOutInput> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleOutInput.class;
        }

        private final BigInteger _instanceId;
        private final java.lang.Object _nsrIdRef;
        private final java.lang.String _projectName;
        private final java.lang.Object _scalingGroupNameRef;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleOutInput>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleOutInput>> augmentation = Collections.emptyMap();

        private ExecScaleOutInputImpl(ExecScaleOutInputBuilder base) {
            this._instanceId = base.getInstanceId();
            this._nsrIdRef = base.getNsrIdRef();
            this._projectName = base.getProjectName();
            this._scalingGroupNameRef = base.getScalingGroupNameRef();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleOutInput>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleOutInput>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleOutInput>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleOutInput>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public BigInteger getInstanceId() {
            return _instanceId;
        }
        
        @Override
        public java.lang.Object getNsrIdRef() {
            return _nsrIdRef;
        }
        
        @Override
        public java.lang.String getProjectName() {
            return _projectName;
        }
        
        @Override
        public java.lang.Object getScalingGroupNameRef() {
            return _scalingGroupNameRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleOutInput>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_nsrIdRef);
            result = prime * result + Objects.hashCode(_projectName);
            result = prime * result + Objects.hashCode(_scalingGroupNameRef);
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
            if (!ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleOutInput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleOutInput other = (ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleOutInput)obj;
            if (!Objects.equals(_instanceId, other.getInstanceId())) {
                return false;
            }
            if (!Objects.equals(_nsrIdRef, other.getNsrIdRef())) {
                return false;
            }
            if (!Objects.equals(_projectName, other.getProjectName())) {
                return false;
            }
            if (!Objects.equals(_scalingGroupNameRef, other.getScalingGroupNameRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ExecScaleOutInputImpl otherImpl = (ExecScaleOutInputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleOutInput>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecScaleOutInput>> e : augmentation.entrySet()) {
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
            java.lang.String name = "ExecScaleOutInput [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_instanceId != null) {
                builder.append("_instanceId=");
                builder.append(_instanceId);
                builder.append(", ");
            }
            if (_nsrIdRef != null) {
                builder.append("_nsrIdRef=");
                builder.append(_nsrIdRef);
                builder.append(", ");
            }
            if (_projectName != null) {
                builder.append("_projectName=");
                builder.append(_projectName);
                builder.append(", ");
            }
            if (_scalingGroupNameRef != null) {
                builder.append("_scalingGroupNameRef=");
                builder.append(_scalingGroupNameRef);
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
