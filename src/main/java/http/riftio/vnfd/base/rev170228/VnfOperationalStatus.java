package http.riftio.vnfd.base.rev170228;

public enum VnfOperationalStatus {
    Init(0, "init"),
    
    Running(1, "running"),
    
    Upgrading(2, "upgrading"),
    
    Terminate(3, "terminate"),
    
    Terminated(4, "terminated"),
    
    Failed(5, "failed")
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
