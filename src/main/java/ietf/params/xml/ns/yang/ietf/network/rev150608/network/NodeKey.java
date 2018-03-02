package ietf.params.xml.ns.yang.ietf.network.rev150608.network;
import org.opendaylight.yangtools.yang.binding.Identifier;

import ietf.params.xml.ns.yang.ietf.network.rev150608.NodeId;

import java.util.Objects;

public class NodeKey
 implements Identifier<Node> {
    private static final long serialVersionUID = -981934742417623433L;
    private final NodeId _nodeId;


    public NodeKey(NodeId _nodeId) {
    
    
        this._nodeId = _nodeId;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public NodeKey(NodeKey source) {
        this._nodeId = source._nodeId;
    }


    public NodeId getNodeId() {
        return _nodeId;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_nodeId);
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
        NodeKey other = (NodeKey) obj;
        if (!Objects.equals(_nodeId, other._nodeId)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(ietf.params.xml.ns.yang.ietf.network.rev150608.network.NodeKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_nodeId != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_nodeId=");
            builder.append(_nodeId);
        }
        return builder.append(']').toString();
    }
}

