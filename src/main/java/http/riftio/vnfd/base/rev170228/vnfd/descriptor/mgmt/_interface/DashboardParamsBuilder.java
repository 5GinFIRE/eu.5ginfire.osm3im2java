package http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import com.fasterxml.jackson.annotation.JsonProperty;

import http.riftio.vnfd.base.rev170228.vnfd.descriptor.MgmtInterfaceBuilder;
import ietf.params.xml.ns.yang.ietf.inet.types.rev130715.PortNumber;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.DashboardParams} instances.
 * 
 * @see http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.DashboardParams
 *
 */
public class DashboardParamsBuilder implements Builder<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.DashboardParams> {

    private java.lang.String _path;
    private PortNumber _port;
    private java.lang.Boolean _https;

    Map<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.DashboardParams>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.DashboardParams>> augmentation = Collections.emptyMap();

    public DashboardParamsBuilder() {
    }

    public DashboardParamsBuilder(DashboardParams base) {
        this._path = base.getPath();
        this._port = base.getPort();
        this._https = base.isHttps();
        if (base instanceof DashboardParamsImpl) {
            DashboardParamsImpl impl = (DashboardParamsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.DashboardParams> casted =(AugmentationHolder<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.DashboardParams>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public java.lang.String getPath() {
        return _path;
    }
    
    public PortNumber getPort() {
        return _port;
    }
    
    public java.lang.Boolean isHttps() {
        return _https;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.DashboardParams>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public DashboardParamsBuilder setPath(final java.lang.String value) {
        this._path = value;
        return this;
    }
    
     
    public DashboardParamsBuilder setPort(final PortNumber value) {
        this._port = value;
        return this;
    }
    
     
    public DashboardParamsBuilder setHttps(final java.lang.Boolean value) {
        this._https = value;
        return this;
    }
    
    public DashboardParamsBuilder addAugmentation(java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.DashboardParams>> augmentationType, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.DashboardParams> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public DashboardParamsBuilder removeAugmentation(java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.DashboardParams>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public DashboardParams build() {
        return new DashboardParamsImpl(this);
    }

    public static final class DashboardParamsImpl implements DashboardParams {

        @Override
        public java.lang.Class<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.DashboardParams> getImplementedInterface() {
            return http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.DashboardParams.class;
        }

        @JsonProperty("path")
        private final java.lang.String _path;
        private PortNumber _port;
        @JsonProperty("https")
        private final java.lang.Boolean _https;

        private Map<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.DashboardParams>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.DashboardParams>> augmentation = Collections.emptyMap();

        private DashboardParamsImpl(DashboardParamsBuilder base) {
            this._path = base.getPath();
            this._port = base.getPort();
            this._https = base.isHttps();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.DashboardParams>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.DashboardParams>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.DashboardParams>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.DashboardParams>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }
        
        @JsonProperty("port")
        public void setPort(String s){
           _port = new PortNumber(Integer.parseInt(s));
        }
        
        public DashboardParamsImpl(){
        	this( new DashboardParamsBuilder() );
        }

        @Override
        public java.lang.String getPath() {
            return _path;
        }
        
        @Override
        public PortNumber getPort() {
            return _port;
        }
        
        @Override
        public java.lang.Boolean isHttps() {
            return _https;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.DashboardParams>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_path);
            result = prime * result + Objects.hashCode(_port);
            result = prime * result + Objects.hashCode(_https);
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
            if (!http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.DashboardParams.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.DashboardParams other = (http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.DashboardParams)obj;
            if (!Objects.equals(_path, other.getPath())) {
                return false;
            }
            if (!Objects.equals(_port, other.getPort())) {
                return false;
            }
            if (!Objects.equals(_https, other.isHttps())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                DashboardParamsImpl otherImpl = (DashboardParamsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.DashboardParams>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.DashboardParams>> e : augmentation.entrySet()) {
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
            java.lang.String name = "DashboardParams [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_path != null) {
                builder.append("_path=");
                builder.append(_path);
                builder.append(", ");
            }
            if (_port != null) {
                builder.append("_port=");
                builder.append(_port);
                builder.append(", ");
            }
            if (_https != null) {
                builder.append("_https=");
                builder.append(_https);
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
