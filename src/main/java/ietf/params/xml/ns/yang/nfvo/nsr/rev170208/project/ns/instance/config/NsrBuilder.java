package ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.config;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.input.parameter.InputParameter;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.cloud.config.SshAuthorizedKey;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.cloud.config.User;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.VnfdPlacementGroupMaps;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.NsdPlacementGroupMaps;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.ScalingGroup;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.config.Nsr.AdminStatus;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.config.nsr.Nsd;

import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.config.Nsr} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.config.Nsr
 *
 */
public class NsrBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.config.Nsr> {

    private AdminStatus _adminStatus;
    private java.lang.String _description;
    private Uuid _id;
    private List<InputParameter> _inputParameter;
    private NsrKey _key;
    private java.lang.String _name;
    private Nsd _nsd;
    private List<NsdPlacementGroupMaps> _nsdPlacementGroupMaps;
    private List<ScalingGroup> _scalingGroup;
    private java.lang.String _schemaVersion;
    private java.lang.String _shortName;
    private List<SshAuthorizedKey> _sshAuthorizedKey;
    private List<User> _user;
    private List<VnfdPlacementGroupMaps> _vnfdPlacementGroupMaps;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.config.Nsr>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.config.Nsr>> augmentation = Collections.emptyMap();

    public NsrBuilder() {
    }
    public NsrBuilder(ietf.params.xml.ns.yang.nfvo.nsr.rev170208.NsInstanceConfigParams arg) {
        this._vnfdPlacementGroupMaps = arg.getVnfdPlacementGroupMaps();
        this._scalingGroup = arg.getScalingGroup();
        this._nsdPlacementGroupMaps = arg.getNsdPlacementGroupMaps();
        this._inputParameter = arg.getInputParameter();
        this._sshAuthorizedKey = arg.getSshAuthorizedKey();
        this._user = arg.getUser();
    }
    public NsrBuilder(ietf.params.xml.ns.yang.nfvo.nsr.rev170208.NsInstanceConfigParamsCommon arg) {
        this._scalingGroup = arg.getScalingGroup();
        this._nsdPlacementGroupMaps = arg.getNsdPlacementGroupMaps();
        this._inputParameter = arg.getInputParameter();
    }
    public NsrBuilder(ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.InputParameter arg) {
        this._inputParameter = arg.getInputParameter();
    }
    public NsrBuilder(ietf.params.xml.ns.yang.nfvo.nsr.rev170208.CloudConfig arg) {
        this._sshAuthorizedKey = arg.getSshAuthorizedKey();
        this._user = arg.getUser();
    }

    public NsrBuilder(Nsr base) {
        if (base.getKey() == null) {
            this._key = new NsrKey(
                base.getId()
            );
            this._id = base.getId();
        } else {
            this._key = base.getKey();
            this._id = _key.getId();
        }
        this._adminStatus = base.getAdminStatus();
        this._description = base.getDescription();
        this._inputParameter = base.getInputParameter();
        this._name = base.getName();
        this._nsd = base.getNsd();
        this._nsdPlacementGroupMaps = base.getNsdPlacementGroupMaps();
        this._scalingGroup = base.getScalingGroup();
        this._schemaVersion = base.getSchemaVersion();
        this._shortName = base.getShortName();
        this._sshAuthorizedKey = base.getSshAuthorizedKey();
        this._user = base.getUser();
        this._vnfdPlacementGroupMaps = base.getVnfdPlacementGroupMaps();
        if (base instanceof NsrImpl) {
            NsrImpl impl = (NsrImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.config.Nsr> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.config.Nsr>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.InputParameter</li>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.NsInstanceConfigParams</li>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.CloudConfig</li>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.NsInstanceConfigParamsCommon</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.InputParameter) {
            this._inputParameter = ((ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.InputParameter)arg).getInputParameter();
            isValidArg = true;
        }
        if (arg instanceof ietf.params.xml.ns.yang.nfvo.nsr.rev170208.NsInstanceConfigParams) {
            this._vnfdPlacementGroupMaps = ((ietf.params.xml.ns.yang.nfvo.nsr.rev170208.NsInstanceConfigParams)arg).getVnfdPlacementGroupMaps();
            isValidArg = true;
        }
        if (arg instanceof ietf.params.xml.ns.yang.nfvo.nsr.rev170208.CloudConfig) {
            this._sshAuthorizedKey = ((ietf.params.xml.ns.yang.nfvo.nsr.rev170208.CloudConfig)arg).getSshAuthorizedKey();
            this._user = ((ietf.params.xml.ns.yang.nfvo.nsr.rev170208.CloudConfig)arg).getUser();
            isValidArg = true;
        }
        if (arg instanceof ietf.params.xml.ns.yang.nfvo.nsr.rev170208.NsInstanceConfigParamsCommon) {
            this._scalingGroup = ((ietf.params.xml.ns.yang.nfvo.nsr.rev170208.NsInstanceConfigParamsCommon)arg).getScalingGroup();
            this._nsdPlacementGroupMaps = ((ietf.params.xml.ns.yang.nfvo.nsr.rev170208.NsInstanceConfigParamsCommon)arg).getNsdPlacementGroupMaps();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.InputParameter, org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.NsInstanceConfigParams, org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.CloudConfig, org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.NsInstanceConfigParamsCommon] \n" +
              "but was: " + arg
            );
        }
    }

    public AdminStatus getAdminStatus() {
        return _adminStatus;
    }
    
    public java.lang.String getDescription() {
        return _description;
    }
    
    public Uuid getId() {
        return _id;
    }
    
    public List<InputParameter> getInputParameter() {
        return _inputParameter;
    }
    
    public NsrKey getKey() {
        return _key;
    }
    
    public java.lang.String getName() {
        return _name;
    }
    
    public Nsd getNsd() {
        return _nsd;
    }
    
    public List<NsdPlacementGroupMaps> getNsdPlacementGroupMaps() {
        return _nsdPlacementGroupMaps;
    }
    
    public List<ScalingGroup> getScalingGroup() {
        return _scalingGroup;
    }
    
    public java.lang.String getSchemaVersion() {
        return _schemaVersion;
    }
    
    public java.lang.String getShortName() {
        return _shortName;
    }
    
    public List<SshAuthorizedKey> getSshAuthorizedKey() {
        return _sshAuthorizedKey;
    }
    
    public List<User> getUser() {
        return _user;
    }
    
    public List<VnfdPlacementGroupMaps> getVnfdPlacementGroupMaps() {
        return _vnfdPlacementGroupMaps;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.config.Nsr>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public NsrBuilder setAdminStatus(final AdminStatus value) {
        this._adminStatus = value;
        return this;
    }
    
     
    public NsrBuilder setDescription(final java.lang.String value) {
        this._description = value;
        return this;
    }
    
     
    public NsrBuilder setId(final Uuid value) {
        this._id = value;
        return this;
    }
    
     
    public NsrBuilder setInputParameter(final List<InputParameter> value) {
        this._inputParameter = value;
        return this;
    }
    
     
    public NsrBuilder setKey(final NsrKey value) {
        this._key = value;
        return this;
    }
    
     
    public NsrBuilder setName(final java.lang.String value) {
        this._name = value;
        return this;
    }
    
     
    public NsrBuilder setNsd(final Nsd value) {
        this._nsd = value;
        return this;
    }
    
     
    public NsrBuilder setNsdPlacementGroupMaps(final List<NsdPlacementGroupMaps> value) {
        this._nsdPlacementGroupMaps = value;
        return this;
    }
    
     
    public NsrBuilder setScalingGroup(final List<ScalingGroup> value) {
        this._scalingGroup = value;
        return this;
    }
    
     
    public NsrBuilder setSchemaVersion(final java.lang.String value) {
        this._schemaVersion = value;
        return this;
    }
    
     
    public NsrBuilder setShortName(final java.lang.String value) {
        this._shortName = value;
        return this;
    }
    
     
    public NsrBuilder setSshAuthorizedKey(final List<SshAuthorizedKey> value) {
        this._sshAuthorizedKey = value;
        return this;
    }
    
     
    public NsrBuilder setUser(final List<User> value) {
        this._user = value;
        return this;
    }
    
     
    public NsrBuilder setVnfdPlacementGroupMaps(final List<VnfdPlacementGroupMaps> value) {
        this._vnfdPlacementGroupMaps = value;
        return this;
    }
    
    public NsrBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.config.Nsr>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.config.Nsr> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public NsrBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.config.Nsr>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Nsr build() {
        return new NsrImpl(this);
    }

    private static final class NsrImpl implements Nsr {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.config.Nsr> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.config.Nsr.class;
        }

        private final AdminStatus _adminStatus;
        private final java.lang.String _description;
        private final Uuid _id;
        private final List<InputParameter> _inputParameter;
        private final NsrKey _key;
        private final java.lang.String _name;
        private final Nsd _nsd;
        private final List<NsdPlacementGroupMaps> _nsdPlacementGroupMaps;
        private final List<ScalingGroup> _scalingGroup;
        private final java.lang.String _schemaVersion;
        private final java.lang.String _shortName;
        private final List<SshAuthorizedKey> _sshAuthorizedKey;
        private final List<User> _user;
        private final List<VnfdPlacementGroupMaps> _vnfdPlacementGroupMaps;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.config.Nsr>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.config.Nsr>> augmentation = Collections.emptyMap();

        private NsrImpl(NsrBuilder base) {
            if (base.getKey() == null) {
                this._key = new NsrKey(
                    base.getId()
                );
                this._id = base.getId();
            } else {
                this._key = base.getKey();
                this._id = _key.getId();
            }
            this._adminStatus = base.getAdminStatus();
            this._description = base.getDescription();
            this._inputParameter = base.getInputParameter();
            this._name = base.getName();
            this._nsd = base.getNsd();
            this._nsdPlacementGroupMaps = base.getNsdPlacementGroupMaps();
            this._scalingGroup = base.getScalingGroup();
            this._schemaVersion = base.getSchemaVersion();
            this._shortName = base.getShortName();
            this._sshAuthorizedKey = base.getSshAuthorizedKey();
            this._user = base.getUser();
            this._vnfdPlacementGroupMaps = base.getVnfdPlacementGroupMaps();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.config.Nsr>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.config.Nsr>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.config.Nsr>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.config.Nsr>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public AdminStatus getAdminStatus() {
            return _adminStatus;
        }
        
        @Override
        public java.lang.String getDescription() {
            return _description;
        }
        
        @Override
        public Uuid getId() {
            return _id;
        }
        
        @Override
        public List<InputParameter> getInputParameter() {
            return _inputParameter;
        }
        
        @Override
        public NsrKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.String getName() {
            return _name;
        }
        
        @Override
        public Nsd getNsd() {
            return _nsd;
        }
        
        @Override
        public List<NsdPlacementGroupMaps> getNsdPlacementGroupMaps() {
            return _nsdPlacementGroupMaps;
        }
        
        @Override
        public List<ScalingGroup> getScalingGroup() {
            return _scalingGroup;
        }
        
        @Override
        public java.lang.String getSchemaVersion() {
            return _schemaVersion;
        }
        
        @Override
        public java.lang.String getShortName() {
            return _shortName;
        }
        
        @Override
        public List<SshAuthorizedKey> getSshAuthorizedKey() {
            return _sshAuthorizedKey;
        }
        
        @Override
        public List<User> getUser() {
            return _user;
        }
        
        @Override
        public List<VnfdPlacementGroupMaps> getVnfdPlacementGroupMaps() {
            return _vnfdPlacementGroupMaps;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.config.Nsr>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_adminStatus);
            result = prime * result + Objects.hashCode(_description);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_inputParameter);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_nsd);
            result = prime * result + Objects.hashCode(_nsdPlacementGroupMaps);
            result = prime * result + Objects.hashCode(_scalingGroup);
            result = prime * result + Objects.hashCode(_schemaVersion);
            result = prime * result + Objects.hashCode(_shortName);
            result = prime * result + Objects.hashCode(_sshAuthorizedKey);
            result = prime * result + Objects.hashCode(_user);
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
            if (!ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.config.Nsr.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.config.Nsr other = (ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.config.Nsr)obj;
            if (!Objects.equals(_adminStatus, other.getAdminStatus())) {
                return false;
            }
            if (!Objects.equals(_description, other.getDescription())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_inputParameter, other.getInputParameter())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_nsd, other.getNsd())) {
                return false;
            }
            if (!Objects.equals(_nsdPlacementGroupMaps, other.getNsdPlacementGroupMaps())) {
                return false;
            }
            if (!Objects.equals(_scalingGroup, other.getScalingGroup())) {
                return false;
            }
            if (!Objects.equals(_schemaVersion, other.getSchemaVersion())) {
                return false;
            }
            if (!Objects.equals(_shortName, other.getShortName())) {
                return false;
            }
            if (!Objects.equals(_sshAuthorizedKey, other.getSshAuthorizedKey())) {
                return false;
            }
            if (!Objects.equals(_user, other.getUser())) {
                return false;
            }
            if (!Objects.equals(_vnfdPlacementGroupMaps, other.getVnfdPlacementGroupMaps())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NsrImpl otherImpl = (NsrImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.config.Nsr>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.config.Nsr>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Nsr [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_adminStatus != null) {
                builder.append("_adminStatus=");
                builder.append(_adminStatus);
                builder.append(", ");
            }
            if (_description != null) {
                builder.append("_description=");
                builder.append(_description);
                builder.append(", ");
            }
            if (_id != null) {
                builder.append("_id=");
                builder.append(_id);
                builder.append(", ");
            }
            if (_inputParameter != null) {
                builder.append("_inputParameter=");
                builder.append(_inputParameter);
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
            if (_nsd != null) {
                builder.append("_nsd=");
                builder.append(_nsd);
                builder.append(", ");
            }
            if (_nsdPlacementGroupMaps != null) {
                builder.append("_nsdPlacementGroupMaps=");
                builder.append(_nsdPlacementGroupMaps);
                builder.append(", ");
            }
            if (_scalingGroup != null) {
                builder.append("_scalingGroup=");
                builder.append(_scalingGroup);
                builder.append(", ");
            }
            if (_schemaVersion != null) {
                builder.append("_schemaVersion=");
                builder.append(_schemaVersion);
                builder.append(", ");
            }
            if (_shortName != null) {
                builder.append("_shortName=");
                builder.append(_shortName);
                builder.append(", ");
            }
            if (_sshAuthorizedKey != null) {
                builder.append("_sshAuthorizedKey=");
                builder.append(_sshAuthorizedKey);
                builder.append(", ");
            }
            if (_user != null) {
                builder.append("_user=");
                builder.append(_user);
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
