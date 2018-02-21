package http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;

public class ScalingPolicyKey
 implements Identifier<ScalingPolicy> {
    private static final long serialVersionUID = -3365024103236956934L;
    private final java.lang.String _name;


    public ScalingPolicyKey(java.lang.String _name) {
    
    
        this._name = _name;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public ScalingPolicyKey(ScalingPolicyKey source) {
        this._name = source._name;
    }


    public java.lang.String getName() {
        return _name;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_name);
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
        ScalingPolicyKey other = (ScalingPolicyKey) obj;
        if (!Objects.equals(_name, other._name)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.ScalingPolicyKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_name != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_name=");
            builder.append(_name);
        }
        return builder.append(']').toString();
    }
}

