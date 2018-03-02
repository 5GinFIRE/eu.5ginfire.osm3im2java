package http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;

import java.math.BigDecimal;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.AlarmMetricType;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.AlarmOperationType;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.AlarmSeverityType;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.AlarmStatisticType;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.alarm.Actions;

import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.Alarm} instances.
 * 
 * @see http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.Alarm
 *
 */
public class AlarmBuilder implements Builder<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.Alarm> {

    private Actions _actions;
    private java.lang.String _alarmId;
    private java.lang.String _description;
    private java.lang.Long _evaluations;
    private AlarmKey _key;
    private AlarmMetricType _metric;
    private java.lang.String _name;
    private AlarmOperationType _operation;
    private java.lang.Long _period;
    private AlarmSeverityType _severity;
    private AlarmStatisticType _statistic;
    private BigDecimal _value;
    private java.lang.String _vdurId;
    private java.lang.Boolean _enabled;
    private java.lang.Boolean _repeat;

    Map<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.Alarm>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.Alarm>> augmentation = Collections.emptyMap();

    public AlarmBuilder() {
    }
    public AlarmBuilder(ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.Alarm arg) {
        this._alarmId = arg.getAlarmId();
        this._name = arg.getName();
        this._description = arg.getDescription();
        this._vdurId = arg.getVdurId();
        this._actions = arg.getActions();
        this._repeat = arg.isRepeat();
        this._enabled = arg.isEnabled();
        this._severity = arg.getSeverity();
        this._metric = arg.getMetric();
        this._statistic = arg.getStatistic();
        this._operation = arg.getOperation();
        this._value = arg.getValue();
        this._period = arg.getPeriod();
        this._evaluations = arg.getEvaluations();
    }

    public AlarmBuilder(Alarm base) {
        if (base.getKey() == null) {
            this._key = new AlarmKey(
                base.getAlarmId()
            );
            this._alarmId = base.getAlarmId();
        } else {
            this._key = base.getKey();
            this._alarmId = _key.getAlarmId();
        }
        this._actions = base.getActions();
        this._description = base.getDescription();
        this._evaluations = base.getEvaluations();
        this._metric = base.getMetric();
        this._name = base.getName();
        this._operation = base.getOperation();
        this._period = base.getPeriod();
        this._severity = base.getSeverity();
        this._statistic = base.getStatistic();
        this._value = base.getValue();
        this._vdurId = base.getVdurId();
        this._enabled = base.isEnabled();
        this._repeat = base.isRepeat();
        if (base instanceof AlarmImpl) {
            AlarmImpl impl = (AlarmImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.Alarm> casted =(AugmentationHolder<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.Alarm>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.Alarm</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.Alarm) {
            this._alarmId = ((ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.Alarm)arg).getAlarmId();
            this._name = ((ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.Alarm)arg).getName();
            this._description = ((ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.Alarm)arg).getDescription();
            this._vdurId = ((ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.Alarm)arg).getVdurId();
            this._actions = ((ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.Alarm)arg).getActions();
            this._repeat = ((ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.Alarm)arg).isRepeat();
            this._enabled = ((ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.Alarm)arg).isEnabled();
            this._severity = ((ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.Alarm)arg).getSeverity();
            this._metric = ((ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.Alarm)arg).getMetric();
            this._statistic = ((ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.Alarm)arg).getStatistic();
            this._operation = ((ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.Alarm)arg).getOperation();
            this._value = ((ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.Alarm)arg).getValue();
            this._period = ((ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.Alarm)arg).getPeriod();
            this._evaluations = ((ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.Alarm)arg).getEvaluations();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.Alarm] \n" +
              "but was: " + arg
            );
        }
    }

    public Actions getActions() {
        return _actions;
    }
    
    public java.lang.String getAlarmId() {
        return _alarmId;
    }
    
    public java.lang.String getDescription() {
        return _description;
    }
    
    public java.lang.Long getEvaluations() {
        return _evaluations;
    }
    
    public AlarmKey getKey() {
        return _key;
    }
    
    public AlarmMetricType getMetric() {
        return _metric;
    }
    
    public java.lang.String getName() {
        return _name;
    }
    
    public AlarmOperationType getOperation() {
        return _operation;
    }
    
    public java.lang.Long getPeriod() {
        return _period;
    }
    
    public AlarmSeverityType getSeverity() {
        return _severity;
    }
    
    public AlarmStatisticType getStatistic() {
        return _statistic;
    }
    
    public BigDecimal getValue() {
        return _value;
    }
    
    public java.lang.String getVdurId() {
        return _vdurId;
    }
    
    public java.lang.Boolean isEnabled() {
        return _enabled;
    }
    
    public java.lang.Boolean isRepeat() {
        return _repeat;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.Alarm>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public AlarmBuilder setActions(final Actions value) {
        this._actions = value;
        return this;
    }
    
     
    public AlarmBuilder setAlarmId(final java.lang.String value) {
        this._alarmId = value;
        return this;
    }
    
     
    public AlarmBuilder setDescription(final java.lang.String value) {
        this._description = value;
        return this;
    }
    
     
     private static void checkEvaluationsRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..4294967295]].", value));
     }
    
    public AlarmBuilder setEvaluations(final java.lang.Long value) {
    if (value != null) {
        checkEvaluationsRange(value);
    }
        this._evaluations = value;
        return this;
    }
    
     
    public AlarmBuilder setKey(final AlarmKey value) {
        this._key = value;
        return this;
    }
    
     
    public AlarmBuilder setMetric(final AlarmMetricType value) {
        this._metric = value;
        return this;
    }
    
     
    public AlarmBuilder setName(final java.lang.String value) {
        this._name = value;
        return this;
    }
    
     
    public AlarmBuilder setOperation(final AlarmOperationType value) {
        this._operation = value;
        return this;
    }
    
     
     private static void checkPeriodRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..4294967295]].", value));
     }
    
    public AlarmBuilder setPeriod(final java.lang.Long value) {
    if (value != null) {
        checkPeriodRange(value);
    }
        this._period = value;
        return this;
    }
    
     
    public AlarmBuilder setSeverity(final AlarmSeverityType value) {
        this._severity = value;
        return this;
    }
    
     
    public AlarmBuilder setStatistic(final AlarmStatisticType value) {
        this._statistic = value;
        return this;
    }
    
     
    public AlarmBuilder setValue(final BigDecimal value) {
        this._value = value;
        return this;
    }
    
     
    public AlarmBuilder setVdurId(final java.lang.String value) {
        this._vdurId = value;
        return this;
    }
    
     
    public AlarmBuilder setEnabled(final java.lang.Boolean value) {
        this._enabled = value;
        return this;
    }
    
     
    public AlarmBuilder setRepeat(final java.lang.Boolean value) {
        this._repeat = value;
        return this;
    }
    
    public AlarmBuilder addAugmentation(java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.Alarm>> augmentationType, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.Alarm> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public AlarmBuilder removeAugmentation(java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.Alarm>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Alarm build() {
        return new AlarmImpl(this);
    }

    private static final class AlarmImpl implements Alarm {

        @Override
        public java.lang.Class<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.Alarm> getImplementedInterface() {
            return http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.Alarm.class;
        }

        private final Actions _actions;
        private final java.lang.String _alarmId;
        private final java.lang.String _description;
        private final java.lang.Long _evaluations;
        private final AlarmKey _key;
        private final AlarmMetricType _metric;
        private final java.lang.String _name;
        private final AlarmOperationType _operation;
        private final java.lang.Long _period;
        private final AlarmSeverityType _severity;
        private final AlarmStatisticType _statistic;
        private final BigDecimal _value;
        private final java.lang.String _vdurId;
        private final java.lang.Boolean _enabled;
        private final java.lang.Boolean _repeat;

        private Map<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.Alarm>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.Alarm>> augmentation = Collections.emptyMap();

        private AlarmImpl(AlarmBuilder base) {
            if (base.getKey() == null) {
                this._key = new AlarmKey(
                    base.getAlarmId()
                );
                this._alarmId = base.getAlarmId();
            } else {
                this._key = base.getKey();
                this._alarmId = _key.getAlarmId();
            }
            this._actions = base.getActions();
            this._description = base.getDescription();
            this._evaluations = base.getEvaluations();
            this._metric = base.getMetric();
            this._name = base.getName();
            this._operation = base.getOperation();
            this._period = base.getPeriod();
            this._severity = base.getSeverity();
            this._statistic = base.getStatistic();
            this._value = base.getValue();
            this._vdurId = base.getVdurId();
            this._enabled = base.isEnabled();
            this._repeat = base.isRepeat();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.Alarm>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.Alarm>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.Alarm>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.Alarm>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public Actions getActions() {
            return _actions;
        }
        
        @Override
        public java.lang.String getAlarmId() {
            return _alarmId;
        }
        
        @Override
        public java.lang.String getDescription() {
            return _description;
        }
        
        @Override
        public java.lang.Long getEvaluations() {
            return _evaluations;
        }
        
        @Override
        public AlarmKey getKey() {
            return _key;
        }
        
        @Override
        public AlarmMetricType getMetric() {
            return _metric;
        }
        
        @Override
        public java.lang.String getName() {
            return _name;
        }
        
        @Override
        public AlarmOperationType getOperation() {
            return _operation;
        }
        
        @Override
        public java.lang.Long getPeriod() {
            return _period;
        }
        
        @Override
        public AlarmSeverityType getSeverity() {
            return _severity;
        }
        
        @Override
        public AlarmStatisticType getStatistic() {
            return _statistic;
        }
        
        @Override
        public BigDecimal getValue() {
            return _value;
        }
        
        @Override
        public java.lang.String getVdurId() {
            return _vdurId;
        }
        
        @Override
        public java.lang.Boolean isEnabled() {
            return _enabled;
        }
        
        @Override
        public java.lang.Boolean isRepeat() {
            return _repeat;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.Alarm>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_actions);
            result = prime * result + Objects.hashCode(_alarmId);
            result = prime * result + Objects.hashCode(_description);
            result = prime * result + Objects.hashCode(_evaluations);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_metric);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_operation);
            result = prime * result + Objects.hashCode(_period);
            result = prime * result + Objects.hashCode(_severity);
            result = prime * result + Objects.hashCode(_statistic);
            result = prime * result + Objects.hashCode(_value);
            result = prime * result + Objects.hashCode(_vdurId);
            result = prime * result + Objects.hashCode(_enabled);
            result = prime * result + Objects.hashCode(_repeat);
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
            if (!http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.Alarm.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.Alarm other = (http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.Alarm)obj;
            if (!Objects.equals(_actions, other.getActions())) {
                return false;
            }
            if (!Objects.equals(_alarmId, other.getAlarmId())) {
                return false;
            }
            if (!Objects.equals(_description, other.getDescription())) {
                return false;
            }
            if (!Objects.equals(_evaluations, other.getEvaluations())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_metric, other.getMetric())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_operation, other.getOperation())) {
                return false;
            }
            if (!Objects.equals(_period, other.getPeriod())) {
                return false;
            }
            if (!Objects.equals(_severity, other.getSeverity())) {
                return false;
            }
            if (!Objects.equals(_statistic, other.getStatistic())) {
                return false;
            }
            if (!Objects.equals(_value, other.getValue())) {
                return false;
            }
            if (!Objects.equals(_vdurId, other.getVdurId())) {
                return false;
            }
            if (!Objects.equals(_enabled, other.isEnabled())) {
                return false;
            }
            if (!Objects.equals(_repeat, other.isRepeat())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                AlarmImpl otherImpl = (AlarmImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.Alarm>>, Augmentation<http.riftio.vnfd.base.rev170228.vnfd.descriptor.vdu.Alarm>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Alarm [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_actions != null) {
                builder.append("_actions=");
                builder.append(_actions);
                builder.append(", ");
            }
            if (_alarmId != null) {
                builder.append("_alarmId=");
                builder.append(_alarmId);
                builder.append(", ");
            }
            if (_description != null) {
                builder.append("_description=");
                builder.append(_description);
                builder.append(", ");
            }
            if (_evaluations != null) {
                builder.append("_evaluations=");
                builder.append(_evaluations);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_metric != null) {
                builder.append("_metric=");
                builder.append(_metric);
                builder.append(", ");
            }
            if (_name != null) {
                builder.append("_name=");
                builder.append(_name);
                builder.append(", ");
            }
            if (_operation != null) {
                builder.append("_operation=");
                builder.append(_operation);
                builder.append(", ");
            }
            if (_period != null) {
                builder.append("_period=");
                builder.append(_period);
                builder.append(", ");
            }
            if (_severity != null) {
                builder.append("_severity=");
                builder.append(_severity);
                builder.append(", ");
            }
            if (_statistic != null) {
                builder.append("_statistic=");
                builder.append(_statistic);
                builder.append(", ");
            }
            if (_value != null) {
                builder.append("_value=");
                builder.append(_value);
                builder.append(", ");
            }
            if (_vdurId != null) {
                builder.append("_vdurId=");
                builder.append(_vdurId);
                builder.append(", ");
            }
            if (_enabled != null) {
                builder.append("_enabled=");
                builder.append(_enabled);
                builder.append(", ");
            }
            if (_repeat != null) {
                builder.append("_repeat=");
                builder.append(_repeat);
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
