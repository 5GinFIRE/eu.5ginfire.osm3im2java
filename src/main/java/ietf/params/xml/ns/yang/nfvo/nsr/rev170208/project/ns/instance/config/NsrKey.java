package ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.config;
import org.opendaylight.yangtools.yang.binding.Identifier;

import ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid;

import java.util.Objects;

public class NsrKey
 implements Identifier<Nsr> {
    private static final long serialVersionUID = -8261859079577359710L;
    private final Uuid _id;


    public NsrKey(Uuid _id) {
    
    
        this._id = _id;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public NsrKey(NsrKey source) {
        this._id = source._id;
    }


    public Uuid getId() {
        return _id;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_id);
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
        NsrKey other = (NsrKey) obj;
        if (!Objects.equals(_id, other._id)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.config.NsrKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_id != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_id=");
            builder.append(_id);
        }
        return builder.append(']').toString();
    }
}

