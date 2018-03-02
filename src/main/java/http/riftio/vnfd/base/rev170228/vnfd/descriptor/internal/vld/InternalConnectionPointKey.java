package http.riftio.vnfd.base.rev170228.vnfd.descriptor.internal.vld;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;

public class InternalConnectionPointKey
 implements Identifier<InternalConnectionPoint> {
    private static final long serialVersionUID = -7496980910000592960L;
    private final java.lang.String _idRef;


    public InternalConnectionPointKey(java.lang.String _idRef) {
    
    
        this._idRef = _idRef;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public InternalConnectionPointKey(InternalConnectionPointKey source) {
        this._idRef = source._idRef;
    }


    public java.lang.String getIdRef() {
        return _idRef;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_idRef);
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
        InternalConnectionPointKey other = (InternalConnectionPointKey) obj;
        if (!Objects.equals(_idRef, other._idRef)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(http.riftio.vnfd.base.rev170228.vnfd.descriptor.internal.vld.InternalConnectionPointKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_idRef != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_idRef=");
            builder.append(_idRef);
        }
        return builder.append(']').toString();
    }
}

