package ietf.params.xml.ns.yang.ietf.l2.topology.rev150623;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.L2TerminationPointAttributes;

import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.TerminationPoint1} instances.
 * 
 * @see ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.TerminationPoint1
 *
 */
public class TerminationPoint1Builder implements Builder<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.TerminationPoint1> {

    private L2TerminationPointAttributes _l2TerminationPointAttributes;


    public TerminationPoint1Builder() {
    }
    public TerminationPoint1Builder(ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2TerminationPointAttributes arg) {
        this._l2TerminationPointAttributes = arg.getL2TerminationPointAttributes();
    }

    public TerminationPoint1Builder(TerminationPoint1 base) {
        this._l2TerminationPointAttributes = base.getL2TerminationPointAttributes();
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2TerminationPointAttributes</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2TerminationPointAttributes) {
            this._l2TerminationPointAttributes = ((ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2TerminationPointAttributes)arg).getL2TerminationPointAttributes();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2TerminationPointAttributes] \n" +
              "but was: " + arg
            );
        }
    }

    public L2TerminationPointAttributes getL2TerminationPointAttributes() {
        return _l2TerminationPointAttributes;
    }

     
    public TerminationPoint1Builder setL2TerminationPointAttributes(final L2TerminationPointAttributes value) {
        this._l2TerminationPointAttributes = value;
        return this;
    }

    @Override
    public TerminationPoint1 build() {
        return new TerminationPoint1Impl(this);
    }

    private static final class TerminationPoint1Impl implements TerminationPoint1 {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.TerminationPoint1> getImplementedInterface() {
            return ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.TerminationPoint1.class;
        }

        private final L2TerminationPointAttributes _l2TerminationPointAttributes;


        private TerminationPoint1Impl(TerminationPoint1Builder base) {
            this._l2TerminationPointAttributes = base.getL2TerminationPointAttributes();
        }

        @Override
        public L2TerminationPointAttributes getL2TerminationPointAttributes() {
            return _l2TerminationPointAttributes;
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
            result = prime * result + Objects.hashCode(_l2TerminationPointAttributes);
        
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
            if (!ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.TerminationPoint1.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.TerminationPoint1 other = (ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.TerminationPoint1)obj;
            if (!Objects.equals(_l2TerminationPointAttributes, other.getL2TerminationPointAttributes())) {
                return false;
            }
            return true;
        }

        @Override
        public java.lang.String toString() {
            java.lang.String name = "TerminationPoint1 [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_l2TerminationPointAttributes != null) {
                builder.append("_l2TerminationPointAttributes=");
                builder.append(_l2TerminationPointAttributes);
            }
            return builder.append(']').toString();
        }
    }

}
