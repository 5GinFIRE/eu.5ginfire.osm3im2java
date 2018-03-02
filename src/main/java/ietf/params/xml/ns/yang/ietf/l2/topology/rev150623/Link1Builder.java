package ietf.params.xml.ns.yang.ietf.l2.topology.rev150623;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.link.attributes.L2LinkAttributes;

import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.Link1} instances.
 * 
 * @see ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.Link1
 *
 */
public class Link1Builder implements Builder<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.Link1> {

    private L2LinkAttributes _l2LinkAttributes;


    public Link1Builder() {
    }
    public Link1Builder(ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2LinkAttributes arg) {
        this._l2LinkAttributes = arg.getL2LinkAttributes();
    }

    public Link1Builder(Link1 base) {
        this._l2LinkAttributes = base.getL2LinkAttributes();
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2LinkAttributes</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2LinkAttributes) {
            this._l2LinkAttributes = ((ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2LinkAttributes)arg).getL2LinkAttributes();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2LinkAttributes] \n" +
              "but was: " + arg
            );
        }
    }

    public L2LinkAttributes getL2LinkAttributes() {
        return _l2LinkAttributes;
    }

     
    public Link1Builder setL2LinkAttributes(final L2LinkAttributes value) {
        this._l2LinkAttributes = value;
        return this;
    }

    @Override
    public Link1 build() {
        return new Link1Impl(this);
    }

    private static final class Link1Impl implements Link1 {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.Link1> getImplementedInterface() {
            return ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.Link1.class;
        }

        private final L2LinkAttributes _l2LinkAttributes;


        private Link1Impl(Link1Builder base) {
            this._l2LinkAttributes = base.getL2LinkAttributes();
        }

        @Override
        public L2LinkAttributes getL2LinkAttributes() {
            return _l2LinkAttributes;
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
            result = prime * result + Objects.hashCode(_l2LinkAttributes);
        
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
            if (!ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.Link1.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.Link1 other = (ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.Link1)obj;
            if (!Objects.equals(_l2LinkAttributes, other.getL2LinkAttributes())) {
                return false;
            }
            return true;
        }

        @Override
        public java.lang.String toString() {
            java.lang.String name = "Link1 [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_l2LinkAttributes != null) {
                builder.append("_l2LinkAttributes=");
                builder.append(_l2LinkAttributes);
            }
            return builder.append(']').toString();
        }
    }

}
