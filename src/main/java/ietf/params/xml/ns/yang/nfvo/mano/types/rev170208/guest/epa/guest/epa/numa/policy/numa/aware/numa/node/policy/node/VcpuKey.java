package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;
import java.math.BigInteger;

public class VcpuKey
 implements Identifier<Vcpu> {
    private static final long serialVersionUID = 3724147881547077701L;
    private final BigInteger _id;


    public VcpuKey(BigInteger _id) {
    
    
        this._id = _id;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public VcpuKey(VcpuKey source) {
        this._id = source._id;
    }


    public BigInteger getId() {
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
        VcpuKey other = (VcpuKey) obj;
        if (!Objects.equals(_id, other._id)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.VcpuKey.class.getSimpleName()).append(" [");
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

