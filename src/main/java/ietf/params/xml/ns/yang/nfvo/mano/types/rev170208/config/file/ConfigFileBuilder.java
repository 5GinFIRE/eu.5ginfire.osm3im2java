package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.config.file;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.config.file.ConfigFile} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.config.file.ConfigFile
 *
 */
public class ConfigFileBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.config.file.ConfigFile> {

    private java.lang.String _dest;
    private ConfigFileKey _key;
    private java.lang.String _source;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.config.file.ConfigFile>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.config.file.ConfigFile>> augmentation = Collections.emptyMap();

    public ConfigFileBuilder() {
    }

    public ConfigFileBuilder(ConfigFile base) {
        if (base.getKey() == null) {
            this._key = new ConfigFileKey(
                base.getSource()
            );
            this._source = base.getSource();
        } else {
            this._key = base.getKey();
            this._source = _key.getSource();
        }
        this._dest = base.getDest();
        if (base instanceof ConfigFileImpl) {
            ConfigFileImpl impl = (ConfigFileImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.config.file.ConfigFile> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.config.file.ConfigFile>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public java.lang.String getDest() {
        return _dest;
    }
    
    public ConfigFileKey getKey() {
        return _key;
    }
    
    public java.lang.String getSource() {
        return _source;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.config.file.ConfigFile>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public ConfigFileBuilder setDest(final java.lang.String value) {
        this._dest = value;
        return this;
    }
    
     
    public ConfigFileBuilder setKey(final ConfigFileKey value) {
        this._key = value;
        return this;
    }
    
     
    public ConfigFileBuilder setSource(final java.lang.String value) {
        this._source = value;
        return this;
    }
    
    public ConfigFileBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.config.file.ConfigFile>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.config.file.ConfigFile> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ConfigFileBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.config.file.ConfigFile>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ConfigFile build() {
        return new ConfigFileImpl(this);
    }

    private static final class ConfigFileImpl implements ConfigFile {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.config.file.ConfigFile> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.config.file.ConfigFile.class;
        }

        private final java.lang.String _dest;
        private final ConfigFileKey _key;
        private final java.lang.String _source;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.config.file.ConfigFile>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.config.file.ConfigFile>> augmentation = Collections.emptyMap();

        private ConfigFileImpl(ConfigFileBuilder base) {
            if (base.getKey() == null) {
                this._key = new ConfigFileKey(
                    base.getSource()
                );
                this._source = base.getSource();
            } else {
                this._key = base.getKey();
                this._source = _key.getSource();
            }
            this._dest = base.getDest();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.config.file.ConfigFile>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.config.file.ConfigFile>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.config.file.ConfigFile>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.config.file.ConfigFile>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getDest() {
            return _dest;
        }
        
        @Override
        public ConfigFileKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.String getSource() {
            return _source;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.config.file.ConfigFile>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_dest);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_source);
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
            if (!ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.config.file.ConfigFile.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.config.file.ConfigFile other = (ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.config.file.ConfigFile)obj;
            if (!Objects.equals(_dest, other.getDest())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_source, other.getSource())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ConfigFileImpl otherImpl = (ConfigFileImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.config.file.ConfigFile>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.config.file.ConfigFile>> e : augmentation.entrySet()) {
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
            java.lang.String name = "ConfigFile [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_dest != null) {
                builder.append("_dest=");
                builder.append(_dest);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_source != null) {
                builder.append("_source=");
                builder.append(_source);
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
