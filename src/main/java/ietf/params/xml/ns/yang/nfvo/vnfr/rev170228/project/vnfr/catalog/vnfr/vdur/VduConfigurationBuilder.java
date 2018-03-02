package ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.ConfigMethod;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.ConfigPrimitive;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.InitialConfigPrimitive;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.VduConfiguration} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.VduConfiguration
 *
 */
public class VduConfigurationBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.VduConfiguration> {

    private ConfigMethod _configMethod;
    private List<ConfigPrimitive> _configPrimitive;
    private List<InitialConfigPrimitive> _initialConfigPrimitive;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.VduConfiguration>>, Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.VduConfiguration>> augmentation = Collections.emptyMap();

    public VduConfigurationBuilder() {
    }
    public VduConfigurationBuilder(ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.VcaConfiguration arg) {
        this._configMethod = arg.getConfigMethod();
        this._configPrimitive = arg.getConfigPrimitive();
        this._initialConfigPrimitive = arg.getInitialConfigPrimitive();
    }

    public VduConfigurationBuilder(VduConfiguration base) {
        this._configMethod = base.getConfigMethod();
        this._configPrimitive = base.getConfigPrimitive();
        this._initialConfigPrimitive = base.getInitialConfigPrimitive();
        if (base instanceof VduConfigurationImpl) {
            VduConfigurationImpl impl = (VduConfigurationImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.VduConfiguration> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.VduConfiguration>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.VcaConfiguration</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.VcaConfiguration) {
            this._configMethod = ((ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.VcaConfiguration)arg).getConfigMethod();
            this._configPrimitive = ((ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.VcaConfiguration)arg).getConfigPrimitive();
            this._initialConfigPrimitive = ((ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.VcaConfiguration)arg).getInitialConfigPrimitive();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.VcaConfiguration] \n" +
              "but was: " + arg
            );
        }
    }

    public ConfigMethod getConfigMethod() {
        return _configMethod;
    }
    
    public List<ConfigPrimitive> getConfigPrimitive() {
        return _configPrimitive;
    }
    
    public List<InitialConfigPrimitive> getInitialConfigPrimitive() {
        return _initialConfigPrimitive;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.VduConfiguration>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public VduConfigurationBuilder setConfigMethod(final ConfigMethod value) {
        this._configMethod = value;
        return this;
    }
    
     
    public VduConfigurationBuilder setConfigPrimitive(final List<ConfigPrimitive> value) {
        this._configPrimitive = value;
        return this;
    }
    
     
    public VduConfigurationBuilder setInitialConfigPrimitive(final List<InitialConfigPrimitive> value) {
        this._initialConfigPrimitive = value;
        return this;
    }
    
    public VduConfigurationBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.VduConfiguration>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.VduConfiguration> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VduConfigurationBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.VduConfiguration>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public VduConfiguration build() {
        return new VduConfigurationImpl(this);
    }

    private static final class VduConfigurationImpl implements VduConfiguration {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.VduConfiguration> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.VduConfiguration.class;
        }

        private final ConfigMethod _configMethod;
        private final List<ConfigPrimitive> _configPrimitive;
        private final List<InitialConfigPrimitive> _initialConfigPrimitive;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.VduConfiguration>>, Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.VduConfiguration>> augmentation = Collections.emptyMap();

        private VduConfigurationImpl(VduConfigurationBuilder base) {
            this._configMethod = base.getConfigMethod();
            this._configPrimitive = base.getConfigPrimitive();
            this._initialConfigPrimitive = base.getInitialConfigPrimitive();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.VduConfiguration>>, Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.VduConfiguration>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.VduConfiguration>>, Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.VduConfiguration>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public ConfigMethod getConfigMethod() {
            return _configMethod;
        }
        
        @Override
        public List<ConfigPrimitive> getConfigPrimitive() {
            return _configPrimitive;
        }
        
        @Override
        public List<InitialConfigPrimitive> getInitialConfigPrimitive() {
            return _initialConfigPrimitive;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.VduConfiguration>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_configMethod);
            result = prime * result + Objects.hashCode(_configPrimitive);
            result = prime * result + Objects.hashCode(_initialConfigPrimitive);
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
            if (!ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.VduConfiguration.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.VduConfiguration other = (ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.VduConfiguration)obj;
            if (!Objects.equals(_configMethod, other.getConfigMethod())) {
                return false;
            }
            if (!Objects.equals(_configPrimitive, other.getConfigPrimitive())) {
                return false;
            }
            if (!Objects.equals(_initialConfigPrimitive, other.getInitialConfigPrimitive())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VduConfigurationImpl otherImpl = (VduConfigurationImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.VduConfiguration>>, Augmentation<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.VduConfiguration>> e : augmentation.entrySet()) {
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
            java.lang.String name = "VduConfiguration [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_configMethod != null) {
                builder.append("_configMethod=");
                builder.append(_configMethod);
                builder.append(", ");
            }
            if (_configPrimitive != null) {
                builder.append("_configPrimitive=");
                builder.append(_configPrimitive);
                builder.append(", ");
            }
            if (_initialConfigPrimitive != null) {
                builder.append("_initialConfigPrimitive=");
                builder.append(_initialConfigPrimitive);
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
