package network.topology.rev131021.network.topology;
import org.opendaylight.yangtools.yang.binding.Identifier;

import network.topology.rev131021.TopologyId;

import java.util.Objects;

public class TopologyKey
 implements Identifier<Topology> {
    private static final long serialVersionUID = -8133105010422366945L;
    private final TopologyId _topologyId;


    public TopologyKey(TopologyId _topologyId) {
    
    
        this._topologyId = _topologyId;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public TopologyKey(TopologyKey source) {
        this._topologyId = source._topologyId;
    }


    public TopologyId getTopologyId() {
        return _topologyId;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_topologyId);
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
        TopologyKey other = (TopologyKey) obj;
        if (!Objects.equals(_topologyId, other._topologyId)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(network.topology.rev131021.network.topology.TopologyKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_topologyId != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_topologyId=");
            builder.append(_topologyId);
        }
        return builder.append(']').toString();
    }
}

