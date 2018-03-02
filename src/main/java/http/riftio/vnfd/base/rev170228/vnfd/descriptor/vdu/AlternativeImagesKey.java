package http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;

public class AlternativeImagesKey
 implements Identifier<AlternativeImages> {
    private static final long serialVersionUID = -7720309248404653911L;
    private final java.lang.String _vimType;


    public AlternativeImagesKey(java.lang.String _vimType) {
    
    
        this._vimType = _vimType;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public AlternativeImagesKey(AlternativeImagesKey source) {
        this._vimType = source._vimType;
    }


    public java.lang.String getVimType() {
        return _vimType;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_vimType);
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
        AlternativeImagesKey other = (AlternativeImagesKey) obj;
        if (!Objects.equals(_vimType, other._vimType)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.AlternativeImagesKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_vimType != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_vimType=");
            builder.append(_vimType);
        }
        return builder.append(']').toString();
    }
}

