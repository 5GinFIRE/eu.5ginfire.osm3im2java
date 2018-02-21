package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.info.ip.profile.params;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.info.ip.profile.params.DnsServer} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.info.ip.profile.params.DnsServer
 *
 */
public class DnsServerBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.info.ip.profile.params.DnsServer> {

    private IpAddress _address;
    private DnsServerKey _key;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.info.ip.profile.params.DnsServer>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.info.ip.profile.params.DnsServer>> augmentation = Collections.emptyMap();

    public DnsServerBuilder() {
    }

    public DnsServerBuilder(DnsServer base) {
        if (base.getKey() == null) {
            this._key = new DnsServerKey(
                base.getAddress()
            );
            this._address = base.getAddress();
        } else {
            this._key = base.getKey();
            this._address = _key.getAddress();
        }
        if (base instanceof DnsServerImpl) {
            DnsServerImpl impl = (DnsServerImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.info.ip.profile.params.DnsServer> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.info.ip.profile.params.DnsServer>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public IpAddress getAddress() {
        return _address;
    }
    
    public DnsServerKey getKey() {
        return _key;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.info.ip.profile.params.DnsServer>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public DnsServerBuilder setAddress(final IpAddress value) {
        this._address = value;
        return this;
    }
    
     
    public DnsServerBuilder setKey(final DnsServerKey value) {
        this._key = value;
        return this;
    }
    
    public DnsServerBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.info.ip.profile.params.DnsServer>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.info.ip.profile.params.DnsServer> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public DnsServerBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.info.ip.profile.params.DnsServer>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public DnsServer build() {
        return new DnsServerImpl(this);
    }

    private static final class DnsServerImpl implements DnsServer {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.info.ip.profile.params.DnsServer> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.info.ip.profile.params.DnsServer.class;
        }

        private final IpAddress _address;
        private final DnsServerKey _key;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.info.ip.profile.params.DnsServer>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.info.ip.profile.params.DnsServer>> augmentation = Collections.emptyMap();

        private DnsServerImpl(DnsServerBuilder base) {
            if (base.getKey() == null) {
                this._key = new DnsServerKey(
                    base.getAddress()
                );
                this._address = base.getAddress();
            } else {
                this._key = base.getKey();
                this._address = _key.getAddress();
            }
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.info.ip.profile.params.DnsServer>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.info.ip.profile.params.DnsServer>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.info.ip.profile.params.DnsServer>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.info.ip.profile.params.DnsServer>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public IpAddress getAddress() {
            return _address;
        }
        
        @Override
        public DnsServerKey getKey() {
            return _key;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.info.ip.profile.params.DnsServer>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_address);
            result = prime * result + Objects.hashCode(_key);
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
            if (!ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.info.ip.profile.params.DnsServer.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.info.ip.profile.params.DnsServer other = (ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.info.ip.profile.params.DnsServer)obj;
            if (!Objects.equals(_address, other.getAddress())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                DnsServerImpl otherImpl = (DnsServerImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.info.ip.profile.params.DnsServer>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.info.ip.profile.params.DnsServer>> e : augmentation.entrySet()) {
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
            java.lang.String name = "DnsServer [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_address != null) {
                builder.append("_address=");
                builder.append(_address);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
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
