package ietf.params.xml.ns.yang.ietf.l2.topology.rev150623;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.network.type.L2Network;

import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.NetworkTypes1} instances.
 * 
 * @see ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.NetworkTypes1
 *
 */
public class NetworkTypes1Builder implements Builder<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.NetworkTypes1> {

    private L2Network _l2Network;


    public NetworkTypes1Builder() {
    }
    public NetworkTypes1Builder(ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2NetworkType arg) {
        this._l2Network = arg.getL2Network();
    }

    public NetworkTypes1Builder(NetworkTypes1 base) {
        this._l2Network = base.getL2Network();
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2NetworkType</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2NetworkType) {
            this._l2Network = ((ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2NetworkType)arg).getL2Network();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2NetworkType] \n" +
              "but was: " + arg
            );
        }
    }

    public L2Network getL2Network() {
        return _l2Network;
    }

     
    public NetworkTypes1Builder setL2Network(final L2Network value) {
        this._l2Network = value;
        return this;
    }

    @Override
    public NetworkTypes1 build() {
        return new NetworkTypes1Impl(this);
    }

    private static final class NetworkTypes1Impl implements NetworkTypes1 {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.NetworkTypes1> getImplementedInterface() {
            return ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.NetworkTypes1.class;
        }

        private final L2Network _l2Network;


        private NetworkTypes1Impl(NetworkTypes1Builder base) {
            this._l2Network = base.getL2Network();
        }

        @Override
        public L2Network getL2Network() {
            return _l2Network;
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
            result = prime * result + Objects.hashCode(_l2Network);
        
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
            if (!ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.NetworkTypes1.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.NetworkTypes1 other = (ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.NetworkTypes1)obj;
            if (!Objects.equals(_l2Network, other.getL2Network())) {
                return false;
            }
            return true;
        }

        @Override
        public java.lang.String toString() {
            java.lang.String name = "NetworkTypes1 [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_l2Network != null) {
                builder.append("_l2Network=");
                builder.append(_l2Network);
            }
            return builder.append(']').toString();
        }
    }

}
