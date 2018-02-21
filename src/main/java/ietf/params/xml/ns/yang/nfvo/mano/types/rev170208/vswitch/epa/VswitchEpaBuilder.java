package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vswitch.epa;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vswitch.epa.VswitchEpa.OvsAcceleration;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vswitch.epa.VswitchEpa.OvsOffload;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vswitch.epa.VswitchEpa} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vswitch.epa.VswitchEpa
 *
 */
public class VswitchEpaBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vswitch.epa.VswitchEpa> {

    private OvsAcceleration _ovsAcceleration;
    private OvsOffload _ovsOffload;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vswitch.epa.VswitchEpa>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vswitch.epa.VswitchEpa>> augmentation = Collections.emptyMap();

    public VswitchEpaBuilder() {
    }

    public VswitchEpaBuilder(VswitchEpa base) {
        this._ovsAcceleration = base.getOvsAcceleration();
        this._ovsOffload = base.getOvsOffload();
        if (base instanceof VswitchEpaImpl) {
            VswitchEpaImpl impl = (VswitchEpaImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vswitch.epa.VswitchEpa> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vswitch.epa.VswitchEpa>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public OvsAcceleration getOvsAcceleration() {
        return _ovsAcceleration;
    }
    
    public OvsOffload getOvsOffload() {
        return _ovsOffload;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vswitch.epa.VswitchEpa>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public VswitchEpaBuilder setOvsAcceleration(final OvsAcceleration value) {
        this._ovsAcceleration = value;
        return this;
    }
    
     
    public VswitchEpaBuilder setOvsOffload(final OvsOffload value) {
        this._ovsOffload = value;
        return this;
    }
    
    public VswitchEpaBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vswitch.epa.VswitchEpa>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vswitch.epa.VswitchEpa> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VswitchEpaBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vswitch.epa.VswitchEpa>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public VswitchEpa build() {
        return new VswitchEpaImpl(this);
    }

    private static final class VswitchEpaImpl implements VswitchEpa {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vswitch.epa.VswitchEpa> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vswitch.epa.VswitchEpa.class;
        }

        private final OvsAcceleration _ovsAcceleration;
        private final OvsOffload _ovsOffload;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vswitch.epa.VswitchEpa>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vswitch.epa.VswitchEpa>> augmentation = Collections.emptyMap();

        private VswitchEpaImpl(VswitchEpaBuilder base) {
            this._ovsAcceleration = base.getOvsAcceleration();
            this._ovsOffload = base.getOvsOffload();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vswitch.epa.VswitchEpa>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vswitch.epa.VswitchEpa>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vswitch.epa.VswitchEpa>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vswitch.epa.VswitchEpa>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public OvsAcceleration getOvsAcceleration() {
            return _ovsAcceleration;
        }
        
        @Override
        public OvsOffload getOvsOffload() {
            return _ovsOffload;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vswitch.epa.VswitchEpa>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_ovsAcceleration);
            result = prime * result + Objects.hashCode(_ovsOffload);
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
            if (!ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vswitch.epa.VswitchEpa.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vswitch.epa.VswitchEpa other = (ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vswitch.epa.VswitchEpa)obj;
            if (!Objects.equals(_ovsAcceleration, other.getOvsAcceleration())) {
                return false;
            }
            if (!Objects.equals(_ovsOffload, other.getOvsOffload())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VswitchEpaImpl otherImpl = (VswitchEpaImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vswitch.epa.VswitchEpa>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vswitch.epa.VswitchEpa>> e : augmentation.entrySet()) {
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
            java.lang.String name = "VswitchEpa [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_ovsAcceleration != null) {
                builder.append("_ovsAcceleration=");
                builder.append(_ovsAcceleration);
                builder.append(", ");
            }
            if (_ovsOffload != null) {
                builder.append("_ovsOffload=");
                builder.append(_ovsOffload);
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
