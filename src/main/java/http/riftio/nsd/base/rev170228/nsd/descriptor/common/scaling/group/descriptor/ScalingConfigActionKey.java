package http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor;
import org.opendaylight.yangtools.yang.binding.Identifier;

import http.riftio.nsd.base.rev170228.ScalingTrigger;

import java.util.Objects;

public class ScalingConfigActionKey
 implements Identifier<ScalingConfigAction> {
    private static final long serialVersionUID = -656924485068871764L;
    private final ScalingTrigger _trigger;


    public ScalingConfigActionKey(ScalingTrigger _trigger) {
    
    
        this._trigger = _trigger;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public ScalingConfigActionKey(ScalingConfigActionKey source) {
        this._trigger = source._trigger;
    }


    public ScalingTrigger getTrigger() {
        return _trigger;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_trigger);
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
        ScalingConfigActionKey other = (ScalingConfigActionKey) obj;
        if (!Objects.equals(_trigger, other._trigger)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(http.riftio.nsd.base.rev170228.nsd.descriptor.common.scaling.group.descriptor.ScalingConfigActionKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_trigger != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_trigger=");
            builder.append(_trigger);
        }
        return builder.append(']').toString();
    }
}

