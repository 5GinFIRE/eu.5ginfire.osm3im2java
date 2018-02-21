package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import java.util.HashMap;

import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.ietf.inet.types.rev130715.PortNumber;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.HttpMethod;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.http.endpoint.Headers;

import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.HttpEndpoint} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.HttpEndpoint
 *
 */
public class HttpEndpointBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.HttpEndpoint> {

    private List<Headers> _headers;
    private HttpEndpointKey _key;
    private HttpMethod _method;
    private java.lang.String _password;
    private java.lang.String _path;
    private java.lang.Short _pollingIntervalSecs;
    private PortNumber _port;
    private java.lang.String _username;
    private java.lang.Boolean _https;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.HttpEndpoint>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.HttpEndpoint>> augmentation = Collections.emptyMap();

    public HttpEndpointBuilder() {
    }

    public HttpEndpointBuilder(HttpEndpoint base) {
        if (base.getKey() == null) {
            this._key = new HttpEndpointKey(
                base.getPath()
            );
            this._path = base.getPath();
        } else {
            this._key = base.getKey();
            this._path = _key.getPath();
        }
        this._headers = base.getHeaders();
        this._method = base.getMethod();
        this._password = base.getPassword();
        this._pollingIntervalSecs = base.getPollingIntervalSecs();
        this._port = base.getPort();
        this._username = base.getUsername();
        this._https = base.isHttps();
        if (base instanceof HttpEndpointImpl) {
            HttpEndpointImpl impl = (HttpEndpointImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.HttpEndpoint> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.HttpEndpoint>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public List<Headers> getHeaders() {
        return _headers;
    }
    
    public HttpEndpointKey getKey() {
        return _key;
    }
    
    public HttpMethod getMethod() {
        return _method;
    }
    
    public java.lang.String getPassword() {
        return _password;
    }
    
    public java.lang.String getPath() {
        return _path;
    }
    
    public java.lang.Short getPollingIntervalSecs() {
        return _pollingIntervalSecs;
    }
    
    public PortNumber getPort() {
        return _port;
    }
    
    public java.lang.String getUsername() {
        return _username;
    }
    
    public java.lang.Boolean isHttps() {
        return _https;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.HttpEndpoint>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public HttpEndpointBuilder setHeaders(final List<Headers> value) {
        this._headers = value;
        return this;
    }
    
     
    public HttpEndpointBuilder setKey(final HttpEndpointKey value) {
        this._key = value;
        return this;
    }
    
     
    public HttpEndpointBuilder setMethod(final HttpMethod value) {
        this._method = value;
        return this;
    }
    
     
    public HttpEndpointBuilder setPassword(final java.lang.String value) {
        this._password = value;
        return this;
    }
    
     
    public HttpEndpointBuilder setPath(final java.lang.String value) {
        this._path = value;
        return this;
    }
    
     
     private static void checkPollingIntervalSecsRange(final short value) {
         if (value >= (short)0 && value <= (short)255) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..255]].", value));
     }
    
    public HttpEndpointBuilder setPollingIntervalSecs(final java.lang.Short value) {
    if (value != null) {
        checkPollingIntervalSecsRange(value);
    }
        this._pollingIntervalSecs = value;
        return this;
    }
    
     
    public HttpEndpointBuilder setPort(final PortNumber value) {
        this._port = value;
        return this;
    }
    
     
    public HttpEndpointBuilder setUsername(final java.lang.String value) {
        this._username = value;
        return this;
    }
    
     
    public HttpEndpointBuilder setHttps(final java.lang.Boolean value) {
        this._https = value;
        return this;
    }
    
    public HttpEndpointBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.HttpEndpoint>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.HttpEndpoint> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public HttpEndpointBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.HttpEndpoint>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public HttpEndpoint build() {
        return new HttpEndpointImpl(this);
    }

    private static final class HttpEndpointImpl implements HttpEndpoint {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.HttpEndpoint> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.HttpEndpoint.class;
        }

        private final List<Headers> _headers;
        private final HttpEndpointKey _key;
        private final HttpMethod _method;
        private final java.lang.String _password;
        private final java.lang.String _path;
        private final java.lang.Short _pollingIntervalSecs;
        private final PortNumber _port;
        private final java.lang.String _username;
        private final java.lang.Boolean _https;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.HttpEndpoint>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.HttpEndpoint>> augmentation = Collections.emptyMap();

        private HttpEndpointImpl(HttpEndpointBuilder base) {
            if (base.getKey() == null) {
                this._key = new HttpEndpointKey(
                    base.getPath()
                );
                this._path = base.getPath();
            } else {
                this._key = base.getKey();
                this._path = _key.getPath();
            }
            this._headers = base.getHeaders();
            this._method = base.getMethod();
            this._password = base.getPassword();
            this._pollingIntervalSecs = base.getPollingIntervalSecs();
            this._port = base.getPort();
            this._username = base.getUsername();
            this._https = base.isHttps();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.HttpEndpoint>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.HttpEndpoint>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.HttpEndpoint>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.HttpEndpoint>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<Headers> getHeaders() {
            return _headers;
        }
        
        @Override
        public HttpEndpointKey getKey() {
            return _key;
        }
        
        @Override
        public HttpMethod getMethod() {
            return _method;
        }
        
        @Override
        public java.lang.String getPassword() {
            return _password;
        }
        
        @Override
        public java.lang.String getPath() {
            return _path;
        }
        
        @Override
        public java.lang.Short getPollingIntervalSecs() {
            return _pollingIntervalSecs;
        }
        
        @Override
        public PortNumber getPort() {
            return _port;
        }
        
        @Override
        public java.lang.String getUsername() {
            return _username;
        }
        
        @Override
        public java.lang.Boolean isHttps() {
            return _https;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.HttpEndpoint>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_headers);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_method);
            result = prime * result + Objects.hashCode(_password);
            result = prime * result + Objects.hashCode(_path);
            result = prime * result + Objects.hashCode(_pollingIntervalSecs);
            result = prime * result + Objects.hashCode(_port);
            result = prime * result + Objects.hashCode(_username);
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
            if (!ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.HttpEndpoint.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.HttpEndpoint other = (ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.HttpEndpoint)obj;
            if (!Objects.equals(_headers, other.getHeaders())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_method, other.getMethod())) {
                return false;
            }
            if (!Objects.equals(_password, other.getPassword())) {
                return false;
            }
            if (!Objects.equals(_path, other.getPath())) {
                return false;
            }
            if (!Objects.equals(_pollingIntervalSecs, other.getPollingIntervalSecs())) {
                return false;
            }
            if (!Objects.equals(_port, other.getPort())) {
                return false;
            }
            if (!Objects.equals(_username, other.getUsername())) {
                return false;
            }
            if (!Objects.equals(_https, other.isHttps())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                HttpEndpointImpl otherImpl = (HttpEndpointImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.HttpEndpoint>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.HttpEndpoint>> e : augmentation.entrySet()) {
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
            java.lang.String name = "HttpEndpoint [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_headers != null) {
                builder.append("_headers=");
                builder.append(_headers);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_method != null) {
                builder.append("_method=");
                builder.append(_method);
                builder.append(", ");
            }
            if (_password != null) {
                builder.append("_password=");
                builder.append(_password);
                builder.append(", ");
            }
            if (_path != null) {
                builder.append("_path=");
                builder.append(_path);
                builder.append(", ");
            }
            if (_pollingIntervalSecs != null) {
                builder.append("_pollingIntervalSecs=");
                builder.append(_pollingIntervalSecs);
                builder.append(", ");
            }
            if (_port != null) {
                builder.append("_port=");
                builder.append(_port);
                builder.append(", ");
            }
            if (_username != null) {
                builder.append("_username=");
                builder.append(_username);
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
