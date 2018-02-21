package http.riftio.vnfd.base.rev170228.vnfd.descriptor;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ConnectionPointType;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link http.riftio.vnfd.base.rev170228.vnfd.descriptor.ConnectionPoint} instances.
 * 
 * @see http.riftio.vnfd.base.rev170228.vnfd.descriptor.ConnectionPoint
 *
 */
public class ConnectionPointBuilder implements Builder<http.riftio.vnfd.base.rev170228.vnfd.descriptor.ConnectionPoint> {

    private java.lang.String _id;
    private ConnectionPointKey _key;
    private java.lang.String _name;
    private java.lang.String _shortName;
    private ConnectionPointType _type;
    private java.lang.Boolean _portSecurityEnabled;

    Map<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.ConnectionPoint>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.ConnectionPoint>> augmentation = Collections.emptyMap();

    public ConnectionPointBuilder() {
    }
    public ConnectionPointBuilder(http.riftio.vnfd.base.rev170228.CommonConnectionPoint arg) {
        this._name = arg.getName();
        this._id = arg.getId();
        this._shortName = arg.getShortName();
        this._type = arg.getType();
        this._portSecurityEnabled = arg.isPortSecurityEnabled();
    }

    public ConnectionPointBuilder(ConnectionPoint base) {
        if (base.getKey() == null) {
            this._key = new ConnectionPointKey(
                base.getName()
            );
            this._name = base.getName();
        } else {
            this._key = base.getKey();
            this._name = _key.getName();
        }
        this._id = base.getId();
        this._shortName = base.getShortName();
        this._type = base.getType();
        this._portSecurityEnabled = base.isPortSecurityEnabled();
        if (base instanceof ConnectionPointImpl) {
            ConnectionPointImpl impl = (ConnectionPointImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<http.riftio.vnfd.base.rev170228.vnfd.descriptor.ConnectionPoint> casted =(AugmentationHolder<http.riftio.vnfd.base.rev170228.vnfd.descriptor.ConnectionPoint>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.vnfd.base.rev170228.CommonConnectionPoint</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof http.riftio.vnfd.base.rev170228.CommonConnectionPoint) {
            this._name = ((http.riftio.vnfd.base.rev170228.CommonConnectionPoint)arg).getName();
            this._id = ((http.riftio.vnfd.base.rev170228.CommonConnectionPoint)arg).getId();
            this._shortName = ((http.riftio.vnfd.base.rev170228.CommonConnectionPoint)arg).getShortName();
            this._type = ((http.riftio.vnfd.base.rev170228.CommonConnectionPoint)arg).getType();
            this._portSecurityEnabled = ((http.riftio.vnfd.base.rev170228.CommonConnectionPoint)arg).isPortSecurityEnabled();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.vnfd.base.rev170228.CommonConnectionPoint] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.String getId() {
        return _id;
    }
    
    public ConnectionPointKey getKey() {
        return _key;
    }
    
    public java.lang.String getName() {
        return _name;
    }
    
    public java.lang.String getShortName() {
        return _shortName;
    }
    
    public ConnectionPointType getType() {
        return _type;
    }
    
    public java.lang.Boolean isPortSecurityEnabled() {
        return _portSecurityEnabled;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.ConnectionPoint>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public ConnectionPointBuilder setId(final java.lang.String value) {
        this._id = value;
        return this;
    }
    
     
    public ConnectionPointBuilder setKey(final ConnectionPointKey value) {
        this._key = value;
        return this;
    }
    
     
    public ConnectionPointBuilder setName(final java.lang.String value) {
        this._name = value;
        return this;
    }
    
     
    public ConnectionPointBuilder setShortName(final java.lang.String value) {
        this._shortName = value;
        return this;
    }
    
     
    public ConnectionPointBuilder setType(final ConnectionPointType value) {
        this._type = value;
        return this;
    }
    
     
    public ConnectionPointBuilder setPortSecurityEnabled(final java.lang.Boolean value) {
        this._portSecurityEnabled = value;
        return this;
    }
    
    public ConnectionPointBuilder addAugmentation(java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.ConnectionPoint>> augmentationType, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.ConnectionPoint> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ConnectionPointBuilder removeAugmentation(java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.ConnectionPoint>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ConnectionPoint build() {
        return new ConnectionPointImpl(this);
    }

    private static final class ConnectionPointImpl implements ConnectionPoint {

        @Override
        public java.lang.Class<http.riftio.vnfd.base.rev170228.vnfd.descriptor.ConnectionPoint> getImplementedInterface() {
            return http.riftio.vnfd.base.rev170228.vnfd.descriptor.ConnectionPoint.class;
        }

        private final java.lang.String _id;
        private final ConnectionPointKey _key;
        private final java.lang.String _name;
        private final java.lang.String _shortName;
        private final ConnectionPointType _type;
        private final java.lang.Boolean _portSecurityEnabled;

        private Map<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.ConnectionPoint>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.ConnectionPoint>> augmentation = Collections.emptyMap();

        private ConnectionPointImpl(ConnectionPointBuilder base) {
            if (base.getKey() == null) {
                this._key = new ConnectionPointKey(
                    base.getName()
                );
                this._name = base.getName();
            } else {
                this._key = base.getKey();
                this._name = _key.getName();
            }
            this._id = base.getId();
            this._shortName = base.getShortName();
            this._type = base.getType();
            this._portSecurityEnabled = base.isPortSecurityEnabled();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.ConnectionPoint>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.ConnectionPoint>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.ConnectionPoint>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.ConnectionPoint>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getId() {
            return _id;
        }
        
        @Override
        public ConnectionPointKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.String getName() {
            return _name;
        }
        
        @Override
        public java.lang.String getShortName() {
            return _shortName;
        }
        
        @Override
        public ConnectionPointType getType() {
            return _type;
        }
        
        @Override
        public java.lang.Boolean isPortSecurityEnabled() {
            return _portSecurityEnabled;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.ConnectionPoint>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_shortName);
            result = prime * result + Objects.hashCode(_type);
            result = prime * result + Objects.hashCode(_portSecurityEnabled);
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
            if (!http.riftio.vnfd.base.rev170228.vnfd.descriptor.ConnectionPoint.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            http.riftio.vnfd.base.rev170228.vnfd.descriptor.ConnectionPoint other = (http.riftio.vnfd.base.rev170228.vnfd.descriptor.ConnectionPoint)obj;
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_shortName, other.getShortName())) {
                return false;
            }
            if (!Objects.equals(_type, other.getType())) {
                return false;
            }
            if (!Objects.equals(_portSecurityEnabled, other.isPortSecurityEnabled())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ConnectionPointImpl otherImpl = (ConnectionPointImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.ConnectionPoint>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.ConnectionPoint>> e : augmentation.entrySet()) {
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
            java.lang.String name = "ConnectionPoint [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_id != null) {
                builder.append("_id=");
                builder.append(_id);
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
            if (_shortName != null) {
                builder.append("_shortName=");
                builder.append(_shortName);
                builder.append(", ");
            }
            if (_type != null) {
                builder.append("_type=");
                builder.append(_type);
                builder.append(", ");
            }
            if (_portSecurityEnabled != null) {
                builder.append("_portSecurityEnabled=");
                builder.append(_portSecurityEnabled);
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
