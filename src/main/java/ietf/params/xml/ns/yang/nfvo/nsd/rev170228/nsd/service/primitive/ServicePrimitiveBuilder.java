package ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.service.primitive;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ui.primitive.group.ParameterGroup;
import ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.service.primitive.service.primitive.Parameter;
import ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.service.primitive.service.primitive.VnfPrimitiveGroup;

import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.service.primitive.ServicePrimitive} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.service.primitive.ServicePrimitive
 *
 */
public class ServicePrimitiveBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.service.primitive.ServicePrimitive> {

    private ServicePrimitiveKey _key;
    private java.lang.String _name;
    private List<Parameter> _parameter;
    private List<ParameterGroup> _parameterGroup;
    private java.lang.String _userDefinedScript;
    private List<VnfPrimitiveGroup> _vnfPrimitiveGroup;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.service.primitive.ServicePrimitive>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.service.primitive.ServicePrimitive>> augmentation = Collections.emptyMap();

    public ServicePrimitiveBuilder() {
    }
    public ServicePrimitiveBuilder(ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.UiPrimitiveGroup arg) {
        this._parameterGroup = arg.getParameterGroup();
    }

    public ServicePrimitiveBuilder(ServicePrimitive base) {
        if (base.getKey() == null) {
            this._key = new ServicePrimitiveKey(
                base.getName()
            );
            this._name = base.getName();
        } else {
            this._key = base.getKey();
            this._name = _key.getName();
        }
        this._parameter = base.getParameter();
        this._parameterGroup = base.getParameterGroup();
        this._userDefinedScript = base.getUserDefinedScript();
        this._vnfPrimitiveGroup = base.getVnfPrimitiveGroup();
        if (base instanceof ServicePrimitiveImpl) {
            ServicePrimitiveImpl impl = (ServicePrimitiveImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.service.primitive.ServicePrimitive> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.service.primitive.ServicePrimitive>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.UiPrimitiveGroup</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.UiPrimitiveGroup) {
            this._parameterGroup = ((ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.UiPrimitiveGroup)arg).getParameterGroup();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.UiPrimitiveGroup] \n" +
              "but was: " + arg
            );
        }
    }

    public ServicePrimitiveKey getKey() {
        return _key;
    }
    
    public java.lang.String getName() {
        return _name;
    }
    
    public List<Parameter> getParameter() {
        return _parameter;
    }
    
    public List<ParameterGroup> getParameterGroup() {
        return _parameterGroup;
    }
    
    public java.lang.String getUserDefinedScript() {
        return _userDefinedScript;
    }
    
    public List<VnfPrimitiveGroup> getVnfPrimitiveGroup() {
        return _vnfPrimitiveGroup;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.service.primitive.ServicePrimitive>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public ServicePrimitiveBuilder setKey(final ServicePrimitiveKey value) {
        this._key = value;
        return this;
    }
    
     
    public ServicePrimitiveBuilder setName(final java.lang.String value) {
        this._name = value;
        return this;
    }
    
     
    public ServicePrimitiveBuilder setParameter(final List<Parameter> value) {
        this._parameter = value;
        return this;
    }
    
     
    public ServicePrimitiveBuilder setParameterGroup(final List<ParameterGroup> value) {
        this._parameterGroup = value;
        return this;
    }
    
     
    public ServicePrimitiveBuilder setUserDefinedScript(final java.lang.String value) {
        this._userDefinedScript = value;
        return this;
    }
    
     
    public ServicePrimitiveBuilder setVnfPrimitiveGroup(final List<VnfPrimitiveGroup> value) {
        this._vnfPrimitiveGroup = value;
        return this;
    }
    
    public ServicePrimitiveBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.service.primitive.ServicePrimitive>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.service.primitive.ServicePrimitive> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ServicePrimitiveBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.service.primitive.ServicePrimitive>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ServicePrimitive build() {
        return new ServicePrimitiveImpl(this);
    }

    private static final class ServicePrimitiveImpl implements ServicePrimitive {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.service.primitive.ServicePrimitive> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.service.primitive.ServicePrimitive.class;
        }

        private final ServicePrimitiveKey _key;
        private final java.lang.String _name;
        private final List<Parameter> _parameter;
        private final List<ParameterGroup> _parameterGroup;
        private final java.lang.String _userDefinedScript;
        private final List<VnfPrimitiveGroup> _vnfPrimitiveGroup;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.service.primitive.ServicePrimitive>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.service.primitive.ServicePrimitive>> augmentation = Collections.emptyMap();

        private ServicePrimitiveImpl(ServicePrimitiveBuilder base) {
            if (base.getKey() == null) {
                this._key = new ServicePrimitiveKey(
                    base.getName()
                );
                this._name = base.getName();
            } else {
                this._key = base.getKey();
                this._name = _key.getName();
            }
            this._parameter = base.getParameter();
            this._parameterGroup = base.getParameterGroup();
            this._userDefinedScript = base.getUserDefinedScript();
            this._vnfPrimitiveGroup = base.getVnfPrimitiveGroup();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.service.primitive.ServicePrimitive>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.service.primitive.ServicePrimitive>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.service.primitive.ServicePrimitive>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.service.primitive.ServicePrimitive>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public ServicePrimitiveKey getKey() {
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
        
        @Override
        public List<ParameterGroup> getParameterGroup() {
            return _parameterGroup;
        }
        
        @Override
        public java.lang.String getUserDefinedScript() {
            return _userDefinedScript;
        }
        
        @Override
        public List<VnfPrimitiveGroup> getVnfPrimitiveGroup() {
            return _vnfPrimitiveGroup;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.service.primitive.ServicePrimitive>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_parameterGroup);
            result = prime * result + Objects.hashCode(_userDefinedScript);
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
            if (!ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.service.primitive.ServicePrimitive.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.service.primitive.ServicePrimitive other = (ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.service.primitive.ServicePrimitive)obj;
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_parameter, other.getParameter())) {
                return false;
            }
            if (!Objects.equals(_parameterGroup, other.getParameterGroup())) {
                return false;
            }
            if (!Objects.equals(_userDefinedScript, other.getUserDefinedScript())) {
                return false;
            }
            if (!Objects.equals(_vnfPrimitiveGroup, other.getVnfPrimitiveGroup())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ServicePrimitiveImpl otherImpl = (ServicePrimitiveImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.service.primitive.ServicePrimitive>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.service.primitive.ServicePrimitive>> e : augmentation.entrySet()) {
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
            java.lang.String name = "ServicePrimitive [";
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
                builder.append(", ");
            }
            if (_parameterGroup != null) {
                builder.append("_parameterGroup=");
                builder.append(_parameterGroup);
                builder.append(", ");
            }
            if (_userDefinedScript != null) {
                builder.append("_userDefinedScript=");
                builder.append(_userDefinedScript);
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
