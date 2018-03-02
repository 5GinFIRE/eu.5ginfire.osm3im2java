package network.topology.rev131021.network.topology.topology;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;

import network.topology.rev131021.LinkId;
import network.topology.rev131021.link.attributes.Destination;
import network.topology.rev131021.link.attributes.Source;
import network.topology.rev131021.link.attributes.SupportingLink;

import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link network.topology.rev131021.network.topology.topology.Link} instances.
 * 
 * @see network.topology.rev131021.network.topology.topology.Link
 *
 */
public class LinkBuilder implements Builder<network.topology.rev131021.network.topology.topology.Link> {

    private Destination _destination;
    private LinkKey _key;
    private LinkId _linkId;
    private Source _source;
    private List<SupportingLink> _supportingLink;

    Map<java.lang.Class<? extends Augmentation<network.topology.rev131021.network.topology.topology.Link>>, Augmentation<network.topology.rev131021.network.topology.topology.Link>> augmentation = Collections.emptyMap();

    public LinkBuilder() {
    }
    public LinkBuilder(network.topology.rev131021.LinkAttributes arg) {
        this._linkId = arg.getLinkId();
        this._source = arg.getSource();
        this._destination = arg.getDestination();
        this._supportingLink = arg.getSupportingLink();
    }

    public LinkBuilder(Link base) {
        if (base.getKey() == null) {
            this._key = new LinkKey(
                base.getLinkId()
            );
            this._linkId = base.getLinkId();
        } else {
            this._key = base.getKey();
            this._linkId = _key.getLinkId();
        }
        this._destination = base.getDestination();
        this._source = base.getSource();
        this._supportingLink = base.getSupportingLink();
        if (base instanceof LinkImpl) {
            LinkImpl impl = (LinkImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<network.topology.rev131021.network.topology.topology.Link> casted =(AugmentationHolder<network.topology.rev131021.network.topology.topology.Link>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.LinkAttributes</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof network.topology.rev131021.LinkAttributes) {
            this._linkId = ((network.topology.rev131021.LinkAttributes)arg).getLinkId();
            this._source = ((network.topology.rev131021.LinkAttributes)arg).getSource();
            this._destination = ((network.topology.rev131021.LinkAttributes)arg).getDestination();
            this._supportingLink = ((network.topology.rev131021.LinkAttributes)arg).getSupportingLink();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.LinkAttributes] \n" +
              "but was: " + arg
            );
        }
    }

    public Destination getDestination() {
        return _destination;
    }
    
    public LinkKey getKey() {
        return _key;
    }
    
    public LinkId getLinkId() {
        return _linkId;
    }
    
    public Source getSource() {
        return _source;
    }
    
    public List<SupportingLink> getSupportingLink() {
        return _supportingLink;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<network.topology.rev131021.network.topology.topology.Link>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public LinkBuilder setDestination(final Destination value) {
        this._destination = value;
        return this;
    }
    
     
    public LinkBuilder setKey(final LinkKey value) {
        this._key = value;
        return this;
    }
    
     
    public LinkBuilder setLinkId(final LinkId value) {
        this._linkId = value;
        return this;
    }
    
     
    public LinkBuilder setSource(final Source value) {
        this._source = value;
        return this;
    }
    
     
    public LinkBuilder setSupportingLink(final List<SupportingLink> value) {
        this._supportingLink = value;
        return this;
    }
    
    public LinkBuilder addAugmentation(java.lang.Class<? extends Augmentation<network.topology.rev131021.network.topology.topology.Link>> augmentationType, Augmentation<network.topology.rev131021.network.topology.topology.Link> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public LinkBuilder removeAugmentation(java.lang.Class<? extends Augmentation<network.topology.rev131021.network.topology.topology.Link>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Link build() {
        return new LinkImpl(this);
    }

    private static final class LinkImpl implements Link {

        @Override
        public java.lang.Class<network.topology.rev131021.network.topology.topology.Link> getImplementedInterface() {
            return network.topology.rev131021.network.topology.topology.Link.class;
        }

        private final Destination _destination;
        private final LinkKey _key;
        private final LinkId _linkId;
        private final Source _source;
        private final List<SupportingLink> _supportingLink;

        private Map<java.lang.Class<? extends Augmentation<network.topology.rev131021.network.topology.topology.Link>>, Augmentation<network.topology.rev131021.network.topology.topology.Link>> augmentation = Collections.emptyMap();

        private LinkImpl(LinkBuilder base) {
            if (base.getKey() == null) {
                this._key = new LinkKey(
                    base.getLinkId()
                );
                this._linkId = base.getLinkId();
            } else {
                this._key = base.getKey();
                this._linkId = _key.getLinkId();
            }
            this._destination = base.getDestination();
            this._source = base.getSource();
            this._supportingLink = base.getSupportingLink();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<network.topology.rev131021.network.topology.topology.Link>>, Augmentation<network.topology.rev131021.network.topology.topology.Link>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<network.topology.rev131021.network.topology.topology.Link>>, Augmentation<network.topology.rev131021.network.topology.topology.Link>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public Destination getDestination() {
            return _destination;
        }
        
        @Override
        public LinkKey getKey() {
            return _key;
        }
        
        @Override
        public LinkId getLinkId() {
            return _linkId;
        }
        
        @Override
        public Source getSource() {
            return _source;
        }
        
        @Override
        public List<SupportingLink> getSupportingLink() {
            return _supportingLink;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<network.topology.rev131021.network.topology.topology.Link>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_destination);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_linkId);
            result = prime * result + Objects.hashCode(_source);
            result = prime * result + Objects.hashCode(_supportingLink);
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
            if (!network.topology.rev131021.network.topology.topology.Link.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            network.topology.rev131021.network.topology.topology.Link other = (network.topology.rev131021.network.topology.topology.Link)obj;
            if (!Objects.equals(_destination, other.getDestination())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_linkId, other.getLinkId())) {
                return false;
            }
            if (!Objects.equals(_source, other.getSource())) {
                return false;
            }
            if (!Objects.equals(_supportingLink, other.getSupportingLink())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                LinkImpl otherImpl = (LinkImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<network.topology.rev131021.network.topology.topology.Link>>, Augmentation<network.topology.rev131021.network.topology.topology.Link>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Link [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_destination != null) {
                builder.append("_destination=");
                builder.append(_destination);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_linkId != null) {
                builder.append("_linkId=");
                builder.append(_linkId);
                builder.append(", ");
            }
            if (_source != null) {
                builder.append("_source=");
                builder.append(_source);
                builder.append(", ");
            }
            if (_supportingLink != null) {
                builder.append("_supportingLink=");
                builder.append(_supportingLink);
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
