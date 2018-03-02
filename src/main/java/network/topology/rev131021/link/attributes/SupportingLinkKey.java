package network.topology.rev131021.link.attributes;
import org.opendaylight.yangtools.yang.binding.Identifier;

import network.topology.rev131021.LinkId;

import java.util.Objects;

public class SupportingLinkKey
 implements Identifier<SupportingLink> {
    private static final long serialVersionUID = 44492795467633331L;
    private final LinkId _linkRef;


    public SupportingLinkKey(LinkId _linkRef) {
    
    
        this._linkRef = _linkRef;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public SupportingLinkKey(SupportingLinkKey source) {
        this._linkRef = source._linkRef;
    }


    public LinkId getLinkRef() {
        return _linkRef;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
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
        if (!Objects.equals(_linkRef, other._linkRef)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(network.topology.rev131021.link.attributes.SupportingLinkKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
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

