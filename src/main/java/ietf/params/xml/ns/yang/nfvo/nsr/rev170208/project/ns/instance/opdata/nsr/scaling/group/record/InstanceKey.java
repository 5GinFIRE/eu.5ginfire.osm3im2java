package ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.scaling.group.record;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;

public class InstanceKey
 implements Identifier<Instance> {
    private static final long serialVersionUID = -3732073864253176254L;
    private final java.lang.Integer _instanceId;


    public InstanceKey(java.lang.Integer _instanceId) {
    
    
        this._instanceId = _instanceId;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public InstanceKey(InstanceKey source) {
        this._instanceId = source._instanceId;
    }


    public java.lang.Integer getInstanceId() {
        return _instanceId;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_instanceId);
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
        if (!Objects.equals(_instanceId, other._instanceId)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.scaling.group.record.InstanceKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_instanceId != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_instanceId=");
            builder.append(_instanceId);
        }
        return builder.append(']').toString();
    }
}

