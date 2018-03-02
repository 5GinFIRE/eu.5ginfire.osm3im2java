package ietf.params.xml.ns.yang.nfvo.vnfr.rev170228;

public enum VnfOperationalStatus {
    PreInit(0, "pre-init"),
    
    Init(1, "init"),
    
    VlInitPhase(2, "vl-init-phase"),
    
    VmInitPhase(3, "vm-init-phase"),
    
    Running(4, "running"),
    
    Upgrading(5, "upgrading"),
    
    Terminate(6, "terminate"),
    
    VmTerminatePhase(7, "vm-terminate-phase"),
    
    VlTerminatePhase(8, "vl-terminate-phase"),
    
    Terminated(9, "terminated"),
    
    Failed(10, "failed")
    ;

    private static final java.util.Map<java.lang.Integer, VnfOperationalStatus> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, VnfOperationalStatus> b = com.google.common.collect.ImmutableMap.builder();
        for (VnfOperationalStatus enumItem : VnfOperationalStatus.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private VnfOperationalStatus(int value, java.lang.String name) {
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
     * @return corresponding VnfOperationalStatus item
     */
    public static VnfOperationalStatus forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
