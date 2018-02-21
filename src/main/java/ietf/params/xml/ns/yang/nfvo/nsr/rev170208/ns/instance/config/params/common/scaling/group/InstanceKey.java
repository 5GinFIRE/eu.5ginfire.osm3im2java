package ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.scaling.group;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;

public class InstanceKey
 implements Identifier<Instance> {
    private static final long serialVersionUID = 4078509346566946712L;
    private final java.lang.Integer _id;


    public InstanceKey(java.lang.Integer _id) {
    
    
        this._id = _id;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public InstanceKey(InstanceKey source) {
        this._id = source._id;
    }


    public java.lang.Integer getId() {
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
        InstanceKey other = (InstanceKey) obj;
        if (!Objects.equals(_id, other._id)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.scaling.group.InstanceKey.class.getSimpleName()).append(" [");
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

