package http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.AlternativeImages} instances.
 * 
 * @see http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.AlternativeImages
 *
 */
public class AlternativeImagesBuilder implements Builder<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.AlternativeImages> {

    private java.lang.String _image;
    private java.lang.String _imageChecksum;
    private AlternativeImagesKey _key;
    private java.lang.String _vimType;

    Map<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.AlternativeImages>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.AlternativeImages>> augmentation = Collections.emptyMap();

    public AlternativeImagesBuilder() {
    }
    public AlternativeImagesBuilder(ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ImageProperties arg) {
        this._image = arg.getImage();
        this._imageChecksum = arg.getImageChecksum();
    }

    public AlternativeImagesBuilder(AlternativeImages base) {
        if (base.getKey() == null) {
            this._key = new AlternativeImagesKey(
                base.getVimType()
            );
            this._vimType = base.getVimType();
        } else {
            this._key = base.getKey();
            this._vimType = _key.getVimType();
        }
        this._image = base.getImage();
        this._imageChecksum = base.getImageChecksum();
        if (base instanceof AlternativeImagesImpl) {
            AlternativeImagesImpl impl = (AlternativeImagesImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.AlternativeImages> casted =(AugmentationHolder<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.AlternativeImages>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ImageProperties</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ImageProperties) {
            this._image = ((ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ImageProperties)arg).getImage();
            this._imageChecksum = ((ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ImageProperties)arg).getImageChecksum();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ImageProperties] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.String getImage() {
        return _image;
    }
    
    public java.lang.String getImageChecksum() {
        return _imageChecksum;
    }
    
    public AlternativeImagesKey getKey() {
        return _key;
    }
    
    public java.lang.String getVimType() {
        return _vimType;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.AlternativeImages>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public AlternativeImagesBuilder setImage(final java.lang.String value) {
        this._image = value;
        return this;
    }
    
     
    public AlternativeImagesBuilder setImageChecksum(final java.lang.String value) {
        this._imageChecksum = value;
        return this;
    }
    
     
    public AlternativeImagesBuilder setKey(final AlternativeImagesKey value) {
        this._key = value;
        return this;
    }
    
     
    public AlternativeImagesBuilder setVimType(final java.lang.String value) {
        this._vimType = value;
        return this;
    }
    
    public AlternativeImagesBuilder addAugmentation(java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.AlternativeImages>> augmentationType, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.AlternativeImages> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public AlternativeImagesBuilder removeAugmentation(java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.AlternativeImages>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public AlternativeImages build() {
        return new AlternativeImagesImpl(this);
    }

    private static final class AlternativeImagesImpl implements AlternativeImages {

        @Override
        public java.lang.Class<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.AlternativeImages> getImplementedInterface() {
            return http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.AlternativeImages.class;
        }

        private final java.lang.String _image;
        private final java.lang.String _imageChecksum;
        private final AlternativeImagesKey _key;
        private final java.lang.String _vimType;

        private Map<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.AlternativeImages>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.AlternativeImages>> augmentation = Collections.emptyMap();

        private AlternativeImagesImpl(AlternativeImagesBuilder base) {
            if (base.getKey() == null) {
                this._key = new AlternativeImagesKey(
                    base.getVimType()
                );
                this._vimType = base.getVimType();
            } else {
                this._key = base.getKey();
                this._vimType = _key.getVimType();
            }
            this._image = base.getImage();
            this._imageChecksum = base.getImageChecksum();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.AlternativeImages>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.AlternativeImages>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.AlternativeImages>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.AlternativeImages>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getImage() {
            return _image;
        }
        
        @Override
        public java.lang.String getImageChecksum() {
            return _imageChecksum;
        }
        
        @Override
        public AlternativeImagesKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.String getVimType() {
            return _vimType;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.AlternativeImages>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_image);
            result = prime * result + Objects.hashCode(_imageChecksum);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_vimType);
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
            if (!http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.AlternativeImages.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.AlternativeImages other = (http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.AlternativeImages)obj;
            if (!Objects.equals(_image, other.getImage())) {
                return false;
            }
            if (!Objects.equals(_imageChecksum, other.getImageChecksum())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_vimType, other.getVimType())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                AlternativeImagesImpl otherImpl = (AlternativeImagesImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.AlternativeImages>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.AlternativeImages>> e : augmentation.entrySet()) {
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
            java.lang.String name = "AlternativeImages [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_image != null) {
                builder.append("_image=");
                builder.append(_image);
                builder.append(", ");
            }
            if (_imageChecksum != null) {
                builder.append("_imageChecksum=");
                builder.append(_imageChecksum);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_vimType != null) {
                builder.append("_vimType=");
                builder.append(_vimType);
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
