package ietf.params.xml.ns.yang.ietf.yang.types.rev130715;
import java.io.Serializable;
import java.beans.ConstructorProperties;
import com.google.common.base.Preconditions;
import java.util.Objects;
import java.math.BigInteger;

public class Counter64
 implements Serializable {
    private static final long serialVersionUID = -1099590625836683370L;
    private final BigInteger _value;

    private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECK_VALUERANGE_RANGES;
    static {
        @SuppressWarnings("unchecked")
        final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
        a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
        CHECK_VALUERANGE_RANGES = a;
    }
    private static void check_valueRange(final java.math.BigInteger value) {
        for (com.google.common.collect.Range<java.math.BigInteger> r : CHECK_VALUERANGE_RANGES) {
            if (r.contains(value)) {
                return;
            }
        }
        throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECK_VALUERANGE_RANGES)));
    }

    @ConstructorProperties("value")
    public Counter64(BigInteger _value) {
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
    public Counter64(Counter64 source) {
        this._value = source._value;
    }

    public static Counter64 getDefaultInstance(String defaultValue) {
        return new Counter64(new BigInteger(defaultValue));
    }

    public BigInteger getValue() {
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
        Counter64 other = (Counter64) obj;
        if (!Objects.equals(_value, other._value)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Counter64.class.getSimpleName()).append(" [");
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

