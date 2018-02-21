package ietf.params.xml.ns.yang.nfvo.nsr.rev170208;

public enum NsOperationalStatus {
    Init(0, "init"),
    
    VlInitPhase(1, "vl-init-phase"),
    
    VnfInitPhase(2, "vnf-init-phase"),
    
    Running(3, "running"),
    
    Terminate(4, "terminate"),
    
    VnfTerminatePhase(5, "vnf-terminate-phase"),
    
    VlTerminatePhase(6, "vl-terminate-phase"),
    
    Terminated(7, "terminated"),
    
    Failed(8, "failed"),
    
    ScalingOut(9, "scaling-out"),
    
    ScalingIn(10, "scaling-in"),
    
    VlInstantiate(11, "vl-instantiate"),
    
    VlTerminate(12, "vl-terminate")
    ;

    private static final java.util.Map<java.lang.Integer, NsOperationalStatus> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, NsOperationalStatus> b = com.google.common.collect.ImmutableMap.builder();
        for (NsOperationalStatus enumItem : NsOperationalStatus.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private NsOperationalStatus(int value, java.lang.String name) {
        this.value = value;
        this.name = name;
    }

    /**
     * Returns the name of the enumeration item as it is specified in the input yang.
     *
     * @return the name of the enumeration item as it is specified in the input yang
     */
    public java.lang.String getName() {
        return name;
    }

    /**
     * @return integer value
     */
    public int getIntValue() {
        return value;
    }

    /**
     * @param valueArg integer value
     * @return corresponding NsOperationalStatus item
     */
    public static NsOperationalStatus forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
