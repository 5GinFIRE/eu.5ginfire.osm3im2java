package ietf.params.xml.ns.yang.nfvo.nsr.rev170208.cloud.config.user;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.nsr.rev170208.cloud.config.user.SshAuthorizedKey} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.nsr.rev170208.cloud.config.user.SshAuthorizedKey
 *
 */
public class SshAuthorizedKeyBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.cloud.config.user.SshAuthorizedKey> {

    private SshAuthorizedKeyKey _key;
    private java.lang.String _keyPairRef;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.cloud.config.user.SshAuthorizedKey>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.cloud.config.user.SshAuthorizedKey>> augmentation = Collections.emptyMap();

    public SshAuthorizedKeyBuilder() {
    }

    public SshAuthorizedKeyBuilder(SshAuthorizedKey base) {
        if (base.getKey() == null) {
            this._key = new SshAuthorizedKeyKey(
                base.getKeyPairRef()
            );
            this._keyPairRef = base.getKeyPairRef();
        } else {
            this._key = base.getKey();
            this._keyPairRef = _key.getKeyPairRef();
        }
        if (base instanceof SshAuthorizedKeyImpl) {
            SshAuthorizedKeyImpl impl = (SshAuthorizedKeyImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.cloud.config.user.SshAuthorizedKey> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.cloud.config.user.SshAuthorizedKey>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public SshAuthorizedKeyKey getKey() {
        return _key;
    }
    
    public java.lang.String getKeyPairRef() {
        return _keyPairRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.cloud.config.user.SshAuthorizedKey>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public SshAuthorizedKeyBuilder setKey(final SshAuthorizedKeyKey value) {
        this._key = value;
        return this;
    }
    
     
    public SshAuthorizedKeyBuilder setKeyPairRef(final java.lang.String value) {
        this._keyPairRef = value;
        return this;
    }
    
    public SshAuthorizedKeyBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.cloud.config.user.SshAuthorizedKey>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.cloud.config.user.SshAuthorizedKey> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public SshAuthorizedKeyBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.cloud.config.user.SshAuthorizedKey>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public SshAuthorizedKey build() {
        return new SshAuthorizedKeyImpl(this);
    }

    private static final class SshAuthorizedKeyImpl implements SshAuthorizedKey {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.cloud.config.user.SshAuthorizedKey> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.nsr.rev170208.cloud.config.user.SshAuthorizedKey.class;
        }

        private final SshAuthorizedKeyKey _key;
        private final java.lang.String _keyPairRef;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.cloud.config.user.SshAuthorizedKey>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.cloud.config.user.SshAuthorizedKey>> augmentation = Collections.emptyMap();

        private SshAuthorizedKeyImpl(SshAuthorizedKeyBuilder base) {
            if (base.getKey() == null) {
                this._key = new SshAuthorizedKeyKey(
                    base.getKeyPairRef()
                );
                this._keyPairRef = base.getKeyPairRef();
            } else {
                this._key = base.getKey();
                this._keyPairRef = _key.getKeyPairRef();
            }
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.cloud.config.user.SshAuthorizedKey>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.cloud.config.user.SshAuthorizedKey>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.cloud.config.user.SshAuthorizedKey>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.cloud.config.user.SshAuthorizedKey>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public SshAuthorizedKeyKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.String getKeyPairRef() {
            return _keyPairRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.cloud.config.user.SshAuthorizedKey>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_keyPairRef);
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
            if (!ietf.params.xml.ns.yang.nfvo.nsr.rev170208.cloud.config.user.SshAuthorizedKey.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.nsr.rev170208.cloud.config.user.SshAuthorizedKey other = (ietf.params.xml.ns.yang.nfvo.nsr.rev170208.cloud.config.user.SshAuthorizedKey)obj;
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_keyPairRef, other.getKeyPairRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                SshAuthorizedKeyImpl otherImpl = (SshAuthorizedKeyImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.cloud.config.user.SshAuthorizedKey>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.cloud.config.user.SshAuthorizedKey>> e : augmentation.entrySet()) {
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
            java.lang.String name = "SshAuthorizedKey [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_keyPairRef != null) {
                builder.append("_keyPairRef=");
                builder.append(_keyPairRef);
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
