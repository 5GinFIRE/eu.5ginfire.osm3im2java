package http.riftio.vnfd.base.rev170228.vnfd.descriptor;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.*;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import com.fasterxml.jackson.annotation.JsonProperty;

import http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.DashboardParams;
import http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.EndpointType;
import ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;
import ietf.params.xml.ns.yang.ietf.inet.types.rev130715.PortNumber;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;

import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link http.riftio.vnfd.base.rev170228.vnfd.descriptor.MgmtInterface} instances.
 * 
 * @see http.riftio.vnfd.base.rev170228.vnfd.descriptor.MgmtInterface
 *
 */
public class MgmtInterfaceBuilder implements Builder<http.riftio.vnfd.base.rev170228.vnfd.descriptor.MgmtInterface> {

    private DashboardParams _dashboardParams;
    private EndpointType _endpointType;
    private PortNumber _port;

    Map<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.MgmtInterface>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.MgmtInterface>> augmentation = Collections.emptyMap();

    public MgmtInterfaceBuilder() {
    }

    public MgmtInterfaceBuilder(MgmtInterface base) {
        this._dashboardParams = base.getDashboardParams();
        this._endpointType = base.getEndpointType();
        this._port = base.getPort();
        if (base instanceof MgmtInterfaceImpl) {
            MgmtInterfaceImpl impl = (MgmtInterfaceImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<http.riftio.vnfd.base.rev170228.vnfd.descriptor.MgmtInterface> casted =(AugmentationHolder<http.riftio.vnfd.base.rev170228.vnfd.descriptor.MgmtInterface>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public DashboardParams getDashboardParams() {
        return _dashboardParams;
    }
    
    public EndpointType getEndpointType() {
        return _endpointType;
    }
    
    public PortNumber getPort() {
        return _port;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.MgmtInterface>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public MgmtInterfaceBuilder setDashboardParams(final DashboardParams value) {
        this._dashboardParams = value;
        return this;
    }
    
     
    public MgmtInterfaceBuilder setEndpointType(final EndpointType value) {
        this._endpointType = value;
        return this;
    }
    
     
    public MgmtInterfaceBuilder setPort(final PortNumber value) {
        this._port = value;
        return this;
    }
    
    public MgmtInterfaceBuilder addAugmentation(java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.MgmtInterface>> augmentationType, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.MgmtInterface> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public MgmtInterfaceBuilder removeAugmentation(java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.MgmtInterface>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public MgmtInterface build() {
        return new MgmtInterfaceImpl(this);
    }

    public static final class MgmtInterfaceImpl implements MgmtInterface {

        @Override
        public java.lang.Class<http.riftio.vnfd.base.rev170228.vnfd.descriptor.MgmtInterface> getImplementedInterface() {
            return http.riftio.vnfd.base.rev170228.vnfd.descriptor.MgmtInterface.class;
        }

        @JsonProperty("dashboard-params")        
        private final DashboardParams _dashboardParams;
        @JsonProperty("endpoint-type")        
        private EndpointType _endpointType;    
        private PortNumber _port;

        private Map<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.MgmtInterface>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.MgmtInterface>> augmentation = Collections.emptyMap();

        private MgmtInterfaceImpl(MgmtInterfaceBuilder base) {
            this._dashboardParams = base.getDashboardParams();
            this._endpointType = base.getEndpointType();
            this._port = base.getPort();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.MgmtInterface>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.MgmtInterface>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.MgmtInterface>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.MgmtInterface>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }
        
        public MgmtInterfaceImpl(){
        	this( new MgmtInterfaceBuilder() );
        }
        
        @JsonProperty("port")
        public void setPort(String s){
           _port = new PortNumber(Integer.parseInt(s));
        }
        
        @JsonProperty("vdu-id")
        public void setVduidAsEndpointType(String s){
        	_endpointType = (new VduIdBuilder().setVduId(s)).build() ;
        }
        
        @JsonProperty("cp")
        public void setCPAsEndpointType(String s){
        	_endpointType = (new CpBuilder().setCp(s)).build() ;
        }
        
        @JsonProperty("ip")
        public void setIPAsEndpointType(String s){
        	_endpointType = (new IpBuilder().setIpAddress(new IpAddress(s))).build() ;
        }

        @Override
        public DashboardParams getDashboardParams() {
            return _dashboardParams;
        }
        
        @Override
        public EndpointType getEndpointType() {
            return _endpointType;
        }
        
        @Override
        public PortNumber getPort() {
            return _port;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.MgmtInterface>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_dashboardParams);
            result = prime * result + Objects.hashCode(_endpointType);
            result = prime * result + Objects.hashCode(_port);
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
            if (!http.riftio.vnfd.base.rev170228.vnfd.descriptor.MgmtInterface.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            http.riftio.vnfd.base.rev170228.vnfd.descriptor.MgmtInterface other = (http.riftio.vnfd.base.rev170228.vnfd.descriptor.MgmtInterface)obj;
            if (!Objects.equals(_dashboardParams, other.getDashboardParams())) {
                return false;
            }
            if (!Objects.equals(_endpointType, other.getEndpointType())) {
                return false;
            }
            if (!Objects.equals(_port, other.getPort())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                MgmtInterfaceImpl otherImpl = (MgmtInterfaceImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.MgmtInterface>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.MgmtInterface>> e : augmentation.entrySet()) {
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
            java.lang.String name = "MgmtInterface [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_dashboardParams != null) {
                builder.append("_dashboardParams=");
                builder.append(_dashboardParams);
                builder.append(", ");
            }
            if (_endpointType != null) {
                builder.append("_endpointType=");
                builder.append(_endpointType);
                builder.append(", ");
            }
            if (_port != null) {
                builder.append("_port=");
                builder.append(_port);
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
