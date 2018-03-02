package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.input.parameter;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;

public class InputParameterKey
 implements Identifier<InputParameter> {
    private static final long serialVersionUID = -4216449907967238088L;
    private final java.lang.String _xpath;


    public InputParameterKey(java.lang.String _xpath) {
    
    
        this._xpath = _xpath;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public InputParameterKey(InputParameterKey source) {
        this._xpath = source._xpath;
    }


    public java.lang.String getXpath() {
        return _xpath;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_xpath);
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
        InputParameterKey other = (InputParameterKey) obj;
        if (!Objects.equals(_xpath, other._xpath)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.input.parameter.InputParameterKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_xpath != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_xpath=");
            builder.append(_xpath);
        }
        return builder.append(']').toString();
    }
}

