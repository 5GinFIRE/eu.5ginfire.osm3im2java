package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;

public class PcieDeviceKey
 implements Identifier<PcieDevice> {
    private static final long serialVersionUID = 7216332045478460566L;
    private final java.lang.String _deviceId;


    public PcieDeviceKey(java.lang.String _deviceId) {
    
    
        this._deviceId = _deviceId;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public PcieDeviceKey(PcieDeviceKey source) {
        this._deviceId = source._deviceId;
    }


    public java.lang.String getDeviceId() {
        return _deviceId;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_deviceId);
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
        PcieDeviceKey other = (PcieDeviceKey) obj;
        if (!Objects.equals(_deviceId, other._deviceId)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.PcieDeviceKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_deviceId != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_deviceId=");
            builder.append(_deviceId);
        }
        return builder.append(']').toString();
    }
}

