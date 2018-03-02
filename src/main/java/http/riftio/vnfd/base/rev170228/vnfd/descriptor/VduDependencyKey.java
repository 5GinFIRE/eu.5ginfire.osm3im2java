package http.riftio.vnfd.base.rev170228.vnfd.descriptor;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;

public class VduDependencyKey
 implements Identifier<VduDependency> {
    private static final long serialVersionUID = -9063807131586796668L;
    private final java.lang.String _vduSourceRef;


    public VduDependencyKey(java.lang.String _vduSourceRef) {
    
    
        this._vduSourceRef = _vduSourceRef;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public VduDependencyKey(VduDependencyKey source) {
        this._vduSourceRef = source._vduSourceRef;
    }


    public java.lang.String getVduSourceRef() {
        return _vduSourceRef;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_vduSourceRef);
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
        VduDependencyKey other = (VduDependencyKey) obj;
        if (!Objects.equals(_vduSourceRef, other._vduSourceRef)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(http.riftio.vnfd.base.rev170228.vnfd.descriptor.VduDependencyKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_vduSourceRef != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_vduSourceRef=");
            builder.append(_vduSourceRef);
        }
        return builder.append(']').toString();
    }
}

