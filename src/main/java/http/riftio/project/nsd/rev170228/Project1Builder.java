package http.riftio.project.nsd.rev170228;
import org.opendaylight.yangtools.yang.binding.DataObject;

import http.riftio.project.nsd.rev170228.project.NsdCatalog;

import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;

/**
 * Class that builds {@link http.riftio.project.nsd.rev170228.Project1} instances.
 * 
 * @see http.riftio.project.nsd.rev170228.Project1
 *
 */
public class Project1Builder implements Builder<http.riftio.project.nsd.rev170228.Project1> {

    private NsdCatalog _nsdCatalog;


    public Project1Builder() {
    }

    public Project1Builder(Project1 base) {
        this._nsdCatalog = base.getNsdCatalog();
    }


    public NsdCatalog getNsdCatalog() {
        return _nsdCatalog;
    }

     
    public Project1Builder setNsdCatalog(final NsdCatalog value) {
        this._nsdCatalog = value;
        return this;
    }

    @Override
    public Project1 build() {
        return new Project1Impl(this);
    }

    private static final class Project1Impl implements Project1 {

        @Override
        public java.lang.Class<http.riftio.project.nsd.rev170228.Project1> getImplementedInterface() {
            return http.riftio.project.nsd.rev170228.Project1.class;
        }

        private final NsdCatalog _nsdCatalog;


        private Project1Impl(Project1Builder base) {
            this._nsdCatalog = base.getNsdCatalog();
        }

        @Override
        public NsdCatalog getNsdCatalog() {
            return _nsdCatalog;
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
            result = prime * result + Objects.hashCode(_nsdCatalog);
        
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
            if (!http.riftio.project.nsd.rev170228.Project1.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            http.riftio.project.nsd.rev170228.Project1 other = (http.riftio.project.nsd.rev170228.Project1)obj;
            if (!Objects.equals(_nsdCatalog, other.getNsdCatalog())) {
                return false;
            }
            return true;
        }

        @Override
        public java.lang.String toString() {
            java.lang.String name = "Project1 [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_nsdCatalog != null) {
                builder.append("_nsdCatalog=");
                builder.append(_nsdCatalog);
            }
            return builder.append(']').toString();
        }
    }

}
