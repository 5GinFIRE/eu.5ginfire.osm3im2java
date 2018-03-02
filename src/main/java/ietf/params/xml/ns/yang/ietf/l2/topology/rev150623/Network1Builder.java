package ietf.params.xml.ns.yang.ietf.l2.topology.rev150623;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.network.attributes.L2NetworkAttributes;

import org.opendaylight.yangtools.concepts.Builder;

import java.util.Objects;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.Network1} instances.
 * 
 * @see ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.Network1
 *
 */
public class Network1Builder implements Builder<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.Network1> {

    private L2NetworkAttributes _l2NetworkAttributes;


    public Network1Builder() {
    }
    public Network1Builder(ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2NetworkAttributes arg) {
        this._l2NetworkAttributes = arg.getL2NetworkAttributes();
    }

    public Network1Builder(Network1 base) {
        this._l2NetworkAttributes = base.getL2NetworkAttributes();
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2NetworkAttributes</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2NetworkAttributes) {
            this._l2NetworkAttributes = ((ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2NetworkAttributes)arg).getL2NetworkAttributes();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2NetworkAttributes] \n" +
              "but was: " + arg
            );
        }
    }

    public L2NetworkAttributes getL2NetworkAttributes() {
        return _l2NetworkAttributes;
    }

     
    public Network1Builder setL2NetworkAttributes(final L2NetworkAttributes value) {
        this._l2NetworkAttributes = value;
        return this;
    }

    @Override
    public Network1 build() {
        return new Network1Impl(this);
    }

    private static final class Network1Impl implements Network1 {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.Network1> getImplementedInterface() {
            return ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.Network1.class;
        }

        private final L2NetworkAttributes _l2NetworkAttributes;


        private Network1Impl(Network1Builder base) {
            this._l2NetworkAttributes = base.getL2NetworkAttributes();
        }

        @Override
        public L2NetworkAttributes getL2NetworkAttributes() {
            return _l2NetworkAttributes;
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
            result = prime * result + Objects.hashCode(_l2NetworkAttributes);
        
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
            if (!ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.Network1.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.Network1 other = (ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.Network1)obj;
            if (!Objects.equals(_l2NetworkAttributes, other.getL2NetworkAttributes())) {
                return false;
            }
            return true;
        }

        @Override
        public java.lang.String toString() {
            java.lang.String name = "Network1 [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_l2NetworkAttributes != null) {
                builder.append("_l2NetworkAttributes=");
                builder.append(_l2NetworkAttributes);
            }
            return builder.append(']').toString();
        }
    }

}
