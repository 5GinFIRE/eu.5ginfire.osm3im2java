package ietf.params.xml.ns.yang.nfvo.nsr.rev170208.cloud.config.user;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;

public class SshAuthorizedKeyKey
 implements Identifier<SshAuthorizedKey> {
    private static final long serialVersionUID = -5653155718725020794L;
    private final java.lang.String _keyPairRef;


    public SshAuthorizedKeyKey(java.lang.String _keyPairRef) {
    
    
        this._keyPairRef = _keyPairRef;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public SshAuthorizedKeyKey(SshAuthorizedKeyKey source) {
        this._keyPairRef = source._keyPairRef;
    }


    public java.lang.String getKeyPairRef() {
        return _keyPairRef;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_keyPairRef);
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
        SshAuthorizedKeyKey other = (SshAuthorizedKeyKey) obj;
        if (!Objects.equals(_keyPairRef, other._keyPairRef)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(ietf.params.xml.ns.yang.nfvo.nsr.rev170208.cloud.config.user.SshAuthorizedKeyKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_keyPairRef != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_keyPairRef=");
            builder.append(_keyPairRef);
        }
        return builder.append(']').toString();
    }
}

