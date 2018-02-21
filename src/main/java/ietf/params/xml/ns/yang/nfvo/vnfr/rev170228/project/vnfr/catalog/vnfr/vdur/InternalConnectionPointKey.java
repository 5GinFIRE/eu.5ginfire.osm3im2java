package ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;

public class InternalConnectionPointKey
 implements Identifier<InternalConnectionPoint> {
    private static final long serialVersionUID = 5359893710851552905L;
    private final java.lang.String _id;


    public InternalConnectionPointKey(java.lang.String _id) {
    
    
        this._id = _id;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public InternalConnectionPointKey(InternalConnectionPointKey source) {
        this._id = source._id;
    }


    public java.lang.String getId() {
        return _id;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_id);
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
        if (!Objects.equals(_id, other._id)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.InternalConnectionPointKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_id != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_id=");
            builder.append(_id);
        }
        return builder.append(']').toString();
    }
}

