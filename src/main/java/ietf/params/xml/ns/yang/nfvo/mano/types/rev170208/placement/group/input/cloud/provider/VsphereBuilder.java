package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Vsphere} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Vsphere
 *
 */
public class VsphereBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Vsphere> {

    private java.lang.Boolean _vsphereConstruct;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Vsphere>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Vsphere>> augmentation = Collections.emptyMap();

    public VsphereBuilder() {
    }

    public VsphereBuilder(Vsphere base) {
        this._vsphereConstruct = base.isVsphereConstruct();
        if (base instanceof VsphereImpl) {
            VsphereImpl impl = (VsphereImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Vsphere> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Vsphere>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public java.lang.Boolean isVsphereConstruct() {
        return _vsphereConstruct;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Vsphere>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public VsphereBuilder setVsphereConstruct(final java.lang.Boolean value) {
        this._vsphereConstruct = value;
        return this;
    }
    
    public VsphereBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Vsphere>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Vsphere> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VsphereBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Vsphere>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Vsphere build() {
        return new VsphereImpl(this);
    }

    private static final class VsphereImpl implements Vsphere {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Vsphere> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Vsphere.class;
        }

        private final java.lang.Boolean _vsphereConstruct;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Vsphere>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Vsphere>> augmentation = Collections.emptyMap();

        private VsphereImpl(VsphereBuilder base) {
            this._vsphereConstruct = base.isVsphereConstruct();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Vsphere>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Vsphere>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Vsphere>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Vsphere>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Boolean isVsphereConstruct() {
            return _vsphereConstruct;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Vsphere>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_vsphereConstruct);
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
            if (!ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Vsphere.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Vsphere other = (ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Vsphere)obj;
            if (!Objects.equals(_vsphereConstruct, other.isVsphereConstruct())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VsphereImpl otherImpl = (VsphereImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Vsphere>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.Vsphere>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Vsphere [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_vsphereConstruct != null) {
                builder.append("_vsphereConstruct=");
                builder.append(_vsphereConstruct);
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
