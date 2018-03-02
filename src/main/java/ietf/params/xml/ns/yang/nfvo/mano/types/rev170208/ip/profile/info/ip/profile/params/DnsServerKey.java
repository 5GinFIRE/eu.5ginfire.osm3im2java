package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.info.ip.profile.params;
import org.opendaylight.yangtools.yang.binding.Identifier;

import ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;

import java.util.Objects;

public class DnsServerKey
 implements Identifier<DnsServer> {
    private static final long serialVersionUID = 8079303259017466533L;
    private final IpAddress _address;


    public DnsServerKey(IpAddress _address) {
    
    
        this._address = _address;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public DnsServerKey(DnsServerKey source) {
        this._address = source._address;
    }


    public IpAddress getAddress() {
        return _address;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_address);
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
        DnsServerKey other = (DnsServerKey) obj;
        if (!Objects.equals(_address, other._address)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ip.profile.info.ip.profile.params.DnsServerKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_address != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_address=");
            builder.append(_address);
        }
        return builder.append(']').toString();
    }
}

