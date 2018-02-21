package ietf.params.xml.ns.yang.nfvo.nsr.rev170208;

public enum VnffgrOperationalStatus {
    Init(0, "init"),
    
    Running(1, "running"),
    
    Terminate(2, "terminate"),
    
    Terminated(3, "terminated"),
    
    Failed(4, "failed")
    ;

    private static final java.util.Map<java.lang.Integer, VnffgrOperationalStatus> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, VnffgrOperationalStatus> b = com.google.common.collect.ImmutableMap.builder();
        for (VnffgrOperationalStatus enumItem : VnffgrOperationalStatus.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private VnffgrOperationalStatus(int value, java.lang.String name) {
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
     * @return corresponding VnffgrOperationalStatus item
     */
    public static VnffgrOperationalStatus forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
