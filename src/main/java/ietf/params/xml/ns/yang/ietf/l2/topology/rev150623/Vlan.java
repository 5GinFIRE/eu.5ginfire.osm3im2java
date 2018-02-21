package ietf.params.xml.ns.yang.ietf.l2.topology.rev150623;
import java.io.Serializable;
import java.beans.ConstructorProperties;
import com.google.common.base.Preconditions;
import java.util.Objects;

public class Vlan
 implements Serializable {
    private static final long serialVersionUID = -5068964126458796746L;
    private final java.lang.Integer _value;

    private static void check_valueRange(final int value) {
        if (value >= 0 && value <= 4095) {
            return;
        }
        throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..4095]].", value));
    }

    @ConstructorProperties("value")
    public Vlan(java.lang.Integer _value) {
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
    public Vlan(Vlan source) {
        this._value = source._value;
    }

    public static Vlan getDefaultInstance(String defaultValue) {
        return new Vlan(java.lang.Integer.valueOf(defaultValue));
    }

    public java.lang.Integer getValue() {
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
        Vlan other = (Vlan) obj;
        if (!Objects.equals(_value, other._value)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.Vlan.class.getSimpleName()).append(" [");
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

