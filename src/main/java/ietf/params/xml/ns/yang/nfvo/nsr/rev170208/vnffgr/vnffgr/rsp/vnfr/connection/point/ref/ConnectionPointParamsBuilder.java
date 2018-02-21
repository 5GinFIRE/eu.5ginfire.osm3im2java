package ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp.vnfr.connection.point.ref;
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
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp.vnfr.connection.point.ref.ConnectionPointParams} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp.vnfr.connection.point.ref.ConnectionPointParams
 *
 */
public class ConnectionPointParamsBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp.vnfr.connection.point.ref.ConnectionPointParams> {

    private IpAddress _address;
    private IpAddress _mgmtAddress;
    private java.lang.String _name;
    private PortNumber _port;
    private java.lang.String _portId;
    private java.lang.String _vmId;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp.vnfr.connection.point.ref.ConnectionPointParams>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp.vnfr.connection.point.ref.ConnectionPointParams>> augmentation = Collections.emptyMap();

    public ConnectionPointParamsBuilder() {
    }

    public ConnectionPointParamsBuilder(ConnectionPointParams base) {
        this._address = base.getAddress();
        this._mgmtAddress = base.getMgmtAddress();
        this._name = base.getName();
        this._port = base.getPort();
        this._portId = base.getPortId();
        this._vmId = base.getVmId();
        if (base instanceof ConnectionPointParamsImpl) {
            ConnectionPointParamsImpl impl = (ConnectionPointParamsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp.vnfr.connection.point.ref.ConnectionPointParams> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp.vnfr.connection.point.ref.ConnectionPointParams>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public IpAddress getAddress() {
        return _address;
    }
    
    public IpAddress getMgmtAddress() {
        return _mgmtAddress;
    }
    
    public java.lang.String getName() {
        return _name;
    }
    
    public PortNumber getPort() {
        return _port;
    }
    
    public java.lang.String getPortId() {
        return _portId;
    }
    
    public java.lang.String getVmId() {
        return _vmId;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp.vnfr.connection.point.ref.ConnectionPointParams>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public ConnectionPointParamsBuilder setAddress(final IpAddress value) {
        this._address = value;
        return this;
    }
    
     
    public ConnectionPointParamsBuilder setMgmtAddress(final IpAddress value) {
        this._mgmtAddress = value;
        return this;
    }
    
     
    public ConnectionPointParamsBuilder setName(final java.lang.String value) {
        this._name = value;
        return this;
    }
    
     
    public ConnectionPointParamsBuilder setPort(final PortNumber value) {
        this._port = value;
        return this;
    }
    
     
    public ConnectionPointParamsBuilder setPortId(final java.lang.String value) {
        this._portId = value;
        return this;
    }
    
     
    public ConnectionPointParamsBuilder setVmId(final java.lang.String value) {
        this._vmId = value;
        return this;
    }
    
    public ConnectionPointParamsBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp.vnfr.connection.point.ref.ConnectionPointParams>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp.vnfr.connection.point.ref.ConnectionPointParams> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ConnectionPointParamsBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp.vnfr.connection.point.ref.ConnectionPointParams>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ConnectionPointParams build() {
        return new ConnectionPointParamsImpl(this);
    }

    private static final class ConnectionPointParamsImpl implements ConnectionPointParams {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp.vnfr.connection.point.ref.ConnectionPointParams> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp.vnfr.connection.point.ref.ConnectionPointParams.class;
        }

        private final IpAddress _address;
        private final IpAddress _mgmtAddress;
        private final java.lang.String _name;
        private final PortNumber _port;
        private final java.lang.String _portId;
        private final java.lang.String _vmId;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp.vnfr.connection.point.ref.ConnectionPointParams>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp.vnfr.connection.point.ref.ConnectionPointParams>> augmentation = Collections.emptyMap();

        private ConnectionPointParamsImpl(ConnectionPointParamsBuilder base) {
            this._address = base.getAddress();
            this._mgmtAddress = base.getMgmtAddress();
            this._name = base.getName();
            this._port = base.getPort();
            this._portId = base.getPortId();
            this._vmId = base.getVmId();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp.vnfr.connection.point.ref.ConnectionPointParams>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp.vnfr.connection.point.ref.ConnectionPointParams>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp.vnfr.connection.point.ref.ConnectionPointParams>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp.vnfr.connection.point.ref.ConnectionPointParams>>singletonMap(e.getKey(), e.getValue());
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
        public IpAddress getMgmtAddress() {
            return _mgmtAddress;
        }
        
        @Override
        public java.lang.String getName() {
            return _name;
        }
        
        @Override
        public PortNumber getPort() {
            return _port;
        }
        
        @Override
        public java.lang.String getPortId() {
            return _portId;
        }
        
        @Override
        public java.lang.String getVmId() {
            return _vmId;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp.vnfr.connection.point.ref.ConnectionPointParams>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_mgmtAddress);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_port);
            result = prime * result + Objects.hashCode(_portId);
            result = prime * result + Objects.hashCode(_vmId);
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
            if (!ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp.vnfr.connection.point.ref.ConnectionPointParams.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp.vnfr.connection.point.ref.ConnectionPointParams other = (ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp.vnfr.connection.point.ref.ConnectionPointParams)obj;
            if (!Objects.equals(_address, other.getAddress())) {
                return false;
            }
            if (!Objects.equals(_mgmtAddress, other.getMgmtAddress())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_port, other.getPort())) {
                return false;
            }
            if (!Objects.equals(_portId, other.getPortId())) {
                return false;
            }
            if (!Objects.equals(_vmId, other.getVmId())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ConnectionPointParamsImpl otherImpl = (ConnectionPointParamsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp.vnfr.connection.point.ref.ConnectionPointParams>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp.vnfr.connection.point.ref.ConnectionPointParams>> e : augmentation.entrySet()) {
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
            java.lang.String name = "ConnectionPointParams [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_address != null) {
                builder.append("_address=");
                builder.append(_address);
                builder.append(", ");
            }
            if (_mgmtAddress != null) {
                builder.append("_mgmtAddress=");
                builder.append(_mgmtAddress);
                builder.append(", ");
            }
            if (_name != null) {
                builder.append("_name=");
                builder.append(_name);
                builder.append(", ");
            }
            if (_port != null) {
                builder.append("_port=");
                builder.append(_port);
                builder.append(", ");
            }
            if (_portId != null) {
                builder.append("_portId=");
                builder.append(_portId);
                builder.append(", ");
            }
            if (_vmId != null) {
                builder.append("_vmId=");
                builder.append(_vmId);
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
