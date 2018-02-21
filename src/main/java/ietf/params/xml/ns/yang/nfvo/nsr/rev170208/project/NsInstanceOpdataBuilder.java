package ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.Nsr;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.NsInstanceOpdata} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.NsInstanceOpdata
 *
 */
public class NsInstanceOpdataBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.NsInstanceOpdata> {

    private List<Nsr> _nsr;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.NsInstanceOpdata>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.NsInstanceOpdata>> augmentation = Collections.emptyMap();

    public NsInstanceOpdataBuilder() {
    }

    public NsInstanceOpdataBuilder(NsInstanceOpdata base) {
        this._nsr = base.getNsr();
        if (base instanceof NsInstanceOpdataImpl) {
            NsInstanceOpdataImpl impl = (NsInstanceOpdataImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.NsInstanceOpdata> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.NsInstanceOpdata>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public List<Nsr> getNsr() {
        return _nsr;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.NsInstanceOpdata>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public NsInstanceOpdataBuilder setNsr(final List<Nsr> value) {
        this._nsr = value;
        return this;
    }
    
    public NsInstanceOpdataBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.NsInstanceOpdata>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.NsInstanceOpdata> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public NsInstanceOpdataBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.NsInstanceOpdata>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public NsInstanceOpdata build() {
        return new NsInstanceOpdataImpl(this);
    }

    private static final class NsInstanceOpdataImpl implements NsInstanceOpdata {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.NsInstanceOpdata> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.NsInstanceOpdata.class;
        }

        private final List<Nsr> _nsr;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.NsInstanceOpdata>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.NsInstanceOpdata>> augmentation = Collections.emptyMap();

        private NsInstanceOpdataImpl(NsInstanceOpdataBuilder base) {
            this._nsr = base.getNsr();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.NsInstanceOpdata>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.NsInstanceOpdata>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.NsInstanceOpdata>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.NsInstanceOpdata>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<Nsr> getNsr() {
            return _nsr;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.NsInstanceOpdata>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_nsr);
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
            if (!ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.NsInstanceOpdata.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.NsInstanceOpdata other = (ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.NsInstanceOpdata)obj;
            if (!Objects.equals(_nsr, other.getNsr())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NsInstanceOpdataImpl otherImpl = (NsInstanceOpdataImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.NsInstanceOpdata>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.NsInstanceOpdata>> e : augmentation.entrySet()) {
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
            java.lang.String name = "NsInstanceOpdata [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_nsr != null) {
                builder.append("_nsr=");
                builder.append(_nsr);
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
