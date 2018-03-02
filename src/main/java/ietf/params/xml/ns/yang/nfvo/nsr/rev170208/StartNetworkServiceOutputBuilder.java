package ietf.params.xml.ns.yang.nfvo.nsr.rev170208;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.nsr.rev170208.StartNetworkServiceOutput} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.nsr.rev170208.StartNetworkServiceOutput
 *
 */
public class StartNetworkServiceOutputBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.StartNetworkServiceOutput> {

    private Uuid _nsrId;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.StartNetworkServiceOutput>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.StartNetworkServiceOutput>> augmentation = Collections.emptyMap();

    public StartNetworkServiceOutputBuilder() {
    }

    public StartNetworkServiceOutputBuilder(StartNetworkServiceOutput base) {
        this._nsrId = base.getNsrId();
        if (base instanceof StartNetworkServiceOutputImpl) {
            StartNetworkServiceOutputImpl impl = (StartNetworkServiceOutputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.StartNetworkServiceOutput> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.StartNetworkServiceOutput>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public Uuid getNsrId() {
        return _nsrId;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.StartNetworkServiceOutput>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public StartNetworkServiceOutputBuilder setNsrId(final Uuid value) {
        this._nsrId = value;
        return this;
    }
    
    public StartNetworkServiceOutputBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.StartNetworkServiceOutput>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.StartNetworkServiceOutput> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public StartNetworkServiceOutputBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.StartNetworkServiceOutput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public StartNetworkServiceOutput build() {
        return new StartNetworkServiceOutputImpl(this);
    }

    private static final class StartNetworkServiceOutputImpl implements StartNetworkServiceOutput {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.StartNetworkServiceOutput> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.nsr.rev170208.StartNetworkServiceOutput.class;
        }

        private final Uuid _nsrId;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.StartNetworkServiceOutput>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.StartNetworkServiceOutput>> augmentation = Collections.emptyMap();

        private StartNetworkServiceOutputImpl(StartNetworkServiceOutputBuilder base) {
            this._nsrId = base.getNsrId();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.StartNetworkServiceOutput>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.StartNetworkServiceOutput>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.StartNetworkServiceOutput>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.StartNetworkServiceOutput>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public Uuid getNsrId() {
            return _nsrId;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.StartNetworkServiceOutput>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_nsrId);
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
            if (!ietf.params.xml.ns.yang.nfvo.nsr.rev170208.StartNetworkServiceOutput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.nsr.rev170208.StartNetworkServiceOutput other = (ietf.params.xml.ns.yang.nfvo.nsr.rev170208.StartNetworkServiceOutput)obj;
            if (!Objects.equals(_nsrId, other.getNsrId())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                StartNetworkServiceOutputImpl otherImpl = (StartNetworkServiceOutputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.StartNetworkServiceOutput>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.StartNetworkServiceOutput>> e : augmentation.entrySet()) {
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
            java.lang.String name = "StartNetworkServiceOutput [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_nsrId != null) {
                builder.append("_nsrId=");
                builder.append(_nsrId);
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
