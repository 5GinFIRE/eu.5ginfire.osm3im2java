package ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.vld.vld;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;

public class VnfdConnectionPointRefKey
 implements Identifier<VnfdConnectionPointRef> {
    private static final long serialVersionUID = -4571246318647525705L;
    private final java.lang.String _memberVnfIndexRef;
    private final java.lang.Object _vnfdConnectionPointRef;


    public VnfdConnectionPointRefKey(java.lang.String _memberVnfIndexRef, java.lang.Object _vnfdConnectionPointRef) {
    
    
        this._memberVnfIndexRef = _memberVnfIndexRef;
        this._vnfdConnectionPointRef = _vnfdConnectionPointRef;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public VnfdConnectionPointRefKey(VnfdConnectionPointRefKey source) {
        this._memberVnfIndexRef = source._memberVnfIndexRef;
        this._vnfdConnectionPointRef = source._vnfdConnectionPointRef;
    }


    public java.lang.String getMemberVnfIndexRef() {
        return _memberVnfIndexRef;
    }
    
    public java.lang.Object getVnfdConnectionPointRef() {
        return _vnfdConnectionPointRef;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_memberVnfIndexRef);
        result = prime * result + Objects.hashCode(_vnfdConnectionPointRef);
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
        if (!Objects.equals(_vnfdConnectionPointRef, other._vnfdConnectionPointRef)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.vld.vld.VnfdConnectionPointRefKey.class.getSimpleName()).append(" [");
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
        if (_vnfdConnectionPointRef != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_vnfdConnectionPointRef=");
            builder.append(_vnfdConnectionPointRef);
        }
        return builder.append(']').toString();
    }
}

