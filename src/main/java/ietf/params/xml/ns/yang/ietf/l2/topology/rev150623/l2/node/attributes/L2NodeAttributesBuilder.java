package ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.node.attributes;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;
import ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.TrillNickname;
import ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.Vlan;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.node.attributes.L2NodeAttributes} instances.
 * 
 * @see ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.node.attributes.L2NodeAttributes
 *
 */
public class L2NodeAttributesBuilder implements Builder<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.node.attributes.L2NodeAttributes> {

    private java.lang.String _description;
    private List<java.lang.Class<? extends ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.FlagIdentity>> _flag;
    private List<IpAddress> _managementAddress;
    private Vlan _managementVid;
    private java.lang.String _name;
    private List<TrillNickname> _nickName;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.node.attributes.L2NodeAttributes>>, Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.node.attributes.L2NodeAttributes>> augmentation = Collections.emptyMap();

    public L2NodeAttributesBuilder() {
    }

    public L2NodeAttributesBuilder(L2NodeAttributes base) {
        this._description = base.getDescription();
        this._flag = base.getFlag();
        this._managementAddress = base.getManagementAddress();
        this._managementVid = base.getManagementVid();
        this._name = base.getName();
        this._nickName = base.getNickName();
        if (base instanceof L2NodeAttributesImpl) {
            L2NodeAttributesImpl impl = (L2NodeAttributesImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.node.attributes.L2NodeAttributes> casted =(AugmentationHolder<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.node.attributes.L2NodeAttributes>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public java.lang.String getDescription() {
        return _description;
    }
    
    public List<java.lang.Class<? extends ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.FlagIdentity>> getFlag() {
        return _flag;
    }
    
    public List<IpAddress> getManagementAddress() {
        return _managementAddress;
    }
    
    public Vlan getManagementVid() {
        return _managementVid;
    }
    
    public java.lang.String getName() {
        return _name;
    }
    
    public List<TrillNickname> getNickName() {
        return _nickName;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.node.attributes.L2NodeAttributes>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public L2NodeAttributesBuilder setDescription(final java.lang.String value) {
        this._description = value;
        return this;
    }
    
     
    public L2NodeAttributesBuilder setFlag(final List<java.lang.Class<? extends ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.FlagIdentity>> value) {
        this._flag = value;
        return this;
    }
    
     
    public L2NodeAttributesBuilder setManagementAddress(final List<IpAddress> value) {
        this._managementAddress = value;
        return this;
    }
    
     
    public L2NodeAttributesBuilder setManagementVid(final Vlan value) {
        this._managementVid = value;
        return this;
    }
    
     
    public L2NodeAttributesBuilder setName(final java.lang.String value) {
        this._name = value;
        return this;
    }
    
     
    public L2NodeAttributesBuilder setNickName(final List<TrillNickname> value) {
        this._nickName = value;
        return this;
    }
    
    public L2NodeAttributesBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.node.attributes.L2NodeAttributes>> augmentationType, Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.node.attributes.L2NodeAttributes> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public L2NodeAttributesBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.node.attributes.L2NodeAttributes>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public L2NodeAttributes build() {
        return new L2NodeAttributesImpl(this);
    }

    private static final class L2NodeAttributesImpl implements L2NodeAttributes {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.node.attributes.L2NodeAttributes> getImplementedInterface() {
            return ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.node.attributes.L2NodeAttributes.class;
        }

        private final java.lang.String _description;
        private final List<java.lang.Class<? extends ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.FlagIdentity>> _flag;
        private final List<IpAddress> _managementAddress;
        private final Vlan _managementVid;
        private final java.lang.String _name;
        private final List<TrillNickname> _nickName;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.node.attributes.L2NodeAttributes>>, Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.node.attributes.L2NodeAttributes>> augmentation = Collections.emptyMap();

        private L2NodeAttributesImpl(L2NodeAttributesBuilder base) {
            this._description = base.getDescription();
            this._flag = base.getFlag();
            this._managementAddress = base.getManagementAddress();
            this._managementVid = base.getManagementVid();
            this._name = base.getName();
            this._nickName = base.getNickName();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.node.attributes.L2NodeAttributes>>, Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.node.attributes.L2NodeAttributes>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.node.attributes.L2NodeAttributes>>, Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.node.attributes.L2NodeAttributes>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getDescription() {
            return _description;
        }
        
        @Override
        public List<java.lang.Class<? extends ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.FlagIdentity>> getFlag() {
            return _flag;
        }
        
        @Override
        public List<IpAddress> getManagementAddress() {
            return _managementAddress;
        }
        
        @Override
        public Vlan getManagementVid() {
            return _managementVid;
        }
        
        @Override
        public java.lang.String getName() {
            return _name;
        }
        
        @Override
        public List<TrillNickname> getNickName() {
            return _nickName;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.node.attributes.L2NodeAttributes>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_description);
            result = prime * result + Objects.hashCode(_flag);
            result = prime * result + Objects.hashCode(_managementAddress);
            result = prime * result + Objects.hashCode(_managementVid);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_nickName);
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
            if (!ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.node.attributes.L2NodeAttributes.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.node.attributes.L2NodeAttributes other = (ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.node.attributes.L2NodeAttributes)obj;
            if (!Objects.equals(_description, other.getDescription())) {
                return false;
            }
            if (!Objects.equals(_flag, other.getFlag())) {
                return false;
            }
            if (!Objects.equals(_managementAddress, other.getManagementAddress())) {
                return false;
            }
            if (!Objects.equals(_managementVid, other.getManagementVid())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_nickName, other.getNickName())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                L2NodeAttributesImpl otherImpl = (L2NodeAttributesImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.node.attributes.L2NodeAttributes>>, Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.node.attributes.L2NodeAttributes>> e : augmentation.entrySet()) {
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
            java.lang.String name = "L2NodeAttributes [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_description != null) {
                builder.append("_description=");
                builder.append(_description);
                builder.append(", ");
            }
            if (_flag != null) {
                builder.append("_flag=");
                builder.append(_flag);
                builder.append(", ");
            }
            if (_managementAddress != null) {
                builder.append("_managementAddress=");
                builder.append(_managementAddress);
                builder.append(", ");
            }
            if (_managementVid != null) {
                builder.append("_managementVid=");
                builder.append(_managementVid);
                builder.append(", ");
            }
            if (_name != null) {
                builder.append("_name=");
                builder.append(_name);
                builder.append(", ");
            }
            if (_nickName != null) {
                builder.append("_nickName=");
                builder.append(_nickName);
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
