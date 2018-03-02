package ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.l2.termination.point.attributes.l2.termination.point.type;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.Vlan;
import ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.l2.termination.point.attributes.l2.termination.point.type.ethernet.VlanIdName;
import ietf.params.xml.ns.yang.ietf.yang.types.rev130715.MacAddress;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.l2.termination.point.attributes.l2.termination.point.type.Ethernet} instances.
 * 
 * @see ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.l2.termination.point.attributes.l2.termination.point.type.Ethernet
 *
 */
public class EthernetBuilder implements Builder<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.l2.termination.point.attributes.l2.termination.point.type.Ethernet> {

    private java.lang.Class<? extends ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.EthEncapsulationType> _ethEncapsulation;
    private MacAddress _macAddress;
    private Vlan _portVlanId;
    private List<VlanIdName> _vlanIdName;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.l2.termination.point.attributes.l2.termination.point.type.Ethernet>>, Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.l2.termination.point.attributes.l2.termination.point.type.Ethernet>> augmentation = Collections.emptyMap();

    public EthernetBuilder() {
    }

    public EthernetBuilder(Ethernet base) {
        this._ethEncapsulation = base.getEthEncapsulation();
        this._macAddress = base.getMacAddress();
        this._portVlanId = base.getPortVlanId();
        this._vlanIdName = base.getVlanIdName();
        if (base instanceof EthernetImpl) {
            EthernetImpl impl = (EthernetImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.l2.termination.point.attributes.l2.termination.point.type.Ethernet> casted =(AugmentationHolder<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.l2.termination.point.attributes.l2.termination.point.type.Ethernet>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public java.lang.Class<? extends ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.EthEncapsulationType> getEthEncapsulation() {
        return _ethEncapsulation;
    }
    
    public MacAddress getMacAddress() {
        return _macAddress;
    }
    
    public Vlan getPortVlanId() {
        return _portVlanId;
    }
    
    public List<VlanIdName> getVlanIdName() {
        return _vlanIdName;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.l2.termination.point.attributes.l2.termination.point.type.Ethernet>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public EthernetBuilder setEthEncapsulation(final java.lang.Class<? extends ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.EthEncapsulationType> value) {
        this._ethEncapsulation = value;
        return this;
    }
    
     
    public EthernetBuilder setMacAddress(final MacAddress value) {
        this._macAddress = value;
        return this;
    }
    
     
    public EthernetBuilder setPortVlanId(final Vlan value) {
        this._portVlanId = value;
        return this;
    }
    
     
    public EthernetBuilder setVlanIdName(final List<VlanIdName> value) {
        this._vlanIdName = value;
        return this;
    }
    
    public EthernetBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.l2.termination.point.attributes.l2.termination.point.type.Ethernet>> augmentationType, Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.l2.termination.point.attributes.l2.termination.point.type.Ethernet> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public EthernetBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.l2.termination.point.attributes.l2.termination.point.type.Ethernet>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Ethernet build() {
        return new EthernetImpl(this);
    }

    private static final class EthernetImpl implements Ethernet {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.l2.termination.point.attributes.l2.termination.point.type.Ethernet> getImplementedInterface() {
            return ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.l2.termination.point.attributes.l2.termination.point.type.Ethernet.class;
        }

        private final java.lang.Class<? extends ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.EthEncapsulationType> _ethEncapsulation;
        private final MacAddress _macAddress;
        private final Vlan _portVlanId;
        private final List<VlanIdName> _vlanIdName;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.l2.termination.point.attributes.l2.termination.point.type.Ethernet>>, Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.l2.termination.point.attributes.l2.termination.point.type.Ethernet>> augmentation = Collections.emptyMap();

        private EthernetImpl(EthernetBuilder base) {
            this._ethEncapsulation = base.getEthEncapsulation();
            this._macAddress = base.getMacAddress();
            this._portVlanId = base.getPortVlanId();
            this._vlanIdName = base.getVlanIdName();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.l2.termination.point.attributes.l2.termination.point.type.Ethernet>>, Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.l2.termination.point.attributes.l2.termination.point.type.Ethernet>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.l2.termination.point.attributes.l2.termination.point.type.Ethernet>>, Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.l2.termination.point.attributes.l2.termination.point.type.Ethernet>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Class<? extends ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.EthEncapsulationType> getEthEncapsulation() {
            return _ethEncapsulation;
        }
        
        @Override
        public MacAddress getMacAddress() {
            return _macAddress;
        }
        
        @Override
        public Vlan getPortVlanId() {
            return _portVlanId;
        }
        
        @Override
        public List<VlanIdName> getVlanIdName() {
            return _vlanIdName;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.l2.termination.point.attributes.l2.termination.point.type.Ethernet>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_ethEncapsulation);
            result = prime * result + Objects.hashCode(_macAddress);
            result = prime * result + Objects.hashCode(_portVlanId);
            result = prime * result + Objects.hashCode(_vlanIdName);
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
            if (!ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.l2.termination.point.attributes.l2.termination.point.type.Ethernet.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.l2.termination.point.attributes.l2.termination.point.type.Ethernet other = (ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.l2.termination.point.attributes.l2.termination.point.type.Ethernet)obj;
            if (!Objects.equals(_ethEncapsulation, other.getEthEncapsulation())) {
                return false;
            }
            if (!Objects.equals(_macAddress, other.getMacAddress())) {
                return false;
            }
            if (!Objects.equals(_portVlanId, other.getPortVlanId())) {
                return false;
            }
            if (!Objects.equals(_vlanIdName, other.getVlanIdName())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                EthernetImpl otherImpl = (EthernetImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.l2.termination.point.attributes.l2.termination.point.type.Ethernet>>, Augmentation<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.l2.termination.point.attributes.l2.termination.point.type.Ethernet>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Ethernet [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_ethEncapsulation != null) {
                builder.append("_ethEncapsulation=");
                builder.append(_ethEncapsulation);
                builder.append(", ");
            }
            if (_macAddress != null) {
                builder.append("_macAddress=");
                builder.append(_macAddress);
                builder.append(", ");
            }
            if (_portVlanId != null) {
                builder.append("_portVlanId=");
                builder.append(_portVlanId);
                builder.append(", ");
            }
            if (_vlanIdName != null) {
                builder.append("_vlanIdName=");
                builder.append(_vlanIdName);
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
