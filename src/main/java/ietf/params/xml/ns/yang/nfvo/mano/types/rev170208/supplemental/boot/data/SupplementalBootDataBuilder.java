package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.supplemental.boot.data;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.config.file.ConfigFile;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.supplemental.boot.data.SupplementalBootData} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.supplemental.boot.data.SupplementalBootData
 *
 */
public class SupplementalBootDataBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.supplemental.boot.data.SupplementalBootData> {

    private List<ConfigFile> _configFile;
    private java.lang.Boolean _bootDataDrive;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.supplemental.boot.data.SupplementalBootData>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.supplemental.boot.data.SupplementalBootData>> augmentation = Collections.emptyMap();

    public SupplementalBootDataBuilder() {
    }
    public SupplementalBootDataBuilder(ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ConfigFile arg) {
        this._configFile = arg.getConfigFile();
    }

    public SupplementalBootDataBuilder(SupplementalBootData base) {
        this._configFile = base.getConfigFile();
        this._bootDataDrive = base.isBootDataDrive();
        if (base instanceof SupplementalBootDataImpl) {
            SupplementalBootDataImpl impl = (SupplementalBootDataImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.supplemental.boot.data.SupplementalBootData> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.supplemental.boot.data.SupplementalBootData>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ConfigFile</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ConfigFile) {
            this._configFile = ((ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ConfigFile)arg).getConfigFile();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ConfigFile] \n" +
              "but was: " + arg
            );
        }
    }

    public List<ConfigFile> getConfigFile() {
        return _configFile;
    }
    
    public java.lang.Boolean isBootDataDrive() {
        return _bootDataDrive;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.supplemental.boot.data.SupplementalBootData>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public SupplementalBootDataBuilder setConfigFile(final List<ConfigFile> value) {
        this._configFile = value;
        return this;
    }
    
     
    public SupplementalBootDataBuilder setBootDataDrive(final java.lang.Boolean value) {
        this._bootDataDrive = value;
        return this;
    }
    
    public SupplementalBootDataBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.supplemental.boot.data.SupplementalBootData>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.supplemental.boot.data.SupplementalBootData> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public SupplementalBootDataBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.supplemental.boot.data.SupplementalBootData>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public SupplementalBootData build() {
        return new SupplementalBootDataImpl(this);
    }

    private static final class SupplementalBootDataImpl implements SupplementalBootData {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.supplemental.boot.data.SupplementalBootData> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.supplemental.boot.data.SupplementalBootData.class;
        }

        private final List<ConfigFile> _configFile;
        private final java.lang.Boolean _bootDataDrive;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.supplemental.boot.data.SupplementalBootData>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.supplemental.boot.data.SupplementalBootData>> augmentation = Collections.emptyMap();

        private SupplementalBootDataImpl(SupplementalBootDataBuilder base) {
            this._configFile = base.getConfigFile();
            this._bootDataDrive = base.isBootDataDrive();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.supplemental.boot.data.SupplementalBootData>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.supplemental.boot.data.SupplementalBootData>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.supplemental.boot.data.SupplementalBootData>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.supplemental.boot.data.SupplementalBootData>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<ConfigFile> getConfigFile() {
            return _configFile;
        }
        
        @Override
        public java.lang.Boolean isBootDataDrive() {
            return _bootDataDrive;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.supplemental.boot.data.SupplementalBootData>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_configFile);
            result = prime * result + Objects.hashCode(_bootDataDrive);
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
            if (!ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.supplemental.boot.data.SupplementalBootData.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.supplemental.boot.data.SupplementalBootData other = (ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.supplemental.boot.data.SupplementalBootData)obj;
            if (!Objects.equals(_configFile, other.getConfigFile())) {
                return false;
            }
            if (!Objects.equals(_bootDataDrive, other.isBootDataDrive())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                SupplementalBootDataImpl otherImpl = (SupplementalBootDataImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.supplemental.boot.data.SupplementalBootData>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.supplemental.boot.data.SupplementalBootData>> e : augmentation.entrySet()) {
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
            java.lang.String name = "SupplementalBootData [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_configFile != null) {
                builder.append("_configFile=");
                builder.append(_configFile);
                builder.append(", ");
            }
            if (_bootDataDrive != null) {
                builder.append("_bootDataDrive=");
                builder.append(_bootDataDrive);
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
