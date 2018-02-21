package http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type;
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
 * Class that builds {@link http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.Ip} instances.
 * 
 * @see http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.Ip
 *
 */
public class IpBuilder implements Builder<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.Ip> {

    private IpAddress _ipAddress;

    Map<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.Ip>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.Ip>> augmentation = Collections.emptyMap();

    public IpBuilder() {
    }

    public IpBuilder(Ip base) {
        this._ipAddress = base.getIpAddress();
        if (base instanceof IpImpl) {
            IpImpl impl = (IpImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.Ip> casted =(AugmentationHolder<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.Ip>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public IpAddress getIpAddress() {
        return _ipAddress;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.Ip>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public IpBuilder setIpAddress(final IpAddress value) {
        this._ipAddress = value;
        return this;
    }
    
    public IpBuilder addAugmentation(java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.Ip>> augmentationType, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.Ip> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public IpBuilder removeAugmentation(java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.Ip>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Ip build() {
        return new IpImpl(this);
    }

    private static final class IpImpl implements Ip {

        @Override
        public java.lang.Class<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.Ip> getImplementedInterface() {
            return http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.Ip.class;
        }

        private final IpAddress _ipAddress;

        private Map<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.Ip>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.Ip>> augmentation = Collections.emptyMap();

        private IpImpl(IpBuilder base) {
            this._ipAddress = base.getIpAddress();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.Ip>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.Ip>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.Ip>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.Ip>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public IpAddress getIpAddress() {
            return _ipAddress;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.Ip>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_ipAddress);
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
            if (!http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.Ip.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.Ip other = (http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.Ip)obj;
            if (!Objects.equals(_ipAddress, other.getIpAddress())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                IpImpl otherImpl = (IpImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.Ip>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.Ip>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Ip [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_ipAddress != null) {
                builder.append("_ipAddress=");
                builder.append(_ipAddress);
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
