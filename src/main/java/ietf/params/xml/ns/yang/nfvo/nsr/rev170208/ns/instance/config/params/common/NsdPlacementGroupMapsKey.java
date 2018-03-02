package ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;

public class NsdPlacementGroupMapsKey
 implements Identifier<NsdPlacementGroupMaps> {
    private static final long serialVersionUID = 5085483991345181550L;
    private final java.lang.String _placementGroupRef;


    public NsdPlacementGroupMapsKey(java.lang.String _placementGroupRef) {
    
    
        this._placementGroupRef = _placementGroupRef;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public NsdPlacementGroupMapsKey(NsdPlacementGroupMapsKey source) {
        this._placementGroupRef = source._placementGroupRef;
    }


    public java.lang.String getPlacementGroupRef() {
        return _placementGroupRef;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_placementGroupRef);
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
        NsdPlacementGroupMapsKey other = (NsdPlacementGroupMapsKey) obj;
        if (!Objects.equals(_placementGroupRef, other._placementGroupRef)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.NsdPlacementGroupMapsKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_placementGroupRef != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_placementGroupRef=");
            builder.append(_placementGroupRef);
        }
        return builder.append(']').toString();
    }
}

