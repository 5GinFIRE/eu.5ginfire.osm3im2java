package ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network;
import org.opendaylight.yangtools.yang.binding.Identifier;

import ietf.params.xml.ns.yang.ietf.network.topology.rev150608.LinkId;

import java.util.Objects;

public class LinkKey
 implements Identifier<Link> {
    private static final long serialVersionUID = -6074594020968450557L;
    private final LinkId _linkId;


    public LinkKey(LinkId _linkId) {
    
    
        this._linkId = _linkId;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public LinkKey(LinkKey source) {
        this._linkId = source._linkId;
    }


    public LinkId getLinkId() {
        return _linkId;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_linkId);
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
        LinkKey other = (LinkKey) obj;
        if (!Objects.equals(_linkId, other._linkId)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.LinkKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_linkId != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_linkId=");
            builder.append(_linkId);
        }
        return builder.append(']').toString();
    }
}

