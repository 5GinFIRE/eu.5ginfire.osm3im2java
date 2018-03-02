package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.action.param;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.ietf.inet.types.rev130715.Uri;
import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.HttpMethod;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.action.param.ActionParam} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.action.param.ActionParam
 *
 */
public class ActionParamBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.action.param.ActionParam> {

    private java.lang.String _description;
    private java.lang.String _groupTag;
    private java.lang.String _id;
    private ActionParamKey _key;
    private HttpMethod _method;
    private java.lang.String _name;
    private java.lang.String _payload;
    private Uri _url;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.action.param.ActionParam>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.action.param.ActionParam>> augmentation = Collections.emptyMap();

    public ActionParamBuilder() {
    }

    public ActionParamBuilder(ActionParam base) {
        if (base.getKey() == null) {
            this._key = new ActionParamKey(
                base.getId()
            );
            this._id = base.getId();
        } else {
            this._key = base.getKey();
            this._id = _key.getId();
        }
        this._description = base.getDescription();
        this._groupTag = base.getGroupTag();
        this._method = base.getMethod();
        this._name = base.getName();
        this._payload = base.getPayload();
        this._url = base.getUrl();
        if (base instanceof ActionParamImpl) {
            ActionParamImpl impl = (ActionParamImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.action.param.ActionParam> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.action.param.ActionParam>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public java.lang.String getDescription() {
        return _description;
    }
    
    public java.lang.String getGroupTag() {
        return _groupTag;
    }
    
    public java.lang.String getId() {
        return _id;
    }
    
    public ActionParamKey getKey() {
        return _key;
    }
    
    public HttpMethod getMethod() {
        return _method;
    }
    
    public java.lang.String getName() {
        return _name;
    }
    
    public java.lang.String getPayload() {
        return _payload;
    }
    
    public Uri getUrl() {
        return _url;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.action.param.ActionParam>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public ActionParamBuilder setDescription(final java.lang.String value) {
        this._description = value;
        return this;
    }
    
     
    public ActionParamBuilder setGroupTag(final java.lang.String value) {
        this._groupTag = value;
        return this;
    }
    
     
    public ActionParamBuilder setId(final java.lang.String value) {
        this._id = value;
        return this;
    }
    
     
    public ActionParamBuilder setKey(final ActionParamKey value) {
        this._key = value;
        return this;
    }
    
     
    public ActionParamBuilder setMethod(final HttpMethod value) {
        this._method = value;
        return this;
    }
    
     
    public ActionParamBuilder setName(final java.lang.String value) {
        this._name = value;
        return this;
    }
    
     
    public ActionParamBuilder setPayload(final java.lang.String value) {
        this._payload = value;
        return this;
    }
    
     
    public ActionParamBuilder setUrl(final Uri value) {
        this._url = value;
        return this;
    }
    
    public ActionParamBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.action.param.ActionParam>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.action.param.ActionParam> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ActionParamBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.action.param.ActionParam>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ActionParam build() {
        return new ActionParamImpl(this);
    }

    private static final class ActionParamImpl implements ActionParam {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.action.param.ActionParam> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.action.param.ActionParam.class;
        }

        private final java.lang.String _description;
        private final java.lang.String _groupTag;
        private final java.lang.String _id;
        private final ActionParamKey _key;
        private final HttpMethod _method;
        private final java.lang.String _name;
        private final java.lang.String _payload;
        private final Uri _url;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.action.param.ActionParam>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.action.param.ActionParam>> augmentation = Collections.emptyMap();

        private ActionParamImpl(ActionParamBuilder base) {
            if (base.getKey() == null) {
                this._key = new ActionParamKey(
                    base.getId()
                );
                this._id = base.getId();
            } else {
                this._key = base.getKey();
                this._id = _key.getId();
            }
            this._description = base.getDescription();
            this._groupTag = base.getGroupTag();
            this._method = base.getMethod();
            this._name = base.getName();
            this._payload = base.getPayload();
            this._url = base.getUrl();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.action.param.ActionParam>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.action.param.ActionParam>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.action.param.ActionParam>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.action.param.ActionParam>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getDescription() {
            return _description;
        }
        
        @Override
        public java.lang.String getGroupTag() {
            return _groupTag;
        }
        
        @Override
        public java.lang.String getId() {
            return _id;
        }
        
        @Override
        public ActionParamKey getKey() {
            return _key;
        }
        
        @Override
        public HttpMethod getMethod() {
            return _method;
        }
        
        @Override
        public java.lang.String getName() {
            return _name;
        }
        
        @Override
        public java.lang.String getPayload() {
            return _payload;
        }
        
        @Override
        public Uri getUrl() {
            return _url;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.action.param.ActionParam>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_description);
            result = prime * result + Objects.hashCode(_groupTag);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_method);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_payload);
            result = prime * result + Objects.hashCode(_url);
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
            if (!ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.action.param.ActionParam.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.action.param.ActionParam other = (ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.action.param.ActionParam)obj;
            if (!Objects.equals(_description, other.getDescription())) {
                return false;
            }
            if (!Objects.equals(_groupTag, other.getGroupTag())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_method, other.getMethod())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_payload, other.getPayload())) {
                return false;
            }
            if (!Objects.equals(_url, other.getUrl())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ActionParamImpl otherImpl = (ActionParamImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.action.param.ActionParam>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.action.param.ActionParam>> e : augmentation.entrySet()) {
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
            java.lang.String name = "ActionParam [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_description != null) {
                builder.append("_description=");
                builder.append(_description);
                builder.append(", ");
            }
            if (_groupTag != null) {
                builder.append("_groupTag=");
                builder.append(_groupTag);
                builder.append(", ");
            }
            if (_id != null) {
                builder.append("_id=");
                builder.append(_id);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_method != null) {
                builder.append("_method=");
                builder.append(_method);
                builder.append(", ");
            }
            if (_name != null) {
                builder.append("_name=");
                builder.append(_name);
                builder.append(", ");
            }
            if (_payload != null) {
                builder.append("_payload=");
                builder.append(_payload);
                builder.append(", ");
            }
            if (_url != null) {
                builder.append("_url=");
                builder.append(_url);
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
