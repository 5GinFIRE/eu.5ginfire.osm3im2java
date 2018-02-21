package ietf.params.xml.ns.yang.ietf.network.topology.rev150608;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.Link;

import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.ietf.network.topology.rev150608.Network1} instances.
 * 
 * @see ietf.params.xml.ns.yang.ietf.network.topology.rev150608.Network1
 *
 */
public class Network1Builder implements Builder<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.Network1> {

    private List<Link> _link;


    public Network1Builder() {
    }

    public Network1Builder(Network1 base) {
        this._link = base.getLink();
    }


    public List<Link> getLink() {
        return _link;
    }

     
    public Network1Builder setLink(final List<Link> value) {
        this._link = value;
        return this;
    }

    @Override
    public Network1 build() {
        return new Network1Impl(this);
    }

    private static final class Network1Impl implements Network1 {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.Network1> getImplementedInterface() {
            return ietf.params.xml.ns.yang.ietf.network.topology.rev150608.Network1.class;
        }

        private final List<Link> _link;


        private Network1Impl(Network1Builder base) {
            this._link = base.getLink();
        }

        @Override
        public List<Link> getLink() {
            return _link;
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
            result = prime * result + Objects.hashCode(_link);
        
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
            if (!ietf.params.xml.ns.yang.ietf.network.topology.rev150608.Network1.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.ietf.network.topology.rev150608.Network1 other = (ietf.params.xml.ns.yang.ietf.network.topology.rev150608.Network1)obj;
            if (!Objects.equals(_link, other.getLink())) {
                return false;
            }
            return true;
        }

        @Override
        public java.lang.String toString() {
            java.lang.String name = "Network1 [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_link != null) {
                builder.append("_link=");
                builder.append(_link);
            }
            return builder.append(']').toString();
        }
    }

}
