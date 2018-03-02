package ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.project.VnffgdCatalog;

import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.Project1} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.Project1
 *
 */
public class Project1Builder implements Builder<ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.Project1> {

    private VnffgdCatalog _vnffgdCatalog;


    public Project1Builder() {
    }

    public Project1Builder(Project1 base) {
        this._vnffgdCatalog = base.getVnffgdCatalog();
    }


    public VnffgdCatalog getVnffgdCatalog() {
        return _vnffgdCatalog;
    }

     
    public Project1Builder setVnffgdCatalog(final VnffgdCatalog value) {
        this._vnffgdCatalog = value;
        return this;
    }

    @Override
    public Project1 build() {
        return new Project1Impl(this);
    }

    private static final class Project1Impl implements Project1 {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.Project1> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.Project1.class;
        }

        private final VnffgdCatalog _vnffgdCatalog;


        private Project1Impl(Project1Builder base) {
            this._vnffgdCatalog = base.getVnffgdCatalog();
        }

        @Override
        public VnffgdCatalog getVnffgdCatalog() {
            return _vnffgdCatalog;
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
            result = prime * result + Objects.hashCode(_vnffgdCatalog);
        
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
            if (!ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.Project1.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.Project1 other = (ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.Project1)obj;
            if (!Objects.equals(_vnffgdCatalog, other.getVnffgdCatalog())) {
                return false;
            }
            return true;
        }

        @Override
        public java.lang.String toString() {
            java.lang.String name = "Project1 [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_vnffgdCatalog != null) {
                builder.append("_vnffgdCatalog=");
                builder.append(_vnffgdCatalog);
            }
            return builder.append(']').toString();
        }
    }

}
