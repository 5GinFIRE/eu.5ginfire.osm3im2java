package ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.constituent.vnfd;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import com.fasterxml.jackson.annotation.JsonProperty;

import ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.VnfdBuilder;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.math.BigInteger;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.constituent.vnfd.ConstituentVnfd} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.constituent.vnfd.ConstituentVnfd
 *
 */
public class ConstituentVnfdBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.constituent.vnfd.ConstituentVnfd> {

    private ConstituentVnfdKey _key;
    private BigInteger _memberVnfIndex;
    private java.lang.String _vnfdIdRef;
    private java.lang.Boolean _startByDefault;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.constituent.vnfd.ConstituentVnfd>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.constituent.vnfd.ConstituentVnfd>> augmentation = Collections.emptyMap();

    public ConstituentVnfdBuilder() {
    }

    public ConstituentVnfdBuilder(ConstituentVnfd base) {
        if (base.getKey() == null) {
            this._key = new ConstituentVnfdKey(
                base.getMemberVnfIndex()
            );
            this._memberVnfIndex = base.getMemberVnfIndex();
        } else {
            this._key = base.getKey();
            this._memberVnfIndex = _key.getMemberVnfIndex();
        }
        this._vnfdIdRef = base.getVnfdIdRef();
        this._startByDefault = base.isStartByDefault();
        if (base instanceof ConstituentVnfdImpl) {
            ConstituentVnfdImpl impl = (ConstituentVnfdImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.constituent.vnfd.ConstituentVnfd> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.constituent.vnfd.ConstituentVnfd>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public ConstituentVnfdKey getKey() {
        return _key;
    }
    
    public BigInteger getMemberVnfIndex() {
        return _memberVnfIndex;
    }
    
    public java.lang.String getVnfdIdRef() {
        return _vnfdIdRef;
    }
    
    public java.lang.Boolean isStartByDefault() {
        return _startByDefault;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.constituent.vnfd.ConstituentVnfd>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public ConstituentVnfdBuilder setKey(final ConstituentVnfdKey value) {
        this._key = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKMEMBERVNFINDEXRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKMEMBERVNFINDEXRANGE_RANGES = a;
     }
     private static void checkMemberVnfIndexRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKMEMBERVNFINDEXRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKMEMBERVNFINDEXRANGE_RANGES)));
     }
    
    public ConstituentVnfdBuilder setMemberVnfIndex(final BigInteger value) {
    if (value != null) {
        checkMemberVnfIndexRange(value);
    }
        this._memberVnfIndex = value;
        return this;
    }
    
     
     private static void check_vnfdIdRefLength(final String value) {
         final int length = value.length();
         if (length >= 1 && length <= 63) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[1..63]].", value));
     }
    
    public ConstituentVnfdBuilder setVnfdIdRef(final java.lang.String value) {
    if (value != null) {
        check_vnfdIdRefLength(value);
    }
        this._vnfdIdRef = value;
        return this;
    }
    
     
    public ConstituentVnfdBuilder setStartByDefault(final java.lang.Boolean value) {
        this._startByDefault = value;
        return this;
    }
    
    public ConstituentVnfdBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.constituent.vnfd.ConstituentVnfd>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.constituent.vnfd.ConstituentVnfd> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ConstituentVnfdBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.constituent.vnfd.ConstituentVnfd>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ConstituentVnfd build() {
        return new ConstituentVnfdImpl(this);
    }

    public static final class ConstituentVnfdImpl implements ConstituentVnfd {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.constituent.vnfd.ConstituentVnfd> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.constituent.vnfd.ConstituentVnfd.class;
        }

        private final ConstituentVnfdKey _key;
        @JsonProperty("member-vnf-index")
        private final BigInteger _memberVnfIndex;
        @JsonProperty("vnfd-id-ref")
        private final java.lang.String _vnfdIdRef;
        @JsonProperty("start-by-default")
        private final java.lang.Boolean _startByDefault;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.constituent.vnfd.ConstituentVnfd>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.constituent.vnfd.ConstituentVnfd>> augmentation = Collections.emptyMap();

        private ConstituentVnfdImpl(ConstituentVnfdBuilder base) {
            if (base.getKey() == null) {
                this._key = new ConstituentVnfdKey(
                    base.getMemberVnfIndex()
                );
                this._memberVnfIndex = base.getMemberVnfIndex();
            } else {
                this._key = base.getKey();
                this._memberVnfIndex = _key.getMemberVnfIndex();
            }
            this._vnfdIdRef = base.getVnfdIdRef();
            this._startByDefault = base.isStartByDefault();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.constituent.vnfd.ConstituentVnfd>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.constituent.vnfd.ConstituentVnfd>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.constituent.vnfd.ConstituentVnfd>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.constituent.vnfd.ConstituentVnfd>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }
        
        public ConstituentVnfdImpl(){
          	this( new ConstituentVnfdBuilder() );
        }

        @Override
        public ConstituentVnfdKey getKey() {
            return _key;
        }
        
        @Override
        public BigInteger getMemberVnfIndex() {
            return _memberVnfIndex;
        }
        
        @Override
        public java.lang.String getVnfdIdRef() {
            return _vnfdIdRef;
        }
        
        @Override
        public java.lang.Boolean isStartByDefault() {
            return _startByDefault;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.constituent.vnfd.ConstituentVnfd>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_memberVnfIndex);
            result = prime * result + Objects.hashCode(_vnfdIdRef);
            result = prime * result + Objects.hashCode(_startByDefault);
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
            if (!ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.constituent.vnfd.ConstituentVnfd.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.constituent.vnfd.ConstituentVnfd other = (ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.constituent.vnfd.ConstituentVnfd)obj;
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_memberVnfIndex, other.getMemberVnfIndex())) {
                return false;
            }
            if (!Objects.equals(_vnfdIdRef, other.getVnfdIdRef())) {
                return false;
            }
            if (!Objects.equals(_startByDefault, other.isStartByDefault())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ConstituentVnfdImpl otherImpl = (ConstituentVnfdImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.constituent.vnfd.ConstituentVnfd>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.constituent.vnfd.ConstituentVnfd>> e : augmentation.entrySet()) {
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
            java.lang.String name = "ConstituentVnfd [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_memberVnfIndex != null) {
                builder.append("_memberVnfIndex=");
                builder.append(_memberVnfIndex);
                builder.append(", ");
            }
            if (_vnfdIdRef != null) {
                builder.append("_vnfdIdRef=");
                builder.append(_vnfdIdRef);
                builder.append(", ");
            }
            if (_startByDefault != null) {
                builder.append("_startByDefault=");
                builder.append(_startByDefault);
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
