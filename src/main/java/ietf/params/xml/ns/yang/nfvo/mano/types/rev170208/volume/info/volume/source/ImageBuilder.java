package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.volume.info.volume.source;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.volume.info.volume.source.Image} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.volume.info.volume.source.Image
 *
 */
public class ImageBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.volume.info.volume.source.Image> {

    private java.lang.String _image;
    private java.lang.String _imageChecksum;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.volume.info.volume.source.Image>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.volume.info.volume.source.Image>> augmentation = Collections.emptyMap();

    public ImageBuilder() {
    }
    public ImageBuilder(ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ImageProperties arg) {
        this._image = arg.getImage();
        this._imageChecksum = arg.getImageChecksum();
    }

    public ImageBuilder(Image base) {
        this._image = base.getImage();
        this._imageChecksum = base.getImageChecksum();
        if (base instanceof ImageImpl) {
            ImageImpl impl = (ImageImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.volume.info.volume.source.Image> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.volume.info.volume.source.Image>) base;
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
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.volume.info.volume.source.Image>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public ImageBuilder setImage(final java.lang.String value) {
        this._image = value;
        return this;
    }
    
     
    public ImageBuilder setImageChecksum(final java.lang.String value) {
        this._imageChecksum = value;
        return this;
    }
    
    public ImageBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.volume.info.volume.source.Image>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.volume.info.volume.source.Image> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ImageBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.volume.info.volume.source.Image>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Image build() {
        return new ImageImpl(this);
    }

    private static final class ImageImpl implements Image {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.volume.info.volume.source.Image> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.volume.info.volume.source.Image.class;
        }

        private final java.lang.String _image;
        private final java.lang.String _imageChecksum;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.volume.info.volume.source.Image>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.volume.info.volume.source.Image>> augmentation = Collections.emptyMap();

        private ImageImpl(ImageBuilder base) {
            this._image = base.getImage();
            this._imageChecksum = base.getImageChecksum();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.volume.info.volume.source.Image>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.volume.info.volume.source.Image>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.volume.info.volume.source.Image>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.volume.info.volume.source.Image>>singletonMap(e.getKey(), e.getValue());
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
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.volume.info.volume.source.Image>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            if (!ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.volume.info.volume.source.Image.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.volume.info.volume.source.Image other = (ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.volume.info.volume.source.Image)obj;
            if (!Objects.equals(_image, other.getImage())) {
                return false;
            }
            if (!Objects.equals(_imageChecksum, other.getImageChecksum())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ImageImpl otherImpl = (ImageImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.volume.info.volume.source.Image>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.volume.info.volume.source.Image>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Image [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_image != null) {
                builder.append("_image=");
                builder.append(_image);
                builder.append(", ");
            }
            if (_imageChecksum != null) {
                builder.append("_imageChecksum=");
                builder.append(_imageChecksum);
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
