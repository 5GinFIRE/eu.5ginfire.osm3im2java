package ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.link;
import org.opendaylight.yangtools.yang.binding.Identifier;

import ietf.params.xml.ns.yang.ietf.network.rev150608.NetworkId;

import java.util.Objects;

public class SupportingLinkKey
 implements Identifier<SupportingLink> {
    private static final long serialVersionUID = 5267690691179264108L;
    private final NetworkId _networkRef;
    private final java.lang.Object _linkRef;


    public SupportingLinkKey(java.lang.Object _linkRef, NetworkId _networkRef) {
    
    
        this._networkRef = _networkRef;
        this._linkRef = _linkRef;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public SupportingLinkKey(SupportingLinkKey source) {
        this._networkRef = source._networkRef;
        this._linkRef = source._linkRef;
    }


    public NetworkId getNetworkRef() {
        return _networkRef;
    }
    
    public java.lang.Object getLinkRef() {
        return _linkRef;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_networkRef);
        result = prime * result + Objects.hashCode(_linkRef);
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
        SupportingLinkKey other = (SupportingLinkKey) obj;
        if (!Objects.equals(_networkRef, other._networkRef)) {
            return false;
        }
        if (!Objects.equals(_linkRef, other._linkRef)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.link.SupportingLinkKey.class.getSimpleName()).append(" [");
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
        if (_linkRef != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_linkRef=");
            builder.append(_linkRef);
        }
        return builder.append(']').toString();
    }
}

