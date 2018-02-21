package http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;

public class AlarmKey
 implements Identifier<Alarm> {
    private static final long serialVersionUID = 6949511475175144069L;
    private final java.lang.String _alarmId;


    public AlarmKey(java.lang.String _alarmId) {
    
    
        this._alarmId = _alarmId;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public AlarmKey(AlarmKey source) {
        this._alarmId = source._alarmId;
    }


    public java.lang.String getAlarmId() {
        return _alarmId;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_alarmId);
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
        AlarmKey other = (AlarmKey) obj;
        if (!Objects.equals(_alarmId, other._alarmId)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.AlarmKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_alarmId != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_alarmId=");
            builder.append(_alarmId);
        }
        return builder.append(']').toString();
    }
}

