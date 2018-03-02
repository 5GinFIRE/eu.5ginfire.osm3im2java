package ietf.params.xml.ns.yang.nfvo.nsr.rev170208;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.primitive.parameter.value.Parameter;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output.ParameterGroup;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output.VnfOutList;

import java.util.Objects;
import java.math.BigInteger;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecNsServicePrimitiveOutput} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecNsServicePrimitiveOutput
 *
 */
public class ExecNsServicePrimitiveOutputBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecNsServicePrimitiveOutput> {

    private java.lang.Long _createTime;
    private BigInteger _jobId;
    private java.lang.String _jobStatusDetails;
    private java.lang.String _name;
    private java.lang.Object _nsrIdRef;
    private List<Parameter> _parameter;
    private List<ParameterGroup> _parameterGroup;
    private java.lang.String _projectName;
    private TriggerType _triggeredBy;
    private List<VnfOutList> _vnfOutList;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecNsServicePrimitiveOutput>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecNsServicePrimitiveOutput>> augmentation = Collections.emptyMap();

    public ExecNsServicePrimitiveOutputBuilder() {
    }
    public ExecNsServicePrimitiveOutputBuilder(ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PrimitiveParameterValue arg) {
        this._parameter = arg.getParameter();
    }
    public ExecNsServicePrimitiveOutputBuilder(ietf.params.xml.ns.yang.nfvo.nsr.rev170208.RpcCommon arg) {
        this._nsrIdRef = arg.getNsrIdRef();
        this._projectName = arg.getProjectName();
    }
    public ExecNsServicePrimitiveOutputBuilder(ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.RpcProjectName arg) {
        this._projectName = arg.getProjectName();
    }

    public ExecNsServicePrimitiveOutputBuilder(ExecNsServicePrimitiveOutput base) {
        this._createTime = base.getCreateTime();
        this._jobId = base.getJobId();
        this._jobStatusDetails = base.getJobStatusDetails();
        this._name = base.getName();
        this._nsrIdRef = base.getNsrIdRef();
        this._parameter = base.getParameter();
        this._parameterGroup = base.getParameterGroup();
        this._projectName = base.getProjectName();
        this._triggeredBy = base.getTriggeredBy();
        this._vnfOutList = base.getVnfOutList();
        if (base instanceof ExecNsServicePrimitiveOutputImpl) {
            ExecNsServicePrimitiveOutputImpl impl = (ExecNsServicePrimitiveOutputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecNsServicePrimitiveOutput> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecNsServicePrimitiveOutput>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.RpcCommon</li>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.RpcProjectName</li>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PrimitiveParameterValue</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof ietf.params.xml.ns.yang.nfvo.nsr.rev170208.RpcCommon) {
            this._nsrIdRef = ((ietf.params.xml.ns.yang.nfvo.nsr.rev170208.RpcCommon)arg).getNsrIdRef();
            isValidArg = true;
        }
        if (arg instanceof ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.RpcProjectName) {
            this._projectName = ((ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.RpcProjectName)arg).getProjectName();
            isValidArg = true;
        }
        if (arg instanceof ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PrimitiveParameterValue) {
            this._parameter = ((ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PrimitiveParameterValue)arg).getParameter();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.RpcCommon, org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.RpcProjectName, org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PrimitiveParameterValue] \n" +
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
    
    public java.lang.String getJobStatusDetails() {
        return _jobStatusDetails;
    }
    
    public java.lang.String getName() {
        return _name;
    }
    
    public java.lang.Object getNsrIdRef() {
        return _nsrIdRef;
    }
    
    public List<Parameter> getParameter() {
        return _parameter;
    }
    
    public List<ParameterGroup> getParameterGroup() {
        return _parameterGroup;
    }
    
    public java.lang.String getProjectName() {
        return _projectName;
    }
    
    public TriggerType getTriggeredBy() {
        return _triggeredBy;
    }
    
    public List<VnfOutList> getVnfOutList() {
        return _vnfOutList;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecNsServicePrimitiveOutput>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
    
    public ExecNsServicePrimitiveOutputBuilder setCreateTime(final java.lang.Long value) {
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
    
    public ExecNsServicePrimitiveOutputBuilder setJobId(final BigInteger value) {
    if (value != null) {
        checkJobIdRange(value);
    }
        this._jobId = value;
        return this;
    }
    
     
    public ExecNsServicePrimitiveOutputBuilder setJobStatusDetails(final java.lang.String value) {
        this._jobStatusDetails = value;
        return this;
    }
    
     
    public ExecNsServicePrimitiveOutputBuilder setName(final java.lang.String value) {
        this._name = value;
        return this;
    }
    
     
    public ExecNsServicePrimitiveOutputBuilder setNsrIdRef(final java.lang.Object value) {
        this._nsrIdRef = value;
        return this;
    }
    
     
    public ExecNsServicePrimitiveOutputBuilder setParameter(final List<Parameter> value) {
        this._parameter = value;
        return this;
    }
    
     
    public ExecNsServicePrimitiveOutputBuilder setParameterGroup(final List<ParameterGroup> value) {
        this._parameterGroup = value;
        return this;
    }
    
     
     private static void check_projectNameLength(final String value) {
         final int length = value.length();
         if (length >= 1 && length <= 255) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[1..255]].", value));
     }
    
    public ExecNsServicePrimitiveOutputBuilder setProjectName(final java.lang.String value) {
    if (value != null) {
        check_projectNameLength(value);
    }
        this._projectName = value;
        return this;
    }
    
     
    public ExecNsServicePrimitiveOutputBuilder setTriggeredBy(final TriggerType value) {
        this._triggeredBy = value;
        return this;
    }
    
     
    public ExecNsServicePrimitiveOutputBuilder setVnfOutList(final List<VnfOutList> value) {
        this._vnfOutList = value;
        return this;
    }
    
    public ExecNsServicePrimitiveOutputBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecNsServicePrimitiveOutput>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecNsServicePrimitiveOutput> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ExecNsServicePrimitiveOutputBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecNsServicePrimitiveOutput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ExecNsServicePrimitiveOutput build() {
        return new ExecNsServicePrimitiveOutputImpl(this);
    }

    private static final class ExecNsServicePrimitiveOutputImpl implements ExecNsServicePrimitiveOutput {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecNsServicePrimitiveOutput> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecNsServicePrimitiveOutput.class;
        }

        private final java.lang.Long _createTime;
        private final BigInteger _jobId;
        private final java.lang.String _jobStatusDetails;
        private final java.lang.String _name;
        private final java.lang.Object _nsrIdRef;
        private final List<Parameter> _parameter;
        private final List<ParameterGroup> _parameterGroup;
        private final java.lang.String _projectName;
        private final TriggerType _triggeredBy;
        private final List<VnfOutList> _vnfOutList;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecNsServicePrimitiveOutput>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecNsServicePrimitiveOutput>> augmentation = Collections.emptyMap();

        private ExecNsServicePrimitiveOutputImpl(ExecNsServicePrimitiveOutputBuilder base) {
            this._createTime = base.getCreateTime();
            this._jobId = base.getJobId();
            this._jobStatusDetails = base.getJobStatusDetails();
            this._name = base.getName();
            this._nsrIdRef = base.getNsrIdRef();
            this._parameter = base.getParameter();
            this._parameterGroup = base.getParameterGroup();
            this._projectName = base.getProjectName();
            this._triggeredBy = base.getTriggeredBy();
            this._vnfOutList = base.getVnfOutList();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecNsServicePrimitiveOutput>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecNsServicePrimitiveOutput>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecNsServicePrimitiveOutput>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecNsServicePrimitiveOutput>>singletonMap(e.getKey(), e.getValue());
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
        public java.lang.String getJobStatusDetails() {
            return _jobStatusDetails;
        }
        
        @Override
        public java.lang.String getName() {
            return _name;
        }
        
        @Override
        public java.lang.Object getNsrIdRef() {
            return _nsrIdRef;
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
        public java.lang.String getProjectName() {
            return _projectName;
        }
        
        @Override
        public TriggerType getTriggeredBy() {
            return _triggeredBy;
        }
        
        @Override
        public List<VnfOutList> getVnfOutList() {
            return _vnfOutList;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecNsServicePrimitiveOutput>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_jobStatusDetails);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_nsrIdRef);
            result = prime * result + Objects.hashCode(_parameter);
            result = prime * result + Objects.hashCode(_parameterGroup);
            result = prime * result + Objects.hashCode(_projectName);
            result = prime * result + Objects.hashCode(_triggeredBy);
            result = prime * result + Objects.hashCode(_vnfOutList);
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
            if (!ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecNsServicePrimitiveOutput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecNsServicePrimitiveOutput other = (ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecNsServicePrimitiveOutput)obj;
            if (!Objects.equals(_createTime, other.getCreateTime())) {
                return false;
            }
            if (!Objects.equals(_jobId, other.getJobId())) {
                return false;
            }
            if (!Objects.equals(_jobStatusDetails, other.getJobStatusDetails())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_nsrIdRef, other.getNsrIdRef())) {
                return false;
            }
            if (!Objects.equals(_parameter, other.getParameter())) {
                return false;
            }
            if (!Objects.equals(_parameterGroup, other.getParameterGroup())) {
                return false;
            }
            if (!Objects.equals(_projectName, other.getProjectName())) {
                return false;
            }
            if (!Objects.equals(_triggeredBy, other.getTriggeredBy())) {
                return false;
            }
            if (!Objects.equals(_vnfOutList, other.getVnfOutList())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ExecNsServicePrimitiveOutputImpl otherImpl = (ExecNsServicePrimitiveOutputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecNsServicePrimitiveOutput>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ExecNsServicePrimitiveOutput>> e : augmentation.entrySet()) {
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
            java.lang.String name = "ExecNsServicePrimitiveOutput [";
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
            if (_jobStatusDetails != null) {
                builder.append("_jobStatusDetails=");
                builder.append(_jobStatusDetails);
                builder.append(", ");
            }
            if (_name != null) {
                builder.append("_name=");
                builder.append(_name);
                builder.append(", ");
            }
            if (_nsrIdRef != null) {
                builder.append("_nsrIdRef=");
                builder.append(_nsrIdRef);
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
            if (_projectName != null) {
                builder.append("_projectName=");
                builder.append(_projectName);
                builder.append(", ");
            }
            if (_triggeredBy != null) {
                builder.append("_triggeredBy=");
                builder.append(_triggeredBy);
                builder.append(", ");
            }
            if (_vnfOutList != null) {
                builder.append("_vnfOutList=");
                builder.append(_vnfOutList);
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
