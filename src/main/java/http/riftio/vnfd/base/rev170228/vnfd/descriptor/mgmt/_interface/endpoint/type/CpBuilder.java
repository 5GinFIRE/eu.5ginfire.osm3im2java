package http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.VnfdBuilder;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.Cp} instances.
 * 
 * @see http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.Cp
 *
 */
public class CpBuilder implements Builder<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.Cp> {

    private java.lang.String _cp;

    Map<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.Cp>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.Cp>> augmentation = Collections.emptyMap();

    public CpBuilder() {
    }

    public CpBuilder(Cp base) {
        this._cp = base.getCp();
        if (base instanceof CpImpl) {
            CpImpl impl = (CpImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.Cp> casted =(AugmentationHolder<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.Cp>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public java.lang.String getCp() {
        return _cp;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.Cp>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public CpBuilder setCp(final java.lang.String value) {
        this._cp = value;
        return this;
    }
    
    public CpBuilder addAugmentation(java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.Cp>> augmentationType, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.Cp> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public CpBuilder removeAugmentation(java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.Cp>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Cp build() {
        return new CpImpl(this);
    }

    public static final class CpImpl implements Cp {

        @Override
        public java.lang.Class<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.Cp> getImplementedInterface() {
            return http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.Cp.class;
        }

        private final java.lang.String _cp;

        private Map<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.Cp>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.Cp>> augmentation = Collections.emptyMap();

        private CpImpl(CpBuilder base) {
            this._cp = base.getCp();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.Cp>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.Cp>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.Cp>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.Cp>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getCp() {
            return _cp;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.Cp>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        private int hash = 0;
        private volatile boolean hashValid = false;
        
        @Override
        public int hashCode() {
            if (hashValid) {
                return hash;
            }
        
            final int prime = 31;
            int result = 1;
            result = prime * result + Objects.hashCode(_cp);
            result = prime * result + Objects.hashCode(augmentation);
        
            hash = result;
            hashValid = true;
            return result;
        }

        @Override
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DataObject)) {
                return false;
            }
            if (!http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.Cp.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.Cp other = (http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.Cp)obj;
            if (!Objects.equals(_cp, other.getCp())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                CpImpl otherImpl = (CpImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.Cp>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.Cp>> e : augmentation.entrySet()) {
                    if (!e.getValue().equals(other.getAugmentation(e.getKey()))) {
                        return false;
                    }
                }
                // .. and give the other one the chance to do the same
                if (!obj.equals(this)) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public java.lang.String toString() {
            java.lang.String name = "Cp [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_cp != null) {
                builder.append("_cp=");
                builder.append(_cp);
            }
            final int builderLength = builder.length();
            final int builderAdditionalLength = builder.substring(name.length(), builderLength).length();
            if (builderAdditionalLength > 2 && !builder.substring(builderLength - 2, builderLength).equals(", ")) {
                builder.append(", ");
            }
            builder.append("augmentation=");
            builder.append(augmentation.values());
            return builder.append(']').toString();
        }
    }

}
