package ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;

public class VnfrConnectionPointRefKey
 implements Identifier<VnfrConnectionPointRef> {
    private static final long serialVersionUID = -1518245190494016078L;
    private final java.lang.Short _hopNumber;


    public VnfrConnectionPointRefKey(java.lang.Short _hopNumber) {
    
    
        this._hopNumber = _hopNumber;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public VnfrConnectionPointRefKey(VnfrConnectionPointRefKey source) {
        this._hopNumber = source._hopNumber;
    }


    public java.lang.Short getHopNumber() {
        return _hopNumber;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_hopNumber);
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
        VnfrConnectionPointRefKey other = (VnfrConnectionPointRefKey) obj;
        if (!Objects.equals(_hopNumber, other._hopNumber)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp.VnfrConnectionPointRefKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_hopNumber != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_hopNumber=");
            builder.append(_hopNumber);
        }
        return builder.append(']').toString();
    }
}

