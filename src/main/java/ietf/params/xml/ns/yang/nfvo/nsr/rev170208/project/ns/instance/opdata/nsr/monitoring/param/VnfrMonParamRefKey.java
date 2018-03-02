package ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.monitoring.param;
import org.opendaylight.yangtools.yang.binding.Identifier;

import ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid;

import java.util.Objects;

public class VnfrMonParamRefKey
 implements Identifier<VnfrMonParamRef> {
    private static final long serialVersionUID = 2109708910737392483L;
    private final Uuid _vnfrIdRef;
    private final java.lang.Object _vnfrMonParamRef;


    public VnfrMonParamRefKey(Uuid _vnfrIdRef, java.lang.Object _vnfrMonParamRef) {
    
    
        this._vnfrIdRef = _vnfrIdRef;
        this._vnfrMonParamRef = _vnfrMonParamRef;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public VnfrMonParamRefKey(VnfrMonParamRefKey source) {
        this._vnfrIdRef = source._vnfrIdRef;
        this._vnfrMonParamRef = source._vnfrMonParamRef;
    }


    public Uuid getVnfrIdRef() {
        return _vnfrIdRef;
    }
    
    public java.lang.Object getVnfrMonParamRef() {
        return _vnfrMonParamRef;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_vnfrIdRef);
        result = prime * result + Objects.hashCode(_vnfrMonParamRef);
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
        VnfrMonParamRefKey other = (VnfrMonParamRefKey) obj;
        if (!Objects.equals(_vnfrIdRef, other._vnfrIdRef)) {
            return false;
        }
        if (!Objects.equals(_vnfrMonParamRef, other._vnfrMonParamRef)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.monitoring.param.VnfrMonParamRefKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_vnfrIdRef != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_vnfrIdRef=");
            builder.append(_vnfrIdRef);
        }
        if (_vnfrMonParamRef != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_vnfrMonParamRef=");
            builder.append(_vnfrMonParamRef);
        }
        return builder.append(']').toString();
    }
}

