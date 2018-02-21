package ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;

public class ConstituentVnfrRefKey
 implements Identifier<ConstituentVnfrRef> {
    private static final long serialVersionUID = 2476453428846674934L;
    private final java.lang.String _vnfrId;


    public ConstituentVnfrRefKey(java.lang.String _vnfrId) {
    
    
        this._vnfrId = _vnfrId;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public ConstituentVnfrRefKey(ConstituentVnfrRefKey source) {
        this._vnfrId = source._vnfrId;
    }


    public java.lang.String getVnfrId() {
        return _vnfrId;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_vnfrId);
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
        ConstituentVnfrRefKey other = (ConstituentVnfrRefKey) obj;
        if (!Objects.equals(_vnfrId, other._vnfrId)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.ConstituentVnfrRefKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_vnfrId != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_vnfrId=");
            builder.append(_vnfrId);
        }
        return builder.append(']').toString();
    }
}

