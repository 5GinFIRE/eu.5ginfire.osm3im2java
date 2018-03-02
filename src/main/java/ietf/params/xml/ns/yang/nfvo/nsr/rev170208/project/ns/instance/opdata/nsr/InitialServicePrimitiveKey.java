package ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;
import java.math.BigInteger;

public class InitialServicePrimitiveKey
 implements Identifier<InitialServicePrimitive> {
    private static final long serialVersionUID = -5831853827923659523L;
    private final BigInteger _seq;


    public InitialServicePrimitiveKey(BigInteger _seq) {
    
    
        this._seq = _seq;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public InitialServicePrimitiveKey(InitialServicePrimitiveKey source) {
        this._seq = source._seq;
    }


    public BigInteger getSeq() {
        return _seq;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_seq);
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
        InitialServicePrimitiveKey other = (InitialServicePrimitiveKey) obj;
        if (!Objects.equals(_seq, other._seq)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.InitialServicePrimitiveKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_seq != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_seq=");
            builder.append(_seq);
        }
        return builder.append(']').toString();
    }
}

