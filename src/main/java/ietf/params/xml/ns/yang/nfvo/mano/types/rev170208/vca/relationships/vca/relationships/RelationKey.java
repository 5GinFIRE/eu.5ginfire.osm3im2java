package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.relationships.vca.relationships;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;

public class RelationKey
 implements Identifier<Relation> {
    private static final long serialVersionUID = 1055691159706191884L;
    private final java.lang.String _requires;
    private final java.lang.String _provides;


    public RelationKey(java.lang.String _provides, java.lang.String _requires) {
    
    
        this._requires = _requires;
        this._provides = _provides;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public RelationKey(RelationKey source) {
        this._requires = source._requires;
        this._provides = source._provides;
    }


    public java.lang.String getRequires() {
        return _requires;
    }
    
    public java.lang.String getProvides() {
        return _provides;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_requires);
        result = prime * result + Objects.hashCode(_provides);
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
        RelationKey other = (RelationKey) obj;
        if (!Objects.equals(_requires, other._requires)) {
            return false;
        }
        if (!Objects.equals(_provides, other._provides)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.relationships.vca.relationships.RelationKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_requires != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_requires=");
            builder.append(_requires);
        }
        if (_provides != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_provides=");
            builder.append(_provides);
        }
        return builder.append(']').toString();
    }
}

