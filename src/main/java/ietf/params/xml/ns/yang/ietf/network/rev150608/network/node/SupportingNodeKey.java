package ietf.params.xml.ns.yang.ietf.network.rev150608.network.node;
import org.opendaylight.yangtools.yang.binding.Identifier;

import ietf.params.xml.ns.yang.ietf.network.rev150608.NetworkId;
import ietf.params.xml.ns.yang.ietf.network.rev150608.NodeId;

import java.util.Objects;

public class SupportingNodeKey
 implements Identifier<SupportingNode> {
    private static final long serialVersionUID = 512422044746278657L;
    private final NetworkId _networkRef;
    private final NodeId _nodeRef;


    public SupportingNodeKey(NetworkId _networkRef, NodeId _nodeRef) {
    
    
        this._networkRef = _networkRef;
        this._nodeRef = _nodeRef;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public SupportingNodeKey(SupportingNodeKey source) {
        this._networkRef = source._networkRef;
        this._nodeRef = source._nodeRef;
    }


    public NetworkId getNetworkRef() {
        return _networkRef;
    }
    
    public NodeId getNodeRef() {
        return _nodeRef;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_networkRef);
        result = prime * result + Objects.hashCode(_nodeRef);
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
        SupportingNodeKey other = (SupportingNodeKey) obj;
        if (!Objects.equals(_networkRef, other._networkRef)) {
            return false;
        }
        if (!Objects.equals(_nodeRef, other._nodeRef)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(ietf.params.xml.ns.yang.ietf.network.rev150608.network.node.SupportingNodeKey.class.getSimpleName()).append(" [");
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
        if (_nodeRef != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_nodeRef=");
            builder.append(_nodeRef);
        }
        return builder.append(']').toString();
    }
}

