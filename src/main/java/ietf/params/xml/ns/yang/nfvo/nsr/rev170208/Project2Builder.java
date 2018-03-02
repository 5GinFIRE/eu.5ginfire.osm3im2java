package ietf.params.xml.ns.yang.nfvo.nsr.rev170208;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.NsInstanceConfig;

import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.nsr.rev170208.Project2} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.nsr.rev170208.Project2
 *
 */
public class Project2Builder implements Builder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.Project2> {

    private NsInstanceConfig _nsInstanceConfig;


    public Project2Builder() {
    }

    public Project2Builder(Project2 base) {
        this._nsInstanceConfig = base.getNsInstanceConfig();
    }


    public NsInstanceConfig getNsInstanceConfig() {
        return _nsInstanceConfig;
    }

     
    public Project2Builder setNsInstanceConfig(final NsInstanceConfig value) {
        this._nsInstanceConfig = value;
        return this;
    }

    @Override
    public Project2 build() {
        return new Project2Impl(this);
    }

    private static final class Project2Impl implements Project2 {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.Project2> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.nsr.rev170208.Project2.class;
        }

        private final NsInstanceConfig _nsInstanceConfig;


        private Project2Impl(Project2Builder base) {
            this._nsInstanceConfig = base.getNsInstanceConfig();
        }

        @Override
        public NsInstanceConfig getNsInstanceConfig() {
            return _nsInstanceConfig;
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
            result = prime * result + Objects.hashCode(_nsInstanceConfig);
        
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
            if (!ietf.params.xml.ns.yang.nfvo.nsr.rev170208.Project2.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.nsr.rev170208.Project2 other = (ietf.params.xml.ns.yang.nfvo.nsr.rev170208.Project2)obj;
            if (!Objects.equals(_nsInstanceConfig, other.getNsInstanceConfig())) {
                return false;
            }
            return true;
        }

        @Override
        public java.lang.String toString() {
            java.lang.String name = "Project2 [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_nsInstanceConfig != null) {
                builder.append("_nsInstanceConfig=");
                builder.append(_nsInstanceConfig);
            }
            return builder.append(']').toString();
        }
    }

}
