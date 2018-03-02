package ietf.params.xml.ns.yang.nfvo.nsr.rev170208;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.NsInstanceOpdata;

import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.nsr.rev170208.Project3} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.nsr.rev170208.Project3
 *
 */
public class Project3Builder implements Builder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.Project3> {

    private NsInstanceOpdata _nsInstanceOpdata;


    public Project3Builder() {
    }

    public Project3Builder(Project3 base) {
        this._nsInstanceOpdata = base.getNsInstanceOpdata();
    }


    public NsInstanceOpdata getNsInstanceOpdata() {
        return _nsInstanceOpdata;
    }

     
    public Project3Builder setNsInstanceOpdata(final NsInstanceOpdata value) {
        this._nsInstanceOpdata = value;
        return this;
    }

    @Override
    public Project3 build() {
        return new Project3Impl(this);
    }

    private static final class Project3Impl implements Project3 {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.Project3> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.nsr.rev170208.Project3.class;
        }

        private final NsInstanceOpdata _nsInstanceOpdata;


        private Project3Impl(Project3Builder base) {
            this._nsInstanceOpdata = base.getNsInstanceOpdata();
        }

        @Override
        public NsInstanceOpdata getNsInstanceOpdata() {
            return _nsInstanceOpdata;
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
            result = prime * result + Objects.hashCode(_nsInstanceOpdata);
        
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
            if (!ietf.params.xml.ns.yang.nfvo.nsr.rev170208.Project3.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.nsr.rev170208.Project3 other = (ietf.params.xml.ns.yang.nfvo.nsr.rev170208.Project3)obj;
            if (!Objects.equals(_nsInstanceOpdata, other.getNsInstanceOpdata())) {
                return false;
            }
            return true;
        }

        @Override
        public java.lang.String toString() {
            java.lang.String name = "Project3 [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_nsInstanceOpdata != null) {
                builder.append("_nsInstanceOpdata=");
                builder.append(_nsInstanceOpdata);
            }
            return builder.append(']').toString();
        }
    }

}
