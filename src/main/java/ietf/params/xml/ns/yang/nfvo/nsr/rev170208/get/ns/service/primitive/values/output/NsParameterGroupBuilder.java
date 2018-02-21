package ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.ns.parameter.group.Parameter;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.NsParameterGroup} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.NsParameterGroup
 *
 */
public class NsParameterGroupBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.NsParameterGroup> {

    private NsParameterGroupKey _key;
    private java.lang.String _name;
    private List<Parameter> _parameter;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.NsParameterGroup>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.NsParameterGroup>> augmentation = Collections.emptyMap();

    public NsParameterGroupBuilder() {
    }

    public NsParameterGroupBuilder(NsParameterGroup base) {
        if (base.getKey() == null) {
            this._key = new NsParameterGroupKey(
                base.getName()
            );
            this._name = base.getName();
        } else {
            this._key = base.getKey();
            this._name = _key.getName();
        }
        this._parameter = base.getParameter();
        if (base instanceof NsParameterGroupImpl) {
            NsParameterGroupImpl impl = (NsParameterGroupImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.NsParameterGroup> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.NsParameterGroup>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public NsParameterGroupKey getKey() {
        return _key;
    }
    
    public java.lang.String getName() {
        return _name;
    }
    
    public List<Parameter> getParameter() {
        return _parameter;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.NsParameterGroup>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public NsParameterGroupBuilder setKey(final NsParameterGroupKey value) {
        this._key = value;
        return this;
    }
    
     
    public NsParameterGroupBuilder setName(final java.lang.String value) {
        this._name = value;
        return this;
    }
    
     
    public NsParameterGroupBuilder setParameter(final List<Parameter> value) {
        this._parameter = value;
        return this;
    }
    
    public NsParameterGroupBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.NsParameterGroup>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.NsParameterGroup> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public NsParameterGroupBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.NsParameterGroup>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public NsParameterGroup build() {
        return new NsParameterGroupImpl(this);
    }

    private static final class NsParameterGroupImpl implements NsParameterGroup {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.NsParameterGroup> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.NsParameterGroup.class;
        }

        private final NsParameterGroupKey _key;
        private final java.lang.String _name;
        private final List<Parameter> _parameter;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.NsParameterGroup>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.NsParameterGroup>> augmentation = Collections.emptyMap();

        private NsParameterGroupImpl(NsParameterGroupBuilder base) {
            if (base.getKey() == null) {
                this._key = new NsParameterGroupKey(
                    base.getName()
                );
                this._name = base.getName();
            } else {
                this._key = base.getKey();
                this._name = _key.getName();
            }
            this._parameter = base.getParameter();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.NsParameterGroup>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.NsParameterGroup>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.NsParameterGroup>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.NsParameterGroup>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public NsParameterGroupKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.String getName() {
            return _name;
        }
        
        @Override
        public List<Parameter> getParameter() {
            return _parameter;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.NsParameterGroup>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_parameter);
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
            if (!ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.NsParameterGroup.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.NsParameterGroup other = (ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.NsParameterGroup)obj;
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_parameter, other.getParameter())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NsParameterGroupImpl otherImpl = (NsParameterGroupImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.NsParameterGroup>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.NsParameterGroup>> e : augmentation.entrySet()) {
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
            java.lang.String name = "NsParameterGroup [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_name != null) {
                builder.append("_name=");
                builder.append(_name);
                builder.append(", ");
            }
            if (_parameter != null) {
                builder.append("_parameter=");
                builder.append(_parameter);
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
