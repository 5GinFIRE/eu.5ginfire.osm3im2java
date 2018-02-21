package http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.classifier;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;
import ietf.params.xml.ns.yang.ietf.inet.types.rev130715.PortNumber;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.classifier.MatchAttributes} instances.
 * 
 * @see http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.classifier.MatchAttributes
 *
 */
public class MatchAttributesBuilder implements Builder<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.classifier.MatchAttributes> {

    private IpAddress _destinationIpAddress;
    private PortNumber _destinationPort;
    private java.lang.String _id;
    private java.lang.Short _ipProto;
    private MatchAttributesKey _key;
    private IpAddress _sourceIpAddress;
    private PortNumber _sourcePort;

    Map<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.classifier.MatchAttributes>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.classifier.MatchAttributes>> augmentation = Collections.emptyMap();

    public MatchAttributesBuilder() {
    }

    public MatchAttributesBuilder(MatchAttributes base) {
        if (base.getKey() == null) {
            this._key = new MatchAttributesKey(
                base.getId()
            );
            this._id = base.getId();
        } else {
            this._key = base.getKey();
            this._id = _key.getId();
        }
        this._destinationIpAddress = base.getDestinationIpAddress();
        this._destinationPort = base.getDestinationPort();
        this._ipProto = base.getIpProto();
        this._sourceIpAddress = base.getSourceIpAddress();
        this._sourcePort = base.getSourcePort();
        if (base instanceof MatchAttributesImpl) {
            MatchAttributesImpl impl = (MatchAttributesImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.classifier.MatchAttributes> casted =(AugmentationHolder<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.classifier.MatchAttributes>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public IpAddress getDestinationIpAddress() {
        return _destinationIpAddress;
    }
    
    public PortNumber getDestinationPort() {
        return _destinationPort;
    }
    
    public java.lang.String getId() {
        return _id;
    }
    
    public java.lang.Short getIpProto() {
        return _ipProto;
    }
    
    public MatchAttributesKey getKey() {
        return _key;
    }
    
    public IpAddress getSourceIpAddress() {
        return _sourceIpAddress;
    }
    
    public PortNumber getSourcePort() {
        return _sourcePort;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.classifier.MatchAttributes>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public MatchAttributesBuilder setDestinationIpAddress(final IpAddress value) {
        this._destinationIpAddress = value;
        return this;
    }
    
     
    public MatchAttributesBuilder setDestinationPort(final PortNumber value) {
        this._destinationPort = value;
        return this;
    }
    
     
    public MatchAttributesBuilder setId(final java.lang.String value) {
        this._id = value;
        return this;
    }
    
     
     private static void checkIpProtoRange(final short value) {
         if (value >= (short)0 && value <= (short)255) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..255]].", value));
     }
    
    public MatchAttributesBuilder setIpProto(final java.lang.Short value) {
    if (value != null) {
        checkIpProtoRange(value);
    }
        this._ipProto = value;
        return this;
    }
    
     
    public MatchAttributesBuilder setKey(final MatchAttributesKey value) {
        this._key = value;
        return this;
    }
    
     
    public MatchAttributesBuilder setSourceIpAddress(final IpAddress value) {
        this._sourceIpAddress = value;
        return this;
    }
    
     
    public MatchAttributesBuilder setSourcePort(final PortNumber value) {
        this._sourcePort = value;
        return this;
    }
    
    public MatchAttributesBuilder addAugmentation(java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.classifier.MatchAttributes>> augmentationType, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.classifier.MatchAttributes> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public MatchAttributesBuilder removeAugmentation(java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.classifier.MatchAttributes>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public MatchAttributes build() {
        return new MatchAttributesImpl(this);
    }

    private static final class MatchAttributesImpl implements MatchAttributes {

        @Override
        public java.lang.Class<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.classifier.MatchAttributes> getImplementedInterface() {
            return http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.classifier.MatchAttributes.class;
        }

        private final IpAddress _destinationIpAddress;
        private final PortNumber _destinationPort;
        private final java.lang.String _id;
        private final java.lang.Short _ipProto;
        private final MatchAttributesKey _key;
        private final IpAddress _sourceIpAddress;
        private final PortNumber _sourcePort;

        private Map<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.classifier.MatchAttributes>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.classifier.MatchAttributes>> augmentation = Collections.emptyMap();

        private MatchAttributesImpl(MatchAttributesBuilder base) {
            if (base.getKey() == null) {
                this._key = new MatchAttributesKey(
                    base.getId()
                );
                this._id = base.getId();
            } else {
                this._key = base.getKey();
                this._id = _key.getId();
            }
            this._destinationIpAddress = base.getDestinationIpAddress();
            this._destinationPort = base.getDestinationPort();
            this._ipProto = base.getIpProto();
            this._sourceIpAddress = base.getSourceIpAddress();
            this._sourcePort = base.getSourcePort();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.classifier.MatchAttributes>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.classifier.MatchAttributes>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.classifier.MatchAttributes>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.classifier.MatchAttributes>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public IpAddress getDestinationIpAddress() {
            return _destinationIpAddress;
        }
        
        @Override
        public PortNumber getDestinationPort() {
            return _destinationPort;
        }
        
        @Override
        public java.lang.String getId() {
            return _id;
        }
        
        @Override
        public java.lang.Short getIpProto() {
            return _ipProto;
        }
        
        @Override
        public MatchAttributesKey getKey() {
            return _key;
        }
        
        @Override
        public IpAddress getSourceIpAddress() {
            return _sourceIpAddress;
        }
        
        @Override
        public PortNumber getSourcePort() {
            return _sourcePort;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.classifier.MatchAttributes>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_destinationIpAddress);
            result = prime * result + Objects.hashCode(_destinationPort);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_ipProto);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_sourceIpAddress);
            result = prime * result + Objects.hashCode(_sourcePort);
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
            if (!http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.classifier.MatchAttributes.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.classifier.MatchAttributes other = (http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.classifier.MatchAttributes)obj;
            if (!Objects.equals(_destinationIpAddress, other.getDestinationIpAddress())) {
                return false;
            }
            if (!Objects.equals(_destinationPort, other.getDestinationPort())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_ipProto, other.getIpProto())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_sourceIpAddress, other.getSourceIpAddress())) {
                return false;
            }
            if (!Objects.equals(_sourcePort, other.getSourcePort())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                MatchAttributesImpl otherImpl = (MatchAttributesImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.classifier.MatchAttributes>>, Augmentation<http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.classifier.MatchAttributes>> e : augmentation.entrySet()) {
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
            java.lang.String name = "MatchAttributes [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_destinationIpAddress != null) {
                builder.append("_destinationIpAddress=");
                builder.append(_destinationIpAddress);
                builder.append(", ");
            }
            if (_destinationPort != null) {
                builder.append("_destinationPort=");
                builder.append(_destinationPort);
                builder.append(", ");
            }
            if (_id != null) {
                builder.append("_id=");
                builder.append(_id);
                builder.append(", ");
            }
            if (_ipProto != null) {
                builder.append("_ipProto=");
                builder.append(_ipProto);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_sourceIpAddress != null) {
                builder.append("_sourceIpAddress=");
                builder.append(_sourceIpAddress);
                builder.append(", ");
            }
            if (_sourcePort != null) {
                builder.append("_sourcePort=");
                builder.append(_sourcePort);
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
