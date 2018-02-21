package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.network;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.math.BigInteger;
import java.util.Collections;
import java.util.Map;
import java.math.BigDecimal;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.network.Outgoing} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.network.Outgoing
 *
 */
public class OutgoingBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.network.Outgoing> {

    private BigDecimal _byteRate;
    private BigInteger _bytes;
    private java.lang.String _label;
    private BigDecimal _packetRate;
    private BigInteger _packets;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.network.Outgoing>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.network.Outgoing>> augmentation = Collections.emptyMap();

    public OutgoingBuilder() {
    }

    public OutgoingBuilder(Outgoing base) {
        this._byteRate = base.getByteRate();
        this._bytes = base.getBytes();
        this._label = base.getLabel();
        this._packetRate = base.getPacketRate();
        this._packets = base.getPackets();
        if (base instanceof OutgoingImpl) {
            OutgoingImpl impl = (OutgoingImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.network.Outgoing> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.network.Outgoing>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public BigDecimal getByteRate() {
        return _byteRate;
    }
    
    public BigInteger getBytes() {
        return _bytes;
    }
    
    public java.lang.String getLabel() {
        return _label;
    }
    
    public BigDecimal getPacketRate() {
        return _packetRate;
    }
    
    public BigInteger getPackets() {
        return _packets;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.network.Outgoing>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public OutgoingBuilder setByteRate(final BigDecimal value) {
        this._byteRate = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKBYTESRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKBYTESRANGE_RANGES = a;
     }
     private static void checkBytesRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKBYTESRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKBYTESRANGE_RANGES)));
     }
    
    public OutgoingBuilder setBytes(final BigInteger value) {
    if (value != null) {
        checkBytesRange(value);
    }
        this._bytes = value;
        return this;
    }
    
     
    public OutgoingBuilder setLabel(final java.lang.String value) {
        this._label = value;
        return this;
    }
    
     
    public OutgoingBuilder setPacketRate(final BigDecimal value) {
        this._packetRate = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKPACKETSRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKPACKETSRANGE_RANGES = a;
     }
     private static void checkPacketsRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKPACKETSRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKPACKETSRANGE_RANGES)));
     }
    
    public OutgoingBuilder setPackets(final BigInteger value) {
    if (value != null) {
        checkPacketsRange(value);
    }
        this._packets = value;
        return this;
    }
    
    public OutgoingBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.network.Outgoing>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.network.Outgoing> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public OutgoingBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.network.Outgoing>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Outgoing build() {
        return new OutgoingImpl(this);
    }

    private static final class OutgoingImpl implements Outgoing {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.network.Outgoing> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.network.Outgoing.class;
        }

        private final BigDecimal _byteRate;
        private final BigInteger _bytes;
        private final java.lang.String _label;
        private final BigDecimal _packetRate;
        private final BigInteger _packets;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.network.Outgoing>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.network.Outgoing>> augmentation = Collections.emptyMap();

        private OutgoingImpl(OutgoingBuilder base) {
            this._byteRate = base.getByteRate();
            this._bytes = base.getBytes();
            this._label = base.getLabel();
            this._packetRate = base.getPacketRate();
            this._packets = base.getPackets();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.network.Outgoing>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.network.Outgoing>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.network.Outgoing>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.network.Outgoing>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public BigDecimal getByteRate() {
            return _byteRate;
        }
        
        @Override
        public BigInteger getBytes() {
            return _bytes;
        }
        
        @Override
        public java.lang.String getLabel() {
            return _label;
        }
        
        @Override
        public BigDecimal getPacketRate() {
            return _packetRate;
        }
        
        @Override
        public BigInteger getPackets() {
            return _packets;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.network.Outgoing>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_byteRate);
            result = prime * result + Objects.hashCode(_bytes);
            result = prime * result + Objects.hashCode(_label);
            result = prime * result + Objects.hashCode(_packetRate);
            result = prime * result + Objects.hashCode(_packets);
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
            if (!ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.network.Outgoing.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.network.Outgoing other = (ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.network.Outgoing)obj;
            if (!Objects.equals(_byteRate, other.getByteRate())) {
                return false;
            }
            if (!Objects.equals(_bytes, other.getBytes())) {
                return false;
            }
            if (!Objects.equals(_label, other.getLabel())) {
                return false;
            }
            if (!Objects.equals(_packetRate, other.getPacketRate())) {
                return false;
            }
            if (!Objects.equals(_packets, other.getPackets())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                OutgoingImpl otherImpl = (OutgoingImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.network.Outgoing>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.network.Outgoing>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Outgoing [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_byteRate != null) {
                builder.append("_byteRate=");
                builder.append(_byteRate);
                builder.append(", ");
            }
            if (_bytes != null) {
                builder.append("_bytes=");
                builder.append(_bytes);
                builder.append(", ");
            }
            if (_label != null) {
                builder.append("_label=");
                builder.append(_label);
                builder.append(", ");
            }
            if (_packetRate != null) {
                builder.append("_packetRate=");
                builder.append(_packetRate);
                builder.append(", ");
            }
            if (_packets != null) {
                builder.append("_packets=");
                builder.append(_packets);
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
