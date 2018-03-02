package http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.rsp;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;

public class VnfdConnectionPointRefKey
 implements Identifier<VnfdConnectionPointRef> {
    private static final long serialVersionUID = 4604142757293548059L;
    private final java.lang.String _memberVnfIndexRef;


    public VnfdConnectionPointRefKey(java.lang.String _memberVnfIndexRef) {
    
    
        this._memberVnfIndexRef = _memberVnfIndexRef;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public VnfdConnectionPointRefKey(VnfdConnectionPointRefKey source) {
        this._memberVnfIndexRef = source._memberVnfIndexRef;
    }


    public java.lang.String getMemberVnfIndexRef() {
        return _memberVnfIndexRef;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_memberVnfIndexRef);
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
        VnfdConnectionPointRefKey other = (VnfdConnectionPointRefKey) obj;
        if (!Objects.equals(_memberVnfIndexRef, other._memberVnfIndexRef)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(http.riftio.nsd.base.rev170228.nsd.descriptor.common.vnffgd.rsp.VnfdConnectionPointRefKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_memberVnfIndexRef != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_memberVnfIndexRef=");
            builder.append(_memberVnfIndexRef);
        }
        return builder.append(']').toString();
    }
}

