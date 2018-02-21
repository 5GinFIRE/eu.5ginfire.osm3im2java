package ietf.params.xml.ns.yang.ietf.inet.types.rev130715;
import java.io.Serializable;
import java.beans.ConstructorProperties;
import java.util.Objects;

public class Host
 implements Serializable {
    private static final long serialVersionUID = -5855386342011022795L;
    private final IpAddress _ipAddress;
    private final DomainName _domainName;
    private char[] _value;


    public Host(IpAddress _ipAddress) {
        super();
        this._ipAddress = _ipAddress;
        this._domainName = null;
    }
    
    public Host(DomainName _domainName) {
        super();
        this._domainName = _domainName;
        this._ipAddress = null;
    }
    
    /**
     * Constructor provided only for using in JMX. Don't use it for
     * construction new object of this union type.
     */
    @ConstructorProperties("value")
    public Host(char[] _value) {
        java.lang.String defVal = new java.lang.String(_value);
        Host defInst = HostBuilder.getDefaultInstance(defVal);
        this._ipAddress = defInst._ipAddress;
        this._domainName = defInst._domainName;
        this._value = _value == null ? null : _value.clone();
    }
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public Host(Host source) {
        this._ipAddress = source._ipAddress;
        this._domainName = source._domainName;
        this._value = source._value;
    }


    public IpAddress getIpAddress() {
        return _ipAddress;
    }
    
    public DomainName getDomainName() {
        return _domainName;
    }
    
    public char[] getValue() {
        if (_value == null) {
            if (_ipAddress != null) {
                _value = _ipAddress.getValue();
                                        } else
            if (_domainName != null) {
                _value = _domainName.getValue().toString().toCharArray();
            }
        }
        return _value == null ? null : _value.clone();
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_ipAddress);
        result = prime * result + Objects.hashCode(_domainName);
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
        Host other = (Host) obj;
        if (!Objects.equals(_ipAddress, other._ipAddress)) {
            return false;
        }
        if (!Objects.equals(_domainName, other._domainName)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(ietf.params.xml.ns.yang.ietf.inet.types.rev130715.Host.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_ipAddress != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_ipAddress=");
            builder.append(_ipAddress);
        }
        if (_domainName != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_domainName=");
            builder.append(_domainName);
        }
        return builder.append(']').toString();
    }
}

