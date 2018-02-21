package ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.input.vnf.list;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.primitive.parameter.value.Parameter;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.input.vnf.list.VnfPrimitive} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.input.vnf.list.VnfPrimitive
 *
 */
public class VnfPrimitiveBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.input.vnf.list.VnfPrimitive> {

    private java.lang.Long _index;
    private VnfPrimitiveKey _key;
    private java.lang.String _name;
    private List<Parameter> _parameter;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.input.vnf.list.VnfPrimitive>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.input.vnf.list.VnfPrimitive>> augmentation = Collections.emptyMap();

    public VnfPrimitiveBuilder() {
    }
    public VnfPrimitiveBuilder(ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PrimitiveParameterValue arg) {
        this._parameter = arg.getParameter();
    }

    public VnfPrimitiveBuilder(VnfPrimitive base) {
        if (base.getKey() == null) {
            this._key = new VnfPrimitiveKey(
                base.getIndex()
            );
            this._index = base.getIndex();
        } else {
            this._key = base.getKey();
            this._index = _key.getIndex();
        }
        this._name = base.getName();
        this._parameter = base.getParameter();
        if (base instanceof VnfPrimitiveImpl) {
            VnfPrimitiveImpl impl = (VnfPrimitiveImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.input.vnf.list.VnfPrimitive> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.input.vnf.list.VnfPrimitive>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PrimitiveParameterValue</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PrimitiveParameterValue) {
            this._parameter = ((ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PrimitiveParameterValue)arg).getParameter();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PrimitiveParameterValue] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Long getIndex() {
        return _index;
    }
    
    public VnfPrimitiveKey getKey() {
        return _key;
    }
    
    public java.lang.String getName() {
        return _name;
    }
    
    public List<Parameter> getParameter() {
        return _parameter;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.input.vnf.list.VnfPrimitive>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static void checkIndexRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..4294967295]].", value));
     }
    
    public VnfPrimitiveBuilder setIndex(final java.lang.Long value) {
    if (value != null) {
        checkIndexRange(value);
    }
        this._index = value;
        return this;
    }
    
     
    public VnfPrimitiveBuilder setKey(final VnfPrimitiveKey value) {
        this._key = value;
        return this;
    }
    
     
    public VnfPrimitiveBuilder setName(final java.lang.String value) {
        this._name = value;
        return this;
    }
    
     
    public VnfPrimitiveBuilder setParameter(final List<Parameter> value) {
        this._parameter = value;
        return this;
    }
    
    public VnfPrimitiveBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.input.vnf.list.VnfPrimitive>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.input.vnf.list.VnfPrimitive> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VnfPrimitiveBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.input.vnf.list.VnfPrimitive>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public VnfPrimitive build() {
        return new VnfPrimitiveImpl(this);
    }

    private static final class VnfPrimitiveImpl implements VnfPrimitive {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.input.vnf.list.VnfPrimitive> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.input.vnf.list.VnfPrimitive.class;
        }

        private final java.lang.Long _index;
        private final VnfPrimitiveKey _key;
        private final java.lang.String _name;
        private final List<Parameter> _parameter;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.input.vnf.list.VnfPrimitive>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.input.vnf.list.VnfPrimitive>> augmentation = Collections.emptyMap();

        private VnfPrimitiveImpl(VnfPrimitiveBuilder base) {
            if (base.getKey() == null) {
                this._key = new VnfPrimitiveKey(
                    base.getIndex()
                );
                this._index = base.getIndex();
            } else {
                this._key = base.getKey();
                this._index = _key.getIndex();
            }
            this._name = base.getName();
            this._parameter = base.getParameter();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.input.vnf.list.VnfPrimitive>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.input.vnf.list.VnfPrimitive>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.input.vnf.list.VnfPrimitive>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.input.vnf.list.VnfPrimitive>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Long getIndex() {
            return _index;
        }
        
        @Override
        public VnfPrimitiveKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.String getName() {
            return _name;
        }
        
        @Override
        public List<Parameter> getParameter() {
            return _parameter;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.input.vnf.list.VnfPrimitive>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_index);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_parameter);
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
            if (!ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.input.vnf.list.VnfPrimitive.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.input.vnf.list.VnfPrimitive other = (ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.input.vnf.list.VnfPrimitive)obj;
            if (!Objects.equals(_index, other.getIndex())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_parameter, other.getParameter())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VnfPrimitiveImpl otherImpl = (VnfPrimitiveImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.input.vnf.list.VnfPrimitive>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.input.vnf.list.VnfPrimitive>> e : augmentation.entrySet()) {
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
            java.lang.String name = "VnfPrimitive [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_index != null) {
                builder.append("_index=");
                builder.append(_index);
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
            if (_parameter != null) {
                builder.append("_parameter=");
                builder.append(_parameter);
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
