package ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;

public class ScalingGroupRecordKey
 implements Identifier<ScalingGroupRecord> {
    private static final long serialVersionUID = -7106677205929662975L;
    private final java.lang.Object _scalingGroupNameRef;


    public ScalingGroupRecordKey(java.lang.Object _scalingGroupNameRef) {
    
    
        this._scalingGroupNameRef = _scalingGroupNameRef;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public ScalingGroupRecordKey(ScalingGroupRecordKey source) {
        this._scalingGroupNameRef = source._scalingGroupNameRef;
    }


    public java.lang.Object getScalingGroupNameRef() {
        return _scalingGroupNameRef;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_scalingGroupNameRef);
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
        ScalingGroupRecordKey other = (ScalingGroupRecordKey) obj;
        if (!Objects.equals(_scalingGroupNameRef, other._scalingGroupNameRef)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.ScalingGroupRecordKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_scalingGroupNameRef != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_scalingGroupNameRef=");
            builder.append(_scalingGroupNameRef);
        }
        return builder.append(']').toString();
    }
}

