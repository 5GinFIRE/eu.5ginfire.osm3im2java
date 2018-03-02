package http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.cloud.init.input;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.cloud.init.input.Filename} instances.
 * 
 * @see http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.cloud.init.input.Filename
 *
 */
public class FilenameBuilder implements Builder<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.cloud.init.input.Filename> {

    private java.lang.String _cloudInitFile;

    Map<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.cloud.init.input.Filename>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.cloud.init.input.Filename>> augmentation = Collections.emptyMap();

    public FilenameBuilder() {
    }

    public FilenameBuilder(Filename base) {
        this._cloudInitFile = base.getCloudInitFile();
        if (base instanceof FilenameImpl) {
            FilenameImpl impl = (FilenameImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.cloud.init.input.Filename> casted =(AugmentationHolder<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.cloud.init.input.Filename>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public java.lang.String getCloudInitFile() {
        return _cloudInitFile;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.cloud.init.input.Filename>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public FilenameBuilder setCloudInitFile(final java.lang.String value) {
        this._cloudInitFile = value;
        return this;
    }
    
    public FilenameBuilder addAugmentation(java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.cloud.init.input.Filename>> augmentationType, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.cloud.init.input.Filename> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public FilenameBuilder removeAugmentation(java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.cloud.init.input.Filename>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Filename build() {
        return new FilenameImpl(this);
    }

    private static final class FilenameImpl implements Filename {

        @Override
        public java.lang.Class<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.cloud.init.input.Filename> getImplementedInterface() {
            return http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.cloud.init.input.Filename.class;
        }

        private final java.lang.String _cloudInitFile;

        private Map<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.cloud.init.input.Filename>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.cloud.init.input.Filename>> augmentation = Collections.emptyMap();

        private FilenameImpl(FilenameBuilder base) {
            this._cloudInitFile = base.getCloudInitFile();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.cloud.init.input.Filename>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.cloud.init.input.Filename>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.cloud.init.input.Filename>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.cloud.init.input.Filename>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getCloudInitFile() {
            return _cloudInitFile;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.cloud.init.input.Filename>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_cloudInitFile);
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
            if (!http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.cloud.init.input.Filename.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.cloud.init.input.Filename other = (http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.cloud.init.input.Filename)obj;
            if (!Objects.equals(_cloudInitFile, other.getCloudInitFile())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                FilenameImpl otherImpl = (FilenameImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.cloud.init.input.Filename>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.cloud.init.input.Filename>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Filename [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_cloudInitFile != null) {
                builder.append("_cloudInitFile=");
                builder.append(_cloudInitFile);
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
