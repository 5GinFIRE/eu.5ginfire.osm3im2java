package network.topology.rev131021.node.attributes;
import org.opendaylight.yangtools.yang.binding.Identifier;

import network.topology.rev131021.NodeId;
import network.topology.rev131021.TopologyId;

import java.util.Objects;

public class SupportingNodeKey
 implements Identifier<SupportingNode> {
    private static final long serialVersionUID = -6473540922995959908L;
    private final TopologyId _topologyRef;
    private final NodeId _nodeRef;


    public SupportingNodeKey(NodeId _nodeRef, TopologyId _topologyRef) {
    
    
        this._topologyRef = _topologyRef;
        this._nodeRef = _nodeRef;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public SupportingNodeKey(SupportingNodeKey source) {
        this._topologyRef = source._topologyRef;
        this._nodeRef = source._nodeRef;
    }


    public TopologyId getTopologyRef() {
        return _topologyRef;
    }
    
    public NodeId getNodeRef() {
        return _nodeRef;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_topologyRef);
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
        if (!Objects.equals(_topologyRef, other._topologyRef)) {
            return false;
        }
        if (!Objects.equals(_nodeRef, other._nodeRef)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(network.topology.rev131021.node.attributes.SupportingNodeKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_topologyRef != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_topologyRef=");
            builder.append(_topologyRef);
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

