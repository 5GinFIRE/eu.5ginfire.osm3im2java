package ietf.params.xml.ns.yang.nfvo.nsr.rev170208;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.nsr.rev170208.GetNsServicePrimitiveValuesInput} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.nsr.rev170208.GetNsServicePrimitiveValuesInput
 *
 */
public class GetNsServicePrimitiveValuesInputBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.GetNsServicePrimitiveValuesInput> {

    private java.lang.String _name;
    private java.lang.Object _nsrIdRef;
    private java.lang.String _projectName;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.GetNsServicePrimitiveValuesInput>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.GetNsServicePrimitiveValuesInput>> augmentation = Collections.emptyMap();

    public GetNsServicePrimitiveValuesInputBuilder() {
    }
    public GetNsServicePrimitiveValuesInputBuilder(ietf.params.xml.ns.yang.nfvo.nsr.rev170208.RpcCommon arg) {
        this._nsrIdRef = arg.getNsrIdRef();
        this._projectName = arg.getProjectName();
    }
    public GetNsServicePrimitiveValuesInputBuilder(ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.RpcProjectName arg) {
        this._projectName = arg.getProjectName();
    }

    public GetNsServicePrimitiveValuesInputBuilder(GetNsServicePrimitiveValuesInput base) {
        this._name = base.getName();
        this._nsrIdRef = base.getNsrIdRef();
        this._projectName = base.getProjectName();
        if (base instanceof GetNsServicePrimitiveValuesInputImpl) {
            GetNsServicePrimitiveValuesInputImpl impl = (GetNsServicePrimitiveValuesInputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.GetNsServicePrimitiveValuesInput> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.GetNsServicePrimitiveValuesInput>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.RpcCommon</li>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.RpcProjectName</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof ietf.params.xml.ns.yang.nfvo.nsr.rev170208.RpcCommon) {
            this._nsrIdRef = ((ietf.params.xml.ns.yang.nfvo.nsr.rev170208.RpcCommon)arg).getNsrIdRef();
            isValidArg = true;
        }
        if (arg instanceof ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.RpcProjectName) {
            this._projectName = ((ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.RpcProjectName)arg).getProjectName();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.RpcCommon, org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.RpcProjectName] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.String getName() {
        return _name;
    }
    
    public java.lang.Object getNsrIdRef() {
        return _nsrIdRef;
    }
    
    public java.lang.String getProjectName() {
        return _projectName;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.GetNsServicePrimitiveValuesInput>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public GetNsServicePrimitiveValuesInputBuilder setName(final java.lang.String value) {
        this._name = value;
        return this;
    }
    
     
    public GetNsServicePrimitiveValuesInputBuilder setNsrIdRef(final java.lang.Object value) {
        this._nsrIdRef = value;
        return this;
    }
    
     
     private static void check_projectNameLength(final String value) {
         final int length = value.length();
         if (length >= 1 && length <= 255) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[1..255]].", value));
     }
    
    public GetNsServicePrimitiveValuesInputBuilder setProjectName(final java.lang.String value) {
    if (value != null) {
        check_projectNameLength(value);
    }
        this._projectName = value;
        return this;
    }
    
    public GetNsServicePrimitiveValuesInputBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.GetNsServicePrimitiveValuesInput>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.GetNsServicePrimitiveValuesInput> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public GetNsServicePrimitiveValuesInputBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.GetNsServicePrimitiveValuesInput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public GetNsServicePrimitiveValuesInput build() {
        return new GetNsServicePrimitiveValuesInputImpl(this);
    }

    private static final class GetNsServicePrimitiveValuesInputImpl implements GetNsServicePrimitiveValuesInput {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.GetNsServicePrimitiveValuesInput> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.nsr.rev170208.GetNsServicePrimitiveValuesInput.class;
        }

        private final java.lang.String _name;
        private final java.lang.Object _nsrIdRef;
        private final java.lang.String _projectName;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.GetNsServicePrimitiveValuesInput>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.GetNsServicePrimitiveValuesInput>> augmentation = Collections.emptyMap();

        private GetNsServicePrimitiveValuesInputImpl(GetNsServicePrimitiveValuesInputBuilder base) {
            this._name = base.getName();
            this._nsrIdRef = base.getNsrIdRef();
            this._projectName = base.getProjectName();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.GetNsServicePrimitiveValuesInput>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.GetNsServicePrimitiveValuesInput>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.GetNsServicePrimitiveValuesInput>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.GetNsServicePrimitiveValuesInput>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getName() {
            return _name;
        }
        
        @Override
        public java.lang.Object getNsrIdRef() {
            return _nsrIdRef;
        }
        
        @Override
        public java.lang.String getProjectName() {
            return _projectName;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.GetNsServicePrimitiveValuesInput>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_nsrIdRef);
            result = prime * result + Objects.hashCode(_projectName);
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
            if (!ietf.params.xml.ns.yang.nfvo.nsr.rev170208.GetNsServicePrimitiveValuesInput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.nsr.rev170208.GetNsServicePrimitiveValuesInput other = (ietf.params.xml.ns.yang.nfvo.nsr.rev170208.GetNsServicePrimitiveValuesInput)obj;
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_nsrIdRef, other.getNsrIdRef())) {
                return false;
            }
            if (!Objects.equals(_projectName, other.getProjectName())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                GetNsServicePrimitiveValuesInputImpl otherImpl = (GetNsServicePrimitiveValuesInputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.GetNsServicePrimitiveValuesInput>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.GetNsServicePrimitiveValuesInput>> e : augmentation.entrySet()) {
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
            java.lang.String name = "GetNsServicePrimitiveValuesInput [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_name != null) {
                builder.append("_name=");
                builder.append(_name);
                builder.append(", ");
            }
            if (_nsrIdRef != null) {
                builder.append("_nsrIdRef=");
                builder.append(_nsrIdRef);
                builder.append(", ");
            }
            if (_projectName != null) {
                builder.append("_projectName=");
                builder.append(_projectName);
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
