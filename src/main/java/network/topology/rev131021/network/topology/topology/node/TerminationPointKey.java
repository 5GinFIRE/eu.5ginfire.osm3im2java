package network.topology.rev131021.network.topology.topology.node;
import org.opendaylight.yangtools.yang.binding.Identifier;

import network.topology.rev131021.TpId;

import java.util.Objects;

public class TerminationPointKey
 implements Identifier<TerminationPoint> {
    private static final long serialVersionUID = -6070562666740578L;
    private final TpId _tpId;


    public TerminationPointKey(TpId _tpId) {
    
    
        this._tpId = _tpId;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public TerminationPointKey(TerminationPointKey source) {
        this._tpId = source._tpId;
    }


    public TpId getTpId() {
        return _tpId;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_tpId);
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
        TerminationPointKey other = (TerminationPointKey) obj;
        if (!Objects.equals(_tpId, other._tpId)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(network.topology.rev131021.network.topology.topology.node.TerminationPointKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_tpId != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_tpId=");
            builder.append(_tpId);
        }
        return builder.append(']').toString();
    }
}

