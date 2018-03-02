package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import com.fasterxml.jackson.annotation.JsonProperty;

import ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.VnfdBuilder;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.Juju} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.Juju
 *
 */
public class JujuBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.Juju> {

    private ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.juju.Juju _juju;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.Juju>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.Juju>> augmentation = Collections.emptyMap();

    public JujuBuilder() {
    }

    public JujuBuilder(Juju base) {
        this._juju = base.getJuju();
        if (base instanceof JujuImpl) {
            JujuImpl impl = (JujuImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.Juju> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.Juju>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.juju.Juju getJuju() {
        return _juju;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.Juju>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public JujuBuilder setJuju(final ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.juju.Juju value) {
        this._juju = value;
        return this;
    }
    
    public JujuBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.Juju>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.Juju> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public JujuBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.Juju>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Juju build() {
        return new JujuImpl(this);
    }

    public static final class JujuImpl implements Juju {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.Juju> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.Juju.class;
        }

        private ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.juju.Juju _juju;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.Juju>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.Juju>> augmentation = Collections.emptyMap();

        private JujuImpl(JujuBuilder base) {
            this._juju = base.getJuju();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.Juju>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.Juju>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.Juju>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.Juju>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.juju.Juju getJuju() {
            return _juju;
        }
        
        public JujuImpl(){
          	this( new JujuBuilder() );
        }
        
        @JsonProperty("charm")
        public void setCharm(String s){
            _juju = new ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.juju.JujuBuilder().setCharm(s).build();
          }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.Juju>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_juju);
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
            if (!ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.Juju.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.Juju other = (ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.Juju)obj;
            if (!Objects.equals(_juju, other.getJuju())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                JujuImpl otherImpl = (JujuImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.Juju>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.Juju>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Juju [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_juju != null) {
                builder.append("_juju=");
                builder.append(_juju);
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
