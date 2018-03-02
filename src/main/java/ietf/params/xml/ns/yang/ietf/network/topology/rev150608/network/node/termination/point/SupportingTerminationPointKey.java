package ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.node.termination.point;
import org.opendaylight.yangtools.yang.binding.Identifier;

import ietf.params.xml.ns.yang.ietf.network.rev150608.NetworkId;
import ietf.params.xml.ns.yang.ietf.network.rev150608.NodeId;

import java.util.Objects;

public class SupportingTerminationPointKey
 implements Identifier<SupportingTerminationPoint> {
    private static final long serialVersionUID = 2704561490877977216L;
    private final NetworkId _networkRef;
    private final NodeId _nodeRef;
    private final java.lang.Object _tpRef;


    public SupportingTerminationPointKey(NetworkId _networkRef, NodeId _nodeRef, java.lang.Object _tpRef) {
    
    
        this._networkRef = _networkRef;
        this._nodeRef = _nodeRef;
        this._tpRef = _tpRef;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public SupportingTerminationPointKey(SupportingTerminationPointKey source) {
        this._networkRef = source._networkRef;
        this._nodeRef = source._nodeRef;
        this._tpRef = source._tpRef;
    }


    public NetworkId getNetworkRef() {
        return _networkRef;
    }
    
    public NodeId getNodeRef() {
        return _nodeRef;
    }
    
    public java.lang.Object getTpRef() {
        return _tpRef;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_networkRef);
        result = prime * result + Objects.hashCode(_nodeRef);
        result = prime * result + Objects.hashCode(_tpRef);
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
        SupportingTerminationPointKey other = (SupportingTerminationPointKey) obj;
        if (!Objects.equals(_networkRef, other._networkRef)) {
            return false;
        }
        if (!Objects.equals(_nodeRef, other._nodeRef)) {
            return false;
        }
        if (!Objects.equals(_tpRef, other._tpRef)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.node.termination.point.SupportingTerminationPointKey.class.getSimpleName()).append(" [");
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
        if (_tpRef != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_tpRef=");
            builder.append(_tpRef);
        }
        return builder.append(']').toString();
    }
}

