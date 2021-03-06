package ietf.params.xml.ns.yang.nfvo.mano.rift.groupings.norev.custom.meta.data;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.nfvo.mano.rift.groupings.norev.custom.meta.data.CustomMetaData.Destination;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.MetaDataType;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.mano.rift.groupings.norev.custom.meta.data.CustomMetaData} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.mano.rift.groupings.norev.custom.meta.data.CustomMetaData
 *
 */
public class CustomMetaDataBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.mano.rift.groupings.norev.custom.meta.data.CustomMetaData> {

    private MetaDataType _dataType;
    private Destination _destination;
    private CustomMetaDataKey _key;
    private java.lang.String _name;
    private java.lang.String _value;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.rift.groupings.norev.custom.meta.data.CustomMetaData>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.rift.groupings.norev.custom.meta.data.CustomMetaData>> augmentation = Collections.emptyMap();

    public CustomMetaDataBuilder() {
    }

    public CustomMetaDataBuilder(CustomMetaData base) {
        if (base.getKey() == null) {
            this._key = new CustomMetaDataKey(
                base.getName()
            );
            this._name = base.getName();
        } else {
            this._key = base.getKey();
            this._name = _key.getName();
        }
        this._dataType = base.getDataType();
        this._destination = base.getDestination();
        this._value = base.getValue();
        if (base instanceof CustomMetaDataImpl) {
            CustomMetaDataImpl impl = (CustomMetaDataImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.rift.groupings.norev.custom.meta.data.CustomMetaData> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.rift.groupings.norev.custom.meta.data.CustomMetaData>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public MetaDataType getDataType() {
        return _dataType;
    }
    
    public Destination getDestination() {
        return _destination;
    }
    
    public CustomMetaDataKey getKey() {
        return _key;
    }
    
    public java.lang.String getName() {
        return _name;
    }
    
    public java.lang.String getValue() {
        return _value;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.rift.groupings.norev.custom.meta.data.CustomMetaData>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public CustomMetaDataBuilder setDataType(final MetaDataType value) {
        this._dataType = value;
        return this;
    }
    
     
    public CustomMetaDataBuilder setDestination(final Destination value) {
        this._destination = value;
        return this;
    }
    
     
    public CustomMetaDataBuilder setKey(final CustomMetaDataKey value) {
        this._key = value;
        return this;
    }
    
     
    public CustomMetaDataBuilder setName(final java.lang.String value) {
        this._name = value;
        return this;
    }
    
     
    public CustomMetaDataBuilder setValue(final java.lang.String value) {
        this._value = value;
        return this;
    }
    
    public CustomMetaDataBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.rift.groupings.norev.custom.meta.data.CustomMetaData>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.rift.groupings.norev.custom.meta.data.CustomMetaData> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public CustomMetaDataBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.rift.groupings.norev.custom.meta.data.CustomMetaData>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public CustomMetaData build() {
        return new CustomMetaDataImpl(this);
    }

    private static final class CustomMetaDataImpl implements CustomMetaData {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.mano.rift.groupings.norev.custom.meta.data.CustomMetaData> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.mano.rift.groupings.norev.custom.meta.data.CustomMetaData.class;
        }

        private final MetaDataType _dataType;
        private final Destination _destination;
        private final CustomMetaDataKey _key;
        private final java.lang.String _name;
        private final java.lang.String _value;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.rift.groupings.norev.custom.meta.data.CustomMetaData>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.rift.groupings.norev.custom.meta.data.CustomMetaData>> augmentation = Collections.emptyMap();

        private CustomMetaDataImpl(CustomMetaDataBuilder base) {
            if (base.getKey() == null) {
                this._key = new CustomMetaDataKey(
                    base.getName()
                );
                this._name = base.getName();
            } else {
                this._key = base.getKey();
                this._name = _key.getName();
            }
            this._dataType = base.getDataType();
            this._destination = base.getDestination();
            this._value = base.getValue();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.rift.groupings.norev.custom.meta.data.CustomMetaData>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.rift.groupings.norev.custom.meta.data.CustomMetaData>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.rift.groupings.norev.custom.meta.data.CustomMetaData>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.rift.groupings.norev.custom.meta.data.CustomMetaData>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public MetaDataType getDataType() {
            return _dataType;
        }
        
        @Override
        public Destination getDestination() {
            return _destination;
        }
        
        @Override
        public CustomMetaDataKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.String getName() {
            return _name;
        }
        
        @Override
        public java.lang.String getValue() {
            return _value;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.rift.groupings.norev.custom.meta.data.CustomMetaData>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_destination);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_value);
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
            if (!ietf.params.xml.ns.yang.nfvo.mano.rift.groupings.norev.custom.meta.data.CustomMetaData.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.mano.rift.groupings.norev.custom.meta.data.CustomMetaData other = (ietf.params.xml.ns.yang.nfvo.mano.rift.groupings.norev.custom.meta.data.CustomMetaData)obj;
            if (!Objects.equals(_dataType, other.getDataType())) {
                return false;
            }
            if (!Objects.equals(_destination, other.getDestination())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_value, other.getValue())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                CustomMetaDataImpl otherImpl = (CustomMetaDataImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.rift.groupings.norev.custom.meta.data.CustomMetaData>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.rift.groupings.norev.custom.meta.data.CustomMetaData>> e : augmentation.entrySet()) {
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
            java.lang.String name = "CustomMetaData [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_dataType != null) {
                builder.append("_dataType=");
                builder.append(_dataType);
                builder.append(", ");
            }
            if (_destination != null) {
                builder.append("_destination=");
                builder.append(_destination);
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
            if (_value != null) {
                builder.append("_value=");
                builder.append(_value);
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
