package ietf.params.xml.ns.yang.ietf.l2.topology.rev150623;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.node.attributes.L2NodeAttributes;

import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.Node1} instances.
 * 
 * @see ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.Node1
 *
 */
public class Node1Builder implements Builder<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.Node1> {

    private L2NodeAttributes _l2NodeAttributes;


    public Node1Builder() {
    }
    public Node1Builder(ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2NodeAttributes arg) {
        this._l2NodeAttributes = arg.getL2NodeAttributes();
    }

    public Node1Builder(Node1 base) {
        this._l2NodeAttributes = base.getL2NodeAttributes();
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2NodeAttributes</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2NodeAttributes) {
            this._l2NodeAttributes = ((ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2NodeAttributes)arg).getL2NodeAttributes();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2NodeAttributes] \n" +
              "but was: " + arg
            );
        }
    }

    public L2NodeAttributes getL2NodeAttributes() {
        return _l2NodeAttributes;
    }

     
    public Node1Builder setL2NodeAttributes(final L2NodeAttributes value) {
        this._l2NodeAttributes = value;
        return this;
    }

    @Override
    public Node1 build() {
        return new Node1Impl(this);
    }

    private static final class Node1Impl implements Node1 {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.Node1> getImplementedInterface() {
            return ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.Node1.class;
        }

        private final L2NodeAttributes _l2NodeAttributes;


        private Node1Impl(Node1Builder base) {
            this._l2NodeAttributes = base.getL2NodeAttributes();
        }

        @Override
        public L2NodeAttributes getL2NodeAttributes() {
            return _l2NodeAttributes;
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
            result = prime * result + Objects.hashCode(_l2NodeAttributes);
        
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
            if (!ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.Node1.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.Node1 other = (ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.Node1)obj;
            if (!Objects.equals(_l2NodeAttributes, other.getL2NodeAttributes())) {
                return false;
            }
            return true;
        }

        @Override
        public java.lang.String toString() {
            java.lang.String name = "Node1 [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_l2NodeAttributes != null) {
                builder.append("_l2NodeAttributes=");
                builder.append(_l2NodeAttributes);
            }
            return builder.append(']').toString();
        }
    }

}
