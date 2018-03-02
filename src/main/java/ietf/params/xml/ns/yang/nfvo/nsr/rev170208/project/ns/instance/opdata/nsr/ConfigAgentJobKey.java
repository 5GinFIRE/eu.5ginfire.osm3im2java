package ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;
import java.math.BigInteger;

public class ConfigAgentJobKey
 implements Identifier<ConfigAgentJob> {
    private static final long serialVersionUID = 6065582256099942144L;
    private final BigInteger _jobId;


    public ConfigAgentJobKey(BigInteger _jobId) {
    
    
        this._jobId = _jobId;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public ConfigAgentJobKey(ConfigAgentJobKey source) {
        this._jobId = source._jobId;
    }


    public BigInteger getJobId() {
        return _jobId;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_jobId);
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
        ConfigAgentJobKey other = (ConfigAgentJobKey) obj;
        if (!Objects.equals(_jobId, other._jobId)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.ConfigAgentJobKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_jobId != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_jobId=");
            builder.append(_jobId);
        }
        return builder.append(']').toString();
    }
}

