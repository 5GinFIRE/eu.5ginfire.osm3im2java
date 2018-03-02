package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.aggregate;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;

public class HostAggregateKey
 implements Identifier<HostAggregate> {
    private static final long serialVersionUID = -2962347543593449709L;
    private final java.lang.String _metadataKey;


    public HostAggregateKey(java.lang.String _metadataKey) {
    
    
        this._metadataKey = _metadataKey;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public HostAggregateKey(HostAggregateKey source) {
        this._metadataKey = source._metadataKey;
    }


    public java.lang.String getMetadataKey() {
        return _metadataKey;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_metadataKey);
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
        HostAggregateKey other = (HostAggregateKey) obj;
        if (!Objects.equals(_metadataKey, other._metadataKey)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.aggregate.HostAggregateKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_metadataKey != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_metadataKey=");
            builder.append(_metadataKey);
        }
        return builder.append(']').toString();
    }
}

