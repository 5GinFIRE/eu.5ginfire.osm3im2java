package ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.link;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.ietf.network.rev150608.NodeId;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;

import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.link.Source} instances.
 * 
 * @see ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.link.Source
 *
 */
public class SourceBuilder implements Builder<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.link.Source> {

    private NodeId _sourceNode;
    private java.lang.Object _sourceTp;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.link.Source>>, Augmentation<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.link.Source>> augmentation = Collections.emptyMap();

    public SourceBuilder() {
    }

    public SourceBuilder(Source base) {
        this._sourceNode = base.getSourceNode();
        this._sourceTp = base.getSourceTp();
        if (base instanceof SourceImpl) {
            SourceImpl impl = (SourceImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.link.Source> casted =(AugmentationHolder<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.link.Source>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public NodeId getSourceNode() {
        return _sourceNode;
    }
    
    public java.lang.Object getSourceTp() {
        return _sourceTp;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.link.Source>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public SourceBuilder setSourceNode(final NodeId value) {
        this._sourceNode = value;
        return this;
    }
    
     
    public SourceBuilder setSourceTp(final java.lang.Object value) {
        this._sourceTp = value;
        return this;
    }
    
    public SourceBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.link.Source>> augmentationType, Augmentation<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.link.Source> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public SourceBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.link.Source>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Source build() {
        return new SourceImpl(this);
    }

    private static final class SourceImpl implements Source {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.link.Source> getImplementedInterface() {
            return ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.link.Source.class;
        }

        private final NodeId _sourceNode;
        private final java.lang.Object _sourceTp;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.link.Source>>, Augmentation<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.link.Source>> augmentation = Collections.emptyMap();

        private SourceImpl(SourceBuilder base) {
            this._sourceNode = base.getSourceNode();
            this._sourceTp = base.getSourceTp();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.link.Source>>, Augmentation<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.link.Source>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.link.Source>>, Augmentation<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.link.Source>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public NodeId getSourceNode() {
            return _sourceNode;
        }
        
        @Override
        public java.lang.Object getSourceTp() {
            return _sourceTp;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.link.Source>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_sourceNode);
            result = prime * result + Objects.hashCode(_sourceTp);
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
            if (!ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.link.Source.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.link.Source other = (ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.link.Source)obj;
            if (!Objects.equals(_sourceNode, other.getSourceNode())) {
                return false;
            }
            if (!Objects.equals(_sourceTp, other.getSourceTp())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                SourceImpl otherImpl = (SourceImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.link.Source>>, Augmentation<ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.link.Source>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Source [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_sourceNode != null) {
                builder.append("_sourceNode=");
                builder.append(_sourceNode);
                builder.append(", ");
            }
            if (_sourceTp != null) {
                builder.append("_sourceTp=");
                builder.append(_sourceTp);
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
