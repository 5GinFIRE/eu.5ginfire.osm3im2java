package ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.input;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;

public class ParameterGroupKey
 implements Identifier<ParameterGroup> {
    private static final long serialVersionUID = -6631383738471596453L;
    private final java.lang.String _name;


    public ParameterGroupKey(java.lang.String _name) {
    
    
        this._name = _name;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public ParameterGroupKey(ParameterGroupKey source) {
        this._name = source._name;
    }


    public java.lang.String getName() {
        return _name;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_name);
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
        ParameterGroupKey other = (ParameterGroupKey) obj;
        if (!Objects.equals(_name, other._name)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.input.ParameterGroupKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_name != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_name=");
            builder.append(_name);
        }
        return builder.append(']').toString();
    }
}

