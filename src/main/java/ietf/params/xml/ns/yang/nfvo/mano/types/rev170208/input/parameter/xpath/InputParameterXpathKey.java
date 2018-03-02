package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.input.parameter.xpath;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;

public class InputParameterXpathKey
 implements Identifier<InputParameterXpath> {
    private static final long serialVersionUID = 1747200157883501749L;
    private final java.lang.String _xpath;


    public InputParameterXpathKey(java.lang.String _xpath) {
    
    
        this._xpath = _xpath;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public InputParameterXpathKey(InputParameterXpathKey source) {
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
        InputParameterXpathKey other = (InputParameterXpathKey) obj;
        if (!Objects.equals(_xpath, other._xpath)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.input.parameter.xpath.InputParameterXpathKey.class.getSimpleName()).append(" [");
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

