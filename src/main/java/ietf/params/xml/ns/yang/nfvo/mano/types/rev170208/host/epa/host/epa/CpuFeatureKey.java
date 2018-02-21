package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.host.epa;
import org.opendaylight.yangtools.yang.binding.Identifier;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.CpuFeatureType;

import java.util.Objects;

public class CpuFeatureKey
 implements Identifier<CpuFeature> {
    private static final long serialVersionUID = -7227280100134741618L;
    private final CpuFeatureType _feature;


    public CpuFeatureKey(CpuFeatureType _feature) {
    
    
        this._feature = _feature;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public CpuFeatureKey(CpuFeatureKey source) {
        this._feature = source._feature;
    }


    public CpuFeatureType getFeature() {
        return _feature;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_feature);
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
        CpuFeatureKey other = (CpuFeatureKey) obj;
        if (!Objects.equals(_feature, other._feature)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.host.epa.CpuFeatureKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_feature != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_feature=");
            builder.append(_feature);
        }
        return builder.append(']').toString();
    }
}

