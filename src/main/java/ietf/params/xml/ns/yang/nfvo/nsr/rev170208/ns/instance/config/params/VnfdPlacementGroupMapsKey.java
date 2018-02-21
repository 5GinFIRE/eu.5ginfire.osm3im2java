package ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params;
import org.opendaylight.yangtools.yang.binding.Identifier;

import ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid;

import java.util.Objects;

public class VnfdPlacementGroupMapsKey
 implements Identifier<VnfdPlacementGroupMaps> {
    private static final long serialVersionUID = 7931719382796888613L;
    private final Uuid _vnfdIdRef;
    private final java.lang.Object _placementGroupRef;


    public VnfdPlacementGroupMapsKey(java.lang.Object _placementGroupRef, Uuid _vnfdIdRef) {
    
    
        this._vnfdIdRef = _vnfdIdRef;
        this._placementGroupRef = _placementGroupRef;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public VnfdPlacementGroupMapsKey(VnfdPlacementGroupMapsKey source) {
        this._vnfdIdRef = source._vnfdIdRef;
        this._placementGroupRef = source._placementGroupRef;
    }


    public Uuid getVnfdIdRef() {
        return _vnfdIdRef;
    }
    
    public java.lang.Object getPlacementGroupRef() {
        return _placementGroupRef;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_vnfdIdRef);
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
        VnfdPlacementGroupMapsKey other = (VnfdPlacementGroupMapsKey) obj;
        if (!Objects.equals(_vnfdIdRef, other._vnfdIdRef)) {
            return false;
        }
        if (!Objects.equals(_placementGroupRef, other._placementGroupRef)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.VnfdPlacementGroupMapsKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_vnfdIdRef != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_vnfdIdRef=");
            builder.append(_vnfdIdRef);
        }
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

