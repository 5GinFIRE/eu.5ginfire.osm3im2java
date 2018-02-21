package ietf.params.xml.ns.yang.nfvo.nsr.rev170208;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.NsParameter;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.NsParameterGroup;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.VnfPrimitiveGroup;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;

import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.nsr.rev170208.GetNsServicePrimitiveValuesOutput} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.nsr.rev170208.GetNsServicePrimitiveValuesOutput
 *
 */
public class GetNsServicePrimitiveValuesOutputBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.GetNsServicePrimitiveValuesOutput> {

    private List<NsParameter> _nsParameter;
    private List<NsParameterGroup> _nsParameterGroup;
    private List<VnfPrimitiveGroup> _vnfPrimitiveGroup;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.GetNsServicePrimitiveValuesOutput>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.GetNsServicePrimitiveValuesOutput>> augmentation = Collections.emptyMap();

    public GetNsServicePrimitiveValuesOutputBuilder() {
    }

    public GetNsServicePrimitiveValuesOutputBuilder(GetNsServicePrimitiveValuesOutput base) {
        this._nsParameter = base.getNsParameter();
        this._nsParameterGroup = base.getNsParameterGroup();
        this._vnfPrimitiveGroup = base.getVnfPrimitiveGroup();
        if (base instanceof GetNsServicePrimitiveValuesOutputImpl) {
            GetNsServicePrimitiveValuesOutputImpl impl = (GetNsServicePrimitiveValuesOutputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.GetNsServicePrimitiveValuesOutput> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.GetNsServicePrimitiveValuesOutput>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public List<NsParameter> getNsParameter() {
        return _nsParameter;
    }
    
    public List<NsParameterGroup> getNsParameterGroup() {
        return _nsParameterGroup;
    }
    
    public List<VnfPrimitiveGroup> getVnfPrimitiveGroup() {
        return _vnfPrimitiveGroup;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.GetNsServicePrimitiveValuesOutput>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public GetNsServicePrimitiveValuesOutputBuilder setNsParameter(final List<NsParameter> value) {
        this._nsParameter = value;
        return this;
    }
    
     
    public GetNsServicePrimitiveValuesOutputBuilder setNsParameterGroup(final List<NsParameterGroup> value) {
        this._nsParameterGroup = value;
        return this;
    }
    
     
    public GetNsServicePrimitiveValuesOutputBuilder setVnfPrimitiveGroup(final List<VnfPrimitiveGroup> value) {
        this._vnfPrimitiveGroup = value;
        return this;
    }
    
    public GetNsServicePrimitiveValuesOutputBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.GetNsServicePrimitiveValuesOutput>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.GetNsServicePrimitiveValuesOutput> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public GetNsServicePrimitiveValuesOutputBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.GetNsServicePrimitiveValuesOutput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public GetNsServicePrimitiveValuesOutput build() {
        return new GetNsServicePrimitiveValuesOutputImpl(this);
    }

    private static final class GetNsServicePrimitiveValuesOutputImpl implements GetNsServicePrimitiveValuesOutput {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.GetNsServicePrimitiveValuesOutput> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.nsr.rev170208.GetNsServicePrimitiveValuesOutput.class;
        }

        private final List<NsParameter> _nsParameter;
        private final List<NsParameterGroup> _nsParameterGroup;
        private final List<VnfPrimitiveGroup> _vnfPrimitiveGroup;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.GetNsServicePrimitiveValuesOutput>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.GetNsServicePrimitiveValuesOutput>> augmentation = Collections.emptyMap();

        private GetNsServicePrimitiveValuesOutputImpl(GetNsServicePrimitiveValuesOutputBuilder base) {
            this._nsParameter = base.getNsParameter();
            this._nsParameterGroup = base.getNsParameterGroup();
            this._vnfPrimitiveGroup = base.getVnfPrimitiveGroup();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.GetNsServicePrimitiveValuesOutput>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.GetNsServicePrimitiveValuesOutput>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.GetNsServicePrimitiveValuesOutput>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.GetNsServicePrimitiveValuesOutput>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<NsParameter> getNsParameter() {
            return _nsParameter;
        }
        
        @Override
        public List<NsParameterGroup> getNsParameterGroup() {
            return _nsParameterGroup;
        }
        
        @Override
        public List<VnfPrimitiveGroup> getVnfPrimitiveGroup() {
            return _vnfPrimitiveGroup;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.GetNsServicePrimitiveValuesOutput>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_nsParameter);
            result = prime * result + Objects.hashCode(_nsParameterGroup);
            result = prime * result + Objects.hashCode(_vnfPrimitiveGroup);
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
            if (!ietf.params.xml.ns.yang.nfvo.nsr.rev170208.GetNsServicePrimitiveValuesOutput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.nsr.rev170208.GetNsServicePrimitiveValuesOutput other = (ietf.params.xml.ns.yang.nfvo.nsr.rev170208.GetNsServicePrimitiveValuesOutput)obj;
            if (!Objects.equals(_nsParameter, other.getNsParameter())) {
                return false;
            }
            if (!Objects.equals(_nsParameterGroup, other.getNsParameterGroup())) {
                return false;
            }
            if (!Objects.equals(_vnfPrimitiveGroup, other.getVnfPrimitiveGroup())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                GetNsServicePrimitiveValuesOutputImpl otherImpl = (GetNsServicePrimitiveValuesOutputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.GetNsServicePrimitiveValuesOutput>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.GetNsServicePrimitiveValuesOutput>> e : augmentation.entrySet()) {
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
            java.lang.String name = "GetNsServicePrimitiveValuesOutput [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_nsParameter != null) {
                builder.append("_nsParameter=");
                builder.append(_nsParameter);
                builder.append(", ");
            }
            if (_nsParameterGroup != null) {
                builder.append("_nsParameterGroup=");
                builder.append(_nsParameterGroup);
                builder.append(", ");
            }
            if (_vnfPrimitiveGroup != null) {
                builder.append("_vnfPrimitiveGroup=");
                builder.append(_vnfPrimitiveGroup);
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
