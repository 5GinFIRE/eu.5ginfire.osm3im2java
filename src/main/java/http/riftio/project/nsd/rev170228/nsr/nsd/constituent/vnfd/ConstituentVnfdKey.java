package http.riftio.project.nsd.rev170228.nsr.nsd.constituent.vnfd;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;
import java.math.BigInteger;

public class ConstituentVnfdKey
 implements Identifier<ConstituentVnfd> {
    private static final long serialVersionUID = 5403978362043531679L;
    private final BigInteger _memberVnfIndex;


    public ConstituentVnfdKey(BigInteger _memberVnfIndex) {
    
    
        this._memberVnfIndex = _memberVnfIndex;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public ConstituentVnfdKey(ConstituentVnfdKey source) {
        this._memberVnfIndex = source._memberVnfIndex;
    }


    public BigInteger getMemberVnfIndex() {
        return _memberVnfIndex;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_memberVnfIndex);
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
        ConstituentVnfdKey other = (ConstituentVnfdKey) obj;
        if (!Objects.equals(_memberVnfIndex, other._memberVnfIndex)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(http.riftio.project.nsd.rev170228.nsr.nsd.constituent.vnfd.ConstituentVnfdKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_memberVnfIndex != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_memberVnfIndex=");
            builder.append(_memberVnfIndex);
        }
        return builder.append(']').toString();
    }
}

