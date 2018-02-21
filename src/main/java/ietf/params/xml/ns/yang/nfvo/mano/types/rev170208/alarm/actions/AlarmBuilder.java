package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.alarm.actions;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.alarm.actions.Alarm} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.alarm.actions.Alarm
 *
 */
public class AlarmBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.alarm.actions.Alarm> {

    private AlarmKey _key;
    private java.lang.String _url;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.alarm.actions.Alarm>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.alarm.actions.Alarm>> augmentation = Collections.emptyMap();

    public AlarmBuilder() {
    }

    public AlarmBuilder(Alarm base) {
        if (base.getKey() == null) {
            this._key = new AlarmKey(
                base.getUrl()
            );
            this._url = base.getUrl();
        } else {
            this._key = base.getKey();
            this._url = _key.getUrl();
        }
        if (base instanceof AlarmImpl) {
            AlarmImpl impl = (AlarmImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.alarm.actions.Alarm> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.alarm.actions.Alarm>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public AlarmKey getKey() {
        return _key;
    }
    
    public java.lang.String getUrl() {
        return _url;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.alarm.actions.Alarm>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public AlarmBuilder setKey(final AlarmKey value) {
        this._key = value;
        return this;
    }
    
     
    public AlarmBuilder setUrl(final java.lang.String value) {
        this._url = value;
        return this;
    }
    
    public AlarmBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.alarm.actions.Alarm>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.alarm.actions.Alarm> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public AlarmBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.alarm.actions.Alarm>> augmentationType) {
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
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.alarm.actions.Alarm> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.alarm.actions.Alarm.class;
        }

        private final AlarmKey _key;
        private final java.lang.String _url;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.alarm.actions.Alarm>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.alarm.actions.Alarm>> augmentation = Collections.emptyMap();

        private AlarmImpl(AlarmBuilder base) {
            if (base.getKey() == null) {
                this._key = new AlarmKey(
                    base.getUrl()
                );
                this._url = base.getUrl();
            } else {
                this._key = base.getKey();
                this._url = _key.getUrl();
            }
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.alarm.actions.Alarm>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.alarm.actions.Alarm>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.alarm.actions.Alarm>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.alarm.actions.Alarm>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public AlarmKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.String getUrl() {
            return _url;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.alarm.actions.Alarm>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_url);
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
            if (!ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.alarm.actions.Alarm.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.alarm.actions.Alarm other = (ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.alarm.actions.Alarm)obj;
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_url, other.getUrl())) {
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
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.alarm.actions.Alarm>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.alarm.actions.Alarm>> e : augmentation.entrySet()) {
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
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_url != null) {
                builder.append("_url=");
                builder.append(_url);
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
