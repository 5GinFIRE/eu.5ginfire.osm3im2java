package ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.input.vnf.list;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;

public class VnfPrimitiveKey
 implements Identifier<VnfPrimitive> {
    private static final long serialVersionUID = -8435080125078287303L;
    private final java.lang.Long _index;


    public VnfPrimitiveKey(java.lang.Long _index) {
    
    
        this._index = _index;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public VnfPrimitiveKey(VnfPrimitiveKey source) {
        this._index = source._index;
    }


    public java.lang.Long getIndex() {
        return _index;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_index);
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
        VnfPrimitiveKey other = (VnfPrimitiveKey) obj;
        if (!Objects.equals(_index, other._index)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.input.vnf.list.VnfPrimitiveKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_index != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_index=");
            builder.append(_index);
        }
        return builder.append(']').toString();
    }
}

