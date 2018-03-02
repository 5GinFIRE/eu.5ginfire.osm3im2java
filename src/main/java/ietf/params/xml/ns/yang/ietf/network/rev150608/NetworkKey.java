package ietf.params.xml.ns.yang.ietf.network.rev150608;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;

public class NetworkKey
 implements Identifier<Network> {
    private static final long serialVersionUID = -4973572221161724124L;
    private final NetworkId _networkId;


    public NetworkKey(NetworkId _networkId) {
    
    
        this._networkId = _networkId;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public NetworkKey(NetworkKey source) {
        this._networkId = source._networkId;
    }


    public NetworkId getNetworkId() {
        return _networkId;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_networkId);
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
        NetworkKey other = (NetworkKey) obj;
        if (!Objects.equals(_networkId, other._networkId)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(ietf.params.xml.ns.yang.ietf.network.rev150608.NetworkKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_networkId != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_networkId=");
            builder.append(_networkId);
        }
        return builder.append(']').toString();
    }
}

