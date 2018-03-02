package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.alarm;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.alarm.actions.Alarm;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.alarm.actions.InsufficientData;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.alarm.actions.Ok;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;

import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.alarm.Actions} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.alarm.Actions
 *
 */
public class ActionsBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.alarm.Actions> {

    private List<Alarm> _alarm;
    private List<InsufficientData> _insufficientData;
    private List<Ok> _ok;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.alarm.Actions>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.alarm.Actions>> augmentation = Collections.emptyMap();

    public ActionsBuilder() {
    }

    public ActionsBuilder(Actions base) {
        this._alarm = base.getAlarm();
        this._insufficientData = base.getInsufficientData();
        this._ok = base.getOk();
        if (base instanceof ActionsImpl) {
            ActionsImpl impl = (ActionsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.alarm.Actions> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.alarm.Actions>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public List<Alarm> getAlarm() {
        return _alarm;
    }
    
    public List<InsufficientData> getInsufficientData() {
        return _insufficientData;
    }
    
    public List<Ok> getOk() {
        return _ok;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.alarm.Actions>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public ActionsBuilder setAlarm(final List<Alarm> value) {
        this._alarm = value;
        return this;
    }
    
     
    public ActionsBuilder setInsufficientData(final List<InsufficientData> value) {
        this._insufficientData = value;
        return this;
    }
    
     
    public ActionsBuilder setOk(final List<Ok> value) {
        this._ok = value;
        return this;
    }
    
    public ActionsBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.alarm.Actions>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.alarm.Actions> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ActionsBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.alarm.Actions>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Actions build() {
        return new ActionsImpl(this);
    }

    private static final class ActionsImpl implements Actions {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.alarm.Actions> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.alarm.Actions.class;
        }

        private final List<Alarm> _alarm;
        private final List<InsufficientData> _insufficientData;
        private final List<Ok> _ok;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.alarm.Actions>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.alarm.Actions>> augmentation = Collections.emptyMap();

        private ActionsImpl(ActionsBuilder base) {
            this._alarm = base.getAlarm();
            this._insufficientData = base.getInsufficientData();
            this._ok = base.getOk();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.alarm.Actions>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.alarm.Actions>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.alarm.Actions>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.alarm.Actions>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<Alarm> getAlarm() {
            return _alarm;
        }
        
        @Override
        public List<InsufficientData> getInsufficientData() {
            return _insufficientData;
        }
        
        @Override
        public List<Ok> getOk() {
            return _ok;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.alarm.Actions>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_alarm);
            result = prime * result + Objects.hashCode(_insufficientData);
            result = prime * result + Objects.hashCode(_ok);
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
            if (!ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.alarm.Actions.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.alarm.Actions other = (ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.alarm.Actions)obj;
            if (!Objects.equals(_alarm, other.getAlarm())) {
                return false;
            }
            if (!Objects.equals(_insufficientData, other.getInsufficientData())) {
                return false;
            }
            if (!Objects.equals(_ok, other.getOk())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ActionsImpl otherImpl = (ActionsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.alarm.Actions>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.alarm.Actions>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Actions [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_alarm != null) {
                builder.append("_alarm=");
                builder.append(_alarm);
                builder.append(", ");
            }
            if (_insufficientData != null) {
                builder.append("_insufficientData=");
                builder.append(_insufficientData);
                builder.append(", ");
            }
            if (_ok != null) {
                builder.append("_ok=");
                builder.append(_ok);
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
