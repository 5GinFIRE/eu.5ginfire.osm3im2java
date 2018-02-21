package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.NumaNodePolicy.MemPolicy;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.Node;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;

import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.NumaNodePolicy} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.NumaNodePolicy
 *
 */
public class NumaNodePolicyBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.NumaNodePolicy> {

    private MemPolicy _memPolicy;
    private List<Node> _node;
    private java.lang.Integer _nodeCnt;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.NumaNodePolicy>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.NumaNodePolicy>> augmentation = Collections.emptyMap();

    public NumaNodePolicyBuilder() {
    }

    public NumaNodePolicyBuilder(NumaNodePolicy base) {
        this._memPolicy = base.getMemPolicy();
        this._node = base.getNode();
        this._nodeCnt = base.getNodeCnt();
        if (base instanceof NumaNodePolicyImpl) {
            NumaNodePolicyImpl impl = (NumaNodePolicyImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.NumaNodePolicy> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.NumaNodePolicy>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public MemPolicy getMemPolicy() {
        return _memPolicy;
    }
    
    public List<Node> getNode() {
        return _node;
    }
    
    public java.lang.Integer getNodeCnt() {
        return _nodeCnt;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.NumaNodePolicy>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public NumaNodePolicyBuilder setMemPolicy(final MemPolicy value) {
        this._memPolicy = value;
        return this;
    }
    
     
    public NumaNodePolicyBuilder setNode(final List<Node> value) {
        this._node = value;
        return this;
    }
    
     
     private static void checkNodeCntRange(final int value) {
         if (value >= 0 && value <= 65535) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..65535]].", value));
     }
    
    public NumaNodePolicyBuilder setNodeCnt(final java.lang.Integer value) {
    if (value != null) {
        checkNodeCntRange(value);
    }
        this._nodeCnt = value;
        return this;
    }
    
    public NumaNodePolicyBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.NumaNodePolicy>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.NumaNodePolicy> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public NumaNodePolicyBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.NumaNodePolicy>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public NumaNodePolicy build() {
        return new NumaNodePolicyImpl(this);
    }

    private static final class NumaNodePolicyImpl implements NumaNodePolicy {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.NumaNodePolicy> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.NumaNodePolicy.class;
        }

        private final MemPolicy _memPolicy;
        private final List<Node> _node;
        private final java.lang.Integer _nodeCnt;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.NumaNodePolicy>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.NumaNodePolicy>> augmentation = Collections.emptyMap();

        private NumaNodePolicyImpl(NumaNodePolicyBuilder base) {
            this._memPolicy = base.getMemPolicy();
            this._node = base.getNode();
            this._nodeCnt = base.getNodeCnt();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.NumaNodePolicy>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.NumaNodePolicy>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.NumaNodePolicy>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.NumaNodePolicy>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public MemPolicy getMemPolicy() {
            return _memPolicy;
        }
        
        @Override
        public List<Node> getNode() {
            return _node;
        }
        
        @Override
        public java.lang.Integer getNodeCnt() {
            return _nodeCnt;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.NumaNodePolicy>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_memPolicy);
            result = prime * result + Objects.hashCode(_node);
            result = prime * result + Objects.hashCode(_nodeCnt);
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
            if (!ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.NumaNodePolicy.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.NumaNodePolicy other = (ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.NumaNodePolicy)obj;
            if (!Objects.equals(_memPolicy, other.getMemPolicy())) {
                return false;
            }
            if (!Objects.equals(_node, other.getNode())) {
                return false;
            }
            if (!Objects.equals(_nodeCnt, other.getNodeCnt())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NumaNodePolicyImpl otherImpl = (NumaNodePolicyImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.NumaNodePolicy>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.NumaNodePolicy>> e : augmentation.entrySet()) {
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
            java.lang.String name = "NumaNodePolicy [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_memPolicy != null) {
                builder.append("_memPolicy=");
                builder.append(_memPolicy);
                builder.append(", ");
            }
            if (_node != null) {
                builder.append("_node=");
                builder.append(_node);
                builder.append(", ");
            }
            if (_nodeCnt != null) {
                builder.append("_nodeCnt=");
                builder.append(_nodeCnt);
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
