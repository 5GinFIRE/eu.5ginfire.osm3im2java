package http.riftio.nsd.base.rev170228.nsd.descriptor.common;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.event.config.Parameter;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.math.BigInteger;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link http.riftio.nsd.base.rev170228.nsd.descriptor.common.InitialServicePrimitive} instances.
 * 
 * @see http.riftio.nsd.base.rev170228.nsd.descriptor.common.InitialServicePrimitive
 *
 */
public class InitialServicePrimitiveBuilder implements Builder<http.riftio.nsd.base.rev170228.nsd.descriptor.common.InitialServicePrimitive> {

    private InitialServicePrimitiveKey _key;
    private java.lang.String _name;
    private List<Parameter> _parameter;
    private BigInteger _seq;
    private java.lang.String _userDefinedScript;

    Map<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.InitialServicePrimitive>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.InitialServicePrimitive>> augmentation = Collections.emptyMap();

    public InitialServicePrimitiveBuilder() {
    }
    public InitialServicePrimitiveBuilder(ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.EventConfig arg) {
        this._seq = arg.getSeq();
        this._name = arg.getName();
        this._userDefinedScript = arg.getUserDefinedScript();
        this._parameter = arg.getParameter();
    }

    public InitialServicePrimitiveBuilder(InitialServicePrimitive base) {
        if (base.getKey() == null) {
            this._key = new InitialServicePrimitiveKey(
                base.getSeq()
            );
            this._seq = base.getSeq();
        } else {
            this._key = base.getKey();
            this._seq = _key.getSeq();
        }
        this._name = base.getName();
        this._parameter = base.getParameter();
        this._userDefinedScript = base.getUserDefinedScript();
        if (base instanceof InitialServicePrimitiveImpl) {
            InitialServicePrimitiveImpl impl = (InitialServicePrimitiveImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<http.riftio.nsd.base.rev170228.nsd.descriptor.common.InitialServicePrimitive> casted =(AugmentationHolder<http.riftio.nsd.base.rev170228.nsd.descriptor.common.InitialServicePrimitive>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.EventConfig</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.EventConfig) {
            this._seq = ((ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.EventConfig)arg).getSeq();
            this._name = ((ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.EventConfig)arg).getName();
            this._userDefinedScript = ((ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.EventConfig)arg).getUserDefinedScript();
            this._parameter = ((ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.EventConfig)arg).getParameter();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.EventConfig] \n" +
              "but was: " + arg
            );
        }
    }

    public InitialServicePrimitiveKey getKey() {
        return _key;
    }
    
    public java.lang.String getName() {
        return _name;
    }
    
    public List<Parameter> getParameter() {
        return _parameter;
    }
    
    public BigInteger getSeq() {
        return _seq;
    }
    
    public java.lang.String getUserDefinedScript() {
        return _userDefinedScript;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.InitialServicePrimitive>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public InitialServicePrimitiveBuilder setKey(final InitialServicePrimitiveKey value) {
        this._key = value;
        return this;
    }
    
     
    public InitialServicePrimitiveBuilder setName(final java.lang.String value) {
        this._name = value;
        return this;
    }
    
     
    public InitialServicePrimitiveBuilder setParameter(final List<Parameter> value) {
        this._parameter = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKSEQRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKSEQRANGE_RANGES = a;
     }
     private static void checkSeqRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKSEQRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKSEQRANGE_RANGES)));
     }
    
    public InitialServicePrimitiveBuilder setSeq(final BigInteger value) {
    if (value != null) {
        checkSeqRange(value);
    }
        this._seq = value;
        return this;
    }
    
     
    public InitialServicePrimitiveBuilder setUserDefinedScript(final java.lang.String value) {
        this._userDefinedScript = value;
        return this;
    }
    
    public InitialServicePrimitiveBuilder addAugmentation(java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.InitialServicePrimitive>> augmentationType, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.InitialServicePrimitive> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public InitialServicePrimitiveBuilder removeAugmentation(java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.InitialServicePrimitive>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public InitialServicePrimitive build() {
        return new InitialServicePrimitiveImpl(this);
    }

    private static final class InitialServicePrimitiveImpl implements InitialServicePrimitive {

        @Override
        public java.lang.Class<http.riftio.nsd.base.rev170228.nsd.descriptor.common.InitialServicePrimitive> getImplementedInterface() {
            return http.riftio.nsd.base.rev170228.nsd.descriptor.common.InitialServicePrimitive.class;
        }

        private final InitialServicePrimitiveKey _key;
        private final java.lang.String _name;
        private final List<Parameter> _parameter;
        private final BigInteger _seq;
        private final java.lang.String _userDefinedScript;

        private Map<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.InitialServicePrimitive>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.InitialServicePrimitive>> augmentation = Collections.emptyMap();

        private InitialServicePrimitiveImpl(InitialServicePrimitiveBuilder base) {
            if (base.getKey() == null) {
                this._key = new InitialServicePrimitiveKey(
                    base.getSeq()
                );
                this._seq = base.getSeq();
            } else {
                this._key = base.getKey();
                this._seq = _key.getSeq();
            }
            this._name = base.getName();
            this._parameter = base.getParameter();
            this._userDefinedScript = base.getUserDefinedScript();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.InitialServicePrimitive>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.InitialServicePrimitive>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.InitialServicePrimitive>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.InitialServicePrimitive>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public InitialServicePrimitiveKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.String getName() {
            return _name;
        }
        
        @Override
        public List<Parameter> getParameter() {
            return _parameter;
        }
        
        @Override
        public BigInteger getSeq() {
            return _seq;
        }
        
        @Override
        public java.lang.String getUserDefinedScript() {
            return _userDefinedScript;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.InitialServicePrimitive>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_parameter);
            result = prime * result + Objects.hashCode(_seq);
            result = prime * result + Objects.hashCode(_userDefinedScript);
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
            if (!http.riftio.nsd.base.rev170228.nsd.descriptor.common.InitialServicePrimitive.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            http.riftio.nsd.base.rev170228.nsd.descriptor.common.InitialServicePrimitive other = (http.riftio.nsd.base.rev170228.nsd.descriptor.common.InitialServicePrimitive)obj;
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_parameter, other.getParameter())) {
                return false;
            }
            if (!Objects.equals(_seq, other.getSeq())) {
                return false;
            }
            if (!Objects.equals(_userDefinedScript, other.getUserDefinedScript())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                InitialServicePrimitiveImpl otherImpl = (InitialServicePrimitiveImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.InitialServicePrimitive>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.InitialServicePrimitive>> e : augmentation.entrySet()) {
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
            java.lang.String name = "InitialServicePrimitive [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_name != null) {
                builder.append("_name=");
                builder.append(_name);
                builder.append(", ");
            }
            if (_parameter != null) {
                builder.append("_parameter=");
                builder.append(_parameter);
                builder.append(", ");
            }
            if (_seq != null) {
                builder.append("_seq=");
                builder.append(_seq);
                builder.append(", ");
            }
            if (_userDefinedScript != null) {
                builder.append("_userDefinedScript=");
                builder.append(_userDefinedScript);
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
