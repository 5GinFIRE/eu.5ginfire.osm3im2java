package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.monitoring.param;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.monitoring.param.JsonQueryParams} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.monitoring.param.JsonQueryParams
 *
 */
public class JsonQueryParamsBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.monitoring.param.JsonQueryParams> {

    private java.lang.String _jsonPath;
    private java.lang.String _objectPath;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.monitoring.param.JsonQueryParams>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.monitoring.param.JsonQueryParams>> augmentation = Collections.emptyMap();

    public JsonQueryParamsBuilder() {
    }

    public JsonQueryParamsBuilder(JsonQueryParams base) {
        this._jsonPath = base.getJsonPath();
        this._objectPath = base.getObjectPath();
        if (base instanceof JsonQueryParamsImpl) {
            JsonQueryParamsImpl impl = (JsonQueryParamsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.monitoring.param.JsonQueryParams> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.monitoring.param.JsonQueryParams>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public java.lang.String getJsonPath() {
        return _jsonPath;
    }
    
    public java.lang.String getObjectPath() {
        return _objectPath;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.monitoring.param.JsonQueryParams>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public JsonQueryParamsBuilder setJsonPath(final java.lang.String value) {
        this._jsonPath = value;
        return this;
    }
    
     
    public JsonQueryParamsBuilder setObjectPath(final java.lang.String value) {
        this._objectPath = value;
        return this;
    }
    
    public JsonQueryParamsBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.monitoring.param.JsonQueryParams>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.monitoring.param.JsonQueryParams> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public JsonQueryParamsBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.monitoring.param.JsonQueryParams>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public JsonQueryParams build() {
        return new JsonQueryParamsImpl(this);
    }

    private static final class JsonQueryParamsImpl implements JsonQueryParams {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.monitoring.param.JsonQueryParams> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.monitoring.param.JsonQueryParams.class;
        }

        private final java.lang.String _jsonPath;
        private final java.lang.String _objectPath;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.monitoring.param.JsonQueryParams>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.monitoring.param.JsonQueryParams>> augmentation = Collections.emptyMap();

        private JsonQueryParamsImpl(JsonQueryParamsBuilder base) {
            this._jsonPath = base.getJsonPath();
            this._objectPath = base.getObjectPath();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.monitoring.param.JsonQueryParams>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.monitoring.param.JsonQueryParams>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.monitoring.param.JsonQueryParams>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.monitoring.param.JsonQueryParams>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getJsonPath() {
            return _jsonPath;
        }
        
        @Override
        public java.lang.String getObjectPath() {
            return _objectPath;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.monitoring.param.JsonQueryParams>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_jsonPath);
            result = prime * result + Objects.hashCode(_objectPath);
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
            if (!ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.monitoring.param.JsonQueryParams.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.monitoring.param.JsonQueryParams other = (ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.monitoring.param.JsonQueryParams)obj;
            if (!Objects.equals(_jsonPath, other.getJsonPath())) {
                return false;
            }
            if (!Objects.equals(_objectPath, other.getObjectPath())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                JsonQueryParamsImpl otherImpl = (JsonQueryParamsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.monitoring.param.JsonQueryParams>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.monitoring.param.JsonQueryParams>> e : augmentation.entrySet()) {
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
            java.lang.String name = "JsonQueryParams [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_jsonPath != null) {
                builder.append("_jsonPath=");
                builder.append(_jsonPath);
                builder.append(", ");
            }
            if (_objectPath != null) {
                builder.append("_objectPath=");
                builder.append(_objectPath);
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
