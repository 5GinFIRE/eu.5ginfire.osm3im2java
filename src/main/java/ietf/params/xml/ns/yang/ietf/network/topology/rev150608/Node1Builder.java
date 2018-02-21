package ietf.params.xml.ns.yang.ietf.network.topology.rev150608;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.node.TerminationPoint;

import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.ietf.network.topology.rev150608.Node1} instances.
 * 
 * @see ietf.params.xml.ns.yang.ietf.network.topology.rev150608.Node1
 *
 */
public class Node1Builder implements Builder<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.Node1> {

    private List<TerminationPoint> _terminationPoint;


    public Node1Builder() {
    }

    public Node1Builder(Node1 base) {
        this._terminationPoint = base.getTerminationPoint();
    }


    public List<TerminationPoint> getTerminationPoint() {
        return _terminationPoint;
    }

     
    public Node1Builder setTerminationPoint(final List<TerminationPoint> value) {
        this._terminationPoint = value;
        return this;
    }

    @Override
    public Node1 build() {
        return new Node1Impl(this);
    }

    private static final class Node1Impl implements Node1 {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.Node1> getImplementedInterface() {
            return ietf.params.xml.ns.yang.ietf.network.topology.rev150608.Node1.class;
        }

        private final List<TerminationPoint> _terminationPoint;


        private Node1Impl(Node1Builder base) {
            this._terminationPoint = base.getTerminationPoint();
        }

        @Override
        public List<TerminationPoint> getTerminationPoint() {
            return _terminationPoint;
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
            result = prime * result + Objects.hashCode(_terminationPoint);
        
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
            if (!ietf.params.xml.ns.yang.ietf.network.topology.rev150608.Node1.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.ietf.network.topology.rev150608.Node1 other = (ietf.params.xml.ns.yang.ietf.network.topology.rev150608.Node1)obj;
            if (!Objects.equals(_terminationPoint, other.getTerminationPoint())) {
                return false;
            }
            return true;
        }

        @Override
        public java.lang.String toString() {
            java.lang.String name = "Node1 [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_terminationPoint != null) {
                builder.append("_terminationPoint=");
                builder.append(_terminationPoint);
            }
            return builder.append(']').toString();
        }
    }

}
