package ietf.params.xml.ns.yang.nfvo.mano.rift.groupings.norev.ssh.key.generated;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.mano.rift.groupings.norev.ssh.key.generated.SshKeyGenerated} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.mano.rift.groupings.norev.ssh.key.generated.SshKeyGenerated
 *
 */
public class SshKeyGeneratedBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.mano.rift.groupings.norev.ssh.key.generated.SshKeyGenerated> {

    private java.lang.String _privateKeyFile;
    private java.lang.String _publicKey;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.rift.groupings.norev.ssh.key.generated.SshKeyGenerated>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.rift.groupings.norev.ssh.key.generated.SshKeyGenerated>> augmentation = Collections.emptyMap();

    public SshKeyGeneratedBuilder() {
    }

    public SshKeyGeneratedBuilder(SshKeyGenerated base) {
        this._privateKeyFile = base.getPrivateKeyFile();
        this._publicKey = base.getPublicKey();
        if (base instanceof SshKeyGeneratedImpl) {
            SshKeyGeneratedImpl impl = (SshKeyGeneratedImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.rift.groupings.norev.ssh.key.generated.SshKeyGenerated> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.mano.rift.groupings.norev.ssh.key.generated.SshKeyGenerated>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public java.lang.String getPrivateKeyFile() {
        return _privateKeyFile;
    }
    
    public java.lang.String getPublicKey() {
        return _publicKey;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.rift.groupings.norev.ssh.key.generated.SshKeyGenerated>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public SshKeyGeneratedBuilder setPrivateKeyFile(final java.lang.String value) {
        this._privateKeyFile = value;
        return this;
    }
    
     
    public SshKeyGeneratedBuilder setPublicKey(final java.lang.String value) {
        this._publicKey = value;
        return this;
    }
    
    public SshKeyGeneratedBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.rift.groupings.norev.ssh.key.generated.SshKeyGenerated>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.rift.groupings.norev.ssh.key.generated.SshKeyGenerated> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public SshKeyGeneratedBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.rift.groupings.norev.ssh.key.generated.SshKeyGenerated>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public SshKeyGenerated build() {
        return new SshKeyGeneratedImpl(this);
    }

    private static final class SshKeyGeneratedImpl implements SshKeyGenerated {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.mano.rift.groupings.norev.ssh.key.generated.SshKeyGenerated> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.mano.rift.groupings.norev.ssh.key.generated.SshKeyGenerated.class;
        }

        private final java.lang.String _privateKeyFile;
        private final java.lang.String _publicKey;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.rift.groupings.norev.ssh.key.generated.SshKeyGenerated>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.rift.groupings.norev.ssh.key.generated.SshKeyGenerated>> augmentation = Collections.emptyMap();

        private SshKeyGeneratedImpl(SshKeyGeneratedBuilder base) {
            this._privateKeyFile = base.getPrivateKeyFile();
            this._publicKey = base.getPublicKey();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.rift.groupings.norev.ssh.key.generated.SshKeyGenerated>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.rift.groupings.norev.ssh.key.generated.SshKeyGenerated>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.rift.groupings.norev.ssh.key.generated.SshKeyGenerated>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.rift.groupings.norev.ssh.key.generated.SshKeyGenerated>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getPrivateKeyFile() {
            return _privateKeyFile;
        }
        
        @Override
        public java.lang.String getPublicKey() {
            return _publicKey;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.rift.groupings.norev.ssh.key.generated.SshKeyGenerated>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_privateKeyFile);
            result = prime * result + Objects.hashCode(_publicKey);
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
            if (!ietf.params.xml.ns.yang.nfvo.mano.rift.groupings.norev.ssh.key.generated.SshKeyGenerated.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.mano.rift.groupings.norev.ssh.key.generated.SshKeyGenerated other = (ietf.params.xml.ns.yang.nfvo.mano.rift.groupings.norev.ssh.key.generated.SshKeyGenerated)obj;
            if (!Objects.equals(_privateKeyFile, other.getPrivateKeyFile())) {
                return false;
            }
            if (!Objects.equals(_publicKey, other.getPublicKey())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                SshKeyGeneratedImpl otherImpl = (SshKeyGeneratedImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.mano.rift.groupings.norev.ssh.key.generated.SshKeyGenerated>>, Augmentation<ietf.params.xml.ns.yang.nfvo.mano.rift.groupings.norev.ssh.key.generated.SshKeyGenerated>> e : augmentation.entrySet()) {
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
            java.lang.String name = "SshKeyGenerated [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_privateKeyFile != null) {
                builder.append("_privateKeyFile=");
                builder.append(_privateKeyFile);
                builder.append(", ");
            }
            if (_publicKey != null) {
                builder.append("_publicKey=");
                builder.append(_publicKey);
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
