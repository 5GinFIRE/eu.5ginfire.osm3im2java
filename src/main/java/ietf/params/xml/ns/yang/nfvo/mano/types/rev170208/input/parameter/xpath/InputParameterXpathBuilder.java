package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.input.parameter.xpath;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.input.parameter.xpath.InputParameterXpath} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.input.parameter.xpath.InputParameterXpath
 *
 */
public class InputParameterXpathBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.input.parameter.xpath.InputParameterXpath> {

    private java.lang.String _defaultValue;
    private InputParameterXpathKey _key;
    private java.lang.String _label;
    private java.lang.String _xpath;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.input.parameter.xpath.InputParameterXpath>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.input.parameter.xpath.InputParameterXpath>> augmentation = Collections.emptyMap();

    public InputParameterXpathBuilder() {
    }

    public InputParameterXpathBuilder(InputParameterXpath base) {
        if (base.getKey() == null) {
            this._key = new InputParameterXpathKey(
                base.getXpath()
            );
            this._xpath = base.getXpath();
        } else {
            this._key = base.getKey();
            this._xpath = _key.getXpath();
        }
        this._defaultValue = base.getDefaultValue();
        this._label = base.getLabel();
        if (base instanceof InputParameterXpathImpl) {
            InputParameterXpathImpl impl = (InputParameterXpathImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.input.parameter.xpath.InputParameterXpath> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.input.parameter.xpath.InputParameterXpath>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public java.lang.String getDefaultValue() {
        return _defaultValue;
    }
    
    public InputParameterXpathKey getKey() {
        return _key;
    }
    
    public java.lang.String getLabel() {
        return _label;
    }
    
    public java.lang.String getXpath() {
        return _xpath;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.input.parameter.xpath.InputParameterXpath>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public InputParameterXpathBuilder setDefaultValue(final java.lang.String value) {
        this._defaultValue = value;
        return this;
    }
    
     
    public InputParameterXpathBuilder setKey(final InputParameterXpathKey value) {
        this._key = value;
        return this;
    }
    
     
    public InputParameterXpathBuilder setLabel(final java.lang.String value) {
        this._label = value;
        return this;
    }
    
     
    public InputParameterXpathBuilder setXpath(final java.lang.String value) {
        this._xpath = value;
        return this;
    }
    
    public InputParameterXpathBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.input.parameter.xpath.InputParameterXpath>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.input.parameter.xpath.InputParameterXpath> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public InputParameterXpathBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.input.parameter.xpath.InputParameterXpath>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public InputParameterXpath build() {
        return new InputParameterXpathImpl(this);
    }

    private static final class InputParameterXpathImpl implements InputParameterXpath {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.input.parameter.xpath.InputParameterXpath> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.input.parameter.xpath.InputParameterXpath.class;
        }

        private final java.lang.String _defaultValue;
        private final InputParameterXpathKey _key;
        private final java.lang.String _label;
        private final java.lang.String _xpath;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.input.parameter.xpath.InputParameterXpath>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.input.parameter.xpath.InputParameterXpath>> augmentation = Collections.emptyMap();

        private InputParameterXpathImpl(InputParameterXpathBuilder base) {
            if (base.getKey() == null) {
                this._key = new InputParameterXpathKey(
                    base.getXpath()
                );
                this._xpath = base.getXpath();
            } else {
                this._key = base.getKey();
                this._xpath = _key.getXpath();
            }
            this._defaultValue = base.getDefaultValue();
            this._label = base.getLabel();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.input.parameter.xpath.InputParameterXpath>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.input.parameter.xpath.InputParameterXpath>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.input.parameter.xpath.InputParameterXpath>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.input.parameter.xpath.InputParameterXpath>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getDefaultValue() {
            return _defaultValue;
        }
        
        @Override
        public InputParameterXpathKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.String getLabel() {
            return _label;
        }
        
        @Override
        public java.lang.String getXpath() {
            return _xpath;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.input.parameter.xpath.InputParameterXpath>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_defaultValue);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_label);
            result = prime * result + Objects.hashCode(_xpath);
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
            if (!ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.input.parameter.xpath.InputParameterXpath.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.input.parameter.xpath.InputParameterXpath other = (ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.input.parameter.xpath.InputParameterXpath)obj;
            if (!Objects.equals(_defaultValue, other.getDefaultValue())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_label, other.getLabel())) {
                return false;
            }
            if (!Objects.equals(_xpath, other.getXpath())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                InputParameterXpathImpl otherImpl = (InputParameterXpathImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.input.parameter.xpath.InputParameterXpath>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.input.parameter.xpath.InputParameterXpath>> e : augmentation.entrySet()) {
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
            java.lang.String name = "InputParameterXpath [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
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
            if (_label != null) {
                builder.append("_label=");
                builder.append(_label);
                builder.append(", ");
            }
            if (_xpath != null) {
                builder.append("_xpath=");
                builder.append(_xpath);
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
