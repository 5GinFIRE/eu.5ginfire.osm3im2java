package http.riftio.vnfd.base.rev170228.vnfd.descriptor.placement.groups;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;

public class MemberVdusKey
 implements Identifier<MemberVdus> {
    private static final long serialVersionUID = 8868330271211804398L;
    private final java.lang.String _memberVduRef;


    public MemberVdusKey(java.lang.String _memberVduRef) {
    
    
        this._memberVduRef = _memberVduRef;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public MemberVdusKey(MemberVdusKey source) {
        this._memberVduRef = source._memberVduRef;
    }


    public java.lang.String getMemberVduRef() {
        return _memberVduRef;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_memberVduRef);
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
        MemberVdusKey other = (MemberVdusKey) obj;
        if (!Objects.equals(_memberVduRef, other._memberVduRef)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(http.riftio.vnfd.base.rev170228.vnfd.descriptor.placement.groups.MemberVdusKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_memberVduRef != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_memberVduRef=");
            builder.append(_memberVduRef);
        }
        return builder.append(']').toString();
    }
}

