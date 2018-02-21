package ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.primitive.parameter.value.Parameter;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.TriggerType;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.ConfigAgentJob.JobStatus;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.config.agent.job.ParameterGroup;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.config.agent.job.Vnfr;

import java.util.Objects;
import java.math.BigInteger;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.ConfigAgentJob} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.ConfigAgentJob
 *
 */
public class ConfigAgentJobBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.ConfigAgentJob> {

    private java.lang.Long _createTime;
    private BigInteger _jobId;
    private java.lang.String _jobName;
    private JobStatus _jobStatus;
    private java.lang.String _jobStatusDetails;
    private ConfigAgentJobKey _key;
    private List<Parameter> _parameter;
    private List<ParameterGroup> _parameterGroup;
    private TriggerType _triggeredBy;
    private List<Vnfr> _vnfr;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.ConfigAgentJob>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.ConfigAgentJob>> augmentation = Collections.emptyMap();

    public ConfigAgentJobBuilder() {
    }
    public ConfigAgentJobBuilder(ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PrimitiveParameterValue arg) {
        this._parameter = arg.getParameter();
    }

    public ConfigAgentJobBuilder(ConfigAgentJob base) {
        if (base.getKey() == null) {
            this._key = new ConfigAgentJobKey(
                base.getJobId()
            );
            this._jobId = base.getJobId();
        } else {
            this._key = base.getKey();
            this._jobId = _key.getJobId();
        }
        this._createTime = base.getCreateTime();
        this._jobName = base.getJobName();
        this._jobStatus = base.getJobStatus();
        this._jobStatusDetails = base.getJobStatusDetails();
        this._parameter = base.getParameter();
        this._parameterGroup = base.getParameterGroup();
        this._triggeredBy = base.getTriggeredBy();
        this._vnfr = base.getVnfr();
        if (base instanceof ConfigAgentJobImpl) {
            ConfigAgentJobImpl impl = (ConfigAgentJobImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.ConfigAgentJob> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.ConfigAgentJob>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PrimitiveParameterValue</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PrimitiveParameterValue) {
            this._parameter = ((ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PrimitiveParameterValue)arg).getParameter();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PrimitiveParameterValue] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Long getCreateTime() {
        return _createTime;
    }
    
    public BigInteger getJobId() {
        return _jobId;
    }
    
    public java.lang.String getJobName() {
        return _jobName;
    }
    
    public JobStatus getJobStatus() {
        return _jobStatus;
    }
    
    public java.lang.String getJobStatusDetails() {
        return _jobStatusDetails;
    }
    
    public ConfigAgentJobKey getKey() {
        return _key;
    }
    
    public List<Parameter> getParameter() {
        return _parameter;
    }
    
    public List<ParameterGroup> getParameterGroup() {
        return _parameterGroup;
    }
    
    public TriggerType getTriggeredBy() {
        return _triggeredBy;
    }
    
    public List<Vnfr> getVnfr() {
        return _vnfr;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.ConfigAgentJob>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static void checkCreateTimeRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..4294967295]].", value));
     }
    
    public ConfigAgentJobBuilder setCreateTime(final java.lang.Long value) {
    if (value != null) {
        checkCreateTimeRange(value);
    }
        this._createTime = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKJOBIDRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKJOBIDRANGE_RANGES = a;
     }
     private static void checkJobIdRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKJOBIDRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKJOBIDRANGE_RANGES)));
     }
    
    public ConfigAgentJobBuilder setJobId(final BigInteger value) {
    if (value != null) {
        checkJobIdRange(value);
    }
        this._jobId = value;
        return this;
    }
    
     
    public ConfigAgentJobBuilder setJobName(final java.lang.String value) {
        this._jobName = value;
        return this;
    }
    
     
    public ConfigAgentJobBuilder setJobStatus(final JobStatus value) {
        this._jobStatus = value;
        return this;
    }
    
     
    public ConfigAgentJobBuilder setJobStatusDetails(final java.lang.String value) {
        this._jobStatusDetails = value;
        return this;
    }
    
     
    public ConfigAgentJobBuilder setKey(final ConfigAgentJobKey value) {
        this._key = value;
        return this;
    }
    
     
    public ConfigAgentJobBuilder setParameter(final List<Parameter> value) {
        this._parameter = value;
        return this;
    }
    
     
    public ConfigAgentJobBuilder setParameterGroup(final List<ParameterGroup> value) {
        this._parameterGroup = value;
        return this;
    }
    
     
    public ConfigAgentJobBuilder setTriggeredBy(final TriggerType value) {
        this._triggeredBy = value;
        return this;
    }
    
     
    public ConfigAgentJobBuilder setVnfr(final List<Vnfr> value) {
        this._vnfr = value;
        return this;
    }
    
    public ConfigAgentJobBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.ConfigAgentJob>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.ConfigAgentJob> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ConfigAgentJobBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.ConfigAgentJob>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ConfigAgentJob build() {
        return new ConfigAgentJobImpl(this);
    }

    private static final class ConfigAgentJobImpl implements ConfigAgentJob {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.ConfigAgentJob> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.ConfigAgentJob.class;
        }

        private final java.lang.Long _createTime;
        private final BigInteger _jobId;
        private final java.lang.String _jobName;
        private final JobStatus _jobStatus;
        private final java.lang.String _jobStatusDetails;
        private final ConfigAgentJobKey _key;
        private final List<Parameter> _parameter;
        private final List<ParameterGroup> _parameterGroup;
        private final TriggerType _triggeredBy;
        private final List<Vnfr> _vnfr;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.ConfigAgentJob>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.ConfigAgentJob>> augmentation = Collections.emptyMap();

        private ConfigAgentJobImpl(ConfigAgentJobBuilder base) {
            if (base.getKey() == null) {
                this._key = new ConfigAgentJobKey(
                    base.getJobId()
                );
                this._jobId = base.getJobId();
            } else {
                this._key = base.getKey();
                this._jobId = _key.getJobId();
            }
            this._createTime = base.getCreateTime();
            this._jobName = base.getJobName();
            this._jobStatus = base.getJobStatus();
            this._jobStatusDetails = base.getJobStatusDetails();
            this._parameter = base.getParameter();
            this._parameterGroup = base.getParameterGroup();
            this._triggeredBy = base.getTriggeredBy();
            this._vnfr = base.getVnfr();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.ConfigAgentJob>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.ConfigAgentJob>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.ConfigAgentJob>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.ConfigAgentJob>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Long getCreateTime() {
            return _createTime;
        }
        
        @Override
        public BigInteger getJobId() {
            return _jobId;
        }
        
        @Override
        public java.lang.String getJobName() {
            return _jobName;
        }
        
        @Override
        public JobStatus getJobStatus() {
            return _jobStatus;
        }
        
        @Override
        public java.lang.String getJobStatusDetails() {
            return _jobStatusDetails;
        }
        
        @Override
        public ConfigAgentJobKey getKey() {
            return _key;
        }
        
        @Override
        public List<Parameter> getParameter() {
            return _parameter;
        }
        
        @Override
        public List<ParameterGroup> getParameterGroup() {
            return _parameterGroup;
        }
        
        @Override
        public TriggerType getTriggeredBy() {
            return _triggeredBy;
        }
        
        @Override
        public List<Vnfr> getVnfr() {
            return _vnfr;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.ConfigAgentJob>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_createTime);
            result = prime * result + Objects.hashCode(_jobId);
            result = prime * result + Objects.hashCode(_jobName);
            result = prime * result + Objects.hashCode(_jobStatus);
            result = prime * result + Objects.hashCode(_jobStatusDetails);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_parameter);
            result = prime * result + Objects.hashCode(_parameterGroup);
            result = prime * result + Objects.hashCode(_triggeredBy);
            result = prime * result + Objects.hashCode(_vnfr);
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
            if (!ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.ConfigAgentJob.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.ConfigAgentJob other = (ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.ConfigAgentJob)obj;
            if (!Objects.equals(_createTime, other.getCreateTime())) {
                return false;
            }
            if (!Objects.equals(_jobId, other.getJobId())) {
                return false;
            }
            if (!Objects.equals(_jobName, other.getJobName())) {
                return false;
            }
            if (!Objects.equals(_jobStatus, other.getJobStatus())) {
                return false;
            }
            if (!Objects.equals(_jobStatusDetails, other.getJobStatusDetails())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_parameter, other.getParameter())) {
                return false;
            }
            if (!Objects.equals(_parameterGroup, other.getParameterGroup())) {
                return false;
            }
            if (!Objects.equals(_triggeredBy, other.getTriggeredBy())) {
                return false;
            }
            if (!Objects.equals(_vnfr, other.getVnfr())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ConfigAgentJobImpl otherImpl = (ConfigAgentJobImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.ConfigAgentJob>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.ConfigAgentJob>> e : augmentation.entrySet()) {
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
            java.lang.String name = "ConfigAgentJob [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_createTime != null) {
                builder.append("_createTime=");
                builder.append(_createTime);
                builder.append(", ");
            }
            if (_jobId != null) {
                builder.append("_jobId=");
                builder.append(_jobId);
                builder.append(", ");
            }
            if (_jobName != null) {
                builder.append("_jobName=");
                builder.append(_jobName);
                builder.append(", ");
            }
            if (_jobStatus != null) {
                builder.append("_jobStatus=");
                builder.append(_jobStatus);
                builder.append(", ");
            }
            if (_jobStatusDetails != null) {
                builder.append("_jobStatusDetails=");
                builder.append(_jobStatusDetails);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_parameter != null) {
                builder.append("_parameter=");
                builder.append(_parameter);
                builder.append(", ");
            }
            if (_parameterGroup != null) {
                builder.append("_parameterGroup=");
                builder.append(_parameterGroup);
                builder.append(", ");
            }
            if (_triggeredBy != null) {
                builder.append("_triggeredBy=");
                builder.append(_triggeredBy);
                builder.append(", ");
            }
            if (_vnfr != null) {
                builder.append("_vnfr=");
                builder.append(_vnfr);
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
