package ietf.params.xml.ns.yang.nfvo.nsr.rev170208;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.KeyPair;

import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.nsr.rev170208.Project1} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.nsr.rev170208.Project1
 *
 */
public class Project1Builder implements Builder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.Project1> {

    private List<KeyPair> _keyPair;


    public Project1Builder() {
    }

    public Project1Builder(Project1 base) {
        this._keyPair = base.getKeyPair();
    }


    public List<KeyPair> getKeyPair() {
        return _keyPair;
    }

     
    public Project1Builder setKeyPair(final List<KeyPair> value) {
        this._keyPair = value;
        return this;
    }

    @Override
    public Project1 build() {
        return new Project1Impl(this);
    }

    private static final class Project1Impl implements Project1 {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.Project1> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.nsr.rev170208.Project1.class;
        }

        private final List<KeyPair> _keyPair;


        private Project1Impl(Project1Builder base) {
            this._keyPair = base.getKeyPair();
        }

        @Override
        public List<KeyPair> getKeyPair() {
            return _keyPair;
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
            result = prime * result + Objects.hashCode(_keyPair);
        
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
            if (!ietf.params.xml.ns.yang.nfvo.nsr.rev170208.Project1.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.nsr.rev170208.Project1 other = (ietf.params.xml.ns.yang.nfvo.nsr.rev170208.Project1)obj;
            if (!Objects.equals(_keyPair, other.getKeyPair())) {
                return false;
            }
            return true;
        }

        @Override
        public java.lang.String toString() {
            java.lang.String name = "Project1 [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_keyPair != null) {
                builder.append("_keyPair=");
                builder.append(_keyPair);
            }
            return builder.append(']').toString();
        }
    }

}
