package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.control.param;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.ietf.inet.types.rev130715.Uri;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.HttpMethod;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.WidgetType;

import java.util.Objects;
import java.math.BigInteger;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.control.param.ControlParam} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.control.param.ControlParam
 *
 */
public class ControlParamBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.control.param.ControlParam> {

    private BigInteger _currentValue;
    private java.lang.String _description;
    private java.lang.String _groupTag;
    private java.lang.String _id;
    private ControlParamKey _key;
    private BigInteger _maxValue;
    private HttpMethod _method;
    private BigInteger _minValue;
    private java.lang.String _name;
    private java.lang.String _payload;
    private BigInteger _stepValue;
    private java.lang.String _units;
    private Uri _url;
    private WidgetType _widgetType;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.control.param.ControlParam>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.control.param.ControlParam>> augmentation = Collections.emptyMap();

    public ControlParamBuilder() {
    }

    public ControlParamBuilder(ControlParam base) {
        if (base.getKey() == null) {
            this._key = new ControlParamKey(
                base.getId()
            );
            this._id = base.getId();
        } else {
            this._key = base.getKey();
            this._id = _key.getId();
        }
        this._currentValue = base.getCurrentValue();
        this._description = base.getDescription();
        this._groupTag = base.getGroupTag();
        this._maxValue = base.getMaxValue();
        this._method = base.getMethod();
        this._minValue = base.getMinValue();
        this._name = base.getName();
        this._payload = base.getPayload();
        this._stepValue = base.getStepValue();
        this._units = base.getUnits();
        this._url = base.getUrl();
        this._widgetType = base.getWidgetType();
        if (base instanceof ControlParamImpl) {
            ControlParamImpl impl = (ControlParamImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.control.param.ControlParam> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.control.param.ControlParam>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public BigInteger getCurrentValue() {
        return _currentValue;
    }
    
    public java.lang.String getDescription() {
        return _description;
    }
    
    public java.lang.String getGroupTag() {
        return _groupTag;
    }
    
    public java.lang.String getId() {
        return _id;
    }
    
    public ControlParamKey getKey() {
        return _key;
    }
    
    public BigInteger getMaxValue() {
        return _maxValue;
    }
    
    public HttpMethod getMethod() {
        return _method;
    }
    
    public BigInteger getMinValue() {
        return _minValue;
    }
    
    public java.lang.String getName() {
        return _name;
    }
    
    public java.lang.String getPayload() {
        return _payload;
    }
    
    public BigInteger getStepValue() {
        return _stepValue;
    }
    
    public java.lang.String getUnits() {
        return _units;
    }
    
    public Uri getUrl() {
        return _url;
    }
    
    public WidgetType getWidgetType() {
        return _widgetType;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.control.param.ControlParam>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKCURRENTVALUERANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKCURRENTVALUERANGE_RANGES = a;
     }
     private static void checkCurrentValueRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKCURRENTVALUERANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKCURRENTVALUERANGE_RANGES)));
     }
    
    public ControlParamBuilder setCurrentValue(final BigInteger value) {
    if (value != null) {
        checkCurrentValueRange(value);
    }
        this._currentValue = value;
        return this;
    }
    
     
    public ControlParamBuilder setDescription(final java.lang.String value) {
        this._description = value;
        return this;
    }
    
     
    public ControlParamBuilder setGroupTag(final java.lang.String value) {
        this._groupTag = value;
        return this;
    }
    
     
    public ControlParamBuilder setId(final java.lang.String value) {
        this._id = value;
        return this;
    }
    
     
    public ControlParamBuilder setKey(final ControlParamKey value) {
        this._key = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKMAXVALUERANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKMAXVALUERANGE_RANGES = a;
     }
     private static void checkMaxValueRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKMAXVALUERANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKMAXVALUERANGE_RANGES)));
     }
    
    public ControlParamBuilder setMaxValue(final BigInteger value) {
    if (value != null) {
        checkMaxValueRange(value);
    }
        this._maxValue = value;
        return this;
    }
    
     
    public ControlParamBuilder setMethod(final HttpMethod value) {
        this._method = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKMINVALUERANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKMINVALUERANGE_RANGES = a;
     }
     private static void checkMinValueRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKMINVALUERANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKMINVALUERANGE_RANGES)));
     }
    
    public ControlParamBuilder setMinValue(final BigInteger value) {
    if (value != null) {
        checkMinValueRange(value);
    }
        this._minValue = value;
        return this;
    }
    
     
    public ControlParamBuilder setName(final java.lang.String value) {
        this._name = value;
        return this;
    }
    
     
    public ControlParamBuilder setPayload(final java.lang.String value) {
        this._payload = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKSTEPVALUERANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKSTEPVALUERANGE_RANGES = a;
     }
     private static void checkStepValueRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKSTEPVALUERANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKSTEPVALUERANGE_RANGES)));
     }
    
    public ControlParamBuilder setStepValue(final BigInteger value) {
    if (value != null) {
        checkStepValueRange(value);
    }
        this._stepValue = value;
        return this;
    }
    
     
    public ControlParamBuilder setUnits(final java.lang.String value) {
        this._units = value;
        return this;
    }
    
     
    public ControlParamBuilder setUrl(final Uri value) {
        this._url = value;
        return this;
    }
    
     
    public ControlParamBuilder setWidgetType(final WidgetType value) {
        this._widgetType = value;
        return this;
    }
    
    public ControlParamBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.control.param.ControlParam>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.control.param.ControlParam> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ControlParamBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.control.param.ControlParam>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ControlParam build() {
        return new ControlParamImpl(this);
    }

    private static final class ControlParamImpl implements ControlParam {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.control.param.ControlParam> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.control.param.ControlParam.class;
        }

        private final BigInteger _currentValue;
        private final java.lang.String _description;
        private final java.lang.String _groupTag;
        private final java.lang.String _id;
        private final ControlParamKey _key;
        private final BigInteger _maxValue;
        private final HttpMethod _method;
        private final BigInteger _minValue;
        private final java.lang.String _name;
        private final java.lang.String _payload;
        private final BigInteger _stepValue;
        private final java.lang.String _units;
        private final Uri _url;
        private final WidgetType _widgetType;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.control.param.ControlParam>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.control.param.ControlParam>> augmentation = Collections.emptyMap();

        private ControlParamImpl(ControlParamBuilder base) {
            if (base.getKey() == null) {
                this._key = new ControlParamKey(
                    base.getId()
                );
                this._id = base.getId();
            } else {
                this._key = base.getKey();
                this._id = _key.getId();
            }
            this._currentValue = base.getCurrentValue();
            this._description = base.getDescription();
            this._groupTag = base.getGroupTag();
            this._maxValue = base.getMaxValue();
            this._method = base.getMethod();
            this._minValue = base.getMinValue();
            this._name = base.getName();
            this._payload = base.getPayload();
            this._stepValue = base.getStepValue();
            this._units = base.getUnits();
            this._url = base.getUrl();
            this._widgetType = base.getWidgetType();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.control.param.ControlParam>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.control.param.ControlParam>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.control.param.ControlParam>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.control.param.ControlParam>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public BigInteger getCurrentValue() {
            return _currentValue;
        }
        
        @Override
        public java.lang.String getDescription() {
            return _description;
        }
        
        @Override
        public java.lang.String getGroupTag() {
            return _groupTag;
        }
        
        @Override
        public java.lang.String getId() {
            return _id;
        }
        
        @Override
        public ControlParamKey getKey() {
            return _key;
        }
        
        @Override
        public BigInteger getMaxValue() {
            return _maxValue;
        }
        
        @Override
        public HttpMethod getMethod() {
            return _method;
        }
        
        @Override
        public BigInteger getMinValue() {
            return _minValue;
        }
        
        @Override
        public java.lang.String getName() {
            return _name;
        }
        
        @Override
        public java.lang.String getPayload() {
            return _payload;
        }
        
        @Override
        public BigInteger getStepValue() {
            return _stepValue;
        }
        
        @Override
        public java.lang.String getUnits() {
            return _units;
        }
        
        @Override
        public Uri getUrl() {
            return _url;
        }
        
        @Override
        public WidgetType getWidgetType() {
            return _widgetType;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.control.param.ControlParam>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_currentValue);
            result = prime * result + Objects.hashCode(_description);
            result = prime * result + Objects.hashCode(_groupTag);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_maxValue);
            result = prime * result + Objects.hashCode(_method);
            result = prime * result + Objects.hashCode(_minValue);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_payload);
            result = prime * result + Objects.hashCode(_stepValue);
            result = prime * result + Objects.hashCode(_units);
            result = prime * result + Objects.hashCode(_url);
            result = prime * result + Objects.hashCode(_widgetType);
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
            if (!ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.control.param.ControlParam.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.control.param.ControlParam other = (ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.control.param.ControlParam)obj;
            if (!Objects.equals(_currentValue, other.getCurrentValue())) {
                return false;
            }
            if (!Objects.equals(_description, other.getDescription())) {
                return false;
            }
            if (!Objects.equals(_groupTag, other.getGroupTag())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_maxValue, other.getMaxValue())) {
                return false;
            }
            if (!Objects.equals(_method, other.getMethod())) {
                return false;
            }
            if (!Objects.equals(_minValue, other.getMinValue())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_payload, other.getPayload())) {
                return false;
            }
            if (!Objects.equals(_stepValue, other.getStepValue())) {
                return false;
            }
            if (!Objects.equals(_units, other.getUnits())) {
                return false;
            }
            if (!Objects.equals(_url, other.getUrl())) {
                return false;
            }
            if (!Objects.equals(_widgetType, other.getWidgetType())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ControlParamImpl otherImpl = (ControlParamImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.control.param.ControlParam>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.control.param.ControlParam>> e : augmentation.entrySet()) {
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
            java.lang.String name = "ControlParam [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_currentValue != null) {
                builder.append("_currentValue=");
                builder.append(_currentValue);
                builder.append(", ");
            }
            if (_description != null) {
                builder.append("_description=");
                builder.append(_description);
                builder.append(", ");
            }
            if (_groupTag != null) {
                builder.append("_groupTag=");
                builder.append(_groupTag);
                builder.append(", ");
            }
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
            if (_maxValue != null) {
                builder.append("_maxValue=");
                builder.append(_maxValue);
                builder.append(", ");
            }
            if (_method != null) {
                builder.append("_method=");
                builder.append(_method);
                builder.append(", ");
            }
            if (_minValue != null) {
                builder.append("_minValue=");
                builder.append(_minValue);
                builder.append(", ");
            }
            if (_name != null) {
                builder.append("_name=");
                builder.append(_name);
                builder.append(", ");
            }
            if (_payload != null) {
                builder.append("_payload=");
                builder.append(_payload);
                builder.append(", ");
            }
            if (_stepValue != null) {
                builder.append("_stepValue=");
                builder.append(_stepValue);
                builder.append(", ");
            }
            if (_units != null) {
                builder.append("_units=");
                builder.append(_units);
                builder.append(", ");
            }
            if (_url != null) {
                builder.append("_url=");
                builder.append(_url);
                builder.append(", ");
            }
            if (_widgetType != null) {
                builder.append("_widgetType=");
                builder.append(_widgetType);
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
