package network.topology.rev131021.network.topology.topology;
import org.opendaylight.yangtools.yang.binding.Identifier;

import network.topology.rev131021.TopologyId;

import java.util.Objects;

public class UnderlayTopologyKey
 implements Identifier<UnderlayTopology> {
    private static final long serialVersionUID = -3781551194081141167L;
    private final TopologyId _topologyRef;


    public UnderlayTopologyKey(TopologyId _topologyRef) {
    
    
        this._topologyRef = _topologyRef;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public UnderlayTopologyKey(UnderlayTopologyKey source) {
        this._topologyRef = source._topologyRef;
    }


    public TopologyId getTopologyRef() {
        return _topologyRef;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_topologyRef);
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
        UnderlayTopologyKey other = (UnderlayTopologyKey) obj;
        if (!Objects.equals(_topologyRef, other._topologyRef)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(network.topology.rev131021.network.topology.topology.UnderlayTopologyKey.class.getSimpleName()).append(" [");
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
        return builder.append(']').toString();
    }
}

