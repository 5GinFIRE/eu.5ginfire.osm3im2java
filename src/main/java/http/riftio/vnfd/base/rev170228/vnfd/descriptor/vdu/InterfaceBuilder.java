package http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import com.fasterxml.jackson.annotation.JsonProperty;

import http.riftio.vnfd.base.rev170228.InterfaceType;
import http.riftio.vnfd.base.rev170228.virtual._interface.VirtualInterface;
import http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.CpBuilder;
import http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.IpBuilder;
import http.riftio.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.endpoint.type.VduIdBuilder;
import http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu._interface.ConnectionPointType;
import http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu._interface.connection.point.type.ExternalBuilder;
import http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu._interface.connection.point.type.InternalBuilder;
import ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.VnfdBuilder;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.Interface} instances.
 * 
 * @see http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.Interface
 *
 */
public class InterfaceBuilder implements Builder<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.Interface> {

    private ConnectionPointType _connectionPointType;
    private InterfaceKey _key;
    private java.lang.String _macAddress;
    private java.lang.String _name;
    private java.lang.Long _position;
    private InterfaceType _type;
    @JsonProperty("virtual-interface")
    private VirtualInterface _virtualInterface;

    Map<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.Interface>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.Interface>> augmentation = Collections.emptyMap();

    public InterfaceBuilder() {
    }
    public InterfaceBuilder(http.riftio.vnfd.base.rev170228.VirtualInterface arg) {
        this._virtualInterface = arg.getVirtualInterface();
    }

    public InterfaceBuilder(Interface base) {
        if (base.getKey() == null) {
            this._key = new InterfaceKey(
                base.getName()
            );
            this._name = base.getName();
        } else {
            this._key = base.getKey();
            this._name = _key.getName();
        }
        this._connectionPointType = base.getConnectionPointType();
        this._macAddress = base.getMacAddress();
        this._position = base.getPosition();
        this._type = base.getType();
        this._virtualInterface = base.getVirtualInterface();
        if (base instanceof InterfaceImpl) {
            InterfaceImpl impl = (InterfaceImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.Interface> casted =(AugmentationHolder<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.Interface>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.vnfd.base.rev170228.VirtualInterface</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof http.riftio.vnfd.base.rev170228.VirtualInterface) {
            this._virtualInterface = ((http.riftio.vnfd.base.rev170228.VirtualInterface)arg).getVirtualInterface();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.vnfd.base.rev170228.VirtualInterface] \n" +
              "but was: " + arg
            );
        }
    }

    public ConnectionPointType getConnectionPointType() {
        return _connectionPointType;
    }
    
    public InterfaceKey getKey() {
        return _key;
    }
    
    public java.lang.String getMacAddress() {
        return _macAddress;
    }
    
    public java.lang.String getName() {
        return _name;
    }
    
    public java.lang.Long getPosition() {
        return _position;
    }
    
    public InterfaceType getType() {
        return _type;
    }
    
    public VirtualInterface getVirtualInterface() {
        return _virtualInterface;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.Interface>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public InterfaceBuilder setConnectionPointType(final ConnectionPointType value) {
        this._connectionPointType = value;
        return this;
    }
    
     
    public InterfaceBuilder setKey(final InterfaceKey value) {
        this._key = value;
        return this;
    }
    
     
    public InterfaceBuilder setMacAddress(final java.lang.String value) {
        this._macAddress = value;
        return this;
    }
    
     
    public InterfaceBuilder setName(final java.lang.String value) {
        this._name = value;
        return this;
    }
    
     
     private static void checkPositionRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..4294967295]].", value));
     }
    
    public InterfaceBuilder setPosition(final java.lang.Long value) {
    if (value != null) {
        checkPositionRange(value);
    }
        this._position = value;
        return this;
    }
    
     
    public InterfaceBuilder setType(final InterfaceType value) {
        this._type = value;
        return this;
    }
    
     
    public InterfaceBuilder setVirtualInterface(final VirtualInterface value) {
        this._virtualInterface = value;
        return this;
    }
    
    public InterfaceBuilder addAugmentation(java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.Interface>> augmentationType, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.Interface> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public InterfaceBuilder removeAugmentation(java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.Interface>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Interface build() {
        return new InterfaceImpl(this);
    }

    public static final class InterfaceImpl implements Interface {

        @Override
        public java.lang.Class<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.Interface> getImplementedInterface() {
            return http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.Interface.class;
        }

        @JsonProperty("connection-point-type")
        private ConnectionPointType _connectionPointType;
        private final InterfaceKey _key;
        private final java.lang.String _macAddress;
        @JsonProperty("name")
        private final java.lang.String _name;
        @JsonProperty("position")
        private final java.lang.Long _position;
        @JsonProperty("type")
        private final InterfaceType _type;
        @JsonProperty("virtual-interface")
        private final VirtualInterface _virtualInterface;

        private Map<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.Interface>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.Interface>> augmentation = Collections.emptyMap();

        private InterfaceImpl(InterfaceBuilder base) {
            if (base.getKey() == null) {
                this._key = new InterfaceKey(
                    base.getName()
                );
                this._name = base.getName();
            } else {
                this._key = base.getKey();
                this._name = _key.getName();
            }
            this._connectionPointType = base.getConnectionPointType();
            this._macAddress = base.getMacAddress();
            this._position = base.getPosition();
            this._type = base.getType();
            this._virtualInterface = base.getVirtualInterface();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.Interface>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.Interface>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.Interface>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.Interface>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }
        
        public InterfaceImpl(){
          	this( new InterfaceBuilder() );
        }
        
        @JsonProperty("external-connection-point-ref")
        public void setVduidAsEndpointType(String s){
        	_connectionPointType = (new ExternalBuilder().setExternalConnectionPointRef(s)).build() ;
        }
        
        @JsonProperty("internal-connection-point-ref")
        public void setCPAsEndpointType(String s){
        	_connectionPointType = (new InternalBuilder().setInternalConnectionPointRef(s)).build() ;
        }

        @Override
        public ConnectionPointType getConnectionPointType() {
            return _connectionPointType;
        }
        
        @Override
        public InterfaceKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.String getMacAddress() {
            return _macAddress;
        }
        
        @Override
        public java.lang.String getName() {
            return _name;
        }
        
        @Override
        public java.lang.Long getPosition() {
            return _position;
        }
        
        @Override
        public InterfaceType getType() {
            return _type;
        }
        
        @Override
        public VirtualInterface getVirtualInterface() {
            return _virtualInterface;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.Interface>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_connectionPointType);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_macAddress);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_position);
            result = prime * result + Objects.hashCode(_type);
            result = prime * result + Objects.hashCode(_virtualInterface);
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
            if (!http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.Interface.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.Interface other = (http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.Interface)obj;
            if (!Objects.equals(_connectionPointType, other.getConnectionPointType())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_macAddress, other.getMacAddress())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_position, other.getPosition())) {
                return false;
            }
            if (!Objects.equals(_type, other.getType())) {
                return false;
            }
            if (!Objects.equals(_virtualInterface, other.getVirtualInterface())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                InterfaceImpl otherImpl = (InterfaceImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.Interface>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.Interface>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Interface [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_connectionPointType != null) {
                builder.append("_connectionPointType=");
                builder.append(_connectionPointType);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_macAddress != null) {
                builder.append("_macAddress=");
                builder.append(_macAddress);
                builder.append(", ");
            }
            if (_name != null) {
                builder.append("_name=");
                builder.append(_name);
                builder.append(", ");
            }
            if (_position != null) {
                builder.append("_position=");
                builder.append(_position);
                builder.append(", ");
            }
            if (_type != null) {
                builder.append("_type=");
                builder.append(_type);
                builder.append(", ");
            }
            if (_virtualInterface != null) {
                builder.append("_virtualInterface=");
                builder.append(_virtualInterface);
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
