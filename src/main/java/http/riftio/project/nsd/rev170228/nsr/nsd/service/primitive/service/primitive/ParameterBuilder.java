package http.riftio.project.nsd.rev170228.nsr.nsd.service.primitive.service.primitive;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ParameterDataType;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;

import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link http.riftio.project.nsd.rev170228.nsr.nsd.service.primitive.service.primitive.Parameter} instances.
 * 
 * @see http.riftio.project.nsd.rev170228.nsr.nsd.service.primitive.service.primitive.Parameter
 *
 */
public class ParameterBuilder implements Builder<http.riftio.project.nsd.rev170228.nsr.nsd.service.primitive.service.primitive.Parameter> {

    private ParameterDataType _dataType;
    private java.lang.String _defaultValue;
    private ParameterKey _key;
    private java.lang.String _name;
    private java.lang.String _parameterPool;
    private java.lang.Boolean _hidden;
    private java.lang.Boolean _mandatory;
    private java.lang.Boolean _readOnly;

    Map<java.lang.Class<? extends Augmentation<http.riftio.project.nsd.rev170228.nsr.nsd.service.primitive.service.primitive.Parameter>>, Augmentation<http.riftio.project.nsd.rev170228.nsr.nsd.service.primitive.service.primitive.Parameter>> augmentation = Collections.emptyMap();

    public ParameterBuilder() {
    }
    public ParameterBuilder(ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PrimitiveParameter arg) {
        this._name = arg.getName();
        this._dataType = arg.getDataType();
        this._mandatory = arg.isMandatory();
        this._defaultValue = arg.getDefaultValue();
        this._parameterPool = arg.getParameterPool();
        this._readOnly = arg.isReadOnly();
        this._hidden = arg.isHidden();
    }

    public ParameterBuilder(Parameter base) {
        if (base.getKey() == null) {
            this._key = new ParameterKey(
                base.getName()
            );
            this._name = base.getName();
        } else {
            this._key = base.getKey();
            this._name = _key.getName();
        }
        this._dataType = base.getDataType();
        this._defaultValue = base.getDefaultValue();
        this._parameterPool = base.getParameterPool();
        this._hidden = base.isHidden();
        this._mandatory = base.isMandatory();
        this._readOnly = base.isReadOnly();
        if (base instanceof ParameterImpl) {
            ParameterImpl impl = (ParameterImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<http.riftio.project.nsd.rev170228.nsr.nsd.service.primitive.service.primitive.Parameter> casted =(AugmentationHolder<http.riftio.project.nsd.rev170228.nsr.nsd.service.primitive.service.primitive.Parameter>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PrimitiveParameter</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PrimitiveParameter) {
            this._name = ((ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PrimitiveParameter)arg).getName();
            this._dataType = ((ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PrimitiveParameter)arg).getDataType();
            this._mandatory = ((ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PrimitiveParameter)arg).isMandatory();
            this._defaultValue = ((ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PrimitiveParameter)arg).getDefaultValue();
            this._parameterPool = ((ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PrimitiveParameter)arg).getParameterPool();
            this._readOnly = ((ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PrimitiveParameter)arg).isReadOnly();
            this._hidden = ((ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PrimitiveParameter)arg).isHidden();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PrimitiveParameter] \n" +
              "but was: " + arg
            );
        }
    }

    public ParameterDataType getDataType() {
        return _dataType;
    }
    
    public java.lang.String getDefaultValue() {
        return _defaultValue;
    }
    
    public ParameterKey getKey() {
        return _key;
    }
    
    public java.lang.String getName() {
        return _name;
    }
    
    public java.lang.String getParameterPool() {
        return _parameterPool;
    }
    
    public java.lang.Boolean isHidden() {
        return _hidden;
    }
    
    public java.lang.Boolean isMandatory() {
        return _mandatory;
    }
    
    public java.lang.Boolean isReadOnly() {
        return _readOnly;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<http.riftio.project.nsd.rev170228.nsr.nsd.service.primitive.service.primitive.Parameter>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public ParameterBuilder setDataType(final ParameterDataType value) {
        this._dataType = value;
        return this;
    }
    
     
    public ParameterBuilder setDefaultValue(final java.lang.String value) {
        this._defaultValue = value;
        return this;
    }
    
     
    public ParameterBuilder setKey(final ParameterKey value) {
        this._key = value;
        return this;
    }
    
     
    public ParameterBuilder setName(final java.lang.String value) {
        this._name = value;
        return this;
    }
    
     
    public ParameterBuilder setParameterPool(final java.lang.String value) {
        this._parameterPool = value;
        return this;
    }
    
     
    public ParameterBuilder setHidden(final java.lang.Boolean value) {
        this._hidden = value;
        return this;
    }
    
     
    public ParameterBuilder setMandatory(final java.lang.Boolean value) {
        this._mandatory = value;
        return this;
    }
    
     
    public ParameterBuilder setReadOnly(final java.lang.Boolean value) {
        this._readOnly = value;
        return this;
    }
    
    public ParameterBuilder addAugmentation(java.lang.Class<? extends Augmentation<http.riftio.project.nsd.rev170228.nsr.nsd.service.primitive.service.primitive.Parameter>> augmentationType, Augmentation<http.riftio.project.nsd.rev170228.nsr.nsd.service.primitive.service.primitive.Parameter> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ParameterBuilder removeAugmentation(java.lang.Class<? extends Augmentation<http.riftio.project.nsd.rev170228.nsr.nsd.service.primitive.service.primitive.Parameter>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Parameter build() {
        return new ParameterImpl(this);
    }

    private static final class ParameterImpl implements Parameter {

        @Override
        public java.lang.Class<http.riftio.project.nsd.rev170228.nsr.nsd.service.primitive.service.primitive.Parameter> getImplementedInterface() {
            return http.riftio.project.nsd.rev170228.nsr.nsd.service.primitive.service.primitive.Parameter.class;
        }

        private final ParameterDataType _dataType;
        private final java.lang.String _defaultValue;
        private final ParameterKey _key;
        private final java.lang.String _name;
        private final java.lang.String _parameterPool;
        private final java.lang.Boolean _hidden;
        private final java.lang.Boolean _mandatory;
        private final java.lang.Boolean _readOnly;

        private Map<java.lang.Class<? extends Augmentation<http.riftio.project.nsd.rev170228.nsr.nsd.service.primitive.service.primitive.Parameter>>, Augmentation<http.riftio.project.nsd.rev170228.nsr.nsd.service.primitive.service.primitive.Parameter>> augmentation = Collections.emptyMap();

        private ParameterImpl(ParameterBuilder base) {
            if (base.getKey() == null) {
                this._key = new ParameterKey(
                    base.getName()
                );
                this._name = base.getName();
            } else {
                this._key = base.getKey();
                this._name = _key.getName();
            }
            this._dataType = base.getDataType();
            this._defaultValue = base.getDefaultValue();
            this._parameterPool = base.getParameterPool();
            this._hidden = base.isHidden();
            this._mandatory = base.isMandatory();
            this._readOnly = base.isReadOnly();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.project.nsd.rev170228.nsr.nsd.service.primitive.service.primitive.Parameter>>, Augmentation<http.riftio.project.nsd.rev170228.nsr.nsd.service.primitive.service.primitive.Parameter>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<http.riftio.project.nsd.rev170228.nsr.nsd.service.primitive.service.primitive.Parameter>>, Augmentation<http.riftio.project.nsd.rev170228.nsr.nsd.service.primitive.service.primitive.Parameter>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public ParameterDataType getDataType() {
            return _dataType;
        }
        
        @Override
        public java.lang.String getDefaultValue() {
            return _defaultValue;
        }
        
        @Override
        public ParameterKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.String getName() {
            return _name;
        }
        
        @Override
        public java.lang.String getParameterPool() {
            return _parameterPool;
        }
        
        @Override
        public java.lang.Boolean isHidden() {
            return _hidden;
        }
        
        @Override
        public java.lang.Boolean isMandatory() {
            return _mandatory;
        }
        
        @Override
        public java.lang.Boolean isReadOnly() {
            return _readOnly;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<http.riftio.project.nsd.rev170228.nsr.nsd.service.primitive.service.primitive.Parameter>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_dataType);
            result = prime * result + Objects.hashCode(_defaultValue);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_parameterPool);
            result = prime * result + Objects.hashCode(_hidden);
            result = prime * result + Objects.hashCode(_mandatory);
            result = prime * result + Objects.hashCode(_readOnly);
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
            if (!http.riftio.project.nsd.rev170228.nsr.nsd.service.primitive.service.primitive.Parameter.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            http.riftio.project.nsd.rev170228.nsr.nsd.service.primitive.service.primitive.Parameter other = (http.riftio.project.nsd.rev170228.nsr.nsd.service.primitive.service.primitive.Parameter)obj;
            if (!Objects.equals(_dataType, other.getDataType())) {
                return false;
            }
            if (!Objects.equals(_defaultValue, other.getDefaultValue())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_parameterPool, other.getParameterPool())) {
                return false;
            }
            if (!Objects.equals(_hidden, other.isHidden())) {
                return false;
            }
            if (!Objects.equals(_mandatory, other.isMandatory())) {
                return false;
            }
            if (!Objects.equals(_readOnly, other.isReadOnly())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ParameterImpl otherImpl = (ParameterImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.project.nsd.rev170228.nsr.nsd.service.primitive.service.primitive.Parameter>>, Augmentation<http.riftio.project.nsd.rev170228.nsr.nsd.service.primitive.service.primitive.Parameter>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Parameter [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_dataType != null) {
                builder.append("_dataType=");
                builder.append(_dataType);
                builder.append(", ");
            }
            if (_defaultValue != null) {
                builder.append("_defaultValue=");
                builder.append(_defaultValue);
                builder.append(", ");
            }
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
            if (_parameterPool != null) {
                builder.append("_parameterPool=");
                builder.append(_parameterPool);
                builder.append(", ");
            }
            if (_hidden != null) {
                builder.append("_hidden=");
                builder.append(_hidden);
                builder.append(", ");
            }
            if (_mandatory != null) {
                builder.append("_mandatory=");
                builder.append(_mandatory);
                builder.append(", ");
            }
            if (_readOnly != null) {
                builder.append("_readOnly=");
                builder.append(_readOnly);
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
