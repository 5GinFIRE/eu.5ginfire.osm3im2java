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
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.volume.info.volume.source.Ephemeral} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.volume.info.volume.source.Ephemeral
 *
 */
public class EphemeralBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.volume.info.volume.source.Ephemeral> {

    private java.lang.Boolean _ephemeral;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.volume.info.volume.source.Ephemeral>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.volume.info.volume.source.Ephemeral>> augmentation = Collections.emptyMap();

    public EphemeralBuilder() {
    }

    public EphemeralBuilder(Ephemeral base) {
        this._ephemeral = base.isEphemeral();
        if (base instanceof EphemeralImpl) {
            EphemeralImpl impl = (EphemeralImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.volume.info.volume.source.Ephemeral> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.volume.info.volume.source.Ephemeral>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public java.lang.Boolean isEphemeral() {
        return _ephemeral;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.volume.info.volume.source.Ephemeral>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public EphemeralBuilder setEphemeral(final java.lang.Boolean value) {
        this._ephemeral = value;
        return this;
    }
    
    public EphemeralBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.volume.info.volume.source.Ephemeral>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.volume.info.volume.source.Ephemeral> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public EphemeralBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.volume.info.volume.source.Ephemeral>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Ephemeral build() {
        return new EphemeralImpl(this);
    }

    private static final class EphemeralImpl implements Ephemeral {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.volume.info.volume.source.Ephemeral> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.volume.info.volume.source.Ephemeral.class;
        }

        private final java.lang.Boolean _ephemeral;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.volume.info.volume.source.Ephemeral>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.volume.info.volume.source.Ephemeral>> augmentation = Collections.emptyMap();

        private EphemeralImpl(EphemeralBuilder base) {
            this._ephemeral = base.isEphemeral();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.volume.info.volume.source.Ephemeral>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.volume.info.volume.source.Ephemeral>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.volume.info.volume.source.Ephemeral>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.volume.info.volume.source.Ephemeral>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Boolean isEphemeral() {
            return _ephemeral;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.volume.info.volume.source.Ephemeral>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_ephemeral);
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
            if (!ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.volume.info.volume.source.Ephemeral.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.volume.info.volume.source.Ephemeral other = (ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.volume.info.volume.source.Ephemeral)obj;
            if (!Objects.equals(_ephemeral, other.isEphemeral())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                EphemeralImpl otherImpl = (EphemeralImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.volume.info.volume.source.Ephemeral>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.volume.info.volume.source.Ephemeral>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Ephemeral [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_ephemeral != null) {
                builder.append("_ephemeral=");
                builder.append(_ephemeral);
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
