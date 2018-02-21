package ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;

import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ConfigStates;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.NsOperationalStatus;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.ConfigAgentJob;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.ConnectionPoint;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.ConstituentVnfrRef;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.InitialServicePrimitive;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.MonitoringParam;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.ScalingGroupRecord;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.ServicePrimitive;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.TerminateServicePrimitive;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.Vlr;
import ietf.params.xml.ns.yang.nfvo.nsr.rev170208.vnffgr.Vnffgr;

import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.Nsr} instances.
 * 
 * @see ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.Nsr
 *
 */
public class NsrBuilder implements Builder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.Nsr> {

    private List<ConfigAgentJob> _configAgentJob;
    private ConfigStates _configStatus;
    private List<ConnectionPoint> _connectionPoint;
    private List<ConstituentVnfrRef> _constituentVnfrRef;
    private java.lang.Long _createTime;
    private List<InitialServicePrimitive> _initialServicePrimitive;
    private NsrKey _key;
    private List<MonitoringParam> _monitoringParam;
    private java.lang.Object _nameRef;
    private Uuid _nsInstanceConfigRef;
    private java.lang.Object _nsdNameRef;
    private java.lang.Object _nsdRef;
    private NsOperationalStatus _operationalStatus;
    private List<ScalingGroupRecord> _scalingGroupRecord;
    private List<ServicePrimitive> _servicePrimitive;
    private List<TerminateServicePrimitive> _terminateServicePrimitive;
    private java.lang.Long _uptime;
    private List<Vlr> _vlr;
    private List<Vnffgr> _vnffgr;

    Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.Nsr>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.Nsr>> augmentation = Collections.emptyMap();

    public NsrBuilder() {
    }
    public NsrBuilder(ietf.params.xml.ns.yang.nfvo.nsr.rev170208.Vnffgr arg) {
        this._vnffgr = arg.getVnffgr();
    }

    public NsrBuilder(Nsr base) {
        if (base.getKey() == null) {
            this._key = new NsrKey(
                base.getNsInstanceConfigRef()
            );
            this._nsInstanceConfigRef = base.getNsInstanceConfigRef();
        } else {
            this._key = base.getKey();
            this._nsInstanceConfigRef = _key.getNsInstanceConfigRef();
        }
        this._configAgentJob = base.getConfigAgentJob();
        this._configStatus = base.getConfigStatus();
        this._connectionPoint = base.getConnectionPoint();
        this._constituentVnfrRef = base.getConstituentVnfrRef();
        this._createTime = base.getCreateTime();
        this._initialServicePrimitive = base.getInitialServicePrimitive();
        this._monitoringParam = base.getMonitoringParam();
        this._nameRef = base.getNameRef();
        this._nsdNameRef = base.getNsdNameRef();
        this._nsdRef = base.getNsdRef();
        this._operationalStatus = base.getOperationalStatus();
        this._scalingGroupRecord = base.getScalingGroupRecord();
        this._servicePrimitive = base.getServicePrimitive();
        this._terminateServicePrimitive = base.getTerminateServicePrimitive();
        this._uptime = base.getUptime();
        this._vlr = base.getVlr();
        this._vnffgr = base.getVnffgr();
        if (base instanceof NsrImpl) {
            NsrImpl impl = (NsrImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.Nsr> casted =(AugmentationHolder<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.Nsr>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.Vnffgr</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof ietf.params.xml.ns.yang.nfvo.nsr.rev170208.Vnffgr) {
            this._vnffgr = ((ietf.params.xml.ns.yang.nfvo.nsr.rev170208.Vnffgr)arg).getVnffgr();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.Vnffgr] \n" +
              "but was: " + arg
            );
        }
    }

    public List<ConfigAgentJob> getConfigAgentJob() {
        return _configAgentJob;
    }
    
    public ConfigStates getConfigStatus() {
        return _configStatus;
    }
    
    public List<ConnectionPoint> getConnectionPoint() {
        return _connectionPoint;
    }
    
    public List<ConstituentVnfrRef> getConstituentVnfrRef() {
        return _constituentVnfrRef;
    }
    
    public java.lang.Long getCreateTime() {
        return _createTime;
    }
    
    public List<InitialServicePrimitive> getInitialServicePrimitive() {
        return _initialServicePrimitive;
    }
    
    public NsrKey getKey() {
        return _key;
    }
    
    public List<MonitoringParam> getMonitoringParam() {
        return _monitoringParam;
    }
    
    public java.lang.Object getNameRef() {
        return _nameRef;
    }
    
    public Uuid getNsInstanceConfigRef() {
        return _nsInstanceConfigRef;
    }
    
    public java.lang.Object getNsdNameRef() {
        return _nsdNameRef;
    }
    
    public java.lang.Object getNsdRef() {
        return _nsdRef;
    }
    
    public NsOperationalStatus getOperationalStatus() {
        return _operationalStatus;
    }
    
    public List<ScalingGroupRecord> getScalingGroupRecord() {
        return _scalingGroupRecord;
    }
    
    public List<ServicePrimitive> getServicePrimitive() {
        return _servicePrimitive;
    }
    
    public List<TerminateServicePrimitive> getTerminateServicePrimitive() {
        return _terminateServicePrimitive;
    }
    
    public java.lang.Long getUptime() {
        return _uptime;
    }
    
    public List<Vlr> getVlr() {
        return _vlr;
    }
    
    public List<Vnffgr> getVnffgr() {
        return _vnffgr;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.Nsr>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public NsrBuilder setConfigAgentJob(final List<ConfigAgentJob> value) {
        this._configAgentJob = value;
        return this;
    }
    
     
    public NsrBuilder setConfigStatus(final ConfigStates value) {
        this._configStatus = value;
        return this;
    }
    
     
    public NsrBuilder setConnectionPoint(final List<ConnectionPoint> value) {
        this._connectionPoint = value;
        return this;
    }
    
     
    public NsrBuilder setConstituentVnfrRef(final List<ConstituentVnfrRef> value) {
        this._constituentVnfrRef = value;
        return this;
    }
    
     
     private static void checkCreateTimeRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..4294967295]].", value));
     }
    
    public NsrBuilder setCreateTime(final java.lang.Long value) {
    if (value != null) {
        checkCreateTimeRange(value);
    }
        this._createTime = value;
        return this;
    }
    
     
    public NsrBuilder setInitialServicePrimitive(final List<InitialServicePrimitive> value) {
        this._initialServicePrimitive = value;
        return this;
    }
    
     
    public NsrBuilder setKey(final NsrKey value) {
        this._key = value;
        return this;
    }
    
     
    public NsrBuilder setMonitoringParam(final List<MonitoringParam> value) {
        this._monitoringParam = value;
        return this;
    }
    
     
    public NsrBuilder setNameRef(final java.lang.Object value) {
        this._nameRef = value;
        return this;
    }
    
     
    public NsrBuilder setNsInstanceConfigRef(final Uuid value) {
        this._nsInstanceConfigRef = value;
        return this;
    }
    
     
    public NsrBuilder setNsdNameRef(final java.lang.Object value) {
        this._nsdNameRef = value;
        return this;
    }
    
     
    public NsrBuilder setNsdRef(final java.lang.Object value) {
        this._nsdRef = value;
        return this;
    }
    
     
    public NsrBuilder setOperationalStatus(final NsOperationalStatus value) {
        this._operationalStatus = value;
        return this;
    }
    
     
    public NsrBuilder setScalingGroupRecord(final List<ScalingGroupRecord> value) {
        this._scalingGroupRecord = value;
        return this;
    }
    
     
    public NsrBuilder setServicePrimitive(final List<ServicePrimitive> value) {
        this._servicePrimitive = value;
        return this;
    }
    
     
    public NsrBuilder setTerminateServicePrimitive(final List<TerminateServicePrimitive> value) {
        this._terminateServicePrimitive = value;
        return this;
    }
    
     
     private static void checkUptimeRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0..4294967295]].", value));
     }
    
    public NsrBuilder setUptime(final java.lang.Long value) {
    if (value != null) {
        checkUptimeRange(value);
    }
        this._uptime = value;
        return this;
    }
    
     
    public NsrBuilder setVlr(final List<Vlr> value) {
        this._vlr = value;
        return this;
    }
    
     
    public NsrBuilder setVnffgr(final List<Vnffgr> value) {
        this._vnffgr = value;
        return this;
    }
    
    public NsrBuilder addAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.Nsr>> augmentationType, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.Nsr> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public NsrBuilder removeAugmentation(java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.Nsr>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Nsr build() {
        return new NsrImpl(this);
    }

    private static final class NsrImpl implements Nsr {

        @Override
        public java.lang.Class<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.Nsr> getImplementedInterface() {
            return ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.Nsr.class;
        }

        private final List<ConfigAgentJob> _configAgentJob;
        private final ConfigStates _configStatus;
        private final List<ConnectionPoint> _connectionPoint;
        private final List<ConstituentVnfrRef> _constituentVnfrRef;
        private final java.lang.Long _createTime;
        private final List<InitialServicePrimitive> _initialServicePrimitive;
        private final NsrKey _key;
        private final List<MonitoringParam> _monitoringParam;
        private final java.lang.Object _nameRef;
        private final Uuid _nsInstanceConfigRef;
        private final java.lang.Object _nsdNameRef;
        private final java.lang.Object _nsdRef;
        private final NsOperationalStatus _operationalStatus;
        private final List<ScalingGroupRecord> _scalingGroupRecord;
        private final List<ServicePrimitive> _servicePrimitive;
        private final List<TerminateServicePrimitive> _terminateServicePrimitive;
        private final java.lang.Long _uptime;
        private final List<Vlr> _vlr;
        private final List<Vnffgr> _vnffgr;

        private Map<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.Nsr>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.Nsr>> augmentation = Collections.emptyMap();

        private NsrImpl(NsrBuilder base) {
            if (base.getKey() == null) {
                this._key = new NsrKey(
                    base.getNsInstanceConfigRef()
                );
                this._nsInstanceConfigRef = base.getNsInstanceConfigRef();
            } else {
                this._key = base.getKey();
                this._nsInstanceConfigRef = _key.getNsInstanceConfigRef();
            }
            this._configAgentJob = base.getConfigAgentJob();
            this._configStatus = base.getConfigStatus();
            this._connectionPoint = base.getConnectionPoint();
            this._constituentVnfrRef = base.getConstituentVnfrRef();
            this._createTime = base.getCreateTime();
            this._initialServicePrimitive = base.getInitialServicePrimitive();
            this._monitoringParam = base.getMonitoringParam();
            this._nameRef = base.getNameRef();
            this._nsdNameRef = base.getNsdNameRef();
            this._nsdRef = base.getNsdRef();
            this._operationalStatus = base.getOperationalStatus();
            this._scalingGroupRecord = base.getScalingGroupRecord();
            this._servicePrimitive = base.getServicePrimitive();
            this._terminateServicePrimitive = base.getTerminateServicePrimitive();
            this._uptime = base.getUptime();
            this._vlr = base.getVlr();
            this._vnffgr = base.getVnffgr();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.Nsr>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.Nsr>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.Nsr>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.Nsr>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<ConfigAgentJob> getConfigAgentJob() {
            return _configAgentJob;
        }
        
        @Override
        public ConfigStates getConfigStatus() {
            return _configStatus;
        }
        
        @Override
        public List<ConnectionPoint> getConnectionPoint() {
            return _connectionPoint;
        }
        
        @Override
        public List<ConstituentVnfrRef> getConstituentVnfrRef() {
            return _constituentVnfrRef;
        }
        
        @Override
        public java.lang.Long getCreateTime() {
            return _createTime;
        }
        
        @Override
        public List<InitialServicePrimitive> getInitialServicePrimitive() {
            return _initialServicePrimitive;
        }
        
        @Override
        public NsrKey getKey() {
            return _key;
        }
        
        @Override
        public List<MonitoringParam> getMonitoringParam() {
            return _monitoringParam;
        }
        
        @Override
        public java.lang.Object getNameRef() {
            return _nameRef;
        }
        
        @Override
        public Uuid getNsInstanceConfigRef() {
            return _nsInstanceConfigRef;
        }
        
        @Override
        public java.lang.Object getNsdNameRef() {
            return _nsdNameRef;
        }
        
        @Override
        public java.lang.Object getNsdRef() {
            return _nsdRef;
        }
        
        @Override
        public NsOperationalStatus getOperationalStatus() {
            return _operationalStatus;
        }
        
        @Override
        public List<ScalingGroupRecord> getScalingGroupRecord() {
            return _scalingGroupRecord;
        }
        
        @Override
        public List<ServicePrimitive> getServicePrimitive() {
            return _servicePrimitive;
        }
        
        @Override
        public List<TerminateServicePrimitive> getTerminateServicePrimitive() {
            return _terminateServicePrimitive;
        }
        
        @Override
        public java.lang.Long getUptime() {
            return _uptime;
        }
        
        @Override
        public List<Vlr> getVlr() {
            return _vlr;
        }
        
        @Override
        public List<Vnffgr> getVnffgr() {
            return _vnffgr;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.Nsr>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_configAgentJob);
            result = prime * result + Objects.hashCode(_configStatus);
            result = prime * result + Objects.hashCode(_connectionPoint);
            result = prime * result + Objects.hashCode(_constituentVnfrRef);
            result = prime * result + Objects.hashCode(_createTime);
            result = prime * result + Objects.hashCode(_initialServicePrimitive);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_monitoringParam);
            result = prime * result + Objects.hashCode(_nameRef);
            result = prime * result + Objects.hashCode(_nsInstanceConfigRef);
            result = prime * result + Objects.hashCode(_nsdNameRef);
            result = prime * result + Objects.hashCode(_nsdRef);
            result = prime * result + Objects.hashCode(_operationalStatus);
            result = prime * result + Objects.hashCode(_scalingGroupRecord);
            result = prime * result + Objects.hashCode(_servicePrimitive);
            result = prime * result + Objects.hashCode(_terminateServicePrimitive);
            result = prime * result + Objects.hashCode(_uptime);
            result = prime * result + Objects.hashCode(_vlr);
            result = prime * result + Objects.hashCode(_vnffgr);
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
            if (!ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.Nsr.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.Nsr other = (ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.Nsr)obj;
            if (!Objects.equals(_configAgentJob, other.getConfigAgentJob())) {
                return false;
            }
            if (!Objects.equals(_configStatus, other.getConfigStatus())) {
                return false;
            }
            if (!Objects.equals(_connectionPoint, other.getConnectionPoint())) {
                return false;
            }
            if (!Objects.equals(_constituentVnfrRef, other.getConstituentVnfrRef())) {
                return false;
            }
            if (!Objects.equals(_createTime, other.getCreateTime())) {
                return false;
            }
            if (!Objects.equals(_initialServicePrimitive, other.getInitialServicePrimitive())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_monitoringParam, other.getMonitoringParam())) {
                return false;
            }
            if (!Objects.equals(_nameRef, other.getNameRef())) {
                return false;
            }
            if (!Objects.equals(_nsInstanceConfigRef, other.getNsInstanceConfigRef())) {
                return false;
            }
            if (!Objects.equals(_nsdNameRef, other.getNsdNameRef())) {
                return false;
            }
            if (!Objects.equals(_nsdRef, other.getNsdRef())) {
                return false;
            }
            if (!Objects.equals(_operationalStatus, other.getOperationalStatus())) {
                return false;
            }
            if (!Objects.equals(_scalingGroupRecord, other.getScalingGroupRecord())) {
                return false;
            }
            if (!Objects.equals(_servicePrimitive, other.getServicePrimitive())) {
                return false;
            }
            if (!Objects.equals(_terminateServicePrimitive, other.getTerminateServicePrimitive())) {
                return false;
            }
            if (!Objects.equals(_uptime, other.getUptime())) {
                return false;
            }
            if (!Objects.equals(_vlr, other.getVlr())) {
                return false;
            }
            if (!Objects.equals(_vnffgr, other.getVnffgr())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NsrImpl otherImpl = (NsrImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.Nsr>>, Augmentation<ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.Nsr>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Nsr [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_configAgentJob != null) {
                builder.append("_configAgentJob=");
                builder.append(_configAgentJob);
                builder.append(", ");
            }
            if (_configStatus != null) {
                builder.append("_configStatus=");
                builder.append(_configStatus);
                builder.append(", ");
            }
            if (_connectionPoint != null) {
                builder.append("_connectionPoint=");
                builder.append(_connectionPoint);
                builder.append(", ");
            }
            if (_constituentVnfrRef != null) {
                builder.append("_constituentVnfrRef=");
                builder.append(_constituentVnfrRef);
                builder.append(", ");
            }
            if (_createTime != null) {
                builder.append("_createTime=");
                builder.append(_createTime);
                builder.append(", ");
            }
            if (_initialServicePrimitive != null) {
                builder.append("_initialServicePrimitive=");
                builder.append(_initialServicePrimitive);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_monitoringParam != null) {
                builder.append("_monitoringParam=");
                builder.append(_monitoringParam);
                builder.append(", ");
            }
            if (_nameRef != null) {
                builder.append("_nameRef=");
                builder.append(_nameRef);
                builder.append(", ");
            }
            if (_nsInstanceConfigRef != null) {
                builder.append("_nsInstanceConfigRef=");
                builder.append(_nsInstanceConfigRef);
                builder.append(", ");
            }
            if (_nsdNameRef != null) {
                builder.append("_nsdNameRef=");
                builder.append(_nsdNameRef);
                builder.append(", ");
            }
            if (_nsdRef != null) {
                builder.append("_nsdRef=");
                builder.append(_nsdRef);
                builder.append(", ");
            }
            if (_operationalStatus != null) {
                builder.append("_operationalStatus=");
                builder.append(_operationalStatus);
                builder.append(", ");
            }
            if (_scalingGroupRecord != null) {
                builder.append("_scalingGroupRecord=");
                builder.append(_scalingGroupRecord);
                builder.append(", ");
            }
            if (_servicePrimitive != null) {
                builder.append("_servicePrimitive=");
                builder.append(_servicePrimitive);
                builder.append(", ");
            }
            if (_terminateServicePrimitive != null) {
                builder.append("_terminateServicePrimitive=");
                builder.append(_terminateServicePrimitive);
                builder.append(", ");
            }
            if (_uptime != null) {
                builder.append("_uptime=");
                builder.append(_uptime);
                builder.append(", ");
            }
            if (_vlr != null) {
                builder.append("_vlr=");
                builder.append(_vlr);
                builder.append(", ");
            }
            if (_vnffgr != null) {
                builder.append("_vnffgr=");
                builder.append(_vnffgr);
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
