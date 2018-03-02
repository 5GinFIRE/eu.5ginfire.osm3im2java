package ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp.vnfr.connection.point.ref.ConnectionPointParams;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp.vnfr.connection.point.ref.ServiceFunctionForwarder;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;

import java.util.Objects;
import java.math.BigInteger;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp.VnfrConnectionPointRef} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp.VnfrConnectionPointRef
 *
 */
public class VnfrConnectionPointRefBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp.VnfrConnectionPointRef> {

    private ConnectionPointParams _connectionPointParams;
    private java.lang.Short _hopNumber;
    private VnfrConnectionPointRefKey _key;
    private BigInteger _memberVnfIndexRef;
    private ServiceFunctionForwarder _serviceFunctionForwarder;
    private java.lang.String _serviceFunctionType;
    private java.lang.Short _serviceIndex;
    private java.lang.String _vnfdIdRef;
    private java.lang.Object _vnfrConnectionPointRef;
    private java.lang.String _vnfrIdRef;
    private java.lang.String _vnfrNameRef;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp.VnfrConnectionPointRef>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp.VnfrConnectionPointRef>> augmentation = Collections.emptyMap();

    public VnfrConnectionPointRefBuilder() {
    }

    public VnfrConnectionPointRefBuilder(VnfrConnectionPointRef base) {
        if (base.getKey() == null) {
            this._key = new VnfrConnectionPointRefKey(
                base.getHopNumber()
            );
            this._hopNumber = base.getHopNumber();
        } else {
            this._key = base.getKey();
            this._hopNumber = _key.getHopNumber();
        }
        this._connectionPointParams = base.getConnectionPointParams();
        this._memberVnfIndexRef = base.getMemberVnfIndexRef();
        this._serviceFunctionForwarder = base.getServiceFunctionForwarder();
        this._serviceFunctionType = base.getServiceFunctionType();
        this._serviceIndex = base.getServiceIndex();
        this._vnfdIdRef = base.getVnfdIdRef();
        this._vnfrConnectionPointRef = base.getVnfrConnectionPointRef();
        this._vnfrIdRef = base.getVnfrIdRef();
        this._vnfrNameRef = base.getVnfrNameRef();
        if (base instanceof VnfrConnectionPointRefImpl) {
            VnfrConnectionPointRefImpl impl = (VnfrConnectionPointRefImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp.VnfrConnectionPointRef> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp.VnfrConnectionPointRef>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public ConnectionPointParams getConnectionPointParams() {
        return _connectionPointParams;
    }
    
    public java.lang.Short getHopNumber() {
        return _hopNumber;
    }
    
    public VnfrConnectionPointRefKey getKey() {
        return _key;
    }
    
    public BigInteger getMemberVnfIndexRef() {
        return _memberVnfIndexRef;
    }
    
    public ServiceFunctionForwarder getServiceFunctionForwarder() {
        return _serviceFunctionForwarder;
    }
    
    public java.lang.String getServiceFunctionType() {
        return _serviceFunctionType;
    }
    
    public java.lang.Short getServiceIndex() {
        return _serviceIndex;
    }
    
    public java.lang.String getVnfdIdRef() {
        return _vnfdIdRef;
    }
    
    public java.lang.Object getVnfrConnectionPointRef() {
        return _vnfrConnectionPointRef;
    }
    
    public java.lang.String getVnfrIdRef() {
        return _vnfrIdRef;
    }
    
    public java.lang.String getVnfrNameRef() {
        return _vnfrNameRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp.VnfrConnectionPointRef>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public VnfrConnectionPointRefBuilder setConnectionPointParams(final ConnectionPointParams value) {
        this._connectionPointParams = value;
        return this;
    }
    
     
     private static void checkHopNumberRange(final short value) {
         if (value >= (short)0 && value <= (short)255) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..255]].", value));
     }
    
    public VnfrConnectionPointRefBuilder setHopNumber(final java.lang.Short value) {
    if (value != null) {
        checkHopNumberRange(value);
    }
        this._hopNumber = value;
        return this;
    }
    
     
    public VnfrConnectionPointRefBuilder setKey(final VnfrConnectionPointRefKey value) {
        this._key = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKMEMBERVNFINDEXREFRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKMEMBERVNFINDEXREFRANGE_RANGES = a;
     }
     private static void checkMemberVnfIndexRefRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKMEMBERVNFINDEXREFRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKMEMBERVNFINDEXREFRANGE_RANGES)));
     }
    
    public VnfrConnectionPointRefBuilder setMemberVnfIndexRef(final BigInteger value) {
    if (value != null) {
        checkMemberVnfIndexRefRange(value);
    }
        this._memberVnfIndexRef = value;
        return this;
    }
    
     
    public VnfrConnectionPointRefBuilder setServiceFunctionForwarder(final ServiceFunctionForwarder value) {
        this._serviceFunctionForwarder = value;
        return this;
    }
    
     
    public VnfrConnectionPointRefBuilder setServiceFunctionType(final java.lang.String value) {
        this._serviceFunctionType = value;
        return this;
    }
    
     
     private static void checkServiceIndexRange(final short value) {
         if (value >= (short)0 && value <= (short)255) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..255]].", value));
     }
    
    public VnfrConnectionPointRefBuilder setServiceIndex(final java.lang.Short value) {
    if (value != null) {
        checkServiceIndexRange(value);
    }
        this._serviceIndex = value;
        return this;
    }
    
     
    public VnfrConnectionPointRefBuilder setVnfdIdRef(final java.lang.String value) {
        this._vnfdIdRef = value;
        return this;
    }
    
     
    public VnfrConnectionPointRefBuilder setVnfrConnectionPointRef(final java.lang.Object value) {
        this._vnfrConnectionPointRef = value;
        return this;
    }
    
     
    public VnfrConnectionPointRefBuilder setVnfrIdRef(final java.lang.String value) {
        this._vnfrIdRef = value;
        return this;
    }
    
     
    public VnfrConnectionPointRefBuilder setVnfrNameRef(final java.lang.String value) {
        this._vnfrNameRef = value;
        return this;
    }
    
    public VnfrConnectionPointRefBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp.VnfrConnectionPointRef>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp.VnfrConnectionPointRef> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VnfrConnectionPointRefBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp.VnfrConnectionPointRef>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public VnfrConnectionPointRef build() {
        return new VnfrConnectionPointRefImpl(this);
    }

    private static final class VnfrConnectionPointRefImpl implements VnfrConnectionPointRef {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp.VnfrConnectionPointRef> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp.VnfrConnectionPointRef.class;
        }

        private final ConnectionPointParams _connectionPointParams;
        private final java.lang.Short _hopNumber;
        private final VnfrConnectionPointRefKey _key;
        private final BigInteger _memberVnfIndexRef;
        private final ServiceFunctionForwarder _serviceFunctionForwarder;
        private final java.lang.String _serviceFunctionType;
        private final java.lang.Short _serviceIndex;
        private final java.lang.String _vnfdIdRef;
        private final java.lang.Object _vnfrConnectionPointRef;
        private final java.lang.String _vnfrIdRef;
        private final java.lang.String _vnfrNameRef;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp.VnfrConnectionPointRef>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp.VnfrConnectionPointRef>> augmentation = Collections.emptyMap();

        private VnfrConnectionPointRefImpl(VnfrConnectionPointRefBuilder base) {
            if (base.getKey() == null) {
                this._key = new VnfrConnectionPointRefKey(
                    base.getHopNumber()
                );
                this._hopNumber = base.getHopNumber();
            } else {
                this._key = base.getKey();
                this._hopNumber = _key.getHopNumber();
            }
            this._connectionPointParams = base.getConnectionPointParams();
            this._memberVnfIndexRef = base.getMemberVnfIndexRef();
            this._serviceFunctionForwarder = base.getServiceFunctionForwarder();
            this._serviceFunctionType = base.getServiceFunctionType();
            this._serviceIndex = base.getServiceIndex();
            this._vnfdIdRef = base.getVnfdIdRef();
            this._vnfrConnectionPointRef = base.getVnfrConnectionPointRef();
            this._vnfrIdRef = base.getVnfrIdRef();
            this._vnfrNameRef = base.getVnfrNameRef();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp.VnfrConnectionPointRef>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp.VnfrConnectionPointRef>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp.VnfrConnectionPointRef>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp.VnfrConnectionPointRef>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public ConnectionPointParams getConnectionPointParams() {
            return _connectionPointParams;
        }
        
        @Override
        public java.lang.Short getHopNumber() {
            return _hopNumber;
        }
        
        @Override
        public VnfrConnectionPointRefKey getKey() {
            return _key;
        }
        
        @Override
        public BigInteger getMemberVnfIndexRef() {
            return _memberVnfIndexRef;
        }
        
        @Override
        public ServiceFunctionForwarder getServiceFunctionForwarder() {
            return _serviceFunctionForwarder;
        }
        
        @Override
        public java.lang.String getServiceFunctionType() {
            return _serviceFunctionType;
        }
        
        @Override
        public java.lang.Short getServiceIndex() {
            return _serviceIndex;
        }
        
        @Override
        public java.lang.String getVnfdIdRef() {
            return _vnfdIdRef;
        }
        
        @Override
        public java.lang.Object getVnfrConnectionPointRef() {
            return _vnfrConnectionPointRef;
        }
        
        @Override
        public java.lang.String getVnfrIdRef() {
            return _vnfrIdRef;
        }
        
        @Override
        public java.lang.String getVnfrNameRef() {
            return _vnfrNameRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp.VnfrConnectionPointRef>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_connectionPointParams);
            result = prime * result + Objects.hashCode(_hopNumber);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_memberVnfIndexRef);
            result = prime * result + Objects.hashCode(_serviceFunctionForwarder);
            result = prime * result + Objects.hashCode(_serviceFunctionType);
            result = prime * result + Objects.hashCode(_serviceIndex);
            result = prime * result + Objects.hashCode(_vnfdIdRef);
            result = prime * result + Objects.hashCode(_vnfrConnectionPointRef);
            result = prime * result + Objects.hashCode(_vnfrIdRef);
            result = prime * result + Objects.hashCode(_vnfrNameRef);
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
            if (!ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp.VnfrConnectionPointRef.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp.VnfrConnectionPointRef other = (ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp.VnfrConnectionPointRef)obj;
            if (!Objects.equals(_connectionPointParams, other.getConnectionPointParams())) {
                return false;
            }
            if (!Objects.equals(_hopNumber, other.getHopNumber())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_memberVnfIndexRef, other.getMemberVnfIndexRef())) {
                return false;
            }
            if (!Objects.equals(_serviceFunctionForwarder, other.getServiceFunctionForwarder())) {
                return false;
            }
            if (!Objects.equals(_serviceFunctionType, other.getServiceFunctionType())) {
                return false;
            }
            if (!Objects.equals(_serviceIndex, other.getServiceIndex())) {
                return false;
            }
            if (!Objects.equals(_vnfdIdRef, other.getVnfdIdRef())) {
                return false;
            }
            if (!Objects.equals(_vnfrConnectionPointRef, other.getVnfrConnectionPointRef())) {
                return false;
            }
            if (!Objects.equals(_vnfrIdRef, other.getVnfrIdRef())) {
                return false;
            }
            if (!Objects.equals(_vnfrNameRef, other.getVnfrNameRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VnfrConnectionPointRefImpl otherImpl = (VnfrConnectionPointRefImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp.VnfrConnectionPointRef>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp.VnfrConnectionPointRef>> e : augmentation.entrySet()) {
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
            java.lang.String name = "VnfrConnectionPointRef [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_connectionPointParams != null) {
                builder.append("_connectionPointParams=");
                builder.append(_connectionPointParams);
                builder.append(", ");
            }
            if (_hopNumber != null) {
                builder.append("_hopNumber=");
                builder.append(_hopNumber);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_memberVnfIndexRef != null) {
                builder.append("_memberVnfIndexRef=");
                builder.append(_memberVnfIndexRef);
                builder.append(", ");
            }
            if (_serviceFunctionForwarder != null) {
                builder.append("_serviceFunctionForwarder=");
                builder.append(_serviceFunctionForwarder);
                builder.append(", ");
            }
            if (_serviceFunctionType != null) {
                builder.append("_serviceFunctionType=");
                builder.append(_serviceFunctionType);
                builder.append(", ");
            }
            if (_serviceIndex != null) {
                builder.append("_serviceIndex=");
                builder.append(_serviceIndex);
                builder.append(", ");
            }
            if (_vnfdIdRef != null) {
                builder.append("_vnfdIdRef=");
                builder.append(_vnfdIdRef);
                builder.append(", ");
            }
            if (_vnfrConnectionPointRef != null) {
                builder.append("_vnfrConnectionPointRef=");
                builder.append(_vnfrConnectionPointRef);
                builder.append(", ");
            }
            if (_vnfrIdRef != null) {
                builder.append("_vnfrIdRef=");
                builder.append(_vnfrIdRef);
                builder.append(", ");
            }
            if (_vnfrNameRef != null) {
                builder.append("_vnfrNameRef=");
                builder.append(_vnfrNameRef);
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
