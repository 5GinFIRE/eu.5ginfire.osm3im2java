package ietf.params.xml.ns.yang.ietf.inet.types.rev130715;
import java.io.Serializable;
import java.beans.ConstructorProperties;
import java.util.Objects;

public class IpAddressNoZone
 implements Serializable {
    private static final long serialVersionUID = -7513779610985385681L;
    private final Ipv4AddressNoZone _ipv4AddressNoZone;
    private final Ipv6AddressNoZone _ipv6AddressNoZone;
    private char[] _value;


    public IpAddressNoZone(Ipv4AddressNoZone _ipv4AddressNoZone) {
        super();
        this._ipv4AddressNoZone = _ipv4AddressNoZone;
        this._ipv6AddressNoZone = null;
    }
    
    public IpAddressNoZone(Ipv6AddressNoZone _ipv6AddressNoZone) {
        super();
        this._ipv6AddressNoZone = _ipv6AddressNoZone;
        this._ipv4AddressNoZone = null;
    }
    
    /**
     * Constructor provided only for using in JMX. Don't use it for
     * construction new object of this union type.
     */
    @ConstructorProperties("value")
    public IpAddressNoZone(char[] _value) {
        java.lang.String defVal = new java.lang.String(_value);
        IpAddressNoZone defInst = IpAddressNoZoneBuilder.getDefaultInstance(defVal);
        this._ipv4AddressNoZone = defInst._ipv4AddressNoZone;
        this._ipv6AddressNoZone = defInst._ipv6AddressNoZone;
        this._value = _value == null ? null : _value.clone();
    }
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public IpAddressNoZone(IpAddressNoZone source) {
        this._ipv4AddressNoZone = source._ipv4AddressNoZone;
        this._ipv6AddressNoZone = source._ipv6AddressNoZone;
        this._value = source._value;
    }


    public Ipv4AddressNoZone getIpv4AddressNoZone() {
        return _ipv4AddressNoZone;
    }
    
    public Ipv6AddressNoZone getIpv6AddressNoZone() {
        return _ipv6AddressNoZone;
    }
    
    public char[] getValue() {
        if (_value == null) {
            if (_ipv4AddressNoZone != null) {
                _value = _ipv4AddressNoZone.getValue().toString().toCharArray();
            } else
            if (_ipv6AddressNoZone != null) {
                _value = _ipv6AddressNoZone.getValue().toString().toCharArray();
            }
        }
        return _value == null ? null : _value.clone();
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_ipv4AddressNoZone);
        result = prime * result + Objects.hashCode(_ipv6AddressNoZone);
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
        IpAddressNoZone other = (IpAddressNoZone) obj;
        if (!Objects.equals(_ipv4AddressNoZone, other._ipv4AddressNoZone)) {
            return false;
        }
        if (!Objects.equals(_ipv6AddressNoZone, other._ipv6AddressNoZone)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddressNoZone.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_ipv4AddressNoZone != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_ipv4AddressNoZone=");
            builder.append(_ipv4AddressNoZone);
        }
        if (_ipv6AddressNoZone != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_ipv6AddressNoZone=");
            builder.append(_ipv6AddressNoZone);
        }
        return builder.append(']').toString();
    }
}

