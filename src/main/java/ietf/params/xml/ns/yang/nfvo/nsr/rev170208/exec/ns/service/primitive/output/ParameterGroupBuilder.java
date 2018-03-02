package ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.primitive.parameter.value.Parameter;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output.ParameterGroup} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output.ParameterGroup
 *
 */
public class ParameterGroupBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output.ParameterGroup> {

    private ParameterGroupKey _key;
    private java.lang.String _name;
    private List<Parameter> _parameter;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output.ParameterGroup>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output.ParameterGroup>> augmentation = Collections.emptyMap();

    public ParameterGroupBuilder() {
    }
    public ParameterGroupBuilder(ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PrimitiveParameterValue arg) {
        this._parameter = arg.getParameter();
    }

    public ParameterGroupBuilder(ParameterGroup base) {
        if (base.getKey() == null) {
            this._key = new ParameterGroupKey(
                base.getName()
            );
            this._name = base.getName();
        } else {
            this._key = base.getKey();
            this._name = _key.getName();
        }
        this._parameter = base.getParameter();
        if (base instanceof ParameterGroupImpl) {
            ParameterGroupImpl impl = (ParameterGroupImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output.ParameterGroup> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output.ParameterGroup>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PrimitiveParameterValue</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PrimitiveParameterValue) {
            this._parameter = ((ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PrimitiveParameterValue)arg).getParameter();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PrimitiveParameterValue] \n" +
              "but was: " + arg
            );
        }
    }

    public ParameterGroupKey getKey() {
        return _key;
    }
    
    public java.lang.String getName() {
        return _name;
    }
    
    public List<Parameter> getParameter() {
        return _parameter;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output.ParameterGroup>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public ParameterGroupBuilder setKey(final ParameterGroupKey value) {
        this._key = value;
        return this;
    }
    
     
    public ParameterGroupBuilder setName(final java.lang.String value) {
        this._name = value;
        return this;
    }
    
     
    public ParameterGroupBuilder setParameter(final List<Parameter> value) {
        this._parameter = value;
        return this;
    }
    
    public ParameterGroupBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output.ParameterGroup>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output.ParameterGroup> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ParameterGroupBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output.ParameterGroup>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ParameterGroup build() {
        return new ParameterGroupImpl(this);
    }

    private static final class ParameterGroupImpl implements ParameterGroup {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output.ParameterGroup> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output.ParameterGroup.class;
        }

        private final ParameterGroupKey _key;
        private final java.lang.String _name;
        private final List<Parameter> _parameter;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output.ParameterGroup>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output.ParameterGroup>> augmentation = Collections.emptyMap();

        private ParameterGroupImpl(ParameterGroupBuilder base) {
            if (base.getKey() == null) {
                this._key = new ParameterGroupKey(
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
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output.ParameterGroup>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output.ParameterGroup>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output.ParameterGroup>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output.ParameterGroup>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public ParameterGroupKey getKey() {
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
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output.ParameterGroup>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            if (!ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output.ParameterGroup.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output.ParameterGroup other = (ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output.ParameterGroup)obj;
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
                ParameterGroupImpl otherImpl = (ParameterGroupImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output.ParameterGroup>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output.ParameterGroup>> e : augmentation.entrySet()) {
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
            java.lang.String name = "ParameterGroup [";
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
