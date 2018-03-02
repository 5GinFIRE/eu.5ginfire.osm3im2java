package ietf.params.xml.ns.yang.nfvo.vlr.rev170208;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.nfvo.vlr.rev170208.project.VlrCatalog;

import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.vlr.rev170208.Project1} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.vlr.rev170208.Project1
 *
 */
public class Project1Builder implements Builder<ietf.params.xml.ns.yang.nfvo.vlr.rev170208.Project1> {

    private VlrCatalog _vlrCatalog;


    public Project1Builder() {
    }

    public Project1Builder(Project1 base) {
        this._vlrCatalog = base.getVlrCatalog();
    }


    public VlrCatalog getVlrCatalog() {
        return _vlrCatalog;
    }

     
    public Project1Builder setVlrCatalog(final VlrCatalog value) {
        this._vlrCatalog = value;
        return this;
    }

    @Override
    public Project1 build() {
        return new Project1Impl(this);
    }

    private static final class Project1Impl implements Project1 {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.vlr.rev170208.Project1> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.vlr.rev170208.Project1.class;
        }

        private final VlrCatalog _vlrCatalog;


        private Project1Impl(Project1Builder base) {
            this._vlrCatalog = base.getVlrCatalog();
        }

        @Override
        public VlrCatalog getVlrCatalog() {
            return _vlrCatalog;
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
            result = prime * result + Objects.hashCode(_vlrCatalog);
        
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
            if (!ietf.params.xml.ns.yang.nfvo.vlr.rev170208.Project1.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.vlr.rev170208.Project1 other = (ietf.params.xml.ns.yang.nfvo.vlr.rev170208.Project1)obj;
            if (!Objects.equals(_vlrCatalog, other.getVlrCatalog())) {
                return false;
            }
            return true;
        }

        @Override
        public java.lang.String toString() {
            java.lang.String name = "Project1 [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_vlrCatalog != null) {
                builder.append("_vlrCatalog=");
                builder.append(_vlrCatalog);
            }
            return builder.append(']').toString();
        }
    }

}
