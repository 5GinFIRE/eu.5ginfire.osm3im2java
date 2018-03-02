package http.riftio.project.vnfd.rev170228;
import org.opendaylight.yangtools.yang.binding.DataObject;

import http.riftio.project.vnfd.rev170228.project.VnfdCatalog;

import org.opendaylight.yangtools.concepts.Builder;

import java.util.Objects;

/**
 * Class that builds {@link http.riftio.project.vnfd.rev170228.Project1} instances.
 * 
 * @see http.riftio.project.vnfd.rev170228.Project1
 *
 */
public class Project1Builder implements Builder<http.riftio.project.vnfd.rev170228.Project1> {

    private VnfdCatalog _vnfdCatalog;


    public Project1Builder() {
    }

    public Project1Builder(Project1 base) {
        this._vnfdCatalog = base.getVnfdCatalog();
    }


    public VnfdCatalog getVnfdCatalog() {
        return _vnfdCatalog;
    }

     
    public Project1Builder setVnfdCatalog(final VnfdCatalog value) {
        this._vnfdCatalog = value;
        return this;
    }

    @Override
    public Project1 build() {
        return new Project1Impl(this);
    }

    private static final class Project1Impl implements Project1 {

        @Override
        public java.lang.Class<http.riftio.project.vnfd.rev170228.Project1> getImplementedInterface() {
            return http.riftio.project.vnfd.rev170228.Project1.class;
        }

        private final VnfdCatalog _vnfdCatalog;


        private Project1Impl(Project1Builder base) {
            this._vnfdCatalog = base.getVnfdCatalog();
        }

        @Override
        public VnfdCatalog getVnfdCatalog() {
            return _vnfdCatalog;
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
            result = prime * result + Objects.hashCode(_vnfdCatalog);
        
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
            if (!http.riftio.project.vnfd.rev170228.Project1.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            http.riftio.project.vnfd.rev170228.Project1 other = (http.riftio.project.vnfd.rev170228.Project1)obj;
            if (!Objects.equals(_vnfdCatalog, other.getVnfdCatalog())) {
                return false;
            }
            return true;
        }

        @Override
        public java.lang.String toString() {
            java.lang.String name = "Project1 [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_vnfdCatalog != null) {
                builder.append("_vnfdCatalog=");
                builder.append(_vnfdCatalog);
            }
            return builder.append(']').toString();
        }
    }

}
