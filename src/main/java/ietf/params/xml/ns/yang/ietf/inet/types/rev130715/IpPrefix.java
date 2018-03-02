package ietf.params.xml.ns.yang.ietf.inet.types.rev130715;
import java.io.Serializable;
import java.beans.ConstructorProperties;
import java.util.Objects;

public class IpPrefix
 implements Serializable {
    private static final long serialVersionUID = 4870886602207064041L;
    private final Ipv4Prefix _ipv4Prefix;
    private final Ipv6Prefix _ipv6Prefix;
    private char[] _value;


    public IpPrefix(Ipv4Prefix _ipv4Prefix) {
        super();
        this._ipv4Prefix = _ipv4Prefix;
        this._ipv6Prefix = null;
    }
    
    public IpPrefix(Ipv6Prefix _ipv6Prefix) {
        super();
        this._ipv6Prefix = _ipv6Prefix;
        this._ipv4Prefix = null;
    }
    
    /**
     * Constructor provided only for using in JMX. Don't use it for
     * construction new object of this union type.
     */
    @ConstructorProperties("value")
    public IpPrefix(char[] _value) {
        java.lang.String defVal = new java.lang.String(_value);
        IpPrefix defInst = IpPrefixBuilder.getDefaultInstance(defVal);
        this._ipv4Prefix = defInst._ipv4Prefix;
        this._ipv6Prefix = defInst._ipv6Prefix;
        this._value = _value == null ? null : _value.clone();
    }
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public IpPrefix(IpPrefix source) {
        this._ipv4Prefix = source._ipv4Prefix;
        this._ipv6Prefix = source._ipv6Prefix;
        this._value = source._value;
    }


    public Ipv4Prefix getIpv4Prefix() {
        return _ipv4Prefix;
    }
    
    public Ipv6Prefix getIpv6Prefix() {
        return _ipv6Prefix;
    }
    
    public char[] getValue() {
        if (_value == null) {
            if (_ipv4Prefix != null) {
                _value = _ipv4Prefix.getValue().toString().toCharArray();
            } else
            if (_ipv6Prefix != null) {
                _value = _ipv6Prefix.getValue().toString().toCharArray();
            }
        }
        return _value == null ? null : _value.clone();
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_ipv4Prefix);
        result = prime * result + Objects.hashCode(_ipv6Prefix);
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
        IpPrefix other = (IpPrefix) obj;
        if (!Objects.equals(_ipv4Prefix, other._ipv4Prefix)) {
            return false;
        }
        if (!Objects.equals(_ipv6Prefix, other._ipv6Prefix)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpPrefix.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_ipv4Prefix != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_ipv4Prefix=");
            builder.append(_ipv4Prefix);
        }
        if (_ipv6Prefix != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_ipv6Prefix=");
            builder.append(_ipv6Prefix);
        }
        return builder.append(']').toString();
    }
}

