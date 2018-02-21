package ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur._interface.connection.point.type;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur._interface.connection.point.type.External} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur._interface.connection.point.type.External
 *
 */
public class ExternalBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur._interface.connection.point.type.External> {

    private java.lang.String _externalConnectionPointRef;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur._interface.connection.point.type.External>>, Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur._interface.connection.point.type.External>> augmentation = Collections.emptyMap();

    public ExternalBuilder() {
    }

    public ExternalBuilder(External base) {
        this._externalConnectionPointRef = base.getExternalConnectionPointRef();
        if (base instanceof ExternalImpl) {
            ExternalImpl impl = (ExternalImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur._interface.connection.point.type.External> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur._interface.connection.point.type.External>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public java.lang.String getExternalConnectionPointRef() {
        return _externalConnectionPointRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur._interface.connection.point.type.External>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public ExternalBuilder setExternalConnectionPointRef(final java.lang.String value) {
        this._externalConnectionPointRef = value;
        return this;
    }
    
    public ExternalBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur._interface.connection.point.type.External>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur._interface.connection.point.type.External> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ExternalBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur._interface.connection.point.type.External>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public External build() {
        return new ExternalImpl(this);
    }

    private static final class ExternalImpl implements External {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur._interface.connection.point.type.External> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur._interface.connection.point.type.External.class;
        }

        private final java.lang.String _externalConnectionPointRef;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur._interface.connection.point.type.External>>, Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur._interface.connection.point.type.External>> augmentation = Collections.emptyMap();

        private ExternalImpl(ExternalBuilder base) {
            this._externalConnectionPointRef = base.getExternalConnectionPointRef();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur._interface.connection.point.type.External>>, Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur._interface.connection.point.type.External>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur._interface.connection.point.type.External>>, Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur._interface.connection.point.type.External>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getExternalConnectionPointRef() {
            return _externalConnectionPointRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur._interface.connection.point.type.External>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_externalConnectionPointRef);
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
            if (!ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur._interface.connection.point.type.External.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur._interface.connection.point.type.External other = (ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur._interface.connection.point.type.External)obj;
            if (!Objects.equals(_externalConnectionPointRef, other.getExternalConnectionPointRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ExternalImpl otherImpl = (ExternalImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur._interface.connection.point.type.External>>, Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur._interface.connection.point.type.External>> e : augmentation.entrySet()) {
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
            java.lang.String name = "External [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_externalConnectionPointRef != null) {
                builder.append("_externalConnectionPointRef=");
                builder.append(_externalConnectionPointRef);
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
