package http.riftio.rw.project.rev150910;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link http.riftio.rw.project.rev150910.Project} instances.
 * 
 * @see http.riftio.rw.project.rev150910.Project
 *
 */
public class ProjectBuilder implements Builder<http.riftio.rw.project.rev150910.Project> {

    private java.lang.String _description;
    private ProjectKey _key;
    private java.lang.String _name;

    Map<java.lang.Class<? extends Augmentation<http.riftio.rw.project.rev150910.Project>>, Augmentation<http.riftio.rw.project.rev150910.Project>> augmentation = Collections.emptyMap();

    public ProjectBuilder() {
    }

    public ProjectBuilder(Project base) {
        if (base.getKey() == null) {
            this._key = new ProjectKey(
                base.getName()
            );
            this._name = base.getName();
        } else {
            this._key = base.getKey();
            this._name = _key.getName();
        }
        this._description = base.getDescription();
        if (base instanceof ProjectImpl) {
            ProjectImpl impl = (ProjectImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<http.riftio.rw.project.rev150910.Project> casted =(AugmentationHolder<http.riftio.rw.project.rev150910.Project>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public java.lang.String getDescription() {
        return _description;
    }
    
    public ProjectKey getKey() {
        return _key;
    }
    
    public java.lang.String getName() {
        return _name;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<http.riftio.rw.project.rev150910.Project>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public ProjectBuilder setDescription(final java.lang.String value) {
        this._description = value;
        return this;
    }
    
     
    public ProjectBuilder setKey(final ProjectKey value) {
        this._key = value;
        return this;
    }
    
     
     private static void check_nameLength(final String value) {
         final int length = value.length();
         if (length >= 1 && length <= 255) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[1..255]].", value));
     }
    
    public ProjectBuilder setName(final java.lang.String value) {
    if (value != null) {
        check_nameLength(value);
    }
        this._name = value;
        return this;
    }
    
    public ProjectBuilder addAugmentation(java.lang.Class<? extends Augmentation<http.riftio.rw.project.rev150910.Project>> augmentationType, Augmentation<http.riftio.rw.project.rev150910.Project> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ProjectBuilder removeAugmentation(java.lang.Class<? extends Augmentation<http.riftio.rw.project.rev150910.Project>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Project build() {
        return new ProjectImpl(this);
    }

    private static final class ProjectImpl implements Project {

        @Override
        public java.lang.Class<http.riftio.rw.project.rev150910.Project> getImplementedInterface() {
            return http.riftio.rw.project.rev150910.Project.class;
        }

        private final java.lang.String _description;
        private final ProjectKey _key;
        private final java.lang.String _name;

        private Map<java.lang.Class<? extends Augmentation<http.riftio.rw.project.rev150910.Project>>, Augmentation<http.riftio.rw.project.rev150910.Project>> augmentation = Collections.emptyMap();

        private ProjectImpl(ProjectBuilder base) {
            if (base.getKey() == null) {
                this._key = new ProjectKey(
                    base.getName()
                );
                this._name = base.getName();
            } else {
                this._key = base.getKey();
                this._name = _key.getName();
            }
            this._description = base.getDescription();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.rw.project.rev150910.Project>>, Augmentation<http.riftio.rw.project.rev150910.Project>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<http.riftio.rw.project.rev150910.Project>>, Augmentation<http.riftio.rw.project.rev150910.Project>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getDescription() {
            return _description;
        }
        
        @Override
        public ProjectKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.String getName() {
            return _name;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<http.riftio.rw.project.rev150910.Project>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_description);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_name);
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
            if (!http.riftio.rw.project.rev150910.Project.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            http.riftio.rw.project.rev150910.Project other = (http.riftio.rw.project.rev150910.Project)obj;
            if (!Objects.equals(_description, other.getDescription())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ProjectImpl otherImpl = (ProjectImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<http.riftio.rw.project.rev150910.Project>>, Augmentation<http.riftio.rw.project.rev150910.Project>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Project [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_description != null) {
                builder.append("_description=");
                builder.append(_description);
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
