package ietf.params.xml.ns.yang.ietf.network.rev150608.network;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.ietf.network.rev150608.NodeId;
import ietf.params.xml.ns.yang.ietf.network.rev150608.network.node.SupportingNode;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;

import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.ietf.network.rev150608.network.Node} instances.
 * 
 * @see ietf.params.xml.ns.yang.ietf.network.rev150608.network.Node
 *
 */
public class NodeBuilder implements Builder<ietf.params.xml.ns.yang.ietf.network.rev150608.network.Node> {

    private NodeKey _key;
    private NodeId _nodeId;
    private List<SupportingNode> _supportingNode;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.network.rev150608.network.Node>>, Augmentation<ietf.params.xml.ns.yang.ietf.network.rev150608.network.Node>> augmentation = Collections.emptyMap();

    public NodeBuilder() {
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
        if (base instanceof NodeImpl) {
            NodeImpl impl = (NodeImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.ietf.network.rev150608.network.Node> casted =(AugmentationHolder<ietf.params.xml.ns.yang.ietf.network.rev150608.network.Node>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
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
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.ietf.network.rev150608.network.Node>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
    
    public NodeBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.network.rev150608.network.Node>> augmentationType, Augmentation<ietf.params.xml.ns.yang.ietf.network.rev150608.network.Node> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public NodeBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.network.rev150608.network.Node>> augmentationType) {
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
        public java.lang.Class<ietf.params.xml.ns.yang.ietf.network.rev150608.network.Node> getImplementedInterface() {
            return ietf.params.xml.ns.yang.ietf.network.rev150608.network.Node.class;
        }

        private final NodeKey _key;
        private final NodeId _nodeId;
        private final List<SupportingNode> _supportingNode;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.network.rev150608.network.Node>>, Augmentation<ietf.params.xml.ns.yang.ietf.network.rev150608.network.Node>> augmentation = Collections.emptyMap();

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
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.network.rev150608.network.Node>>, Augmentation<ietf.params.xml.ns.yang.ietf.network.rev150608.network.Node>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.network.rev150608.network.Node>>, Augmentation<ietf.params.xml.ns.yang.ietf.network.rev150608.network.Node>>singletonMap(e.getKey(), e.getValue());
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
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.ietf.network.rev150608.network.Node>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            if (!ietf.params.xml.ns.yang.ietf.network.rev150608.network.Node.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.ietf.network.rev150608.network.Node other = (ietf.params.xml.ns.yang.ietf.network.rev150608.network.Node)obj;
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_nodeId, other.getNodeId())) {
                return false;
            }
            if (!Objects.equals(_supportingNode, other.getSupportingNode())) {
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
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.network.rev150608.network.Node>>, Augmentation<ietf.params.xml.ns.yang.ietf.network.rev150608.network.Node>> e : augmentation.entrySet()) {
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
