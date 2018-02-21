package ietf.params.xml.ns.yang.nfvo.nsr.rev170208;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.input.parameter.InputParameter;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.NsdPlacementGroupMaps;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.ScalingGroup;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.start.network.service.input.VnfdPlacementGroupMaps;

import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.nsr.rev170208.StartNetworkServiceInput} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.nsr.rev170208.StartNetworkServiceInput
 *
 */
public class StartNetworkServiceInputBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.StartNetworkServiceInput> {

    private List<InputParameter> _inputParameter;
    private java.lang.String _name;
    private java.lang.Object _nsdIdRef;
    private List<NsdPlacementGroupMaps> _nsdPlacementGroupMaps;
    private java.lang.String _projectName;
    private List<ScalingGroup> _scalingGroup;
    private List<VnfdPlacementGroupMaps> _vnfdPlacementGroupMaps;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.StartNetworkServiceInput>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.StartNetworkServiceInput>> augmentation = Collections.emptyMap();

    public StartNetworkServiceInputBuilder() {
    }
    public StartNetworkServiceInputBuilder(ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.RpcProjectName arg) {
        this._projectName = arg.getProjectName();
    }
    public StartNetworkServiceInputBuilder(ietf.params.xml.ns.yang.nfvo.nsr.rev170208.NsInstanceConfigParamsCommon arg) {
        this._scalingGroup = arg.getScalingGroup();
        this._nsdPlacementGroupMaps = arg.getNsdPlacementGroupMaps();
        this._inputParameter = arg.getInputParameter();
    }
    public StartNetworkServiceInputBuilder(ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.InputParameter arg) {
        this._inputParameter = arg.getInputParameter();
    }

    public StartNetworkServiceInputBuilder(StartNetworkServiceInput base) {
        this._inputParameter = base.getInputParameter();
        this._name = base.getName();
        this._nsdIdRef = base.getNsdIdRef();
        this._nsdPlacementGroupMaps = base.getNsdPlacementGroupMaps();
        this._projectName = base.getProjectName();
        this._scalingGroup = base.getScalingGroup();
        this._vnfdPlacementGroupMaps = base.getVnfdPlacementGroupMaps();
        if (base instanceof StartNetworkServiceInputImpl) {
            StartNetworkServiceInputImpl impl = (StartNetworkServiceInputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.StartNetworkServiceInput> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.StartNetworkServiceInput>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.RpcProjectName</li>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.InputParameter</li>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.NsInstanceConfigParamsCommon</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.RpcProjectName) {
            this._projectName = ((ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.RpcProjectName)arg).getProjectName();
            isValidArg = true;
        }
        if (arg instanceof ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.InputParameter) {
            this._inputParameter = ((ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.InputParameter)arg).getInputParameter();
            isValidArg = true;
        }
        if (arg instanceof ietf.params.xml.ns.yang.nfvo.nsr.rev170208.NsInstanceConfigParamsCommon) {
            this._scalingGroup = ((ietf.params.xml.ns.yang.nfvo.nsr.rev170208.NsInstanceConfigParamsCommon)arg).getScalingGroup();
            this._nsdPlacementGroupMaps = ((ietf.params.xml.ns.yang.nfvo.nsr.rev170208.NsInstanceConfigParamsCommon)arg).getNsdPlacementGroupMaps();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.RpcProjectName, org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.InputParameter, org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.NsInstanceConfigParamsCommon] \n" +
              "but was: " + arg
            );
        }
    }

    public List<InputParameter> getInputParameter() {
        return _inputParameter;
    }
    
    public java.lang.String getName() {
        return _name;
    }
    
    public java.lang.Object getNsdIdRef() {
        return _nsdIdRef;
    }
    
    public List<NsdPlacementGroupMaps> getNsdPlacementGroupMaps() {
        return _nsdPlacementGroupMaps;
    }
    
    public java.lang.String getProjectName() {
        return _projectName;
    }
    
    public List<ScalingGroup> getScalingGroup() {
        return _scalingGroup;
    }
    
    public List<VnfdPlacementGroupMaps> getVnfdPlacementGroupMaps() {
        return _vnfdPlacementGroupMaps;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.StartNetworkServiceInput>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public StartNetworkServiceInputBuilder setInputParameter(final List<InputParameter> value) {
        this._inputParameter = value;
        return this;
    }
    
     
    public StartNetworkServiceInputBuilder setName(final java.lang.String value) {
        this._name = value;
        return this;
    }
    
     
    public StartNetworkServiceInputBuilder setNsdIdRef(final java.lang.Object value) {
        this._nsdIdRef = value;
        return this;
    }
    
     
    public StartNetworkServiceInputBuilder setNsdPlacementGroupMaps(final List<NsdPlacementGroupMaps> value) {
        this._nsdPlacementGroupMaps = value;
        return this;
    }
    
     
     private static void check_projectNameLength(final String value) {
         final int length = value.length();
         if (length >= 1 && length <= 255) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[1..255]].", value));
     }
    
    public StartNetworkServiceInputBuilder setProjectName(final java.lang.String value) {
    if (value != null) {
        check_projectNameLength(value);
    }
        this._projectName = value;
        return this;
    }
    
     
    public StartNetworkServiceInputBuilder setScalingGroup(final List<ScalingGroup> value) {
        this._scalingGroup = value;
        return this;
    }
    
     
    public StartNetworkServiceInputBuilder setVnfdPlacementGroupMaps(final List<VnfdPlacementGroupMaps> value) {
        this._vnfdPlacementGroupMaps = value;
        return this;
    }
    
    public StartNetworkServiceInputBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.StartNetworkServiceInput>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.StartNetworkServiceInput> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public StartNetworkServiceInputBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.StartNetworkServiceInput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public StartNetworkServiceInput build() {
        return new StartNetworkServiceInputImpl(this);
    }

    private static final class StartNetworkServiceInputImpl implements StartNetworkServiceInput {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.StartNetworkServiceInput> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.nsr.rev170208.StartNetworkServiceInput.class;
        }

        private final List<InputParameter> _inputParameter;
        private final java.lang.String _name;
        private final java.lang.Object _nsdIdRef;
        private final List<NsdPlacementGroupMaps> _nsdPlacementGroupMaps;
        private final java.lang.String _projectName;
        private final List<ScalingGroup> _scalingGroup;
        private final List<VnfdPlacementGroupMaps> _vnfdPlacementGroupMaps;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.StartNetworkServiceInput>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.StartNetworkServiceInput>> augmentation = Collections.emptyMap();

        private StartNetworkServiceInputImpl(StartNetworkServiceInputBuilder base) {
            this._inputParameter = base.getInputParameter();
            this._name = base.getName();
            this._nsdIdRef = base.getNsdIdRef();
            this._nsdPlacementGroupMaps = base.getNsdPlacementGroupMaps();
            this._projectName = base.getProjectName();
            this._scalingGroup = base.getScalingGroup();
            this._vnfdPlacementGroupMaps = base.getVnfdPlacementGroupMaps();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.StartNetworkServiceInput>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.StartNetworkServiceInput>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.StartNetworkServiceInput>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.StartNetworkServiceInput>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<InputParameter> getInputParameter() {
            return _inputParameter;
        }
        
        @Override
        public java.lang.String getName() {
            return _name;
        }
        
        @Override
        public java.lang.Object getNsdIdRef() {
            return _nsdIdRef;
        }
        
        @Override
        public List<NsdPlacementGroupMaps> getNsdPlacementGroupMaps() {
            return _nsdPlacementGroupMaps;
        }
        
        @Override
        public java.lang.String getProjectName() {
            return _projectName;
        }
        
        @Override
        public List<ScalingGroup> getScalingGroup() {
            return _scalingGroup;
        }
        
        @Override
        public List<VnfdPlacementGroupMaps> getVnfdPlacementGroupMaps() {
            return _vnfdPlacementGroupMaps;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.StartNetworkServiceInput>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_inputParameter);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_nsdIdRef);
            result = prime * result + Objects.hashCode(_nsdPlacementGroupMaps);
            result = prime * result + Objects.hashCode(_projectName);
            result = prime * result + Objects.hashCode(_scalingGroup);
            result = prime * result + Objects.hashCode(_vnfdPlacementGroupMaps);
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
            if (!ietf.params.xml.ns.yang.nfvo.nsr.rev170208.StartNetworkServiceInput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.nsr.rev170208.StartNetworkServiceInput other = (ietf.params.xml.ns.yang.nfvo.nsr.rev170208.StartNetworkServiceInput)obj;
            if (!Objects.equals(_inputParameter, other.getInputParameter())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_nsdIdRef, other.getNsdIdRef())) {
                return false;
            }
            if (!Objects.equals(_nsdPlacementGroupMaps, other.getNsdPlacementGroupMaps())) {
                return false;
            }
            if (!Objects.equals(_projectName, other.getProjectName())) {
                return false;
            }
            if (!Objects.equals(_scalingGroup, other.getScalingGroup())) {
                return false;
            }
            if (!Objects.equals(_vnfdPlacementGroupMaps, other.getVnfdPlacementGroupMaps())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                StartNetworkServiceInputImpl otherImpl = (StartNetworkServiceInputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.StartNetworkServiceInput>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.StartNetworkServiceInput>> e : augmentation.entrySet()) {
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
            java.lang.String name = "StartNetworkServiceInput [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_inputParameter != null) {
                builder.append("_inputParameter=");
                builder.append(_inputParameter);
                builder.append(", ");
            }
            if (_name != null) {
                builder.append("_name=");
                builder.append(_name);
                builder.append(", ");
            }
            if (_nsdIdRef != null) {
                builder.append("_nsdIdRef=");
                builder.append(_nsdIdRef);
                builder.append(", ");
            }
            if (_nsdPlacementGroupMaps != null) {
                builder.append("_nsdPlacementGroupMaps=");
                builder.append(_nsdPlacementGroupMaps);
                builder.append(", ");
            }
            if (_projectName != null) {
                builder.append("_projectName=");
                builder.append(_projectName);
                builder.append(", ");
            }
            if (_scalingGroup != null) {
                builder.append("_scalingGroup=");
                builder.append(_scalingGroup);
                builder.append(", ");
            }
            if (_vnfdPlacementGroupMaps != null) {
                builder.append("_vnfdPlacementGroupMaps=");
                builder.append(_vnfdPlacementGroupMaps);
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
