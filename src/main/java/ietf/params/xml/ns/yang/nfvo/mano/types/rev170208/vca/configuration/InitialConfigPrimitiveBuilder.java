package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import com.fasterxml.jackson.annotation.JsonProperty;

import http.riftio.vnfd.base.rev170228.vnfd.descriptor.VnfConfigurationBuilder;
import http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.VduIdBuilder;
import ietf.params.xml.ns.yang.ietf.inet.types.rev130715.PortNumber;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.primitive.parameter.value.Parameter;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.initial.config.primitive.PrimitiveType;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.initial.config.primitive.primitive.type.PrimitiveDefinitionBuilder;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.initial.config.primitive.primitive.type.PrimitiveDefinitionBuilder.PrimitiveDefinitionImpl;

import java.util.HashMap;
import java.util.List;

import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.math.BigInteger;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.InitialConfigPrimitive} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.InitialConfigPrimitive
 *
 */
public class InitialConfigPrimitiveBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.InitialConfigPrimitive> {

    private InitialConfigPrimitiveKey _key;
    private PrimitiveType _primitiveType;
    private BigInteger _seq;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.InitialConfigPrimitive>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.InitialConfigPrimitive>> augmentation = Collections.emptyMap();

    public InitialConfigPrimitiveBuilder() {
    }

    public InitialConfigPrimitiveBuilder(InitialConfigPrimitive base) {
        if (base.getKey() == null) {
            this._key = new InitialConfigPrimitiveKey(
                base.getSeq()
            );
            this._seq = base.getSeq();
        } else {
            this._key = base.getKey();
            this._seq = _key.getSeq();
        }
        this._primitiveType = base.getPrimitiveType();
        if (base instanceof InitialConfigPrimitiveImpl) {
            InitialConfigPrimitiveImpl impl = (InitialConfigPrimitiveImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.InitialConfigPrimitive> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.InitialConfigPrimitive>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public InitialConfigPrimitiveKey getKey() {
        return _key;
    }
    
    public PrimitiveType getPrimitiveType() {
        return _primitiveType;
    }
    
    public BigInteger getSeq() {
        return _seq;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.InitialConfigPrimitive>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public InitialConfigPrimitiveBuilder setKey(final InitialConfigPrimitiveKey value) {
        this._key = value;
        return this;
    }
    
     
    public InitialConfigPrimitiveBuilder setPrimitiveType(final PrimitiveType value) {
        this._primitiveType = value;
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
    
    public InitialConfigPrimitiveBuilder setSeq(final BigInteger value) {
    if (value != null) {
        checkSeqRange(value);
    }
        this._seq = value;
        return this;
    }
    
    public InitialConfigPrimitiveBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.InitialConfigPrimitive>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.InitialConfigPrimitive> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public InitialConfigPrimitiveBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.InitialConfigPrimitive>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public InitialConfigPrimitive build() {
        return new InitialConfigPrimitiveImpl(this);
    }

    public static final class InitialConfigPrimitiveImpl implements InitialConfigPrimitive {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.InitialConfigPrimitive> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.InitialConfigPrimitive.class;
        }

        private final InitialConfigPrimitiveKey _key;
        private  PrimitiveType _primitiveType;
        @JsonProperty("seq")
        private final BigInteger _seq;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.InitialConfigPrimitive>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.InitialConfigPrimitive>> augmentation = Collections.emptyMap();

        private InitialConfigPrimitiveImpl(InitialConfigPrimitiveBuilder base) {
            if (base.getKey() == null) {
                this._key = new InitialConfigPrimitiveKey(
                    base.getSeq()
                );
                this._seq = base.getSeq();
            } else {
                this._key = base.getKey();
                this._seq = _key.getSeq();
            }
            this._primitiveType = base.getPrimitiveType();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.InitialConfigPrimitive>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.InitialConfigPrimitive>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.InitialConfigPrimitive>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.InitialConfigPrimitive>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }
        
        public InitialConfigPrimitiveImpl(){
          	this( new InitialConfigPrimitiveBuilder() );
          	_primitiveType = new PrimitiveDefinitionBuilder().build();
        }
        
        @JsonProperty("name")
        public void setName(String s){
        ((PrimitiveDefinitionImpl)_primitiveType).setName(s);
        }
        
        @JsonProperty("parameter")
        public void setParameter(List<Parameter> s){
          	((PrimitiveDefinitionImpl)_primitiveType).setParameter(s);
        }
        
        @JsonProperty("user-defined-script")
        public void setUserDefinedScript(String s){
          	((PrimitiveDefinitionImpl)_primitiveType).setUserDefinedScript(s);
        }

        @Override
        public InitialConfigPrimitiveKey getKey() {
            return _key;
        }
        
        @Override
        public PrimitiveType getPrimitiveType() {
            return _primitiveType;
        }
        
        @Override
        public BigInteger getSeq() {
            return _seq;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.InitialConfigPrimitive>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_primitiveType);
            result = prime * result + Objects.hashCode(_seq);
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
            if (!ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.InitialConfigPrimitive.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.InitialConfigPrimitive other = (ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.InitialConfigPrimitive)obj;
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_primitiveType, other.getPrimitiveType())) {
                return false;
            }
            if (!Objects.equals(_seq, other.getSeq())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                InitialConfigPrimitiveImpl otherImpl = (InitialConfigPrimitiveImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.InitialConfigPrimitive>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.InitialConfigPrimitive>> e : augmentation.entrySet()) {
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
            java.lang.String name = "InitialConfigPrimitive [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_primitiveType != null) {
                builder.append("_primitiveType=");
                builder.append(_primitiveType);
                builder.append(", ");
            }
            if (_seq != null) {
                builder.append("_seq=");
                builder.append(_seq);
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
