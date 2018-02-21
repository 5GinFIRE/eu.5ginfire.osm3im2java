package ietf.params.xml.ns.yang.nfvo.vnfr.rev170228;

public enum VduOperationalStatus {
    Init(0, "init"),
    
    VmInitPhase(1, "vm-init-phase"),
    
    VmAllocPending(2, "vm-alloc-pending"),
    
    Running(3, "running"),
    
    Upgrading(4, "upgrading"),
    
    Terminate(5, "terminate"),
    
    VlTerminatePhase(6, "vl-terminate-phase"),
    
    Terminated(7, "terminated"),
    
    Failed(8, "failed")
    ;

    private static final java.util.Map<java.lang.Integer, VduOperationalStatus> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, VduOperationalStatus> b = com.google.common.collect.ImmutableMap.builder();
        for (VduOperationalStatus enumItem : VduOperationalStatus.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private VduOperationalStatus(int value, java.lang.String name) {
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
     * @return corresponding VduOperationalStatus item
     */
    public static VduOperationalStatus forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
