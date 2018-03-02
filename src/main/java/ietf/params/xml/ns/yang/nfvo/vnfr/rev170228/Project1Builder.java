package ietf.params.xml.ns.yang.nfvo.vnfr.rev170228;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.VnfrCatalog;

import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.Project1} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.Project1
 *
 */
public class Project1Builder implements Builder<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.Project1> {

    private VnfrCatalog _vnfrCatalog;


    public Project1Builder() {
    }

    public Project1Builder(Project1 base) {
        this._vnfrCatalog = base.getVnfrCatalog();
    }


    public VnfrCatalog getVnfrCatalog() {
        return _vnfrCatalog;
    }

     
    public Project1Builder setVnfrCatalog(final VnfrCatalog value) {
        this._vnfrCatalog = value;
        return this;
    }

    @Override
    public Project1 build() {
        return new Project1Impl(this);
    }

    private static final class Project1Impl implements Project1 {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.Project1> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.Project1.class;
        }

        private final VnfrCatalog _vnfrCatalog;


        private Project1Impl(Project1Builder base) {
            this._vnfrCatalog = base.getVnfrCatalog();
        }

        @Override
        public VnfrCatalog getVnfrCatalog() {
            return _vnfrCatalog;
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
            result = prime * result + Objects.hashCode(_vnfrCatalog);
        
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
            if (!ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.Project1.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.Project1 other = (ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.Project1)obj;
            if (!Objects.equals(_vnfrCatalog, other.getVnfrCatalog())) {
                return false;
            }
            return true;
        }

        @Override
        public java.lang.String toString() {
            java.lang.String name = "Project1 [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_vnfrCatalog != null) {
                builder.append("_vnfrCatalog=");
                builder.append(_vnfrCatalog);
            }
            return builder.append(']').toString();
        }
    }

}
