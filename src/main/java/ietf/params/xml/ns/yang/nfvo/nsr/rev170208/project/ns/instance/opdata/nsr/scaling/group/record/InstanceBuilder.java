package ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.scaling.group.record;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ConfigStates;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.scaling.group.record.Instance.OpStatus;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.scaling.group.record.Instance} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.scaling.group.record.Instance
 *
 */
public class InstanceBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.scaling.group.record.Instance> {

    private ConfigStates _configStatus;
    private java.lang.Long _createTime;
    private java.lang.String _errorMsg;
    private java.lang.Integer _instanceId;
    private InstanceKey _key;
    private OpStatus _opStatus;
    private List<java.lang.String> _vnfrs;
    private java.lang.Boolean _isDefault;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.scaling.group.record.Instance>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.scaling.group.record.Instance>> augmentation = Collections.emptyMap();

    public InstanceBuilder() {
    }

    public InstanceBuilder(Instance base) {
        if (base.getKey() == null) {
            this._key = new InstanceKey(
                base.getInstanceId()
            );
            this._instanceId = base.getInstanceId();
        } else {
            this._key = base.getKey();
            this._instanceId = _key.getInstanceId();
        }
        this._configStatus = base.getConfigStatus();
        this._createTime = base.getCreateTime();
        this._errorMsg = base.getErrorMsg();
        this._opStatus = base.getOpStatus();
        this._vnfrs = base.getVnfrs();
        this._isDefault = base.isIsDefault();
        if (base instanceof InstanceImpl) {
            InstanceImpl impl = (InstanceImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.scaling.group.record.Instance> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.scaling.group.record.Instance>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public ConfigStates getConfigStatus() {
        return _configStatus;
    }
    
    public java.lang.Long getCreateTime() {
        return _createTime;
    }
    
    public java.lang.String getErrorMsg() {
        return _errorMsg;
    }
    
    public java.lang.Integer getInstanceId() {
        return _instanceId;
    }
    
    public InstanceKey getKey() {
        return _key;
    }
    
    public OpStatus getOpStatus() {
        return _opStatus;
    }
    
    public List<java.lang.String> getVnfrs() {
        return _vnfrs;
    }
    
    public java.lang.Boolean isIsDefault() {
        return _isDefault;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.scaling.group.record.Instance>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public InstanceBuilder setConfigStatus(final ConfigStates value) {
        this._configStatus = value;
        return this;
    }
    
     
     private static void checkCreateTimeRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..4294967295]].", value));
     }
    
    public InstanceBuilder setCreateTime(final java.lang.Long value) {
    if (value != null) {
        checkCreateTimeRange(value);
    }
        this._createTime = value;
        return this;
    }
    
     
    public InstanceBuilder setErrorMsg(final java.lang.String value) {
        this._errorMsg = value;
        return this;
    }
    
     
     private static void checkInstanceIdRange(final int value) {
         if (value >= 0 && value <= 65535) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..65535]].", value));
     }
    
    public InstanceBuilder setInstanceId(final java.lang.Integer value) {
    if (value != null) {
        checkInstanceIdRange(value);
    }
        this._instanceId = value;
        return this;
    }
    
     
    public InstanceBuilder setKey(final InstanceKey value) {
        this._key = value;
        return this;
    }
    
     
    public InstanceBuilder setOpStatus(final OpStatus value) {
        this._opStatus = value;
        return this;
    }
    
     
    public InstanceBuilder setVnfrs(final List<java.lang.String> value) {
        this._vnfrs = value;
        return this;
    }
    
     
    public InstanceBuilder setIsDefault(final java.lang.Boolean value) {
        this._isDefault = value;
        return this;
    }
    
    public InstanceBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.scaling.group.record.Instance>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.scaling.group.record.Instance> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public InstanceBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.scaling.group.record.Instance>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Instance build() {
        return new InstanceImpl(this);
    }

    private static final class InstanceImpl implements Instance {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.scaling.group.record.Instance> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.scaling.group.record.Instance.class;
        }

        private final ConfigStates _configStatus;
        private final java.lang.Long _createTime;
        private final java.lang.String _errorMsg;
        private final java.lang.Integer _instanceId;
        private final InstanceKey _key;
        private final OpStatus _opStatus;
        private final List<java.lang.String> _vnfrs;
        private final java.lang.Boolean _isDefault;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.scaling.group.record.Instance>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.scaling.group.record.Instance>> augmentation = Collections.emptyMap();

        private InstanceImpl(InstanceBuilder base) {
            if (base.getKey() == null) {
                this._key = new InstanceKey(
                    base.getInstanceId()
                );
                this._instanceId = base.getInstanceId();
            } else {
                this._key = base.getKey();
                this._instanceId = _key.getInstanceId();
            }
            this._configStatus = base.getConfigStatus();
            this._createTime = base.getCreateTime();
            this._errorMsg = base.getErrorMsg();
            this._opStatus = base.getOpStatus();
            this._vnfrs = base.getVnfrs();
            this._isDefault = base.isIsDefault();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.scaling.group.record.Instance>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.scaling.group.record.Instance>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.scaling.group.record.Instance>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.scaling.group.record.Instance>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public ConfigStates getConfigStatus() {
            return _configStatus;
        }
        
        @Override
        public java.lang.Long getCreateTime() {
            return _createTime;
        }
        
        @Override
        public java.lang.String getErrorMsg() {
            return _errorMsg;
        }
        
        @Override
        public java.lang.Integer getInstanceId() {
            return _instanceId;
        }
        
        @Override
        public InstanceKey getKey() {
            return _key;
        }
        
        @Override
        public OpStatus getOpStatus() {
            return _opStatus;
        }
        
        @Override
        public List<java.lang.String> getVnfrs() {
            return _vnfrs;
        }
        
        @Override
        public java.lang.Boolean isIsDefault() {
            return _isDefault;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.scaling.group.record.Instance>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_configStatus);
            result = prime * result + Objects.hashCode(_createTime);
            result = prime * result + Objects.hashCode(_errorMsg);
            result = prime * result + Objects.hashCode(_instanceId);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_opStatus);
            result = prime * result + Objects.hashCode(_vnfrs);
            result = prime * result + Objects.hashCode(_isDefault);
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
            if (!ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.scaling.group.record.Instance.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.scaling.group.record.Instance other = (ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.scaling.group.record.Instance)obj;
            if (!Objects.equals(_configStatus, other.getConfigStatus())) {
                return false;
            }
            if (!Objects.equals(_createTime, other.getCreateTime())) {
                return false;
            }
            if (!Objects.equals(_errorMsg, other.getErrorMsg())) {
                return false;
            }
            if (!Objects.equals(_instanceId, other.getInstanceId())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_opStatus, other.getOpStatus())) {
                return false;
            }
            if (!Objects.equals(_vnfrs, other.getVnfrs())) {
                return false;
            }
            if (!Objects.equals(_isDefault, other.isIsDefault())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                InstanceImpl otherImpl = (InstanceImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.scaling.group.record.Instance>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.scaling.group.record.Instance>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Instance [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_configStatus != null) {
                builder.append("_configStatus=");
                builder.append(_configStatus);
                builder.append(", ");
            }
            if (_createTime != null) {
                builder.append("_createTime=");
                builder.append(_createTime);
                builder.append(", ");
            }
            if (_errorMsg != null) {
                builder.append("_errorMsg=");
                builder.append(_errorMsg);
                builder.append(", ");
            }
            if (_instanceId != null) {
                builder.append("_instanceId=");
                builder.append(_instanceId);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_opStatus != null) {
                builder.append("_opStatus=");
                builder.append(_opStatus);
                builder.append(", ");
            }
            if (_vnfrs != null) {
                builder.append("_vnfrs=");
                builder.append(_vnfrs);
                builder.append(", ");
            }
            if (_isDefault != null) {
                builder.append("_isDefault=");
                builder.append(_isDefault);
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
