package network.topology.rev131021.network.topology.topology;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;

import network.topology.rev131021.NodeId;
import network.topology.rev131021.network.topology.topology.node.TerminationPoint;
import network.topology.rev131021.node.attributes.SupportingNode;

import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link network.topology.rev131021.network.topology.topology.Node} instances.
 * 
 * @see network.topology.rev131021.network.topology.topology.Node
 *
 */
public class NodeBuilder implements Builder<network.topology.rev131021.network.topology.topology.Node> {

    private NodeKey _key;
    private NodeId _nodeId;
    private List<SupportingNode> _supportingNode;
    private List<TerminationPoint> _terminationPoint;

    Map<java.lang.Class<? extends Augmentation<network.topology.rev131021.network.topology.topology.Node>>, Augmentation<network.topology.rev131021.network.topology.topology.Node>> augmentation = Collections.emptyMap();

    public NodeBuilder() {
    }
    public NodeBuilder(network.topology.rev131021.NodeAttributes arg) {
        this._nodeId = arg.getNodeId();
        this._supportingNode = arg.getSupportingNode();
    }

    public NodeBuilder(Node base) {
        if (base.getKey() == null) {
            this._key = new NodeKey(
                base.getNodeId()
            );
            this._nodeId = base.getNodeId();
        } else {
            this._key = base.getKey();
            this._nodeId = _key.getNodeId();
        }
        this._supportingNode = base.getSupportingNode();
        this._terminationPoint = base.getTerminationPoint();
        if (base instanceof NodeImpl) {
            NodeImpl impl = (NodeImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<network.topology.rev131021.network.topology.topology.Node> casted =(AugmentationHolder<network.topology.rev131021.network.topology.topology.Node>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.NodeAttributes</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof network.topology.rev131021.NodeAttributes) {
            this._nodeId = ((network.topology.rev131021.NodeAttributes)arg).getNodeId();
            this._supportingNode = ((network.topology.rev131021.NodeAttributes)arg).getSupportingNode();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.NodeAttributes] \n" +
              "but was: " + arg
            );
        }
    }

    public NodeKey getKey() {
        return _key;
    }
    
    public NodeId getNodeId() {
        return _nodeId;
    }
    
    public List<SupportingNode> getSupportingNode() {
        return _supportingNode;
    }
    
    public List<TerminationPoint> getTerminationPoint() {
        return _terminationPoint;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<network.topology.rev131021.network.topology.topology.Node>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public NodeBuilder setKey(final NodeKey value) {
        this._key = value;
        return this;
    }
    
     
    public NodeBuilder setNodeId(final NodeId value) {
        this._nodeId = value;
        return this;
    }
    
     
    public NodeBuilder setSupportingNode(final List<SupportingNode> value) {
        this._supportingNode = value;
        return this;
    }
    
     
    public NodeBuilder setTerminationPoint(final List<TerminationPoint> value) {
        this._terminationPoint = value;
        return this;
    }
    
    public NodeBuilder addAugmentation(java.lang.Class<? extends Augmentation<network.topology.rev131021.network.topology.topology.Node>> augmentationType, Augmentation<network.topology.rev131021.network.topology.topology.Node> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public NodeBuilder removeAugmentation(java.lang.Class<? extends Augmentation<network.topology.rev131021.network.topology.topology.Node>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Node build() {
        return new NodeImpl(this);
    }

    private static final class NodeImpl implements Node {

        @Override
        public java.lang.Class<network.topology.rev131021.network.topology.topology.Node> getImplementedInterface() {
            return network.topology.rev131021.network.topology.topology.Node.class;
        }

        private final NodeKey _key;
        private final NodeId _nodeId;
        private final List<SupportingNode> _supportingNode;
        private final List<TerminationPoint> _terminationPoint;

        private Map<java.lang.Class<? extends Augmentation<network.topology.rev131021.network.topology.topology.Node>>, Augmentation<network.topology.rev131021.network.topology.topology.Node>> augmentation = Collections.emptyMap();

        private NodeImpl(NodeBuilder base) {
            if (base.getKey() == null) {
                this._key = new NodeKey(
                    base.getNodeId()
                );
                this._nodeId = base.getNodeId();
            } else {
                this._key = base.getKey();
                this._nodeId = _key.getNodeId();
            }
            this._supportingNode = base.getSupportingNode();
            this._terminationPoint = base.getTerminationPoint();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<network.topology.rev131021.network.topology.topology.Node>>, Augmentation<network.topology.rev131021.network.topology.topology.Node>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<network.topology.rev131021.network.topology.topology.Node>>, Augmentation<network.topology.rev131021.network.topology.topology.Node>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public NodeKey getKey() {
            return _key;
        }
        
        @Override
        public NodeId getNodeId() {
            return _nodeId;
        }
        
        @Override
        public List<SupportingNode> getSupportingNode() {
            return _supportingNode;
        }
        
        @Override
        public List<TerminationPoint> getTerminationPoint() {
            return _terminationPoint;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<network.topology.rev131021.network.topology.topology.Node>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
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
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_nodeId);
            result = prime * result + Objects.hashCode(_supportingNode);
            result = prime * result + Objects.hashCode(_terminationPoint);
            result = prime * result + Objects.hashCode(augmentation);
        
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
            if (!network.topology.rev131021.network.topology.topology.Node.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            network.topology.rev131021.network.topology.topology.Node other = (network.topology.rev131021.network.topology.topology.Node)obj;
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_nodeId, other.getNodeId())) {
                return false;
            }
            if (!Objects.equals(_supportingNode, other.getSupportingNode())) {
                return false;
            }
            if (!Objects.equals(_terminationPoint, other.getTerminationPoint())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NodeImpl otherImpl = (NodeImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<network.topology.rev131021.network.topology.topology.Node>>, Augmentation<network.topology.rev131021.network.topology.topology.Node>> e : augmentation.entrySet()) {
                    if (!e.getValue().equals(other.getAugmentation(e.getKey()))) {
                        return false;
                    }
                }
                // .. and give the other one the chance to do the same
                if (!obj.equals(this)) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public java.lang.String toString() {
            java.lang.String name = "Node [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_nodeId != null) {
                builder.append("_nodeId=");
                builder.append(_nodeId);
                builder.append(", ");
            }
            if (_supportingNode != null) {
                builder.append("_supportingNode=");
                builder.append(_supportingNode);
                builder.append(", ");
            }
            if (_terminationPoint != null) {
                builder.append("_terminationPoint=");
                builder.append(_terminationPoint);
            }
            final int builderLength = builder.length();
            final int builderAdditionalLength = builder.substring(name.length(), builderLength).length();
            if (builderAdditionalLength > 2 && !builder.substring(builderLength - 2, builderLength).equals(", ")) {
                builder.append(", ");
            }
            builder.append("augmentation=");
            builder.append(augmentation.values());
            return builder.append(']').toString();
        }
    }

}
