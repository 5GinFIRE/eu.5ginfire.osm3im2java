package ietf.params.xml.ns.yang.ietf.inet.types.rev130715;
import java.io.Serializable;
import java.beans.ConstructorProperties;
import com.google.common.base.Preconditions;
import java.util.Objects;

public class Dscp
 implements Serializable {
    private static final long serialVersionUID = -6062481917342980428L;
    private final java.lang.Short _value;

    private static void check_valueRange(final short value) {
        if (value >= (short)0 && value <= (short)63) {
            return;
        }
        throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..63]].", value));
    }

    @ConstructorProperties("value")
    public Dscp(java.lang.Short _value) {
        if (_value != null) {
            check_valueRange(_value);
            }
    
    
        Preconditions.checkNotNull(_value, "Supplied value may not be null");
    
    
        this._value = _value;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public Dscp(Dscp source) {
        this._value = source._value;
    }

    public static Dscp getDefaultInstance(String defaultValue) {
        return new Dscp(java.lang.Short.valueOf(defaultValue));
    }

    public java.lang.Short getValue() {
        return _value;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_value);
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
        Dscp other = (Dscp) obj;
        if (!Objects.equals(_value, other._value)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(ietf.params.xml.ns.yang.ietf.inet.types.rev130715.Dscp.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_value != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_value=");
            builder.append(_value);
        }
        return builder.append(']').toString();
    }
}

