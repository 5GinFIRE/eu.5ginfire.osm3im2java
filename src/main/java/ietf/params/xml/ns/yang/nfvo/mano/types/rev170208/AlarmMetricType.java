package ietf.params.xml.ns.yang.nfvo.mano.types.rev170208;

public enum AlarmMetricType {
    CPUUTILIZATION(0, "CPU_UTILIZATION"),
    
    MEMORYUTILIZATION(1, "MEMORY_UTILIZATION"),
    
    STORAGEUTILIZATION(2, "STORAGE_UTILIZATION")
    ;

    private static final java.util.Map<java.lang.Integer, AlarmMetricType> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, AlarmMetricType> b = com.google.common.collect.ImmutableMap.builder();
        for (AlarmMetricType enumItem : AlarmMetricType.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private AlarmMetricType(int value, java.lang.String name) {
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
     * @return corresponding AlarmMetricType item
     */
    public static AlarmMetricType forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
