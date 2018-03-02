package ietf.params.xml.ns.yang.ietf.network.rev150608.network;
import org.opendaylight.yangtools.yang.binding.Identifier;

import ietf.params.xml.ns.yang.ietf.network.rev150608.NetworkId;

import java.util.Objects;

public class SupportingNetworkKey
 implements Identifier<SupportingNetwork> {
    private static final long serialVersionUID = -2437793732800485995L;
    private final NetworkId _networkRef;


    public SupportingNetworkKey(NetworkId _networkRef) {
    
    
        this._networkRef = _networkRef;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public SupportingNetworkKey(SupportingNetworkKey source) {
        this._networkRef = source._networkRef;
    }


    public NetworkId getNetworkRef() {
        return _networkRef;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_networkRef);
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
        SupportingNetworkKey other = (SupportingNetworkKey) obj;
        if (!Objects.equals(_networkRef, other._networkRef)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(ietf.params.xml.ns.yang.ietf.network.rev150608.network.SupportingNetworkKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_networkRef != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_networkRef=");
            builder.append(_networkRef);
        }
        return builder.append(']').toString();
    }
}

