package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.http.endpoint;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.http.endpoint.Headers} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.http.endpoint.Headers
 *
 */
public class HeadersBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.http.endpoint.Headers> {

    private java.lang.String _akey;
    private HeadersKey _key;
    private java.lang.String _value;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.http.endpoint.Headers>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.http.endpoint.Headers>> augmentation = Collections.emptyMap();

    public HeadersBuilder() {
    }

    public HeadersBuilder(Headers base) {
        if (base.getKey() == null) {
            this._key = new HeadersKey(
                base.getAkey()
            );
            this._akey = base.getAkey();
        } else {
            this._key = base.getKey();
            this._akey = _key.getAkey();
        }
        this._value = base.getValue();
        if (base instanceof HeadersImpl) {
            HeadersImpl impl = (HeadersImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.http.endpoint.Headers> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.http.endpoint.Headers>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public java.lang.String getAkey() {
        return _akey;
    }
    
    public HeadersKey getKey() {
        return _key;
    }
    
    public java.lang.String getValue() {
        return _value;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.http.endpoint.Headers>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public HeadersBuilder setAkey(final java.lang.String value) {
        this._akey = value;
        return this;
    }
    
     
    public HeadersBuilder setKey(final HeadersKey value) {
        this._key = value;
        return this;
    }
    
     
    public HeadersBuilder setValue(final java.lang.String value) {
        this._value = value;
        return this;
    }
    
    public HeadersBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.http.endpoint.Headers>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.http.endpoint.Headers> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public HeadersBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.http.endpoint.Headers>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Headers build() {
        return new HeadersImpl(this);
    }

    private static final class HeadersImpl implements Headers {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.http.endpoint.Headers> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.http.endpoint.Headers.class;
        }

        private final java.lang.String _akey;
        private final HeadersKey _key;
        private final java.lang.String _value;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.http.endpoint.Headers>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.http.endpoint.Headers>> augmentation = Collections.emptyMap();

        private HeadersImpl(HeadersBuilder base) {
            if (base.getKey() == null) {
                this._key = new HeadersKey(
                    base.getAkey()
                );
                this._akey = base.getAkey();
            } else {
                this._key = base.getKey();
                this._akey = _key.getAkey();
            }
            this._value = base.getValue();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.http.endpoint.Headers>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.http.endpoint.Headers>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.http.endpoint.Headers>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.http.endpoint.Headers>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getAkey() {
            return _akey;
        }
        
        @Override
        public HeadersKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.String getValue() {
            return _value;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.http.endpoint.Headers>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_akey);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_value);
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
            if (!ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.http.endpoint.Headers.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.http.endpoint.Headers other = (ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.http.endpoint.Headers)obj;
            if (!Objects.equals(_akey, other.getAkey())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_value, other.getValue())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                HeadersImpl otherImpl = (HeadersImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.http.endpoint.Headers>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.monitoring.param.http.endpoint.Headers>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Headers [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_akey != null) {
                builder.append("_akey=");
                builder.append(_akey);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_value != null) {
                builder.append("_value=");
                builder.append(_value);
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
