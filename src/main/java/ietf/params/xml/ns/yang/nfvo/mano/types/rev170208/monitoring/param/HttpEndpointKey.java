package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;

public class HttpEndpointKey
 implements Identifier<HttpEndpoint> {
    private static final long serialVersionUID = -5430746006117903610L;
    private final java.lang.String _path;


    public HttpEndpointKey(java.lang.String _path) {
    
    
        this._path = _path;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public HttpEndpointKey(HttpEndpointKey source) {
        this._path = source._path;
    }


    public java.lang.String getPath() {
        return _path;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_path);
        return result;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        HttpEndpointKey other = (HttpEndpointKey) obj;
        if (!Objects.equals(_path, other._path)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.HttpEndpointKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_path != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_path=");
            builder.append(_path);
        }
        return builder.append(']').toString();
    }
}

