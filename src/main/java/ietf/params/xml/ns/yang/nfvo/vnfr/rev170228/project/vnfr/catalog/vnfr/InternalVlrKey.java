package ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr;
import org.opendaylight.yangtools.yang.binding.Identifier;

import ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid;

import java.util.Objects;

public class InternalVlrKey
 implements Identifier<InternalVlr> {
    private static final long serialVersionUID = -7211991255967391674L;
    private final Uuid _vlrRef;


    public InternalVlrKey(Uuid _vlrRef) {
    
    
        this._vlrRef = _vlrRef;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public InternalVlrKey(InternalVlrKey source) {
        this._vlrRef = source._vlrRef;
    }


    public Uuid getVlrRef() {
        return _vlrRef;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_vlrRef);
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
        InternalVlrKey other = (InternalVlrKey) obj;
        if (!Objects.equals(_vlrRef, other._vlrRef)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.InternalVlrKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_vlrRef != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_vlrRef=");
            builder.append(_vlrRef);
        }
        return builder.append(']').toString();
    }
}

